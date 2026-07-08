package X;

import android.content.Context;
import android.graphics.Paint;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C413170GHz extends C09AY implements Function0<Paint> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C413170GHz(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Paint invoke() {
        Paint paint = new Paint();
        Context context = this.LL;
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        return paint;
    }
}
