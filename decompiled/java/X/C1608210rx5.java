package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608210rx5<T> extends AbstractC1571440qzm<T> {
    public final Object LLILLL;
    public final C13IQ<?> LLILZ;
    public final boolean LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da A[RETURN] */
    @Override // X.AbstractC1571440qzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T LIZ() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1608210rx5.LIZ():java.lang.Object");
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        Thread thread;
        if (lifecycleOwner == null) {
            return;
        }
        AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24(lifecycleOwner, (LifecycleOwner) this, new Exception(), (Exception) 15);
        Looper looper = C1608220rx6.LIZ;
        Thread thread2 = null;
        if (looper != null) {
            thread = looper.getThread();
        } else {
            thread = null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            thread2 = looperMyLooper.getThread();
        }
        if (Intrinsics.LJFF(thread, thread2)) {
            awS268S0300000_24.invoke();
        } else {
            C786410Ut5.LJJZZIII(C1608220rx6.LIZIZ, new ARunnableS124S0100000_24(awS268S0300000_24, 127));
        }
    }

    public C1608210rx5(Object obj, C13JW c13jw) throws JSONException {
        C13IQ<?> c13iq;
        this.LLILLL = obj;
        C09R0 c09r0 = c13jw.LL;
        if ((c09r0 instanceof C13IQ) && (c13iq = (C13IQ) c09r0) != null) {
            this.LLILZ = c13iq;
            this.LLILZIL = c13jw.LIZ();
            if (C725080ScM.LIZ) {
                if (obj instanceof LifecycleOwner) {
                    LIZIZ((LifecycleOwner) obj);
                    return;
                }
                if (!(obj instanceof AbstractC738410Sxr)) {
                    return;
                }
                AbstractC738410Sxr abstractC738410Sxr = (AbstractC738410Sxr) obj;
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, (C1608210rx5<Object>) 1678);
                if (abstractC738410Sxr.LL != null) {
                    awS568S0100000_24.invoke();
                }
                ((List) abstractC738410Sxr.LLILLJJLI.getValue()).add(awS568S0100000_24);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsupported type of using vScopeParent, currentType: ");
        sbLIZ.append(c13jw);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
