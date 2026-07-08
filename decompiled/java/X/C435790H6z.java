package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C435790H6z extends C2217421BqW implements Function2<ViewGroup, Context, View> {
    public static final C435790H6z LL = new C435790H6z();

    public C435790H6z() {
        super(2, C0H70.class, "getMarkDownTextView", "getMarkDownTextView(Landroid/view/ViewGroup;Landroid/content/Context;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(ViewGroup viewGroup, Context context) {
        C1858620ySy c1858620ySy = new C1858620ySy(context, null, 6);
        c1858620ySy.setTuxFont(61);
        c1858620ySy.setTextColorRes(R.attr.a00);
        return c1858620ySy;
    }
}
