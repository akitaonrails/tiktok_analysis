package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import defpackage.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590450NDv {
    public static final C590450NDv LIZ = new C590450NDv();

    public static boolean LIZJ() {
        Integer numLJJ;
        if (!C1867620yhU.LIZ()) {
            return false;
        }
        if (C590440NDu.LJII.length() != 0) {
            return true;
        }
        ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi$default(ISplashAdService.class, false, false, false, 14, null);
        return iSplashAdService != null && (numLJJ = iSplashAdService.LJJ()) != null && new IntRange(5, 7).LJLJL(numLJJ.intValue()) && LIZIZ(numLJJ.intValue()).LIZ == EnumC590470NDx.SUCCESS && LJ(numLJJ.intValue());
    }

    public static void LIZLLL() {
        if (C1867620yhU.LIZ()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590440NDu.LIZIZ(), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            C590420NDs.LIZ.getClass();
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(C590420NDs.LJIIJJI(), new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listLJJLIIIJILLIZJL2) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                Object objLJJJJZI = C13LP.LJJJJZI(a0.LJJLIIIJILLIZJL((String) obj3, new String[]{":"}, 0, 6));
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next(), objLJJJJZI)) {
                                arrayList3.add(obj3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            C590420NDs c590420NDs = C590420NDs.LIZ;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
            c590420NDs.getClass();
            C590420NDs.LJI().storeString("key_video_group_brand_safety", strLJJLIIIJ);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (!arrayList3.contains(obj4)) {
                    arrayList4.add(obj4);
                }
            }
            C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62).getClass();
            C590420NDs.LIZ.getClass();
            if (a0.LJJIIZI(C590420NDs.LJIIJJI(), C590420NDs.LJIIIIZZ(), false)) {
                return;
            }
            C590420NDs.LJI().storeString("key_video_group_the_keep_brand_safety", "");
        }
    }

    public static void LIZ(String str) {
        String strLIZIZ;
        Integer numLJIIJJI;
        if (C1867620yhU.LIZ() && str != null && str.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 2) {
                C590420NDs.LIZ.getClass();
                String strLJIIJJI = C590420NDs.LJIIJJI();
                if (TextUtils.isEmpty(strLJIIJJI)) {
                    strLIZIZ = str;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJIIJJI);
                    sbLIZ.append(",");
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C590420NDs.LJI().storeString("key_video_group_brand_safety", strLIZIZ);
                if (C590420NDs.LJIIIIZZ().length() == 0) {
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
                    String str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL2);
                    if (str2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null && numLJIIJJI.intValue() == 5) {
                        String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        C590420NDs.LJI().storeString("key_video_group_the_keep_brand_safety", str3);
                    }
                    C590420NDs.LJIIIIZZ();
                }
            }
        }
    }

    public static C590460NDw LIZIZ(int i) {
        boolean z;
        String str;
        String str2;
        Integer numLJIIJJI;
        if (C590440NDu.LJII.length() == 0) {
            if (C590440NDu.LIZIZ().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C590420NDs.LIZ.getClass();
                if (C590420NDs.LJIIJ().length() <= 0) {
                    LIZLLL();
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590420NDs.LJIIJJI(), new String[]{","}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listLJJLIIIJILLIZJL) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        str = "";
                        if (!it2.hasNext()) {
                            break;
                        }
                        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
                        if (listLJJLIIIJILLIZJL2.size() == 2 && (str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL2)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                            String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL2);
                            if (str3 != null) {
                                str = str3;
                            }
                            if (i == 5) {
                                if (new IntRange(3, 5).LJLJL(numLJIIJJI.intValue()) && C590390NDp.LIZIZ(-1, str)) {
                                    break;
                                }
                            } else if (i == 6) {
                                if (numLJIIJJI.intValue() == 5 && C590390NDp.LIZIZ(-1, str)) {
                                    break;
                                }
                            } else if (i == 7 && new IntRange(2, 5).LJLJL(numLJIIJJI.intValue()) && C590390NDp.LIZIZ(-1, str)) {
                                break;
                            }
                        }
                    }
                    if (str.length() == 0) {
                        return new C590460NDw(EnumC590470NDx.NOT_EXIST, null);
                    }
                    C590440NDu.LJII = str;
                    return new C590460NDw(EnumC590470NDx.SUCCESS, str);
                }
            }
            return new C590460NDw(EnumC590470NDx.EMPTY, null);
        }
        return new C590460NDw(EnumC590470NDx.SUCCESS, C590440NDu.LJII);
    }

    public static boolean LJ(int i) {
        if (C294330BgF.LIZ()) {
            int i2 = 0;
            int i3 = 0;
            IFeedCacheLoaderService iFeedCacheLoaderService = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null);
            while (true) {
                i2++;
                if (i3 < 16) {
                    String str = C590440NDu.LJII;
                    if (str.length() != 0) {
                        if (iFeedCacheLoaderService != null && iFeedCacheLoaderService.LJIIL(str)) {
                            return true;
                        }
                        x0.LIZ.LJII(C0NEW.DB.getValue(), str);
                        C590480NDy.LIZ.getClass();
                        if (C294330BgF.LIZ() && str.length() != 0) {
                            synchronized (C590480NDy.LJI) {
                                try {
                                    C590480NDy.LIZJ();
                                    for (String str2 : C13LP.LLIIII(C590480NDy.LJ.keySet())) {
                                        C590480NDy.LIZ.getClass();
                                        C590480NDy.LJIJJLI(str2, str);
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("removeAidAcrossAllUids aid=");
                                    sbLIZ.append(str);
                                    sbLIZ.append(" done");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        C590440NDu.LJII = "";
                        LIZIZ(i);
                        if (!Intrinsics.LJFF(C590440NDu.LJII, str)) {
                            i3 = i2;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            if (C590440NDu.LJII.length() == 0) {
                return false;
            }
            IFeedCacheLoaderService iFeedCacheLoaderService2 = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null);
            if (iFeedCacheLoaderService2 != null && iFeedCacheLoaderService2.LJIIL(C590440NDu.LJII)) {
                return true;
            }
            x0.LIZ.LJII(C0NEW.DB.getValue(), C590440NDu.LJII);
            C590440NDu.LJII = "";
            LIZIZ(i);
            return LJ(i);
        }
    }
}
