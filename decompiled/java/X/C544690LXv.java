package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.bugfixab.AIGCCloseActivityAfterEditPageLaunched;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$enterEditFromDraft$2$1$1$1", f = "AIGCOfflineProcessingViewModel.kt", l = {674}, m = "invokeSuspend")
public final class C544690LXv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544690LXv(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, Activity activity, String str, String str2, InterfaceC1364105Vn<? super C544690LXv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544690LXv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCOfflineModel aIGCOfflineModelLIZ;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.enterEditFromDraft$2$1$1$1");
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
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLJJLI;
            C0LZB c0lzb = aIGCOfflineProcessingViewModel.LL;
            Activity activity = this.LLILLL;
            String str = this.LLILZ;
            AIGCOfflineModel aIGCOfflineModel = ((C0LY8) aIGCOfflineProcessingViewModel.LLJILLL.getValue()).LJIIJJI;
            if (aIGCOfflineModel != null) {
                aIGCOfflineModelLIZ = AIGCOfflineModel.LIZ(aIGCOfflineModel, false, false, true, null, null, null, null, 0, 0, null, null, null, null, null, null, this.LLILZIL, false, false, null, false, null, -5, 262142);
            } else {
                aIGCOfflineModelLIZ = null;
            }
            boolean zIsEnabled = AIGCCloseActivityAfterEditPageLaunched.isEnabled();
            this.LL = 1;
            if (c0lzb.LJ(activity, str, aIGCOfflineModelLIZ, zIsEnabled, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.enterEditFromDraft$2$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.enterEditFromDraft$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
