package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0077, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0077 implements InterfaceC1282004zy {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public AnonymousClass0077() {
        this(0, 0, "");
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0077)) {
            return false;
        }
        AnonymousClass0077 anonymousClass0077 = (AnonymousClass0077) obj;
        return this.LL == anonymousClass0077.LL && this.LLILLJJLI == anonymousClass0077.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, anonymousClass0077.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("danmaku_length", Integer.valueOf(this.LL));
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("enter_method", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuCreateItemParams(danmakuLen=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLandscapeScreen=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public AnonymousClass0077(int i, int i2, String str) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
    }
}
