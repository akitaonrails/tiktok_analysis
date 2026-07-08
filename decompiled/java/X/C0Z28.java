package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0Z28, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0Z28 extends AbstractC894380Z6u<BaseSwitchActionViewModel<?>> {
    public final C2172711A1l LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public final Function2<BaseSwitchActionViewModel<?>, Activity, Unit> LLJ;
    public final Function2<BaseSwitchActionViewModel<?>, InterfaceC893080Z1u, Unit> LLJI;
    public final Function1<BaseSwitchActionViewModel<?>, Unit> LLJIJIL;
    public final Function1<BaseSwitchActionViewModel<?>, Unit> LLJILJIL;

    public C0Z28() {
        throw null;
    }

    @Override // X.AbstractC894380Z6u
    public final Function0<Boolean> LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC894380Z6u
    public final Function2<BaseSwitchActionViewModel<?>, Activity, Unit> LIZIZ() {
        return this.LLJ;
    }

    @Override // X.AbstractC894380Z6u
    public final Function1<BaseSwitchActionViewModel<?>, Unit> LIZJ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC894380Z6u
    public final Function1<BaseSwitchActionViewModel<?>, Unit> LIZLLL() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC894380Z6u
    public final /* bridge */ /* synthetic */ InterfaceC2172841A1y LJ() {
        return this.LLIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0Z28(C2172711A1l c2172711A1l, Function0 function0, Function2 function2, Function2 function22) {
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(398);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(399);
        super(c2172711A1l, function0, function2, function22, aFwS248S0000000_14, aFwS248S0000000_142);
        this.LLIZ = c2172711A1l;
        this.LLIZLLLIL = function0;
        this.LLJ = function2;
        this.LLJI = function22;
        this.LLJIJIL = aFwS248S0000000_14;
        this.LLJILJIL = aFwS248S0000000_142;
    }
}
