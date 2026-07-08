package X;

import com.bytedance.android.livesdk.wallet.NoticesResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569990qxR extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C1805270x4v LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ NoticesResult.Notice LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569990qxR(C1805270x4v c1805270x4v, String str, String str2, NoticesResult.Notice notice) {
        super(2);
        this.LL = c1805270x4v;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = notice;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        String str2;
        String str3 = str;
        if (bool.booleanValue()) {
            str3 = null;
            str2 = "auto_login";
        } else {
            this.LL.LIZ(this.LLILLJJLI);
            str2 = "auto_login_failed_fallback";
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        String str4 = this.LLILLL;
        String str5 = this.LLILZ.id;
        c1803800x2Y.getClass();
        C1803800x2Y.LJJJ(str4, str5, str2, str3);
        return Unit.LIZ;
    }
}
