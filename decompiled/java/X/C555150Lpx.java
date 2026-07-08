package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Lpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.input.box.component.InputBoxUIComponent$refreshMyself$2", f = "InputBoxUIComponent.kt", l = {200}, m = "invokeSuspend")
public final class C555150Lpx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C557370LtX LL;
    public int LLILLJJLI;
    public final /* synthetic */ C557370LtX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555150Lpx(C557370LtX c557370LtX, InterfaceC1364105Vn<? super C555150Lpx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c557370LtX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555150Lpx(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C557370LtX c557370LtX;
        MentionDataItem mentionDataItem;
        C1C7U.LIZ("InputBoxUIComponent@202d.refreshMyself$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c557370LtX = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Long lLJIILIIL = C2095008Iq.LJIILIIL(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            if (lLJIILIIL != null) {
                c557370LtX = this.LLILLL;
                long jLongValue = lLJIILIIL.longValue();
                InterfaceC555170Lpz inputBoxEventHandler$tools_ai_uikit_df_release = c557370LtX.LLJILLL.getInputBoxEventHandler$tools_ai_uikit_df_release();
                if (inputBoxEventHandler$tools_ai_uikit_df_release != null) {
                    List listSingletonList = Collections.singletonList(C2286608xc.LJFF(jLongValue));
                    this.LL = c557370LtX;
                    this.LLILLJJLI = 1;
                    obj = inputBoxEventHandler$tools_ai_uikit_df_release.LIZ(listSingletonList, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("InputBoxUIComponent@202d.refreshMyself$2");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InputBoxUIComponent@202d.refreshMyself$2");
            return unit;
        }
        List list = (List) obj;
        if (list != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("input box refreshMyself: ");
            sbLIZ.append(mentionDataItem);
            c547140Ld2.LIZ("MentionDataItem", C2188811AlT.LIZIZ(sbLIZ));
            c557370LtX.i3(new AwS587S0100000_8(mentionDataItem, 539));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InputBoxUIComponent@202d.refreshMyself$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
