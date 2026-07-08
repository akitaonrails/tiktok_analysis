package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092080eWc extends C09AY implements Function0<C459801qe> {
    public final /* synthetic */ C1092090eWd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092080eWc(C1092090eWd c1092090eWd) {
        super(0);
        this.LL = c1092090eWd;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.01qe, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C459801qe invoke() {
        return this.LL.findViewById(R.id.c6b);
    }
}
