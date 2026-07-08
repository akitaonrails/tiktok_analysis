package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H21, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H21 extends C214906198m {
    public final Context LL;
    public final View LLILLJJLI;

    public C0H21(C19EG c19eg, View view) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        View view2 = new View(c19eg);
        view2.setId(R.id.esy);
        setContentView(view2);
        setWidth(0);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
        setWindowLayoutType(1003);
    }
}
