package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.landing.AdFirstInteractReqBodyV2;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAPI;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM$handleFirstInteractedInner$doOnLandingMsgAdded$1$2$1", f = "BusinessChatLandingMsgVM.kt", l = {472}, m = "invokeSuspend")
public final class C1737106rB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ BusinessChatLandingMsgVM LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<BusinessAutoMessage> LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1737106rB(long j, BusinessChatLandingMsgVM businessChatLandingMsgVM, String str, List<BusinessAutoMessage> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1737106rB> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = j;
        this.LLILLL = businessChatLandingMsgVM;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1737106rB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1364105Vn<Unit> interfaceC1364105Vn;
        String conversationId;
        C1C7U.LIZ("BusinessChatLandingMsgVM@c76d.handleFirstInteractedInner$doOnLandingMsgAdded$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    long j = this.LLILLJJLI;
                    int i2 = this.LLILLL.getState().LL;
                    String str = this.LLILZ;
                    List list = this.LLILZIL;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    AdFirstInteractReqBodyV2 adFirstInteractReqBodyV2 = new AdFirstInteractReqBodyV2(j, i2, str, list);
                    BusinessLandingMsgAPI businessLandingMsgAPI = BusinessLandingMsgAPI.LIZIZ;
                    this.LL = 1;
                    if (businessLandingMsgAPI.syncFirstInteractV2(adFirstInteractReqBodyV2, this) == objLJFF) {
                        C1C7U.LIZIZ("BusinessChatLandingMsgVM@c76d.handleFirstInteractedInner$doOnLandingMsgAdded$1$2$1");
                        return objLJFF;
                    }
                }
                C909290Zln c909290ZlnVQ2 = this.LLILLL.vQ2();
                String str2 = null;
                if (c909290ZlnVQ2 != null) {
                    conversationId = c909290ZlnVQ2.getConversationId();
                } else {
                    conversationId = null;
                }
                if (C866950Xzh.LIZ(conversationId)) {
                    str2 = conversationId;
                }
                if (str2 != null) {
                    C1737206rC.LIZ.storeBoolean(str2, true);
                }
                interfaceC1364105Vn = this.LLILZLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("first interact api error, e: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC1364105Vn = this.LLILZLL;
                if (interfaceC1364105Vn != null) {
                }
            }
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BusinessChatLandingMsgVM@c76d.handleFirstInteractedInner$doOnLandingMsgAdded$1$2$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = this.LLILZLL;
            if (interfaceC1364105Vn2 != null) {
                Unit unit3 = Unit.LIZ;
                C189200o6.m2constructorimpl(unit3);
                interfaceC1364105Vn2.resumeWith(unit3);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
