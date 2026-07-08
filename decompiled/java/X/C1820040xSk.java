package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.cell.IntelligentDecorationBoardForYouPowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820040xSk extends C09AY implements Function0<C197039127h> {
    public final /* synthetic */ IntelligentDecorationBoardForYouPowerCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820040xSk(IntelligentDecorationBoardForYouPowerCell intelligentDecorationBoardForYouPowerCell) {
        super(0);
        this.LL = intelligentDecorationBoardForYouPowerCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.127h, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C197039127h invoke() {
        return this.LL.itemView.findViewById(R.id.use_template_button);
    }
}
