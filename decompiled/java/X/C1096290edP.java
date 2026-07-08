package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0edP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096290edP {
    public static DataChannel LIZ;
    public static final boolean LIZIZ;
    public static final C01GW LIZJ;

    static {
        LIZIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
        LIZJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(4));
    }
}
