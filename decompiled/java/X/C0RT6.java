package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RT6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0RT6 extends C2217421BqW implements Function2<View, String, Unit> {
    public C0RT6(ReusedUIAssem reusedUIAssem) {
        super(2, reusedUIAssem, FeedBottomButtonContainer.class, "unifiedBottomButtonMargin", "unifiedBottomButtonMargin(Landroid/view/View;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ((FeedBottomButtonContainer) this.receiver).Gp(view);
        return Unit.LIZ;
    }
}
