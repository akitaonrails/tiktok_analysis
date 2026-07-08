package X;

import com.ss.android.ugc.aweme.account.main.AccountMainActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ztC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913320ztC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AccountMainActivityAssem LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913320ztC(AccountMainActivityAssem accountMainActivityAssem, C19EG c19eg, boolean z, String str, String str2) {
        super(0);
        this.LL = accountMainActivityAssem;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getClass();
        C757860To8.LIZ.getClass();
        C757860To8.LIZLLL = false;
        if (!this.LLILLJJLI.isFinishing() && !this.LLILLJJLI.isDestroyed() && this.LLILLL) {
            C1904950zfh c1904950zfh = C1904950zfh.LIZ;
            C19EG c19eg = this.LLILLJJLI;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            c1904950zfh.getClass();
            C1904950zfh.LIZ(c19eg, str, str2);
        }
        return Unit.LIZ;
    }
}
