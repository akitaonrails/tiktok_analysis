package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05X5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$syncRequestCelebrationMaterial$deferred$1", f = "CelebrationRepo.kt", l = {233}, m = "invokeSuspend")
public final class C05X5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C568040MPq LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05X5(int i, C568040MPq c568040MPq, int i2, Context context, boolean z, InterfaceC1364105Vn<? super C05X5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c568040MPq;
        this.LLILZ = i2;
        this.LLILZIL = context;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05X5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CelebrationRepo@2cdd.syncRequestCelebrationMaterial$deferred$1");
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
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CeleRepo, today celebration = ");
            sbLIZ.append(this.LLILLJJLI);
            C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            C568040MPq c568040MPq = this.LLILLL;
            int i2 = this.LLILZ;
            List<Integer> listSingletonList = Collections.singletonList(C2286608xc.LJ(this.LLILLJJLI));
            Context context = this.LLILZIL;
            boolean z = this.LLILZLL;
            this.LL = 1;
            obj = c568040MPq.LJFF(i2, listSingletonList, context, true, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationRepo@2cdd.syncRequestCelebrationMaterial$deferred$1");
                return objLJFF;
            }
        }
        this.LLILLL.LIZJ.set(false);
        C1C7U.LIZIZ("CelebrationRepo@2cdd.syncRequestCelebrationMaterial$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
