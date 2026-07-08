package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322718cT extends C09AY implements Function2<C21323018cW, C21326518d5, Unit> {
    public final /* synthetic */ C21322318cP LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function2<C21323018cW, C21326518d5, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21322718cT(C21322318cP c21322318cP, Context context, String str, Function2<? super C21323018cW, ? super C21326518d5, Unit> function2) {
        super(2);
        this.LL = c21322318cP;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C21323018cW c21323018cW, C21326518d5 c21326518d5) {
        C21323018cW c21323018cW2 = c21323018cW;
        if (c21323018cW2.LIZ == null && c21326518d5 == null) {
            this.LL.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        } else {
            this.LLILZ.invoke(c21323018cW2, c21326518d5);
        }
        return Unit.LIZ;
    }
}
