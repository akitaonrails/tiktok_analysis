package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2375209Sk extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ TTSFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        this.LL.mT(this.LLILLJJLI, this.LLILLL, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375209Sk(C2185208hG c2185208hG, TTSFragment tTSFragment, int i, int i2) {
        super(c2185208hG);
        this.LL = tTSFragment;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
