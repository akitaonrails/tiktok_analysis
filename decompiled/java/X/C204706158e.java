package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.158e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204706158e extends C09AY implements Function1<EnumC919030a1V, Unit> {
    public final /* synthetic */ MatchHammerViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204706158e(MatchHammerViewModel matchHammerViewModel) {
        super(1);
        this.LL = matchHammerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC919030a1V enumC919030a1V) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive self hammer state = ");
        sbLIZ.append(enumC919030a1V);
        C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        MatchHammerViewModel matchHammerViewModel = this.LL;
        if (enumC919030a1V == EnumC919030a1V.EFFECTING) {
            z = true;
        } else {
            z = false;
        }
        matchHammerViewModel.LLJLILLLLZIIL = z;
        if (C915980Zwa.LJII().L6() && C915980Zwa.LJFF().co0()) {
            C766270U4b.LIZLLL(2131851679);
        }
        if (enumC919030a1V == EnumC919030a1V.NORMAL) {
            this.LL.LLJJI.clear();
            this.LL.LLJJIJIIJIL = false;
            this.LL.setState(AFwS276S0000000_31.get$arr$(25));
            this.LL.NQ2("self effect expired");
        }
        return Unit.LIZ;
    }
}
