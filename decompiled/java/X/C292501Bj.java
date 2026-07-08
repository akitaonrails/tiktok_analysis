package X;

import com.bytedance.android.livesdk.performancetune.perfloadinfo.LivePerfLoadInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.01Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C292501Bj implements InterfaceC292601Bk {
    public final C01GW LIZ;
    public final C01GW LIZIZ;

    @Override // X.InterfaceC292601Bk
    public final Map<String, LivePerfLoadInfo> LIZ() {
        return (Map) this.LIZ.getValue();
    }

    public C292501Bj() {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LIZ = C452501pT.LIZ(enumC452301pR, AnonymousClass0206.get$arr$(341));
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, new C5182020e(this, 291));
    }
}
