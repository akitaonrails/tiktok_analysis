package X;

import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1Ad3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class DialogC2183591Ad3 extends C19GI {
    public static final /* synthetic */ int LLJJ = 0;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC2183601Ad4 LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;

    @Override // X.C19GI
    public final boolean LJJZ() {
        return false;
    }

    @Override // X.C19GI, X.DialogC21505919Ej, android.app.Dialog
    public final void onStart() throws JSONException {
        super.onStart();
    }

    public DialogC2183591Ad3(Context context) {
        super(context);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 55));
        this.LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 58));
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 57));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 56));
        this.LLJILJILJ = "";
        this.LLJILLL = "";
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(17);
        }
        setCanceledOnTouchOutside(false);
        super.onCreate(bundle);
        setContentView(R.layout.g84);
        C786410Ut5.l8((C16F5) this.LLIZLLLIL.getValue(), new ACListenerS167S0100000_33(this, 5));
        C786410Ut5.l8((C16F5) this.LLJ.getValue(), new ACListenerS167S0100000_33(this, 6));
        ((TextView) this.LLJI.getValue()).setText(this.LLJILJILJ);
        ((TextView) this.LLJIJIL.getValue()).setText(this.LLJILLL);
    }
}
