package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS71S0210000_19;

/* JADX INFO: renamed from: X.0iD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233720iD4 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TwoStepVerificationActivityAssem LLILZ;
    public final /* synthetic */ C1233790iDB LLILZIL;
    public final /* synthetic */ C1233730iD5 LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233720iD4(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C1233790iDB c1233790iDB, C1233730iD5 c1233730iD5, boolean z) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = str;
        this.LLILZ = twoStepVerificationActivityAssem;
        this.LLILZIL = c1233790iDB;
        this.LLILZLL = c1233730iD5;
        this.LLIZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL.element, new AwS228S0300000_19(this.LLILZ, this.LLILZIL, this.LLILZLL, 36));
        c1397620mTQ2.LIZJ(0, this.LLILLJJLI.element, new AwS71S0210000_19(this.LLIZ, this.LLILZ, this.LLILZIL, 11));
        c1397620mTQ2.LIZJ(1, this.LLILLL, null);
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
