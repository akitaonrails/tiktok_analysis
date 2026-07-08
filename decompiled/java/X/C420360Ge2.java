package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ge2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420360Ge2 extends C09AY implements Function0<Drawable> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420360Ge2(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LIZIZ = C722510SVt.LIZIZ() ? Integer.valueOf(R.attr.ze) : Integer.valueOf(R.attr.e4);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        return c384050F3z.LIZ(this.LL);
    }
}
