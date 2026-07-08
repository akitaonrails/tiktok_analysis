package X;

import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;

/* JADX INFO: renamed from: X.0P9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640210P9f {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer LIZ(android.view.View r5) {
        /*
            r3 = 0
            if (r5 == 0) goto Lb7
            android.content.Context r0 = r5.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L50
            X.198i r2 = r0.LIZLLL()
            if (r2 == 0) goto L50
        L13:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto Lb7
            X.19EG r0 = r2.getActivity()
            if (r0 == 0) goto Lb7
            androidx.lifecycle.ViewModelProvider r1 = X.C679340Qkm.LIZIZ(r2, r0)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel> r0 = com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel.class
            androidx.lifecycle.ViewModel r2 = r1.get(r0)
            com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel r2 = (com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel) r2
            if (r2 == 0) goto Lb6
            com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData r0 = r2.LLILZIL
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.discover.model.SearchActivityCardGradientConfig r0 = r0.getGradientConfig()
            if (r0 == 0) goto Lb5
            java.lang.Double r1 = r0.getEndPercent()
            if (r1 == 0) goto Lb5
            int r4 = r2.LL
            int r0 = r5.getMeasuredHeight()
            int r0 = r0 + r4
            double r2 = (double) r0
            double r0 = r1.doubleValue()
            double r2 = r2 * r0
            double r0 = (double) r4
            double r2 = r2 - r0
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L50:
            android.content.Context r0 = r5.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L7a
            android.content.Context r0 = r5.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L6d
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L7a
            return r3
        L6d:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto Lb7
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L7a
            return r3
        L7a:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r5)
            if (r2 == 0) goto Lb7
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L95
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L8a:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L97
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto La6
            return r3
        L95:
            r1 = r3
            goto L8a
        L97:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto Lb7
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto La6
            return r3
        La4:
            if (r2 == 0) goto Lb7
        La6:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto Lb0
            X.198i r2 = (X.InterfaceC214902198i) r2
            if (r2 == 0) goto Lb7
            goto L13
        Lb0:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto La4
        Lb5:
            return r3
        Lb6:
            return r3
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C640210P9f.LIZ(android.view.View):java.lang.Integer");
    }

    public static boolean LIZIZ(SearchActivityCardBgData searchActivityCardBgData) {
        if (searchActivityCardBgData != null) {
            Integer bgColorMode = searchActivityCardBgData.getBgColorMode();
            int mode = C0PGC.CUSTOM_GRADIENT_COLOR.getMode();
            if (bgColorMode != null && bgColorMode.intValue() == mode) {
                return true;
            }
            return false;
        }
        return false;
    }
}
