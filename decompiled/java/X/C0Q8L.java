package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C0Q8L implements Serializable {
    public final String hintWord;
    public final String hintWordId;
    public final Word inboxWord;

    public C0Q8L() {
        this(null, null, null);
    }

    public final C0Q8L copy(String str, String str2, Word word) {
        return new C0Q8L(str, str2, word);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q8L)) {
            return false;
        }
        C0Q8L c0q8l = (C0Q8L) obj;
        return Intrinsics.LJFF(this.hintWord, c0q8l.hintWord) && Intrinsics.LJFF(this.hintWordId, c0q8l.hintWordId) && Intrinsics.LJFF(this.inboxWord, c0q8l.inboxWord);
    }

    public int hashCode() {
        String str = this.hintWord;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hintWordId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Word word = this.inboxWord;
        return iHashCode2 + (word != null ? word.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInputModel(hintWord=");
        sbLIZ.append(this.hintWord);
        sbLIZ.append(", hintWordId=");
        sbLIZ.append(this.hintWordId);
        sbLIZ.append(", inboxWord=");
        sbLIZ.append(this.inboxWord);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q8L(String str, String str2, Word word) {
        this.hintWord = str;
        this.hintWordId = str2;
        this.inboxWord = word;
    }
}
