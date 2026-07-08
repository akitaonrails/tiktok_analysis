package X;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ezi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110120ezi extends AbstractC518790KWf {
    public final DataChannel LIZ;
    public final EnumC773890UXj LIZIZ;
    public final InterfaceC1103130eoR LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 579));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 578));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(this, 577));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 576));
    public C0N1P LJII = C0N1P.NONE;
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public final C1143920fsE LJIIIZ;

    public final C1324720kZq LJFF() {
        return (C1324720kZq) this.LJ.getValue();
    }

    public final void LJI() {
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        this.LJII = C0N1P.NONE;
        View view = (View) this.LJI.getValue();
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    public final void LJII() {
        TextView textView;
        C1331070kk5 hierarchy;
        TextView textView2;
        if (this.LIZIZ == EnumC773890UXj.SINGLE) {
            InterfaceC1103130eoR interfaceC1103130eoR = this.LIZJ;
            if (interfaceC1103130eoR != null && (textView2 = (TextView) interfaceC1103130eoR.findViewById(R.id.y7s)) != null) {
                textView2.setText(C497740JfY.LJIJI(2131844495));
            }
        } else {
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LIZJ;
            if (interfaceC1103130eoR2 != null && (textView = (TextView) interfaceC1103130eoR2.findViewById(R.id.y7s)) != null) {
                textView.setText(C497740JfY.LJIJI(2131842196));
            }
        }
        View view = (View) this.LIZLLL.getValue();
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        C1324720kZq c1324720kZqLJFF = LJFF();
        if (c1324720kZqLJFF != null) {
            C500260Jjc.LJIILIIL(c1324720kZqLJFF);
        }
        View view2 = (View) this.LJFF.getValue();
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        View view3 = (View) this.LJI.getValue();
        if (view3 != null) {
            C500260Jjc.LJIILIIL(view3);
        }
        C1324720kZq c1324720kZqLJFF2 = LJFF();
        if (c1324720kZqLJFF2 != null && (hierarchy = c1324720kZqLJFF2.getHierarchy()) != null) {
            hierarchy.LJIJI(0);
        }
        C1324720kZq c1324720kZqLJFF3 = LJFF();
        if (c1324720kZqLJFF3 != null) {
            this.LJIIIZ.LIZ = c1324720kZqLJFF3;
        }
    }

    public final void LJIIIIZZ() {
        AnimatedDrawable2 animatedDrawable2;
        AnimatedDrawable2 animatedDrawable22;
        Room room;
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this);
        }
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enableStrategy("AUDIENCE_INTERACTION_FEATURES")) {
            C1324720kZq c1324720kZqLJFF = LJFF();
            Drawable drawable = c1324720kZqLJFF != null ? c1324720kZqLJFF.getDrawable() : null;
            if ((drawable instanceof AnimatedDrawable2) && (animatedDrawable22 = (AnimatedDrawable2) drawable) != null) {
                animatedDrawable22.stop();
            }
            ImageView imageView = (ImageView) this.LJFF.getValue();
            Drawable drawable2 = imageView != null ? imageView.getDrawable() : null;
            if (!(drawable2 instanceof AnimatedDrawable2) || (animatedDrawable2 = (AnimatedDrawable2) drawable2) == null) {
                return;
            }
            animatedDrawable2.stop();
        }
    }

    @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
    public final void LIZ(C01C1 c01c1) {
        LJI();
    }

    public C1110120ezi(DataChannel dataChannel, EnumC773890UXj enumC773890UXj, InterfaceC1103130eoR interfaceC1103130eoR) {
        this.LIZ = dataChannel;
        this.LIZIZ = enumC773890UXj;
        this.LIZJ = interfaceC1103130eoR;
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJFF = false;
        c1143920fsE.LJIILIIL = true;
        c1143920fsE.LJ = new C1151950g5B(this, 5);
        this.LJIIIZ = c1143920fsE;
        new C1143920fsE();
        new C1151950g5B(this, 6);
    }
}
