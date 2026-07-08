package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508160JwM extends ConstraintLayout {
    public final C16F5 LL;
    public final LinearLayout LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public C508160JwM() {
        throw null;
    }

    public final LinearLayout getBadgeContainer() {
        return this.LLILLJJLI;
    }

    public final View getBadgeDot() {
        return this.LLILZIL;
    }

    public final C1324720kZq getBadgeIcon() {
        return this.LLILLL;
    }

    public final View getBadgeLine() {
        return this.LLILZLL;
    }

    public final C16F5 getBadgeStr() {
        return this.LLILZ;
    }

    public final C16F5 getDes() {
        return this.LL;
    }

    public C508160JwM(Context context) {
        this(context, 0);
    }

    public final void setItemScale(float f) {
        float f2 = 1;
        C786410Ut5.k5(this.LL, f2 - (((f2 - f) * 0.39999998f) / 0.27999997f));
        this.LLILLJJLI.setPivotX(0.0f);
        C786410Ut5.Rb(this.LLILLJJLI, f);
        this.LLILLJJLI.setPivotY(0.0f);
        C786410Ut5.sc(this.LLILLJJLI, f);
        C786410Ut5.Ob(this.LLILZIL, f);
        C786410Ut5.pc(this.LLILZIL, f);
    }

    public C508160JwM(Context context, int i) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hio, this, true);
        this.LL = (C16F5) findViewById(R.id.bpp);
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.bpo);
        this.LLILLL = (C1324720kZq) findViewById(R.id.bps);
        this.LLILZ = (C16F5) findViewById(R.id.bq6);
        this.LLILZIL = findViewById(R.id.bpq);
        this.LLILZLL = findViewById(R.id.bpy);
    }
}
