package X;

import Y.ARunnableS99S0200000_30;
import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14XW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ C14XN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Question LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14XW(Function1<? super Boolean, Unit> function1, C14XN c14xn, String str, int i, Question question) {
        super(0);
        this.LL = function1;
        this.LLILLJJLI = c14xn;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = question;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Option option;
        this.LL.invoke(Boolean.TRUE);
        C14XN c14xn = this.LLILLJJLI;
        String str = this.LLILLL;
        int i = this.LLILZ;
        Question question = this.LLILZIL;
        c14xn.getClass();
        if (i >= 0) {
            C14ZW.LIZ.getClass();
            C14ZG c14zgLJII = C14ZW.LJII(str);
            if (c14zgLJII != null) {
                C20291314aV.LIZ.getClass();
                Integer num = c14zgLJII.LJIIIIZZ;
                if (num != null) {
                    num.intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("max_submit_times_");
                    sbLIZ.append(c14zgLJII.LIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C20291314aV.LIZLLL().storeInt(strLIZIZ, C20291314aV.LIZLLL().getInt(strLIZIZ, 0) + 1);
                }
            }
            c14xn.LJJIJIIJI();
            C259800zU c259800zU = new C259800zU();
            Option[] optionArr = question.options;
            if (optionArr != null && (option = optionArr[i]) != null) {
                c14xn.LJIILLIIL(option);
                String str2 = option.toast;
                T string = str2;
                if (str2 == null) {
                    Context context = c14xn.LLJIJIL;
                    string = context != null ? context.getString(2131849337) : 0;
                }
                c259800zU.element = string;
            }
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20283314Yd c20283314YdLIZIZ = C988000bok.LIZ().LIZIZ(str);
            if (c20283314YdLIZIZ != null) {
                c20283314YdLIZIZ.LJII = true;
                C988000bok.LIZ().LJFF(str, c20283314YdLIZIZ);
            }
            C14XX c14xx = new C14XX();
            c14xx.LIZ = i;
            c14xx.LIZIZ = true;
            C988000bok.LIZ().LJI(str, c14xx);
            C1440005kM.LIZ(new C483280IxK());
            C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS99S0200000_30(c14xn, c259800zU, 14));
        }
        return Unit.LIZ;
    }
}
