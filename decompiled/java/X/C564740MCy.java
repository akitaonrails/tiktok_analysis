package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0MCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564740MCy extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC2329309At LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generate: taskId=");
        sbLIZ.append(this.LL);
        C537680L6w.LIZ(c0l76, "AILiveWritingComponent", C2188811AlT.LIZIZ(sbLIZ), th);
        this.LLILLJJLI.onSuccess(new C0MD3(3003, null, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564740MCy(C2185208hG c2185208hG, String str, C11KT c11kt) {
        super(c2185208hG);
        this.LL = str;
        this.LLILLJJLI = c11kt;
    }
}
