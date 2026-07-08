package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest;

import X.C19EH;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.ui.DismissListenerProxy;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestV3OuterSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyM6Ji5iICElITEpZygmLTY4ZwImJDElDjo2OzEaegAmPCA+Gic2LTEKOy40JSAiPQ==";
    public Fragment LLJLLL;
    public DismissListenerProxy LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final String j4() {
        return "multi_watch_linkedmic";
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<Integer, Unit> function1;
        DismissListenerProxy dismissListenerProxy = this.LLJZ;
        if (dismissListenerProxy != null && (function1 = dismissListenerProxy.callback) != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object parcelable;
        Fragment fragment;
        DismissListenerProxy dismissListenerProxy;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hdr, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelable = arguments.getParcelable(this.LLJL);
        } else {
            parcelable = null;
        }
        if (parcelable instanceof Fragment) {
            fragment = (Fragment) parcelable;
        } else {
            fragment = null;
        }
        this.LLJLLL = fragment;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            dismissListenerProxy = (DismissListenerProxy) arguments2.getParcelable("DismissListenerProxy");
        } else {
            dismissListenerProxy = null;
        }
        if (!(dismissListenerProxy instanceof DismissListenerProxy)) {
            dismissListenerProxy = null;
        }
        this.LLJZ = dismissListenerProxy;
        Fragment fragment2 = this.LLJLLL;
        if (fragment2 != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.ko2, fragment2, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return viewTd;
    }
}
