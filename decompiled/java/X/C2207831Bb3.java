package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageXUploader;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS139S0101000_34;
import kotlin.jvm.internal.AwS46S0010000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS84S1000000_34;

/* JADX INFO: renamed from: X.1Bb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207831Bb3 extends AbstractImageUploader {
    public final Object LIZJ = new Object();
    public final BDImageXUploader LIZLLL;

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZ() {
        LJIILJJIL(new AwS613S0100000_34(this, 158));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZIZ() {
        LJIILJJIL(AFwS281S0000000_34.get$arr$(71));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZJ() {
        if (!((Boolean) C264130AWt.LIZ.getValue()).booleanValue()) {
            this.LIZIZ = true;
            this.LIZLLL.close();
            return;
        }
        synchronized (this.LIZJ) {
            try {
                this.LIZIZ = true;
                this.LIZLLL.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final String LJIIIIZZ() {
        Object objInvoke;
        AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(72);
        if (((Boolean) C264130AWt.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZJ) {
                try {
                    objInvoke = !this.LIZIZ ? aFwS281S0000000_34.invoke(this.LIZLLL) : null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            objInvoke = aFwS281S0000000_34.invoke(this.LIZLLL);
        }
        String str = (String) objInvoke;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIILIIL() {
        LJIILJJIL(AFwS281S0000000_34.get$arr$(73));
    }

    public C2207831Bb3(UploadImageConfig uploadImageConfig) {
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(uploadImageConfig.imageHostName);
        bDImageXUploader.setTopAccessKey(uploadImageConfig.authorizationV2.accessKeyId);
        bDImageXUploader.setTopSecretKey(uploadImageConfig.authorizationV2.secretAccessKey);
        bDImageXUploader.setTopSessionToken(uploadImageConfig.authorizationV2.sessionToken);
        bDImageXUploader.setServiceID(uploadImageConfig.authorizationV2.spaceName);
        bDImageXUploader.setNetworkType(403, C541470LLl.LIZ());
        bDImageXUploader.setNetworkType(404, C2207881Bb8.LIZ());
        bDImageXUploader.setSocketNum(uploadImageConfig.socketNumber);
        bDImageXUploader.setFileRetryCount(uploadImageConfig.fileRetryCount);
        bDImageXUploader.setSliceRetryCount(uploadImageConfig.sliceRetryCount);
        bDImageXUploader.setRWTimeout(uploadImageConfig.rwTimeout);
        bDImageXUploader.setMaxFailTime(uploadImageConfig.maxFailTime);
        TreeMap<String, Object> treeMap = new TreeMap<>();
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
        bDImageXUploader.setCustomHttpHeaders(treeMap);
        this.LIZLLL = bDImageXUploader;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJ(InterfaceC2207871Bb7 interfaceC2207871Bb7) {
        LJIILJJIL(new AwS613S0100000_34(interfaceC2207871Bb7, 159));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJJI(boolean z) {
        LJIILJJIL(new AwS46S0010000_34(z, 7));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIL(String str) {
        LJIILJJIL(new AwS84S1000000_34(str, 13));
    }

    public final void LJIILJJIL(Function1<? super BDImageXUploader, Unit> function1) {
        if (((Boolean) C264130AWt.LIZ.getValue()).booleanValue()) {
            synchronized (this.LIZJ) {
                try {
                    if (!this.LIZIZ) {
                        function1.invoke(this.LIZLLL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        function1.invoke(this.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIIZ(int i, String[] strArr) {
        LJIILJJIL(new AwS139S0101000_34(i, strArr, 1));
    }
}
