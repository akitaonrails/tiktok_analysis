package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0bVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975920bVG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C975910bVF LL;
    public final /* synthetic */ EnumC974980bTk LLILLJJLI;
    public final /* synthetic */ EnumC975850bV9 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ GiftMode LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<EnumC919170a1j, List<C954460awe>, List<C954460awe>, Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975920bVG(C975910bVF c975910bVF, EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, boolean z, String str, GiftMode giftMode, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function0, Function0 function02, Function0 function03, AwS416S0200000_15 awS416S0200000_15) {
        super(0);
        this.LL = c975910bVF;
        this.LLILLJJLI = enumC974980bTk;
        this.LLILLL = enumC975850bV9;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = giftMode;
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = function0;
        this.LLJ = function02;
        this.LLJI = function03;
        this.LLJIJIL = awS416S0200000_15;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ("CombinedMatchPreparingCoordinator", "presentInvitationPanel, callback to re show invitation panel");
        this.LL.LJJIJL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
        return Unit.LIZ;
    }
}
