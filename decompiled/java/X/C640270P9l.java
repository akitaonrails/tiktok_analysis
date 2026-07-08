package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;

/* JADX INFO: renamed from: X.0P9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640270P9l {
    public static SearchEnterViewModel LIZ(Fragment fragment, C19EG c19eg) {
        if (c19eg == null) {
            return new SearchEnterViewModel();
        }
        if (C07H6.LIZ()) {
            SAFHelper.LIZ.getClass();
            if (SAFHelper.LJJJJL(c19eg, fragment) && fragment != null && fragment.getActivity() == null) {
                return new SearchEnterViewModel();
            }
        }
        SearchEnterViewModel searchEnterViewModel = (SearchEnterViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchEnterViewModel.class);
        if (searchEnterViewModel.LL == null) {
            searchEnterViewModel.LL = LIZJ(fragment, c19eg);
        }
        return searchEnterViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0QER LIZIZ(android.view.View r5, X.C19EG r6) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C640270P9l.LIZIZ(android.view.View, X.19EG):X.0QER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0QER LIZJ(androidx.fragment.app.Fragment r4, X.C19EG r5) {
        /*
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r2 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            if (r4 == 0) goto L1c
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L4d
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L12:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L31
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L3e
        L1c:
            r1 = r3
        L1d:
            r2.getClass()
            java.lang.Integer r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJIIJI(r1, r5)
            java.util.Map<java.lang.Integer, X.0QER> r0 = com.ss.android.ugc.aweme.search.model.SearchEnterViewModel.LLILLJJLI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            X.0QER r0 = (X.C0QER) r0
            if (r0 == 0) goto L4f
            return r0
        L31:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1c
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L3e
            goto L1c
        L3e:
            r1 = r4
        L3f:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L46
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L1d
        L46:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L1c
            goto L3f
        L4d:
            r1 = r3
            goto L12
        L4f:
            boolean r0 = X.C07H6.LIZ()
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJL(r5, r4)
            if (r0 == 0) goto L69
            if (r4 == 0) goto L69
            X.19EG r0 = r4.getActivity()
            if (r0 != 0) goto L69
            return r3
        L69:
            androidx.lifecycle.ViewModelProvider r1 = X.C679340Qkm.LIZIZ(r4, r5)
            java.lang.Class<com.ss.android.ugc.aweme.search.model.SearchEnterViewModel> r0 = com.ss.android.ugc.aweme.search.model.SearchEnterViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = (com.ss.android.ugc.aweme.search.model.SearchEnterViewModel) r0
            X.0QER r0 = r0.LL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C640270P9l.LIZJ(androidx.fragment.app.Fragment, X.19EG):X.0QER");
    }
}
