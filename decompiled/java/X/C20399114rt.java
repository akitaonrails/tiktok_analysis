package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20399114rt extends C09AY implements Function0<View> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C20398214rk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20399114rt(View view, C20398214rk c20398214rk) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c20398214rk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        View viewFindViewById = this.LL.findViewById(R.id.vg_recommend);
        if (viewFindViewById == null) {
            return null;
        }
        if (this.LLILLJJLI.LLILZIL) {
            viewFindViewById.setBackgroundResource((C500260Jjc.LJJIL() && C960203pA.LIZIZ(viewFindViewById.getContext())) ? R.drawable.f7w : R.drawable.f8h);
        }
        return viewFindViewById;
    }
}
