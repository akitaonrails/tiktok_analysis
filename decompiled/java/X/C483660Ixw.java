package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ixw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setKeywordAutoReplyUI$1", f = "BaMessageSettingActivity.kt", l = {430}, m = "invokeSuspend")
public final class C483660Ixw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaMessageSettingActivity LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483660Ixw(BaMessageSettingActivity baMessageSettingActivity, boolean z, InterfaceC1364105Vn<? super C483660Ixw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baMessageSettingActivity;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C483660Ixw c483660Ixw = new C483660Ixw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c483660Ixw.LLILLJJLI = obj;
        return c483660Ixw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        List<C475600Ikw> list;
        boolean z;
        String str;
        StringBuilder sbLIZ;
        Object objLJI = obj;
        C1C7U.LIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLJI);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                IBaAutoMessageService iBaAutoMessageService = this.LLILLL.LLILZLL;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLJI = iBaAutoMessageService.LJI(this);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1");
                    return objLJFF;
                }
            }
            list = (List) objLJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (list == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1");
            return unit;
        }
        BaMessageSettingActivity baMessageSettingActivity = this.LLILLL;
        if (!list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        baMessageSettingActivity.LLJJI = z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.LLILLL.getResources().getText(2131822189));
        if (C444960Hcc.LIZIZ()) {
            sb.append("(4/");
            sb.append(list.size());
            sb.append(") ");
        } else {
            sb.append(" (");
            sb.append(list.size());
            sb.append("/4)");
        }
        String string = sb.toString();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C118300cf c118300cf = new C118300cf();
        if (list.isEmpty()) {
            str = null;
        } else {
            for (C475600Ikw c475600Ikw : list) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) c259800zU.element);
                if (c118300cf.element > 0) {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(", ");
                    sbLIZ.append(c475600Ikw.LIZJ);
                } else {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c475600Ikw.LIZJ);
                    sbLIZ.append("");
                }
                sbLIZ2.append(C2188811AlT.LIZIZ(sbLIZ));
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ2);
                c118300cf.element++;
            }
            str = (String) c259800zU.element;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C483740Iy4(this.LLILLL, this.LLILZ, str, string, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
