package X;

import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel$observeFollowStateUpdatesFromRelationService$1$1", f = "FollowCreatorsViewModel.kt", l = {465}, m = "invokeSuspend")
public final class C1673920tf4 extends C09AX implements Function2<FollowStatus, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FollowCreatorsViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673920tf4(FollowCreatorsViewModel followCreatorsViewModel, InterfaceC1364105Vn<? super C1673920tf4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = followCreatorsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1673920tf4 c1673920tf4 = new C1673920tf4(this.LLILLL, interfaceC1364105Vn);
        c1673920tf4.LLILLJJLI = obj;
        return c1673920tf4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String userId;
        C1673830tev c1673830tev;
        List<C1673800tes> list;
        EnumC1673820teu enumC1673820teu;
        C1C7U.LIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            FollowStatus followStatus = (FollowStatus) this.LLILLJJLI;
            if (followStatus != null && (userId = followStatus.getUserId()) != null) {
                FollowCreatorsViewModel followCreatorsViewModel = this.LLILLL;
                int followStatus2 = followStatus.getFollowStatus();
                C2252321DDq c2252321DDq = followCreatorsViewModel.LL;
                C1673800tes c1673800tes = null;
                if (c2252321DDq != null && (c1673830tev = (C1673830tev) c2252321DDq.getValue()) != null && (list = c1673830tev.LIZ) != null) {
                    Iterator<C1673800tes> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1673800tes next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, userId)) {
                            c1673800tes = next;
                            break;
                        }
                    }
                    C1673800tes c1673800tes2 = c1673800tes;
                    if (c1673800tes2 != null) {
                        EnumC1673820teu.Companion.getClass();
                        if (followStatus2 != -1 && followStatus2 != 0) {
                            if (followStatus2 != 1 && followStatus2 != 2) {
                                if (followStatus2 != 4) {
                                    enumC1673820teu = EnumC1673820teu.TO_FOLLOW;
                                } else {
                                    enumC1673820teu = EnumC1673820teu.REQUESTED;
                                }
                            } else {
                                enumC1673820teu = EnumC1673820teu.FOLLOWING;
                            }
                        } else {
                            enumC1673820teu = EnumC1673820teu.TO_FOLLOW;
                        }
                        followCreatorsViewModel.zQ2(c1673800tes2, enumC1673820teu);
                    }
                }
                C2252331DDr c2252331DDr = followCreatorsViewModel.LLILLL;
                C1673900tf2 c1673900tf2 = new C1673900tf2(userId, followStatus.getFollowStatus());
                this.LL = 1;
                if (c2252331DDr.emit(c1673900tf2, this) == objLJFF) {
                    C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowCreatorsViewModel@bf59.observeFollowStateUpdatesFromRelationService$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FollowStatus followStatus, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(followStatus, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
