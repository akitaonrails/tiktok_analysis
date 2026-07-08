package X;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1240090iNL extends DialogC19728412Gs {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;

    public DialogC1240090iNL(C19EG c19eg) {
        super(c19eg, R.style.adr);
        View viewSd = C786410Ut5.Sd(R.layout.d65, C786410Ut5.ne(c19eg), null);
        setContentView(viewSd);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C12ES.LIZJ(120.0f, c19eg);
        attributes.width = (int) C12ES.LIZJ(188.0f, c19eg);
        window.setAttributes(attributes);
        window.setFlags(32, 32);
        this.LL = (TuxIconView) viewSd.findViewById(R.id.jxe);
        this.LLILLJJLI = (TuxTextView) viewSd.findViewById(R.id.o8v);
    }
}
