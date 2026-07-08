package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18VY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent$recoverDraft$2", f = "AiChatInputFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C18VY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C18VZ LL;
    public final /* synthetic */ C21171417tA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18VY(C18VZ c18vz, C21171417tA c21171417tA, InterfaceC1364105Vn<? super C18VY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c18vz;
        this.LLILLJJLI = c21171417tA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18VY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatInputFeatureComponent@26d0.recoverDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.T2().LIZ != EnumC21294918Vf.DEFAULT) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.recoverDraft$2");
            return unit;
        }
        C21171417tA c21171417tA = this.LLILLJJLI;
        if (c21171417tA.selectedPromptId != null) {
            C18VZ c18vz = this.LL;
            c18vz.LLJLILLLLZIIL = c21171417tA.textContent;
            InterfaceC21295718Vn interfaceC21295718VnT5 = c18vz.t5();
            if (interfaceC21295718VnT5 != null) {
                interfaceC21295718VnT5.uH(this.LLILLJJLI.selectedPromptId);
            }
        }
        C18VZ c18vz2 = this.LL;
        C21171417tA c21171417tA2 = this.LLILLJJLI;
        String str = c21171417tA2.textContent;
        List<String> list = c21171417tA2.mediaUrlList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str2 : list) {
            String strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
            arrayList.add(new C21295818Vo(strLIZ, str2, 0, 0, 0L, false, (EnumC1778830wOH) null, 252));
        }
        c18vz2.F4(str, arrayList, EnumC21295518Vl.REPLACE);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.recoverDraft$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
