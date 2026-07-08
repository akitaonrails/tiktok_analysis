package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14HW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14HW extends C2217421BqW implements Function2<Context, List<? extends Integer>, View> {
    public static final C14HW LL = new C14HW();

    public C14HW() {
        super(2, C1858870yTN.class, "getContainerBing", "getContainerBing(Landroid/content/Context;Ljava/util/List;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        return C1858870yTN.LJFF(context, list);
    }
}
