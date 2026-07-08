package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0I98, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1294060jmO
public final class C0I98 {
    public static final C0I98 LIZ = new C0I98();

    public static boolean LJIIJJI(UrlModel urlModel) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("tt_dm_filter_illegal_gif", false) || !LJIIL(urlModel)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(UrlModel urlModel) {
        if (((Boolean) C269740Ahg.LIZ.getValue()).booleanValue() && C844450XAt.LJ(urlModel)) {
            return true;
        }
        return false;
    }

    public static final UrlModel LJIILIIL(String str) {
        if (str != null && str.length() != 0) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList(str));
            return urlModel;
        }
        return null;
    }

    public static final void LJIIJ(C1322110kVd c1322110kVd, UrlModel urlModel, String str, boolean z) {
        LJFF(c1322110kVd, urlModel, str, null, null, 0, 0, true, null, z);
    }

    public static void LIZ(C1322110kVd c1322110kVd, UrlModel urlModel, String str, int i, int i2, boolean z, boolean z2, String str2, int i3) {
        String str3;
        List<String> urlList;
        String uri;
        List<String> urlList2;
        List<String> urlList3;
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 8) != 0) {
            i = 0;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        if ((i3 & 32) != 0) {
            z = false;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        }
        String uri2 = null;
        if ((i3 & 256) != 0) {
            str2 = null;
        }
        if (LJIIJJI(urlModel)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindImage with illegal gif ");
            if (urlModel != null) {
                List<String> urlList4 = urlModel.getUrlList();
                if (urlList4 != null && !urlList4.isEmpty()) {
                    if (urlModel != null && (urlList3 = urlModel.getUrlList()) != null) {
                        uri2 = (String) C13LP.LJJJLL(urlList3);
                    }
                } else if (urlModel != null) {
                    uri2 = urlModel.getUri();
                }
            }
            sbLIZ.append(uri2);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (urlModel != null && (urlList2 = urlModel.getUrlList()) != null) {
            str3 = (String) C13LP.LJJJLL(urlList2);
        } else {
            str3 = null;
        }
        C0I9F c0i9f = new C0I9F(null, new C21307918a5(str3, str));
        if (urlModel != null && (((urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) && urlModel != null && (uri = urlModel.getUri()) != null && uri.length() != 0)) {
            return;
        }
        C0I66 c0i66 = new C0I66();
        c0i66.LIZIZ = c1322110kVd;
        c0i66.LIZ = urlModel;
        c0i66.LJIIL = z2;
        c0i66.LIZJ = i;
        c0i66.LIZLLL = i2;
        c0i66.LJ = c0i9f;
        c0i66.LJFF = true;
        c0i66.LJIIIIZZ = z;
        c0i66.LJIILJJIL = str2;
        c0i66.LJI = false;
        c0i66.LJIIIZ = true;
        c0i66.LIZ().LIZ();
    }

    public static void LJ(C1322110kVd c1322110kVd, UrlModel urlModel, String str, String str2, int i, int i2, C06TB c06tb, Integer num, Integer num2) {
        String space;
        if (c06tb != null) {
            space = c06tb.getSpace();
        } else {
            space = null;
        }
        LIZJ(c1322110kVd, urlModel, str, str2, i, i2, 0, 0, null, null, space, true, true, null, num, num2, false, null, 822720);
    }

    public static final void LJFF(C1322110kVd c1322110kVd, UrlModel urlModel, String str, final InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH, InterfaceC1291910jiv interfaceC1291910jiv, int i, int i2, boolean z, UrlModel urlModel2, boolean z2) {
        if (c1322110kVd != null && urlModel != null) {
            String uri = null;
            if (LJIIL(urlModel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindImage with illegal url ");
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    List<String> urlList2 = urlModel.getUrlList();
                    if (urlList2 != null) {
                        uri = (String) C13LP.LJJJLL(urlList2);
                    }
                } else {
                    uri = urlModel.getUri();
                }
                sbLIZ.append(uri);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            c1322110kVd.getVisibility();
            List<String> urlList3 = urlModel.getUrlList();
            if (urlList3 != null) {
                uri = (String) C13LP.LJJJLL(urlList3);
            }
            final C21307918a5 c21307918a5 = new C21307918a5(uri, str);
            try {
                C1324840ka2.LJ(c1322110kVd, urlModel, i, i2, interfaceC1291910jiv, new C0I9M(new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0I9N
                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str2) {
                        c21307918a5.LIZIZ(str2);
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LIZIZ(str2);
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str2, Throwable th) {
                        c21307918a5.getClass();
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LIZ(str2, th);
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZJ(Object obj, String str2) {
                        c21307918a5.getClass();
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LIZJ(obj, str2);
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                        c21307918a5.LIZLLL(str2, th);
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LIZLLL(str2, th);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onFrescoLoadImgFailure, id: ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", throwable: ");
                        sbLIZ2.append(th);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str2) {
                        c21307918a5.LJFF(obj, str2);
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LJFF(obj, str2);
                        }
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                        InterfaceC1330440kj4 interfaceC1330440kj42 = interfaceC1330440kj4;
                        c21307918a5.LJ(str2, interfaceC1330440kj42, animatable);
                        InterfaceC1320650kTH<InterfaceC1330440kj4> interfaceC1320650kTH2 = interfaceC1320650kTH;
                        if (interfaceC1320650kTH2 != null) {
                            interfaceC1320650kTH2.LJ(str2, interfaceC1330440kj42, animatable);
                        }
                    }
                }, c1322110kVd), z, urlModel2, z2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(C1322110kVd c1322110kVd, UrlModel urlModel, String str, int i, int i2, int i3, int i4, C0I9I c0i9i, boolean z, String str2, int i5) {
        Bitmap.Config config;
        String uri;
        if ((i5 & 4) != 0) {
            str = "";
        }
        if ((i5 & 8) != 0) {
            i = 0;
        }
        if ((i5 & 16) != 0) {
            i2 = 0;
        }
        if ((i5 & 32) != 0) {
            i3 = 0;
        }
        if ((i5 & 128) != 0) {
            i4 = 1;
        }
        String uri2 = null;
        if ((i5 & 256) != 0) {
            c0i9i = null;
        }
        if ((i5 & 512) != 0) {
            z = false;
        }
        if ((i5 & 1024) != 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = null;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str2 = null;
        }
        if (urlModel != null) {
            if (LJIIJJI(urlModel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindImage with illegal gif ");
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    List<String> urlList2 = urlModel.getUrlList();
                    if (urlList2 != null) {
                        uri2 = (String) C13LP.LJJJLL(urlList2);
                    }
                } else {
                    uri2 = urlModel.getUri();
                }
                sbLIZ.append(uri2);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            List<String> urlList3 = urlModel.getUrlList();
            if (urlList3 != null) {
                uri2 = (String) C13LP.LJJJLL(urlList3);
            }
            C0I9F c0i9f = new C0I9F(c0i9i, new C21307918a5(uri2, str));
            List<String> urlList4 = urlModel.getUrlList();
            if ((urlList4 == null || urlList4.isEmpty()) && (uri = urlModel.getUri()) != null && uri.length() != 0) {
                return;
            }
            C0I66 c0i66 = new C0I66();
            c0i66.LIZIZ = c1322110kVd;
            c0i66.LIZ = urlModel;
            c0i66.LJIIL = z;
            c0i66.LIZJ = i;
            c0i66.LIZLLL = i2;
            c0i66.LJII = i3;
            c0i66.LJ = c0i9f;
            c0i66.LJIIJ = false;
            c0i66.LJIIJJI = i4;
            c0i66.LJFF = true;
            c0i66.LJI = true;
            c0i66.LJIILIIL = config;
            c0i66.LJIILJJIL = str2;
            new C0I97(c0i66).LIZ();
        }
    }

    public static void LIZLLL(C1322110kVd c1322110kVd, UrlModel urlModel, String str, Drawable drawable, Drawable drawable2, InterfaceC1291910jiv interfaceC1291910jiv, InterfaceC1320650kTH interfaceC1320650kTH, int i, int i2, UrlModel urlModel2, boolean z) {
        C1331070kk5 hierarchy;
        C0I9M c0i9m;
        if (c1322110kVd != null && c1322110kVd.getContext() != null) {
            Resources resources = c1322110kVd.getContext().getResources();
            if (!c1322110kVd.hasHierarchy()) {
                hierarchy = new C1331090kk7(resources).LIZ();
            } else {
                hierarchy = c1322110kVd.getHierarchy();
            }
            hierarchy.LJIJ(drawable2, 1);
            hierarchy.LJIJ(drawable, 5);
            c1322110kVd.setHierarchy(hierarchy);
            if (interfaceC1320650kTH != null) {
                c0i9m = new C0I9M(interfaceC1320650kTH, c1322110kVd);
            } else {
                c0i9m = null;
            }
            LJFF(c1322110kVd, urlModel, str, c0i9m, interfaceC1291910jiv, i, i2, true, urlModel2, z);
        }
    }

    public static void LJI(C1322110kVd c1322110kVd, UrlModel urlModel, String str, int i, int i2, InterfaceC1291910jiv interfaceC1291910jiv, InterfaceC1320650kTH interfaceC1320650kTH, int i3, int i4, UrlModel urlModel2, boolean z, int i5) {
        int i6 = i4;
        int i7 = i3;
        InterfaceC1320650kTH interfaceC1320650kTH2 = interfaceC1320650kTH;
        boolean z2 = z;
        InterfaceC1291910jiv interfaceC1291910jiv2 = interfaceC1291910jiv;
        UrlModel urlModel3 = null;
        if ((i5 & 32) != 0) {
            interfaceC1291910jiv2 = null;
        }
        if ((i5 & 64) != 0) {
            interfaceC1320650kTH2 = null;
        }
        if ((i5 & 128) != 0) {
            i7 = 0;
        }
        if ((i5 & 256) != 0) {
            i6 = 0;
        }
        if ((i5 & 512) == 0) {
            urlModel3 = urlModel2;
        }
        if ((i5 & 1024) != 0) {
            z2 = false;
        }
        if (c1322110kVd != null && c1322110kVd.getContext() != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c1322110kVd.getContext());
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = i2;
            LIZLLL(c1322110kVd, urlModel, str, tuxIconDrawableLIZ, c419910GdJ2.LIZ(c1322110kVd.getContext()), interfaceC1291910jiv2, interfaceC1320650kTH2, i7, i6, urlModel3, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Type inference failed for: r1v14, types: [REQUEST, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C1322110kVd r27, com.ss.android.ugc.aweme.base.model.UrlModel r28, java.lang.String r29, java.lang.String r30, int r31, int r32, int r33, int r34, X.C0I9I r35, android.graphics.Bitmap.Config r36, java.lang.String r37, boolean r38, boolean r39, X.C869590Y9l r40, java.lang.Integer r41, java.lang.Integer r42, boolean r43, java.util.Map r44, int r45) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I98.LIZJ(X.0kVd, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, int, int, int, int, X.0I9I, android.graphics.Bitmap$Config, java.lang.String, boolean, boolean, X.0Y9l, java.lang.Integer, java.lang.Integer, boolean, java.util.Map, int):boolean");
    }
}
