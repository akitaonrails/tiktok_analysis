package X;

import android.view.WindowManager;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21636519lz {
    public final WindowManager LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public final C21636619m0 LIZJ = new Consumer() { // from class: X.19m0
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.LL.LIZIZ.invoke(obj);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19m0] */
    public C21636519lz(WindowManager windowManager, AwS612S0100000_33 awS612S0100000_33) {
        this.LIZ = windowManager;
        this.LIZIZ = awS612S0100000_33;
    }
}
