package X;

import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431100GvM extends LinkMovementMethod {
    public final Function0<Unit> LIZ;
    public final Function1<View, Boolean> LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final long LIZLLL = ViewConfiguration.getLongPressTimeout();
    public boolean LJ;
    public boolean LJFF;
    public final int LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C431100GvM(Function0<Unit> function0, Function1<? super View, Boolean> function1) {
        this.LIZ = function0;
        this.LIZIZ = function1;
        this.LJI = -1;
        C844470XAv.LIZ.getClass();
        this.LJI = ViewConfiguration.get(C844470XAv.LIZ()).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r8, android.text.Spannable r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C431100GvM.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
