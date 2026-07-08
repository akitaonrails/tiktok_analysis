package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LAL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftAIGCRestoreHelper$updateAILiveIfNeed$2", f = "DraftAIGCRestoreHelper.kt", l = {69}, m = "invokeSuspend")
public final class C0LAL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ NLEEditor LLILLL;
    public final /* synthetic */ AILivePhotoModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LAL(AwemeDraft awemeDraft, NLEEditor nLEEditor, AILivePhotoModel aILivePhotoModel, InterfaceC1364105Vn<? super C0LAL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = nLEEditor;
        this.LLILZ = aILivePhotoModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LAL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("DraftAIGCRestoreHelper@c321.updateAILiveIfNeed$2");
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
                    C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAILiveIfNeed$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAILiveIfNeed$2");
            return unit;
        }
        List list = (List) obj;
        if (list != null) {
            AILivePhotoModel aILivePhotoModel = this.LLILZ;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C0LSZ c0lsz = (C0LSZ) next;
                    if (c0lsz.LJIIL == Source.EDIT_AI_LIVE_PHOTO && Intrinsics.LJFF(aILivePhotoModel.getTaskId(), c0lsz.LIZ) && !Intrinsics.LJFF(c0lsz.LJ, "CANCELED")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0LSZ c0lsz2 = (C0LSZ) next;
            if (c0lsz2 != null) {
                C545750Lan c545750Lan = C545750Lan.LIZ;
                NLEEditor nLEEditor = this.LLILLL;
                AwemeDraft awemeDraft = this.LLILLJJLI;
                c545750Lan.getClass();
                C545750Lan.LIZ(nLEEditor, awemeDraft, c0lsz2);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAILiveIfNeed$2");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAILiveIfNeed$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
