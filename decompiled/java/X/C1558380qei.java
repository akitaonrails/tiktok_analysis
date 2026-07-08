package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S1100100_24;
import kotlin.jvm.internal.AwS2S1110100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558380qei extends C09AY implements Function1<String, InterfaceC665370Q7z> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558380qei(Fragment fragment, String str) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC665370Q7z invoke(String str) {
        String str2 = str;
        Fragment fragment = this.LL;
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
                C725430Scv.LIZ(new AwS15S1100100_24(c1561860qkK, "default", SystemClock.elapsedRealtimeNanos(), 2));
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1561190qjF.LIZ(str3, fragment);
        if (interfaceC665370Q7zLIZ == null) {
            interfaceC665370Q7zLIZ = new C1555400qZu(fragment, str2);
        }
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
                C725430Scv.LIZ(new AwS2S1110100_24(c1561860qkK2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 1));
            }
        }
        return interfaceC665370Q7zLIZ;
    }
}
