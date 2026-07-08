package X;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S1100100_24;
import kotlin.jvm.internal.AwS2S1110100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qeh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558370qeh extends C09AY implements Function1<String, InterfaceC665370Q7z> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558370qeh(C19EG c19eg, String str) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC665370Q7z invoke(String str) {
        String str2 = str;
        C19EG c19eg = this.LL;
        String str3 = this.LLILLJJLI;
        C1561860qkK c1561860qkK = C1561860qkK.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c1561860qkK);
                }
            }
            if (C725480Sd0.LIZ(c1561860qkK)) {
                C725430Scv.LIZ(new AwS15S1100100_24(c1561860qkK, "default", SystemClock.elapsedRealtimeNanos(), 1));
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1561190qjF.LIZ(str3, c19eg);
        if (interfaceC665370Q7zLIZ == null) {
            interfaceC665370Q7zLIZ = new C1555410qZv(c19eg, str2);
        }
        C1557550qdN.LIZ("vprovider_vscope", new C324200CnK(interfaceC665370Q7zLIZ));
        C1561860qkK c1561860qkK2 = C1561860qkK.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c1561860qkK2);
                }
            }
            if (C725480Sd0.LIZ(c1561860qkK2)) {
                C725430Scv.LIZ(new AwS2S1110100_24(c1561860qkK2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 0));
            }
        }
        return interfaceC665370Q7zLIZ;
    }
}
