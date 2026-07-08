package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089550eSX {
    public final DataChannel LIZ;
    public final InterfaceC1089790eSv LIZIZ;
    public final Map<String, AbstractC1089560eSY<?>> LIZJ = new LinkedHashMap();

    public final void LIZ(AbstractC1089560eSY<?> abstractC1089560eSY) {
        this.LIZJ.put(abstractC1089560eSY.LIZIZ(), abstractC1089560eSY);
    }

    public C1089550eSX(DataChannel dataChannel, C1089720eSo c1089720eSo) {
        this.LIZ = dataChannel;
        this.LIZIZ = c1089720eSo;
    }
}
