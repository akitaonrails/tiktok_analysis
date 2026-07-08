package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS273S0300000_29;

/* JADX INFO: renamed from: X.0sz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.ImageEditAddYoursStickerComponent$openInviteFriendsPanel$1$1", f = "ImageEditAddYoursStickerComponent.kt", l = {}, m = "invokeSuspend")
public final class C1647850sz1 extends C09AX implements InterfaceC1631620sYq<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StickerModel LLILLJJLI;
    public final /* synthetic */ C19643111tF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647850sz1(StickerModel stickerModel, C19643111tF c19643111tF, InterfaceC1364105Vn<? super C1647850sz1> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = stickerModel;
        this.LLILLL = c19643111tF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditAddYoursStickerComponent@121c.openInviteFriendsPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1524805y2.LIZIZ(0L, new AwS273S0300000_29(this.LLILLJJLI, (StickerModel) this.LL, (List<UserInvitee>) this.LLILLL, (C19643111tF) 11));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditAddYoursStickerComponent@121c.openInviteFriendsPanel$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1647850sz1 c1647850sz1 = new C1647850sz1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1647850sz1.LL = list;
        return c1647850sz1.invokeSuspend(Unit.LIZ);
    }
}
