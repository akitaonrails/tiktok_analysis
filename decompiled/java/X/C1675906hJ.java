package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.freqcontrol.room.PromptUFCWaitingWindow$checkAndStartBufferCountDown$2$1", f = "PromptUFCWaitingWindow.kt", l = {179}, m = "invokeSuspend")
public final class C1675906hJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1675806hI LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675906hJ(C1675806hI c1675806hI, boolean z, InterfaceC1364105Vn<? super C1675906hJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1675806hI;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1675906hJ c1675906hJ = new C1675906hJ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1675906hJ.LLILLJJLI = obj;
        return c1675906hJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("PromptUFCWaitingWindow@117c.checkAndStartBufferCountDown$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL.LIZJ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.checkAndStartBufferCountDown$2$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.checkAndStartBufferCountDown$2$1");
            return unit;
        }
        try {
            C1677306hX c1677306hXLIZLLL = this.LLILLL.LIZLLL();
            List listLLIIII = C13LP.LLIIII(this.LLILLL.LIZ.LIZJ);
            List listLLIIII2 = C13LP.LLIIII(this.LLILLL.LJI);
            List listLLIIII3 = C13LP.LLIIII(this.LLILLL.LJIILJJIL);
            List listLLIIII4 = C13LP.LLIIII(this.LLILLL.LJIILL);
            List listLLIIII5 = C13LP.LLIIII(this.LLILLL.LJIILLIIL);
            InterfaceC1677406hY interfaceC1677406hY = null;
            if (this.LLILZ) {
                this.LLILLL.LJIIZILJ = (EnumC15599068v[]) listLLIIII.toArray(new EnumC15599068v[0]);
                C1675806hI c1675806hI = this.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Timeout!!!\nSelected Prompt: ");
                if (c1677306hXLIZLLL != null) {
                    interfaceC1677406hY = c1677306hXLIZLLL.LIZ;
                }
                sbLIZ.append(interfaceC1677406hY);
                sbLIZ.append("\n\nHolding Checks: ");
                sbLIZ.append(listLLIIII);
                sbLIZ.append("\n\nHold Logs: ");
                sbLIZ.append(listLLIIII2);
                c1675806hI.LJ(C2188811AlT.LIZIZ(sbLIZ), true);
            } else {
                C1675806hI c1675806hI2 = this.LLILLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Released\nSelected Prompt: ");
                if (c1677306hXLIZLLL != null) {
                    interfaceC1677406hY = c1677306hXLIZLLL.LIZ;
                }
                sbLIZ2.append(interfaceC1677406hY);
                sbLIZ2.append("\n\nHold Logs: ");
                sbLIZ2.append(listLLIIII2);
                c1675806hI2.LJ(C2188811AlT.LIZIZ(sbLIZ2), false);
            }
            IPromptUnifiedFrequencyController.LIZ.getClass();
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
            C06RH c06rh = C06RH.SHARED;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("End Window (Duration: ");
            sbLIZ3.append(System.currentTimeMillis() - this.LLILLL.LJ);
            sbLIZ3.append(" ms)\n\nIs timeout: ");
            sbLIZ3.append(this.LLILZ);
            sbLIZ3.append("\nPrompts Requested: ");
            sbLIZ3.append(listLLIIII3);
            sbLIZ3.append("\nPrompts Allowed: ");
            sbLIZ3.append(listLLIIII4);
            sbLIZ3.append("\nPrompts Denied: ");
            sbLIZ3.append(listLLIIII5);
            iPromptUnifiedFrequencyControllerLIZ.LJ(c06rh, C2188811AlT.LIZIZ(sbLIZ3), this.LLILLL.LIZIZ.LIZIZ, false);
            this.LLILLL.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PromptUFCWaitingWindow@117c.checkAndStartBufferCountDown$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
