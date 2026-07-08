package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598960NeQ extends AbstractC598980NeS {
    public final String LIZ;
    public final InterfaceC634840OvC LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C598960NeQ)) {
            return false;
        }
        C598960NeQ c598960NeQ = (C598960NeQ) obj;
        return Intrinsics.LJFF(this.LIZ, c598960NeQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c598960NeQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c598960NeQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c598960NeQ.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxPending(callbackId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C598960NeQ(String str, InterfaceC634840OvC interfaceC634840OvC, String str2, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = interfaceC634840OvC;
        this.LIZJ = str2;
        this.LIZLLL = jSONObject;
    }
}
