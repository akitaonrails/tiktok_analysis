package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0g2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1150360g2c<DATA> implements InterfaceC1150430g2j<DATA> {
    public final InterfaceC1150370g2d LIZ;
    public final DataChannel LIZIZ;
    public final Context LIZJ;

    public AbstractC1150360g2c(C1150720g3C c1150720g3C) {
        InterfaceC1150370g2d interfaceC1150370g2d = c1150720g3C.LIZ;
        this.LIZ = interfaceC1150370g2d;
        this.LIZIZ = interfaceC1150370g2d.getDataChannel();
        this.LIZJ = interfaceC1150370g2d.getContext();
    }
}
