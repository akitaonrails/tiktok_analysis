package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14bT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class DialogC20297314bT extends DialogC19728412Gs {
    public final int LL;
    public final int LLILLJJLI;
    public final JSONObject LLILLL;
    public View LLILZ;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        C20297414bU.LIZLLL(this.LLILLJJLI == 3 ? "double_side" : "single_side", "photo_guidance", "return", this.LLILLL);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.gcy);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        if (this.LL != 0 && (i = this.LLILLJJLI) != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C12ES.LJIILL(0, findViewById(R.id.yry));
                        C439101nJ.LJI(findViewById(R.id.ys1));
                    }
                } else {
                    C439101nJ.LJI(findViewById(R.id.yry));
                    C12ES.LJIILL(0, findViewById(R.id.ys1));
                    ((AppCompatImageView) findViewById(R.id.ys1)).setImageResource(R.drawable.emt);
                }
            } else {
                C439101nJ.LJI(findViewById(R.id.yry));
                C12ES.LJIILL(0, findViewById(R.id.ys1));
                ((AppCompatImageView) findViewById(R.id.ys1)).setImageResource(R.drawable.emu);
            }
        } else {
            C439101nJ.LJI(findViewById(R.id.yry));
            C12ES.LJIILL(0, findViewById(R.id.ys1));
            ((AppCompatImageView) findViewById(R.id.ys1)).setImageResource(R.drawable.emv);
        }
        View viewFindViewById = findViewById(R.id.ys3);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS164S0100000_30(this, 42), viewFindViewById);
        }
    }

    public DialogC20297314bT(Context context, int i, int i2, JSONObject jSONObject) {
        super(context, R.style.aje);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = jSONObject;
    }
}
