package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444560Hby {
    public final EnumC444580Hc0 LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Function0<Unit> LJ;

    public C444560Hby(EnumC444580Hc0 enumC444580Hc0, Integer num, Integer num2, Integer num3, Function0<Unit> function0) {
        this.LIZ = enumC444580Hc0;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = num3;
        this.LJ = function0;
    }

    public /* synthetic */ C444560Hby(EnumC444580Hc0 enumC444580Hc0, Integer num, Integer num2, Integer num3, Function0 function0, int i) {
        this(enumC444580Hc0, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) == 0 ? function0 : null);
    }
}
