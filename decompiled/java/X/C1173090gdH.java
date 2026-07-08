package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.impl.PoiRecommendService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS17S2000000_18;
import kotlin.jvm.internal.AwS6S2110000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.videopublish.videounderstand.impl.PoiRecommendService$requestVideoUnderstand$1", f = "PoiRecommendService.kt", l = {53}, m = "invokeSuspend")
public final class C1173090gdH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PoiRecommendService LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1173090gdH(String str, String str2, PoiRecommendService poiRecommendService, InterfaceC497601wk interfaceC497601wk, String str3, InterfaceC1364105Vn<? super C1173090gdH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = poiRecommendService;
        this.LLILZLL = interfaceC497601wk;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1173090gdH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        boolean zIsSuccess;
        Object objLJLZ = obj;
        C1C7U.LIZ("PoiRecommendService@bc88.requestVideoUnderstand$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(objLJLZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJLZ);
                jCurrentTimeMillis = System.currentTimeMillis();
                C1173100gdI c1173100gdI = C1173100gdI.LIZ;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                c1173100gdI.getClass();
                if (C289320BVq.LIZ()) {
                    c1173100gdI.LIZJ("request_video_understanding", new AwS17S2000000_18(str, str2, 2));
                }
                C1172820gcq c1172820gcq = ((C1172830gcr) this.LLILZIL.LIZ.getValue()).LL;
                n nVar = new n();
                String str3 = this.LLIZ;
                String str4 = this.LLILLL;
                nVar.LJJIIJ("uri", str3);
                nVar.LJJIIJ("creation_id", str4);
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLJLZ = c1172820gcq.LJLZ(nVar, this);
                if (objLJLZ == objLJFF) {
                    C1C7U.LIZIZ("PoiRecommendService@bc88.requestVideoUnderstand$1");
                    return objLJFF;
                }
            }
            PoiVideoUnderstandResponse poiVideoUnderstandResponse = (PoiVideoUnderstandResponse) objLJLZ;
            this.LLILZIL.LIZJ = poiVideoUnderstandResponse;
            C1173100gdI c1173100gdI2 = C1173100gdI.LIZ;
            if (poiVideoUnderstandResponse != null) {
                zIsSuccess = poiVideoUnderstandResponse.isSuccess();
            } else {
                zIsSuccess = false;
            }
            Integer numLJ = C2286608xc.LJ((int) (System.currentTimeMillis() - jCurrentTimeMillis));
            String str5 = this.LLILLL;
            String str6 = this.LLILZ;
            c1173100gdI2.getClass();
            if (C289320BVq.LIZ()) {
                c1173100gdI2.LIZJ("video_understanding_callback", new AwS6S2110000_18(zIsSuccess, numLJ, str5, str6, 1));
            }
            C2296808zG.LIZJ(this.LLILZLL, null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PoiRecommendService@bc88.requestVideoUnderstand$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2296808zG.LIZJ(this.LLILZLL, null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
