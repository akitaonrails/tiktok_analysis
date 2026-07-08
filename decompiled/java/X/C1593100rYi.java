package X;

import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593100rYi extends C09AY implements Function0<ContextThemeWrapper> {
    public final /* synthetic */ C1592950rYT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593100rYi(C1592950rYT c1592950rYT) {
        super(0);
        this.LL = c1592950rYT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ContextThemeWrapper invoke() {
        return new ContextThemeWrapper(this.LL.getContext(), R.style.y0);
    }
}
