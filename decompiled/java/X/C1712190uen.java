package X;

import Y.ARunnableS101S0100000_1;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0uen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712190uen extends AbstractC1506590pJB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1717770unn.LIZIZ().LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ instanceof C19EG) {
            C19EG c19eg = (C19EG) activityLIZIZ;
            C1712130ueh.LIZ.getClass();
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.xl;
            c770750ULh.LIZ = c0hti.LIZ(c19eg);
            c770750ULh.LIZLLL = 2;
            c770750ULh.LJ = c19eg.getString(2131833152);
            c770750ULh.LJFF(new C345890DhD(c19eg.getString(2131833149), true), new C345890DhD(c19eg.getString(2131833150), true), new C345890DhD(c19eg.getString(2131833151), true));
            c770750ULh.LJI(c19eg.getString(2131833064), AFwS268S0000000_26.get$arr$(629));
            c770750ULh.LJIILLIIL = true;
            c770750ULh.LIZIZ().LIZ.show(c19eg.getSupportFragmentManager(), "NFC_SCAN");
            IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
            if (iPipoCcdcService != null && iPipoCcdcService.LIZJ()) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS101S0100000_1(c19eg, 57));
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1506610pJD.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, 4);
    }
}
