package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581080Mqg implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C581080Mqg c581080Mqg) {
        ArrayList arrayList = (ArrayList) c581080Mqg.l0;
        C09AJ c09aj = (C09AJ) c581080Mqg.l1;
        synchronized (arrayList) {
            try {
                if (!arrayList.isEmpty()) {
                    c09aj.onNext(C13LP.LLIIII(arrayList));
                    arrayList.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((C09AJ) c581080Mqg.l1).onComplete();
    }

    public static final void run$1(C581080Mqg c581080Mqg) {
        ((Function1) c581080Mqg.l0).invoke(Integer.valueOf(((C118300cf) c581080Mqg.l1).element));
    }

    public C581080Mqg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
