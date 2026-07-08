package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.net.URI;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintHelper$downloadWithRetry$1$success$1", f = "AIFingerprintHelper.kt", l = {58}, m = "invokeSuspend")
public final class C1407580mjU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C1407580mjU(InterfaceC1364105Vn<? super C1407580mjU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407580mjU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIFingerprintHelper@da60.downloadWithRetry$1$success$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1435570nSd c1435570nSd = C1435570nSd.LIZ;
            this.LL = 1;
            c1435570nSd.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final String str = C1435830nT3.LIZ().lensModelName;
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{""}, C2097608Jq.LJIIJ(new Pair("", C1697810uHb.LJIILJJIL(str))), new IFetchResourceListener() { // from class: X.0nkB
                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onFailure(Exception exc) {
                    System.out.print(exc.getStackTrace());
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onSuccess(long j) {
                    String strFindResourceUri;
                    try {
                        if (C13Q5.LIZJ()) {
                            strFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str);
                        } else {
                            strFindResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, str);
                        }
                        C1435570nSd.LIZIZ = URI.create(strFindResourceUri).getPath();
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn.resumeWith(bool);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        System.out.print(e.getStackTrace());
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                        Boolean bool2 = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool2);
                        interfaceC1364105Vn2.resumeWith(bool2);
                    }
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIFingerprintHelper@da60.downloadWithRetry$1$success$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIFingerprintHelper@da60.downloadWithRetry$1$success$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C1407580mjU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
