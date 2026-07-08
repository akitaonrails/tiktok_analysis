package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H9T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9T extends LinearLayout {
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final SmartImageView LLILZ;
    public final TuxTextView LLILZIL;

    public C0H9T(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.e8b, this);
        this.LL = (SmartImageView) findViewById(R.id.kgg);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.kgh);
        this.LLILLL = (FrameLayout) findViewById(R.id.tlh);
        this.LLILZ = (SmartImageView) findViewById(R.id.kgi);
        this.LLILZIL = (TuxTextView) findViewById(R.id.xlt);
    }

    public static void LIZ(SmartImageView smartImageView, String str) {
        Context context;
        int i;
        ViewGroup.LayoutParams layoutParams;
        Context context2;
        Drawable drawableLJ = null;
        C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_revisit", "poi_revisit_banner", null).LIZ(C438710HIf.LIZJ(str));
        c1189360h3WLIZ.LJI = true;
        if (smartImageView != null) {
            context = smartImageView.getContext();
        } else {
            context = null;
        }
        c1189360h3WLIZ.LIZ.LJJIJL(context);
        if (smartImageView != null && (context2 = smartImageView.getContext()) != null) {
            drawableLJ = C1308910kAL.LJ(R.attr.bv, context2);
        }
        c1189360h3WLIZ.LIZ.LJJIIZI(drawableLJ);
        int i2 = 0;
        if (smartImageView != null && (layoutParams = smartImageView.getLayoutParams()) != null) {
            i = layoutParams.width;
        } else {
            i = 0;
            if (smartImageView != null) {
            }
            c1189360h3WLIZ.LJI(i, i2);
            c1189360h3WLIZ.LIZ.LJJIII = EnumC1334360kpO.HIGH;
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZIZ();
        }
        ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        }
        c1189360h3WLIZ.LJI(i, i2);
        c1189360h3WLIZ.LIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZIZ();
    }
}
