package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0552, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0552 {
    public String LIZ;
    public final C01GW LIZIZ;

    public final ConcurrentHashMap<String, Object> LIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!Intrinsics.LJFF(curUserId, this.LIZ)) {
            this.LIZ = curUserId;
            ((ConcurrentHashMap) this.LIZIZ.getValue()).clear();
        }
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public AnonymousClass0552() {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        this.LIZ = curUserId == null ? "" : curUserId;
        this.LIZIZ = C452501pT.LIZIZ(new AnonymousClass0553());
    }
}
