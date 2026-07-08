package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditVM;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S2100000_2;
import njp.a;

/* JADX INFO: renamed from: X.058S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditVM$onSubmit$1$3$1", f = "InstructionEditVM.kt", l = {}, m = "invokeSuspend")
public final class C058S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1256804vu LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ InstructionEditVM LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058S(InterfaceC1256804vu interfaceC1256804vu, Function0<Unit> function0, View view, InstructionEditVM instructionEditVM, String str, InterfaceC1364105Vn<? super C058S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1256804vu;
        this.LLILLJJLI = function0;
        this.LLILLL = view;
        this.LLILZ = instructionEditVM;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C058S(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        C1C7U.LIZ("InstructionEditVM@96aa.onSubmit$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1256804vu interfaceC1256804vu = this.LL;
        String string = null;
        if (interfaceC1256804vu instanceof C1281504zt) {
            InterfaceC1411705fn value = InstructionEditVM.LLILLJJLI.getValue();
            if (value != null) {
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi != null) {
                    jCurrentTimeMillis = iMHostApi.LIZIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi2 != null) {
                    jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                } else {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                value.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, "");
            }
            if (((C1281504zt) this.LL).LIZIZ) {
                this.LLILLJJLI.invoke();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateBotInstructions failed statusCode=");
                sbLIZ.append(((C1281504zt) this.LL).LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                Context context = this.LLILLL.getContext();
                if (context != null) {
                    string = context.getString(2131848367);
                }
                this.LLILZ.setState(new AwS31S2100000_2(this.LL, string, this.LLILZIL, 0));
            }
        } else if (interfaceC1256804vu instanceof C1256704vt) {
            Context context2 = this.LLILLL.getContext();
            if (context2 != null) {
                string = context2.getString(2131835079);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstructionEditVM@96aa.onSubmit$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
