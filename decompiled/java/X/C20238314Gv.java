package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20238314Gv extends C2217421BqW implements Function2<Context, List<? extends Integer>, View> {
    public static final C20238314Gv LL = new C20238314Gv();

    public C20238314Gv() {
        super(2, C1858870yTN.class, "getTakoVideoGenerationCoverView", "getTakoVideoGenerationCoverView(Landroid/content/Context;Ljava/util/List;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        FrameLayout.LayoutParams layoutParamsLIZJ = C1858870yTN.LIZJ(list);
        layoutParamsLIZJ.width = -2;
        return C1858870yTN.LIZIZ(context, R.id.etq, layoutParamsLIZJ);
    }
}
