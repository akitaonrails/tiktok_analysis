package X;

import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS37S2000000_13;

/* JADX INFO: renamed from: X.0XWF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWF extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ OneClickLoginService LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XWF(OneClickLoginService oneClickLoginService, Function0<Unit> function0, String str, String str2) {
        super(1);
        this.LL = oneClickLoginService;
        this.LLILLJJLI = function0;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        OneClickLoginService oneClickLoginService = this.LL;
        String strLIZLLL = C0XQ5.LIZLLL();
        AwS37S2000000_13 awS37S2000000_13 = new AwS37S2000000_13(this.LLILLL, this.LLILZ, 0);
        oneClickLoginService.getClass();
        OneClickLoginService.LJIL(strLIZLLL, str, awS37S2000000_13);
        if (!C846430XIj.LIZIZ()) {
            this.LLILLJJLI.invoke();
        }
        return Unit.LIZ;
    }
}
