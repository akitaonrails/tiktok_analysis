package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PV3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PV3 {
    public static final C0PV3 LIZ = new C0PV3();

    public static void LIZIZ(ClickSearchWord clickSearchWord, View view, Context context, C653660PkS c653660PkS) {
        String str;
        String str2;
        String wordSource;
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C653660PkS c653660PkS2 = new C653660PkS();
        c653660PkS2.LJFF = ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLIZLLLIL;
        if (c653660PkS == null || (str = c653660PkS.LJIIL) == null) {
            str = ((C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ()).LL;
        }
        c653660PkS2.LJIIJJI = str;
        if (c653660PkS != null) {
            str2 = c653660PkS.LJJJJLI;
        } else {
            str2 = null;
        }
        c653660PkS2.LJJJJLI = str2;
        c653660PkS2.LJI = "general";
        Word word = clickSearchWord.wordRecord;
        if (word == null || (wordSource = word.getWordSource()) == null) {
            wordSource = "";
        }
        C670730QSp.LIZIZ(view, context, c653660PkS2, word, wordSource, null, C0QN9.CS, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da A[PHI: r9
      0x01da: PHI (r9v1 X.0PRC) = (r9v0 X.0PRC), (r9v3 X.0PRC) binds: [B:72:0x01d6, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord r11, android.view.View r12, X.C653660PkS r13, java.lang.String r14, X.C0PUB r15) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PV3.LIZ(com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord, android.view.View, X.0PkS, java.lang.String, X.0PUB):void");
    }
}
