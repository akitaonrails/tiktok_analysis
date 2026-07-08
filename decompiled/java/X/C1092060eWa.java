package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092060eWa extends C09AY implements Function0<View> {
    public final /* synthetic */ C1092090eWd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092060eWa(C1092090eWd c1092090eWd) {
        super(0);
        this.LL = c1092090eWd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.findViewById(R.id.cbp);
    }
}
