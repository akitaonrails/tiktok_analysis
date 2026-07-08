package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240040iNG extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1239960iN8 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240040iNG(C1239960iN8 c1239960iN8, String str, boolean z) {
        super(1);
        this.LL = c1239960iN8;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String str;
        C0XWJ c0xwj = C0XWJ.LIZ;
        int size = this.LL.LL.size();
        String str2 = this.LLILLJJLI;
        if (this.LLILLL) {
            str = "ocl";
        } else {
            str = "hl";
        }
        c0xwj.getClass();
        C0XWJ.LJIIJ(size, "click_cancel", str2, str);
        return Unit.LIZ;
    }
}
