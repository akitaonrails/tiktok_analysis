package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TP6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TP6 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ AdEntryShareSheetFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1668880tWw LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C1668880tWw LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TP6(AdEntryShareSheetFragment adEntryShareSheetFragment, String str, C1668880tWw c1668880tWw, int i, Function0<Unit> function0, C1668880tWw c1668880tWw2, boolean z, int i2, int i3) {
        super(2);
        this.LL = adEntryShareSheetFragment;
        this.LLILLJJLI = str;
        this.LLILLL = c1668880tWw;
        this.LLILZ = i;
        this.LLILZIL = function0;
        this.LLILZLL = c1668880tWw2;
        this.LLIZ = z;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.NR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
