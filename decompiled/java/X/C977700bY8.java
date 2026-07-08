package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977700bY8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C977560bXu LL;
    public final /* synthetic */ EnumC975850bV9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ GiftMode LLILZLL;
    public final /* synthetic */ Function1<EnumC919170a1j, Unit> LLIZ;
    public final /* synthetic */ InterfaceC1631620sYq<Long, EnumC919170a1j, List<TeamUser>, Unit> LLIZLLLIL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLJ;
    public final /* synthetic */ Function2<EnumC976510bWD, Boolean, Unit> LLJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJIJIL;
    public final /* synthetic */ Function1<Long, Unit> LLJILJIL;
    public final /* synthetic */ Function0<Unit> LLJILJILJ;
    public final /* synthetic */ Function0<Unit> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C977700bY8(C977560bXu c977560bXu, EnumC975850bV9 enumC975850bV9, boolean z, boolean z2, String str, GiftMode giftMode, Function1<? super EnumC919170a1j, Unit> function1, InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq, Function2<? super Boolean, ? super Boolean, Unit> function2, Function2<? super EnumC976510bWD, ? super Boolean, Unit> function22, Function1<? super Boolean, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.LL = c977560bXu;
        this.LLILLJJLI = enumC975850bV9;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str;
        this.LLILZLL = giftMode;
        this.LLIZ = function1;
        this.LLIZLLLIL = interfaceC1631620sYq;
        this.LLJ = function2;
        this.LLJI = function22;
        this.LLJIJIL = function12;
        this.LLJILJIL = function13;
        this.LLJILJILJ = function0;
        this.LLJILLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIJJ(this.LLILLJJLI, false, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL);
        return Unit.LIZ;
    }
}
