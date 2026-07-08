package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0fVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129760fVO {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public final Room LIZLLL;
    public final Function0<Fragment> LJ;
    public final C11NJ LJFF = new C11NJ();

    public C1129760fVO(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Room room, AwS556S0100000_12 awS556S0100000_12) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = dataChannel;
        this.LIZLLL = room;
        this.LJ = awS556S0100000_12;
    }
}
