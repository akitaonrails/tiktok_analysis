package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19661811wG extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Option[] LL;
    public final /* synthetic */ C14XN LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<Long, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19661811wG(Option[] optionArr, C14XN c14xn, long j, boolean z, Function1<? super Long, Unit> function1) {
        super(2);
        this.LL = optionArr;
        this.LLILLJJLI = c14xn;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            int length = this.LL.length;
            for (int i = 0; i < length; i++) {
                this.LLILLJJLI.LJIL(this.LLILLL, i, this.LL[i].name, this.LLILZ, this.LLILZIL, interfaceC1680500tpg2, 0);
            }
        }
        return Unit.LIZ;
    }
}
