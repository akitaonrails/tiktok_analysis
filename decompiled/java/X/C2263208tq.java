package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundUploadComponent$processNewArguments$1", f = "AIPlaygroundUploadComponent.kt", l = {240, 241}, m = "invokeSuspend")
public final class C2263208tq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public UploadImageParam LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1851600yHe LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263208tq(C1851600yHe c1851600yHe, String str, String str2, int i, InterfaceC1364105Vn<? super C2263208tq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1851600yHe;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2263208tq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        UploadImageParam uploadImageParam;
        C1C7U.LIZ("AIPlaygroundUploadComponent@75e7.processNewArguments$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    uploadImageParam = this.LL;
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.F4(uploadImageParam, (UploadImageParam) obj, this.LLILZLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.processNewArguments$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1851600yHe c1851600yHe = this.LLILLL;
            String str = this.LLILZ;
            this.LLILLJJLI = 1;
            obj = c1851600yHe.D5(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.processNewArguments$1");
                return objLJFF;
            }
        }
        UploadImageParam uploadImageParam2 = (UploadImageParam) obj;
        C1851600yHe c1851600yHe2 = this.LLILLL;
        String str2 = this.LLILZIL;
        this.LL = uploadImageParam2;
        this.LLILLJJLI = 2;
        Object objD5 = c1851600yHe2.D5(str2, this);
        if (objD5 == objLJFF) {
            C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.processNewArguments$1");
            return objLJFF;
        }
        uploadImageParam = uploadImageParam2;
        obj = objD5;
        this.LLILLL.F4(uploadImageParam, (UploadImageParam) obj, this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundUploadComponent@75e7.processNewArguments$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
