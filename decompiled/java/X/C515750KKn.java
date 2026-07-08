package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515750KKn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C518080KTm LL;
    public final /* synthetic */ C0KKQ LLILLJJLI;
    public final /* synthetic */ C0KH1 LLILLL;
    public final /* synthetic */ C0KJX LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515750KKn(C518080KTm c518080KTm, C0KKQ c0kkq, C0KH1 c0kh1, C0KJX c0kjx) {
        super(0);
        this.LL = c518080KTm;
        this.LLILLJJLI = c0kkq;
        this.LLILLL = c0kh1;
        this.LLILZ = c0kjx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<C0KOW> list = C0KNM.LIZ;
        String strLIZ = C0KNM.LIZ(Integer.valueOf(this.LL.LIZIZ), Integer.valueOf(this.LL.LIZJ), this.LLILLJJLI.LIZLLL);
        C0KH1 c0kh1 = this.LLILLL;
        c0kh1.LJIIIIZZ = true;
        C0KKO c0kko = this.LLILZ.LJIIJ;
        if (c0kko == null) {
            return null;
        }
        C518080KTm c518080KTm = this.LL;
        c0kko.LIZLLL(-3, c518080KTm.LIZIZ, c518080KTm.LIZJ, strLIZ, c0kh1);
        return Unit.LIZ;
    }
}
