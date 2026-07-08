package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01u0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel$submitOriginalCaptions$1", f = "NewCreatorCaptionEditViewModel.kt", l = {166}, m = "invokeSuspend")
public final class C480601u0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ NewCreatorCaptionEditItem LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C480601u0(Function1<? super String, Unit> function1, Function1<? super Integer, Unit> function12, long j, String str, NewCreatorCaptionEditItem newCreatorCaptionEditItem, InterfaceC1364105Vn<? super C480601u0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = newCreatorCaptionEditItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C480601u0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NewCreatorCaptionEditViewModel@b8c6.submitOriginalCaptions$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C480501tz c480501tz = new C480501tz(this.LLILZ, this.LLILZIL, this.LLILZLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c480501tz);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.submitOriginalCaptions$1");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) obj;
            if (c0x52.LIZJ()) {
                this.LLILLL.invoke(C2286608xc.LJ(((BaseResponse) c0x52.LIZIZ).status_code));
            } else {
                this.LLILLJJLI.invoke(c0x52.LIZ.LJI);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.submitOriginalCaptions$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Function1<String, Unit> function1 = this.LLILLJJLI;
            String message = e.getMessage();
            if (message == null) {
                message = "API failed wit exception";
            }
            function1.invoke(message);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.submitOriginalCaptions$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
