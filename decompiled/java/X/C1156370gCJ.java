package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0gCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156370gCJ {
    public final String LIZ;
    public final String LIZIZ;
    public final List<TextExtraStruct> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", structList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1156370gCJ(String str, String str2, List<? extends TextExtraStruct> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
