package X;

import android.content.Intent;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.DeclarationOption;
import com.ss.android.ugc.aweme.ogc.declaration.page.DateLocationInfo;
import com.ss.android.ugc.aweme.ogc.declaration.page.PageEnterParams;
import com.ss.android.ugc.aweme.ogc.declaration.repo.AuthorDeclarationResponse;
import com.ss.android.ugc.aweme.ogc.declaration.repo.DeclarationOptions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618480sDe {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1618490sDf());

    public final C1618500sDg LIZJ() {
        DeclarationOptions declarationOptions;
        this.LIZ.getValue().getClass();
        AuthorDeclarationResponse authorDeclarationResponseLIZ = C1440405kQ.LIZ();
        if (authorDeclarationResponseLIZ == null || (declarationOptions = authorDeclarationResponseLIZ.getDeclarationOptions(DeclarationOption.DATE_LOC)) == null) {
            return null;
        }
        return new C1618500sDg(declarationOptions.termLink);
    }

    public static final String LIZIZ(long j) {
        C1579090rC7.LIZ.getClass();
        return C1579090rC7.LIZ(j);
    }

    public final boolean LIZ(Map<DeclarationOption, Boolean> map) {
        Object c098200Yq;
        InterfaceC1440605kS interfaceC1440605kS;
        C11NZ<AuthorDeclarationResponse> c11nzLIZ;
        try {
            ((C1440405kQ) this.LIZ.getValue()).getClass();
            if (((Boolean) C1236904sh.LIZ.getValue()).booleanValue() && (interfaceC1440605kS = (InterfaceC1440605kS) C1440405kQ.LIZIZ.getValue()) != null && (c11nzLIZ = interfaceC1440605kS.LIZ()) != null) {
                c11nzLIZ.LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.05kR
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DeclarationRepo@8e92.updateDeclarationInfo$1");
                        C1440405kQ.LIZ.getClass();
                        Keva keva = (Keva) C1440405kQ.LIZJ.getValue();
                        C1227904rF.LIZ.getClass();
                        keva.storeString("STORAGE_KEY_AUTHOR_DECLARATION_RESPONSE", C1227904rF.LJI(obj));
                        C1C7U.LIZIZ("DeclarationRepo@8e92.updateDeclarationInfo$1");
                    }
                }, new C09JN() { // from class: X.00Of
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("DeclarationRepo@8e92.updateDeclarationInfo$2");
                        C1C7U.LIZIZ("DeclarationRepo@8e92.updateDeclarationInfo$2");
                    }
                });
            }
            ((C1440405kQ) this.LIZ.getValue()).getClass();
            AuthorDeclarationResponse authorDeclarationResponseLIZ = C1440405kQ.LIZ();
            boolean z = false;
            if (authorDeclarationResponseLIZ == null) {
                return false;
            }
            if (Intrinsics.LJFF(authorDeclarationResponseLIZ.integrateEntrance, Boolean.TRUE)) {
                ArrayList arrayList = new ArrayList();
                for (DeclarationOption declarationOption : authorDeclarationResponseLIZ.getSupportDeclarationTypes()) {
                    Boolean bool = map.get(declarationOption);
                    if (bool != null) {
                        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                            arrayList.add(declarationOption);
                        }
                    } else {
                        arrayList.add(declarationOption);
                    }
                }
                if (arrayList.size() > 1) {
                    z = true;
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
    }

    public static final void LIZLLL(C19EG c19eg, PageEnterParams pageEnterParams, final AwS601S0100000_22 awS601S0100000_22) {
        final int iNextInt = AbstractC19994813Le.Default.nextInt(100, 10000);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://add_date_and_location");
        smartRouteBuildRoute.withParam("add_date_and_location_page_enter_param_key", pageEnterParams);
        smartRouteBuildRoute.open(iNextInt, new OnActivityResultCallback() { // from class: X.0nik
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                Serializable serializableExtra;
                if (iNextInt == i) {
                    Function1<DateLocationInfo, Unit> function1 = awS601S0100000_22;
                    Serializable serializable = null;
                    if (intent != null) {
                        serializableExtra = intent.getSerializableExtra("add_date_and_location_page_exit_result_key");
                    } else {
                        serializableExtra = null;
                    }
                    if (serializableExtra instanceof DateLocationInfo) {
                        serializable = serializableExtra;
                    }
                    function1.invoke((DateLocationInfo) serializable);
                }
            }
        });
    }
}
