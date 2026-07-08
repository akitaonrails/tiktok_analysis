package X;

import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2$performUploadProcessInBackground$3", f = "SocialAvatarCreationViewModelV2.kt", l = {270}, m = "invokeSuspend")
public final class C439420HKy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ RectF LLILZIL;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439420HKy(String str, String str2, RectF rectF, SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, float f, int i, int i2, int i3, Boolean bool, InterfaceC1364105Vn<? super C439420HKy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = rectF;
        this.LLILZLL = socialAvatarCreationViewModelV2;
        this.LLIZ = f;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = i3;
        this.LLJIJIL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C439420HKy c439420HKy = new C439420HKy(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c439420HKy.LLILLJJLI = obj;
        return c439420HKy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        Object objLIZIZ = obj;
        C1C7U.LIZ("SocialAvatarCreationViewModelV2@c606.performUploadProcessInBackground$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLIZIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C439430HKz(this.LLILZLL, this.LLJIJIL, null), 3);
                C0HLI c0hli = C0HLI.LIZ;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                RectF rectF = this.LLILZIL;
                String strWQ2 = this.LLILZLL.wQ2();
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLIZIZ = c0hli.LIZIZ(str, str2, rectF, strWQ2, false, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.performUploadProcessInBackground$3");
                    return objLJFF;
                }
            }
            this.LLILZLL.CQ2((List) objLIZIZ, this.LLIZ, C2286608xc.LJ(this.LLIZLLLIL), C2286608xc.LJ(this.LLJ), C2286608xc.LJ(this.LLJI), interfaceC497601wk);
        } catch (C0HKJ e) {
            TryCatchGuardChecker.doCheck(e);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("fail_reason", "client_algo_check_no_face");
            C20684815ws.LJIILLIIL("social_avatar_error", c2344009Gk.LIZ);
            this.LLILZLL.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_IMAGE_UPLOADING);
        } catch (C439330HKp e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILZLL.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_IMAGE_UPLOADING);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLILZLL.LLJJLIIIJLLLLLLLZ.invoke(EnumC439250HKh.FAILURE_IMAGE_UPLOADING);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.performUploadProcessInBackground$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
