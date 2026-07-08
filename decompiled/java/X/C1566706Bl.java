package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566706Bl extends C09AY implements Function1<InterfaceC1566906Bn, Unit> {
    public final /* synthetic */ C06BD LL;
    public final /* synthetic */ EnumC1567006Bo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StreakData LLILZ;
    public final /* synthetic */ StreakData LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566706Bl(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        super(1);
        this.LL = c06bd;
        this.LLILLJJLI = enumC1567006Bo;
        this.LLILLL = str;
        this.LLILZ = streakData;
        this.LLILZIL = streakData2;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1566906Bn interfaceC1566906Bn) {
        interfaceC1566906Bn.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
