package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854660yMa extends FrameLayout {
    public final FrameLayout LL;
    public final FrameLayout LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxIconView LLILZ;
    public final FrameLayout LLILZIL;
    public final View LLILZLL;
    public final C1854680yMc LLIZ;
    public BaseImage LLIZLLLIL;

    public final BaseImage getImage() {
        return this.LLIZLLLIL;
    }

    public C1854660yMa(Context context) {
        super(context, null, 0);
        this.LLIZ = new C1854680yMc(null);
        C786410Ut5.Sd(R.layout.fps, C786410Ut5.ne(context), this);
        this.LL = (FrameLayout) findViewById(R.id.xal);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.xai);
        C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(this, 196));
        this.LLILLJJLI = frameLayout;
        this.LLILZ = (TuxIconView) findViewById(R.id.xah);
        this.LLILZIL = (FrameLayout) findViewById(R.id.xaj);
        this.LLILLL = (SmartImageView) findViewById(R.id.xak);
        this.LLILZLL = findViewById(R.id.o1o);
    }

    public final void setItemClickConfig(Function1<? super C1854680yMc, Unit> function1) {
        function1.invoke(this.LLIZ);
    }
}
