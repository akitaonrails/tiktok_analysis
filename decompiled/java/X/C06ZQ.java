package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.report.ReportUtils;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.report.ReportUtils$sendReportV2$1$1", f = "ReportUtils.kt", l = {159, 177}, m = "invokeSuspend")
public final class C06ZQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1755906uD LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ C912520Zr0 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZQ(Activity activity, InterfaceC1755906uD interfaceC1755906uD, C869590Y9l c869590Y9l, C912520Zr0 c912520Zr0, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1755906uD;
        this.LLILLL = z;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = activity;
        this.LLILZLL = c912520Zr0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        InterfaceC1755906uD interfaceC1755906uD = this.LLILLJJLI;
        boolean z = this.LLILLL;
        return new C06ZQ(this.LLILZIL, interfaceC1755906uD, this.LLILZ, this.LLILZLL, interfaceC1364105Vn, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        List listLJFF;
        int iIntValue;
        C1C7U.LIZ("ReportUtils@d61.sendReportV2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1755906uD interfaceC1755906uD = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC1755906uD.LJII(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReportUtils@d61.sendReportV2$1$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (this.LLILLL) {
            SettingsManager.LIZLLL().getClass();
            numLJ = C2286608xc.LJ(SettingsManager.LJ("dm_report_public_group_msg_count", 21));
        } else {
            numLJ = null;
        }
        C869590Y9l c869590Y9l = this.LLILZ;
        if (c869590Y9l == null) {
            ReportUtils.LIZIZ.getClass();
            List listLJI = ReportUtils.LJI(list);
            if (numLJ != null) {
                iIntValue = numLJ.intValue();
            } else {
                iIntValue = ReportUtils.LIZJ;
            }
            listLJFF = C13LP.LL(listLJI, iIntValue);
        } else {
            ReportUtils.LIZIZ.getClass();
            listLJFF = ReportUtils.LJFF(list, c869590Y9l, numLJ);
        }
        if (listLJFF.isEmpty()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZIL);
            c1389890mGx.LJIIJ(this.LLILZIL.getString(2131831100));
            c1389890mGx.LJIIJJI();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReportUtils@d61.sendReportV2$1$1");
            return unit;
        }
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJIIL();
        }
        ReportUtils reportUtils = ReportUtils.LIZIZ;
        Activity activity = this.LLILZIL;
        C912520Zr0 c912520Zr0 = this.LLILZLL;
        reportUtils.getClass();
        ReportUtils.LJ(activity, c912520Zr0, listLJFF);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ReportUtils@d61.sendReportV2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
