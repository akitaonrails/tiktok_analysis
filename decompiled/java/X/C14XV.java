package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14XV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XV extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C14XN LLILZ;
    public final /* synthetic */ Question LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14XV(Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12, String str, C14XN c14xn, Question question) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = str;
        this.LLILZ = c14xn;
        this.LLILZIL = question;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str;
        Integer numValueOf;
        Option option;
        int iIntValue = num.intValue();
        this.LL.invoke(Integer.valueOf(iIntValue));
        this.LLILLJJLI.invoke(Boolean.FALSE);
        C14XX c14xx = new C14XX();
        c14xx.LIZ = iIntValue;
        c14xx.LIZIZ = false;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C988000bok.LIZ().LJI(this.LLILLL, c14xx);
        this.LLILZ.LJJIJIIJI();
        C14ZT c14zt = C14ZT.LIZ;
        C14XN c14xn = this.LLILZ;
        Aweme aweme = c14xn.LL;
        C14Z0 c14z0 = c14xn.LLILLL;
        FeedSurvey feedSurvey = c14xn.LLILLJJLI;
        Integer numValueOf2 = null;
        if (feedSurvey != null) {
            str = feedSurvey.id;
        } else {
            str = null;
        }
        Option[] optionArr = this.LLILZIL.options;
        if (optionArr != null && (option = optionArr[iIntValue]) != null) {
            numValueOf = Integer.valueOf(option.id);
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        C14Z9 c14z9 = C14ZA.Companion;
        Question question = this.LLILZIL;
        if (question != null) {
            numValueOf2 = Integer.valueOf(question.type);
        }
        c14z9.getClass();
        C14ZT.LJI(c14zt, aweme, c14z0, str, strValueOf, C14Z9.LIZ(numValueOf2));
        return Unit.LIZ;
    }
}
