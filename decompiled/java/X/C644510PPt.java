package X;

import Y.ACallableS242S0200000_10;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644510PPt implements InterfaceC486070J4j {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC644520PPu LJ;
    public Boolean LJFF;
    public final InterfaceC486120J4o LJI;
    public long LJII;

    @Override // X.InterfaceC486070J4j
    public final void LJIIL(long j) {
    }

    @Override // X.InterfaceC486070J4j
    public final void LJIILIIL(long j) {
    }

    @Override // X.InterfaceC486070J4j
    public final boolean LJIIJJI() {
        return Intrinsics.LJFF(this.LJFF, Boolean.TRUE);
    }

    @Override // X.InterfaceC486070J4j
    public final void LIZ(Map<String, String> map) {
        InterfaceC644520PPu interfaceC644520PPu = this.LJ;
        if (interfaceC644520PPu != null) {
            Object obj = ((HashMap) map).get("roomId");
            if (obj == null) {
                obj = "";
            }
            interfaceC644520PPu.x((String) obj);
        }
    }

    @Override // X.InterfaceC486070J4j
    public final void LIZIZ(C486040J4g c486040J4g) {
        Integer num;
        if (Intrinsics.LJFF(this.LJFF, Boolean.FALSE)) {
            c486040J4g.onFail(-1, "");
            return;
        }
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        C15O7.LIZJ(new ACallableS242S0200000_10(this, num, 5)).LJ(new C0R4L(this, c486040J4g, 1), C15O7.LJIIIIZZ, null);
    }

    public C644510PPt(String str, long j, String str2, String str3, String str4, InterfaceC644520PPu interfaceC644520PPu, Boolean bool, InterfaceC486120J4o interfaceC486120J4o) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = interfaceC644520PPu;
        this.LJFF = bool;
        this.LJI = interfaceC486120J4o;
        this.LJII = j;
    }
}
