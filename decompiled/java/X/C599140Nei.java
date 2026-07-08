package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.AnchorPrefixManager$prefetchPrefix$1", f = "AnchorPrefixManager.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C599140Nei extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C599140Nei(List<? extends Aweme> list, InterfaceC1364105Vn<? super C599140Nei> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599140Nei(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        C1C7U.LIZ("AnchorPrefixManager@ed48.prefetchPrefix$1");
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
            List listLLD = C13LP.LLD(10, this.LLILLJJLI);
            ArrayList<Aweme> arrayList = new ArrayList();
            Iterator it2 = listLLD.iterator();
            while (true) {
                String name = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Aweme aweme = (Aweme) next;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                if (((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).isEcomVideo(aweme)) {
                    arrayList.add(next);
                }
            }
            ArrayList<ECAnchorInfo> arrayList2 = new ArrayList();
            for (Aweme aweme2 : arrayList) {
                C21273718Nb.LIZ.getClass();
                ECAnchorInfo eCAnchorInfoLIZ = C21273718Nb.LIZ(aweme2);
                if (eCAnchorInfoLIZ != null) {
                    arrayList2.add(eCAnchorInfoLIZ);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (ECAnchorInfo eCAnchorInfo : arrayList2) {
                C19719612Di.LJJI(C15438062q.LJIJJLI(C13LQ.LJIJI(new List[]{eCAnchorInfo.prefixPrimaryImageUrls, eCAnchorInfo.prefixSecondaryImageUrls})), arrayList3);
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList3);
            if (!listLJJJJI.isEmpty()) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C340980DYi c340980DYi = new C340980DYi(listLJJJJI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c340980DYi) == objLJFF) {
                    C1C7U.LIZIZ("AnchorPrefixManager@ed48.prefetchPrefix$1");
                    return objLJFF;
                }
            }
        }
        C21273718Nb c21273718Nb = C21273718Nb.LIZ;
        C21273718Nb.LIZLLL = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPrefixManager@ed48.prefetchPrefix$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
