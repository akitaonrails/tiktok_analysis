package X;

import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: renamed from: X.052h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12881052h<STORAGE_TYPE> implements C053I<STORAGE_TYPE> {
    public final AnonymousClass0531 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C12882052i(this));

    public final Keva LIZ() {
        return (Keva) this.LIZIZ.getValue();
    }

    @Override // X.C053I
    public final List<String> LJ() {
        return C13LP.LLIIII(LIZ().getAllKey());
    }

    public AbstractC12881052h(AnonymousClass0531 anonymousClass0531) {
        this.LIZ = anonymousClass0531;
    }

    @Override // X.C053I
    public final void LJI(String str) {
        LIZ().erase(str);
    }
}
