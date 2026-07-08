package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0drv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066850drv extends FrameLayout {
    public final int LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final SmartImageView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;

    public C1066850drv(Context context) {
        super(context);
        this.LL = C12ES.LJIIJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
        C786410Ut5.Sd(R.layout.baw, C786410Ut5.ne(context), this);
        this.LLILLJJLI = findViewById(R.id.b1x);
        this.LLILLL = (TuxIconView) findViewById(R.id.jxe);
        this.LLILZ = (SmartImageView) findViewById(R.id.kfu);
        this.LLILZIL = (TuxTextView) findViewById(R.id.xpq);
        this.LLILZLL = (TuxTextView) findViewById(R.id.xpr);
        this.LLIZ = (TuxTextView) findViewById(R.id.xr8);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.xqw);
    }

    public static C2344009Gk LIZ(C1066860drw c1066860drw) {
        Aweme aweme;
        String aid;
        InterfaceC1066840dru interfaceC1066840dru = c1066860drw.LL;
        String requestId = null;
        if (interfaceC1066840dru != null) {
            aweme = interfaceC1066840dru.getAweme();
        } else {
            aweme = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "title_panel_video_anchor");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            requestId = aweme.getRequestId();
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        return c2344009Gk;
    }
}
