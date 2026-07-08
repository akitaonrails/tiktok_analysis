package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask$execute$1", f = "MobileEffectUploadTask.kt", l = {}, m = "invokeSuspend")
public final class C1637720sig extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<UploadableDraftEffect> LL;
    public final /* synthetic */ C1662990tNR LLILLJJLI;
    public final /* synthetic */ UploadAuthKeyConfig LLILLL;
    public final /* synthetic */ UploadImageConfig LLILZ;
    public final /* synthetic */ UploadImageConfig LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637720sig(UploadAuthKeyConfig uploadAuthKeyConfig, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, C1662990tNR c1662990tNR, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1662990tNR;
        this.LLILLL = uploadAuthKeyConfig;
        this.LLILZ = uploadImageConfig;
        this.LLILZIL = uploadImageConfig2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<UploadableDraftEffect> list = this.LL;
        return new C1637720sig(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUploadTask@45ee.execute$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isEmpty()) {
            if (C2176808fu.LIZ()) {
                for (UploadableDraftEffect uploadableDraftEffect : this.LL) {
                    if (uploadableDraftEffect.capturedInPhotoMode) {
                        uploadableDraftEffect.needSubmission = true;
                    }
                }
            }
            C1662990tNR c1662990tNR = this.LLILLJJLI;
            C23250099c.LIZLLL((InterfaceC497601wk) c1662990tNR.LLIZ.getValue(), null, null, new C1662950tNN(this.LLILLL, this.LLILZ, this.LLILZIL, c1662990tNR, this.LL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectUploadTask@45ee.execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
