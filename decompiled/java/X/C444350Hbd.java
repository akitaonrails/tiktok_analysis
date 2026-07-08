package X;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444350Hbd extends SmartImageView {
    public static boolean LLIZLLLIL;

    public C444350Hbd() {
        throw null;
    }

    public C444350Hbd(Context context) {
        this(context, null, 6);
    }

    public C444350Hbd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        String string;
        String string2;
        C1325710kbR c1325710kbR;
        Uri uri;
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C300630BqP.LIZ() && !LLIZLLLIL) {
                C1AF0.LJ(e);
                Object tag = getTag(-5676);
                String string3 = null;
                if (tag != null) {
                    string = tag.toString();
                } else {
                    string = null;
                }
                InterfaceC1320850kTb controller = getController();
                if ((controller instanceof AbstractC1320710kTN) && (c1325710kbR = ((AbstractC1320710kTN) controller).LJIJJLI) != null && (uri = c1325710kbR.LIZIZ) != null) {
                    string3 = uri.toString();
                }
                Object tag2 = getTag(-8357);
                if (tag2 == null || (string2 = tag2.toString()) == null) {
                    string2 = "";
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("report_safe_smart_image_crash", C2097608Jq.LJIIIIZZ(new Pair("class_name", string), new Pair("image_url", string3), new Pair("scheduler", string2)));
                LLIZLLLIL = true;
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        try {
            super.draw(canvas);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C444350Hbd(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
