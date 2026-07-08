package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ltV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375350ltV extends C214906198m {
    public final Activity LL;
    public C1380390m1d LLILLJJLI;

    public C1375350ltV(C19EG c19eg, Aweme aweme, String str, UrlModel urlModel) {
        super(c19eg);
        this.LL = c19eg;
        setContentView(C786410Ut5.Sd(R.layout.f82, C786410Ut5.ne(c19eg), null));
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(C12ES.LJIIJ(c19eg));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.afu);
        TextView textView = (TextView) getContentView().findViewById(R.id.uyk);
        TextView textView2 = (TextView) getContentView().findViewById(R.id.uyj);
        if (C1375340ltU.LIZJ(aweme)) {
            textView.setText(c19eg.getString(2131857958));
            textView2.setText(c19eg.getResources().getString(2131847857, str));
        } else {
            textView2.setText(c19eg.getResources().getString(2131847856, str));
        }
        C1324840ka2.LJFF((RemoteImageView) getContentView().findViewById(R.id.uyl), urlModel);
        C1380390m1d c1380390m1d = (C1380390m1d) getContentView().findViewById(R.id.si1);
        this.LLILLJJLI = c1380390m1d;
        (c1380390m1d != null ? c1380390m1d : null).LLILLL = getContentView().findViewById(R.id.g84);
    }
}
