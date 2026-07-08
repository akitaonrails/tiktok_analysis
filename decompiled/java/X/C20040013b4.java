package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20040013b4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C326880Cre LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20040013b4(C326880Cre c326880Cre, int i, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = c326880Cre;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LL.LLILLL.uuid;
        String strValueOf = String.valueOf(this.LLILLJJLI);
        String str2 = this.LLILLL;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.LLILZ;
        C1862330yYx.LJJJJLL(c1862330yYx, str, strValueOf, str2, str3 != null ? str3 : "", this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
