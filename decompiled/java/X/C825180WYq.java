package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0WYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825180WYq implements InterfaceC825130WYl {
    public final C825210WYt LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    public C825180WYq(C825210WYt c825210WYt) {
        this.LIZ = c825210WYt;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(236));
        this.LIZJ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(237));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS557S0100000_13(this, 157));
    }

    @Override // X.InterfaceC825130WYl
    public final Object getValue(String str) {
        Object c098200Yq;
        C0WR6 c0wr6Query;
        int iHashCode = str.hashCode();
        Object objCertToken = null;
        if (iHashCode != -625837026) {
            if (iHashCode != -286994931) {
                if (iHashCode == 3080477 && str.equals("dfid")) {
                    AtomicBoolean atomicBoolean = C825190WYr.LIZIZ;
                    if (!atomicBoolean.get()) {
                        return null;
                    }
                    try {
                        Cert cert = (Cert) this.LIZIZ.getValue();
                        if (cert == null) {
                            return null;
                        }
                        objCertToken = C825920Wac.LIZ(cert);
                        return objCertToken;
                    } catch (LinkageError e) {
                        TryCatchGuardChecker.doCheck(e);
                        atomicBoolean.set(false);
                        return objCertToken;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return objCertToken;
                    }
                }
            } else if (str.equals("unidfid")) {
                return this.LIZJ.getValue();
            }
        } else if (str.equals("cert_token")) {
            AtomicBoolean atomicBoolean2 = C825190WYr.LIZIZ;
            if (!atomicBoolean2.get()) {
                return null;
            }
            try {
                Cert cert2 = (Cert) this.LIZIZ.getValue();
                if (cert2 == null) {
                    return null;
                }
                objCertToken = cert2.certToken();
                return objCertToken;
            } catch (LinkageError e2) {
                TryCatchGuardChecker.doCheck(e2);
                atomicBoolean2.set(false);
                return objCertToken;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return objCertToken;
            }
        }
        try {
            PrivacyEvent privacyEvent = (PrivacyEvent) this.LIZLLL.getValue();
            if (privacyEvent != null && (c0wr6Query = privacyEvent.query(str)) != null) {
                c098200Yq = c0wr6Query.LIZ();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }
}
