package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel$markCollected$1$1", f = "AddYoursDetailViewModel.kt", l = {85}, m = "invokeSuspend")
public final class C615100OAq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C615110OAr LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ AddYoursDetailViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615100OAq(C615110OAr c615110OAr, boolean z, AddYoursDetailViewModel addYoursDetailViewModel, InterfaceC1364105Vn<? super C615100OAq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c615110OAr;
        this.LLILZ = z;
        this.LLILZIL = addYoursDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615100OAq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int collectStatus;
        Long topicId;
        Object objMarkCollectedStatus = obj;
        C1C7U.LIZ("AddYoursDetailViewModel@cb9c.markCollected$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    collectStatus = this.LL;
                    C155000ia.LIZIZ(objMarkCollectedStatus);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objMarkCollectedStatus);
                AddYoursTopic addYoursTopic = this.LLILLL.LL;
                if (addYoursTopic != null) {
                    collectStatus = addYoursTopic.getCollectStatus();
                } else {
                    collectStatus = 0;
                }
                boolean z = this.LLILZ;
                AddYoursTopic addYoursTopic2 = this.LLILLL.LL;
                if (addYoursTopic2 != null) {
                    AddYoursTopic addYoursTopicCopy = addYoursTopic2.copy(addYoursTopic2.topicId, addYoursTopic2.text, addYoursTopic2.inviterAvatars, addYoursTopic2.inviterCount, addYoursTopic2.suggestInviteeAvatars, addYoursTopic2.videoCount, addYoursTopic2.video, addYoursTopic2.fromQuestion, z ? 1 : 0, addYoursTopic2.viewerInvited, addYoursTopic2.eoyCampaign, addYoursTopic2.eoyCampaignSchema, addYoursTopic2.topicType);
                    if (addYoursTopicCopy != null) {
                        C1440005kM.LIZ(new C0NKE(addYoursTopicCopy, EnumC615090OAp.COLLECT));
                    }
                }
                C615110OAr c615110OAr = this.LLILLL;
                boolean z2 = this.LLILZ;
                AddYoursTopic addYoursTopic3 = c615110OAr.LL;
                if (addYoursTopic3 != null) {
                    topicId = addYoursTopic3.getTopicId();
                } else {
                    topicId = null;
                }
                if (topicId != null) {
                    long jLongValue = topicId.longValue();
                    this.LL = collectStatus;
                    this.LLILLJJLI = 1;
                    objMarkCollectedStatus = C2188608ho.LIZ().markCollectedStatus(jLongValue, z2 ? 1 : 0, this);
                    if (objMarkCollectedStatus == objLJFF) {
                        C1C7U.LIZIZ("AddYoursDetailViewModel@cb9c.markCollected$1$1");
                        return objLJFF;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            c098200Yq = (BaseResponse) objMarkCollectedStatus;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AddYoursDetailViewModel addYoursDetailViewModel = this.LLILZIL;
        C615110OAr c615110OAr2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(thM5exceptionOrNullimpl);
            if (!(thM5exceptionOrNullimpl instanceof CancellationException)) {
                addYoursDetailViewModel.setState(AFwS240S0000000_9.get$arr$(699));
                AddYoursTopic addYoursTopic4 = c615110OAr2.LL;
                if (addYoursTopic4 != null) {
                    AddYoursTopic addYoursTopicCopy2 = addYoursTopic4.copy(addYoursTopic4.topicId, addYoursTopic4.text, addYoursTopic4.inviterAvatars, addYoursTopic4.inviterCount, addYoursTopic4.suggestInviteeAvatars, addYoursTopic4.videoCount, addYoursTopic4.video, addYoursTopic4.fromQuestion, collectStatus, addYoursTopic4.viewerInvited, addYoursTopic4.eoyCampaign, addYoursTopic4.eoyCampaignSchema, addYoursTopic4.topicType);
                    if (addYoursTopicCopy2 != null) {
                        C1440005kM.LIZ(new C0NKE(addYoursTopicCopy2, EnumC615090OAp.COLLECT));
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursDetailViewModel@cb9c.markCollected$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
