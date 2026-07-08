package X;

import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.065W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareUtilsKt$intersectCandidateList$2", f = "QuickShareUtils.kt", l = {118}, m = "invokeSuspend")
public final class C065W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends QuickShareCandidate>, ? extends List<? extends IMContact>>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C065W(Aweme aweme, InterfaceC1364105Vn<? super C065W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C065W(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<QuickShareCandidate> list;
        List<QuickShareCandidate> list2;
        Pair pair;
        List<QuickShareCandidate> list3;
        C1C7U.LIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                list3 = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!C065U.LIZ()) {
                C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
                return null;
            }
            StringBuilder sb = new StringBuilder("aweme candidateList: ");
            QuickShareAIInfo quickShareAIInfo = this.LLILLL.getQuickShareAIInfo();
            if (quickShareAIInfo != null) {
                list = quickShareAIInfo.candidateList;
            } else {
                list = null;
            }
            sb.append(list);
            C1720006oQ.LJ("QuickShareAssem", sb.toString());
            QuickShareAIInfo quickShareAIInfo2 = this.LLILLL.getQuickShareAIInfo();
            if (quickShareAIInfo2 != null && (list2 = quickShareAIInfo2.candidateList) != null && !list2.isEmpty()) {
                QuickShareAIInfo quickShareAIInfo3 = this.LLILLL.getQuickShareAIInfo();
                if (quickShareAIInfo3 != null && (list3 = quickShareAIInfo3.candidateList) != null) {
                    this.LL = list3;
                    this.LLILLJJLI = 1;
                    obj = C065Z.LIZJ(list3, false, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
                        return objLJFF;
                    }
                } else {
                    C13BV c13bv = C13BV.INSTANCE;
                    pair = new Pair(c13bv, c13bv);
                    C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
                    return pair;
                }
            } else {
                C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
                return null;
            }
        }
        List list4 = (List) obj;
        if (list4 == null) {
            C13BV c13bv2 = C13BV.INSTANCE;
            Pair pair2 = new Pair(c13bv2, c13bv2);
            C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
            return pair2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (QuickShareCandidate quickShareCandidate : list3) {
            QuickShareCandidate quickShareCandidate2 = quickShareCandidate;
            Iterator it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    IMContact iMContact = (IMContact) it2.next();
                    if (C065Z.LIZIZ(quickShareCandidate2, iMContact)) {
                        arrayList.add(iMContact);
                        arrayList2.add(quickShareCandidate);
                        break;
                    }
                }
            }
        }
        arrayList2.isEmpty();
        pair = new Pair(arrayList2, arrayList);
        C1C7U.LIZIZ("QuickShareUtilsKt@56be.intersectCandidateList$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends QuickShareCandidate>, ? extends List<? extends IMContact>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
