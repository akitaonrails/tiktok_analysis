package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19620211pY extends C0FFE<DMGroupChatStickerModel> {
    public final Context LJIILIIL;
    public final DMGroupChatStickerModel LJIILJJIL;
    public final C0FFO LJIILL;
    public final LifecycleOwner LJIILLIIL;
    public final FrameLayout LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final void LJJIZ() {
        int iIntValue;
        if (this.LJIILJJIL.isAutoAdded()) {
            Integer numValueOf = Integer.valueOf(this.LJIIZILJ.getHeight());
            if (numValueOf.intValue() <= 0 && 0 == 0) {
                ViewGroup.LayoutParams layoutParams = this.LJIIZILJ.getLayoutParams();
                if (layoutParams != null) {
                    Integer numValueOf2 = Integer.valueOf(layoutParams.height);
                    if (numValueOf2.intValue() > 0) {
                        iIntValue = numValueOf2.intValue();
                    }
                }
                C21637819mC c21637819mC = (C21637819mC) this.LJIJ.LIZJ(C13LE.LIZ(C21637819mC.class));
                if (c21637819mC == null) {
                    return;
                }
                BaseStickerModel baseStickerModelLIZLLL = c21637819mC.LIZLLL(BaseStickerModel.copy$default(this.LJIILJJIL.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10000.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null));
                DMGroupChatStickerModel dMGroupChatStickerModel = this.LJIILJJIL;
                LJIIJJI(dMGroupChatStickerModel.copy(baseStickerModelLIZLLL, dMGroupChatStickerModel.groupInfo, dMGroupChatStickerModel.uiStyle, dMGroupChatStickerModel.useNewToolTip, dMGroupChatStickerModel.isAutoAdded, dMGroupChatStickerModel.eventTracking));
                return;
            }
            iIntValue = numValueOf.intValue();
            DMGroupChatStickerModel dMGroupChatStickerModel2 = this.LJIILJJIL;
            LJIIJJI(dMGroupChatStickerModel2.copy(BaseStickerModel.copy$default(dMGroupChatStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -(iIntValue / 4.0f), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), dMGroupChatStickerModel2.groupInfo, dMGroupChatStickerModel2.uiStyle, dMGroupChatStickerModel2.useNewToolTip, dMGroupChatStickerModel2.isAutoAdded, dMGroupChatStickerModel2.eventTracking));
        }
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<DMGroupChatStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILL;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        DMGroupChatStickerModel dMGroupChatStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof DMGroupChatStickerModel) && (dMGroupChatStickerModel = (DMGroupChatStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(dMGroupChatStickerModel, 843), true);
            LJJJLIIL(((DMGroupChatStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 842), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        DMGroupChatStickerModel dMGroupChatStickerModel = LJJJLL().LIZ;
        LJIIJJI(dMGroupChatStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), dMGroupChatStickerModel.groupInfo, dMGroupChatStickerModel.uiStyle, dMGroupChatStickerModel.useNewToolTip, dMGroupChatStickerModel.isAutoAdded, dMGroupChatStickerModel.eventTracking));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 91), true);
    }

    public C19620211pY(Context context, DMGroupChatStickerModel dMGroupChatStickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, C390420FSm c390420FSm, final Function0<? extends C0FT7> function0) {
        super(context, dMGroupChatStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = dMGroupChatStickerModel;
        this.LJIILL = c0ffo;
        this.LJIILLIIL = lifecycleOwner;
        this.LJIIZILJ = frameLayout;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1087));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1088));
        LJJJJ(frameLayout);
        C0FT7 c0ft7Invoke = function0.invoke();
        if (c0ft7Invoke != null) {
            final Class<DMGroupChatStickerModel> cls = DMGroupChatStickerModel.class;
            c0ft7Invoke.LJJZZI(new AbstractC19622511pv<DMGroupChatStickerModel>(cls) { // from class: X.11pX
                @Override // X.AbstractC19622511pv
                public final EnumC1466150oFx LJJIJLIJ() {
                    return EnumC1466150oFx.DM_GROUP_CHAT;
                }

                @Override // X.AbstractC19622511pv, X.C0FTB
                public final void LJIIJ(StickerModel stickerModel, String str) {
                    C0FT7 c0ft7Invoke2;
                    if ((stickerModel instanceof DMGroupChatStickerModel) && (c0ft7Invoke2 = function0.invoke()) != null) {
                        c0ft7Invoke2.LJLLLL(this);
                    }
                }

                @Override // X.AbstractC19622511pv
                public final void LJJIL(StickerModel stickerModel, int i) {
                    int i2;
                    DMGroupChatStickerModel dMGroupChatStickerModel2 = (DMGroupChatStickerModel) stickerModel;
                    if (dMGroupChatStickerModel2.getId() == this.LJJJLL().LIZ.getId()) {
                        if (i != 9) {
                            if (i == 10) {
                                IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
                                if (iGroupChatStickerApi != null) {
                                    C19620211pY c19620211pY = this;
                                    iGroupChatStickerApi.LIZJ(c19620211pY.LJIILIIL, true, new AwS608S0100000_29(c19620211pY, 841), "edit_group_chat_on_sticker", this.LJJJLL().LIZ.getEventTracking());
                                }
                                C1239520iMQ.LIZIZ("click_sticker_change_group_menu", dMGroupChatStickerModel2);
                                return;
                            }
                            return;
                        }
                        C19620611pc c19620611pc = EnumC19620411pa.Companion;
                        int uiStyle = this.LJJJLL().LIZ.getUiStyle();
                        c19620611pc.getClass();
                        EnumC19620411pa enumC19620411paLIZ = C19620611pc.LIZ(uiStyle);
                        InterfaceC2044707zh<EnumC19620411pa> entries = EnumC19620411pa.getEntries();
                        int iIndexOf = entries.indexOf(enumC19620411paLIZ);
                        if (iIndexOf == entries.size() - 1) {
                            i2 = 0;
                        } else {
                            i2 = iIndexOf + 1;
                        }
                        this.LJJJLL().LIZLLL(new AwS608S0100000_29(entries.get(i2), 839), true);
                        C1239520iMQ.LIZIZ("prop_change_style", dMGroupChatStickerModel2);
                    }
                }
            });
        }
    }
}
