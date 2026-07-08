package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0bRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973830bRt extends FrameLayout {
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C1324720kZq LLILZIL;
    public final List<Integer> LLILZLL;

    public C973830bRt(Context context) {
        super(context, null, 0);
        this.LLILZLL = C1697810uHb.LJIILJJIL(Integer.valueOf(R.drawable.f2_), Integer.valueOf(R.drawable.f2b), Integer.valueOf(R.drawable.f2d), Integer.valueOf(R.drawable.f2c));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h7l, this, true);
        this.LL = (C1324720kZq) findViewById(R.id.user_avatar_hv);
        this.LLILLJJLI = (C16F5) findViewById(R.id.user_name_tv);
        this.LLILLL = (C1324720kZq) findViewById(R.id.user_icon_hv);
        this.LLILZ = (C16F5) findViewById(R.id.user_score_tv);
        this.LLILZIL = (C1324720kZq) findViewById(R.id.user_enigma_x_icon);
    }
}
