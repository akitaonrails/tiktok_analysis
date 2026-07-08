package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0Gho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnClickListenerC422700Gho extends LinearLayout implements View.OnClickListener {
    public final RemoteImageView LL;
    public final TextView LLILLJJLI;
    public final ImageView LLILLL;
    public InterfaceC422730Ghr LLILZ;

    public ViewOnClickListenerC422700Gho(Context context) {
        View.OnClickListener fVar;
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b90, this, true);
        setPadding(C341940Daq.LIZ(5.0d), getTopPaddingOffset(), C341940Daq.LIZ(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.cf7);
        setGravity(16);
        this.LL = (RemoteImageView) findViewById(R.id.mr9);
        this.LLILLJJLI = (TextView) findViewById(R.id.mqz);
        this.LLILLL = (ImageView) findViewById(R.id.mrf);
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC422730Ghr interfaceC422730Ghr = this.LLILZ;
        if (interfaceC422730Ghr != null) {
            interfaceC422730Ghr.LIZIZ();
        }
    }
}
