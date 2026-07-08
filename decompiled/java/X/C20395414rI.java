package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20395414rI implements InterfaceC20405014sq {
    public final DataChannel LL;
    public final C1117360fBO LLILLJJLI;
    public final Function0<Context> LLILLL;
    public final C979080baM LLILZ;

    @Override // X.InterfaceC20405014sq
    public final long m2() {
        return 0L;
    }

    @Override // X.InterfaceC20405014sq
    public final long LLJJ() {
        Long lLIZ;
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (lLIZ = C784920Uqg.LIZ(dataChannel)) == null) {
            return 0L;
        }
        return lLIZ.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20395414rI(DataChannel dataChannel, C1117360fBO c1117360fBO, Function0<? extends Context> function0, C979080baM c979080baM) {
        this.LL = dataChannel;
        this.LLILLJJLI = c1117360fBO;
        this.LLILLL = function0;
        this.LLILZ = c979080baM;
    }
}
