package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.draft.AILiveDraftHelper$updateBackUpDraftForAILive$1", f = "AILiveDraftHelper.kt", l = {234}, m = "invokeSuspend")
public final class C545760Lao extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;
    public final /* synthetic */ NLEEditor LLILZ;
    public final /* synthetic */ AwemeDraft LLILZIL;
    public final /* synthetic */ AILivePhotoModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545760Lao(String str, NLETrackSlot nLETrackSlot, NLEEditor nLEEditor, AwemeDraft awemeDraft, AILivePhotoModel aILivePhotoModel, InterfaceC1364105Vn<? super C545760Lao> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = nLETrackSlot;
        this.LLILZ = nLEEditor;
        this.LLILZIL = awemeDraft;
        this.LLILZLL = aILivePhotoModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545760Lao(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveDraftHelper@dc9c.updateBackUpDraftForAILive$1");
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
                String str = this.LLILLJJLI;
                this.LL = 1;
                obj = iCreationAsyncTaskManagerLIZ.LJFF(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AILiveDraftHelper@dc9c.updateBackUpDraftForAILive$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AILiveDraftHelper@dc9c.updateBackUpDraftForAILive$1");
            return unit;
        }
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz != null) {
            C352250DrT.LJIILJJIL(this.LLILLL, this.LLILLJJLI);
            new C558820Lvs(this.LLILZ, this.LLILZIL).LJII(c0lsz);
            this.LLILZIL.LIZ.aiLivePhotoModel.progressModel = this.LLILZLL.LIZIZ();
            this.LLILZIL.LIZ.aiLivePhotoModel.lastStatus = this.LLILZLL.lastStatus;
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ2 != null && iCreationAsyncTaskManagerLIZ2.LJIILIIL() != null) {
                C0LCT.LIZLLL(this.LLILZIL.LIZ(), true);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AILiveDraftHelper@dc9c.updateBackUpDraftForAILive$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AILiveDraftHelper@dc9c.updateBackUpDraftForAILive$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
