package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Iic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C474160Iic extends C2217421BqW implements Function2<ViewGroup, Context, View> {
    public C474160Iic(Object obj) {
        super(2, obj, TakoLoadingAssem.class, "createLoadingTextView", "createLoadingTextView(Landroid/view/ViewGroup;Landroid/content/Context;)Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final View invoke(ViewGroup viewGroup, Context context) {
        this.receiver.getClass();
        return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fpl, viewGroup, false);
    }
}
