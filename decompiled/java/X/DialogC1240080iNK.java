package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1240080iNK extends DialogC19728412Gs {
    public InterfaceC1240070iNJ LL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        InterfaceC1240070iNJ interfaceC1240070iNJ = this.LL;
        if (interfaceC1240070iNJ != null) {
            interfaceC1240070iNJ.P4();
        }
    }

    public DialogC1240080iNK(Context context) {
        super(context, R.style.a_e);
        View viewSd = C786410Ut5.Sd(R.layout.xr, C786410Ut5.ne(context), null);
        ((C1390410mHn) viewSd.findViewById(R.id.z07)).LIZJ();
        setContentView(viewSd);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C12ES.LIZJ(57.0f, context);
        attributes.width = (int) C12ES.LIZJ(57.0f, context);
        window.setAttributes(attributes);
    }
}
