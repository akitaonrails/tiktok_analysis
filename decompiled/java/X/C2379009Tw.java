package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.retouch.common.logic.FaceDetectionHandler$conductFaceDetection$1", f = "FaceDetectionHandler.kt", l = {135}, m = "invokeSuspend")
public final class C2379009Tw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C360100E9w LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ NLETrackSlot LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2379009Tw(C360100E9w c360100E9w, String str, int i, int i2, boolean z, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C2379009Tw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c360100E9w;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLIZ = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2379009Tw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectionHandler@d665.conductFaceDetection$1");
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
            Activity activity = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            C370680Eg6 c370680Eg6 = new C370680Eg6();
            c370680Eg6.LIZIZ(this.LLILZ);
            c370680Eg6.LIZ(this.LLILZIL);
            c370680Eg6.LIZJ = Bitmap.Config.ARGB_8888;
            C370690Eg7 c370690Eg7 = new C370690Eg7(c370680Eg6);
            this.LL = 1;
            obj = C383660F2m.LIZIZ(activity, str, c370690Eg7, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FaceDetectionHandler@d665.conductFaceDetection$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.LLILLJJLI.LIZIZ(this.LLILZLL, this.LLIZ, bitmap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FaceDetectionHandler@d665.conductFaceDetection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
