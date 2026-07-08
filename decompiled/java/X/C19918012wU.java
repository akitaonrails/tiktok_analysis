package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.12wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918012wU extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;
    public final List<String> LL;

    public C19926612xs asInvalidProtocolBufferException() {
        return new C19926612xs(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.LL);
    }

    public C19918012wU(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        super(sb.toString());
        this.LL = list;
    }

    public C19918012wU(InterfaceC19925612xi interfaceC19925612xi) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
