package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665480Q8k extends C09AY implements Function0<String> {
    public final /* synthetic */ WeakReference<View> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665480Q8k(WeakReference<View> weakReference) {
        super(0);
        this.LL = weakReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        View view = this.LL.get();
        return String.valueOf(view != null ? Integer.valueOf(view.hashCode()) : null);
    }
}
