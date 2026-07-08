package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS42S0310000_25;

/* JADX INFO: renamed from: X.0tiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675850tiB extends C09AY implements Function1<C1681030tqX, C1681040tqY> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function0<Boolean> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675850tiB(boolean z, long j, Function0 function0) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = function0;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1681040tqY invoke(C1681030tqX c1681030tqX) {
        C1681030tqX c1681030tqX2 = c1681030tqX;
        return c1681030tqX2.LIZLLL(new AwS42S0310000_25(this.LLILLJJLI, this.LLILLL, C1680380tpU.LIZLLL(c1681030tqX2, Float.intBitsToFloat((int) (c1681030tqX2.LIZIZ() >> 32)) / 2.0f), C1680900tqK.LIZ(this.LL), 0));
    }
}
