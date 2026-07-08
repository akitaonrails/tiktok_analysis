package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933720aPC implements InterfaceC933750aPF {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public AbstractC939840aZ4 LIZJ;
    public C933460aOm LIZLLL;
    public final C01GW LJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 4));
    public final C01GW LJFF = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 3));

    @Override // X.InterfaceC933750aPF
    public final void LIZLLL(Function0 function0, Function1 function1, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC933750aPF
    public final void onDetach() {
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZ(AbstractC939840aZ4 abstractC939840aZ4) {
        this.LIZJ = abstractC939840aZ4;
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZIZ(C933460aOm c933460aOm) {
        this.LIZLLL = c933460aOm;
    }

    public C933720aPC(C933730aPD c933730aPD, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = c933730aPD;
    }

    @Override // X.InterfaceC933750aPF
    public final void LIZJ(Function0 function0, Function1 function1) {
        ImageModel avatarThumb;
        AbstractC939840aZ4 abstractC939840aZ4;
        C1324720kZq c1324720kZq;
        User user;
        C933460aOm c933460aOm = this.LIZLLL;
        if (c933460aOm != null && (user = c933460aOm.LIZ) != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        if (avatarThumb != null && (abstractC939840aZ4 = this.LIZJ) != null && (c1324720kZq = (C1324720kZq) abstractC939840aZ4.findViewById(R.id.qt3)) != null) {
            AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(avatarThumb, c1324720kZq, 0);
            if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                if (c1324720kZq.isLaidOut() && !c1324720kZq.isLayoutRequested()) {
                    awS416S0200000_15.invoke();
                } else {
                    c1324720kZq.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS416S0200000_15, 0));
                }
            } else {
                awS416S0200000_15.invoke();
            }
        }
        AbstractC939840aZ4 abstractC939840aZ42 = this.LIZJ;
        if (abstractC939840aZ42 != null) {
            View viewFindViewById = abstractC939840aZ42.findViewById(R.id.jfk);
            if (viewFindViewById != null) {
                C786410Ut5.I7((View.OnClickListener) this.LJ.getValue(), viewFindViewById);
                float width = abstractC939840aZ42.getWidth() * 0.8f;
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams instanceof C19ME) {
                    ((C19ME) layoutParams).matchConstraintMaxWidth = (int) width;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                }
            }
            View viewFindViewById2 = abstractC939840aZ42.findViewById(R.id.qt3);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7((View.OnClickListener) this.LJFF.getValue(), viewFindViewById2);
            }
        }
    }
}
