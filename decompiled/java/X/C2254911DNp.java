package X;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2254911DNp extends FrameLayout implements C1DL9 {
    public C19GS LL;
    public boolean LLILLJJLI;
    public final C2254981DNw LLILLL;
    public final C2254921DNq LLILZ;
    public final C2254901DNo LLILZIL;

    @Override // X.C1DL9
    public final void onDestroy() {
        C2254921DNq c2254921DNq = this.LLILZ;
        for (Map.Entry<Class<?>, InterfaceC2254971DNv<?>> entry : c2254921DNq.LIZJ.entrySet()) {
            Class<?> key = entry.getKey();
            InterfaceC2254971DNv<?> value = entry.getValue();
            if (!c2254921DNq.LIZLLL.contains(key)) {
                value.onDestroy();
            }
        }
    }

    @Override // X.C1DL9
    public C1DLB getCkCameraViewLikeFunction() {
        return this.LLILZIL;
    }

    @Override // X.C1DL9
    public InterfaceC2254931DNr getFunctionApiMgr() {
        return this.LLILZ;
    }

    @Override // X.C1DL9
    public final void LIZIZ(C19GS c19gs) {
        this.LL = c19gs;
        C2254901DNo c2254901DNo = this.LLILZIL;
        c2254901DNo.getClass();
        c2254901DNo.LIZIZ = new FrameLayout(c2254901DNo.LIZ.getContext());
        c2254901DNo.LIZJ = new FrameLayout(c2254901DNo.LIZ.getContext());
        c2254901DNo.LIZLLL = new FrameLayout(c2254901DNo.LIZ.getContext());
        C2254911DNp c2254911DNp = c2254901DNo.LIZ;
        FrameLayout frameLayout = c2254901DNo.LIZIZ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        c2254911DNp.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C2254911DNp c2254911DNp2 = c2254901DNo.LIZ;
        FrameLayout frameLayout3 = c2254901DNo.LIZJ;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        c2254911DNp2.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        C2254911DNp c2254911DNp3 = c2254901DNo.LIZ;
        FrameLayout frameLayout4 = c2254901DNo.LIZLLL;
        if (frameLayout4 != null) {
            frameLayout2 = frameLayout4;
        }
        c2254911DNp3.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DNw] */
    public C2254911DNp(C19GS c19gs, AttributeSet attributeSet, int i) {
        super(c19gs, attributeSet, i);
        this.LLILLL = new InterfaceC2238351CjB() { // from class: X.1DNw
            @Override // X.InterfaceC2238351CjB
            public final C19GS getActivity() {
                C19GS c19gs2 = this.LIZ.LL;
                if (c19gs2 == null) {
                    return null;
                }
                return c19gs2;
            }

            @Override // X.InterfaceC2238351CjB
            public final C2254911DNp LIZ() {
                return this.LIZ;
            }
        };
        this.LLILZ = new C2254921DNq(new AwS579S0100000_35(this, 416), new AwS579S0100000_35(this, 417));
        this.LLILZIL = new C2254901DNo(this);
    }
}
