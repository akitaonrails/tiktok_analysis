package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouDecorationCell;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828960xh8 extends C09AY implements Function0<RadiusLayout> {
    public final /* synthetic */ IntelligentTemplateForYouDecorationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828960xh8(IntelligentTemplateForYouDecorationCell intelligentTemplateForYouDecorationCell) {
        super(0);
        this.LL = intelligentTemplateForYouDecorationCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.tux.widget.RadiusLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final RadiusLayout invoke() {
        return this.LL.itemView.findViewById(R.id.kum);
    }
}
