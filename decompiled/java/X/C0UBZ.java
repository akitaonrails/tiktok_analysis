package X;

import Y.ARunnableS12S0000100_12;
import Y.AfS181S0100000_12;
import Y.AfS2S0000100_12;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBZ implements Handler.Callback {
    public static int LLILLL;
    public static int LLILZ;
    public static AbstractC765580U1k LLILZIL;
    public static long LLIZLLLIL;
    public static long LLJIJIL;
    public static long LLJJIII;
    public static volatile C768190UBl LLJJIJI;
    public static boolean LLJJIJIIJIL;
    public static boolean LLJJIJIL;
    public static boolean LLJJJ;
    public static long LLJJJIL;
    public static boolean LLJJJJ;
    public static final C0UBZ LL = new C0UBZ();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(287));
    public static final C01GW LLILZLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(285));
    public static String LLIZ = "normal_video_live";
    public static long LLJ = 1;
    public static boolean LLJI = true;
    public static final List<Album> LLJILJIL = new ArrayList();
    public static final ConcurrentHashMap<Long, Long> LLJILJILJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, List<Accompaniment>> LLJILLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<Accompaniment>> LLJJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<C768190UBl>> LLJJI = new ConcurrentHashMap<>();
    public static final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(286));

    static {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0UBi
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Unit> c09aj) {
                boolean z;
                Map linkedHashMap;
                C1C7U.LIZ("AccompanimentManager@5ec3.<init>$1");
                List<DownloadInfo> successedDownloadInfosWithMimeType = ((C2200151B8z) C207232167i.LIZIZ.getValue()).getSuccessedDownloadInfosWithMimeType("live_music_accompaniment");
                ArrayList<DownloadInfo> arrayList = new ArrayList();
                Iterator<DownloadInfo> it2 = successedDownloadInfosWithMimeType.iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    DownloadInfo next = it2.next();
                    if (true ^ ((C2200151B8z) C207232167i.LIZIZ.getValue()).isDownloadSuccessAndFileNotExist(next)) {
                        arrayList.add(next);
                    }
                }
                for (DownloadInfo downloadInfo : arrayList) {
                    try {
                        int iLJJJ = a0.LJJJ(downloadInfo.getExtra(), "&", 0, false, 6);
                        if (iLJJJ != -1) {
                            C2686012e.LIZIZ(C0UBZ.LLJJI, Long.valueOf(CastLongProtector.parseLong(downloadInfo.getExtra().substring(0, iLJJJ))), new C768190UBl(downloadInfo, (Accompaniment) C19748512Ol.LIZJ.LJII(downloadInfo.getExtra().substring(iLJJJ + 1), Accompaniment.class)));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C0UBZ c0ubz = C0UBZ.LL;
                ConcurrentHashMap concurrentHashMapLJI = C0UBZ.LJI();
                concurrentHashMapLJI.clear();
                String strLIZIZ = InterfaceC766480U4w.LJJIJL.LIZIZ();
                if (strLIZIZ.length() <= 0) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    strLIZIZ = null;
                }
                String str = strLIZIZ;
                if (str == null || (linkedHashMap = (Map) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, str, new TypeToken<Map<Long, Long>>() { // from class: X.0UBk
                }.getType())) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                concurrentHashMapLJI.putAll(linkedHashMap);
                C1C7U.LIZIZ("AccompanimentManager@5ec3.<init>$1");
            }
        }).LJL(C11S5.LIZ()).LIZIZ(new C476750Imn());
    }

    public static AbstractC765580U1k LIZJ() {
        AbstractC765580U1k abstractC765580U1kLJII = LLILZIL;
        if (abstractC765580U1kLJII == null) {
            InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
            if (interfaceC769940UIe == null || (abstractC765580U1kLJII = interfaceC769940UIe.LJII()) == null) {
                return null;
            }
            abstractC765580U1kLJII.LLJIJIL(new InterfaceC765610U1n() { // from class: X.0UBa
                @Override // X.InterfaceC765600U1m
                public final void start() {
                    String str;
                    Accompaniment accompaniment;
                    Accompaniment accompaniment2;
                    Accompaniment accompaniment3;
                    Accompaniment accompaniment4;
                    DownloadInfo downloadInfo;
                    C0UBZ c0ubz = C0UBZ.LL;
                    C0UBZ.LJ().removeMessages(1);
                    C0UBZ.LLJJJJ = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BGM-start: ");
                    C768190UBl c768190UBl = C0UBZ.LLJJIJI;
                    String str2 = null;
                    sbLIZ.append((c768190UBl == null || (downloadInfo = c768190UBl.downloadInfo) == null) ? null : downloadInfo.getExtra());
                    C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0UBZ.LLJJIJIL = true;
                    C768090UBb.LIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_play");
                    c474500IjALIZ.LJIL();
                    C768190UBl c768190UBl2 = C0UBZ.LLJJIJI;
                    c474500IjALIZ.LJJII(String.valueOf((c768190UBl2 == null || (accompaniment4 = c768190UBl2.accompaniment) == null) ? null : Long.valueOf(accompaniment4.id)), "music_id");
                    C768190UBl c768190UBl3 = C0UBZ.LLJJIJI;
                    c474500IjALIZ.LJJII((c768190UBl3 == null || (accompaniment3 = c768190UBl3.accompaniment) == null) ? null : accompaniment3.title, "music_name");
                    C768190UBl c768190UBl4 = C0UBZ.LLJJIJI;
                    c474500IjALIZ.LJJII((c768190UBl4 == null || (accompaniment2 = c768190UBl4.accompaniment) == null) ? null : accompaniment2.author, "artist_name");
                    C768190UBl c768190UBl5 = C0UBZ.LLJJIJI;
                    if (c768190UBl5 != null && (accompaniment = c768190UBl5.accompaniment) != null) {
                        str2 = accompaniment.url;
                    }
                    c474500IjALIZ.LJJII(str2, "music_url");
                    List<Album> list = C0UBZ.LLJILJIL;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) list) {
                        if (((Album) obj).id == C0UBZ.LLJJIII) {
                            arrayList.add(obj);
                        }
                    }
                    Album album = (Album) C13LP.LJJJLZIJ(0, arrayList);
                    if (album == null || (str = album.name) == null) {
                        str = "unknown";
                    }
                    c474500IjALIZ.LJJII(str, "from_request_type");
                    c474500IjALIZ.LJJII(String.valueOf(C0UBZ.LLJJIII), "collection_id");
                    c474500IjALIZ.LJJII("decorate", "enter_from");
                    c474500IjALIZ.LJJII(C768090UBb.LIZ, "select_scene");
                    c474500IjALIZ.LIZ();
                    C473410IhP.LIZIZ(new Runnable() { // from class: X.0UBc
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AccompanimentManager@5ec3.getAudioFilterManager$1$1$start$1");
                            try {
                                C0UBZ c0ubz2 = C0UBZ.LL;
                                Iterator it2 = C0UBZ.LJFF().iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC768210UBn) it2.next()).bE();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AccompanimentManager@5ec3.getAudioFilterManager$1$1$start$1");
                        }
                    });
                    C1276840jKc.LIZ.getClass();
                    C1276840jKc.LJJJI(true);
                }

                @Override // X.InterfaceC765600U1m
                public final void stop() {
                    DownloadInfo downloadInfo;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BGM-stop: ");
                    C0UBZ c0ubz = C0UBZ.LL;
                    C768190UBl c768190UBl = C0UBZ.LLJJIJI;
                    sbLIZ.append((c768190UBl == null || (downloadInfo = c768190UBl.downloadInfo) == null) ? null : downloadInfo.getExtra());
                    C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0UBZ.LJIIL("1");
                    C0UBZ.LLJJIJIL = false;
                    C473410IhP.LIZIZ(new Runnable() { // from class: X.0UBd
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AccompanimentManager@5ec3.getAudioFilterManager$1$1$stop$1");
                            try {
                                C0UBZ c0ubz2 = C0UBZ.LL;
                                Iterator it2 = C0UBZ.LJFF().iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC768210UBn) it2.next()).Dq();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AccompanimentManager@5ec3.getAudioFilterManager$1$1$stop$1");
                        }
                    });
                    C0UBZ.LJIIIZ(false);
                    C1276840jKc.LIZ.getClass();
                    C1276840jKc.LJJJI(false);
                }

                @Override // X.InterfaceC765600U1m
                public final void onProgress(long j) {
                    C0UBZ c0ubz = C0UBZ.LL;
                    C0UBZ.LLILLL = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }

                @Override // X.InterfaceC765610U1n
                public final void J(int i, Exception exc) {
                    C0UBZ c0ubz = C0UBZ.LL;
                    C0UBZ.LJ().removeMessages(1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BGM-onError: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(exc.getMessage());
                    C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            abstractC765580U1kLJII.LLJJ();
            abstractC765580U1kLJII.LLJILJIL(InterfaceC766480U4w.LJJIJIIJI.LIZIZ().floatValue());
            abstractC765580U1kLJII.LLJJI(true);
            abstractC765580U1kLJII.LLJILJILJ();
            abstractC765580U1kLJII.LLIZLLLIL();
            LLILZIL = abstractC765580U1kLJII;
        }
        return abstractC765580U1kLJII;
    }

    public static int LIZLLL() {
        return (int) (InterfaceC766480U4w.LJJIJIIJI.LIZIZ().floatValue() * 200.0f);
    }

    public static Handler LJ() {
        return (Handler) LLILZLL.getValue();
    }

    public static Set LJFF() {
        return (Set) LLJJJJJIL.getValue();
    }

    public static ConcurrentHashMap LJI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20337914i1<Long> c20337914i1 = InterfaceC766480U4w.LJJIJIL;
        if (jCurrentTimeMillis > c20337914i1.LIZIZ().longValue()) {
            SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, 7);
            c20337914i1.LJFF(Long.valueOf(calendar.getTimeInMillis()));
            LLJILJILJ.clear();
        }
        return LLJILJILJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r3 > r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r3 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r1 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.size() <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, 0) == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r7 = r21.longValue();
        r2 = (com.bytedance.android.live.effect.music.entity.Accompaniment) com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, 0);
        r10 = new X.C768140UBg(r21);
        r13 = X.EnumC771350UNp.MUSIC_ACC;
        r12 = java.lang.String.valueOf(r2.id);
        r14 = java.lang.String.valueOf(r7);
        r0 = r2.url;
        r11 = X.C2188811AlT.LIZ();
        r11.append(r7);
        r11.append('&');
        r11.append(com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(X.C19748512Ol.LIZJ, r2));
        r11 = new X.C207209166l(r12, r13, r14, "live_music_accompaniment", r0, X.C2188811AlT.LIZIZ(r11), false, 0, false, 832);
        r11.LJFF = true;
        r11.LJ = "music";
        r11.LJI = 10;
        X.C11NZ.LJIJJLI(new X.C768150UBh(r11, r7, r2, r10)).LJL(X.C11S5.LIZ()).LIZIZ(new X.C476750Imn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Path cross not found for [B:20:0x003c, B:27:0x00bd], limit reached: 30 */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0UBg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bd -> B:20:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final java.lang.Long r21) {
        /*
            r6 = r21
            if (r6 != 0) goto L5
            return
        L5:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.CopyOnWriteArrayList<X.0UBl>> r0 = X.C0UBZ.LLJJI
            java.lang.Object r0 = r0.get(r6)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r5 = 0
            if (r0 == 0) goto L2a
            int r1 = r0.size()
        L14:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.effect.music.entity.Accompaniment>> r0 = X.C0UBZ.LLJJ
            java.lang.Object r0 = r0.get(r6)
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            if (r0 == 0) goto L28
            int r0 = r0.size()
        L22:
            int r1 = r1 + r0
            int r1 = 3 - r1
            if (r1 > 0) goto L2c
            return
        L28:
            r0 = 0
            goto L22
        L2a:
            r1 = 0
            goto L14
        L2c:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.List<com.bytedance.android.live.effect.music.entity.Accompaniment>> r0 = X.C0UBZ.LLJILLL
            java.lang.Object r4 = r0.get(r6)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Lc0
            int r3 = r4.size()
            if (r3 <= r1) goto Lbd
        L3c:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto Lc0
            int r0 = r4.size()
            if (r0 <= 0) goto Lbd
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r5)
            r9 = 1
            if (r0 == 0) goto Lbd
            long r7 = r6.longValue()
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r5)
            com.bytedance.android.live.effect.music.entity.Accompaniment r2 = (com.bytedance.android.live.effect.music.entity.Accompaniment) r2
            X.0UBg r10 = new X.0UBg
            r10.<init>()
            X.0UNp r13 = X.EnumC771350UNp.MUSIC_ACC
            long r0 = r2.id
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r14 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r2.url
            java.lang.StringBuilder r11 = X.C2188811AlT.LIZ()
            r11.append(r7)
            r1 = 38
            r11.append(r1)
            com.google.gson.Gson r1 = X.C19748512Ol.LIZJ
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r2)
            r11.append(r1)
            java.lang.String r17 = X.C2188811AlT.LIZIZ(r11)
            X.166l r11 = new X.166l
            java.lang.String r15 = "live_music_accompaniment"
            r21 = 832(0x340, float:1.166E-42)
            r19 = r5
            r20 = r5
            r18 = r5
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.LJFF = r9
            java.lang.String r0 = "music"
            r11.LJ = r0
            r0 = 10
            r11.LJI = r0
            X.0UBh r12 = new X.0UBh
            r13 = r11
            r14 = r7
            r16 = r2
            r17 = r10
            r12.<init>()
            X.11Kf r1 = X.C11NZ.LJIJJLI(r12)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.0Imn r0 = new X.0Imn
            r0.<init>()
            r1.LIZIZ(r0)
        Lbd:
            r1 = r3
            goto L3c
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UBZ.LIZ(java.lang.Long):void");
    }

    public static void LIZIZ(Function1 function1) {
        boolean zLJI = MethodIDManager.LJI(202497);
        ArrayList arrayList = (ArrayList) LLJILJIL;
        if (!(!arrayList.isEmpty()) && !LiveBGMSetting.INSTANCE.inLiveBGMUpgrade()) {
            LLJJJJ = false;
            ((AccompanimentApi) LLILLJJLI.getValue()).getAlbums().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(function1, 168), new AfS181S0100000_12(function1, 169));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (function1 != null) {
            function1.invoke(arrayList);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJII(boolean z) {
        if (z) {
            LJIILLIIL(LLJJIII, true);
            LLJJIJIIJIL = true;
        }
        if (!LLJJIJIL) {
            return;
        }
        AbstractC765580U1k abstractC765580U1kLIZJ = LIZJ();
        if (abstractC765580U1kLIZJ != null) {
            abstractC765580U1kLIZJ.pause();
        }
        LLJJIJIL = false;
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0UBe
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AccompanimentManager@5ec3.pause$1");
                try {
                    C0UBZ c0ubz = C0UBZ.LL;
                    Iterator it2 = C0UBZ.LJFF().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC768210UBn) it2.next()).onPlayerPause();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AccompanimentManager@5ec3.pause$1");
            }
        });
        if (z) {
            LLJ = 2L;
        }
        if (z) {
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 4L, null);
        } else if (LLJI) {
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 2L, null);
        } else {
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 1L, null);
        }
    }

    public static void LJIIIZ(boolean z) {
        if (z) {
            LLJ = 1L;
        } else {
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 1L, null);
        }
        LJIIIIZZ(LLJJIII, z);
    }

    public static void LJIIJJI(long j) {
        String str;
        if (LLJJIJI == null) {
            return;
        }
        List<Album> list = LLJILJIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((Album) obj).id == j) {
                arrayList.add(obj);
            }
        }
        Album album = (Album) C13LP.LJJJLZIJ(0, arrayList);
        if (album == null || (str = album.name) == null) {
            str = "unknown";
        }
        int i = LLILZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_list_play_duration");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(C768090UBb.LIZIZ, "room_id");
        c474500IjALIZ.LJJII(str, "tab");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
        c474500IjALIZ.LJJII(String.valueOf(LLJJIII), "collection_id");
        c474500IjALIZ.LIZ();
        LLILZ = 0;
    }

    public static void LJIIL(String str) {
        Object next;
        String str2;
        Accompaniment accompaniment;
        LLILZ += LLILLL;
        int i = LLILLL;
        Iterator it2 = ((ArrayList) LLJILJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Album) next).id == LLJJIII) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Album album = (Album) next;
        if (album == null || (str2 = album.name) == null) {
            str2 = "unknown";
        }
        C768190UBl c768190UBl = LLJJIJI;
        if (c768190UBl != null && (accompaniment = c768190UBl.accompaniment) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_play_duration");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(C768090UBb.LIZIZ, "room_id");
            c474500IjALIZ.LJJII(str, "is_finish");
            c474500IjALIZ.LJJII(String.valueOf(accompaniment.id), "music_id");
            c474500IjALIZ.LJJII(accompaniment.title, "music_name");
            c474500IjALIZ.LJJII(accompaniment.author, "artist_name");
            c474500IjALIZ.LJJII(accompaniment.url, "music_url");
            c474500IjALIZ.LJJII(str2, "from_request_type");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
            c474500IjALIZ.LJJII("decorate", "enter_from");
            c474500IjALIZ.LJJII(C768090UBb.LIZ, "select_scene");
            c474500IjALIZ.LJJII(String.valueOf(LLJJIII), "collection_id");
            c474500IjALIZ.LIZ();
        }
        LLILLL = 0;
    }

    public static void LJIILIIL(long j) {
        int size;
        long jLongValue;
        List<Accompaniment> list = LLJILLL.get(Long.valueOf(j));
        int size2 = 0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        CopyOnWriteArrayList<Accompaniment> copyOnWriteArrayList = LLJJ.get(Long.valueOf(j));
        if (copyOnWriteArrayList != null) {
            size2 = copyOnWriteArrayList.size();
        }
        if (size + size2 > 2) {
            return;
        }
        AccompanimentApi accompanimentApi = (AccompanimentApi) LLILLJJLI.getValue();
        Long l = (Long) LJI().get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        accompanimentApi.getAccompanimentsWithAlbumId(j, jLongValue, 5L).LJL(C11S5.LIZ()).LJJLL(new AfS2S0000100_12(j, 4), new C09JN() { // from class: X.0T7A
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AccompanimentManager@5ec3.requestAccompanimentListByAlbumId$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request more list error: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C20441214yg.LJ("AccompanimentManager", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("AccompanimentManager@5ec3.requestAccompanimentListByAlbumId$2");
            }
        });
    }

    public static void LJIILJJIL(boolean z) {
        if (LLJJIJI != null) {
            if (!z) {
                if (LLJJIJIIJIL) {
                    return;
                }
            } else {
                LJIILLIIL(LLJJIII, false);
                LLJJIJIIJIL = false;
            }
            AbstractC765580U1k abstractC765580U1kLIZJ = LIZJ();
            if (abstractC765580U1kLIZJ != null) {
                if (!abstractC765580U1kLIZJ.LL) {
                    abstractC765580U1kLIZJ.setEnable(true);
                    C768190UBl c768190UBl = LLJJIJI;
                    if (c768190UBl != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c768190UBl.downloadInfo.getSavePath());
                        sbLIZ.append(c768190UBl.downloadInfo.getName());
                        abstractC765580U1kLIZJ.LLJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    abstractC765580U1kLIZJ.setEnable(true);
                }
                abstractC765580U1kLIZJ.resume();
            }
            LLJJIJIL = true;
            C473410IhP.LIZIZ(new Runnable() { // from class: X.0UBf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AccompanimentManager@5ec3.resume$2");
                    try {
                        C0UBZ c0ubz = C0UBZ.LL;
                        Iterator it2 = C0UBZ.LJFF().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC768210UBn) it2.next()).LLLLILI();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AccompanimentManager@5ec3.resume$2");
                }
            });
            LLIZLLLIL = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            LLIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
            LLJ = 2L;
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, null, null, Long.valueOf(LLJ));
            LLJ = 1L;
        }
    }

    public static void LJIILL(int i) {
        float f = i / 200.0f;
        InterfaceC766480U4w.LJJIJIIJI.LJFF(Float.valueOf(f));
        AbstractC765580U1k abstractC765580U1kLIZJ = LIZJ();
        if (abstractC765580U1kLIZJ != null) {
            abstractC765580U1kLIZJ.LLJILJIL(f);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        long jLongValue;
        boolean z;
        C768190UBl c768190UBl;
        AbstractC765580U1k abstractC765580U1kLIZJ;
        Long l;
        int i = message.what;
        if (i != 0) {
            if (i == 1 && !LLJJIJIL) {
                C20441214yg.LJ("AccompanimentManager", "Time out, play next!");
                LJIIIZ(false);
            }
            return true;
        }
        if (LLJJIJIIJIL) {
            return true;
        }
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if ((messageObj instanceof Long) && (l = (Long) messageObj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C768190UBl c768190UBl2 = LLJJIJI;
        if (c768190UBl2 != null) {
            LJII(false);
            C768730UDn.LIZ(c768190UBl2.downloadInfo, true);
            CopyOnWriteArrayList<C768190UBl> copyOnWriteArrayList = LLJJI.get(Long.valueOf(jLongValue));
            if (copyOnWriteArrayList != null) {
                for (C768190UBl c768190UBl3 : copyOnWriteArrayList) {
                    if (c768190UBl3.downloadInfo.getId() == c768190UBl2.downloadInfo.getId()) {
                        copyOnWriteArrayList.remove(c768190UBl3);
                    }
                }
            }
        }
        LLJJIJI = null;
        boolean z2 = false;
        while (true) {
            ConcurrentHashMap<Long, CopyOnWriteArrayList<C768190UBl>> concurrentHashMap = LLJJI;
            CopyOnWriteArrayList<C768190UBl> copyOnWriteArrayList2 = concurrentHashMap.get(Long.valueOf(LLJJIII));
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty() || z2) {
                break;
            }
            CopyOnWriteArrayList<C768190UBl> copyOnWriteArrayList3 = concurrentHashMap.get(Long.valueOf(LLJJIII));
            if (copyOnWriteArrayList3 != null && (c768190UBl = (C768190UBl) C19719612Di.LJJIIZI(copyOnWriteArrayList3)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c768190UBl.downloadInfo.getSavePath());
                sbLIZ.append(c768190UBl.downloadInfo.getName());
                if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists() && (abstractC765580U1kLIZJ = LIZJ()) != null) {
                    abstractC765580U1kLIZJ.setEnable(true);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c768190UBl.downloadInfo.getSavePath());
                    sbLIZ2.append(c768190UBl.downloadInfo.getName());
                    abstractC765580U1kLIZJ.LLJ(C2188811AlT.LIZIZ(sbLIZ2));
                    abstractC765580U1kLIZJ.resume();
                    LLJJIJI = c768190UBl;
                    C786410Ut5.LJLJJI(1, 12000L, LJ());
                    z2 = true;
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        LLIZLLLIL = jCurrentTimeMillis / j;
        LLIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        if (message.arg1 == 1) {
            z = true;
        } else {
            z = false;
        }
        LLJI = z;
        long j2 = LLJIJIL;
        long j3 = LLJJIII;
        if (j2 != j3) {
            LLJ = 1L;
        }
        LLJIJIL = j3;
        C768300UBw.LJIILLIIL(Long.valueOf(System.currentTimeMillis() / j), LLIZ, null, null, Long.valueOf(LLJ));
        LLJ = 1L;
        if (LLJJIJI == null) {
            C473410IhP.LIZIZ(new ARunnableS12S0000100_12(jLongValue, 5));
        }
        LIZ(Long.valueOf(jLongValue));
        LJIILIIL(jLongValue);
        return true;
    }

    public static void LJIIIIZZ(long j, boolean z) {
        LJ().removeMessages(0);
        LJ().removeMessages(1);
        if (z) {
            LJIIL(CardStruct.IStatusCode.DEFAULT);
            LJIILLIIL(LLJJIII, false);
            LLJJIJIIJIL = false;
        }
        long j2 = LLJJIII;
        if (j2 != j) {
            LJIIJJI(j2);
        }
        LJIILLIIL(j, LLJJIJIIJIL);
        LLJJIII = j;
        Handler handlerLJ = LJ();
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = Long.valueOf(j);
        messageObtain.arg1 = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
        C786410Ut5.LJLJJL(handlerLJ, messageObtain);
    }

    public static void LJIIJ(boolean z, boolean z2) {
        LJIIL(CardStruct.IStatusCode.DEFAULT);
        LJIIJJI(LLJJIII);
        if (LLJJIJI != null && !LLJJIJIIJIL) {
            C768300UBw.LJIILLIIL(Long.valueOf(LLIZLLLIL), LLIZ, Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 3L, null);
        }
        LJ().removeMessages(0);
        LJ().removeMessages(1);
        C207232167i.LIZ(AFwS245S0000000_12.get$arr$(133));
        ((ArrayList) LLJILJIL).clear();
        LLJILLL.clear();
        LLJJ.clear();
        LLJJIJI = null;
        if (z && z2) {
            LLJJJIL = LLJJIII;
            LLJJJ = LLJJIJIL;
        } else {
            LLJJJIL = 0L;
            LLJJJ = false;
        }
        LJIILLIIL(0L, LLJJIJIIJIL);
        LLJJIII = 0L;
        LLJJIJIL = false;
        LJIILLIIL(0L, false);
        LLJJIJIIJIL = false;
        LJFF().clear();
        LLILZIL = null;
        InterfaceC766480U4w.LJJIJL.LJFF(GsonProtectorUtils.toJson(C19748512Ol.LIZJ, LJI()));
    }

    public static void LJIILLIIL(long j, boolean z) {
        if (j != 0 && !z) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            if (iBroadcastService != null) {
                iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.MUSIC, EnumC771230UNd.APPLYING, String.valueOf(j));
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.BGM);
            return;
        }
        IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService2 != null) {
            iBroadcastService2.notifyApplyStatusAndSaveStatus(EnumC773040UUc.MUSIC, EnumC771230UNd.APPLY_FINISH, null);
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
        C0U3P.LJ(C0U3Q.BGM);
    }
}
