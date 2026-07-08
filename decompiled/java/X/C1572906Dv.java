package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1572906Dv extends C09AY implements Function1<InterfaceC1573006Dw, Unit> {
    public final /* synthetic */ StreakPetData LL;
    public final /* synthetic */ StreakPetData LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C06CF LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572906Dv(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
        super(1);
        this.LL = streakPetData;
        this.LLILLJJLI = streakPetData2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = c06cf;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1573006Dw interfaceC1573006Dw) {
        interfaceC1573006Dw.Hf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
