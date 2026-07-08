package X;

import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.react.bridge.ReadableMap;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511470K4b extends FrameLayout {
    public ReadableMap LL;

    public C511470K4b(Context context) {
        super(context, null, 0);
        setId(R.id.wgp);
    }

    public final void setInitDataMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        this.LL = readableMap;
        HandlerHook.viewPost(this, new ARunnableS76S0200000_7(this, readableMap, 34));
    }
}
