package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel$mobShoot$1", f = "FriendsTextPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1395360mPm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1395350mPl LL;
    public final /* synthetic */ FriendsTextPublishViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395360mPm(C1395350mPl c1395350mPl, FriendsTextPublishViewModel friendsTextPublishViewModel, InterfaceC1364105Vn<? super C1395360mPm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1395350mPl;
        this.LLILLJJLI = friendsTextPublishViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1395360mPm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTextPublishViewModel@58e.mobShoot$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService != null) {
            C1395350mPl c1395350mPl = this.LL;
            C1449410nox c1449410nox = new C1449410nox(((CreativeInfo) this.LLILLJJLI.LLILLJJLI.getValue()).getCreationId(), c1395350mPl.LIZJ, c1395350mPl.LIZ, null, null, null, null, null, 248);
            C0LAB c0lab = new C0LAB();
            FriendsTextPublishViewModel friendsTextPublishViewModel = this.LLILLJJLI;
            C1395350mPl c1395350mPl2 = this.LL;
            c0lab.LIZ(friendsTextPublishViewModel.getState().LLILZ ? 1 : 0, "is_has_last_content");
            c0lab.LJ("enter_method", c1395350mPl2.LIZIZ);
            c0lab.LJ("content_type", "text_post");
            iRecordMobService.LIZIZ(c1449410nox, c0lab, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTextPublishViewModel@58e.mobShoot$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
