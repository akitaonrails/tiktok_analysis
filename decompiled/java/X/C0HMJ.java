package X;

import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMJ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ BaseSocialAvatarCreationVM LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<C439660HLw, InterfaceC439650HLv, InterfaceC1680500tpg, Integer, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HMJ(BaseSocialAvatarCreationVM baseSocialAvatarCreationVM, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1631630sYr<? super C439660HLw, ? super InterfaceC439650HLv, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, boolean z, String str, long j, Function0<Unit> function03, int i, int i2) {
        super(2);
        this.LL = baseSocialAvatarCreationVM;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = interfaceC1631630sYr;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = function03;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C444390Hbh.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
