package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DIL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DIL(float f, float f2, C19EG c19eg, Context context) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = c19eg;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG c19eg;
        Window window;
        Integer numLIZJ;
        if (this.LL > this.LLILLJJLI && C0C64.LJIILLIIL().LJIIIZ(31744, "is_release_window_background", true, true) && (c19eg = this.LLILLL) != null && (window = c19eg.getWindow()) != null) {
            Context context = this.LLILZ;
            window.setBackgroundDrawable((context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) == null) ? null : new ColorDrawable(numLIZJ.intValue()));
        }
        return Unit.LIZ;
    }
}
