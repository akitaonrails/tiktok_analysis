package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1E2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274831E2f extends i<C12C0, C436490H9r, C07WG, C436500H9s> {
    public static final int LLJJIJI = 8;
    public final C19A3 LLJILJILJ;
    public final float LLJILLL;
    public final Function1<Float, Boolean> LLJJ;
    public final Function0<C07WG> LLJJI;
    public final Function0<C436500H9s> LLJJIII;

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07WG> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C436500H9s> w2() {
        return this.LLJJIII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2274831E2f(C19A3 c19a3, float f, Function1<? super Float, Boolean> function1) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = f;
        this.LLJJ = function1;
        this.LLJJI = AFwS226S0000000_35.get$arr$(260);
        this.LLJJIII = new AwS579S0100000_35(this, 160);
    }
}
