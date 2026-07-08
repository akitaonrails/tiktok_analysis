package X;

import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment$setUpCellsInSocialAvatar$2$1$1$1$1$2$1", f = "SocialAvatarBottomSheetActionFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarBottomSheetActionFragment LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDD(SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment, Exception exc, InterfaceC1364105Vn<? super C0HDD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarBottomSheetActionFragment;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Function1<Exception, Unit> function1;
        C1C7U.LIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HFL c0hfl = this.LL.LLILLL;
        if (c0hfl != null && (function1 = c0hfl.LJFF) != null) {
            function1.invoke(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SocialAvatarBottomSheetActionFragment@c983.setUpCellsInSocialAvatar$2$1$1$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
