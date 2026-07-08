package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment$bindTwitterError$1", f = "ProfileEditFragment.kt", l = {}, m = "invokeSuspend")
public final class C343180Dcq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileEditFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343180Dcq(ProfileEditFragment profileEditFragment, String str, InterfaceC1364105Vn<? super C343180Dcq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileEditFragment;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343180Dcq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileEditFragment@18c.bindTwitterError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isViewValid()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ProfileEditFragment@18c.bindTwitterError$1");
            return unit;
        }
        this.LL.UR(false);
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            String str = this.LLILLJJLI;
            int size = activity.getSupportFragmentManager().LJJLIIIJL().size();
            if (size > 0) {
                C1389890mGx c1389890mGx = new C1389890mGx((Fragment) ListProtector.get(activity.getSupportFragmentManager().LJJLIIIJL(), size - 1));
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditFragment@18c.bindTwitterError$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
