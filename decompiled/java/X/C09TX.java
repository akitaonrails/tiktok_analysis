package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09TX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TX extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ EditorProTTSHelper LL;
    public final /* synthetic */ Function1 LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        EditorProTTSHelper.LIZJ(this.LL, this.LLILLJJLI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09TX(C2185208hG c2185208hG, EditorProTTSHelper editorProTTSHelper, Function1 function1) {
        super(c2185208hG);
        this.LL = editorProTTSHelper;
        this.LLILLJJLI = function1;
    }
}
