package X;

import com.lynx.tasm.TemplateBundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PM7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PM7 implements InterfaceC1618170sD9<C0PM7> {
    public final long LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final HashMap<String, TemplateBundle> LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;

    public C0PM7() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PM7)) {
            return false;
        }
        C0PM7 c0pm7 = (C0PM7) obj;
        return this.LL == c0pm7.LL && this.LLILLJJLI == c0pm7.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0pm7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pm7.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0pm7.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0pm7.LLILZLL) && this.LLIZ == c0pm7.LLIZ;
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        String str = this.LLILZLL;
        return ((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZ;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_session_id", Long.valueOf(this.LL));
        linkedHashMap.put("search_session_id", Long.valueOf(this.LLILLJJLI));
        linkedHashMap.put("last_feed_group_id", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSessionState(searchSessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", endToEndSessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lastFeedGroupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", lastFeedGroupIdNew=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", templateBundle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", inspireId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", disableReorder=");
        sbLIZ.append(this.LLIZ);
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

    public /* synthetic */ C0PM7(int i) {
        this(0L, 0L, "", "", new HashMap(), null, 0);
    }

    public C0PM7(long j, long j2, String str, String str2, HashMap<String, TemplateBundle> map, String str3, int i) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
        this.LLILZLL = str3;
        this.LLIZ = i;
        C0P8T.LIZ();
    }

    public static C0PM7 LIZ(C0PM7 c0pm7, long j, long j2, String str, String str2, String str3, int i, int i2) {
        HashMap<String, TemplateBundle> map;
        int i3 = i;
        String str4 = str3;
        String str5 = str;
        long j3 = j2;
        String str6 = str2;
        long j4 = j;
        if ((i2 & 1) != 0) {
            j4 = c0pm7.LL;
        }
        if ((i2 & 2) != 0) {
            j3 = c0pm7.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str5 = c0pm7.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str6 = c0pm7.LLILZ;
        }
        if ((i2 & 16) != 0) {
            map = c0pm7.LLILZIL;
        } else {
            map = null;
        }
        if ((i2 & 32) != 0) {
            str4 = c0pm7.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            i3 = c0pm7.LLIZ;
        }
        c0pm7.getClass();
        return new C0PM7(j4, j3, str5, str6, map, str4, i3);
    }
}
