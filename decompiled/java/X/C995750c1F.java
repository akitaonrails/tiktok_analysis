package X;

import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995750c1F implements InterfaceC0148002o {
    public final C291001Au<SMBBoardColorPreset> LL;
    public C291001Au<Boolean> LLILLJJLI;

    public C995750c1F() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995750c1F)) {
            return false;
        }
        C995750c1F c995750c1F = (C995750c1F) obj;
        return Intrinsics.LJFF(this.LL, c995750c1F.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995750c1F.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardTextSelectColorStyleState(clickAction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateTextStylePresetEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995750c1F(int i) {
        this(new C291001Au(null), new C291001Au(Boolean.FALSE));
    }

    public C995750c1F(C291001Au<SMBBoardColorPreset> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
