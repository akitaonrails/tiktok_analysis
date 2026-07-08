package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.0syz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$openInviteFriendsPanel$1$1", f = "RecordAddYoursStickerComponent.kt", l = {}, m = "invokeSuspend")
public final class C1647830syz extends C09AX implements InterfaceC1631620sYq<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1647720syo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647830syz(C1647720syo c1647720syo, InterfaceC1364105Vn<? super C1647830syz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c1647720syo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordAddYoursStickerComponent@8021.openInviteFriendsPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CNO.LIZLLL(0L, new AwS430S0200000_29(this.LLILLJJLI, (C1647720syo) this.LL, (List<UserInvitee>) 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.openInviteFriendsPanel$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1647830syz c1647830syz = new C1647830syz(this.LLILLJJLI, interfaceC1364105Vn);
        c1647830syz.LL = list;
        return c1647830syz.invokeSuspend(Unit.LIZ);
    }
}
