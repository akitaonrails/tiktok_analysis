package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Mqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581260Mqy extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$5(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) throws Throwable {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C581260Mqy(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) {
        C0MH8 c0mh8 = C0MH8.LIZ;
        String str = "error occured, throwable:\n" + C13SZ.LIZIZ(th);
        c0mh8.getClass();
        C0MH8.LJIIL(str);
    }

    public static final void LJJ$1(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable: ");
        sbLIZ.append(th);
        c547140Ld2.LIZIZ("InputMentionPanelComponent", C2188811AlT.LIZIZ(sbLIZ), th);
        if (!C554190LoP.LIZ()) {
        } else {
            throw th;
        }
    }

    public static final void LJJ$2(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        if (!C554190LoP.LIZ()) {
        } else {
            throw th;
        }
    }

    public static final void LJJ$3(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) {
        C201955140j.LJIIJ(C1398350mUb.LIZIZ, "msg-log", th);
    }

    public static final void LJJ$4(C581260Mqy c581260Mqy, CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception: ");
        sbLIZ.append(th);
        C201955140j.LJIIIIZZ(c554890LpX, "CeleTemplateApply", C2188811AlT.LIZIZ(sbLIZ));
    }
}
