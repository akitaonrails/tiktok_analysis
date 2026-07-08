package X;

import Y.ARunnableS131S0100000_31;
import Y.ATListenerS350S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.16AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16AZ extends C214906198m {
    public final View LL;
    public final SessionInfo LLILLJJLI;
    public final InterfaceC1631620sYq<View, Activity, SessionInfo, Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public final View LLIZ;
    public final ImageView LLIZLLLIL;
    public final TuxIconView LLJ;
    public final boolean LLJI;
    public final BPEAHandler LLJIJIL;
    public final ARunnableS131S0100000_31 LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public C16AX LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;

    public final List<C21647019ng> LJJIIJ() {
        this.LLIZ.setPivotY(r1.getHeight());
        View view = this.LLIZ;
        view.setPivotX(view.getPivotX() + this.LLJJIJIL);
        C21647019ng c21647019ng = new C21647019ng(this.LLIZ.getContext(), this.LLIZ, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(986.96f), new C1342130l1v(62.83f)), C1697810uHb.LJIIJJI(new C19746412Nq("popupShrinkX", new C0HIW(1.0f, 0.0f)), new C19746412Nq("popupShrinkY", new C0HIX(1.0f, 0.0f)))), false);
        c21647019ng.LIZJ("popupShrinkX", new C16HY(this, 3));
        Context context = this.LL.getContext();
        View view2 = this.LL;
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.POP;
        C21647019ng c21647019ng2 = new C21647019ng(context, view2, new C19746312Np(enumC19746112Nn, new C621560OZm(new C1342130l1v(5.0f), new C1342130l1v(20.0f)), C1697810uHb.LJIIJJI(new C19746412Nq("iconShrinkX", new C0HIW(1.0f, 0.8f)), new C19746412Nq("iconShrinkY", new C0HIX(1.0f, 0.8f)))), false);
        c21647019ng2.LIZLLL(100L);
        C21647019ng c21647019ng3 = new C21647019ng(this.LL.getContext(), this.LL, new C19746312Np(enumC19746112Nn, new C621560OZm(new C1342130l1v(5.0f), new C1342130l1v(20.0f)), C1697810uHb.LJIIJJI(new C19746412Nq("iconExpandX", new C0HIW(0.8f, 1.0f)), new C19746412Nq("iconExpandY", new C0HIX(0.8f, 1.0f)))), false);
        c21647019ng3.LIZLLL(250L);
        return C1697810uHb.LJIIJJI(c21647019ng, c21647019ng2, c21647019ng3);
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        EventBus.LIZLLL().LJJI(this);
        this.LLJJ = C16AX.DISMISSED;
        this.LLJIJIL.removeCallbacks(this.LLJILJIL);
        this.LLILZ.invoke();
    }

    @C14EU
    public final void onEvent(C2040107yx c2040107yx) {
        dismiss();
    }

    public final C21616519il LJJIIJZLJL(final float f, final float f2, InterfaceC1427630nFp interfaceC1427630nFp) {
        C21616519il c21616519il = new C21616519il(this, new AbstractC20731716Ap<PopupWindow>() { // from class: X.16Ad
            public float LIZ;

            @Override // X.AbstractC20731716Ap
            public final float LIZ(PopupWindow popupWindow) {
                return this.LIZ;
            }

            @Override // X.AbstractC20731716Ap
            public final void LIZIZ(float f3, Object obj) {
                PopupWindow popupWindow = (PopupWindow) obj;
                this.LIZ = f3;
                if (popupWindow != null) {
                    float f4 = f;
                    popupWindow.update((int) (f4 + ((f2 - f4) * f3)), (int) this.LLJJIII, -1, -1);
                }
            }
        }, 1.0f);
        c21616519il.LJJ.LIZIZ(438.65f);
        c21616519il.LJJ.LIZ(1.00004f);
        c21616519il.LJI(0.0f);
        c21616519il.LIZ = 0.0f;
        c21616519il.LJIIIZ = 0.1f;
        c21616519il.LIZIZ(interfaceC1427630nFp);
        return c21616519il;
    }

    public C16AZ(View view, SessionInfo sessionInfo, C457480Hwo c457480Hwo, C457500Hwq c457500Hwq) {
        int iIntValue;
        int iArgb;
        super(view.getContext());
        this.LL = view;
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = c457480Hwo;
        this.LLILZ = c457500Hwq;
        this.LLILZIL = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ARunnableS131S0100000_31(this, 151);
        this.LLJJ = C16AX.NO_ACTION;
        Context context = view.getContext();
        this.LLJI = C426750GoL.LIZLLL(context);
        setContentView(C786410Ut5.Sd(R.layout.cet, (LayoutInflater) C786410Ut5.H2(context, "layout_inflater"), null));
        setBackgroundDrawable(null);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLJILJILJ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ2 != null) {
            iArgb = numLIZJ2.intValue();
        } else {
            iArgb = Color.argb(C814420VxA.LIZ(30.599999999999998d), 0, 0, 0);
        }
        this.LLJILLL = iArgb;
        View viewFindViewById = getContentView().findViewById(R.id.k6e);
        this.LLIZ = viewFindViewById;
        setClippingEnabled(false);
        setOutsideTouchable(true);
        this.LLIZLLLIL = (ImageView) getContentView().findViewById(R.id.k6f);
        this.LLJ = (TuxIconView) getContentView().findViewById(R.id.k6h);
        setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
        setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145)));
        viewFindViewById.setOnTouchListener(new ATListenerS350S0200000_31(context, this, 0));
    }
}
