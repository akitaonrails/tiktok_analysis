package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment;

import X.C0JDJ;
import X.C20736316Cj;
import X.C465220IMe;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseTextHeaderSheetFragment extends BaseSheetFragment implements C0JDJ {
    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    public BaseTextHeaderSheetFragment(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c_u, context);
    }
}
