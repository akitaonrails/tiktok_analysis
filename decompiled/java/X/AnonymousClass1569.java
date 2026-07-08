package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.1569, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1569 extends AbstractC204625155b {
    public final C204646155w LJFF;
    public ViewGroup LJI;
    public TuxIconView LJII;

    @Override // X.AbstractC204625155b
    public final void LIZLLL() {
        this.LJFF.LIZLLL();
    }

    @Override // X.AbstractC204625155b
    public final void LIZ(View view) {
        this.LJI = (ViewGroup) view.findViewById(R.id.ng0);
        this.LJII = (TuxIconView) view.findViewById(R.id.jw6);
        View viewFindViewById = view.findViewById(R.id.ptp);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 185), viewFindViewById);
        }
    }

    @Override // X.AbstractC204625155b
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        C1664680tQA c1664680tQA = this.LJFF.LLJILJIL;
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.156B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LIZ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS397S0200000_31(this, c1664680tQA, 98));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.156C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LIZIZ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 434));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.156F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AnonymousClass1562) obj).LIZJ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 435));
    }

    public final void LJ(boolean z) {
        int i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        if (z) {
            i = R.raw.icon_microphone;
        } else {
            i = R.raw.icon_microphone_slash;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public AnonymousClass1569(C155H c155h, C204639155p c204639155p, AbstractC204621154x abstractC204621154x, C155W c155w, C204646155w c204646155w) {
        super(c155h, c204639155p, abstractC204621154x, c155w);
        this.LJFF = c204646155w;
    }
}
