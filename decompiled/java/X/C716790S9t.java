package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716790S9t extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC20660615sy LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716790S9t(InterfaceC20660615sy interfaceC20660615sy, String str, int i, boolean z) {
        super(0);
        this.LL = interfaceC20660615sy;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = C0BFQ.LIZ;
        if (j != -1) {
            Long lValueOf = Long.valueOf(j);
            final InterfaceC20660615sy interfaceC20660615sy = this.LL;
            final String str = this.LLILLJJLI;
            final int i = this.LLILLL;
            final boolean z = this.LLILZ;
            C0CN5.LIZJ(lValueOf, new Runnable() { // from class: X.0S9s
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SpecActServiceImpl@4099.triggerShowDynamicPopup$1$1");
                    try {
                        PopupManager.LJIJI(new DynamicPopupTask(interfaceC20660615sy, str, i, z), true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SpecActServiceImpl@4099.triggerShowDynamicPopup$1$1");
                }
            }, false);
        } else {
            PopupManager.LJIJI(new DynamicPopupTask(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ), true);
        }
        return Unit.LIZ;
    }
}
