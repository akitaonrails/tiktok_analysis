package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673550QbR implements InterfaceC0148002o {
    public final Word LL;
    public final TemplateData LLILLJJLI;
    public final C673510QbN LLILLL;
    public final MiddleCouponModel LLILZ;
    public final C673680Qbe LLILZIL;

    public C673550QbR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C673550QbR)) {
            return false;
        }
        C673550QbR c673550QbR = (C673550QbR) obj;
        return Intrinsics.LJFF(this.LL, c673550QbR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c673550QbR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c673550QbR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c673550QbR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c673550QbR.LLILZIL);
    }

    public final int hashCode() {
        Word word = this.LL;
        int iHashCode = (word == null ? 0 : word.hashCode()) * 31;
        TemplateData templateData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (templateData == null ? 0 : templateData.hashCode())) * 31;
        C673510QbN c673510QbN = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c673510QbN == null ? 0 : c673510QbN.hashCode())) * 31;
        MiddleCouponModel middleCouponModel = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (middleCouponModel == null ? 0 : middleCouponModel.hashCode())) * 31;
        C673680Qbe c673680Qbe = this.LLILZIL;
        return iHashCode4 + (c673680Qbe != null ? c673680Qbe.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSuggestStateNew(firstGuessWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newUserTemplateData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", guessData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", couponData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", historyWordsState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C673550QbR(int i) {
        this(null, null, null, null, null);
    }

    public C673550QbR(Word word, TemplateData templateData, C673510QbN c673510QbN, MiddleCouponModel middleCouponModel, C673680Qbe c673680Qbe) {
        this.LL = word;
        this.LLILLJJLI = templateData;
        this.LLILLL = c673510QbN;
        this.LLILZ = middleCouponModel;
        this.LLILZIL = c673680Qbe;
    }

    public static C673550QbR LIZ(C673550QbR c673550QbR, Word word, TemplateData templateData, C673510QbN c673510QbN, MiddleCouponModel middleCouponModel, C673680Qbe c673680Qbe, int i) {
        C673680Qbe c673680Qbe2 = c673680Qbe;
        MiddleCouponModel middleCouponModel2 = middleCouponModel;
        C673510QbN c673510QbN2 = c673510QbN;
        TemplateData templateData2 = templateData;
        Word word2 = word;
        if ((i & 1) != 0) {
            word2 = c673550QbR.LL;
        }
        if ((i & 2) != 0) {
            templateData2 = c673550QbR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c673510QbN2 = c673550QbR.LLILLL;
        }
        if ((i & 8) != 0) {
            middleCouponModel2 = c673550QbR.LLILZ;
        }
        if ((i & 16) != 0) {
            c673680Qbe2 = c673550QbR.LLILZIL;
        }
        c673550QbR.getClass();
        return new C673550QbR(word2, templateData2, c673510QbN2, middleCouponModel2, c673680Qbe2);
    }
}
