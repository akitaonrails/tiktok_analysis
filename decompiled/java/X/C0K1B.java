package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K1B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1B extends ConstraintLayout {
    public final TextView LL;
    public final LinearLayout LLILLJJLI;
    public final C417410GYh LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public C0K1B() {
        throw null;
    }

    public final LinearLayout getBadgeContainer() {
        return this.LLILLJJLI;
    }

    public final View getBadgeDot() {
        return this.LLILZIL;
    }

    public final C417410GYh getBadgeIcon() {
        return this.LLILLL;
    }

    public final View getBadgeLine() {
        return this.LLILZLL;
    }

    public final TextView getBadgeStr() {
        return this.LLILZ;
    }

    public final TextView getDes() {
        return this.LL;
    }

    public C0K1B(Context context) {
        this(context, 0);
    }

    public final void setItemScale(float f) {
        float f2 = 1;
        C786410Ut5.S4(f2 - (((f2 - f) * 0.39999998f) / 0.27999997f), this.LL);
        this.LLILLJJLI.setPivotX(0.0f);
        C786410Ut5.Rb(this.LLILLJJLI, f);
        this.LLILLJJLI.setPivotY(0.0f);
        C786410Ut5.sc(this.LLILLJJLI, f);
        C786410Ut5.Ob(this.LLILZIL, f);
        C786410Ut5.pc(this.LLILZIL, f);
    }

    public C0K1B(Context context, int i) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ffx, this, true);
        this.LL = (TextView) findViewById(R.id.bpp);
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.bpo);
        this.LLILLL = (C417410GYh) findViewById(R.id.bps);
        this.LLILZ = (TextView) findViewById(R.id.bq6);
        this.LLILZIL = findViewById(R.id.bpq);
        this.LLILZLL = findViewById(R.id.bpy);
    }
}
