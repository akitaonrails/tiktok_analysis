package X;

import com.bytedance.retrofit2.Retrofit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0p81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499670p81 implements INetwork {
    public static final C1499670p81 LIZIZ = new C1499670p81();
    public final /* synthetic */ INetwork LIZ;

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final Retrofit LIZ(InterfaceC2661011f interfaceC2661011f) {
        return this.LIZ.LIZ(interfaceC2661011f);
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final long LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LIZLLL(C1586090rNP c1586090rNP) {
        this.LIZ.LIZLLL(c1586090rNP);
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final long LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void LJFF(InterfaceC1495070p0b interfaceC1495070p0b, Executor executor) {
        this.LIZ.LJFF(interfaceC1495070p0b, executor);
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final C1495130p0h getConfig() {
        return this.LIZ.getConfig();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final int getServerTime() {
        return this.LIZ.getServerTime();
    }

    @Override // com.ss.android.ugc.aweme.network.INetwork
    public final void setAlogFuncAddr(long j) {
        this.LIZ.setAlogFuncAddr(j);
    }

    public C1499670p81() {
        INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
        if (iNetwork != null) {
            this.LIZ = iNetwork;
        } else {
            "no impl for INetwork".toString();
            throw new IllegalStateException("no impl for INetwork");
        }
    }
}
