package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.im.messagelist.protocols.SingleChatTypingBubbleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.SingleChatTypingBubbleAssem$onAssemPostCreate$1", f = "SingleChatTypingBubbleAssem.kt", l = {47, 47}, m = "invokeSuspend")
public final class C1517905wv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1515605wY LLILLL;
    public final /* synthetic */ SingleChatTypingBubbleAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517905wv(InterfaceC1515605wY interfaceC1515605wY, SingleChatTypingBubbleAssem singleChatTypingBubbleAssem, InterfaceC1364105Vn<? super C1517905wv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1515605wY;
        this.LLILZ = singleChatTypingBubbleAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1517905wv c1517905wv = new C1517905wv(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1517905wv.LLILLJJLI = obj;
        return c1517905wv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatTypingBubbleAssem@471f.onAssemPostCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1768806wI c1768806wI = new C1768806wI(this.LLILLL.LIZIZ(), 2);
            this.LL = 1;
            obj = C09IC.LJJIJIIJIL(c1768806wI, interfaceC497601wk, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SingleChatTypingBubbleAssem@471f.onAssemPostCreate$1");
                return objLJFF;
            }
        }
        AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILZ, 21);
        this.LL = 2;
        if (((C01S9) obj).collect(agS283S0100000_2, this) == objLJFF) {
            C1C7U.LIZIZ("SingleChatTypingBubbleAssem@471f.onAssemPostCreate$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
