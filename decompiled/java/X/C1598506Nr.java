package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS17S1201000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.actionsv2.GoLiveAction$onClick$1$1", f = "GoLiveAction.kt", l = {}, m = "invokeSuspend")
public final class C1598506Nr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1606906Qx LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598506Nr(boolean z, int i, C1606906Qx c1606906Qx, C19EG c19eg, int i2, InterfaceC1364105Vn<? super C1598506Nr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = c1606906Qx;
        this.LLILZ = c19eg;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1598506Nr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwS546S0100000_2 awS546S0100000_2;
        int iIntValue;
        int i;
        int i2;
        Integer num;
        C1C7U.LIZ("GoLiveAction@299c.onClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            if (this.LLILLJJLI == 2) {
                awS546S0100000_2 = new AwS546S0100000_2(this.LLILLL, 1208);
            } else {
                awS546S0100000_2 = new AwS546S0100000_2(this.LLILLL, 1209);
            }
            C1606906Qx c1606906Qx = this.LLILLL;
            C19EG c19eg = this.LLILZ;
            int i3 = this.LLILZIL;
            String str = c1606906Qx.LIZIZ;
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (num = (Integer) iLiveOuterService.LIZJ(0, "link_mic_group_go_live_flow_opt")) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            if (iIntValue == 2) {
                i = 2131854511;
            } else {
                i = 2131835195;
            }
            c1397580mTM.LJI(c19eg.getString(i));
            if (iIntValue == 2) {
                i2 = 2131854510;
            } else {
                i2 = 2131835192;
            }
            c1397580mTM.LIZIZ(c19eg.getString(i2));
            C985403tE.LIZ(c1397580mTM, new AwS17S1201000_2(c1606906Qx, (C1606906Qx) str, (String) i3, (int) awS546S0100000_2, (Function0<Unit>) 4));
            c1397580mTM.LJII = false;
            c1397580mTM.LIZLLL(AFwS229S0000000_2.get$arr$(918));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C1598206No c1598206No = C1598206No.LIZ;
            Keva kevaLIZJ = C1598206No.LIZJ();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            int iLIZLLL = C1598206No.LIZLLL(c1598206No);
            if (iLIZLLL < 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("open_live_dialog_show_times");
                sbLIZ.append(curUserId);
                kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLIZLLL + 1);
            }
            C1606906Qx.LIZJ(this.LLILZIL, "show", null, this.LLILLL.LIZIZ);
        } else if (this.LLILLJJLI > 0) {
            this.LLILLL.LIZLLL();
        } else {
            C1606906Qx c1606906Qx2 = this.LLILLL;
            c1606906Qx2.LIZ(c1606906Qx2.LIZIZ, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoLiveAction@299c.onClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
