package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HSN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0HSN extends C2217421BqW implements Function2<ViewGroup, Context, C1858620ySy> {
    public C0HSN(Object obj) {
        super(2, obj, C0HU8.class, "getMarkDownTextView", "getMarkDownTextView(Landroid/view/ViewGroup;Landroid/content/Context;)Lcom/ss/android/ugc/aweme/tako/botpage/components/typing/TypingTextView;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1858620ySy invoke(ViewGroup viewGroup, Context context) {
        this.receiver.getClass();
        C1858620ySy c1858620ySy = new C1858620ySy(context, null, 6);
        c1858620ySy.setTuxFont(111);
        c1858620ySy.setTextColorRes(R.attr.a1h);
        c1858620ySy.setFontFeatureSettings("'tnum'");
        return c1858620ySy;
    }
}
