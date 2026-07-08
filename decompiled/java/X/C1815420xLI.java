package X;

import android.widget.ImageView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouUpdateCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815420xLI extends C09AY implements Function0<ImageView> {
    public final /* synthetic */ IntelligentTemplateForYouUpdateCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815420xLI(IntelligentTemplateForYouUpdateCell intelligentTemplateForYouUpdateCell) {
        super(0);
        this.LL = intelligentTemplateForYouUpdateCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.ImageView] */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        return this.LL.itemView.findViewById(R.id.kur);
    }
}
