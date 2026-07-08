package X;

import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusInAppPushCTROptConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZFE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFE implements InterfaceC896470ZEv {
    public static final C01GW<C0ZFE> LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(541));
    public final Function0<List<InterfaceC896470ZEv>> LIZ;
    public final C01GW LIZIZ;

    public C0ZFE() {
        this(null);
    }

    public C0ZFE(Object obj) {
        this.LIZ = new AwS558S0100000_14((ActivityStatusInAppPushCTROptConfig) C0ZFH.LIZIZ.getValue(), 1597);
        this.LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1598));
    }

    @Override // X.InterfaceC896470ZEv
    public final C896450ZEt LIZ(String str, EnumC1990307qv enumC1990307qv) {
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            C896450ZEt c896450ZEtLIZ = ((InterfaceC896470ZEv) it2.next()).LIZ(str, enumC1990307qv);
            if (c896450ZEtLIZ.LIZ) {
                return c896450ZEtLIZ;
            }
        }
        return new C896450ZEt();
    }
}
