package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C898103f9 extends C09AY implements InterfaceC1631630sYr<Boolean, List<? extends PaymentElement>, String, Boolean, Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ InterfaceC877803bs LLILLJJLI;
    public final /* synthetic */ EnterParams LLILLL;
    public final /* synthetic */ PaymentBindHelper LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ CommuteType LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ PaymentMethod LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898103f9(InterfaceC497601wk interfaceC497601wk, InterfaceC877803bs interfaceC877803bs, EnterParams enterParams, PaymentBindHelper paymentBindHelper, Context context, String str, String str2, String str3, CommuteType commuteType, String str4, String str5, String str6, PaymentMethod paymentMethod) {
        super(4);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = interfaceC877803bs;
        this.LLILLL = enterParams;
        this.LLILZ = paymentBindHelper;
        this.LLILZIL = context;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = commuteType;
        this.LLJI = str4;
        this.LLJIJIL = str5;
        this.LLJILJIL = str6;
        this.LLJILJILJ = paymentMethod;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, List<? extends PaymentElement> list, String str, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        List<? extends PaymentElement> list2 = list;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleVenmoBind result: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", elements: ");
        sbLIZ.append(list2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C921903iz c921903iz = C921903iz.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("result: ");
        sbLIZ2.append(zBooleanValue);
        sbLIZ2.append(", elements: ");
        sbLIZ2.append(list2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c921903iz.getClass();
        C921903iz.LIZIZ(4, strLIZIZ2, "handleVenmoBind");
        if (zBooleanValue) {
            InterfaceC497601wk interfaceC497601wkLIZ = this.LL;
            if (interfaceC497601wkLIZ == null) {
                interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
            }
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C897603f4(this.LLILZ, this.LLILZLL, this.LLJILJILJ, list2, this.LLILLL, this.LLJI, this.LLILLJJLI, this.LLILZIL, this.LLJILJIL, this.LLJ, this.LLJIJIL, null), 3);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleVenmoBind sdk failed, userCancel: ");
            sbLIZ3.append(bool2);
            C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            InterfaceC877803bs interfaceC877803bs = this.LLILLJJLI;
            if (interfaceC877803bs != null) {
                interfaceC877803bs.onDismiss();
            }
            if (!Intrinsics.LJFF(bool2, Boolean.TRUE) && !C897503f3.LJI(this.LLILLL)) {
                PaymentBindHelper.LJI(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, null, null, true, null, null, null, 30208);
            } else {
                InterfaceC877803bs interfaceC877803bs2 = this.LLILLJJLI;
                if (interfaceC877803bs2 != null) {
                    interfaceC877803bs2.onFailed(this.LLILZIL.getString(2131832534));
                }
            }
        }
        return Unit.LIZ;
    }
}
