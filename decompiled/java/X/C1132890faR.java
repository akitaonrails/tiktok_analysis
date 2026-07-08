package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0faR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132890faR {
    public final LifecycleOwner LIZ;
    public final View LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C1150550g2v LIZLLL;

    public C1132890faR(LifecycleOwner lifecycleOwner, Context context, DataChannel dataChannel, Room room, View view) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = view;
        this.LIZLLL = new C1150550g2v(context, dataChannel, room, view);
    }
}
