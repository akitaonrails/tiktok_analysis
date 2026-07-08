package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C459401qa extends LinearLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;

    public C459401qa(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.gnt, this);
        this.LL = (C1324720kZq) findViewById(R.id.iwb);
        this.LLILLJJLI = (C16F5) findViewById(R.id.iwc);
    }

    public final void setText(CharSequence charSequence) {
        this.LLILLJJLI.setText(charSequence);
    }
}
