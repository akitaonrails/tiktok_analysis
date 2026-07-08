package X;

import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager$requestBlip$1", f = "AILivePhotoPromptManager.kt", l = {196}, m = "invokeSuspend")
public final class C564530MCd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AILivePhotoPromptManager LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564530MCd(AILivePhotoPromptManager aILivePhotoPromptManager, String str, String str2, InterfaceC1364105Vn<? super C564530MCd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aILivePhotoPromptManager;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C564530MCd c564530MCd = new C564530MCd(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c564530MCd.LLILLJJLI = obj;
        return c564530MCd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoPromptManager@57e8.requestBlip$1");
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
            this.LLILLL.getClass();
            AILivePhotoPromptManager aILivePhotoPromptManager = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = aILivePhotoPromptManager.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlip$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlip$1");
            return unit;
        }
        C559010LwB.LIZJ("AILivePhotoPromptManager", "blip: ".concat(str2));
        this.LLILLL.LJFF.onNext(new BlipData(this.LLILZIL, this.LLILZ, str2));
        C564540MCe.LIZIZ.put(this.LLILZIL, str2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlip$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
