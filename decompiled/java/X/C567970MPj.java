package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.RecentCelebrationData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$preloadCelebrationAndMaterial$task$1$preloadMaterialTask$1", f = "CelebrationRepo.kt", l = {93}, m = "invokeSuspend")
public final class C567970MPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult>, Object> {
    public int LL;
    public final /* synthetic */ C568040MPq LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567970MPj(C568040MPq c568040MPq, Context context, InterfaceC1364105Vn<? super C567970MPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c568040MPq;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567970MPj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Integer> recentCelebration;
        C1C7U.LIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$1");
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
            C568030MPp.LIZ.getClass();
            C568030MPp.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), C568030MPp.LIZIZ());
            RecentCelebrationData recentCelebrationData = C568030MPp.LJ;
            if (recentCelebrationData != null) {
                recentCelebration = recentCelebrationData.getRecentCelebration();
            } else {
                recentCelebration = null;
            }
            C568040MPq c568040MPq = this.LLILLJJLI;
            Context context = this.LLILLL;
            this.LL = 1;
            obj = c568040MPq.LJFF(1, recentCelebration, context, false, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$preloadMaterialTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
