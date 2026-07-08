package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ijH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253690ijH extends AbstractC2361009My {
    public final /* synthetic */ String LL;

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        return false;
    }

    @Override // X.AbstractC2361009My
    public final Map<String, String> mobExtraParams() {
        return new HashMap<String, String>(this) { // from class: X.0ijI
            {
                put("enter_from", this.LL);
            }
        };
    }

    public C1253690ijH(String str) {
        this.LL = str;
    }
}
