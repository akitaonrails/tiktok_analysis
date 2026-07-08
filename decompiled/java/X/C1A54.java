package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A54, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A54 extends C09AY implements Function0<Object> {
    public final /* synthetic */ GameLiveBottomBarAssemTriggerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A54(GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2) {
        super(0);
        this.LL = gameLiveBottomBarAssemTriggerV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected ,is disposed ");
        C11JF c11jf = this.LL.LLJL;
        sbLIZ.append(c11jf != null ? Boolean.valueOf(c11jf.isDisposed()) : null);
        sbLIZ.append(" , ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
