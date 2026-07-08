package X;

import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ibm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469920Ibm implements InterfaceC0148002o {
    public List<BoardTextFontStyleData> LL;
    public List<SMBBoardColorPreset> LLILLJJLI;
    public List<Integer> LLILLL;

    public C469920Ibm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C469920Ibm)) {
            return false;
        }
        C469920Ibm c469920Ibm = (C469920Ibm) obj;
        return Intrinsics.LJFF(this.LL, c469920Ibm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c469920Ibm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c469920Ibm.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardTextDynamicStyleState(fontList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", colorPresets=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", availableTextPresets=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C469920Ibm(int i) {
        this(new ArrayList(), new ArrayList(), new ArrayList());
    }

    public C469920Ibm(List<BoardTextFontStyleData> list, List<SMBBoardColorPreset> list2, List<Integer> list3) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = list3;
    }
}
