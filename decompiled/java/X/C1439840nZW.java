package X;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439840nZW {
    public final Paint LIZ;
    public final Paint LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public final int LJFF;

    public C1439840nZW(Context context) {
        Paint paint = new Paint();
        this.LIZ = paint;
        Paint paint2 = new Paint();
        this.LIZIZ = paint2;
        this.LIZJ = C420650GeV.LIZ(context.getResources(), R.color.cx, context.getTheme());
        this.LJFF = (int) C12ES.LIZJ(8.0f, context);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, C420650GeV.LIZ(context.getResources(), R.color.q4, context.getTheme()));
        if (C1388580mEq.LIZIZ(context)) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        paint2.setAntiAlias(true);
    }

    public static void LIZ(String str, final Function1 function1) throws Throwable {
        int[] iArrLIZJ = C2475009mu.LIZJ(str);
        if (iArrLIZJ == null) {
            function1.invoke(null);
        } else {
            C1324750kZt.LJIJ(C2474609mq.LIZ(UriProtector.parse(Uri.fromFile(new C0VSJ(str)).toString())), iArrLIZJ[0], iArrLIZJ[1], new C092O() { // from class: X.0nYh
                @Override // X.C092O
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
    }
}
