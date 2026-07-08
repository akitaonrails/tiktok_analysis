package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationConfirmWidgetAssem;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;

/* JADX INFO: renamed from: X.06w5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnLayoutChangeListenerC1767506w5 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1767506w5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1767506w5 viewOnLayoutChangeListenerC1767506w5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iLIZJ;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1767506w5);
        View view2 = null;
        Integer numValueOf = null;
        if (!((Boolean) ((BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0).LLJJI.getValue()).booleanValue() && !((BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0).UR().getState().LL) {
            BaseQuickChatRoomFragment baseQuickChatRoomFragment = (BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0;
            View view3 = baseQuickChatRoomFragment.LLJI;
            if (view3 == null) {
                view3 = null;
            }
            SessionInfo sessionInfo = baseQuickChatRoomFragment.LLIZLLLIL;
            if (sessionInfo != null) {
                numValueOf = Integer.valueOf(sessionInfo.getQuickChatViewType());
            }
            baseQuickChatRoomFragment.ZR(view3, numValueOf);
            return;
        }
        View view4 = ((BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0).LLJI;
        if (view4 == null) {
            view4 = null;
        }
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
            BaseQuickChatRoomFragment baseQuickChatRoomFragment2 = (BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0;
            baseQuickChatRoomFragment2.getClass();
            Rect rect = new Rect();
            View view5 = baseQuickChatRoomFragment2.LLJI;
            if (view5 == null) {
                view5 = null;
            }
            view5.getWindowVisibleDisplayFrame(rect);
            layoutParams.height = rect.bottom;
            C786410Ut5.W5(view4, layoutParams);
            BaseQuickChatRoomFragment baseQuickChatRoomFragment3 = (BaseQuickChatRoomFragment) viewOnLayoutChangeListenerC1767506w5.l0;
            View view6 = baseQuickChatRoomFragment3.LLJI;
            if (view6 != null) {
                view2 = view6;
            }
            if (((Number) baseQuickChatRoomFragment3.LLJJIII.getValue()).intValue() > 0) {
                iLIZJ = ((Number) baseQuickChatRoomFragment3.LLJJIII.getValue()).intValue();
            } else {
                iLIZJ = C497820Jfg.LIZJ(baseQuickChatRoomFragment3.requireContext());
            }
            view2.setPadding(view2.getPaddingLeft(), iLIZJ, view2.getPaddingRight(), view2.getPaddingBottom());
            baseQuickChatRoomFragment3.SR();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1767506w5 viewOnLayoutChangeListenerC1767506w5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width = ((StreakPetWidgetAssem) viewOnLayoutChangeListenerC1767506w5.l0).LJJIJL().getWidth();
        int height = ((StreakPetWidgetAssem) viewOnLayoutChangeListenerC1767506w5.l0).LJJIJL().getHeight();
        StreakPetWidgetAssem streakPetWidgetAssem = (StreakPetWidgetAssem) viewOnLayoutChangeListenerC1767506w5.l0;
        if (streakPetWidgetAssem.LLJLLIL == width && streakPetWidgetAssem.LLJLLL == height) {
            return;
        }
        streakPetWidgetAssem.LLJLLIL = width;
        streakPetWidgetAssem.LLJLLL = height;
        streakPetWidgetAssem.kp(streakPetWidgetAssem.LLJLILLLLZIIL, streakPetWidgetAssem.LLJLL);
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1767506w5 viewOnLayoutChangeListenerC1767506w5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        AssemVMLazy assemVMLazy = ((GroupCreationConfirmWidgetAssem) viewOnLayoutChangeListenerC1767506w5.l0).LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationConfirmWidgetAssem.LLJJJ;
        PublicGroupCreationVM publicGroupCreationVM = (PublicGroupCreationVM) assemVMLazy.getValue();
        if (publicGroupCreationVM.LLILLL == 0) {
            publicGroupCreationVM.LLILLL = iArr[1];
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1767506w5 viewOnLayoutChangeListenerC1767506w5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getWidth() > 0) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1767506w5);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) viewOnLayoutChangeListenerC1767506w5.l0;
            Integer numValueOf = Integer.valueOf(view.getWidth());
            C189200o6.m2constructorimpl(numValueOf);
            interfaceC20236714Gf.resumeWith(numValueOf);
        }
    }
}
