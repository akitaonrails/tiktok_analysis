package X;

import Y.ACListenerS168S0100000_34;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.1BHW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BHW extends C1BHV {
    public final Map<String, String> LLILLJJLI;
    public Context LLILLL;

    public C1BHW(Map map) {
        this.LLILLJJLI = map;
    }

    @Override // X.C1BHV, X.C1BHQ
    public final C1BHU LJFF(Context context) {
        this.LLILLL = context;
        C1BHU c1bhuLJFF = super.LJFF(context);
        c1bhuLJFF.setTitle(context.getString(2131848751));
        return c1bhuLJFF;
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void setMoreButtonClickListener(View.OnClickListener onClickListener) {
        super.setMoreButtonClickListener(new ACListenerS168S0100000_34((ACListenerS168S0100000_34) onClickListener, 39));
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void setSubTitle(String str) {
        String string;
        Context context = this.LLILLL;
        if (context != null && (string = context.getString(2131848751)) != null) {
            str = string;
        }
        super.setSubTitle(str);
    }

    @Override // X.C1BHV, X.C1BHQ
    public final void setTitle(String str) {
        String string;
        Context context = this.LLILLL;
        if (context != null && (string = context.getString(2131848751)) != null) {
            str = string;
        }
        super.setTitle(str);
    }
}
