package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11GT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C11GT extends C2217421BqW implements Function2<ViewGroup, Context, C11GQ> {
    public C11GT(C12NY c12ny) {
        super(2, c12ny, C12NY.class, "getMarkDownTextView", "getMarkDownTextView(Landroid/view/ViewGroup;Landroid/content/Context;)Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/components/typing/TypingTextView;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C11GQ invoke(ViewGroup viewGroup, Context context) {
        this.receiver.getClass();
        C11GQ c11gq = new C11GQ(context, null, 6);
        c11gq.setTuxFont(51);
        c11gq.setFontFeatureSettings("'tnum'");
        c11gq.setTextAlignment(5);
        c11gq.setGravity(8388611);
        return c11gq;
    }
}
