package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem$downloadVideo$1", f = "TakoVideoGenerationCoverAssem.kt", l = {437}, m = "invokeSuspend")
public final class C1856600yPi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1856590yPh LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ TakoVideoGenerationCoverAssem LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856600yPi(InterfaceC1856590yPh interfaceC1856590yPh, Message message, String str, View view, TakoVideoGenerationCoverAssem takoVideoGenerationCoverAssem, InterfaceC1364105Vn<? super C1856600yPi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1856590yPh;
        this.LLILZ = message;
        this.LLILZIL = str;
        this.LLILZLL = view;
        this.LLIZ = takoVideoGenerationCoverAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1856600yPi c1856600yPi = new C1856600yPi(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1856600yPi.LLILLJJLI = obj;
        return c1856600yPi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseVideo baseVideo;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT71;
        C1C7U.LIZ("TakoVideoGenerationCoverAssem@7865.downloadVideo$1");
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
            C09AE c09ae = (C09AE) ((InterfaceC497601wk) this.LLILLJJLI).getCoroutineContext().get(C09AE.LJJLJ);
            if (c09ae != null) {
                c09ae.LJII(new AwS606S0100000_27(this.LLIZ, 589));
            }
            List<BaseVideo> videoList = this.LLILLL.getVideoList();
            if (videoList != null && (baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, videoList)) != null) {
                String str = baseVideo.videoUrl;
                if (str != null && str.length() != 0) {
                    C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
                    Message message = this.LLILZ;
                    String str2 = this.LLILZIL;
                    View view = this.LLILZLL;
                    ITakoContextAbility iTakoContextAbilityTp = this.LLIZ.tp();
                    if (iTakoContextAbilityTp != null && (c13lcT71 = iTakoContextAbilityTp.T71()) != null) {
                        c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ();
                    } else {
                        c1863850ybP = null;
                    }
                    this.LL = 1;
                    if (c1857420yR2.LJJII(baseVideo, message, str2, view, c1863850ybP, this) == objLJFF) {
                        C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.downloadVideo$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.downloadVideo$1");
                    return unit;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.downloadVideo$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.downloadVideo$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
