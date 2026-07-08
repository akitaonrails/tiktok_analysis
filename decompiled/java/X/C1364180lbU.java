package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelBulletinBoardViewHolder$grayFlow$1", f = "SharePanelBulletinBoardViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1364180lbU extends C09AX implements InterfaceC1631620sYq<IMContact, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ C1364170lbT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364180lbU(C1364170lbT c1364170lbT, InterfaceC1364105Vn<? super C1364180lbU> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c1364170lbT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SharePanelBulletinBoardViewHolder@6bb.grayFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        if (!this.LLILLJJLI.LL.LLJJJ && !z2) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SharePanelBulletinBoardViewHolder@6bb.grayFlow$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(IMContact iMContact, Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1364180lbU c1364180lbU = new C1364180lbU(this.LLILLJJLI, interfaceC1364105Vn);
        c1364180lbU.LL = zBooleanValue;
        return c1364180lbU.invokeSuspend(Unit.LIZ);
    }
}
