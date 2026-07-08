package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouUpdateCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815430xLJ extends C09AY implements Function0<C16F5> {
    public final /* synthetic */ IntelligentTemplateForYouUpdateCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815430xLJ(IntelligentTemplateForYouUpdateCell intelligentTemplateForYouUpdateCell) {
        super(0);
        this.LL = intelligentTemplateForYouUpdateCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16F5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C16F5 invoke() {
        return this.LL.itemView.findViewById(R.id.kus);
    }
}
