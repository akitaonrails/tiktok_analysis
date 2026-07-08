package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688190Qz3 {
    public WordStruct LIZIZ;
    public String LJ;
    public PromotionInfo LJFF;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJJI;
    public List<WordStruct> LIZ = C13BV.INSTANCE;
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJI = "";
    public String LJIIJ = "";

    public final String LIZ() {
        RichSugInfo richSugInfo;
        WordStruct wordStruct = this.LIZIZ;
        if (wordStruct == null || (richSugInfo = wordStruct.getRichSugInfo()) == null) {
            return null;
        }
        return richSugInfo.sugIconUri;
    }

    public final String LIZIZ() {
        String word;
        if (this.LIZ.size() > 0) {
            return ((WordStruct) ListProtector.get(this.LIZ, 0)).getWord();
        }
        WordStruct wordStruct = (WordStruct) C13LP.LJJJLL(this.LIZ);
        return (wordStruct == null || (word = wordStruct.getWord()) == null) ? "" : word;
    }

    public final boolean LIZJ() {
        return Intrinsics.LJFF(this.LJ, EnumC311480CIw.POPULAR_WORDS.getType());
    }

    public final void LIZLLL(int i) {
        String word;
        String wordId;
        Word wordRecord;
        String wordId2 = "";
        if (this.LIZ.size() > i) {
            word = ((WordStruct) ListProtector.get(this.LIZ, i)).getWord();
        } else {
            WordStruct wordStruct = (WordStruct) C13LP.LJJJLL(this.LIZ);
            if (wordStruct == null || (word = wordStruct.getWord()) == null) {
                word = "";
            }
        }
        this.LIZJ = word;
        if (this.LIZ.size() > i) {
            wordId2 = ((WordStruct) ListProtector.get(this.LIZ, i)).getWordId();
        } else {
            WordStruct wordStruct2 = (WordStruct) C13LP.LJJJLL(this.LIZ);
            if (wordStruct2 != null && (wordId = wordStruct2.getWordId()) != null) {
                wordId2 = wordId;
            }
        }
        this.LIZLLL = wordId2;
        Boolean boolIsPersonalized = null;
        if (this.LIZ.size() > i) {
            Word wordRecord2 = ((WordStruct) ListProtector.get(this.LIZ, i)).getWordRecord();
            if (wordRecord2 != null) {
                boolIsPersonalized = wordRecord2.isPersonalized();
            }
        } else {
            WordStruct wordStruct3 = (WordStruct) C13LP.LJJJLL(this.LIZ);
            if (wordStruct3 != null && (wordRecord = wordStruct3.getWordRecord()) != null) {
                boolIsPersonalized = wordRecord.isPersonalized();
            }
        }
        this.LJIIJJI = boolIsPersonalized;
    }
}
