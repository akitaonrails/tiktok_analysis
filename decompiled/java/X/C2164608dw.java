package X;

import com.ss.android.ugc.ur.school.educationsheet.CampusEducationSheetStatusAPI;
import com.ss.android.ugc.ur.school.educationsheet.CampusEducationSheetStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.educationsheet.CampusEducationSheetGate$loadAndCache$response$1$1", f = "CampusEducationSheetGate.kt", l = {145}, m = "invokeSuspend")
public final class C2164608dw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CampusEducationSheetStatusResponse>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164608dw(int i, InterfaceC1364105Vn<? super C2164608dw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2164608dw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusEducationSheetGate@5e9f.loadAndCache$response$1$1");
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
            CampusEducationSheetStatusAPI.LIZ.getClass();
            CampusEducationSheetStatusAPI value = C2164708dx.LIZIZ.getValue();
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            obj = value.getPopupStatus(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.loadAndCache$response$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.loadAndCache$response$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CampusEducationSheetStatusResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
