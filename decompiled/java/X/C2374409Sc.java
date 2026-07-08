package X;

import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2374409Sc implements InterfaceC2374509Sd {
    public final ConcurrentHashMap<String, String> LIZ;

    public C2374409Sc(ConcurrentHashMap<String, String> concurrentHashMap) {
        this.LIZ = concurrentHashMap;
    }

    @Override // X.InterfaceC2374509Sd
    public final Object LIZ(String str, String str2, String str3, String str4, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append(str);
        sbLIZ.append(C09SZ.LIZIZ(z));
        String str5 = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str5 != null && new C0VSJ(str5).exists()) {
            iTTSCallback.onSuccess(0, new C0VSJ(str5), null, null);
            return Unit.LIZ;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2374309Sb(str3, str, z, this, iTTSCallback, str4, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
