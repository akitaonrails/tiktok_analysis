package X;

import Y.ACallableS255S0200000_30;
import Y.ACallableS433S0100000_30;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.143h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202031143h implements InterfaceC20500115Jn {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Context LJFF;
    public InterfaceC202037143n LJII;
    public int LJ = 6;
    public final C201989141r LJI = new C201989141r();
    public final C1492340owC LJIIIIZZ = new C1492340owC();

    @Override // X.InterfaceC20500115Jn
    public final void release() {
        this.LJI.LIZIZ();
        InterfaceC202037143n interfaceC202037143n = this.LJII;
        if (interfaceC202037143n != null) {
            interfaceC202037143n.destroy();
        }
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZJ(int i) {
        this.LJ = 1;
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZLLL(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LJI.LIZ(it2.next());
        }
        InterfaceC202037143n interfaceC202037143n = this.LJII;
        if (interfaceC202037143n != null) {
            interfaceC202037143n.destroy();
        }
    }

    @Override // X.InterfaceC20500115Jn
    public final void LJJIIJ(String str) {
        this.LJI.LIZ(str);
        InterfaceC202037143n interfaceC202037143n = this.LJII;
        if (interfaceC202037143n != null) {
            interfaceC202037143n.destroy();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0owA, X.143n] */
    @Override // X.InterfaceC20500115Jn
    public final boolean LIZ(final List list, final InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2) throws Throwable {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start("av_music_download", "MusicFetcher start");
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C259800zU c259800zU = new C259800zU();
        C1492340owC c1492340owC = this.LJIIIIZZ;
        c1492340owC.getClass();
        ?? c1492320owA = new C1492320owA(c1492340owC);
        c259800zU.element = c1492320owA;
        this.LJII = c1492320owA;
        try {
            c1492320owA.LIZJ();
            Iterator it2 = list.iterator();
            boolean z3 = true;
            while (it2.hasNext()) {
                final MusicModel musicModel = (MusicModel) it2.next();
                boolean zLJFF = LJFF(musicModel, new InterfaceC202028143e() { // from class: X.143g
                    @Override // X.InterfaceC202028143e
                    public final void LIZIZ(Map map, Map map2) {
                    }

                    @Override // X.InterfaceC202028143e
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC202028143e
                    public final void onCancel() {
                        C013C c013c3 = c013c2;
                        if (c013c3.element) {
                            return;
                        }
                        c013c3.element = true;
                        interfaceC202028143e.onCancel();
                    }

                    @Override // X.InterfaceC202028143e
                    public final void onStart() {
                        C013C c013c3 = c013c;
                        if (c013c3.element) {
                            return;
                        }
                        c013c3.element = true;
                        interfaceC202028143e.onStart();
                    }

                    @Override // X.InterfaceC202028143e
                    public final void LIZJ(C202035143l c202035143l) {
                        concurrentHashMap4.putIfAbsent(musicModel.getMusicId(), c202035143l);
                        interfaceC202028143e.onProgress(((concurrentHashMap.size() + concurrentHashMap4.size()) * 100) / list.size());
                        if (concurrentHashMap.size() + concurrentHashMap4.size() == list.size()) {
                            interfaceC202028143e.LIZJ(c202035143l);
                            c259800zU.element.LIZ();
                        }
                    }

                    @Override // X.InterfaceC202028143e
                    public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                        concurrentHashMap.putIfAbsent(musicModel.getMusicId(), str);
                        if (musicWaveBean != null) {
                            concurrentHashMap2.putIfAbsent(musicModel.getMusicId(), musicWaveBean);
                        }
                        if (bool != null) {
                            concurrentHashMap3.putIfAbsent(musicModel.getMusicId(), Boolean.valueOf(bool.booleanValue()));
                        }
                        interfaceC202028143e.onProgress(((concurrentHashMap.size() + concurrentHashMap4.size()) * 100) / list.size());
                        if (concurrentHashMap.size() + concurrentHashMap4.size() == list.size()) {
                            if (concurrentHashMap4.isEmpty()) {
                                interfaceC202028143e.LIZIZ(concurrentHashMap, concurrentHashMap2);
                            } else {
                                interfaceC202028143e.LIZJ((C202035143l) C13LP.LJJJJZ(concurrentHashMap4.values()));
                            }
                            c259800zU.element.LIZ();
                        }
                    }
                }, z, z2, false);
                if (z3 && zLJFF) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            return z3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C202036143m) {
                throw th.getRealThrowable();
            }
            throw th;
        }
    }

    public C202031143h(Context context, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJFF = C786410Ut5.N3(context);
    }

    @Override // X.InterfaceC20500115Jn
    public final boolean LIZIZ(MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2, boolean z3) {
        return LJ(musicModel, interfaceC202028143e, z, z2, z3, false);
    }

    public final boolean LJFF(MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2, boolean z3) {
        List<String> urlList;
        int iIntValue;
        int duration;
        int duration2;
        Float fValueOf;
        List<String> urlList2;
        String str;
        List<String> urlList3;
        C202041143r c202041143rLIZ = C202034143k.LIZ(musicModel, interfaceC202028143e, this.LIZLLL, "normal");
        CountDownLatch countDownLatch = null;
        if (!C142I.LIZ(musicModel, this.LJFF, this.LIZ)) {
            C15O7.LIZIZ(new ACallableS255S0200000_30(interfaceC202028143e, musicModel, 0), C15O7.LJIIIIZZ, null);
            return false;
        }
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            String str2 = this.LIZLLL;
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("errorDesc", "music id is null");
            c2241008qG.LIZ.put("trace", str2);
            c2241008qG.LIZ.put("isHitCache", Boolean.FALSE);
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_music_download_error_rate", 4, jSONObjectLJ);
            if (C0BM2.LIZ()) {
                C15O7.LIZIZ(new ACallableS433S0100000_30(interfaceC202028143e, 0), C15O7.LJIIIIZZ, null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicFetcher music id is empty, name: ");
            String name = musicModel.getName();
            String str3 = "";
            if (name == null) {
                name = "";
            }
            sbLIZ.append(name);
            sbLIZ.append(", artist: ");
            String singer = musicModel.getSinger();
            if (singer != null) {
                str3 = singer;
            }
            sbLIZ.append(str3);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (musicModel.getMusicType() != 1 && musicModel.getMusicType() != 2) {
            if (C0BM2.LIZ()) {
                C15O7.LIZIZ(new ACallableS433S0100000_30(interfaceC202028143e, 1), C15O7.LJIIIIZZ, null);
            }
            C201955140j.LJ("MusicFetcher download not online music");
            return false;
        }
        if (musicModel.getFullSongDetail() != null && z2 && !musicModel.isFullSong) {
            FullSongUrlStruct fullSongUrl = musicModel.getFullSongDetail().getFullSongUrl();
            if (fullSongUrl != null && (urlList2 = fullSongUrl.getUrlList()) != null && urlList2.size() > 0) {
                FullSongUrlStruct fullSongUrl2 = musicModel.getFullSongDetail().getFullSongUrl();
                if (fullSongUrl2 != null && (urlList3 = fullSongUrl2.getUrlList()) != null) {
                    str = (String) ListProtector.get(urlList3, 0);
                } else {
                    str = null;
                }
                musicModel.setUri(str);
            }
            UrlModel url = musicModel.getUrl();
            FullSongUrlStruct fullSongUrl3 = musicModel.getFullSongDetail().getFullSongUrl();
            if (fullSongUrl3 != null) {
                urlList = fullSongUrl3.getUrlList();
            } else {
                urlList = null;
            }
            url.setUrlList(urlList);
            int clipShootDuration = musicModel.getClipShootDuration();
            Integer shootDuration = musicModel.getShootDuration();
            if (shootDuration != null && clipShootDuration == shootDuration.intValue()) {
                iIntValue = musicModel.getClipShootDuration();
            } else {
                iIntValue = musicModel.getShootDuration().intValue();
            }
            musicModel.setClipShootDuration(iIntValue);
            musicModel.setShootDuration(Integer.valueOf(musicModel.getFullSongShootDuration()));
            MusicHighPrecisionDuration durationHighPrecision = musicModel.getDurationHighPrecision();
            if (durationHighPrecision != null) {
                Float fullSongShootDurationPrecision = musicModel.getFullSongDetail().getFullSongShootDurationPrecision();
                if (fullSongShootDurationPrecision != null) {
                    fValueOf = Float.valueOf(fullSongShootDurationPrecision.floatValue());
                } else {
                    fValueOf = null;
                }
                durationHighPrecision.setShootDurationPrecision(fValueOf);
            }
            Long fullSongDuration = musicModel.getFullSongDetail().getFullSongDuration();
            if (fullSongDuration != null) {
                duration = (int) fullSongDuration.longValue();
            } else {
                duration = musicModel.getDuration();
            }
            musicModel.setDuration(duration * LSPassThroughRecordSizeConfig.DEFAULT);
            Music music = musicModel.getMusic();
            if (music != null) {
                Long fullSongDuration2 = musicModel.getFullSongDetail().getFullSongDuration();
                if (fullSongDuration2 != null) {
                    duration2 = (int) fullSongDuration2.longValue();
                } else {
                    duration2 = musicModel.getDuration();
                }
                music.setDuration(duration2 * LSPassThroughRecordSizeConfig.DEFAULT);
            }
            musicModel.isFullSong = true;
        }
        String strLIZ = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LIZ(musicModel);
        String musicId = musicModel.getMusicId();
        String strLIZIZ = C1838950xxF.LIZIZ(musicModel.getUrl());
        String strLIZIZ2 = C1838950xxF.LIZIZ(musicModel.getStrongBeatUrl());
        C1492570owZ c1492570owZ = C1492570owZ.LIZ;
        String str4 = this.LIZLLL;
        c1492570owZ.getClass();
        C1492570owZ.LIZIZ(musicId, str4, strLIZIZ, strLIZIZ2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(", MusicDownloadStart: musicId=");
        sbLIZ2.append(musicId);
        sbLIZ2.append(", url=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(',');
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LIZIZ && musicModel.getStrongBeatUrl() != null && !C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_music_beat_download_opti", true, false)) {
            if (z) {
                countDownLatch = new CountDownLatch(1);
            }
            C201987141p c201987141p = new C201987141p(musicModel.getStrongBeatUrl(), strLIZ, musicModel.getMusicId(), countDownLatch);
            c201987141p.LJI = this.LJI;
            c201987141p.LIZ();
        }
        C143W c143w = new C143W(this.LJFF, musicModel, new C202043143t(c202041143rLIZ), countDownLatch, this.LIZJ, this.LIZ, this.LIZLLL, this.LJ, z3);
        c143w.LJIIZILJ = this.LJI;
        c143w.LIZLLL();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0owA, X.143n] */
    public final boolean LJ(MusicModel musicModel, final InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2, boolean z3, boolean z4) throws Throwable {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance().start("av_music_download", "MusicFetcher start");
        if (!z) {
            return LJFF(musicModel, interfaceC202028143e, z2, z3, z4);
        }
        final C259800zU c259800zU = new C259800zU();
        C1492340owC c1492340owC = this.LJIIIIZZ;
        c1492340owC.getClass();
        ?? c1492320owA = new C1492320owA(c1492340owC);
        c259800zU.element = c1492320owA;
        this.LJII = c1492320owA;
        try {
            c1492320owA.LIZJ();
            return LJFF(musicModel, new InterfaceC202028143e() { // from class: X.143i
                @Override // X.InterfaceC202028143e
                public final void LIZIZ(Map map, Map map2) {
                }

                @Override // X.InterfaceC202028143e
                public final void onCancel() {
                    interfaceC202028143e.onCancel();
                }

                @Override // X.InterfaceC202028143e
                public final void onStart() {
                    interfaceC202028143e.onStart();
                }

                @Override // X.InterfaceC202028143e
                public final void LIZJ(C202035143l c202035143l) {
                    interfaceC202028143e.LIZJ(c202035143l);
                    c259800zU.element.LIZIZ();
                }

                @Override // X.InterfaceC202028143e
                public final void onProgress(int i) {
                    interfaceC202028143e.onProgress(i);
                }

                @Override // X.InterfaceC202028143e
                public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                    interfaceC202028143e.LIZ(str, musicWaveBean, bool);
                    c259800zU.element.LIZ();
                }
            }, z2, z3, z4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C202036143m) {
                throw th.getRealThrowable();
            }
            throw th;
        }
    }
}
