package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.16AR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16AR implements InterfaceC457470Hwn {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final SessionInfo LIZJ;
    public final InterfaceC1631620sYq<View, Activity, SessionInfo, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS131S0100000_31 LJI = new ARunnableS131S0100000_31(this, 47);
    public final int LJII = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 218));
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public LinearLayout LJIIL;
    public ImageView LJIILIIL;
    public C16AU LJIILJJIL;
    public boolean LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public float LJIJJ;

    public final List<C21647019ng> LIZIZ() {
        LinearLayout linearLayout = this.LJIIL;
        if (linearLayout == null) {
            return C13BV.INSTANCE;
        }
        linearLayout.setPivotY(linearLayout.getHeight());
        linearLayout.setPivotX(linearLayout.getPivotX() + this.LJIJJ);
        C21647019ng c21647019ng = new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(986.96f), new C1342130l1v(62.83f)), C1697810uHb.LJIIJJI(new C19746412Nq("popupShrinkX", new C0HIW(1.0f, 0.0f)), new C19746412Nq("popupShrinkY", new C0HIX(1.0f, 0.0f)))), false);
        c21647019ng.LIZJ("popupShrinkX", new C16HY(this, 2));
        View view = this.LIZIZ;
        Context context = view.getContext();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.POP;
        C21647019ng c21647019ng2 = new C21647019ng(context, view, new C19746312Np(enumC19746112Nn, new C621560OZm(new C1342130l1v(5.0f), new C1342130l1v(20.0f)), C1697810uHb.LJIIJJI(new C19746412Nq("iconShrinkX", new C0HIW(1.0f, 0.8f)), new C19746412Nq("iconShrinkY", new C0HIX(1.0f, 0.8f)))), false);
        c21647019ng2.LIZLLL(100L);
        View view2 = this.LIZIZ;
        C21647019ng c21647019ng3 = new C21647019ng(view2.getContext(), view2, new C19746312Np(enumC19746112Nn, new C621560OZm(new C1342130l1v(5.0f), new C1342130l1v(20.0f)), C1697810uHb.LJIIJJI(new C19746412Nq("iconExpandX", new C0HIW(0.8f, 1.0f)), new C19746412Nq("iconExpandY", new C0HIX(0.8f, 1.0f)))), false);
        c21647019ng3.LIZLLL(250L);
        return C1697810uHb.LJIIJJI(c21647019ng, c21647019ng2, c21647019ng3);
    }

    public final FrameLayout LIZJ() {
        return (FrameLayout) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC457470Hwn
    public final void dismiss() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(LIZJ(), viewGroup);
        }
        EventBus.LIZLLL().LJJI(this);
        this.LJIILJJIL = C16AU.DISMISSED;
        this.LJFF.removeCallbacks(this.LJI);
        this.LJ.invoke();
    }

    @C14EU
    public final void onEvent(C2040107yx c2040107yx) {
        dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
    @Override // X.InterfaceC457470Hwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.graphics.Bitmap r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16AR.LIZ(android.graphics.Bitmap, boolean):void");
    }

    public final C21647019ng LIZLLL(float f, float f2, InterfaceC21641019mi interfaceC21641019mi) {
        LinearLayout linearLayout = this.LJIIL;
        if (linearLayout != null) {
            C21647019ng c21647019ng = new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(41.89f)), Collections.singletonList(new C19746412Nq("popupTranslateX", new C082N(f, f2)))), false);
            c21647019ng.LIZJ("popupTranslateX", interfaceC21641019mi);
            return c21647019ng;
        }
        return null;
    }

    public C16AR(ViewGroup viewGroup, View view, SessionInfo sessionInfo, C457490Hwp c457490Hwp, C457510Hwr c457510Hwr) {
        int iIntValue;
        int iArgb;
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = sessionInfo;
        this.LIZLLL = c457490Hwp;
        this.LJ = c457510Hwr;
        this.LJIIIZ = C426750GoL.LIZLLL(view.getContext());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LJIIJ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
        if (numLIZJ2 != null) {
            iArgb = numLIZJ2.intValue();
        } else {
            iArgb = Color.argb(C814420VxA.LIZ(30.599999999999998d), 0, 0, 0);
        }
        this.LJIIJJI = iArgb;
        this.LJIILJJIL = C16AU.NO_ACTION;
    }
}
