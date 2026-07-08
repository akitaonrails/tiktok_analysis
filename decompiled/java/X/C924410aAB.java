package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924410aAB implements InterfaceC924270a9x {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final InterfaceC924270a9x LL;

    @Override // X.InterfaceC924270a9x
    public final void If() {
        this.LL.If();
    }

    @Override // X.InterfaceC921470a5R
    public final void LIZ(Room room, Context context, DataChannel dataChannel, Function0<Unit> function0) {
        this.LL.LIZ(room, context, dataChannel, function0);
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return this.LL.LJIIIIZZ();
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIJLIJ(ViewGroup viewGroup) {
        this.LL.LJJIJLIJ(viewGroup);
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIL(DataChannel dataChannel, ViewGroup viewGroup, InterfaceC921620a5g interfaceC921620a5g, LifecycleOwner lifecycleOwner) {
        this.LL.LJJIL(dataChannel, viewGroup, interfaceC921620a5g, lifecycleOwner);
    }

    @Override // X.InterfaceC924270a9x
    public final void onPause() {
        this.LL.onPause();
    }

    @Override // X.InterfaceC924270a9x
    public final void onResume() {
        this.LL.onResume();
    }

    @Override // X.InterfaceC924270a9x
    public final void rc() {
        this.LL.rc();
    }

    public C924410aAB(DataChannel dataChannel, boolean z) {
        InterfaceC924270a9x c927260aEm;
        if (C931780aM4.LIZ()) {
            c927260aEm = new C926840aE6(dataChannel, z);
        } else {
            c927260aEm = new C927260aEm(z);
            C936430aTZ.LIZ = z;
        }
        this.LL = c927260aEm;
    }
}
