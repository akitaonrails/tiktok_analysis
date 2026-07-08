package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14HI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14HI extends C1696260uF6 implements Function2<Context, List<? extends Integer>, View> {
    public static final C14HI LLIZ = new C14HI();

    public C14HI() {
        super(2, C1858870yTN.class, "getTakoInteractionView", "getTakoInteractionView(Landroid/content/Context;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        return C1858870yTN.LJIIIZ(context, list, Boolean.FALSE);
    }
}
