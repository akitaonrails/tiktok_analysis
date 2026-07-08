package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YXU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimMarkConversationReadMethodIDL$handle$1$1", f = "EcimMarkConversationReadMethodIDL.kt", l = {31}, m = "invokeSuspend")
public final class C0YXU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC748170TWl LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC748170TWl LLILLL;
    public final /* synthetic */ C0YXO LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC748140TWi> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ PigeonConversationDetailContainer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YXU(InterfaceC748170TWl interfaceC748170TWl, C0YXO c0yxo, CompletionBlock<InterfaceC748140TWi> completionBlock, String str, PigeonConversationDetailContainer pigeonConversationDetailContainer, InterfaceC1364105Vn<? super C0YXU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC748170TWl;
        this.LLILZ = c0yxo;
        this.LLILZIL = completionBlock;
        this.LLILZLL = str;
        this.LLIZ = pigeonConversationDetailContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YXU(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        InterfaceC748170TWl interfaceC748170TWl;
        C1C7U.LIZ("EcimMarkConversationReadMethodIDL@4e8a.handle$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i == 1) {
                interfaceC748170TWl = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String uuid = this.LLILLL.getUuid();
            if (uuid != null && uuid.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.LLILZ.LLILZIL.m144getConversationListManager().LIZJ(this.LLILLL.getConversationId());
                CompletionBlock<InterfaceC748140TWi> completionBlock = this.LLILZIL;
                XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(this.LLILZLL, C13LE.LIZ(InterfaceC748140TWi.class));
                ((InterfaceC748140TWi) xBaseModelLIZJ).setCode(C2286608xc.LJ(1));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EcimMarkConversationReadMethodIDL@4e8a.handle$1$1");
                return unit;
            }
            PigeonConversationDetailContainer pigeonConversationDetailContainer = this.LLIZ;
            interfaceC748170TWl = this.LLILLL;
            C414301jJ c414301jJLJJIII = ((PigeonMessageListComponentApi) pigeonConversationDetailContainer.LJJJJL(C13LE.LIZ(PigeonMessageListComponentApi.class))).LJJIII();
            this.LL = interfaceC748170TWl;
            this.LLILLJJLI = 1;
            obj = C09IC.LJIIZILJ(c414301jJLJJIII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcimMarkConversationReadMethodIDL@4e8a.handle$1$1");
                return objLJFF;
            }
        }
        for (Object obj2 : (Iterable) obj) {
            if (Intrinsics.LJFF(((C869590Y9l) obj2).getUuid(), interfaceC748170TWl.getUuid())) {
                c098200Yq = C2286608xc.LJFF(((C869590Y9l) obj2).getIndex());
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Long l = (Long) c098200Yq;
                if (l == null) {
                    C2382909Vj.LIZ(this.LLILZIL, 1006, "msg is null", null, 4);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EcimMarkConversationReadMethodIDL@4e8a.handle$1$1");
                    return unit2;
                }
                this.LLILZ.LLILZIL.getPigeonIMClient().LIZIZ.LJ().LJJJLIIL(l.longValue(), this.LLILLL.getConversationId());
                CompletionBlock<InterfaceC748140TWi> completionBlock2 = this.LLILZIL;
                XBaseModel xBaseModelLIZJ2 = C1549500qQO.LIZJ(this.LLILZLL, C13LE.LIZ(InterfaceC748140TWi.class));
                ((InterfaceC748140TWi) xBaseModelLIZJ2).setCode(C2286608xc.LJ(1));
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("EcimMarkConversationReadMethodIDL@4e8a.handle$1$1");
                return unit3;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
