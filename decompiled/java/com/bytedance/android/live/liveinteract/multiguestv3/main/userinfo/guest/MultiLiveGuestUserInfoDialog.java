package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest;

import X.AbstractC923750a97;
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
import X.C500260Jjc;
import X.C500980Jkm;
import X.C781520UlC;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C921180a4y;
import X.C923760a98;
import X.C924790aAn;
import X.C924940aB2;
import X.C925770aCN;
import X.C926930aEF;
import X.C927600aFK;
import X.C929860aIy;
import X.C929890aJ1;
import X.C929910aJ3;
import X.C930540aK4;
import X.C948450amx;
import X.EnumC926600aDi;
import X.EnumC929870aIz;
import X.InterfaceC481310Iu9;
import X.InterfaceC925780aCO;
import X.InterfaceC954180awC;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiLiveGuestUserInfoDialog extends PreviewDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZzogLTclJyk8ZiI5LDwnZgg5JTs6BCw6LAgmLTY4HDw2OgwiLyAXISQgJig=";
    public ApplyDialogUICtrlCmd applyOptUICtrlCmd;
    public boolean enableDragDismiss;
    public boolean isPreviewDefault;
    public C925770aCN mApplyInfo;
    public AbstractC929640aIc mApplyPresenter;
    public EnumC926600aDi mApplyType;
    public Fragment mCurrentFragment;
    public WeakReference<AbstractC923750a97> mGuestPresenter;
    public View outerView;
    public PreviewDialogUICtrlCmd previewOptUICtrlCmd;
    public int scene;
    public static final C926930aEF Companion = new C926930aEF();
    public static final int $stable = 8;
    public String mSource = "permit";
    public final C01GW userInfoFragment$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 387));
    public final C01GW previewFragment$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 386));
    public final C01GW distributeParentFragment$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 385));
    public final long panelBeginTimestamp = System.currentTimeMillis();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final boolean RR() {
        return this.mApplyType == EnumC926600aDi.GO_LIVE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        EnumC926600aDi enumC926600aDi = this.mApplyType;
        EnumC926600aDi enumC926600aDi2 = EnumC926600aDi.GO_LIVE;
        C500980Jkm c500980Jkm = new C500980Jkm(enumC926600aDi != enumC926600aDi2 ? R.layout.g9o : R.layout.g9n);
        c500980Jkm.LIZJ = R.style.ahk;
        if (this.mApplyType != enumC926600aDi2) {
            c500980Jkm.LJFF = true;
        } else {
            c500980Jkm.LJIIL = new ColorDrawable(0);
            c500980Jkm.LJII = 80;
            c500980Jkm.LJ = !RR();
        }
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MultiGuestDataHolder multiGuestDataHolder;
        Fragment fragment = this.mCurrentFragment;
        if (fragment instanceof MultiGuestPreviewFragment) {
            ((MultiGuestPreviewFragment) fragment).dismiss();
            View view = ((MultiGuestPreviewFragment) this.mCurrentFragment).mPreviewBackground;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 61));
            }
        } else {
            super.dismiss();
        }
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()))) {
            C929860aIy.LIZ.LIZ(this);
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL() && PR() == 5 && !RR()) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                String str = "";
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
                Fragment fragment2 = this.mCurrentFragment;
                if (fragment2 instanceof MultiGuestPreviewFragment) {
                    str = ((MultiGuestPreviewFragment) fragment2).closeWay;
                } else if (fragment2 instanceof MultiGuestUserInfoFragment) {
                    str = ((MultiGuestUserInfoFragment) fragment2).closeWay;
                }
                C924940aB2.LIZ(liveEffect, j, z, z2, z3, str, System.currentTimeMillis() - this.panelBeginTimestamp, false, 0, "guest_icon");
            }
        }
        this.mApplyPresenter = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII())) ? new FrameLayout.LayoutParams(-1, -2) : super.getCustomLayoutParams();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C500980Jkm dialogParams;
        Fragment fragment = this.mCurrentFragment;
        if ((fragment instanceof LiveBaseFragment) && ((LiveBaseFragment) fragment).onBackPressed()) {
            return true;
        }
        if (((BaseFragment) this.previewFragment$delegate.getValue()).mStatusActive) {
            ((MultiGuestPreviewFragment) this.previewFragment$delegate.getValue()).gS();
            return true;
        }
        boolean zOnBackPressed = super.onBackPressed();
        if (!zOnBackPressed && (dialogParams = getDialogParams()) != null && !dialogParams.LJFF) {
            dismissAllowingStateLoss();
        }
        return zOnBackPressed;
    }

    public final Fragment NR() {
        return (RR() || this.isPreviewDefault) ? (Fragment) this.previewFragment$delegate.getValue() : (Fragment) this.userInfoFragment$delegate.getValue();
    }

    public final int PR() {
        C923760a98 c923760a98;
        int iLJIIJJI = C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ());
        WeakReference<AbstractC923750a97> weakReference = this.mGuestPresenter;
        AbstractC923750a97 abstractC923750a97 = weakReference != null ? weakReference.get() : null;
        if (!(abstractC923750a97 instanceof C923760a98) || (c923760a98 = (C923760a98) abstractC923750a97) == null) {
            return iLJIIJJI;
        }
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = c923760a98.LL.LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                return interfaceC954180awCLLJLL.LLJLLIL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return 0;
    }

    public static String OR(Fragment fragment) {
        if (fragment instanceof MultiGuestUserInfoFragment) {
            return "multi_guest_apply_preview_sub_info";
        }
        if (fragment instanceof MultiGuestPreviewFragment) {
            return "multi_guest_apply_preview_sub_preview";
        }
        if (fragment instanceof MultiGuestConnectDistributeParentFragment) {
            return "multi_guest_apply_preview_sub_distribute";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void SR(EnumC929870aIz enumC929870aIz) {
        LiveBaseFragment liveBaseFragment;
        InterfaceC481310Iu9 interfaceC481310Iu9;
        AbstractC929640aIc abstractC929640aIc;
        if (C500260Jjc.LJJIIZ(enumC929870aIz.getSource())) {
            this.mSource = enumC929870aIz.getSource();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchPage page = ");
        sbLIZ.append(enumC929870aIz);
        C20441214yg.LIZIZ("MultiLiveGuestUserInfoDialog", C2188811AlT.LIZIZ(sbLIZ));
        Fragment fragment = this.mCurrentFragment;
        int i = C929890aJ1.LIZ[enumC929870aIz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    liveBaseFragment = (MultiGuestConnectDistributeParentFragment) this.distributeParentFragment$delegate.getValue();
                } else {
                    throw new C1954807lC();
                }
            } else {
                liveBaseFragment = (MultiGuestPreviewFragment) this.previewFragment$delegate.getValue();
            }
        } else {
            C925770aCN c925770aCN = this.mApplyInfo;
            if (c925770aCN != null) {
                c925770aCN.LJFF = false;
            }
            ((MultiGuestUserInfoFragment) this.userInfoFragment$delegate.getValue()).US(this.mApplyType, this.mApplyInfo);
            ((MultiGuestUserInfoFragment) this.userInfoFragment$delegate.getValue()).enableDragDismiss = this.enableDragDismiss;
            liveBaseFragment = (MultiGuestUserInfoFragment) this.userInfoFragment$delegate.getValue();
        }
        C929860aIy.LIZ.LJIILL(getChildFragmentManager(), liveBaseFragment, OR(liveBaseFragment), OR(fragment), new AwS381S0200000_15(liveBaseFragment, this, 59));
        AbstractC929640aIc abstractC929640aIc2 = this.mApplyPresenter;
        if (abstractC929640aIc2 != null) {
            abstractC929640aIc2.LIZIZ();
        }
        this.mCurrentFragment = liveBaseFragment;
        if ((liveBaseFragment instanceof InterfaceC925780aCO) && (interfaceC481310Iu9 = (InterfaceC481310Iu9) liveBaseFragment) != null && (abstractC929640aIc = this.mApplyPresenter) != null) {
            abstractC929640aIc.LIZ(interfaceC481310Iu9);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        if (this.mApplyType == EnumC926600aDi.GO_LIVE) {
            this.outerView = view.findViewById(R.id.pw6);
            View view2 = null;
            if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()))) {
                View view3 = this.outerView;
                if (view3 == null) {
                    view3 = null;
                }
                C439101nJ.LJI(view3);
            } else {
                View view4 = this.outerView;
                if (view4 == null) {
                    view4 = null;
                }
                C12ES.LJIILL(0, view4);
            }
            View view5 = this.outerView;
            if (view5 != null) {
                view2 = view5;
            }
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 150), view2);
        }
        Fragment fragmentNR = NR();
        this.mCurrentFragment = fragmentNR;
        if (fragmentNR instanceof MultiGuestUserInfoFragment) {
            MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) fragmentNR;
            multiGuestUserInfoFragment.US(this.mApplyType, this.mApplyInfo);
            multiGuestUserInfoFragment.enableDragDismiss = this.enableDragDismiss;
        }
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C930540aK4.LJJIJ())) {
            C929860aIy.LIZ.LJIILL(getChildFragmentManager(), (LiveBaseFragment) fragmentNR, OR(fragmentNR), null, new AwS381S0200000_15((PreviewFragment) fragmentNR, this, 58));
        } else {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentNR);
            c19ehLJIIJ.LJIIIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DialogPageChannel.class, new C929910aJ3(this));
            dataChannel.BQ2(this, AnchorPermitGuestEvent.class, new AwS594S0100000_15(this, 460));
            dataChannel.BQ2(this, GuestReplyAnchorEvent.class, new AwS594S0100000_15(this, 461));
            dataChannel.BQ2(this, GuestJoinChannelWhenAnchorPermitEvent.class, new AwS594S0100000_15(this, 462));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        MultiGuestDataHolder multiGuestDataHolder;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder2;
        if (!NR().isAdded()) {
            try {
                super.show(fragmentManager, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL() && PR() == 5 && !RR()) {
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
