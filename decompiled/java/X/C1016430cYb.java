package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016430cYb {
    public static final C1016430cYb LJFF;
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Function1<Boolean, Unit> LJ;

    static {
        Boolean bool = Boolean.FALSE;
        LJFF = new C1016430cYb("preload", null, bool, bool, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1016430cYb(String str, String str2, Boolean bool, Boolean bool2, Function1<? super Boolean, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bool;
        this.LIZLLL = bool2;
        this.LJ = function1;
    }
}
