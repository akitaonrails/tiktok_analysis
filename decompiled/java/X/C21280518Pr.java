package X;

import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21280518Pr extends C09AY implements Function0<ImageView> {
    public final /* synthetic */ C21279718Pj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21280518Pr(C21279718Pj c21279718Pj) {
        super(0);
        this.LL = c21279718Pj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.ImageView] */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        return this.LL.getMRootView().findViewById(R.id.tjs);
    }
}
