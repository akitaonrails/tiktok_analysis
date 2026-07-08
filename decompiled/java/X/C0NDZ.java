package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NDZ(String str, float f) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0NDV.LIZ.getClass();
        C0NDV.LJII().LJII(this.LLILLJJLI, this.LL);
        return Unit.LIZ;
    }
}
