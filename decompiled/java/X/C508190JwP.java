package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508190JwP extends C09AY implements Function0<View> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508190JwP(View view) {
        super(0);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.findViewById(R.id.whv);
    }
}
