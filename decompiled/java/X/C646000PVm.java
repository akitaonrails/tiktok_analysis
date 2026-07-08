package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646000PVm {
    @InterfaceC1294060jmO
    public static C0PRW LIZIZ() {
        C0PSJ mutableData;
        C0PRW c0prw;
        C651990Phl c651990Phl = C651990Phl.LL;
        C650950Pg5 c650950Pg5 = (C650950Pg5) C665240Q7m.LIZJ(C650950Pg5.class);
        C0PRW c0prwCopy = null;
        interfaceC1618170sD9 = null;
        InterfaceC1618170sD9 interfaceC1618170sD9 = null;
        c0prwCopy = null;
        c0prwCopy = null;
        if (c650950Pg5 != null && (mutableData = c650950Pg5.getMutableData()) != null && (c0prw = mutableData.fragmentData) != null) {
            InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LJI().Ph1().LIZJ();
            C0PRC c0prc = (C0PRC) interfaceC1618170sD9LIZJ;
            if (C123100dR.LIZ(c0prc.LLILLL) && C123100dR.LIZ(c0prc.LLIZLLLIL)) {
                interfaceC1618170sD9 = interfaceC1618170sD9LIZJ;
            }
            C0PRC c0prc2 = (C0PRC) interfaceC1618170sD9;
            if (c0prc2 != null) {
                c0prwCopy = c0prw.copy(c0prw.tabIndex, c0prw.searchPosition, c0prc2.LLILLL, c0prc2.LLIZLLLIL, c0prw.searchTrackMap, c0prw.feedbackSurvey, c0prw.feelGoodToken, c0prw.hasShownResearchFilter, c0prw.isRecentRequestSearchSourceUnknown, c0prw.feelgoodSurveyDataStr, c0prw.isFragmentVisible, c0prw.enterMethod);
                if (c0prwCopy != null) {
                }
            }
            return c0prw;
        }
        return c0prwCopy;
    }

    @InterfaceC1294060jmO
    public static C650960Pg6 LIZJ() {
        C651990Phl c651990Phl = C651990Phl.LL;
        C650950Pg5 c650950Pg5 = (C650950Pg5) C665240Q7m.LIZJ(C650950Pg5.class);
        if (c650950Pg5 != null) {
            return c650950Pg5.getImmutableData();
        }
        return null;
    }

    public static C0PRW LIZLLL(View view) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650950Pg5 c650950Pg5;
        C0PSJ mutableData;
        C0PRW c0prw;
        C0PRW c0prwCopy = null;
        interfaceC1618170sD9 = null;
        InterfaceC1618170sD9 interfaceC1618170sD9 = null;
        c0prwCopy = null;
        c0prwCopy = null;
        c0prwCopy = null;
        c0prwCopy = null;
        if (view == null) {
            return null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = LJIIL(view);
        if (interfaceC665370Q7zLJIIL != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIIL, "source_default_key", C650950Pg5.class, null)) != null && (c650950Pg5 = (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource()) != null && (mutableData = c650950Pg5.getMutableData()) != null && (c0prw = mutableData.fragmentData) != null) {
            InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LIZ(view).Ph1().LIZJ();
            C0PRC c0prc = (C0PRC) interfaceC1618170sD9LIZJ;
            if (C123100dR.LIZ(c0prc.LLILLL) && C123100dR.LIZ(c0prc.LLIZLLLIL)) {
                interfaceC1618170sD9 = interfaceC1618170sD9LIZJ;
            }
            C0PRC c0prc2 = (C0PRC) interfaceC1618170sD9;
            if (c0prc2 != null) {
                c0prwCopy = c0prw.copy(c0prw.tabIndex, c0prw.searchPosition, c0prc2.LLILLL, c0prc2.LLIZLLLIL, c0prw.searchTrackMap, c0prw.feedbackSurvey, c0prw.feelGoodToken, c0prw.hasShownResearchFilter, c0prw.isRecentRequestSearchSourceUnknown, c0prw.feelgoodSurveyDataStr, c0prw.isFragmentVisible, c0prw.enterMethod);
                if (c0prwCopy != null) {
                }
            }
            return c0prw;
        }
        return c0prwCopy;
    }

    public static C0PRW LJ(Fragment fragment) {
        C0PSJ mutableData;
        C0PRW c0prw;
        C0PRW c0prwCopy = null;
        interfaceC1618170sD9 = null;
        InterfaceC1618170sD9 interfaceC1618170sD9 = null;
        c0prwCopy = null;
        c0prwCopy = null;
        if (fragment == null) {
            return null;
        }
        C650950Pg5 c650950Pg5LJIIJ = LJIIJ(fragment);
        if (c650950Pg5LJIIJ != null && (mutableData = c650950Pg5LJIIJ.getMutableData()) != null && (c0prw = mutableData.fragmentData) != null) {
            InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LIZIZ(fragment).Ph1().LIZJ();
            C0PRC c0prc = (C0PRC) interfaceC1618170sD9LIZJ;
            if (C123100dR.LIZ(c0prc.LLILLL) && C123100dR.LIZ(c0prc.LLIZLLLIL)) {
                interfaceC1618170sD9 = interfaceC1618170sD9LIZJ;
            }
            C0PRC c0prc2 = (C0PRC) interfaceC1618170sD9;
            if (c0prc2 != null) {
                c0prwCopy = c0prw.copy(c0prw.tabIndex, c0prw.searchPosition, c0prc2.LLILLL, c0prc2.LLIZLLLIL, c0prw.searchTrackMap, c0prw.feedbackSurvey, c0prw.feelGoodToken, c0prw.hasShownResearchFilter, c0prw.isRecentRequestSearchSourceUnknown, c0prw.feelgoodSurveyDataStr, c0prw.isFragmentVisible, c0prw.enterMethod);
                if (c0prwCopy != null) {
                }
            }
            return c0prw;
        }
        return c0prwCopy;
    }

    public static C650960Pg6 LJI(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650950Pg5 c650950Pg5;
        if (view == null || (interfaceC665370Q7zLJIIL = LJIIL(view)) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIIL, "source_default_key", C650950Pg5.class, null)) == null || (c650950Pg5 = (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c650950Pg5.getImmutableData();
    }

    public static C650960Pg6 LJIIIIZZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650950Pg5 c650950Pg5;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C650950Pg5.class, null)) == null || (c650950Pg5 = (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c650950Pg5.getImmutableData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C650950Pg5 LJIIJ(LifecycleOwner lifecycleOwner) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        boolean z = lifecycleOwner instanceof ContextWrapper;
        LifecycleOwner lifecycleOwnerLIZIZ = lifecycleOwner;
        if (z) {
            lifecycleOwnerLIZIZ = C1388190mED.LIZIZ((Context) lifecycleOwner);
        }
        if (lifecycleOwnerLIZIZ == null) {
            return null;
        }
        try {
            InterfaceC665370Q7z interfaceC665370Q7zLJIILIIL = LJIILIIL(lifecycleOwnerLIZIZ);
            if (interfaceC665370Q7zLJIILIIL == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIILIIL, "source_default_key", C650950Pg5.class, null)) == null) {
                return null;
            }
            return (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static InterfaceC665370Q7z LJIIL(View view) {
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null && fragmentLIZ.getContext() == null) {
            return null;
        }
        return C1558360qeg.LJ(view, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC665370Q7z LJIILIIL(LifecycleOwner lifecycleOwner) throws Exception {
        Fragment fragment;
        if (lifecycleOwner instanceof C19EG) {
            C19EG c19eg = (C19EG) lifecycleOwner;
            InterfaceC214902198i interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
            if (interfaceC214902198iLJIILLIIL != 0) {
                fragment = (Fragment) interfaceC214902198iLJIILLIIL;
            } else {
                fragment = null;
            }
            if (C07H5.LIZIZ(fragment, c19eg)) {
                SAFHelper.LIZ.getClass();
                SAFHelper.LJJJJZI(c19eg, interfaceC214902198iLJIILLIIL);
                if (fragment == null) {
                    C0Q45 c0q45 = C0Q45.COMMON;
                    EnumC665990QAj enumC665990QAj = EnumC665990QAj.CONTAINER;
                    Exception exc = new Exception();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("lifecycleOwner", String.valueOf(lifecycleOwner));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('$');
                    Activity activity = (Activity) lifecycleOwner;
                    sbLIZ.append(C651580Ph6.LIZIZ(activity));
                    linkedHashMap.put("lifecycleOwner", C2188811AlT.LIZIZ(sbLIZ));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("lifecycleOwner", String.valueOf(lifecycleOwner));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('$');
                    sbLIZ2.append(C651580Ph6.LIZIZ(activity));
                    linkedHashMap2.put("lifecycleOwner", C2188811AlT.LIZIZ(sbLIZ2));
                    C664410Q4h.LIZIZ(c0q45, enumC665990QAj, exc, "getScope_error", linkedHashMap, linkedHashMap2, "search_storage");
                    return C1558360qeg.LJI(c19eg, null);
                }
                return C1558360qeg.LJFF(fragment, null);
            }
            return C1558360qeg.LJI(c19eg, null);
        }
        if (lifecycleOwner instanceof Fragment) {
            Fragment fragment2 = (Fragment) lifecycleOwner;
            if (fragment2.getContext() == null) {
                return null;
            }
            return C1558360qeg.LJFF(fragment2, null);
        }
        throw new Exception("SearchContextSource not support this lifecycleOwner except Activity&Fragment");
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, C650950Pg5 c650950Pg5) {
        Fragment fragmentLIZIZ;
        Fragment fragmentLIZ;
        if (lifecycleOwner instanceof C19EG) {
            C19EG c19eg = (C19EG) lifecycleOwner;
            SAFHelper.LIZ.getClass();
            Fragment fragmentLJJJ = SAFHelper.LJJJ(c19eg);
            if (C07H5.LIZIZ(fragmentLJJJ, c19eg)) {
                if (fragmentLJJJ == null) {
                    C646040PVq.LIZ(lifecycleOwner, c650950Pg5, C650950Pg5.class);
                    C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC664420Q4i.SEARCH_CONTEXT, new RuntimeException("SearchContextSource not support to attachSource this lifecycleOwner rootFragment is null"), "attachSource", C2097908Jt.LIZJ(new Pair("lifecycleOwner", lifecycleOwner.getClass().getSimpleName())), C2097608Jq.LJ(), "search");
                    return;
                } else {
                    C646040PVq.LIZ(fragmentLJJJ, c650950Pg5, C650950Pg5.class);
                    return;
                }
            }
            C646040PVq.LIZ(lifecycleOwner, c650950Pg5, C650950Pg5.class);
            return;
        }
        if (lifecycleOwner instanceof Fragment) {
            if (C1210904oV.LIZ()) {
                fragmentLIZIZ = C0PHE.LIZIZ((Fragment) lifecycleOwner);
            } else {
                fragmentLIZIZ = (Fragment) lifecycleOwner;
            }
            Fragment fragment = (Fragment) lifecycleOwner;
            C0PE2 c0pe2LJFF = C0PHF.LJFF(fragment);
            if (c0pe2LJFF != null && (fragmentLIZ = C0PHF.LIZ(c0pe2LJFF)) != null) {
                fragmentLIZIZ = fragmentLIZ;
            } else if (fragmentLIZIZ == null) {
                fragmentLIZIZ = fragment;
            }
            C1554960qZC.LIZ(C1558360qeg.LJFF(fragmentLIZIZ, null), c650950Pg5, C650950Pg5.class, "source_default_key");
            return;
        }
        C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC664420Q4i.SEARCH_CONTEXT, new RuntimeException("SearchContextSource not support this lifecycleOwner except Activity&Fragment"), "attachSource", C2097908Jt.LIZJ(new Pair("lifecycleOwner", lifecycleOwner.getClass().getSimpleName())), C2097608Jq.LJ(), "search");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0PS4 LJFF(androidx.fragment.app.Fragment r3, androidx.lifecycle.LifecycleOwner r4) throws java.lang.Throwable {
        /*
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            boolean r0 = X.C650950Pg5.isEnabledP3
            if (r0 == 0) goto L95
            boolean r0 = r4 instanceof X.C19EG
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            r1.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJL(r0, r3)
            if (r0 == 0) goto L95
            if (r3 == 0) goto L93
            X.0PE2 r0 = X.C0PHF.LJFF(r3)
            if (r0 == 0) goto L93
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZ(r0)
        L26:
            boolean r1 = X.C1210904oV.LIZ()
            if (r1 == 0) goto L4b
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L36
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r3)
            if (r0 != 0) goto L3c
        L36:
            X.19EG r4 = (X.C19EG) r4
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
        L3c:
            X.0Pg5 r0 = LJIIJ(r0)
            if (r0 == 0) goto L4a
            X.0PSJ r0 = r0.getMutableData()
            if (r0 == 0) goto L4a
            X.0PS4 r2 = r0.globalData
        L4a:
            return r2
        L4b:
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L63
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L91
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L59:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L6f
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7e
        L63:
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            X.19EG r4 = (X.C19EG) r4
            r0.getClass()
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
            goto L3c
        L6f:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L63
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7e
            goto L63
        L7c:
            if (r3 == 0) goto L63
        L7e:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L8c
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L63
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r0 = r3
            if (r3 != 0) goto L3c
            goto L63
        L8c:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L7c
        L91:
            r1 = r2
            goto L59
        L93:
            r0 = r2
            goto L26
        L95:
            X.0Pg5 r0 = LJIIJ(r4)
            if (r0 == 0) goto La3
            X.0PSJ r0 = r0.getMutableData()
            if (r0 == 0) goto La3
            X.0PS4 r2 = r0.globalData
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C646000PVm.LJFF(androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner):X.0PS4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C650960Pg6 LJII(androidx.fragment.app.Fragment r3, androidx.lifecycle.LifecycleOwner r4) {
        /*
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            boolean r0 = X.C650950Pg5.isEnabledP3
            if (r0 == 0) goto L91
            boolean r0 = r4 instanceof X.C19EG
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            r1.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJL(r0, r3)
            if (r0 == 0) goto L91
            if (r3 == 0) goto L8f
            X.0PE2 r0 = X.C0PHF.LJFF(r3)
            if (r0 == 0) goto L8f
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZ(r0)
        L26:
            boolean r1 = X.C1210904oV.LIZ()
            if (r1 == 0) goto L47
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L36
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r3)
            if (r0 != 0) goto L3c
        L36:
            X.19EG r4 = (X.C19EG) r4
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
        L3c:
            X.0Pg5 r0 = LJIIJ(r0)
            if (r0 == 0) goto L46
            X.0Pg6 r2 = r0.getImmutableData()
        L46:
            return r2
        L47:
            if (r0 != 0) goto L3c
            if (r3 == 0) goto L5f
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L8d
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L55:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L6b
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7a
        L5f:
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            X.19EG r4 = (X.C19EG) r4
            r0.getClass()
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
            goto L3c
        L6b:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L5f
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7a
            goto L5f
        L78:
            if (r3 == 0) goto L5f
        L7a:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L88
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L5f
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r0 = r3
            if (r3 != 0) goto L3c
            goto L5f
        L88:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L78
        L8d:
            r1 = r2
            goto L55
        L8f:
            r0 = r2
            goto L26
        L91:
            X.0Pg5 r0 = LJIIJ(r4)
            if (r0 == 0) goto L9b
            X.0Pg6 r2 = r0.getImmutableData()
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C646000PVm.LJII(androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner):X.0Pg6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static C650950Pg5 LJIIIZ(Fragment fragment, LifecycleOwner lifecycleOwner) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Fragment fragmentLJJJ;
        Fragment fragmentLIZIZ;
        C0PE2 c0pe2LJFF;
        ComponentCallbacks componentCallbacksLJFF = null;
        if (C650950Pg5.isEnabledP3) {
            boolean z = lifecycleOwner instanceof ContextWrapper;
            ?? LIZIZ = lifecycleOwner;
            if (z) {
                LIZIZ = C1388190mED.LIZIZ((Context) lifecycleOwner);
            }
            if (LIZIZ instanceof C19EG) {
                SAFHelper.LIZ.getClass();
                if (SAFHelper.LJJJJL((Activity) LIZIZ, fragment)) {
                    if (fragment != 0 && (c0pe2LJFF = C0PHF.LJFF(fragment)) != null) {
                        fragmentLJJJ = C0PHF.LIZ(c0pe2LJFF);
                    } else {
                        fragmentLJJJ = null;
                    }
                    if (C1210904oV.LIZ()) {
                        if (fragmentLJJJ == null) {
                            if (fragment == 0 || (fragmentLIZIZ = C0PHE.LIZIZ(fragment)) == null) {
                                fragmentLJJJ = SAFHelper.LJJJ((C19EG) LIZIZ);
                            } else {
                                fragmentLJJJ = fragmentLIZIZ;
                            }
                        }
                    } else if (fragmentLJJJ == null) {
                        if (fragment != 0) {
                            Context context = fragment.getContext();
                            if (context != null) {
                                componentCallbacksLJFF = SAFExtensionKt.LJFF(context);
                            }
                            if (!C294780Bgy.LIZ() ? !(!(componentCallbacksLJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacksLJFF).getEnableSAF()) : (componentCallbacksLJFF instanceof InterfaceC214897198d)) {
                                while (true) {
                                    if (fragment instanceof InterfaceC214902198i) {
                                        Object obj = (InterfaceC214902198i) fragment;
                                        if (obj == null || (fragmentLIZIZ = (Fragment) obj) == null) {
                                            break;
                                        }
                                    } else {
                                        fragment = fragment.getParentFragment();
                                        if (fragment == 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        SAFHelper.LIZ.getClass();
                        fragmentLJJJ = SAFHelper.LJJJ((C19EG) LIZIZ);
                    }
                    return LJIIJ(fragmentLJJJ);
                }
            }
            return LJIIJ(LIZIZ);
        }
        boolean z2 = lifecycleOwner instanceof ContextWrapper;
        ?? LIZIZ2 = lifecycleOwner;
        if (z2) {
            LIZIZ2 = C1388190mED.LIZIZ((Context) lifecycleOwner);
        }
        if (LIZIZ2 == 0) {
            return null;
        }
        try {
            InterfaceC665370Q7z interfaceC665370Q7zLJIILIIL = LJIILIIL(LIZIZ2);
            if (interfaceC665370Q7zLJIILIIL == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIILIIL, "source_default_key", C650950Pg5.class, null)) == null) {
                return null;
            }
            return (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0PRW LJIIJJI(androidx.fragment.app.Fragment r3, X.C19EG r4) {
        /*
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            boolean r0 = X.C650950Pg5.isEnabledP3
            if (r0 == 0) goto L8a
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJL(r4, r3)
            if (r0 == 0) goto L8a
            if (r3 == 0) goto L88
            X.0PE2 r0 = X.C0PHF.LJFF(r3)
            if (r0 == 0) goto L88
            androidx.fragment.app.Fragment r0 = X.C0PHF.LIZ(r0)
        L1f:
            boolean r1 = X.C1210904oV.LIZ()
            if (r1 == 0) goto L42
            if (r0 != 0) goto L33
            if (r3 == 0) goto L2f
            androidx.fragment.app.Fragment r0 = X.C0PHE.LIZIZ(r3)
            if (r0 != 0) goto L33
        L2f:
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
        L33:
            X.0Pg5 r0 = LJIIJ(r0)
            if (r0 == 0) goto L41
            X.0PSJ r0 = r0.getMutableData()
            if (r0 == 0) goto L41
            X.0PRW r2 = r0.fragmentData
        L41:
            return r2
        L42:
            if (r0 != 0) goto L33
            if (r3 == 0) goto L5a
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L86
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L50:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L64
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L73
        L5a:
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0.getClass()
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJ(r4)
            goto L33
        L64:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L5a
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L73
            goto L5a
        L71:
            if (r3 == 0) goto L5a
        L73:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L81
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L5a
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r0 = r3
            if (r3 != 0) goto L33
            goto L5a
        L81:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L71
        L86:
            r1 = r2
            goto L50
        L88:
            r0 = r2
            goto L1f
        L8a:
            X.0Pg5 r0 = LJIIJ(r4)
            if (r0 == 0) goto L98
            X.0PSJ r0 = r0.getMutableData()
            if (r0 == 0) goto L98
            X.0PRW r2 = r0.fragmentData
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C646000PVm.LJIIJJI(androidx.fragment.app.Fragment, X.19EG):X.0PRW");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (r4 != null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(androidx.fragment.app.Fragment r4, androidx.lifecycle.LifecycleOwner r5, kotlin.jvm.functions.Function1 r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C646000PVm.LJIILJJIL(androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1):void");
    }
}
