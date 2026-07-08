package X;

import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09KD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.AIRemixImageUploadStepImpl$transform$2$1", f = "AIRemixImageUploadStepImpl.kt", l = {43}, m = "invokeSuspend")
public final class C09KD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;
    public final /* synthetic */ C09KG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09KD(List<? extends MediaModel> list, C09KG c09kg, InterfaceC1364105Vn<? super C09KD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c09kg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09KD c09kd = new C09KD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c09kd.LLILLJJLI = obj;
        return c09kd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            List<MediaModel> list = this.LLILLL;
            C09KG c09kg = this.LLILZ;
            Iterator<MediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C09KF(c09kg, it2.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
