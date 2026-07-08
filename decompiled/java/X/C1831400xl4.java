package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.cell.SceneryModeOperationCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831400xl4 extends C09AY implements Function0<ConstraintLayout> {
    public final /* synthetic */ SceneryModeOperationCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831400xl4(SceneryModeOperationCell sceneryModeOperationCell) {
        super(0);
        this.LL = sceneryModeOperationCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    @Override // kotlin.jvm.functions.Function0
    public final ConstraintLayout invoke() {
        return this.LL.itemView.findViewById(R.id.poo);
    }
}
