package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421080GfC extends C09AY implements Function0<LayerDrawable> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C428890Grn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421080GfC(Context context, C428890Grn c428890Grn) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c428890Grn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayerDrawable invoke() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_repost_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        return C426750GoL.LJIILIIL(c419910GdJ.LIZ(this.LL), this.LLILLJJLI.getFollowBtnBackground());
    }
}
