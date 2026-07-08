package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14HV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14HV extends C2217421BqW implements Function2<Context, List<? extends Integer>, View> {
    public static final C14HV LL = new C14HV();

    public C14HV() {
        super(2, C1858870yTN.class, "getContainerBing", "getContainerBing(Landroid/content/Context;Ljava/util/List;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(Context context, List<? extends Integer> list) {
        return C1858870yTN.LJFF(context, list);
    }
}
