package com.bytedance.android.live.liveinteract.multihost.biz.link.contract;

import X.AbstractC963920bBu;
import X.C786410Ut5;
import X.C954460awe;
import Y.ACListenerS150S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostAuxStreamSwitchListFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class MultiCoHostAuxStreamSwitchListContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC963920bBu> {
    public abstract List<C954460awe> PR();

    public abstract void SR(List<C954460awe> list);

    public final View RR() {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        if (layoutInflaterNe != null) {
            View view = getView();
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hs6, view instanceof ViewGroup ? (ViewGroup) view : null, false);
            if (viewTd != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15((MultiCoHostAuxStreamSwitchListFragment) this, 158), viewTd);
                return viewTd;
            }
        }
        return null;
    }
}
