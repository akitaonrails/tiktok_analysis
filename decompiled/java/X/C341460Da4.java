package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Da4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341460Da4 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ThoughtInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341460Da4(ThoughtInfo thoughtInfo, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2) {
        super(2);
        this.LL = thoughtInfo;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = function03;
        this.LLIZ = function04;
        this.LLIZLLLIL = function05;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668710tWf.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
