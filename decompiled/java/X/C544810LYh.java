package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$saveDraftWithImageInputOnly$1$1", f = "AIGCOfflineProcessingViewModel.kt", l = {449}, m = "invokeSuspend")
public final class C544810LYh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ AIGCOfflineModel LLILZIL;
    public final /* synthetic */ CreativeModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544810LYh(String str, AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, List<String> list, AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, InterfaceC1364105Vn<? super C544810LYh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = aIGCOfflineProcessingViewModel;
        this.LLILZ = list;
        this.LLILZIL = aIGCOfflineModel;
        this.LLILZLL = creativeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544810LYh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.saveDraftWithImageInputOnly$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                if (str != null) {
                    C0LZB c0lzb = this.LLILLL.LL;
                    String str2 = (String) C13LP.LJJJLL(this.LLILZ);
                    if (str2 == null) {
                        str2 = "";
                    }
                    AIGCOfflineModel aIGCOfflineModel = this.LLILZIL;
                    CreativeModel creativeModel = this.LLILZLL;
                    this.LL = 1;
                    if (c0lzb.LIZIZ(str, str2, aIGCOfflineModel, creativeModel, false, this) == objLJFF) {
                        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.saveDraftWithImageInputOnly$1$1");
                        return objLJFF;
                    }
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            AnonymousClass0925.LIZIZ("AIGCGenerationComponent", e.toString());
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.saveDraftWithImageInputOnly$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
