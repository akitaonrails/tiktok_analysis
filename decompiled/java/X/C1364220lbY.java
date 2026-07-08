package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelBulletinBoardViewHolder$iconStateFlow$1", f = "SharePanelBulletinBoardViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1364220lbY extends C09AX implements InterfaceC1631620sYq<IMContact, Boolean, InterfaceC1364105Vn<? super EnumC1364240lba>, Object> {
    public /* synthetic */ boolean LL;

    public C1364220lbY(InterfaceC1364105Vn<? super C1364220lbY> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1364240lba enumC1364240lba;
        C1C7U.LIZ("SharePanelBulletinBoardViewHolder@6bb.iconStateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            enumC1364240lba = EnumC1364240lba.LLILLJJLI;
        } else {
            enumC1364240lba = EnumC1364240lba.LL;
        }
        C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.iconStateFlow$1");
        return enumC1364240lba;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(IMContact iMContact, Boolean bool, InterfaceC1364105Vn<? super EnumC1364240lba> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1364220lbY c1364220lbY = new C1364220lbY(interfaceC1364105Vn);
        c1364220lbY.LL = zBooleanValue;
        return c1364220lbY.invokeSuspend(Unit.LIZ);
    }
}
