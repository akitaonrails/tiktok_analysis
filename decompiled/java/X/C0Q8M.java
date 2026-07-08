package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8M implements InterfaceC1618170sD9<C0Q8M> {
    public final String LL;
    public final String LLILLJJLI;
    public final Word LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0Q8M() {
        String str = null;
        this(str, str, 31);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q8M)) {
            return false;
        }
        C0Q8M c0q8m = (C0Q8M) obj;
        return Intrinsics.LJFF(this.LL, c0q8m.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q8m.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0q8m.LLILLL) && this.LLILZ == c0q8m.LLILZ && this.LLILZIL == c0q8m.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Word word = this.LLILLL;
        return ((((iHashCode + (word == null ? 0 : word.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hint_word", this.LL);
        linkedHashMap.put("hint_word_id", this.LLILLJJLI);
        linkedHashMap.put("inbox_word", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInputState(hintWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hintWordId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inboxWord=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", openKeyboardWhenResumeInMiddle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", openKeyboardWhenResumeInSug=");
        sbLIZ.append(this.LLILZIL);
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

    public /* synthetic */ C0Q8M(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", null, false, false);
    }

    public C0Q8M(String str, String str2, Word word, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = word;
        this.LLILZ = z;
        this.LLILZIL = z2;
        C0P8T.LIZ();
    }

    public static C0Q8M LIZ(C0Q8M c0q8m, String str, boolean z, boolean z2, int i) {
        String str2;
        boolean z3 = z2;
        boolean z4 = z;
        String str3 = str;
        if ((i & 1) != 0) {
            str3 = c0q8m.LL;
        }
        Word word = null;
        if ((i & 2) != 0) {
            str2 = c0q8m.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            word = c0q8m.LLILLL;
        }
        if ((i & 8) != 0) {
            z4 = c0q8m.LLILZ;
        }
        if ((i & 16) != 0) {
            z3 = c0q8m.LLILZIL;
        }
        c0q8m.getClass();
        return new C0Q8M(str3, str2, word, z4, z3);
    }
}
