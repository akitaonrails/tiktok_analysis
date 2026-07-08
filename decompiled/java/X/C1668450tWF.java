package X;

import com.ss.android.ugc.aweme.subscription.model.PerkData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668450tWF extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C717180SBg LL;
    public final /* synthetic */ InterfaceC1670590tZh LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1665500tRU<PerkData> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668450tWF(C717180SBg c717180SBg, InterfaceC1670590tZh interfaceC1670590tZh, String str, String str2, String str3, InterfaceC1665500tRU<PerkData> interfaceC1665500tRU, Function0<Unit> function0, boolean z, int i) {
        super(2);
        this.LL = c717180SBg;
        this.LLILLJJLI = interfaceC1670590tZh;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = interfaceC1665500tRU;
        this.LLIZ = function0;
        this.LLIZLLLIL = z;
        this.LLJ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668430tWD.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1));
        return Unit.LIZ;
    }
}
