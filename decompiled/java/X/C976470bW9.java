package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;

/* JADX INFO: renamed from: X.0bW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976470bW9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C976110bVZ LL;
    public final /* synthetic */ LinkMicBattleMessage LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<List<C954460awe>, List<C954460awe>, EnumC919170a1j, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<EnumC976390bW1, Unit> LLJ;
    public final /* synthetic */ Function1<EnumC976390bW1, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976470bW9(C976110bVZ c976110bVZ, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, boolean z, boolean z2, boolean z3, AwS664S0100000_15 awS664S0100000_15, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152, AwS594S0100000_15 awS594S0100000_153) {
        super(0);
        this.LL = c976110bVZ;
        this.LLILLJJLI = linkMicBattleMessage;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = awS664S0100000_15;
        this.LLIZ = awS559S0100000_15;
        this.LLIZLLLIL = awS594S0100000_15;
        this.LLJ = awS594S0100000_152;
        this.LLJI = awS594S0100000_153;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
