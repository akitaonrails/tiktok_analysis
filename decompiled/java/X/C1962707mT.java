package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1962707mT {
    public final boolean LIZ;
    public final Intent LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<Boolean, Unit> LJ;
    public final Function1<Boolean, Function0<Unit>> LJFF;
    public final String LJI;
    public final Function0<Boolean> LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public C1962707mT(boolean z, Intent intent, String str, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, ? extends Function0<Unit>> function12, String str2, Function0<Boolean> function02) {
        this.LIZ = z;
        this.LIZIZ = intent;
        this.LIZJ = str;
        this.LIZLLL = function0;
        this.LJ = function1;
        this.LJFF = function12;
        this.LJI = str2;
        this.LJII = function02;
    }

    public /* synthetic */ C1962707mT(boolean z, Intent intent, String str, Function0 function0, Function1 function1, Function1 function12, String str2, AwS547S0100000_3 awS547S0100000_3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : intent, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function12, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? awS547S0100000_3 : null);
    }
}
