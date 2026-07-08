package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;

/* JADX INFO: loaded from: classes16.dex */
public abstract class PreviewFragment extends LiveBaseFragment {
    public static final int $stable = 8;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }
}
