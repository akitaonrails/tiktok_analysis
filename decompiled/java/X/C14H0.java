package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14H0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14H0 extends C1696260uF6 implements Function2<Context, List<? extends Integer>, View> {
    public static final C14H0 LLIZ = new C14H0();

    public C14H0() {
        super(2, C1858870yTN.class, "getTakoUserView", "getTakoUserView(Landroid/content/Context;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        return C1858870yTN.LIZIZ(context, R.id.etl, C1858870yTN.LIZJ(list));
    }
}
