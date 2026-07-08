package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.ChatIntro;
import com.ss.android.ugc.aweme.im.b2c.landing.KeywordReply;
import com.ss.android.ugc.aweme.im.b2c.landing.SuggestedQuestion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1736506r5 implements InterfaceC0148002o {
    public final int LL;
    public final List<BusinessAutoMessage> LLILLJJLI;
    public final List<SuggestedQuestion> LLILLL;
    public final List<KeywordReply> LLILZ;
    public final String LLILZIL;
    public final List<ChatIntro> LLILZLL;
    public final List<C869590Y9l> LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;

    public C1736506r5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736506r5)) {
            return false;
        }
        C1736506r5 c1736506r5 = (C1736506r5) obj;
        return this.LL == c1736506r5.LL && Intrinsics.LJFF(this.LLILLJJLI, c1736506r5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1736506r5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1736506r5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1736506r5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1736506r5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1736506r5.LLIZ) && this.LLIZLLLIL == c1736506r5.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1736506r5.LLJ);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        List<BusinessAutoMessage> list = this.LLILLJJLI;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<SuggestedQuestion> list2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KeywordReply> list3 = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        List<ChatIntro> list4 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<C869590Y9l> list5 = this.LLIZ;
        return ((((iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessChatLandingMsgState(source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", landingMessages=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", suggestedQuestions=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", keywordReplies=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", suggestedQuestionTips=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", chatIntro=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", fakeMessages=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", needHandleFirstInteract=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", setBy=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1736506r5(int i) {
        this(0, null, null, null, "", null, null, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1736506r5(int i, List<BusinessAutoMessage> list, List<SuggestedQuestion> list2, List<KeywordReply> list3, String str, List<ChatIntro> list4, List<? extends C869590Y9l> list5, boolean z, String str2) {
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = list3;
        this.LLILZIL = str;
        this.LLILZLL = list4;
        this.LLIZ = list5;
        this.LLIZLLLIL = z;
        this.LLJ = str2;
    }

    public static C1736506r5 LIZ(C1736506r5 c1736506r5, int i, List list, List list2, List list3, String str, List list4, List list5, boolean z, String str2, int i2) {
        String str3 = str2;
        boolean z2 = z;
        List list6 = list5;
        List list7 = list4;
        String str4 = str;
        List list8 = list3;
        List list9 = list2;
        List list10 = list;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c1736506r5.LL;
        }
        if ((i2 & 2) != 0) {
            list10 = c1736506r5.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            list9 = c1736506r5.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list8 = c1736506r5.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str4 = c1736506r5.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            list7 = c1736506r5.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            list6 = c1736506r5.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z2 = c1736506r5.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            str3 = c1736506r5.LLJ;
        }
        c1736506r5.getClass();
        return new C1736506r5(i3, list10, list9, list8, str4, list7, list6, z2, str3);
    }
}
