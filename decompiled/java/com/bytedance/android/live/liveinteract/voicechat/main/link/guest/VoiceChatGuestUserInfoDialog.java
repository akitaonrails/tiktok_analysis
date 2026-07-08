package com.bytedance.android.live.liveinteract.voicechat.main.link.guest;

import X.AbstractC929640aIc;
import X.C01GW;
import X.C0UCF;
import X.C12ES;
import X.C1954807lC;
import X.C19EH;
import X.C20441214yg;
import X.C2188811AlT;
import X.C307001Gy;
import X.C439101nJ;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C921180a4y;
import X.C923650a8x;
import X.C924790aAn;
import X.C924940aB2;
import X.C925770aCN;
import X.C927600aFK;
import X.C929880aJ0;
import X.C929900aJ2;
import X.C930540aK4;
import X.C948450amx;
import X.EnumC926600aDi;
import X.EnumC929870aIz;
import Y.ACListenerS150S0100000_15;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatGuestUserInfoDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zzk8ISYpKicyHELIOSPGshKCY9ZiklJyR9LzApOjt9HiolKioQICQ4Djo2OzEZOiohASsqJgs6KSkjLg==";
    public AbstractC929640aIc LL;
    public WeakReference<C923650a8x> LLILLJJLI;
    public EnumC926600aDi LLILLL;
    public C925770aCN LLILZ;
    public LiveBaseFragment LLILZIL;
    public View LLILZLL;
    public final C01GW LLIZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 543));
    public final C01GW LLIZLLLIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 542));
    public final long LLJ = System.currentTimeMillis();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final VoiceChatUserInfoFragment MR() {
        return (VoiceChatUserInfoFragment) this.LLIZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        EnumC926600aDi enumC926600aDi = this.LLILLL;
        EnumC926600aDi enumC926600aDi2 = EnumC926600aDi.GO_LIVE;
        C500980Jkm c500980Jkm = new C500980Jkm(enumC926600aDi != enumC926600aDi2 ? R.layout.g9o : R.layout.g9n);
        c500980Jkm.LIZJ = R.style.ahk;
        if (this.LLILLL != enumC926600aDi2) {
            c500980Jkm.LJFF = true;
        } else {
            c500980Jkm.LJIIL = new ColorDrawable(0);
            c500980Jkm.LJII = 80;
            c500980Jkm.LJ = !(this.LLILLL == enumC926600aDi2);
        }
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        LiveBaseFragment liveBaseFragment = this.LLILZIL;
        if ((liveBaseFragment instanceof LiveBaseFragment) && liveBaseFragment.onBackPressed()) {
            return true;
        }
        boolean zOnBackPressed = super.onBackPressed();
        if (!zOnBackPressed && !getDialogParams().LJFF) {
            dismissAllowingStateLoss();
        }
        return zOnBackPressed;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MultiGuestDataHolder multiGuestDataHolder;
        super.dismiss();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL() && C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5 && this.LLILLL != EnumC926600aDi.GO_LIVE) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if (!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null) {
                return;
            }
            if (C924790aAn.LIZLLL().LJFF != null) {
                C0UCF c0ucf = new C0UCF(C924790aAn.LIZLLL().LJFF, "liveinteract", "", false);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiGuestSelectedStickerEvent.class, c0ucf);
                }
            }
            LiveEffect liveEffect = C924790aAn.LIZLLL().LJFF;
            long j = C924790aAn.LIZLLL().LJ;
            boolean z = !multiGuestDataHolder.LJIIIZ;
            boolean z2 = !multiGuestDataHolder.LJIIJ;
            boolean z3 = multiGuestDataHolder.LJIILL;
            LiveBaseFragment liveBaseFragment = this.LLILZIL;
            C924940aB2.LIZ(liveEffect, j, z, z2, z3, liveBaseFragment instanceof VoiceChatUserInfoFragment ? ((VoiceChatUserInfoFragment) liveBaseFragment).LLJLILLLLZIIL : "", System.currentTimeMillis() - this.LLJ, false, 0, "guest_icon");
        }
    }

    public final void NR(EnumC929870aIz enumC929870aIz) {
        LiveBaseFragment liveBaseFragmentMR;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchPage page = ");
        sbLIZ.append(enumC929870aIz);
        C20441214yg.LIZIZ("VoiceChatGuestUserInfoDialog", C2188811AlT.LIZIZ(sbLIZ));
        LiveBaseFragment liveBaseFragment = this.LLILZIL;
        int i = C929880aJ0.LIZ[enumC929870aIz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    liveBaseFragmentMR = MR();
                } else {
                    throw new C1954807lC();
                }
            } else {
                liveBaseFragmentMR = (LiveBaseFragment) this.LLIZLLLIL.getValue();
            }
        } else {
            C925770aCN c925770aCN = this.LLILZ;
            if (c925770aCN != null) {
                c925770aCN.LJFF = false;
            }
            VoiceChatUserInfoFragment voiceChatUserInfoFragmentMR = MR();
            EnumC926600aDi enumC926600aDi = this.LLILLL;
            C925770aCN c925770aCN2 = this.LLILZ;
            voiceChatUserInfoFragmentMR.LLJILLL = enumC926600aDi;
            voiceChatUserInfoFragmentMR.LLJJIII = c925770aCN2;
            MR().getClass();
            liveBaseFragmentMR = MR();
        }
        if (liveBaseFragmentMR != null && !Intrinsics.LJFF(liveBaseFragment, liveBaseFragmentMR)) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJ(R.anim.h9, R.anim.hd);
            if (liveBaseFragment != null) {
                c19ehLJIIJ.LJIILL(liveBaseFragment);
            }
            if (liveBaseFragmentMR.isAdded()) {
                c19ehLJIIJ.LJJIFFI(liveBaseFragmentMR);
            } else {
                c19ehLJIIJ.LIZIZ(R.id.iiv, liveBaseFragmentMR);
            }
            c19ehLJIIJ.LJIIJ();
        }
        this.LLILZIL = liveBaseFragmentMR;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        if (this.LLILLL == EnumC926600aDi.GO_LIVE) {
            View viewFindViewById = view.findViewById(R.id.pw6);
            this.LLILZLL = viewFindViewById;
            View view2 = null;
            if (viewFindViewById == null) {
                viewFindViewById = null;
            }
            C439101nJ.LJI(viewFindViewById);
            View view3 = this.LLILZLL;
            if (view3 == null) {
                view3 = null;
            }
            C12ES.LJIILL(0, view3);
            View view4 = this.LLILZLL;
            if (view4 != null) {
                view2 = view4;
            }
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 167), view2);
        }
        VoiceChatUserInfoFragment voiceChatUserInfoFragmentMR = MR();
        this.LLILZIL = voiceChatUserInfoFragmentMR;
        if (voiceChatUserInfoFragmentMR instanceof VoiceChatUserInfoFragment) {
            EnumC926600aDi enumC926600aDi = this.LLILLL;
            C925770aCN c925770aCN = this.LLILZ;
            voiceChatUserInfoFragmentMR.LLJILLL = enumC926600aDi;
            voiceChatUserInfoFragmentMR.LLJJIII = c925770aCN;
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.iiv, voiceChatUserInfoFragmentMR);
        c19ehLJIIJ.LJIIIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DialogPageChannel.class, new C929900aJ2(this));
            dataChannel.BQ2(this, AnchorPermitGuestEvent.class, new AwS594S0100000_15(this, 566));
            dataChannel.BQ2(this, GuestReplyAnchorEvent.class, new AwS594S0100000_15(this, 567));
            dataChannel.BQ2(this, GuestJoinChannelWhenAnchorPermitEvent.class, new AwS594S0100000_15(this, 568));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        MultiGuestDataHolder multiGuestDataHolder;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder2;
        if (!MR().isAdded()) {
            try {
                super.show(fragmentManager, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL() && C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5 && this.LLILLL != EnumC926600aDi.GO_LIVE) {
            C948450amx c948450amx = C948450amx.LIZIZ;
            Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                Object objLJIIIZ2 = c948450amx.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
                if (!(objLJIIIZ2 instanceof MultiGuestDataHolder) || (multiGuestDataHolder2 = (MultiGuestDataHolder) objLJIIIZ2) == null || (str2 = multiGuestDataHolder2.LJJLIIIJILLIZJL) == null) {
                    str2 = "";
                }
                C924940aB2.LIZJ(str2, "guest_icon", "", C924790aAn.LIZLLL().LJFF, C924790aAn.LIZLLL().LJ, !multiGuestDataHolder.LJIIIZ, !multiGuestDataHolder.LJIIJ, multiGuestDataHolder.LJIILL, false, 0);
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
