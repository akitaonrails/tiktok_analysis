package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReplyInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0lS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel$scheduleReplyGuideInsertion$1", f = "RepostInteractListViewModel.kt", l = {394}, m = "invokeSuspend")
public final class C1358390lS9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RepostInteractListViewModel LLILLJJLI;
    public final /* synthetic */ UpvoteStruct LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358390lS9(RepostInteractListViewModel repostInteractListViewModel, UpvoteStruct upvoteStruct, InterfaceC1364105Vn<? super C1358390lS9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostInteractListViewModel;
        this.LLILLL = upvoteStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358390lS9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UpvoteReplyInfo upvoteReplyInfo;
        C1C7U.LIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                return objLJFF;
            }
        }
        List<InterfaceC1891350zJl> list = ((C1358490lSJ) this.LLILLJJLI.getState()).LL.LLILZ;
        if (list == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
            return unit;
        }
        UpvoteStruct upvoteStruct = this.LLILLL;
        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl next = it2.next();
            if ((next instanceof C1357970lRT) && Intrinsics.LJFF(((C1357970lRT) next).LLILZIL.upvoteId, upvoteStruct.upvoteId)) {
                if (i2 >= 0) {
                    RepostInteractListViewModel repostInteractListViewModel = this.LLILLJJLI;
                    if (!list.isEmpty()) {
                        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                            if (interfaceC1891350zJl instanceof C1357970lRT) {
                                C1357970lRT c1357970lRT = (C1357970lRT) interfaceC1891350zJl;
                                UpvoteStruct upvoteStruct2 = c1357970lRT.LLILZIL;
                                repostInteractListViewModel.getClass();
                                if (RepostInteractListViewModel.EQ2(upvoteStruct2) && (upvoteReplyInfo = c1357970lRT.LLILZIL.replyInfo) != null && upvoteReplyInfo.totalReplyCount > 0) {
                                    Unit unit2 = Unit.LIZ;
                                    C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                                    return unit2;
                                }
                            }
                        }
                    }
                    if (!list.isEmpty()) {
                        Iterator<InterfaceC1891350zJl> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() instanceof C1355670lNl) {
                                Unit unit3 = Unit.LIZ;
                                C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                                return unit3;
                            }
                        }
                    }
                    int iIntValue = ((Number) C1359720lUI.LIZ(list, i2, AFwS259S0000000_21.get$arr$(373)).getFirst()).intValue();
                    if (iIntValue < 0) {
                        iIntValue = list.size();
                    }
                    List<InterfaceC1891350zJl> listSubList = list.subList(i2, iIntValue);
                    if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                        Iterator<InterfaceC1891350zJl> it4 = listSubList.iterator();
                        while (it4.hasNext()) {
                            if (it4.next() instanceof C1357950lRR) {
                                Unit unit4 = Unit.LIZ;
                                C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                                return unit4;
                            }
                        }
                    }
                    RepostInteractListViewModel repostInteractListViewModel2 = this.LLILLJJLI;
                    if (!repostInteractListViewModel2.LLJILLL) {
                        C1358720lSg.LIZ.getClass();
                        if (C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("reply_guide_show_count_"), 0) >= 3) {
                            Unit unit5 = Unit.LIZ;
                            C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                            return unit5;
                        }
                        C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("reply_guide_show_count_"), C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("reply_guide_show_count_"), 0) + 1);
                        repostInteractListViewModel2.LLJILLL = true;
                    }
                    this.LLILLJJLI.listAddItemAt(iIntValue, new C1355670lNl(this.LLILLL));
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
                    return unit6;
                }
            } else {
                i2++;
            }
        }
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("RepostInteractListViewModel@3304.scheduleReplyGuideInsertion$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
