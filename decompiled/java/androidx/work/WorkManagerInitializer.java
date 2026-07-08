package androidx.work;

import X.C0VHM;
import X.C0VHN;
import X.C0VI1;
import X.C0VI7;
import X.C0VI8;
import X.InterfaceC2363209Nu;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class WorkManagerInitializer implements InterfaceC2363209Nu<C0VI7> {
    static {
        C0VI8.LIZIZ("WrkMgrInitializer");
    }

    @Override // X.InterfaceC2363209Nu
    public final List<Class<? extends InterfaceC2363209Nu<?>>> dependencies() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC2363209Nu
    public final C0VI7 create(Context context) {
        C0VI8.LIZ().getClass();
        C0VI1.LJIIIIZZ(context, new C0VHM(new C0VHN()));
        return C0VI1.LJII(context);
    }
}
