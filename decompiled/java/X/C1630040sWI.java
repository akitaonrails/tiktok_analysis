package X;

import android.view.View;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1630040sWI extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1630040sWI(C1630020sWG c1630020sWG) {
        super(1, c1630020sWG, C1630020sWG.class, "moveUpOrDownParentView", "moveUpOrDownParentView(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        View view;
        float f;
        boolean zBooleanValue = bool.booleanValue();
        Scene scene = ((Scene) this.receiver).mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            if (zBooleanValue) {
                f = -1.0f;
            } else {
                f = -3.0f;
            }
            view.setElevation(f);
        }
        return Unit.LIZ;
    }
}
