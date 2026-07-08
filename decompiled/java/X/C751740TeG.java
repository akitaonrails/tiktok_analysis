package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751740TeG extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C0T7K LL;
    public final /* synthetic */ C843920X8s LLILLJJLI;
    public final /* synthetic */ C843930X8t LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751740TeG(Context context, C843930X8t c843930X8t, C1882170z4x c1882170z4x, C843920X8s c843920X8s) {
        super(1);
        this.LL = c1882170z4x;
        this.LLILLJJLI = c843920X8s;
        this.LLILLL = c843930X8t;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        String errorMsg;
        C501470JlZ c501470JlZ;
        Throwable th2 = th;
        if (th2 instanceof C501520Jle) {
            C0T7K c0t7k = this.LL;
            if (c0t7k != null) {
                int errorCode = ((C501520Jle) th2).getErrorCode();
                if (!(th2 instanceof C477520Io2) || (c501470JlZ = (C501470JlZ) th2) == null || (errorMsg = c501470JlZ.getErrorMsg()) == null) {
                    errorMsg = "";
                }
                c0t7k.LIZ(errorCode, errorMsg, false);
            }
        } else {
            C0T7K c0t7k2 = this.LL;
            if (c0t7k2 != null) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                c0t7k2.LIZ(-1, message, false);
            }
        }
        C766270U4b.LIZLLL(2131841782);
        C843920X8s c843920X8s = this.LLILLJJLI;
        EnumC751770TeJ enumC751770TeJ = EnumC751770TeJ.LLILLL;
        C843930X8t c843930X8t = this.LLILLL;
        c843920X8s.getClass();
        C843920X8s.LJIIJJI(enumC751770TeJ, c843930X8t);
        this.LLILLJJLI.LJIILIIL(this.LLILLL, this.LLILZ, "");
        return Unit.LIZ;
    }
}
