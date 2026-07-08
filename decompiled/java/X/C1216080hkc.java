package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0hkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216080hkc extends FrameLayout {
    public final List<C197039127h> LL;

    public final List<C197039127h> getButtonList() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1216080hkc(Context context, boolean z) {
        super(context, null, 0);
        if (z) {
            FrameLayout.inflate(context, R.layout.gh, this);
        } else {
            FrameLayout.inflate(context, R.layout.gi, this);
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.hzj);
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.ugi);
        View viewFindViewById = findViewById(R.id.xsu);
        c197039127h.LJJJJL(AFwS257S0000000_19.get$arr$(748));
        this.LL = C1697810uHb.LJIILJJIL(c197039127h, c197039127h2, viewFindViewById);
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(c197039127h2, c197039127h, 5));
    }
}
