package com.bytedance.android.live.effect.music;

import X.C0IJT;
import X.C0U56;
import X.C0UBZ;
import X.C16F5;
import X.C19P4;
import X.C474500IjA;
import X.C497740JfY;
import X.C500980Jkm;
import X.C764410Tyh;
import X.C786390Ut3;
import X.C786410Ut5;
import X.InterfaceC766480U4w;
import Y.ACListenerS147S0100000_12;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.effect.music.LiveVolumeDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveVolumeDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCHELIOSk1LSY4ZyImOywvZwM6PiAaJiMmJSAIIC4/JyI=";
    public ConstraintLayout LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public C19P4 LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C19P4 MR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.oxe) : null;
            this.LLILZ = (C19P4) viewFindViewById;
        }
        return (C19P4) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gcw);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_MUSIC;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.dataChannel;
        C0UBZ c0ubz = C0UBZ.LL;
        int iLIZLLL = C0UBZ.LIZLLL();
        boolean zLIZLLL = Intrinsics.LIZLLL(InterfaceC766480U4w.LJJIJIIJI.LIZIZ(), LiveBgMusicDefaultVolumeSetting.INSTANCE.getValue());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_volume_select");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(iLIZLLL), "volume_value");
        if (zLIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_default_value");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.eu1);
            } else {
                viewFindViewById = null;
            }
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        viewFindViewById.getLayoutParams().height = (getResources().getDisplayMetrics().heightPixels * 34) / 100;
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.pvv);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = viewFindViewById3;
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 51), viewFindViewById3);
        C19P4 c19p4MR = MR();
        int iLJFF = C497740JfY.LJFF(R.color.a2c);
        int iLJFF2 = C497740JfY.LJFF(R.color.a2a);
        int iLJFF3 = C497740JfY.LJFF(R.color.a2b);
        c19p4MR.LLIZ = iLJFF;
        c19p4MR.LLIZLLLIL = iLJFF2;
        c19p4MR.LLLII = iLJFF3;
        c19p4MR.setUpUiColor(false);
        MR().LIZJ(200, 0, 0, true);
        C19P4 c19p4MR2 = MR();
        C0UBZ c0ubz = C0UBZ.LL;
        c19p4MR2.setPercent(C0UBZ.LIZLLL());
        MR().setOnLevelChangeListener(new C764410Tyh() { // from class: X.0U3a
            @Override // X.C19P8
            public final void LIZJ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("LiveVolumeDialog#AdjustPercentBar", C2188811AlT.LIZIZ(sbLIZ));
                C0UBZ c0ubz2 = C0UBZ.LL;
                C0UBZ.LJIILL(i);
                if (this.LIZ.getView() != null) {
                    LiveVolumeDialog liveVolumeDialog = this.LIZ;
                    try {
                        q0.LJJIFFI(liveVolumeDialog.MR(), C497740JfY.LJIJJ(2131840904, String.valueOf(liveVolumeDialog.MR().getPercent())));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.y19);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (C16F5) viewFindViewById4;
        }
        C786410Ut5.l8((C16F5) viewFindViewById4, new ACListenerS147S0100000_12(this, 52));
        View view5 = this.LLILLL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.y19);
            }
            this.LLILLL = (C16F5) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        q0.LJIJ(view5, new C786390Ut3(0));
    }
}
