package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115920f94 extends C1115930f95 {
    public final DataChannel LJ;

    public C1115920f94(Context context, LifecycleOwner lifecycleOwner, Room room, C21211517zd c21211517zd, DataChannel dataChannel) {
        super(context, lifecycleOwner, room, c21211517zd);
        this.LJ = dataChannel;
    }
}
