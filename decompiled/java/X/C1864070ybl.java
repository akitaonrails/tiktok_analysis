package X;

import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: renamed from: X.0ybl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1864070ybl extends C09AY implements Function1<C20234214Fg, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C20229014Dg LLILZ;
    public final /* synthetic */ SmartSearchItem LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ TakoEntranceRequestInfo LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ List<String> LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864070ybl(long j, boolean z, String str, C20229014Dg c20229014Dg, SmartSearchItem smartSearchItem, String str2, TakoEntranceRequestInfo takoEntranceRequestInfo, String str3, String str4, String str5, Integer num, List<String> list, String str6) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c20229014Dg;
        this.LLILZIL = smartSearchItem;
        this.LLILZLL = str2;
        this.LLIZ = takoEntranceRequestInfo;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = num;
        this.LLJILJIL = list;
        this.LLJILJILJ = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20234214Fg c20234214Fg) {
        EnumC1864410ycJ enumC1864410ycJ;
        C20234214Fg c20234214Fg2 = c20234214Fg;
        c20234214Fg2.LIZ = this.LL;
        if (this.LLILLJJLI) {
            enumC1864410ycJ = EnumC1864410ycJ.FULL_SCREEN;
        } else {
            enumC1864410ycJ = EnumC1864410ycJ.SEVEN_SPLIT_SCREEN;
        }
        c20234214Fg2.LJFF(enumC1864410ycJ, new AwS396S0200000_30(this.LLILZ, this.LLILZIL, 7));
        String str = this.LLILLL;
        if (str != null) {
            c20234214Fg2.LIZJ(str, this.LLILZLL, new AwS393S0200000_27(this.LLIZ, this.LLILZIL, 7));
        }
        String str2 = this.LLIZLLLIL;
        String str3 = this.LLJ;
        if ((str2 != null && str2.length() > 0) || (str3 != null && str3.length() > 0)) {
            c20234214Fg2.LJ(new C1863950ybZ(this.LLJI, this.LLIZLLLIL, this.LLILZLL, this.LLJ, this.LLJIJIL, this.LLILZIL, this.LLJILJIL));
        }
        c20234214Fg2.LIZLLL(new C1862440yZ8(this.LLJILJILJ, this.LLJI, this.LLILZIL));
        return Unit.LIZ;
    }
}
