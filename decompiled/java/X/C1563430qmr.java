package X;

import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563430qmr extends C09AY implements Function1<C0RUS, Unit> {
    public final /* synthetic */ TabAbilityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563430qmr(TabAbilityAssem tabAbilityAssem) {
        super(1);
        this.LL = tabAbilityAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LLILZIL = this.LL;
        return Unit.LIZ;
    }
}
