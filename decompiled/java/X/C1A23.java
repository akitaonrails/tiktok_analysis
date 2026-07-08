package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;

/* JADX INFO: renamed from: X.1A23, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1A23 extends AbstractC894380Z6u<BaseActionViewModel<?>> {
    public final C2172771A1r LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public final Function2<BaseActionViewModel<?>, Activity, Unit> LLJ;
    public final Function2<BaseActionViewModel<?>, InterfaceC893080Z1u, Unit> LLJI;
    public final Function1<BaseActionViewModel<?>, Unit> LLJIJIL;
    public final Function1<BaseActionViewModel<?>, Unit> LLJILJIL;

    public C1A23() {
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
    public Function1<BaseActionViewModel<?>, Unit> LIZJ() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC894380Z6u
    public Function1<BaseActionViewModel<?>, Unit> LIZLLL() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC894380Z6u
    public final /* bridge */ /* synthetic */ InterfaceC2172841A1y LJ() {
        return this.LLIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1A23(C2172771A1r c2172771A1r, Function0 function0, Function2 function2, Function2 function22, Function1 function1, int i) {
        AFwS279S0000000_33 aFwS279S0000000_33;
        function0 = (i & 2) != 0 ? AFwS217S0000000_28.get$arr$(523) : function0;
        function2 = (i & 4) != 0 ? AFwS321S0000000_33.get$arr$(32) : function2;
        function22 = (i & 8) != 0 ? AFwS321S0000000_33.get$arr$(33) : function22;
        function1 = (i & 16) != 0 ? AFwS279S0000000_33.get$arr$(299) : function1;
        if ((i & 32) != 0) {
            aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        } else {
            aFwS279S0000000_33 = null;
        }
        super(c2172771A1r, function0, function2, function22, function1, aFwS279S0000000_33);
        this.LLIZ = c2172771A1r;
        this.LLIZLLLIL = function0;
        this.LLJ = function2;
        this.LLJI = function22;
        this.LLJIJIL = function1;
        this.LLJILJIL = aFwS279S0000000_33;
    }
}
