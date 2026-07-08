package X;

import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981130bdf extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ MatchOptionViewModel LL;
    public final /* synthetic */ C980430bcX LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C981130bdf(MatchOptionViewModel matchOptionViewModel, C980430bcX c980430bcX, boolean z, int i) {
        super(2);
        this.LL = matchOptionViewModel;
        this.LLILLJJLI = c980430bcX;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669850tYV.LJIIIIZZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
