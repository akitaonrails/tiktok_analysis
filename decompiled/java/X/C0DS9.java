package X;

import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DS9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DS9 extends FrameLayout {
    public Long LL;
    public C1845270y7R LLILLJJLI;
    public final C1845290y7T LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL = Long.valueOf(System.currentTimeMillis());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.LJ();
        }
    }

    public final Long getOpenTime() {
        return this.LL;
    }

    public C0DS9(C1361400lX0 c1361400lX0) {
        Map<String, String> map;
        super(c1361400lX0, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(c1361400lX0), R.layout.fre, this, true);
        C1845290y7T c1845290y7T = (C1845290y7T) findViewById(R.id.xdf);
        this.LLILLL = c1845290y7T;
        if (c1845290y7T != null) {
            c1845290y7T.setPlayResultCallback(new AwS583S0100000_4(this, 382));
            c1845290y7T.setProgressListener(AFwS231S0000000_3.get$arr$(307));
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1845270y7R c1845270y7R = this.LLILLJJLI;
        if (c1845270y7R != null) {
            map = c1845270y7R.params;
        } else {
            map = null;
        }
        C1862330yYx.LJLJJLL(20, c1862330yYx, "video_generation", null, c1845270y7R != null ? c1845270y7R.msgId : null, map);
    }

    public final void setOnPlayResultListener(Function1<? super C0DS7, Unit> function1) {
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setPlayResultCallback(function1);
        }
    }

    public final void setOnProgressUpdateListener(Function1<? super Float, Unit> function1) {
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setProgressListener(function1);
        }
    }

    public final void setOnVideoSizeChangedListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setOnVideoSizeChangedListener(function2);
        }
    }

    public final void setTogglePlayOnClickEnabled(boolean z) {
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setTogglePlayOnClickEnabled(z);
        }
    }

    public final void setVideoData(C1845270y7R c1845270y7R) {
        this.LLILLJJLI = c1845270y7R;
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setData(c1845270y7R);
        }
    }

    public final void setVideoLoadingSuppressed(boolean z) {
        C1845290y7T c1845290y7T = this.LLILLL;
        if (c1845290y7T != null) {
            c1845290y7T.setLoadingSuppressed(z);
        }
    }
}
