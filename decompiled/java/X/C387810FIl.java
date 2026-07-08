package X;

import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387810FIl extends AbstractC387820FIm {
    public final TextTemplateTools.TextTemplateDependResources LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C387810FIl) && Intrinsics.LJFF(this.LIZ, ((C387810FIl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(dependResources=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C387810FIl(TextTemplateTools.TextTemplateDependResources textTemplateDependResources) {
        this.LIZ = textTemplateDependResources;
    }
}
