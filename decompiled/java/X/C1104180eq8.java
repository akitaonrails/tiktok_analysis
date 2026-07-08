package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104180eq8 extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104180eq8(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Window window;
        View decorView;
        View viewFindViewById;
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        return Integer.valueOf((activityLIZ == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.content)) == null) ? C497740JfY.LJIILLIIL() + C497740JfY.LJIJ() : viewFindViewById.getMeasuredHeight());
    }
}
