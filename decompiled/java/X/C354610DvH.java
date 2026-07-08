package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateMattingService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0DvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354610DvH implements InterfaceC354490Dv5 {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public NLETemplateMattingService LJII;
    public EnumC356120Dxi LJIIIIZZ;
    public final Keva LJIIIZ;
    public boolean LJIIJ;

    public final boolean LJJIIZI() {
        EnumC356120Dxi enumC356120Dxi = this.LJIIIIZZ;
        return enumC356120Dxi == EnumC356120Dxi.SUCCESS || enumC356120Dxi == EnumC356120Dxi.FAILED || enumC356120Dxi == EnumC356120Dxi.CANCELED;
    }

    @Override // X.InterfaceC354490Dv5
    public final void cancel() {
        EnumC356120Dxi enumC356120Dxi = this.LJIIIIZZ;
        EnumC356120Dxi enumC356120Dxi2 = EnumC356120Dxi.CANCELED;
        if (enumC356120Dxi == enumC356120Dxi2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Template_Matting cancel. status=");
            sbLIZ.append(this.LJIIIIZZ);
            C201955140j.LIZIZ("TemplateMattingTask", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C201955140j.LIZIZ("TemplateMattingTask", "Template_Matting cancel");
        NLETemplateMattingService nLETemplateMattingService = this.LJII;
        if (nLETemplateMattingService != null) {
            nLETemplateMattingService.clear();
        }
        this.LJIIIIZZ = enumC356120Dxi2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354610DvH.LJJIIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Type inference failed for: r13v4, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(com.bytedance.ies.nle.editor_jni.NLETemplateModel r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354610DvH.LJJIJIIJI(com.bytedance.ies.nle.editor_jni.NLETemplateModel, X.05Vn):java.lang.Object");
    }

    public static Object LJJIIJZLJL(String str, List list, C354630DvJ c354630DvJ) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c354630DvJ));
        c2252611DEt.LJIJJ();
        C569610MVr.LIZIZ().LJIIJ(new ArrayList<>(list), str, true, new C513401zI(c2252611DEt, 0));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c354630DvJ);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010a A[LOOP:0: B:41:0x0104->B:43:0x010a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJIL(com.bytedance.ies.nle.editor_jni.NLETemplateModel r22, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r23, X.InterfaceC1364105Vn<? super X.C354700DvQ> r24) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354610DvH.LJJIJIIJIL(com.bytedance.ies.nle.editor_jni.NLETemplateModel, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public final void LJJIJ(int i, long j, String str, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", this.LIZIZ);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("template_matting", c0lab.LIZ);
        ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, "task_matting", j, z, i, false, str, null, null, null, null, this.LJI, new LinkedHashMap());
    }

    public C354610DvH(CreativeInfo creativeInfo, String str, Integer num, String str2, String str3, boolean z, int i) {
        boolean z2;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 64) != 0 ? false : z;
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z2;
        this.LJI = z;
        this.LJIIIIZZ = EnumC356120Dxi.NONE;
        this.LJIIIZ = Keva.getRepo("repo_template_matting");
    }
}
