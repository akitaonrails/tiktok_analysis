package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.SendFeedbackHelper$sendFeedback$1", f = "SendFeedbackHelper.kt", l = {49, 54}, m = "invokeSuspend")
public final class C06ZR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C06ZS LL;
    public int LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C06ZS LLILZIL;
    public final /* synthetic */ C06ZU LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function2<Integer, String, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06ZR(C869590Y9l c869590Y9l, int i, C06ZS c06zs, C06ZU c06zu, String str, String str2, Function2<? super Integer, ? super String, Unit> function2, InterfaceC1364105Vn<? super C06ZR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c869590Y9l;
        this.LLILZ = i;
        this.LLILZIL = c06zs;
        this.LLILZLL = c06zu;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06ZS c06zs;
        int size;
        Object objLJII = obj;
        C1C7U.LIZ("SendFeedbackHelper@4377.sendFeedback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJII);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SendFeedbackHelper@4377.sendFeedback$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c06zs = this.LL;
            C155000ia.LIZIZ(objLJII);
        } else {
            C155000ia.LIZIZ(objLJII);
            C907030Zi9.LJFF.getClass();
            InterfaceC1755906uD interfaceC1755906uDLIZIZ = C907050ZiB.LIZ().LIZIZ(this.LLILLL.getConversationId(), this.LLILZ, true, null, true);
            c06zs = this.LLILZIL;
            this.LL = c06zs;
            this.LLILLJJLI = 1;
            objLJII = interfaceC1755906uDLIZIZ.LJII(this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("SendFeedbackHelper@4377.sendFeedback$1");
                return objLJFF;
            }
        }
        C06ZU c06zu = this.LLILZLL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Iterable) objLJII).iterator();
        while (true) {
            int iMax = 0;
            if (it2.hasNext()) {
                Object next = it2.next();
                C869590Y9l c869590Y9l = (C869590Y9l) next;
                c06zu.getClass();
                int msgType = c869590Y9l.getMsgType();
                if (msgType != -1 && msgType != 1 && msgType != 15 && msgType != 1026 && msgType != 1031 && msgType != 1037 && msgType != 1039 && msgType != 4013 && msgType != 4058 && msgType != 4084 && msgType != 1022 && msgType != 1023 && msgType != 4007 && msgType != 4008 && msgType != 4010 && msgType != 4011 && msgType != 4065 && msgType != 4066) {
                    switch (msgType) {
                        case 4000:
                        case 4001:
                        case 4002:
                            break;
                        default:
                            if (c869590Y9l.isSuccessStatus() || C06ZU.LIZ(c869590Y9l)) {
                                arrayList.add(next);
                            }
                            break;
                    }
                }
            } else {
                C869590Y9l c869590Y9l2 = this.LLILLL;
                c06zs.getClass();
                double d = 6 / 2.0f;
                int iFloor = (int) Math.floor(d);
                int iIndexOf = arrayList.indexOf(c869590Y9l2);
                int iCeil = iIndexOf - ((int) Math.ceil(d));
                if (iCeil < 0) {
                    size = Math.min(7, arrayList.size());
                } else {
                    size = iIndexOf + iFloor + 1;
                    if (size > arrayList.size()) {
                        size = arrayList.size();
                        iMax = Math.max(size - 7, 0);
                    } else {
                        iMax = iCeil;
                    }
                }
                List<? extends C869590Y9l> listSubList = arrayList.subList(iMax, size);
                C06ZU c06zu2 = this.LLILZLL;
                C869590Y9l c869590Y9l3 = this.LLILLL;
                String str = this.LLIZ;
                C1675506hF c1675506hF = C1675506hF.LIZ;
                Map<String, String> localExt = c869590Y9l3.getLocalExt();
                c1675506hF.getClass();
                CheckMessage checkMessageLIZ = C1675506hF.LIZ(localExt);
                String str2 = this.LLIZLLLIL;
                Function2<Integer, String, Unit> function2 = this.LLJ;
                this.LL = null;
                this.LLILLJJLI = 2;
                if (c06zu2.LIZIZ(c869590Y9l3, str, listSubList, checkMessageLIZ, str2, function2, this) == objLJFF) {
                    C1C7U.LIZIZ("SendFeedbackHelper@4377.sendFeedback$1");
                    return objLJFF;
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SendFeedbackHelper@4377.sendFeedback$1");
                return unit2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
