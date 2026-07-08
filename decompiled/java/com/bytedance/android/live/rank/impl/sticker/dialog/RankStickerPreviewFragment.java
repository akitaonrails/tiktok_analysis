package com.bytedance.android.live.rank.impl.sticker.dialog;

import X.C098200Yq;
import X.C1119060fE8;
import X.C1685300txQ;
import X.C16F5;
import X.C16FV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21411818qq;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public final class RankStickerPreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjY4HELIOSICw4LTdiLSYyJCorZx0yJi4fPSYwIyA+GT02PiwpPgkhKSIhLCEn";
    public final DataChannel LL;
    public final RankTypeV2 LLILLJJLI;
    public final String LLILLL;
    public C21411818qq LLILZ;
    public C16F5 LLILZIL;
    public C16FV LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C1119060fE8 LLJ = new C1119060fE8();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLIZLLLIL = false;
        super.onDestroyView();
    }

    public final C21411818qq NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bev) : null;
            this.LLILZ = (C21411818qq) viewFindViewById;
        }
        return (C21411818qq) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.sticker.dialog.RankStickerPreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public RankStickerPreviewFragment(RankTypeV2 rankTypeV2, DataChannel dataChannel, String str) {
        this.LL = dataChannel;
        this.LLILLJJLI = rankTypeV2;
        this.LLILLL = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g_z, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
