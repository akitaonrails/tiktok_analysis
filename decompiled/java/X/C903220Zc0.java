package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.StrangerViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Zc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903220Zc0 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ StrangerViewModel LL;
    public final /* synthetic */ String LLILLJJLI = "updateConversationCache";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903220Zc0(C2185208hG c2185208hG, StrangerViewModel strangerViewModel) {
        super(c2185208hG);
        this.LL = strangerViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC903260Zc4 interfaceC903260Zc4 = this.LL.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error occurred while ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC903260Zc4.LIZ();
    }
}
