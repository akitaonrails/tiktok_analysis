package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.bduploader.BDVideoUploader;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS45S0001000_34;
import kotlin.jvm.internal.AwS46S0010000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS84S1000000_34;

/* JADX INFO: renamed from: X.1BbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208141BbY extends AbstractC1434250nQV {
    public final Function0<BDVideoUploader> LIZ;
    public boolean LIZIZ;
    public volatile boolean LIZJ;
    public final Object LIZLLL = new Object();
    public BDVideoUploader LJ;

    @Override // X.AbstractC1434250nQV
    public final void LIZ() {
        LJJIII(AFwS281S0000000_34.get$arr$(49));
    }

    @Override // X.AbstractC1434250nQV
    public final void LIZIZ() {
        LJJIII(AFwS281S0000000_34.get$arr$(50));
    }

    @Override // X.AbstractC1434250nQV
    public final void LIZJ() {
        if (((Boolean) C266650Ach.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZLLL) {
                try {
                    if (this.LJ != null) {
                        this.LIZJ = true;
                        BDVideoUploader bDVideoUploader = this.LJ;
                        (bDVideoUploader != null ? bDVideoUploader : null).close();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(this, 108);
        if (!C0BYW.LIZ()) {
            BDVideoUploader bDVideoUploader2 = this.LJ;
            awS613S0100000_34.invoke(bDVideoUploader2 != null ? bDVideoUploader2 : null);
        } else {
            BDVideoUploader bDVideoUploader3 = this.LJ;
            if (bDVideoUploader3 != null) {
                awS613S0100000_34.invoke(bDVideoUploader3);
            }
        }
    }

    @Override // X.AbstractC1434250nQV
    public final String LIZLLL() {
        BDVideoUploader bDVideoUploader;
        AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(51);
        if (((Boolean) C266650Ach.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZLLL) {
                try {
                    if (!this.LIZJ && (bDVideoUploader = this.LJ) != null) {
                        objInvoke = aFwS281S0000000_34.invoke(bDVideoUploader);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            BDVideoUploader bDVideoUploader2 = this.LJ;
            objInvoke = aFwS281S0000000_34.invoke(bDVideoUploader2 != null ? bDVideoUploader2 : null);
        }
        String str = (String) objInvoke;
        return str == null ? "" : str;
    }

    @Override // X.AbstractC1434250nQV
    public final void LJFF() {
        LJJIII(AFwS281S0000000_34.get$arr$(52));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJI() {
        LJJIII(AFwS281S0000000_34.get$arr$(53));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIZILJ() {
        LJJIII(new AwS46S0010000_34(6));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIJ() {
        LJJIII(new AwS45S0001000_34(6));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJJII() {
        LJJIII(AFwS281S0000000_34.get$arr$(54));
    }

    static {
        C1462550oA9.LIZ();
    }

    @Override // X.AbstractC1434250nQV
    public final boolean LJ() {
        return this.LIZIZ;
    }

    public C2208141BbY(AFwS225S0000000_34 aFwS225S0000000_34) {
        this.LIZ = aFwS225S0000000_34;
    }

    @Override // X.AbstractC1434250nQV
    public final void LJII(String str) {
        LJJIII(new AwS84S1000000_34(str, 8));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIIIZZ(String str) {
        LJJIII(new AwS84S1000000_34(str, 9));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIIZ(String str) {
        LJJIII(new AwS84S1000000_34(str, 10));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIJ(TreeMap<String, Object> treeMap) {
        if (this.LJ == null) {
            return;
        }
        LJJIII(new AwS613S0100000_34(treeMap, (TreeMap<String, Object>) 109));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIJJI(C1434260nQW c1434260nQW) {
        LJJIII(new AwS613S0100000_34(c1434260nQW, 111));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIIL(InterfaceC2208121BbW interfaceC2208121BbW) {
        LJJIII(new AwS613S0100000_34(interfaceC2208121BbW, 110));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIILIIL(String str) {
        LJJIII(new AwS84S1000000_34(str, 11));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIILJJIL(float f) {
        LJJIII(new C2208131BbX(f));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIILL(int i) {
        LJJIII(new AwS45S0001000_34(i, 0));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIILLIIL(boolean z) {
        LJJIII(new AwS46S0010000_34(z, 5));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIJI(int i) {
        LJJIII(new AwS45S0001000_34(i, 1));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIJJ(int i) {
        LJJIII(new AwS45S0001000_34(i, 2));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIJJLI(int i) {
        LJJIII(new AwS45S0001000_34(i, 3));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJIL(int i) {
        LJJIII(new AwS45S0001000_34(i, 4));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJJ(int i) {
        LJJIII(new AwS45S0001000_34(i, 5));
    }

    @Override // X.AbstractC1434250nQV
    public final void LJJI(String str) {
        LJJIII(new AwS84S1000000_34(str, 12));
    }

    public final void LJJIII(Function1<? super BDVideoUploader, Unit> function1) {
        BDVideoUploader bDVideoUploader;
        if (((Boolean) C266650Ach.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZLLL) {
                try {
                    if (!this.LIZJ && (bDVideoUploader = this.LJ) != null) {
                        function1.invoke(bDVideoUploader);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        BDVideoUploader bDVideoUploader2 = this.LJ;
        if (bDVideoUploader2 == null) {
            bDVideoUploader2 = null;
        }
        function1.invoke(bDVideoUploader2);
    }

    @Override // X.AbstractC1434250nQV
    public final void LJJIFFI(UploadAuthKeyConfig uploadAuthKeyConfig, Map<String, String> map) {
        UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
        if (uploadVideoConfig != null) {
            STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
            if (sTSAuthConfig != null) {
                this.LJ = this.LIZ.invoke();
                LJJIII(new C2207951BbF(this, sTSAuthConfig, uploadVideoConfig, uploadAuthKeyConfig, map));
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
