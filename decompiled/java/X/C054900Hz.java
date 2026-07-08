package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C054900Hz extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C054900Hz(boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[doAdaption] forceHideTop");
        sbLIZ.append(this.LL);
        sbLIZ.append(", forceHideBottom");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceShowTop");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", forceShowBottom");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
