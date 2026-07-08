package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TJM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJM extends FrameLayout {
    public C0TLP LL;
    public final DataChannel LLILLJJLI;

    public final C0TLP getAdapter() {
        return this.LL;
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public final void setAdapter(C0TLP c0tlp) {
        this.LL = c0tlp;
    }

    public final void setPosition(int i) {
        this.LL = new C0TLP(this, i, this.LLILLJJLI);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0q);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LL);
        }
    }

    public C0TJM(Context context, DataChannel dataChannel) {
        int i;
        super(context, null, 0);
        this.LLILLJJLI = dataChannel;
        if (C960203pA.LIZIZ(context)) {
            i = R.style.y0;
        } else {
            i = R.style.y3;
        }
        C786410Ut5.Td(C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, i)), R.layout.gnl, this, true);
    }
}
