package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftAIGCRestoreHelper$updateAIGCShootingEffectsWithLegacyFramework$taskInfoList$1", f = "DraftAIGCRestoreHelper.kt", l = {136}, m = "invokeSuspend")
public final class C2388809Xq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2388809Xq(AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C2388809Xq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2388809Xq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        C1C7U.LIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$taskInfoList$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                String strLIZ = this.LLILLJJLI.LIZ();
                this.LL = 1;
                obj = iCreationAsyncTaskManagerLIZ.LJJIJLIJ(strLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$taskInfoList$1");
                    return objLJFF;
                }
            }
            arrayList = C13BV.INSTANCE;
            C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$taskInfoList$1");
            return arrayList;
        }
        List list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                C0LSZ c0lsz = (C0LSZ) obj2;
                if (c0lsz.LJIIL == Source.EFFECT_AIGC && Intrinsics.LJFF(c0lsz.LIZLLL, C0LQP.AIGC_WORKFLOW_I2V.getTypeName())) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$taskInfoList$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
