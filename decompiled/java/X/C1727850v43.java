package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsSingleSelectCell;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727850v43 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ PcsSingleSelectCell LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727850v43(PcsSingleSelectCell pcsSingleSelectCell, String str) {
        super(0);
        this.LL = pcsSingleSelectCell;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1749140vcO c1749140vcO = this.LL.LLILZIL;
        if (c1749140vcO != null) {
            c1749140vcO.setText(this.LLILLJJLI);
        }
        this.LL.T5(this.LLILLJJLI);
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
            final PcsSingleSelectCell pcsSingleSelectCell = this.LL;
            HandlerHook.viewPost(pcsSingleSelectCell.itemView, new Runnable() { // from class: X.0v3z
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsSingleSelectCell@e839.openOptions$menuActions$1$1$1");
                    try {
                        pcsSingleSelectCell.N5();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsSingleSelectCell@e839.openOptions$menuActions$1$1$1");
                }
            });
        }
        return Boolean.TRUE;
    }
}
