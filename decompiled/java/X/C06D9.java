package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06D9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.jsb.GetStreaksInfoMethodIDL$handle$1", f = "GetStreaksInfoMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C06D9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06D8 LL;
    public final /* synthetic */ C06D7 LLILLJJLI;
    public final /* synthetic */ CompletionBlock<C06DB> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06D9(C06D8 c06d8, C06D7 c06d7, CompletionBlock<C06DB> completionBlock, InterfaceC1364105Vn<? super C06D9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06d8;
        this.LLILLJJLI = c06d7;
        this.LLILLL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06D9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        String containerID2;
        Integer numLJ;
        Long lLJFF;
        String containerID3;
        Integer numLJ2;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        C1C7U.LIZ("GetStreaksInfoMethodIDL@eedf.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String conversationId = this.LL.getConversationId();
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(conversationId);
        C06C6.LIZIZ.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(conversationId);
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        Long lLJFF2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C06DB c06db = (C06DB) C1909107dp.LIZJ(C06DB.class, containerID);
        InterfaceC634840OvC interfaceC634840OvC2 = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        C06DC c06dc = (C06DC) C1909107dp.LIZJ(C06DC.class, containerID2);
        if (streakDataLJIIIIZZ != null && (enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakDataLJIIIIZZ, false)) != null) {
            numLJ = C2286608xc.LJ(enumC1579606GkLJIIIIZZ.ordinal());
        } else {
            numLJ = null;
        }
        c06dc.setStreakStatus(numLJ);
        if (streakDataLJIIIIZZ != null) {
            lLJFF = C2286608xc.LJFF(streakDataLJIIIIZZ.createTime);
        } else {
            lLJFF = null;
        }
        c06dc.setStreakCreateTime(lLJFF);
        InterfaceC634840OvC interfaceC634840OvC3 = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            containerID3 = interfaceC634840OvC3.getContainerID();
        } else {
            containerID3 = null;
        }
        C06DD c06dd = (C06DD) C1909107dp.LIZJ(C06DD.class, containerID3);
        if (streakPetDataLIZIZ != null) {
            numLJ2 = C2286608xc.LJ(streakPetDataLIZIZ.status);
        } else {
            numLJ2 = null;
        }
        c06dd.setStreakPetStatus(numLJ2);
        if (streakPetDataLIZIZ != null) {
            lLJFF2 = C2286608xc.LJFF(streakPetDataLIZIZ.createTime);
        }
        c06dd.setStreakPetCreateTime(lLJFF2);
        c06db.setStreakInfo(c06dc);
        c06db.setStreakPetInfo(c06dd);
        this.LLILLL.onSuccess(c06db, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetStreaksInfoMethodIDL@eedf.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
