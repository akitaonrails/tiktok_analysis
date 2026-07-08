package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Da6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341480Da6 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ ThoughtInfo LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC1665500tRU<User> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ int LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C341480Da6(ThoughtInfo thoughtInfo, User user, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function2<? super Boolean, ? super String, Unit> function2, Function0<Unit> function0, boolean z, InterfaceC1665500tRU<? extends User> interfaceC1665500tRU, Function0<Unit> function02, boolean z2, Function0<Unit> function03, int i, int i2, int i3) {
        super(2);
        this.LL = thoughtInfo;
        this.LLILLJJLI = user;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function2;
        this.LLILZLL = function0;
        this.LLIZ = z;
        this.LLIZLLLIL = interfaceC1665500tRU;
        this.LLJ = function02;
        this.LLJI = z2;
        this.LLJIJIL = function03;
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        this.LLJILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1675730thz.LJII(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJILJIL | 1), C341440Da2.LIZ(this.LLJILJILJ), this.LLJILLL);
        return Unit.LIZ;
    }
}
