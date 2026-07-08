package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971120bNW {
    public final EnumC971100bNU LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;
    public final Float LIZLLL;
    public final Float LJ;
    public final C971330bNr LJFF;
    public final Function0<Boolean> LJI;

    public C971120bNW(EnumC971100bNU enumC971100bNU, Float f, Float f2, Float f3, Float f4, C971330bNr c971330bNr, Function0<Boolean> function0) {
        this.LIZ = enumC971100bNU;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = c971330bNr;
        this.LJI = function0;
    }

    public /* synthetic */ C971120bNW(EnumC971100bNU enumC971100bNU, Float f, Float f2, Float f3, Float f4, C971330bNr c971330bNr, Function0 function0, int i) {
        this(enumC971100bNU, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : f4, c971330bNr, (i & 64) == 0 ? function0 : null);
    }
}
