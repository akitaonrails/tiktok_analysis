package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS33S0100001_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661520tL4 implements InterfaceC1663080tNa {
    public final /* synthetic */ Function1<Float, Unit> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Function1<String, Unit> LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;

    @Override // X.InterfaceC1663080tNa
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1663080tNa
    public final void onProgress(float f) {
        C371410EhH.LIZJ(new AwS33S0100001_25(f, this.LIZ, 2));
    }

    @Override // X.InterfaceC1663080tNa
    public final void LIZ(int i, String str) {
        C371410EhH.LIZJ(new AwS569S0100000_25(this.LIZLLL, (Function0<Unit>) 268));
    }

    @Override // X.InterfaceC1663080tNa
    public final void LIZIZ(String str, String str2) {
        if (!Intrinsics.LJFF(str, this.LIZIZ)) {
            return;
        }
        C371410EhH.LIZJ(new AwS174S1100000_25(str2, this.LIZJ, 4));
    }

    public C1661520tL4(String str, Function1 function1, Function1 function12, Function0 function0) {
        this.LIZ = function1;
        this.LIZIZ = str;
        this.LIZJ = function12;
        this.LIZLLL = function0;
    }
}
