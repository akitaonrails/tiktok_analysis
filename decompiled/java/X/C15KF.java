package X;

import Y.ACallableS256S0200000_31;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15KF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KF {
    public static final C15KF LIZ = new C15KF();
    public static final HashMap<String, MusicWaveBean> LIZIZ = new HashMap<>();

    public static final void LIZ(MusicWaveBean musicWaveBean) {
        float[] musicWavePointArray = musicWaveBean.getMusicWavePointArray();
        if (musicWavePointArray != null) {
            if (musicWavePointArray.length == 0) {
                return;
            }
            int length = musicWavePointArray.length;
            for (int i = 0; i < length; i++) {
                if (Float.isNaN(musicWavePointArray[i])) {
                    musicWavePointArray[i] = 0.0f;
                }
            }
        }
    }

    public static final MusicWaveBean LJ(int i) {
        float f;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch ((i2 - 2) % 8) {
                case 1:
                case 7:
                    f = 0.15306123f;
                    break;
                case 2:
                case 6:
                    f = 0.26530612f;
                    break;
                case 3:
                case 5:
                    f = 0.37755102f;
                    break;
                case 4:
                    f = 0.48979592f;
                    break;
                default:
                    f = 0.040816326f;
                    break;
            }
            fArr[i2] = f;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(fArr);
        return musicWaveBean;
    }

    public static final boolean LJI(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return false;
        }
        return true;
    }

    public static List LIZJ(List list, List list2) {
        List listLLIILII = C13LP.LLIILII(list, list2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
        for (Pair pair : (ArrayList) listLLIILII) {
            String str = (String) pair.getFirst();
            int iIntValue = ((Number) pair.getSecond()).intValue();
            LIZ.getClass();
            MusicWaveBean musicWaveBeanLIZLLL = LIZLLL(iIntValue, str);
            if (musicWaveBeanLIZLLL == null) {
                return null;
            }
            arrayList.add(musicWaveBeanLIZLLL);
        }
        return arrayList;
    }

    public static MusicWaveBean LIZLLL(int i, String str) {
        HashMap<String, MusicWaveBean> map = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        MusicWaveBean musicWaveBean = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (musicWaveBean != null) {
            return musicWaveBean.clone();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.15KI] */
    public static final void LIZIZ(final String str, final int i, final C15KJ c15kj) {
        if (TextUtils.isEmpty(str)) {
            c15kj.LIZIZ(null);
            return;
        }
        LIZ.getClass();
        MusicWaveBean musicWaveBeanLIZLLL = LIZLLL(i, str);
        if (musicWaveBeanLIZLLL != null) {
            C201955140j.LIZ("Load waveBean from cache");
            c15kj.LIZIZ(musicWaveBeanLIZLLL);
        } else {
            final ?? r3 = new C15KK() { // from class: X.15KI
                @Override // X.C15KK
                public final void LIZ(Object obj) {
                    boolean z;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OLD_DRAFT AudioWaveDataIsNull:");
                    if (obj == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C15KJ c15kj2 = c15kj;
                    if (c15kj2 != null) {
                        if (obj != null && (obj instanceof MusicWaveBean)) {
                            c15kj2.LIZIZ(((MusicWaveBean) obj).clone());
                        } else {
                            c15kj2.LIZIZ(null);
                        }
                    }
                }
            };
            C15O7.LIZJ(new Callable() { // from class: X.15KE
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AVMusicWaveBean musicWaveData;
                    MusicWaveBean musicWaveBeanLJ;
                    C1C7U.LIZ("MusicWaveDataFetcher@f064.getMusicWaveBeanAsync$1");
                    TextUtils.isEmpty(str);
                    String str2 = str;
                    int i2 = i;
                    HashMap<String, MusicWaveBean> map = C15KF.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('_');
                    sbLIZ.append(i2);
                    MusicWaveBean musicWaveBean = map.get(C2188811AlT.LIZIZ(sbLIZ));
                    if (musicWaveBean != null) {
                        musicWaveBeanLJ = musicWaveBean.clone();
                    } else {
                        int musicDuration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().getMusicDuration(str2);
                        if (musicDuration <= -1) {
                            musicWaveBeanLJ = C15KF.LJ(i2);
                        } else {
                            int i3 = i2 <= 0 ? 2000 : i2;
                            if (musicDuration <= 90000 && (musicWaveData = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).vesdkService().getMusicWaveData(str2, 0, i3)) != null) {
                                musicWaveBeanLJ = new MusicWaveBean();
                                musicWaveBeanLJ.setMusicLength(musicWaveData.getMusicLength());
                                musicWaveBeanLJ.setMusicWavePointArray(musicWaveData.getMusicWavePointArray());
                                musicWaveBeanLJ.setVideoLenght(musicWaveData.getVideoLenght());
                            } else {
                                musicWaveBeanLJ = C15KF.LJ(i2);
                            }
                            C15KF.LIZ(musicWaveBeanLJ);
                        }
                    }
                    C1C7U.LIZIZ("MusicWaveDataFetcher@f064.getMusicWaveBeanAsync$1");
                    return musicWaveBeanLJ;
                }
            }).LJ(new InterfaceC2385309Wh() { // from class: X.15KH
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<MusicWaveBean> c15o7) {
                    C1C7U.LIZ("MusicWaveDataFetcher@f064.getMusicWaveBeanAsync$2");
                    C15KK c15kk = r3;
                    if (c15kk != null) {
                        if (c15o7 == null) {
                            c15kk.LIZ(null);
                        } else {
                            HashMap<String, MusicWaveBean> map = C15KF.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append('_');
                            sbLIZ.append(i);
                            map.put(C2188811AlT.LIZIZ(sbLIZ), c15o7.LJIIL().clone());
                            r3.LIZ(c15o7.LJIIL());
                        }
                    }
                    C1C7U.LIZIZ("MusicWaveDataFetcher@f064.getMusicWaveBeanAsync$2");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    public static final void LJFF(final List<String> list, List<Integer> list2, final C15KJ c15kj) {
        if (list.isEmpty()) {
            c15kj.LIZ(C13BV.INSTANCE);
            return;
        }
        LIZ.getClass();
        List<MusicWaveBean> listLIZJ = LIZJ(list, list2);
        if (listLIZJ != null) {
            C201955140j.LIZ("Load multi waveBeans from cache");
            c15kj.LIZ(listLIZJ);
        } else {
            C15O7.LIZJ(new ACallableS256S0200000_31(list, list2, 2)).LJ(new C20749016Hg(new C15KK() { // from class: X.15KG
                @Override // X.C15KK
                public final void LIZ(Object obj) {
                    boolean z;
                    List<MusicWaveBean> list3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OLD_DRAFT AudioWaveDataIsNull:");
                    if (obj == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if ((obj instanceof List) && (list3 = (List) obj) != null) {
                        C15KJ c15kj2 = c15kj;
                        List<String> list4 = list;
                        c15kj2.LIZ(list3);
                        for (Pair pair : (ArrayList) C13LP.LLIILII(list4, (Iterable) obj)) {
                            C15KF.LIZIZ.put((String) pair.getFirst(), (MusicWaveBean) pair.getSecond());
                        }
                        return;
                    }
                    c15kj.LIZ(C13BV.INSTANCE);
                }
            }, 7), C15O7.LJIIIIZZ, null);
        }
    }
}
