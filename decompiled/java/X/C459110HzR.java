package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.common.ChatroomBlockHelperKt$setupBlockNonInputComponent$1", f = "ChatroomBlockHelper.kt", l = {}, m = "invokeSuspend")
public final class C459110HzR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public /* synthetic */ Object LL;
    public final /* synthetic */ UIAssem LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ C05YD<EnumC430090Gtj> LLILZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C1656506eB.class, "inputPanelSizeViewModel", "<v#1>", 1);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C459110HzR(UIAssem uIAssem, ViewGroup viewGroup, C05YD<? extends EnumC430090Gtj> c05yd, InterfaceC1364105Vn<? super C459110HzR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uIAssem;
        this.LLILLL = viewGroup;
        this.LLILZ = c05yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C459110HzR c459110HzR = new C459110HzR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c459110HzR.LL = obj;
        return c459110HzR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomBlockHelperKt@4418.setupBlockNonInputComponent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C013C c013c = new C013C();
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS407S0200000_6(c013c, this.LLILLL, 88));
        UIAssem uIAssem = this.LLILLJJLI;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIAssem, C724750Sbp.LJIIJ(uIAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 1346), AFwS236S0000000_6.get$arr$(487), null, true);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C459090HzP(this.LLILZ, c013c, this.LLILLL, c01gwLIZ, assemVMLazyLIZ, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C459120HzS(this.LLILLJJLI, assemVMLazyLIZ, c013c, c01gwLIZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomBlockHelperKt@4418.setupBlockNonInputComponent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
