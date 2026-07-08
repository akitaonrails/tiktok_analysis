package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.15lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.sendmsg.EditShareSendMsgDelegate$sendVideoOrPhotoMsg$1", f = "EditShareSendMsgDelegate.kt", l = {}, m = "invokeSuspend")
public final class C20616315lp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20618015m6 LL;
    public final /* synthetic */ C20616415lq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20616315lp(C20618015m6 c20618015m6, C20616415lq c20616415lq, InterfaceC1364105Vn<? super C20616315lp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20618015m6;
        this.LLILLJJLI = c20616415lq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20616315lp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMMediaPublishEvent<?> iMMediaPublishEvent;
        String str;
        C20616415lq c20616415lq;
        Function2<IMContact, Fragment, Unit> function2;
        C1C7U.LIZ("EditShareSendMsgDelegate@3814.sendVideoOrPhotoMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZ = this.LL.LIZ();
        this.LLILLJJLI.LJI = EnumC20616515lr.SENT;
        C1231704rr c1231704rr = this.LLILLJJLI.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end send video or photo msg to ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", conversation id ");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        this.LLILLJJLI.LIZJ.invoke();
        C912070ZqH.LIZIZ.LJIILIIL().LIZ();
        C1431840nMc c1431840nMc = (C1431840nMc) EventBus.LIZLLL().LJFF(C1431840nMc.class);
        if (c1431840nMc != null && (iMMediaPublishEvent = c1431840nMc.LIZ) != null) {
            IMMediaPublishEvent iMMediaPublishEventCopyWithSessionId = iMMediaPublishEvent.copyWithSessionId(strLIZ);
            C20618015m6 c20618015m6 = this.LL;
            C13DA c13da = new C13DA();
            if (c20618015m6.LLILZLL.length() == 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c13da.put("is_search", str);
            iMMediaPublishEventCopyWithSessionId.copyWithMobMapAdded(c13da.build()).post();
            IMContact iMContact = this.LL.LLJ;
            if (iMContact != null && (function2 = (c20616415lq = this.LLILLJJLI).LIZLLL) != null) {
                function2.invoke(iMContact, c20616415lq.LJ);
            }
        } else {
            this.LLILLJJLI.LJFF.LIZIZ();
            this.LLILLJJLI.LJI = EnumC20616515lr.NOT_SEND;
            this.LLILLJJLI.LIZJ.invoke();
            C20616415lq c20616415lq2 = this.LLILLJJLI;
            InterfaceC497601wk interfaceC497601wk = c20616415lq2.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C612970O2l(c20616415lq2, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditShareSendMsgDelegate@3814.sendVideoOrPhotoMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
