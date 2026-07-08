package X;

import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19667611xC extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C14XN LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Question LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19667611xC(C14XN c14xn, String str, int i, boolean z, Question question, int i2, boolean z2, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12, int i3) {
        super(2);
        this.LL = c14xn;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = question;
        this.LLILZLL = i2;
        this.LLIZ = z2;
        this.LLIZLLLIL = function1;
        this.LLJ = function12;
        this.LLJI = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LJJIFFI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1));
        return Unit.LIZ;
    }
}
