package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchMultiAudioFile$1$1$result$1", f = "TTSRequestLogicComponent.kt", l = {253}, m = "invokeSuspend")
public final class C344301Vh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ List<Boolean> LLILZLL;
    public final /* synthetic */ ITTSCallback LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344301Vh(List<String> list, int i, List<String> list2, CreativeInfo creativeInfo, List<Boolean> list3, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super C344301Vh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = list2;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = list3;
        this.LLIZ = iTTSCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344301Vh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Unit unit;
        Object obj2;
        Object obj3;
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1$1$result$1");
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
            List<String> list = this.LLILLJJLI;
            int i2 = this.LLILLL;
            if (i2 >= 0 && i2 < list.size()) {
                z = true;
            } else {
                z = false;
            }
            Object obj4 = "";
            if (z) {
                ListProtector.get(list, i2);
            }
            List<String> list2 = this.LLILZ;
            int i3 = this.LLILLL;
            if (i3 >= 0 && i3 < list2.size()) {
                ListProtector.get(list2, i3);
            }
            ITTSService iTTSServiceTtsService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).ttsService();
            if (iTTSServiceTtsService != null) {
                List<String> list3 = this.LLILLJJLI;
                int i4 = this.LLILLL;
                if (i4 < 0 || i4 >= list3.size()) {
                    obj2 = "";
                } else {
                    obj2 = ListProtector.get(list3, i4);
                }
                String str = (String) obj2;
                List<String> list4 = this.LLILZ;
                int i5 = this.LLILLL;
                if (i5 >= 0 && i5 < list4.size()) {
                    obj4 = ListProtector.get(list4, i5);
                }
                String str2 = (String) obj4;
                CreativeInfo creativeInfo = this.LLILZIL;
                List<Boolean> list5 = this.LLILZLL;
                int i6 = this.LLILLL;
                if (i6 >= 0 && i6 < list5.size()) {
                    obj3 = ListProtector.get(list5, i6);
                } else {
                    obj3 = false;
                }
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ITTSCallback iTTSCallback = this.LLIZ;
                this.LL = 1;
                if (iTTSServiceTtsService.fetchTTSAudioFile(str, "", str2, creativeInfo, zBooleanValue, false, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1$1$result$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1$1$result$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchMultiAudioFile$1$1$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
