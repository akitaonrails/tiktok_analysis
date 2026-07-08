package X;

import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBZ extends ITTMParamData {
    public final String LIZIZ;
    public final int LIZJ;
    public final List<C869590Y9l> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OBZ)) {
            return false;
        }
        C0OBZ c0obz = (C0OBZ) obj;
        return Intrinsics.LJFF(this.LIZIZ, c0obz.LIZIZ) && this.LIZJ == c0obz.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0obz.LIZLLL);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnGetMessagesModel(convId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", messageList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "message_list")) {
            return new C595890NYt(this.LIZLLL);
        }
        return new TTMParamData("").getActualParamData();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        if (Intrinsics.LJFF(str, "source")) {
            return this.LIZJ;
        }
        return 0L;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        if (Intrinsics.LJFF(str, "conversation_id")) {
            return this.LIZIZ;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OBZ(String str, int i, List<? extends C869590Y9l> list) {
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = list;
    }
}
