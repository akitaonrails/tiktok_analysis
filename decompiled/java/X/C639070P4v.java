package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0P4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C639070P4v extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

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
            case 6:
                LJJ$6(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C639070P4v(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((C1451860nsu) c639070P4v.l0);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0NTF((C1451860nsu) c639070P4v.l0, null), 2);
    }

    public static final void LJJ$1(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        C1231704rr c1231704rr = ((ContactSelectVM) c639070P4v.l0).LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coroutine exception: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
    }

    public static final void LJJ$2(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        C19319410i8 c19319410i8 = ((C607310Nrt) c639070P4v.l0).LIZIZ;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c19319410i8.LJ(message);
    }

    public static final void LJJ$3(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        ((C0NK4) c639070P4v.l0).getClass();
        while (th != null) {
            if (th.getCause() != null) {
                th = th.getCause();
            } else {
                if (th != null) {
                    throw th;
                }
                return;
            }
        }
    }

    public static final void LJJ$4(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        ((AddYoursCollectionListVM) c639070P4v.l0).setState(new AwS588S0100000_9(th, 491));
    }

    public static final void LJJ$5(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        C0NYA c0nya = (C0NYA) c639070P4v.l0;
        C0NXT c0nxt = c0nya.LIZ;
        c0nya.getClass();
        C0NXR.LIZJ(c0nya, c0nxt, "report error", th);
    }

    public static final void LJJ$6(C639070P4v c639070P4v, CoroutineContext coroutineContext, Throwable th) {
        C0NYA c0nya = (C0NYA) c639070P4v.l0;
        C0NXT c0nxt = c0nya.LIZ;
        c0nya.getClass();
        C0NXR.LIZJ(c0nya, c0nxt, "report error", th);
    }
}
