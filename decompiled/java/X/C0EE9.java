package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EE9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EE9 {
    public final Function0<Unit> LIZ;
    public final InterfaceC1631630sYr<StylePrompt, String, String, Integer, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EE9)) {
            return false;
        }
        C0EE9 c0ee9 = (C0EE9) obj;
        return Intrinsics.LJFF(this.LIZ, c0ee9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ee9.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCStyleSelectActions(hidePanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateStyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EE9(C0EEC c0eec, C0EEB c0eeb) {
        this.LIZ = c0eec;
        this.LIZIZ = c0eeb;
    }
}
