package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525660KjU implements InterfaceC2499409qq {
    public final List<TikTokMediaModel> LIZ;
    public final C0L99 LIZIZ;
    public final Intent LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525660KjU)) {
            return false;
        }
        C525660KjU c525660KjU = (C525660KjU) obj;
        return Intrinsics.LJFF(this.LIZ, c525660KjU.LIZ) && this.LIZIZ == c525660KjU.LIZIZ && Intrinsics.LJFF(this.LIZJ, c525660KjU.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525660KjU(List<? extends TikTokMediaModel> list, C0L99 c0l99, Intent intent) {
        this.LIZ = list;
        this.LIZIZ = c0l99;
        this.LIZJ = intent;
    }
}
