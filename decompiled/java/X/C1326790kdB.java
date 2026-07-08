package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326790kdB {
    public static final C1326790kdB LIZ = new C1326790kdB();
    public static final C1331730kl9 LIZIZ;
    public static final C1331730kl9 LIZJ;
    public static final C1331730kl9 LIZLLL;
    public static final C1331730kl9 LJ;
    public static final C1331730kl9 LJFF;
    public static final C1331730kl9 LJI;

    static {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        IECommerceHostService iECommerceHostService4;
        IECommerceHostService iECommerceHostService5;
        IECommerceHostService iECommerceHostService6;
        Float fValueOf;
        IECommerceHostService iECommerceHostService7;
        IECommerceHostService iECommerceHostService8;
        IECommerceHostService iECommerceHostService9;
        IECommerceHostService iECommerceHostService10;
        C1331750klB c1331750klB = new C1331750klB();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB.LIZIZ = C12ES.LIZJ(0.5f, ((IApplicationDependencyService) iECommerceHostService).getApplication());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB.LJ = C12ES.LIZJ(2.0f, ((IApplicationDependencyService) iECommerceHostService2).getApplication());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB.LIZJ = C960203pA.LIZ(R.attr.ng, ((IApplicationDependencyService) iECommerceHostService3).getApplication());
        LIZIZ = new C1331730kl9(c1331750klB);
        C1331750klB c1331750klB2 = new C1331750klB();
        c1331750klB2.LJ = C0H9H.LIZ(4);
        LIZJ = new C1331730kl9(c1331750klB2);
        C1331750klB c1331750klB3 = new C1331750klB();
        c1331750klB3.LJ = C0H9H.LIZ(8);
        LIZLLL = new C1331730kl9(c1331750klB3);
        C1331750klB c1331750klB4 = new C1331750klB();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            iECommerceHostService4 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime4, 1, IApplicationDependencyService.class.getName(), iECommerceHostService4 != null ? iECommerceHostService4.getClass().getName() : null, iECommerceHostService4 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB4.LIZIZ = C12ES.LIZJ(0.5f, ((IApplicationDependencyService) iECommerceHostService4).getApplication());
        float f = 36;
        c1331750klB4.LJ = C0H9H.LIZ(f);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            iECommerceHostService5 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime5, 1, IApplicationDependencyService.class.getName(), iECommerceHostService5 != null ? iECommerceHostService5.getClass().getName() : null, iECommerceHostService5 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService5 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB4.LIZJ = C960203pA.LIZ(R.attr.ng, ((IApplicationDependencyService) iECommerceHostService5).getApplication());
        LJ = new C1331730kl9(c1331750klB4);
        C1331750klB c1331750klB5 = new C1331750klB();
        c1331750klB5.LJ = C0H9H.LIZ(f);
        c1331750klB5.LIZ();
        C1331750klB c1331750klB6 = new C1331750klB();
        c1331750klB6.LIZIZ = C0H9H.LIZ(1);
        c1331750klB6.LJ = C0H9H.LIZ(6);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime6 = SystemClock.elapsedRealtime();
            iECommerceHostService6 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime6, 1, IApplicationDependencyService.class.getName(), iECommerceHostService6 != null ? iECommerceHostService6.getClass().getName() : null, iECommerceHostService6 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService6 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB6.LIZJ = C960203pA.LIZ(R.attr.ng, ((IApplicationDependencyService) iECommerceHostService6).getApplication());
        c1331750klB6.LIZ();
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime7 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService11 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime7, 1, IApplicationDependencyService.class.getName(), iECommerceHostService11 != null ? iECommerceHostService11.getClass().getName() : null, iECommerceHostService11 != null);
                iECommerceHostService10 = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService10 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            fValueOf = Float.valueOf(((IApplicationDependencyService) iECommerceHostService10).getApplication().getResources().getDimension(R.dimen.b5));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fValueOf = null;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        C1331750klB c1331750klB7 = new C1331750klB();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime8 = SystemClock.elapsedRealtime();
            iECommerceHostService7 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime8, 1, IApplicationDependencyService.class.getName(), iECommerceHostService7 != null ? iECommerceHostService7.getClass().getName() : null, iECommerceHostService7 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService7 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB7.LIZIZ = C12ES.LIZJ(0.5f, ((IApplicationDependencyService) iECommerceHostService7).getApplication());
        c1331750klB7.LJ = fFloatValue2;
        LJFF = new C1331730kl9(c1331750klB7);
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime9 = SystemClock.elapsedRealtime();
                Object service2 = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService12 = (IECommerceHostService) service2;
                C1AQS.LIZJ(jElapsedRealtime9, 1, IApplicationDependencyService.class.getName(), iECommerceHostService12 != null ? iECommerceHostService12.getClass().getName() : null, iECommerceHostService12 != null);
                iECommerceHostService9 = (IECommerceHostService) service2;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService9 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Float fValueOf2 = Float.valueOf(((IApplicationDependencyService) iECommerceHostService9).getApplication().getResources().getDimension(R.dimen.b6));
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1331750klB c1331750klB8 = new C1331750klB();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime10 = SystemClock.elapsedRealtime();
            iECommerceHostService8 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime10, 1, IApplicationDependencyService.class.getName(), iECommerceHostService8 != null ? iECommerceHostService8.getClass().getName() : null, iECommerceHostService8 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService8 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        c1331750klB8.LIZIZ = C12ES.LIZJ(0.5f, ((IApplicationDependencyService) iECommerceHostService8).getApplication());
        c1331750klB8.LJ = fFloatValue;
        LJI = new C1331730kl9(c1331750klB8);
    }

    public static String LIZ(String str) {
        String str2;
        File fileLIZLLL;
        if (str != null) {
            str2 = C1326840kdG.LIZ.LIZLLL(str, false).LIZ;
        } else {
            str2 = null;
        }
        C1325420kay.LIZ("getImageFilePath may cause ANR, use getImageFilePathAsync or call it in Non-UI Thread");
        if (!TextUtils.isEmpty(str2) && (fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(str2))) != null) {
            return fileLIZLLL.getAbsolutePath();
        }
        return "";
    }

    public static boolean LIZIZ(Uri uri) {
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ == null) {
            return false;
        }
        return interfaceC1325460kb2LIZJ.LJIIIZ(C1326840kdG.LIZ.LIZJ(false, uri).LIZ);
    }

    public static boolean LIZJ(String str) {
        String str2;
        if (str != null) {
            str2 = C1326840kdG.LIZ.LIZLLL(str, false).LIZ;
        } else {
            str2 = null;
        }
        return C1325420kay.LIZIZ(str2);
    }

    public static C1331670kl3 LIZLLL(Object obj) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        ArrayList arrayList;
        String strLJ;
        String strLJ2;
        Pair pair;
        if (obj == null) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ(" ");
        } else if (obj instanceof Image) {
            Image image = (Image) obj;
            List<String> urls = image.getUrls();
            if (urls != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
                Iterator<String> it2 = urls.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1326840kdG.LIZ.LIZLLL(it2.next(), false).LIZ);
                }
            } else {
                arrayList = null;
            }
            image.setUrls(arrayList);
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIJ(image.toImageUrlModel());
        } else if (obj instanceof File) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJII((File) obj);
        } else if (obj instanceof String) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ(C1326840kdG.LIZ.LIZLLL((String) obj, false).LIZ);
        } else if (obj instanceof Uri) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJI(C1326840kdG.LIZ.LIZJ(false, (Uri) obj).LIZ);
        } else if (obj instanceof C03IT) {
            C03IT c03it = (C03IT) obj;
            List<String> list = c03it.LIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) list).iterator();
            while (it3.hasNext()) {
                String str = C1326840kdG.LIZ.LIZLLL((String) it3.next(), false).LIZ;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            c03it.LIZ = arrayList2;
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIJ(c03it);
        } else if (obj instanceof Integer) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJFF(((Number) obj).intValue());
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(obj);
        }
        C1322400kW6.LIZ.getClass();
        if (C1322400kW6.LIZIZ.priorityOptimizeSwitch > 0) {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        }
        C1199304md.LIZ.getClass();
        String strLIZIZ = "";
        if (C1199304md.LIZJ.getValue().booleanValue()) {
            if (C1199304md.LIZIZ.enableFirstScreenOperationCache) {
                try {
                    C03IT c03it2 = c1331670kl3LJIIIIZZ.LJJIZ;
                    if (c03it2 != null && !c03it2.LIZ()) {
                        String str2 = (String) ((ArrayList) c1331670kl3LJIIIIZZ.LJJIZ.LIZ).get(0);
                        String strLJ3 = C1334150kp3.LJ(UriProtector.parse(str2));
                        if (strLJ3 == null) {
                            strLJ3 = "";
                        }
                        pair = new Pair(str2, strLJ3);
                    } else {
                        Uri uri = c1331670kl3LJIIIIZZ.LIZ;
                        String string = uri.toString();
                        String strLJ4 = C1334150kp3.LJ(uri);
                        if (strLJ4 == null) {
                            strLJ4 = "";
                        }
                        pair = new Pair(string, strLJ4);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    pair = new Pair("", "");
                }
                String str3 = C1326590kcr.LIZJ((String) pair.getFirst(), (String) pair.getSecond(), null).LLILLJJLI;
                if (str3 != null) {
                    c1331670kl3LJIIIIZZ.LJJJJJ = str3;
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                }
            } else {
                try {
                    C03IT c03it3 = c1331670kl3LJIIIIZZ.LJJIZ;
                    if (c03it3 != null && !c03it3.LIZ()) {
                        strLJ2 = C1334150kp3.LJ(UriProtector.parse((String) ((ArrayList) c1331670kl3LJIIIIZZ.LJJIZ.LIZ).get(0)));
                    } else {
                        strLJ2 = C1334150kp3.LJ(c1331670kl3LJIIIIZZ.LIZ);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    strLJ2 = "";
                }
                C1199304md.LIZ.getClass();
                if (C1199304md.LIZIZ() > 0 && C13LP.LJJJJ(strLJ2, C1199304md.LIZIZ.operationList)) {
                    c1331670kl3LJIIIIZZ.LJJJJJ = "ecom_operation_cache";
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                } else if (C1199304md.LIZ() > 0) {
                    c1331670kl3LJIIIIZZ.LJJJJJ = "ecom_main_cache";
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                }
            }
        }
        if (C1326310kcP.LIZ.enable) {
            try {
                C03IT c03it4 = c1331670kl3LJIIIIZZ.LJJIZ;
                if (c03it4 != null && !c03it4.LIZ()) {
                    strLJ = C1334150kp3.LJ(UriProtector.parse((String) ((ArrayList) c1331670kl3LJIIIIZZ.LJJIZ.LIZ).get(0)));
                } else {
                    strLJ = C1334150kp3.LJ(c1331670kl3LJIIIIZZ.LIZ);
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                strLJ = "";
            }
            if (C13LP.LJJJJ(strLJ, C1326310kcP.LIZ.sceneList)) {
                c1331670kl3LJIIIIZZ.LJJJJZ = true;
            }
        }
        if (C1326270kcL.LIZ.enable) {
            try {
                C03IT c03it5 = c1331670kl3LJIIIIZZ.LJJIZ;
                if (c03it5 != null && !c03it5.LIZ()) {
                    strLIZIZ = C1334150kp3.LIZIZ(UriProtector.parse((String) ((ArrayList) c1331670kl3LJIIIIZZ.LJJIZ.LIZ).get(0)));
                } else {
                    strLIZIZ = C1334150kp3.LIZIZ(c1331670kl3LJIIIIZZ.LIZ);
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            if (C1326270kcL.LIZ.blockList.contains(strLIZIZ)) {
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            }
        }
        return c1331670kl3LJIIIIZZ;
    }

    public static C1331670kl3 LJ(Image image) {
        List<String> thumbUrls;
        List<String> urls;
        if (image == null || (((thumbUrls = image.getThumbUrls()) == null || thumbUrls.isEmpty()) && ((urls = image.getUrls()) == null || urls.isEmpty()))) {
            return LIZLLL(" ");
        }
        return LIZLLL(image.toThumbFirstImageUrlModel());
    }

    public static EnumC1338240kve LJI(InterfaceC1320380kSq interfaceC1320380kSq) {
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LIZ)) {
            return EnumC1338240kve.FIT_XY;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LIZIZ)) {
            return EnumC1338240kve.FIT_START;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LIZLLL)) {
            return EnumC1338240kve.FIT_END;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LIZJ)) {
            return EnumC1338240kve.FIT_CENTER;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LJ)) {
            return EnumC1338240kve.CENTER;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LJI)) {
            return enumC1338240kve;
        }
        if (Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LJFF)) {
            return EnumC1338240kve.CENTER_INSIDE;
        }
        if (!Intrinsics.LJFF(interfaceC1320380kSq, InterfaceC1320380kSq.LJII)) {
            return enumC1338240kve;
        }
        return EnumC1338240kve.FOCUS_CROP;
    }

    public static C1331670kl3 LJFF(String str, EnumC1769850w9n enumC1769850w9n) {
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        return LIZLLL(str);
    }
}
