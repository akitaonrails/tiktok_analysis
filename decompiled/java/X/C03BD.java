package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03BD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BD extends LinearLayout {
    public final TextView LL;

    public C03BD(Context context) {
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.i_p, C786410Ut5.ne(context), this);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LL = (TextView) viewSd.findViewById(R.id.tv_tag_name);
    }

    public void setTagName(String str) {
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
