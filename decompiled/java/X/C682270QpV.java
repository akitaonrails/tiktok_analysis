package X;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682270QpV implements Serializable {
    public static final int $stable = 0;
    public final Function0<C683220Qr2> buildFeedbackModel;
    public final String uniqueId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C682270QpV)) {
            return false;
        }
        C682270QpV c682270QpV = (C682270QpV) obj;
        return Intrinsics.LJFF(this.uniqueId, c682270QpV.uniqueId) && Intrinsics.LJFF(this.buildFeedbackModel, c682270QpV.buildFeedbackModel);
    }

    public int hashCode() {
        String str = this.uniqueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function0<C683220Qr2> function0 = this.buildFeedbackModel;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }

    public C682270QpV(String str, Function0<C683220Qr2> function0) {
        this.uniqueId = str;
        this.buildFeedbackModel = function0;
    }
}
