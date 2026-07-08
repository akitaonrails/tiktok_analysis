package X;

import com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0DiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346550DiH extends AbstractC23273099z implements CoroutineExceptionHandler {
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
    public C346550DiH(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C346550DiH c346550DiH, CoroutineContext coroutineContext, Throwable th) {
        C0D1M c0d1m = (C0D1M) c346550DiH.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Throwable: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        c0d1m.i3(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$1(C346550DiH c346550DiH, CoroutineContext coroutineContext, Throwable th) {
        for (String str : (List) c346550DiH.l0) {
            AwemeFetchManager.LIZIZ.getClass();
            AwemeFetchManager.LJI(str);
        }
    }
}
