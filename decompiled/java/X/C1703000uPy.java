package X;

import com.ss.android.ugc.aweme.services.audio.VcCreatorInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1$vcResult$1", f = "AudioWatermarkServiceImpl.kt", l = {51}, m = "invokeSuspend")
public final class C1703000uPy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VcCreatorInfo>, Object> {
    public int LL;
    public final /* synthetic */ AudioWatermarkServiceImpl LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703000uPy(AudioWatermarkServiceImpl audioWatermarkServiceImpl, List<String> list, InterfaceC1364105Vn<? super C1703000uPy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = audioWatermarkServiceImpl;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703000uPy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1$vcResult$1");
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
            AudioWatermarkServiceImpl audioWatermarkServiceImpl = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = audioWatermarkServiceImpl.fetchVcCreatorInfoByIdList(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1$vcResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AudioWatermarkServiceImpl@9fc7.fetchAudioWatermarkInfo$1$vcResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VcCreatorInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
