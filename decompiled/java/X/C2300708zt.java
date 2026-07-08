package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TTSServiceFactory$fetchTTSAudioFile$result$1", f = "TTSServiceFactory.kt", l = {28}, m = "invokeSuspend")
public final class C2300708zt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreativeInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ ITTSCallback LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300708zt(String str, String str2, String str3, CreativeInfo creativeInfo, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creativeInfo;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = iTTSCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2300708zt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSServiceFactory@ad37.fetchTTSAudioFile$result$1");
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
            CreativeInfo creativeInfo = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(C08F1.LIZIZ(this.LLILZIL));
            String strLIZJ = C2279808wW.LIZJ(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            boolean z = this.LLILZLL;
            boolean z2 = this.LLIZ;
            ITTSCallback iTTSCallback = this.LLIZLLLIL;
            this.LL = 1;
            if (C2374609Se.LIZ(str, str2, str3, strLIZJ, z, z2, iTTSCallback, this) == objLJFF) {
                C1C7U.LIZIZ("TTSServiceFactory@ad37.fetchTTSAudioFile$result$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSServiceFactory@ad37.fetchTTSAudioFile$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
