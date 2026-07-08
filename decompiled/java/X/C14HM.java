package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14HM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14HM extends C1696260uF6 implements Function2<Context, List<? extends Integer>, View> {
    public static final C14HM LLIZ = new C14HM();

    public C14HM() {
        super(2, C1858870yTN.class, "getTakoDeepThinkContainerView", "getTakoDeepThinkContainerView(Landroid/content/Context;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        FrameLayout frameLayoutLIZIZ = C1858870yTN.LIZIZ(context, R.id.erk, C1858870yTN.LIZJ(list));
        C1857280yQo.LIZJ(frameLayoutLIZIZ, C444960Hcc.LIZIZ());
        return frameLayoutLIZIZ;
    }
}
