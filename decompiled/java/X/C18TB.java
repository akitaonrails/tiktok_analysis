package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18TB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem$onBind$2$1$2", f = "RegenerateAssem.kt", l = {}, m = "invokeSuspend")
public final class C18TB extends C09AX implements Function2<C189200o6<? extends Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RegenerateAssem LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18TB(C869590Y9l c869590Y9l, RegenerateAssem regenerateAssem, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = regenerateAssem;
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18TB(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C18TL c18tlLIZIZ;
        String str;
        C1C7U.LIZ("RegenerateAssem@34fe.onBind$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = (C18UJ) this.LL.LLLI.getValue();
        AIChatGenNode aIChatGenNodeLIZLLL = C18UO.LIZLLL(this.LLILLJJLI);
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        Keva keva = C21289818Tg.LIZ;
        C21291018Ts c21291018TsLIZ = C21290118Tj.LIZ(c869590Y9l);
        if ((c21291018TsLIZ == null || (str = c21291018TsLIZ.LIZIZ) == null) && ((c18tlLIZIZ = C21290118Tj.LIZIZ(c869590Y9l)) == null || (str = c18tlLIZIZ.LIZ) == null)) {
            str = "";
        }
        c18up.getClass();
        C0LAB c0lab = new C0LAB();
        C18UP.LIZ(c0lab, c18uj);
        C18UP.LIZIZ(c0lab, aIChatGenNodeLIZLLL);
        c0lab.LJ("last_fail_reason", str);
        C20684815ws.LJIILLIIL("vp_generate_retry", c0lab.LIZ);
        C197039127h c197039127hUp = this.LL.up();
        if (c197039127hUp != null) {
            c197039127hUp.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegenerateAssem@34fe.onBind$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C189200o6<? extends Unit> c189200o6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(C189200o6.m1boximpl(c189200o6.m10unboximpl()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
