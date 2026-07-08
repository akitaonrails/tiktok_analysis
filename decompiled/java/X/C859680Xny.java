package X;

import android.content.DialogInterface;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment$onBindTwitter$1$1", f = "ProfileEditFragment.kt", l = {2303}, m = "invokeSuspend")
public final class C859680Xny extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DialogInterface LLILLJJLI;
    public final /* synthetic */ ProfileEditFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859680Xny(DialogInterface dialogInterface, ProfileEditFragment profileEditFragment, InterfaceC1364105Vn<? super C859680Xny> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dialogInterface;
        this.LLILLL = profileEditFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859680Xny(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ProfileEditFragment@18c.onBindTwitter$1$1");
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
            this.LLILLJJLI.dismiss();
            this.LLILLL.sT();
            C0YZL c0yzlSS = this.LLILLL.sS();
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C859650Xnv(c0yzlSS, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ProfileEditFragment@18c.onBindTwitter$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditFragment@18c.onBindTwitter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
