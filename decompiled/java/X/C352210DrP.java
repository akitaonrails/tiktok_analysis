package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audio.copyrightdetect.NLEAudioUtils$extractNewAudio$2", f = "NLEAudioUtils.kt", l = {26}, m = "invokeSuspend")
public final class C352210DrP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ NLEModel LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352210DrP(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C352210DrP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nLEModel;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352210DrP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String path;
        C1C7U.LIZ("NLEAudioUtils@9f2b.extractNewAudio$2");
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
            C352190DrN c352190DrN = C352190DrN.LIZ;
            NLEModel nLEModel = this.LLILLJJLI;
            this.LL = 1;
            c352190DrN.getClass();
            obj = C2296808zG.LJ(new C351970Dr1(nLEModel, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractNewAudio$2");
                return objLJFF;
            }
        }
        C0VSJ c0vsjLJIIJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJJI(this.LLILLL.getCreativeInfo(), EnumC20228014Cw.AUDIO_COPYRIGHT_DETECT, "originalAudio.wav", true);
        if (TEVideoUtils.concat((String[]) ((List) obj).toArray(new String[0]), c0vsjLJIIJJI.getPath()) == 0) {
            path = c0vsjLJIIJJI.getPath();
        } else {
            path = "";
        }
        C1C7U.LIZIZ("NLEAudioUtils@9f2b.extractNewAudio$2");
        return path;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
