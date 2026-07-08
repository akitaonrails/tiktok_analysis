package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintHelper$postFingerprintModel$1$1", f = "AIFingerprintHelper.kt", l = {135}, m = "invokeSuspend")
public final class C1415740mwe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415740mwe(String str, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1415740mwe c1415740mwe = new C1415740mwe(this.LLIZ, this.LLILZLL, interfaceC1364105Vn);
        c1415740mwe.LLILZIL = obj;
        return c1415740mwe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        int i;
        Object c098200Yq;
        String str3;
        C1C7U.LIZ("AIFingerprintHelper@da60.postFingerprintModel$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILLL;
                str3 = (String) this.LLILLJJLI;
                str2 = (String) this.LL;
                str = (String) this.LLILZIL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            str = this.LLILZLL.creativeModel.privacySettingModel.fingerprintId;
            boolean z3 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AIFingerprintHelper@da60.postFingerprintModel$1$1");
                return unit;
            }
            VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
            if (videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJI = C1436990nUv.LJI(videoPublishEditModel);
            if (z2 || zLJI) {
                z3 = true;
            }
            if (!z3) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AIFingerprintHelper@da60.postFingerprintModel$1$1");
                return unit2;
            }
            str2 = this.LLIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLILZLL;
            i = videoPublishEditModel2.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
            try {
                Gson gson = C0CHQ.LIZ().getGson();
                C140D.LIZ.getClass();
                c098200Yq = gson.LJIILL(C140D.LJ(videoPublishEditModel2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            str3 = (String) c098200Yq;
            C140D c140d = C140D.LIZ;
            VideoPublishEditModel videoPublishEditModel3 = this.LLILZLL;
            this.LLILZIL = str;
            this.LL = str2;
            this.LLILLJJLI = str3;
            this.LLILLL = i;
            this.LLILZ = 1;
            obj = c140d.LJIILIIL(videoPublishEditModel3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIFingerprintHelper@da60.postFingerprintModel$1$1");
                return objLJFF;
            }
        }
        String str4 = (String) obj;
        C13BV c13bv = C13BV.INSTANCE;
        AIFingerprintApi.PostApi postApi = (AIFingerprintApi.PostApi) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, AIFingerprintApi.PostApi.class);
        h hVar = new h();
        h hVar2 = new h();
        Iterator it2 = c13bv.iterator();
        while (it2.hasNext()) {
            hVar.LJJIII((String) it2.next());
        }
        Iterator it3 = c13bv.iterator();
        while (it3.hasNext()) {
            hVar2.LJJIII((String) it3.next());
        }
        n nVar = new n();
        nVar.LJJIII(Long.valueOf(CastLongProtector.parseLong(str)), "fingerprint_id");
        if (C123100dR.LIZ(str2)) {
            nVar.LJJIII(Long.valueOf(CastLongProtector.parseLong(str2)), "aweme_id");
        }
        nVar.LJJIII(Integer.valueOf(i), "aigc_label_type");
        nVar.LJJIIJ("c2pa_info", str3);
        nVar.LJJIIJ("c2pa_meta_data", str4);
        nVar.LJJIFFI("prompt_trace_id_list", hVar);
        nVar.LJJIFFI("former_fingerprint_id_list", hVar2);
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LIZLLL = 30000L;
        c1493620oyG.LIZJ = 30000L;
        c1493620oyG.LJ = 30000L;
        postApi.post(nVar, c1493620oyG).execute();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIFingerprintHelper@da60.postFingerprintModel$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
