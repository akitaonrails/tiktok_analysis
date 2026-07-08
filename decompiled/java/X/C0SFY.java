package X;

import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SFY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFY extends C09AY implements Function0<InteractAreaCommonAbility> {
    public final /* synthetic */ AutoPlayNextTriggerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFY(AutoPlayNextTriggerAssem autoPlayNextTriggerAssem) {
        super(0);
        this.LL = autoPlayNextTriggerAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaCommonAbility invoke() {
        return C1558520qew.LIZ((InterfaceC665370Q7z) this.LL.LLJJLIIIJLLLLLLLZ.getValue(), InteractAreaCommonAbility.class, null);
    }
}
