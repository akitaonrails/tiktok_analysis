package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773800UXa implements InterfaceC773840UXe {
    public final List<EnumC1102750enp> LIZ;
    public final List<EnumC1102750enp> LIZIZ;
    public final C773830UXd LIZJ;
    public final Fragment LIZLLL;
    public final Function0<Unit> LJ;
    public C773810UXb LJFF;
    public FrameLayout LJI;
    public LinearLayout LJII;
    public LinearLayout LJIIIIZZ;
    public C21578619ce LJIIIZ;
    public C16F5 LJIIJ;
    public View LJIIJJI;
    public boolean LJIIL;
    public DataChannel LJIILIIL;

    @Override // X.InterfaceC773840UXe
    public final void LIZ(MotionEvent motionEvent) {
        View view;
        if (motionEvent.getAction() == 0 && !this.LJIIL && (view = this.LJIIJJI) != null) {
            view.setBackgroundColor(0);
        }
        C773810UXb c773810UXb = this.LJFF;
        if (c773810UXb != null) {
            c773810UXb.LL.remove(this);
        }
    }

    public final void LIZJ(DataChannel dataChannel) {
        this.LJIILIIL = dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, DismissToolbarPopEvent.class, new AwS591S0100000_12(this, 705));
            dataChannel.BQ2(this.LIZLLL, CppSeeDetailsClickEvent.class, new AwS591S0100000_12(this, 706));
        }
    }

    public final void LIZLLL(View view) {
        boolean z;
        EnumC1088900eRU enumC1088900eRU;
        Fragment fragment;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        C21578619ce c21578619ce;
        this.LJFF = (C773810UXb) view.findViewById(R.id.olp);
        if (!LiveHostSettingsUIConfig.enable()) {
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                C773810UXb c773810UXb = this.LJFF;
                if (c773810UXb != null) {
                    c773810UXb.setBackgroundResource(R.drawable.e_j);
                }
            } else {
                C773810UXb c773810UXb2 = this.LJFF;
                if (c773810UXb2 != null) {
                    c773810UXb2.setBackgroundResource(R.drawable.e_h);
                }
            }
        }
        this.LJI = (FrameLayout) view.findViewById(R.id.iiv);
        this.LJII = (LinearLayout) view.findViewById(R.id.btv);
        this.LJIIIIZZ = (LinearLayout) view.findViewById(R.id.uvi);
        this.LJIIIZ = (C21578619ce) view.findViewById(R.id.u3e);
        Context context = null;
        if (LiveHostSettingsUIConfig.enable() && (c21578619ce = this.LJIIIZ) != null) {
            ViewGroup.LayoutParams layoutParams = c21578619ce.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            } else {
                layoutParams = null;
            }
            C786410Ut5.o6(c21578619ce, layoutParams);
        }
        this.LJIIJ = (C16F5) view.findViewById(R.id.t92);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LJIILIIL);
        if (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" || ");
        sbLIZ.append(C0UIM.LJFF());
        C20441214yg.LIZIZ("KReddot", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1088880eRS interfaceC1088880eRSMn12 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LJIILIIL);
        if ((interfaceC1088880eRSMn12 != null && interfaceC1088880eRSMn12.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF()) {
            C500260Jjc.LLFFF(this.LJI);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("collapsable", true);
            C786410Ut5.LJJJI("entrance", "more_top", bundle);
            LiveInteractionFeaturesFragment liveInteractionFeaturesFragmentB01 = iRoomFunctionService.B01(bundle);
            if (liveInteractionFeaturesFragmentB01 != null && (fragment = this.LIZLLL) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LIZIZ(R.id.iiv, liveInteractionFeaturesFragmentB01);
                c19ehLJIIJ.LJIIJ();
            }
        }
        if (LiveHostSettingsUIConfig.enable()) {
            enumC1088900eRU = EnumC1088900eRU.ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST;
        } else {
            enumC1088900eRU = EnumC1088900eRU.ICON_TITLE_HORIZONTAL_ARROW_OPT;
        }
        EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.POPUP_BASIC;
        DataChannel dataChannel = this.LJIILIIL;
        LinearLayout linearLayout = this.LJII;
        if (linearLayout == null) {
            return;
        }
        enumC1088870eRR.createHolder(dataChannel, linearLayout, this.LIZ, enumC1088900eRU);
        EnumC1088870eRR enumC1088870eRR2 = EnumC1088870eRR.POPUP_SETTING;
        DataChannel dataChannel2 = this.LJIILIIL;
        LinearLayout linearLayout2 = this.LJIIIIZZ;
        if (linearLayout2 == null) {
            return;
        }
        enumC1088870eRR2.createHolder(dataChannel2, linearLayout2, this.LIZIZ, enumC1088900eRU);
        C16F5 c16f5 = this.LJIIJ;
        if (c16f5 != null) {
            Fragment fragment2 = this.LIZLLL;
            if (fragment2 != null) {
                context = fragment2.getContext();
            }
            String strLJIJI = C497740JfY.LJIJI(2131855396);
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(C497740JfY.LJIJI(2131841499));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLJIJI);
            sbLIZ3.append(strLIZIZ);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ3));
            C1119920fFW.LJ(context, spannableString, 0, strLJIJI.length(), 17, 6, 400);
            C1119920fFW.LJ(context, spannableString, strLJIJI.length(), spannableString.length(), 17, 6, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex3, context)), 0, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, new C521520Kco(context, this, 4), strLJIJI.length(), spannableString.length(), 17);
            c16f5.setText(spannableString);
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
        if (C1533950q1J.LJ(this.LIZJ.LIZ)) {
            C773810UXb c773810UXb3 = this.LJFF;
            if (c773810UXb3 != null) {
                c773810UXb3.LL.add(this);
            }
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 235));
        }
    }

    public static View LIZIZ(LinearLayout linearLayout, String str) {
        if (linearLayout == null) {
            return null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("childTag = ");
            sbLIZ.append(childAt.getTag());
            C20441214yg.LIZIZ("MoreSheet", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(childAt.getTag().toString(), str)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C773800UXa(List<? extends EnumC1102750enp> list, List<? extends EnumC1102750enp> list2, C773830UXd c773830UXd, Fragment fragment, Function0<Unit> function0) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = c773830UXd;
        this.LIZLLL = fragment;
        this.LJ = function0;
    }
}
