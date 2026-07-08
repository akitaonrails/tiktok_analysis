package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078290eAN {
    public final DataChannel LIZ;
    public final ArrayList<InterfaceC1078330eAR> LIZIZ = new ArrayList<>();
    public final List<String> LIZJ;

    public C1078290eAN(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        arrayList.clear();
    }

    public final boolean LIZ(InterfaceC1078330eAR interfaceC1078330eAR) {
        for (String str : (ArrayList) this.LIZJ) {
            Class<?> cls = interfaceC1078330eAR.getClass();
            if (!a0.LJJIIZI(cls.getName(), str, false)) {
                for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                    if (!a0.LJJIIZI(superclass.getName(), str, false)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
