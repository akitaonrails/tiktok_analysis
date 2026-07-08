package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939610aYh extends AbstractC940410aZz implements LifecycleOwner {
    public int LLILZLL;
    public InterfaceC937900aVw LLIZ;
    public ConstraintLayout LLJ;
    public C19R8 LLJI;
    public TuxTextView LLJIJIL;
    public C939750aYv LLJILJIL;
    public View LLJILJILJ;
    public final String LLILZIL = "";
    public final LifecycleRegistry LLIZLLLIL = new LifecycleRegistry(this);

    @Override // X.AbstractC940410aZz
    public final int LIZIZ() {
        return R.layout.hdl;
    }

    @Override // X.AbstractC940410aZz
    public final void LIZLLL() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS115S0100000_15(this, 194));
        }
    }

    @Override // X.AbstractC940410aZz
    public final void LJ() {
        C939750aYv c939750aYv = this.LLJILJIL;
        if (c939750aYv != null) {
            c939750aYv.LJIIIIZZ();
        }
    }

    public final void LJIIIIZZ() {
        Context context;
        C939750aYv c939750aYv;
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null || (context = viewGroup.getContext()) == null || (c939750aYv = this.LLJILJIL) == null) {
            return;
        }
        View view = this.LLJILJILJ;
        if (view == null) {
            view = new View(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJILJILJ = view;
        c939750aYv.LIZIZ(view, viewGroup);
    }

    @Override // X.AbstractC940410aZz
    public final void LJI() {
        C939750aYv c939750aYv;
        super.LJI();
        if (C936720aU2.LIZIZ() && (c939750aYv = this.LLJILJIL) != null) {
            c939750aYv.LJIIIIZZ();
        }
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.AbstractC940410aZz
    public final String LIZ() {
        return this.LLILZIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC940410aZz
    public final void LIZJ(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout;
        C19R8 c19r8;
        String strLJIJI;
        if (C936720aU2.LIZIZ()) {
            this.LLJILJIL = new C939750aYv(this.LLILZLL, this.LLIZ, this.LLILZIL);
        }
        TuxTextView tuxTextView = null;
        if (viewGroup != null) {
            constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.dxb);
        } else {
            constraintLayout = null;
        }
        this.LLJ = constraintLayout;
        if (viewGroup != null) {
            c19r8 = (C19R8) viewGroup.findViewById(R.id.nil);
        } else {
            c19r8 = null;
        }
        this.LLJI = c19r8;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.tv_tag);
        }
        this.LLJIJIL = tuxTextView;
        this.LLIZLLLIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        TuxTextView tuxTextView2 = this.LLJIJIL;
        if (tuxTextView2 != null) {
            if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                strLJIJI = C497740JfY.LJIJI(2131854991);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131854020);
            }
            tuxTextView2.setText(strLJIJI);
        }
        if (C497740JfY.LJJ()) {
            ConstraintLayout constraintLayout2 = this.LLJ;
            if (constraintLayout2 != null) {
                constraintLayout2.setLayoutDirection(1);
            }
            C19R8 c19r82 = this.LLJI;
            if (c19r82 != null) {
                c19r82.setLayoutDirection(1);
            }
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextDirection(4);
            }
        }
        LJIIIIZZ();
    }

    public C939610aYh(int i, InterfaceC937900aVw interfaceC937900aVw) {
        this.LLILZLL = i;
        this.LLIZ = interfaceC937900aVw;
    }
}
