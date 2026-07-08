package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D39, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D39 implements Serializable {
    public final List<C0D3D> contentBlocks;
    public final String id;
    public final boolean isExpanded;
    public final String title;

    public final C0D39 copy(String str, String str2, boolean z, List<? extends C0D3D> list) {
        return new C0D39(str, str2, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D39)) {
            return false;
        }
        C0D39 c0d39 = (C0D39) obj;
        return Intrinsics.LJFF(this.id, c0d39.id) && Intrinsics.LJFF(this.title, c0d39.title) && this.isExpanded == c0d39.isExpanded && Intrinsics.LJFF(this.contentBlocks, c0d39.contentBlocks);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + C786410Ut5.Z2(this.isExpanded)) * 31) + this.contentBlocks.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccordionDrawerState(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.isExpanded);
        sbLIZ.append(", contentBlocks=");
        sbLIZ.append(this.contentBlocks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0D39(String str, String str2, boolean z, List<? extends C0D3D> list) {
        this.id = str;
        this.title = str2;
        this.isExpanded = z;
        this.contentBlocks = list;
    }
}
