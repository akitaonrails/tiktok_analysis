package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698290RaF extends C09AY implements Function0<IMFToolBarAbility> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698290RaF(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IMFToolBarAbility invoke() {
        C19EG c19egLIZ;
        C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
        if (c0rjnLIZIZ == null || (c19egLIZ = c0rjnLIZIZ.LIZ()) == null) {
            return null;
        }
        return C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), IMFToolBarAbility.class, null);
    }
}
