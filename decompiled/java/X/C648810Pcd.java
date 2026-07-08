package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648810Pcd implements InterfaceC1603440rpO {
    public static final C648810Pcd LIZ = new C648810Pcd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(570));
    public static int LIZJ = -1;

    @Override // X.InterfaceC1603440rpO
    public final boolean LIZ() {
        return !((Map) LIZIZ.getValue()).isEmpty();
    }

    @Override // X.InterfaceC1603440rpO
    public final void LIZIZ(Aweme aweme, String str) {
        InterfaceC648800Pcc interfaceC648800Pcc;
        Iterator it2 = ((Map) LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Reference) entry.getValue()).get() == null) {
                it2.remove();
            } else if (((Number) entry.getKey()).intValue() == LIZJ && (interfaceC648800Pcc = (InterfaceC648800Pcc) ((Reference) entry.getValue()).get()) != null) {
                interfaceC648800Pcc.LIZLLL(aweme, str);
            }
        }
    }
}
