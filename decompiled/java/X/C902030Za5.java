package X;

import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Za5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902030Za5 implements InterfaceC902130ZaF {
    public final ImageComponent LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C902030Za5) && Intrinsics.LJFF(this.LIZ, ((C902030Za5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteType(imageComponent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C902030Za5(ImageComponent imageComponent) {
        this.LIZ = imageComponent;
    }
}
