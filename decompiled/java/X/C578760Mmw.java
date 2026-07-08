package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578760Mmw {
    public final String LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Function1<String, Boolean> LIZLLL;

    public /* synthetic */ C578760Mmw(Boolean bool, Boolean bool2, Function1 function1, int i) {
        this((String) null, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Boolean.FALSE : bool2, (Function1<? super String, Boolean>) ((i & 8) != 0 ? null : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C578760Mmw(String str, Boolean bool, Boolean bool2, Function1<? super String, Boolean> function1) {
        this.LIZ = str;
        this.LIZIZ = bool;
        this.LIZJ = bool2;
        this.LIZLLL = function1;
    }
}
