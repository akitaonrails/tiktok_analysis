package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673540QbQ implements InterfaceC0148002o {
    public final Word LL;
    public final TemplateData LLILLJJLI;
    public final TemplateData LLILLL;
    public final MiddleCouponModel LLILZ;
    public final C673680Qbe LLILZIL;

    public C673540QbQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C673540QbQ)) {
            return false;
        }
        C673540QbQ c673540QbQ = (C673540QbQ) obj;
        return Intrinsics.LJFF(this.LL, c673540QbQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c673540QbQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c673540QbQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c673540QbQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c673540QbQ.LLILZIL);
    }

    public final int hashCode() {
        Word word = this.LL;
        int iHashCode = (word == null ? 0 : word.hashCode()) * 31;
        TemplateData templateData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (templateData == null ? 0 : templateData.hashCode())) * 31;
        TemplateData templateData2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (templateData2 == null ? 0 : templateData2.hashCode())) * 31;
        MiddleCouponModel middleCouponModel = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (middleCouponModel == null ? 0 : middleCouponModel.hashCode())) * 31;
        C673680Qbe c673680Qbe = this.LLILZIL;
        return iHashCode4 + (c673680Qbe != null ? c673680Qbe.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestVMState(firstGuessWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", guessTemplateData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", newUserTemplateData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", couponData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", historyWordsState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C673540QbQ(int i) {
        this(null, null, null, null, null);
    }

    public C673540QbQ(Word word, TemplateData templateData, TemplateData templateData2, MiddleCouponModel middleCouponModel, C673680Qbe c673680Qbe) {
        this.LL = word;
        this.LLILLJJLI = templateData;
        this.LLILLL = templateData2;
        this.LLILZ = middleCouponModel;
        this.LLILZIL = c673680Qbe;
    }

    public static C673540QbQ LIZ(C673540QbQ c673540QbQ, Word word, TemplateData templateData, MiddleCouponModel middleCouponModel, C673680Qbe c673680Qbe, int i) {
        TemplateData templateData2;
        C673680Qbe c673680Qbe2 = c673680Qbe;
        MiddleCouponModel middleCouponModel2 = middleCouponModel;
        TemplateData templateData3 = templateData;
        Word word2 = word;
        if ((i & 1) != 0) {
            word2 = c673540QbQ.LL;
        }
        if ((i & 2) != 0) {
            templateData2 = c673540QbQ.LLILLJJLI;
        } else {
            templateData2 = null;
        }
        if ((i & 4) != 0) {
            templateData3 = c673540QbQ.LLILLL;
        }
        if ((i & 8) != 0) {
            middleCouponModel2 = c673540QbQ.LLILZ;
        }
        if ((i & 16) != 0) {
            c673680Qbe2 = c673540QbQ.LLILZIL;
        }
        c673540QbQ.getClass();
        return new C673540QbQ(word2, templateData2, templateData3, middleCouponModel2, c673680Qbe2);
    }
}
