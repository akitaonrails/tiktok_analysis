package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0dlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1062910dlZ extends Exception {
    public final String LL;

    public final String getReason() {
        return this.LL;
    }

    public AbstractC1062910dlZ(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        this.LL = str;
    }
}
