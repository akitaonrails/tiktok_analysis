package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20237914Gr extends C2217421BqW implements Function2<Context, List<? extends Integer>, View> {
    public static final C20237914Gr LL = new C20237914Gr();

    public C20237914Gr() {
        super(2, C1858870yTN.class, "getContainerImageDisclaimer", "getContainerImageDisclaimer(Landroid/content/Context;Ljava/util/List;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        return C1858870yTN.LIZIZ(context, R.id.es5, C1858870yTN.LIZJ(list));
    }
}
