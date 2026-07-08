package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatDraftComponent$triggerLoadDraft$2", f = "AiChatDraftComponent.kt", l = {49, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C21166817sQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C21167117sT>, Object> {
    public C0I3B LL;
    public int LLILLJJLI;
    public final /* synthetic */ C21167417sW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21166817sQ(C21167417sW c21167417sW, InterfaceC1364105Vn<? super C21166817sQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c21167417sW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21166817sQ(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0I3B c0i3b;
        C1C7U.LIZ("AiChatDraftComponent@3694.triggerLoadDraft$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        C21167117sT c21167117sT = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c0i3b = this.LL;
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.w2().getClass();
                    try {
                        c21167117sT = new C21167117sT((C21171417tA) C051M.LIZIZ(C21171417tA.class, c0i3b.draftContent), c0i3b.createTime);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1C7U.LIZIZ("AiChatDraftComponent@3694.triggerLoadDraft$2");
                    return c21167117sT;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C21166917sR c21166917sRG2 = this.LLILLL.G2();
            this.LLILLJJLI = 1;
            obj = c21166917sRG2.LIZ.LJII();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatDraftComponent@3694.triggerLoadDraft$2");
                return objLJFF;
            }
        }
        C0I3B c0i3b2 = (C0I3B) obj;
        C21166717sP c21166717sPO2 = this.LLILLL.o2();
        this.LL = c0i3b2;
        this.LLILLJJLI = 2;
        Object objLJIILIIL = c21166717sPO2.LIZ.LJIILIIL(new C0I3B(null, null, null, null), this);
        if (objLJIILIIL != C099R.LJFF()) {
            objLJIILIIL = Unit.LIZ;
        }
        if (objLJIILIIL == objLJFF) {
            C1C7U.LIZIZ("AiChatDraftComponent@3694.triggerLoadDraft$2");
            return objLJFF;
        }
        c0i3b = c0i3b2;
        this.LLILLL.w2().getClass();
        c21167117sT = new C21167117sT((C21171417tA) C051M.LIZIZ(C21171417tA.class, c0i3b.draftContent), c0i3b.createTime);
        C1C7U.LIZIZ("AiChatDraftComponent@3694.triggerLoadDraft$2");
        return c21167117sT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C21167117sT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
