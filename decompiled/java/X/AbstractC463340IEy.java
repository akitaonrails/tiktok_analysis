package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC463340IEy {
    public Context LL;
    public LifecycleOwner LLILLJJLI;
    public DataChannel LLILLL;

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF(boolean z);

    public abstract void LJI();

    public abstract void LJII(View view, Bundle bundle);

    public abstract View LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJ();

    public abstract void LJIIJJI(int i);

    public void LIZ(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Room room) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = dataChannel;
    }
}
