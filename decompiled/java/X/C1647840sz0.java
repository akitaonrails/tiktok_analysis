package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.0sz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.EditAddYoursStickerComponent$openInviteFriendsPanel$1$1", f = "EditAddYoursStickerComponent.kt", l = {}, m = "invokeSuspend")
public final class C1647840sz0 extends C09AX implements InterfaceC1631620sYq<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C19643011tE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647840sz0(C19643011tE c19643011tE, InterfaceC1364105Vn<? super C1647840sz0> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c19643011tE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAddYoursStickerComponent@cc62.openInviteFriendsPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1524805y2.LIZIZ(0L, new AwS430S0200000_29(this.LLILLJJLI, (C19643011tE) this.LL, (List<UserInvitee>) 47));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.openInviteFriendsPanel$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1647840sz0 c1647840sz0 = new C1647840sz0(this.LLILLJJLI, interfaceC1364105Vn);
        c1647840sz0.LL = list;
        return c1647840sz0.invokeSuspend(Unit.LIZ);
    }
}
