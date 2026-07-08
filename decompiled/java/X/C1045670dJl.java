package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045670dJl extends C1045650dJj implements InterfaceC585680My6 {
    public C1045670dJl(InterfaceC1045690dJn interfaceC1045690dJn) {
        super(interfaceC1045690dJn);
    }

    @Override // X.C1045650dJj
    public final View LJJIJ(Activity activity) {
        return this.LIZIZ.LJJI();
    }

    @Override // X.C1045650dJj, X.InterfaceC1019050ccp
    public final void LJFF(int i, Context context, View view, Aweme aweme) {
        C1045650dJj.LJJIIZI(aweme);
        super.LJFF(i, context, view, aweme);
    }

    @Override // X.C1045650dJj, X.InterfaceC1019050ccp
    public final void LJIIJ(int i, Context context, View view, Aweme aweme) {
        super.LJIIJ(i, context, view, aweme);
    }

    @Override // X.C1045650dJj, X.InterfaceC1019050ccp
    public final void LJIIZILJ(int i, Context context, View view, Aweme aweme) {
        C1045650dJj.LJJIIZI(aweme);
        super.LJIIZILJ(i, context, view, aweme);
    }

    @Override // X.C1045650dJj, X.InterfaceC1019050ccp
    public final void LJIJJLI(Context context, View view, Aweme aweme, boolean z) {
        if (z) {
            C1045720dJq c1045720dJqLJJIIZI = C1045650dJj.LJJIIZI(aweme);
            if (!C1012040cRW.LIZIZ().LJIIJJI) {
                this.LIZ.LJIIL(context, c1045720dJqLJJIIZI);
            }
            this.LIZ.LIZJ(context, c1045720dJqLJJIIZI);
            return;
        }
        super.LJIJJLI(context, view, aweme, z);
    }

    @Override // X.InterfaceC585680My6
    public final void LJIJI(Context context, Aweme aweme, View view, boolean z, Function0<Long> function0, Function0<Long> function02) {
        LJJII(function0);
        LJJIFFI(function02);
        if (z) {
            setTracker(AFwS204S0000000_16.get$arr$(365));
        } else {
            setTracker(AFwS204S0000000_16.get$arr$(366));
        }
        C1045720dJq c1045720dJqLJJIIZI = C1045650dJj.LJJIIZI(aweme);
        this.LIZJ = view;
        this.LIZLLL = aweme;
        this.LIZ.LJIIIIZZ(this);
        this.LIZ.LJIILJJIL(c1045720dJqLJJIIZI, context, view, LJJIJIIJI(context, view));
    }
}
