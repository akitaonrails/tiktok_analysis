package X;

import Y.ACListenerS118S0200000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestOpenAvatarPreviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936410aTX extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public boolean LLJI;
    public Long LLJIJIL;
    public View LLJILJIL;
    public LiveIconView LLJILJILJ;
    public C19487111Lx LLJILLL;
    public final C01GW LLJJ;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    private final Observer<C936030aSv> getGeneratingProgressObserver() {
        return (Observer) this.LLJJ.getValue();
    }

    public final MultiGuestDataHolder getDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    @Override // X.AbstractC939840aZ4
    public C940610aaJ getPriority() {
        return new C940610aaJ(80, 0, 2);
    }

    public final boolean LJIIJ() {
        RtcUserInfo rtcUserInfoG0;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        String str = null;
        String str2 = (posIdentity == null || posIdentity.type != 1) ? null : posIdentity.value;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) != null) {
            str = rtcUserInfoG0.linkMicId;
        }
        return Intrinsics.LJFF(str2, str);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.hte);
    }

    public final User getUser() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        List<C2262071DgL> listLJLZ;
        C2262071DgL c2262071DgL;
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (listLJLZ = c938230aWTLIZJ.LJ.LJLZ()) == null || !(!listLJLZ.isEmpty()) || (c2262071DgL = (C2262071DgL) C13LP.LJJJJZI(listLJLZ)) == null) {
            return null;
        }
        return c2262071DgL.LIZ;
    }

    public final Long getUserId() {
        User user = getUser();
        if (user != null) {
            return Long.valueOf(user.getId());
        }
        return null;
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IAvatarBusinessAbility iAvatarBusinessAbility;
        MutableLiveData mutableLiveDataHr2;
        super.onAttachedToWindow();
        if (LJIIJ() && C927560aFG.LIZ() && MultiGuestAvatarFeatureSetting.INSTANCE.hasUseAbility() && (interfaceC665370Q7z = (InterfaceC665370Q7z) getDataChannel().gg0(C956790b0P.class)) != null && (iAvatarBusinessAbility = (IAvatarBusinessAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IAvatarBusinessAbility.class, null)) != null && (mutableLiveDataHr2 = iAvatarBusinessAbility.Hr2()) != null) {
            mutableLiveDataHr2.observeForever(getGeneratingProgressObserver());
        }
        if (LJIIJ()) {
            getDataChannel().CQ2(MultiGuestOpenAvatarPreviewEvent.class, this, new AwS594S0100000_15(this, 1117));
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(C948810anX.LIZ(c938230aWTLIZJ.LJIILJJIL.LJJIFFI(), c938230aWTLIZJ.LIZJ.LJJIFFI()).LJJIJIIJIL(new AfS184S0100000_15(this, 229))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDataChannel().zQ2(this);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.AVATAR_TAG;
    }

    public final View LJIIIZ(boolean z) {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.op6);
        if (viewFindViewById == null) {
            return null;
        }
        if (viewFindViewById instanceof ViewStub) {
            if (!z) {
                return null;
            }
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
            LiveIconView liveIconView = (LiveIconView) viewLJLLLL.findViewById(R.id.op7);
            this.LLJILJILJ = liveIconView;
            if (liveIconView != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exb, viewLJLLLL.getContext()));
                gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(3.0f));
                liveIconView.setBackground(gradientDrawable);
            }
            C238400w2 c238400w2 = new C238400w2();
            View viewFindViewById2 = viewLJLLLL.findViewById(R.id.op8);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS118S0200000_15(c238400w2, this, 66), viewFindViewById2);
            }
            this.LLJILJIL = viewLJLLLL;
        }
        return this.LLJILJIL;
    }

    public final void LJIIJJI(long j) {
        String string;
        if (MultiGuestAvatarFeatureSetting.INSTANCE.hasSeeAbility() && !this.LLJI) {
            if (j > 0) {
                Long userId = getUserId();
                if (userId == null || (string = userId.toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                C924600aAU.LIZ("show", string);
                View viewLJIIIZ = LJIIIZ(true);
                if (viewLJIIIZ != null) {
                    C12ES.LJIILL(0, viewLJIIIZ);
                }
                LiveIconView liveIconView = this.LLJILJILJ;
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.djy);
                    return;
                }
                return;
            }
            View viewLJIIIZ2 = LJIIIZ(false);
            if (viewLJIIIZ2 == null) {
                return;
            }
            C439101nJ.LJI(viewLJIIIZ2);
        }
    }

    public final void setDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        this.dataHolder = multiGuestDataHolder;
    }

    public C936410aTX(Context context, DataChannel dataChannel, WeakReference<C938220aWS> weakReference, C957020b0m c957020b0m, InterfaceC940060aZQ interfaceC940060aZQ) {
        super(context, dataChannel, c957020b0m, interfaceC940060aZQ);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
        C948450amx.LIZIZ.LIZJ(this);
        this.LLJJ = C452501pT.LIZIZ(new AwS416S0200000_15(this, context, 113));
    }
}
