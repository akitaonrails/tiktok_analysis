package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19733512Ir extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJI = 0;
    public final View LL;
    public final C19732812Ik LLILLJJLI;
    public final C19733312Ip LLILLL;
    public final ImageView LLILZ;
    public final View LLILZIL;
    public final Context LLILZLL;
    public final C01GW LLIZ;
    public AwS643S0100000_29 LLIZLLLIL;
    public AwS573S0100000_29 LLJ;

    static {
        new C19734312Iz();
    }

    public final void L5() {
        ValueAnimator valueAnimator = (ValueAnimator) this.LLIZ.getValue();
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        C786410Ut5.Cb(this.LLILZ, 0.0f);
        this.LLILLJJLI.getClass();
        Integer num = 0;
        this.LLILZ.setImageResource(num.intValue() != 0 ? num.intValue() : R.drawable.a_y);
    }

    public void N5(boolean z) {
        float f;
        View view = this.LL;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.T4(view, f);
    }

    public C19733512Ir(View view, C19732812Ik c19732812Ik) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c19732812Ik;
        this.LLILLL = (C19733312Ip) this.itemView.findViewById(R.id.l54);
        this.LLILZ = (ImageView) this.itemView.findViewById(R.id.l_u);
        this.LLILZIL = this.itemView.findViewById(R.id.l56);
        this.LLILZLL = view.getContext();
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1066));
    }

    public final void I5(boolean z, boolean z2) {
        float f;
        float f2;
        float f3 = 12.0f;
        if (this.LLILLJJLI.LJIILJJIL) {
            f3 = 8.0f;
            f2 = 16.0f;
            f = 12.0f;
        } else {
            f = 20.0f;
            f2 = 20.0f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
        marginLayoutParams.rightMargin = (int) C11VU.LIZIZ(f3, this.LLILZLL);
        if (z) {
            marginLayoutParams.leftMargin = (int) C11VU.LIZIZ(f2, this.LLILZLL);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        marginLayoutParams.setMarginEnd((int) C11VU.LIZIZ(f3, this.LLILZLL));
        if (z) {
            marginLayoutParams.setMarginStart((int) C11VU.LIZIZ(f2, this.LLILZLL));
        } else {
            marginLayoutParams.setMarginStart(0);
        }
        if (z2) {
            marginLayoutParams.rightMargin = (int) C11VU.LIZIZ(f, this.LLILZLL);
            marginLayoutParams.setMarginEnd((int) C11VU.LIZIZ(f, this.LLILZLL));
        }
        C786410Ut5.W5(this.itemView, marginLayoutParams);
    }
}
