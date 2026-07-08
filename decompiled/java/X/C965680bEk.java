package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965680bEk implements InterfaceC966770bGV {
    public static final C01GW<C965680bEk> LIZIZ = C452501pT.LIZIZ(new C968180bIm());
    public final CopyOnWriteArraySet<InterfaceC966770bGV> LIZ = new CopyOnWriteArraySet<>();

    public final void LIZ(InterfaceC966770bGV interfaceC966770bGV) {
        this.LIZ.add(interfaceC966770bGV);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addPlayerEventListener, listener=");
        sbLIZ.append(interfaceC966770bGV.hashCode());
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZ.size());
        C20441214yg.LIZIZ("LinkMicStreamPlayerEventDispatcher", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC966770bGV
    public final void LIZJ(C945320ahu c945320ahu, Function2<? super C945320ahu, ? super InterfaceC940430aa1, Unit> function2) {
        String str;
        String str2;
        Integer numValueOf;
        Integer numValueOf2;
        if (c945320ahu != null && (str = c945320ahu.LIZIZ) != null && !a0.LJJIIZI(str, "ByteVC", false) && (str2 = c945320ahu.LIZIZ) != null && a0.LJJIIZI(str2, "app_data", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSeiUpdate dispatch, listener_count=");
            sbLIZ.append(this.LIZ.size());
            sbLIZ.append(", hash=");
            String str3 = c945320ahu.LIZIZ;
            Long l = null;
            if (str3 != null) {
                numValueOf = Integer.valueOf(str3.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", len=");
            String str4 = c945320ahu.LIZIZ;
            if (str4 != null) {
                numValueOf2 = Integer.valueOf(str4.length());
            } else {
                numValueOf2 = null;
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", ts=");
            LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
            if (liveSeiStruct != null) {
                l = liveSeiStruct.ts;
            }
            sbLIZ.append(l);
            C20441214yg.LIZIZ("LinkMicStreamPlayerEventDispatcher", C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator it2 = C13LP.LLIIII(this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC966770bGV) it2.next()).LIZJ(c945320ahu, function2);
        }
    }

    @Override // X.InterfaceC966770bGV
    public final void onVideoSizeChanged(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoSizeChanged dispatch, listener_count=");
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append(", width=");
        sbLIZ.append(i);
        sbLIZ.append(", height=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LinkMicStreamPlayerEventDispatcher", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = C13LP.LLIIII(this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC966770bGV) it2.next()).onVideoSizeChanged(i, i2);
        }
    }
}
