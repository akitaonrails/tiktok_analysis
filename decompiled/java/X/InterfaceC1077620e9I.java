package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1077620e9I {
    boolean LIZ(Long l);

    boolean LIZIZ(Context context, Long l, Function0<Unit> function0);

    void LIZJ(Long l, C0IKJ c0ikj);

    void LLLF(Room room, DataChannel dataChannel);

    void gu(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);
}
