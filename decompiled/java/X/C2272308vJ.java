package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffects$2$deferred$1$1", f = "MobileEffectUploader.kt", l = {56}, m = "invokeSuspend")
public final class C2272308vJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2272408vK>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2277008w4 LLILLL;
    public final /* synthetic */ UploadableMobileEffect LLILZ;
    public final /* synthetic */ UploadImageConfig LLILZIL;
    public final /* synthetic */ UploadImageConfig LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272308vJ(C2277008w4 c2277008w4, UploadableMobileEffect uploadableMobileEffect, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC1364105Vn<? super C2272308vJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2277008w4;
        this.LLILZ = uploadableMobileEffect;
        this.LLILZIL = uploadImageConfig;
        this.LLILZLL = uploadImageConfig2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2272308vJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objLIZ = obj;
        C1C7U.LIZ("MobileEffectUploader@ef88.createEffects$2$deferred$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            jCurrentTimeMillis = System.currentTimeMillis();
            C2277008w4 c2277008w4 = this.LLILLL;
            UploadableMobileEffect uploadableMobileEffect = this.LLILZ;
            UploadImageConfig uploadImageConfig = this.LLILZIL;
            UploadImageConfig uploadImageConfig2 = this.LLILZLL;
            Integer numLJ = C2286608xc.LJ(310);
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            objLIZ = C2277008w4.LIZ(c2277008w4, uploadableMobileEffect, uploadImageConfig, uploadImageConfig2, "mobile_effect_template", numLJ, null, null, this, 224);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffects$2$deferred$1$1");
                return objLJFF;
            }
        }
        C2272408vK c2272408vK = new C2272408vK(this.LLILZ, ((C1662960tNO) objLIZ).LIZ, System.currentTimeMillis() - jCurrentTimeMillis);
        C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffects$2$deferred$1$1");
        return c2272408vK;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2272408vK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
