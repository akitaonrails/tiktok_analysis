package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class DialogC20297114bR extends DialogC19728412Gs {
    public final boolean LL;
    public final JSONObject LLILLJJLI;
    public View LLILLL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        C20297414bU.LIZLLL(this.LL ? "double_side" : "single_side", "iqa_failed", "return", this.LLILLJJLI);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcz);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        View viewFindViewById = findViewById(R.id.ys3);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS164S0100000_30(this, 43), viewFindViewById);
        }
    }

    public DialogC20297114bR(Context context, JSONObject jSONObject, boolean z) {
        super(context, R.style.aje);
        this.LL = z;
        this.LLILLJJLI = jSONObject;
    }
}
