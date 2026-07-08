package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502609rM extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502609rM(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C2502609rM c2502609rM, CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatListMultiThreadActor,pageKey=");
        sbLIZ.append((InterfaceC879010Ye3) c2502609rM.l0);
        C309160C9y.LIZJ(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static final void LJJ$1(C2502609rM c2502609rM, CoroutineContext coroutineContext, Throwable th) {
        ((TTSFragment) c2502609rM.l0).LLLLLILLIL = true;
    }
}
