package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0t99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654130t99 extends C09AY implements Function1<C1654150t9B, C1654150t9B> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654130t99(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1654150t9B invoke(C1654150t9B c1654150t9B) {
        C1654150t9B c1654150t9B2 = c1654150t9B;
        C375830EoP c375830EoP = new C375830EoP(new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI)));
        C375830EoP<Pair<EnumC1653890t8l, Integer>> c375830EoP2 = c1654150t9B2.LIZ;
        c1654150t9B2.getClass();
        return new C1654150t9B(c375830EoP2, c375830EoP);
    }
}
