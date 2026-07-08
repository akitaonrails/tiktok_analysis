package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.CheckI2vQuotaNodeKt$checkI2vQuotaNode$1", f = "CheckI2vQuotaNode.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C531720KtG extends C09AX implements Function2<C531710KtF, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C531720KtG(InterfaceC1364105Vn<? super C531720KtG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531720KtG c531720KtG = new C531720KtG(interfaceC1364105Vn);
        c531720KtG.LLILLL = obj;
        return c531720KtG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C531710KtF c531710KtF;
        long jElapsedRealtime;
        int i;
        String str;
        C532330KuF c532330KuF;
        String str2;
        Object objLJIJ = obj;
        C1C7U.LIZ("CheckI2vQuotaNodeKt@5ec1.checkI2vQuotaNode$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        String str3 = "";
        if (i2 != 0) {
            if (i2 == 1) {
                jElapsedRealtime = this.LL;
                c531710KtF = (C531710KtF) this.LLILLL;
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            c531710KtF = (C531710KtF) this.LLILLL;
            jElapsedRealtime = SystemClock.elapsedRealtime();
            Activity activity = c531710KtF.LIZIZ;
            String str4 = c531710KtF.LIZJ;
            if (str4 == null) {
                str4 = "";
            }
            TemplateConsumeCoreParam templateConsumeCoreParam = c531710KtF.LIZ;
            String str5 = templateConsumeCoreParam.templateId;
            int value = templateConsumeCoreParam.templateType.getValue();
            String str6 = c531710KtF.LIZLLL;
            this.LLILLL = c531710KtF;
            this.LL = jElapsedRealtime;
            this.LLILLJJLI = 1;
            C531740KtI c531740KtI = C531730KtH.LIZ;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            new C536500L2i(activity).LIZ(value, str4, str5, str6, new C5183020f(c2252611DEt, 150));
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("CheckI2vQuotaNodeKt@5ec1.checkI2vQuotaNode$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJIJ).booleanValue();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        C531740KtI c531740KtI2 = C531730KtH.LIZ;
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(c531710KtF.LIZ.templateId);
        if (c531550KszLIZ != null && (c532330KuF = c531550KszLIZ.LIZJ) != null && (str2 = c532330KuF.LIZ) != null) {
            str3 = str2;
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            TemplateConsumeCoreParam templateConsumeCoreParam2 = c531710KtF.LIZ;
            String str7 = templateConsumeCoreParam2.templateId;
            Integer numValueOf = Integer.valueOf(templateConsumeCoreParam2.templateType.getValue());
            String str8 = c531710KtF.LIZ.dispatchType.LIZ;
            if (zBooleanValue) {
                i = 0;
            } else {
                i = -1;
            }
            if (zBooleanValue) {
                str = null;
            } else {
                str = "i2v_quota_exceeded";
            }
            iTemplateMobService.LJ(str7, numValueOf, str3, str8, "check_i2v_quota", jElapsedRealtime2, zBooleanValue, i, false, str, null, null, c531710KtF.LJ, c531710KtF.LIZJ, true, new LinkedHashMap());
        }
        if (zBooleanValue) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CheckI2vQuotaNodeKt@5ec1.checkI2vQuotaNode$1");
            return unit;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckI2vQuotaNode blocked: id=");
        sbLIZ.append(c531710KtF.LIZ.templateId);
        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CheckI2vQuotaNode I2V quota exceeded, id=");
        sbLIZ2.append(c531710KtF.LIZ.templateId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531710KtF c531710KtF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c531710KtF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
