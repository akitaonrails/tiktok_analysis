package X;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831120Wj0 extends UnsupportedOperationException {
    public final Feature LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.LL));
    }

    public C831120Wj0(Feature feature) {
        this.LL = feature;
    }
}
