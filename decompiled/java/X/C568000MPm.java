package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import com.ss.android.ugc.aweme.story.celebration.CelebrationParam;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.RecentCelebrationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$preloadCelebrationAndMaterial$task$1$preloadMaterialTask$2", f = "CelebrationRepo.kt", l = {124}, m = "invokeSuspend")
public final class C568000MPm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult>, Object> {
    public int LL;
    public final /* synthetic */ RecentCelebrationResponse LLILLJJLI;
    public final /* synthetic */ C568040MPq LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C568000MPm(RecentCelebrationResponse recentCelebrationResponse, C568040MPq c568040MPq, Context context, InterfaceC1364105Vn<? super C568000MPm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recentCelebrationResponse;
        this.LLILLL = c568040MPq;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C568000MPm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        C1C7U.LIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$2");
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
            List<CelebrationParam> celebrationParams = this.LLILLJJLI.getCelebrationParams();
            if (celebrationParams != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(celebrationParams, 10));
                Iterator<CelebrationParam> it2 = celebrationParams.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2286608xc.LJ(it2.next().celebrationType));
                }
            } else {
                arrayList = null;
            }
            C568040MPq c568040MPq = this.LLILLL;
            Context context = this.LLILZ;
            this.LL = 1;
            obj = c568040MPq.LJFF(1, arrayList, context, true, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
