package X;

import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.jvm.internal.AwS172S0101000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DYW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DYW extends TTMContainer {
    public static final /* synthetic */ int LIZ = 0;

    public C1DYW() {
        super(true);
    }

    public final String toString() {
        String str;
        Object objTryCatch = tryCatch(new AwS579S0100000_35(this, 184));
        return (!(objTryCatch instanceof String) || (str = (String) objTryCatch) == null) ? "[]" : str;
    }

    public C1DYW(long j) {
        super(j, true);
    }

    public final C1DYZ LIZ(int i) {
        Object objTryCatch = tryCatch(new AwS172S0101000_35(this, i, 2));
        if (objTryCatch instanceof C1DYZ) {
            return (C1DYZ) objTryCatch;
        }
        return null;
    }

    public final void LIZIZ(int i) {
        Boolean bool;
        Object objTryCatch = tryCatch(new AwS172S0101000_35(this, i, 3));
        if ((objTryCatch instanceof Boolean) && (bool = (Boolean) objTryCatch) != null) {
            bool.booleanValue();
        }
    }
}
