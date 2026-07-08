package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Kay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC520380Kay implements InterfaceC520350Kav {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final CustomTab LIZJ;
    public long LIZLLL = System.currentTimeMillis();
    public ViewGroup LJ;

    @Override // X.InterfaceC520350Kav
    public void LIZIZ() {
    }

    @Override // X.InterfaceC520350Kav
    public final float LJ() {
        return (System.currentTimeMillis() - this.LIZLLL) / 1000.0f;
    }

    @Override // X.InterfaceC520350Kav
    public void LLLZZ() {
        this.LIZLLL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC520350Kav
    public void LIZJ(ViewGroup viewGroup) {
        this.LJ = viewGroup;
    }

    public AbstractC520380Kay(Context context, DataChannel dataChannel, CustomTab customTab) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = customTab;
    }
}
