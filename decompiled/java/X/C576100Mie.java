package X;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Mie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576100Mie implements Serializable {
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;

    public C576100Mie() {
        this(AFwS194S0000000_8.get$arr$(345), AFwS194S0000000_8.get$arr$(346));
    }

    public final Function0<Unit> getOnFail() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnSuccess() {
        return this.LL;
    }

    public final void setOnFail(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnSuccess(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C576100Mie(Function0<Unit> function0, Function0<Unit> function02) {
        this.LL = function0;
        this.LLILLJJLI = function02;
    }
}
