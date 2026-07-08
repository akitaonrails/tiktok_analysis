package X;

import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.vm.PauseInteractionsVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.104G, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104G {
    public static final C103L LIZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1049] */
    static {
        C103N c103n = new C103N("");
        C104A c104a = new C104A() { // from class: X.104H
        };
        c104a.LIZIZ = new AnonymousClass1031() { // from class: X.1049
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a2) {
                return new AbstractC191843103l(c191848103q) { // from class: X.1048
                    public final C191848103q LLILLJJLI;

                    {
                        this.LLILLJJLI = c191848103q;
                    }

                    @Override // X.AbstractC191843103l
                    public final List<AbstractC191840103i> LJ(Context context) {
                        return Collections.singletonList(new AbstractC191841103j(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), (PauseInteractionsVM) new ViewModelProvider(this.LLILLJJLI.LIZIZ).get(C13LE.LIZ(PauseInteractionsVM.class))) { // from class: X.1047
                            public final int LIZLLL;
                            public final int LJ;
                            public final PauseInteractionsVM LJFF;
                            public final int LIZJ = R.raw.tux_lottie_common_pnr_pauseinteraction;
                            public final int LJI = R.layout.bdx;

                            public final int hashCode() {
                                return Objects.hash(Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), this.LJFF);
                            }

                            @Override // X.AbstractC191841103j
                            public final int LJFF() {
                                return this.LJI;
                            }

                            public final boolean equals(Object obj) {
                                if (obj instanceof AnonymousClass1047) {
                                    AnonymousClass1047 anonymousClass1047 = (AnonymousClass1047) obj;
                                    if (this.LIZJ == anonymousClass1047.LIZJ && this.LIZLLL == anonymousClass1047.LIZLLL && this.LJ == anonymousClass1047.LJ && Intrinsics.LJFF(this.LJFF, anonymousClass1047.LJFF)) {
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }

                            @Override // X.InterfaceC191837103f
                            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                                AnonymousClass1047 anonymousClass1047;
                                C1295960jpS c1295960jpS;
                                Object context2;
                                LifecycleOwner lifecycleOwner;
                                ContextWrapper contextWrapper;
                                if ((abstractC191840103i instanceof AnonymousClass1047) && (anonymousClass1047 = (AnonymousClass1047) abstractC191840103i) != null && (c1295960jpS = (C1295960jpS) c191838103g.itemView.findViewById(R.id.b43)) != null) {
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(anonymousClass1047.LIZLLL, anonymousClass1047.LJ);
                                    layoutParams.gravity = 17;
                                    C786410Ut5.s6(c1295960jpS, layoutParams);
                                    c1295960jpS.setAnimation(anonymousClass1047.LIZJ);
                                    if (Intrinsics.LJFF(this.LJFF.LLILLL.getValue(), Boolean.TRUE)) {
                                        c1295960jpS.setSpeed(-1.0f);
                                        c1295960jpS.setProgress(1.0f);
                                    }
                                    Context context3 = c1295960jpS.getContext();
                                    if (!(context3 instanceof ContextThemeWrapper) || (contextWrapper = (ContextWrapper) context3) == null || (context2 = contextWrapper.getBaseContext()) == null) {
                                        context2 = c1295960jpS.getContext();
                                    }
                                    if ((context2 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context2) != null) {
                                        this.LJFF.LLILLL.removeObservers(lifecycleOwner);
                                        this.LJFF.LLILLL.observe(lifecycleOwner, new AObserverS210S0100000_6(c1295960jpS, 37));
                                    }
                                }
                            }

                            {
                                this.LIZLLL = i;
                                this.LJ = i;
                                this.LJFF = pauseInteractionsVM;
                            }
                        });
                    }
                };
            }
        };
        C103N c103n2 = new C103N(AFwS271S0000000_28.get$arr$(238));
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(239);
        C105V c105v = new C105V(c103n2);
        aFwS271S0000000_28.invoke(c105v);
        C103N c103n3 = new C103N(AFwS271S0000000_28.get$arr$(240));
        AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(241);
        C105V c105v2 = new C105V(c103n3);
        aFwS271S0000000_282.invoke(c105v2);
        C107N c107n = new C107N("pause_interaction", "pause_interaction_from", 0);
        c107n.LIZ = "pause_interaction_from_options";
        c107n.LJ = new C103N(2131839150);
        C105M c105m = new C105M(1);
        c105m.LJ = new C103N(2131839148);
        C105M c105m2 = new C105M(2);
        c105m2.LJ = new C103N(2131839149);
        c107n.LJIIJJI = C1697810uHb.LJIILJJIL(c105m, c105m2);
        C104A[] c104aArr = {c107n};
        C107N c107n2 = new C107N("", "pause_interaction_duration", 0);
        c107n2.LIZ = "pause_interaction_for_options";
        c107n2.LJ = new C103N(2131839147);
        C105M c105m3 = new C105M(1);
        c105m3.LJ = new C103N(AFwS257S0000000_19.get$arr$(536));
        C105M c105m4 = new C105M(3);
        c105m4.LJ = new C103N(AFwS257S0000000_19.get$arr$(537));
        C105M c105m5 = new C105M(7);
        c105m5.LJ = new C103N(2131839146);
        c107n2.LJIIJJI = C1697810uHb.LJIILJJIL(c105m3, c105m4, c105m5);
        LIZ = new C103L("pause_interactions", c103n, 0, null, C1697810uHb.LJIIJJI(new C104I(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), c104a, new C104I(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), c105v, new C104I(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), c105v2, new C104I(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), C191853103v.LIZIZ(c104aArr), new C104I(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), C191853103v.LIZIZ(new C104A[]{c107n2})), 44);
    }
}
