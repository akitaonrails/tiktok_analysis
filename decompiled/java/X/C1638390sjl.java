package X;

import Y.AfS194S0100000_25;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638390sjl implements IFetchEffectChannelListener {
    public final /* synthetic */ C259800zU<InterfaceC420801kM> LIZ;
    public final /* synthetic */ C1638410sjn LIZIZ;
    public final /* synthetic */ C11PQ<C1638380sjk> LIZJ;

    public final void LIZ(ExceptionResult exceptionResult) {
        Exception runtimeException;
        if (exceptionResult != null) {
            exceptionResult.getException();
        }
        C11PQ<C1638380sjk> c11pq = this.LIZJ;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed on fetch remote filters, msg : ");
            sbLIZ.append(exceptionResult);
            sbLIZ.append("?.msg, code : ");
            sbLIZ.append(exceptionResult);
            sbLIZ.append("?.errorCode");
            runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c11pq.onError(runtimeException);
        C2219091BtD.LIZLLL().d("viki filter, EffectPlatformFilterDataFetcher.requestEffectPlatform -> onFail");
        this.LIZJ.onComplete();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.01kM] */
    public final void LIZJ(final EffectChannelResponse effectChannelResponse) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viki filter, EffectPlatformFilterDataFetcher.requestEffectPlatform -> onSuccessPerformanceABGroup.enableEffectCallbackOpt=");
        sbLIZ.append(C2281551ESb.LIZIZ.LJIL());
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        C259800zU<InterfaceC420801kM> c259800zU = this.LIZ;
        final C1638410sjn c1638410sjn = this.LIZIZ;
        c259800zU.element = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sjm
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C1638380sjk> interfaceC2329309At) {
                String logId;
                List<EffectCategoryResponse> categoryResponseList;
                C1638410sjn c1638410sjn2 = c1638410sjn;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                c1638410sjn2.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (effectChannelResponse2 != null && (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(categoryResponseList, 10));
                    for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                        List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(totalEffects, 10));
                        Iterator<Effect> it2 = totalEffects.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(C1639660slo.LIZ(it2.next(), effectCategoryResponse.getKey()));
                        }
                        arrayList3.add(new Pair(effectCategoryResponse, arrayList4));
                    }
                    arrayList.addAll(arrayList3);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI((Iterable) ((Pair) it3.next()).getSecond(), arrayList5);
                    }
                    arrayList2.addAll(arrayList5);
                }
                if (effectChannelResponse2 != null) {
                    logId = effectChannelResponse2.getLogId();
                } else {
                    logId = null;
                }
                interfaceC2329309At.onSuccess(new C1638380sjk(new C1638440sjq(arrayList2, arrayList, logId), false));
            }
        }).LJJIJIIJI(C11S5.LIZIZ).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS194S0100000_25(this.LIZJ, 132));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C1638410sjn c1638410sjn = this.LIZIZ;
        if (c1638410sjn.LIZJ) {
            c1638410sjn.LIZ.get().LJIJI(this.LIZIZ.LIZIZ.get(), new C1698210uIF(this, 1));
        } else {
            LIZ(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        LIZJ(effectChannelResponse);
    }

    public C1638390sjl(C259800zU<InterfaceC420801kM> c259800zU, C1638410sjn c1638410sjn, C11PQ<C1638380sjk> c11pq) {
        this.LIZ = c259800zU;
        this.LIZIZ = c1638410sjn;
        this.LIZJ = c11pq;
    }
}
