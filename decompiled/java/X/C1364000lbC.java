package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelTakoViewHolder$iconStateFlow$1", f = "SharePanelTakoViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1364000lbC extends C09AX implements InterfaceC1631620sYq<IMContact, Boolean, InterfaceC1364105Vn<? super EnumC1364060lbI>, Object> {
    public /* synthetic */ boolean LL;

    public C1364000lbC(InterfaceC1364105Vn<? super C1364000lbC> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1364060lbI enumC1364060lbI;
        C1C7U.LIZ("SharePanelTakoViewHolder@a66a.iconStateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            enumC1364060lbI = EnumC1364060lbI.LLILLJJLI;
        } else {
            enumC1364060lbI = EnumC1364060lbI.LL;
        }
        C1C7U.LIZIZ("SharePanelTakoViewHolder@a66a.iconStateFlow$1");
        return enumC1364060lbI;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(IMContact iMContact, Boolean bool, InterfaceC1364105Vn<? super EnumC1364060lbI> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1364000lbC c1364000lbC = new C1364000lbC(interfaceC1364105Vn);
        c1364000lbC.LL = zBooleanValue;
        return c1364000lbC.invokeSuspend(Unit.LIZ);
    }
}
