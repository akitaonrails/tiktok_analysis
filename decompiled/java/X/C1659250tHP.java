package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659250tHP extends C1659140tHE implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C1DRG LLJJLIIIJLLLLLLLZ;
    public final C1664750tQH LLJL;
    public ViewStub LLJLIL;
    public final int LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659250tHP.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C1659250tHP() {
        throw null;
    }

    @Override // X.C1659140tHE
    public final int LJIJ() {
        return 0;
    }

    @Override // X.C1659140tHE
    public final boolean LJIL() {
        return false;
    }

    @Override // X.C1659140tHE
    public final int LJIIZILJ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        ViewParent parent;
        if ((i3Var.LLILLL.getType() == 25 || i3Var.LLILLL.getType() == 1200) && this.LLJIJIL == null) {
            ViewStub viewStub = this.LLJLIL;
            C0FJM c0fjm = null;
            if (viewStub != null) {
                parent = viewStub.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof ViewGroup) {
                ViewStub viewStub2 = this.LLJLIL;
                if (viewStub2 != null) {
                    C786410Ut5.LJLLLL(viewStub2);
                }
                View view = this.LLILZ;
                if (view != null) {
                    c0fjm = (C0FJM) view.findViewById(R.id.tzs);
                }
                this.LLJIJIL = c0fjm;
                C0FJM c0fjm2 = this.LLJIJIL;
                if (c0fjm2 != null) {
                    Integer numLIZ = C1308910kAL.LIZ(R.attr.a1h, c0fjm2.getContext());
                    if (numLIZ != null) {
                        c0fjm2.setProgressColor(numLIZ.intValue());
                    }
                    ViewGroup.LayoutParams layoutParams = c0fjm2.getLayoutParams();
                    if (layoutParams != null) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                        layoutParams.width = iLIZIZ;
                        layoutParams.height = iLIZIZ;
                        C786410Ut5.W5(c0fjm2, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
        }
        super.LIZJ(i3Var);
        if (i3Var.LLILLL.getType() == 1200) {
            ((InterfaceC1460000o62) this.LLJL.getValue(this, LLJLL[0])).Yq2();
        }
    }

    @Override // X.C1659140tHE, X.AbstractC1659350tHZ
    public final void LJIIJJI(View view) {
        super.LJIIJJI(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_progress);
        if (viewStub != null) {
            this.LLJLIL = viewStub;
        } else {
            this.LLJIJIL = (C0FJM) view.findViewById(R.id.tzs);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            C786410Ut5.W5(view, layoutParams);
            FrameLayout frameLayout = this.LLJILJIL;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    C786410Ut5.W5(frameLayout, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            SmartImageView smartImageViewLJIJI = LJIJI();
            ViewGroup.LayoutParams layoutParams3 = smartImageViewLJIJI.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5(smartImageViewLJIJI, layoutParams3);
                C337180DJs.LIZ(this.LLJJI);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public C1659250tHP(LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        super(lifecycleOwner, null, new C1659620tI0(new AwS569S0100000_25(c1drg, 446)));
        this.LLJJLIIIJLLLLLLLZ = c1drg;
        this.LLJL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }
}
