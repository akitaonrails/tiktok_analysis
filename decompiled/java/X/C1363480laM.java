package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0laM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.SharePanelHeadViewHolder$grayFlow$1", f = "SharePanelHeadViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1363480laM extends C09AX implements InterfaceC1631620sYq<IMContact, Boolean, InterfaceC1364105Vn<? super C1362510lYn>, Object> {
    public /* synthetic */ IMContact LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1363950lb7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363480laM(C1363950lb7 c1363950lb7, InterfaceC1364105Vn<? super C1363480laM> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1363950lb7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SharePanelHeadViewHolder@4d07.grayFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContact iMContact = this.LL;
        boolean z2 = this.LLILLJJLI;
        boolean zLJIIIIZZ = this.LLILLL.LL.LJIIIIZZ();
        boolean z3 = false;
        if (!this.LLILLL.L5(iMContact) && !z2 && !zLJIIIIZZ) {
            z = false;
        } else {
            z = true;
            if (zLJIIIIZZ && !z2) {
                z3 = true;
            }
        }
        C1362510lYn c1362510lYn = new C1362510lYn(z, z3, 4);
        C1C7U.LIZIZ("SharePanelHeadViewHolder@4d07.grayFlow$1");
        return c1362510lYn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(IMContact iMContact, Boolean bool, InterfaceC1364105Vn<? super C1362510lYn> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1363480laM c1363480laM = new C1363480laM(this.LLILLL, interfaceC1364105Vn);
        c1363480laM.LL = iMContact;
        c1363480laM.LLILLJJLI = zBooleanValue;
        return c1363480laM.invokeSuspend(Unit.LIZ);
    }
}
