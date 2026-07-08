package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.ui.GamePartnershipWebviewDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838230xw5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ GamePartnershipService LLILLL;
    public final /* synthetic */ GamePartnershipWebviewDialog LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838230xw5(C19EG c19eg, FragmentManager fragmentManager, GamePartnershipService gamePartnershipService, GamePartnershipWebviewDialog gamePartnershipWebviewDialog) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = gamePartnershipService;
        this.LLILZ = gamePartnershipWebviewDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL.isFinishing() && !this.LL.isDestroyed() && !this.LLILLJJLI.LJLJJI()) {
            Long l = this.LLILLL.LLJILJILJ.get(this.LL);
            if (l != null && l.longValue() != 0) {
                C19322110iZ.LIZ(l.longValue());
            }
            this.LLILLL.LLJILJILJ.put(this.LL, Long.valueOf(C19322110iZ.LJFF(this.LLILLJJLI, this.LLILZ, "GamePartnershipWebviewDialog", null, 0)));
        }
        return Unit.LIZ;
    }
}
