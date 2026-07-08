package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell.IntelligentTemplateForYouDecorationCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828340xg8 extends C09AY implements Function0<C0GZW> {
    public final /* synthetic */ IntelligentTemplateForYouDecorationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828340xg8(IntelligentTemplateForYouDecorationCell intelligentTemplateForYouDecorationCell) {
        super(0);
        this.LL = intelligentTemplateForYouDecorationCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0GZW, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C0GZW invoke() {
        return this.LL.itemView.findViewById(R.id.u1f);
    }
}
