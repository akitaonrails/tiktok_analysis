package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZR extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C11Y7 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ReadTextEffectBean LLILLL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        this.LL.C5(this.LLILLJJLI, th.getMessage(), 900, null, this.LLILLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZR(C2185208hG c2185208hG, C11Y7 c11y7, int i, ReadTextEffectBean readTextEffectBean) {
        super(c2185208hG);
        this.LL = c11y7;
        this.LLILLJJLI = i;
        this.LLILLL = readTextEffectBean;
    }
}
