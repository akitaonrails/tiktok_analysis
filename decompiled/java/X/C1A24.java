package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;

/* JADX INFO: renamed from: X.1A24, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1A24 extends AbstractC894380Z6u<BaseActionViewModel<?>> {
    public final C894370Z6t LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public final Function2<BaseActionViewModel<?>, Activity, Unit> LLJ;
    public final Function2<BaseActionViewModel<?>, InterfaceC893080Z1u, Unit> LLJI;
    public final Function1<BaseActionViewModel<?>, Unit> LLJIJIL;
    public final Function1<BaseActionViewModel<?>, Unit> LLJILJIL;

    public C1A24() {
        throw null;
    }

    @Override // X.AbstractC894380Z6u
    public final Function0<Boolean> LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC894380Z6u
    public final Function2<BaseActionViewModel<?>, Activity, Unit> LIZIZ() {
        return this.LLJ;
    }

    @Override // X.AbstractC894380Z6u
    public final Function1<BaseActionViewModel<?>, Unit> LIZJ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC894380Z6u
    public final Function1<BaseActionViewModel<?>, Unit> LIZLLL() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC894380Z6u
    public final /* bridge */ /* synthetic */ InterfaceC2172841A1y LJ() {
        return this.LLIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1A24(C894370Z6t c894370Z6t, Function0 function0, Function2 function2, Function2 function22, int i) {
        AFwS279S0000000_33 aFwS279S0000000_33;
        Function2 function23 = function22;
        Function2 function24 = function2;
        Function0 function02 = (i & 2) != 0 ? AFwS217S0000000_28.get$arr$(522) : function0;
        function24 = (i & 4) != 0 ? AFwS321S0000000_33.get$arr$(30) : function24;
        function23 = (i & 8) != 0 ? AFwS321S0000000_33.get$arr$(31) : function23;
        if ((i & 16) != 0) {
            aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(297);
        } else {
            aFwS279S0000000_33 = null;
        }
        AFwS279S0000000_33 aFwS279S0000000_332 = (i & 32) != 0 ? AFwS279S0000000_33.get$arr$(298) : null;
        super(c894370Z6t, function02, function24, function23, aFwS279S0000000_33, aFwS279S0000000_332);
        this.LLIZ = c894370Z6t;
        this.LLIZLLLIL = function02;
        this.LLJ = function24;
        this.LLJI = function23;
        this.LLJIJIL = aFwS279S0000000_33;
        this.LLJILJIL = aFwS279S0000000_332;
    }
}
