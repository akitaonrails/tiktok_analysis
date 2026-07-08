package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.EditAudioCopyrightDetectComponent$submitProcess$1$extractAudio$path$1", f = "EditAudioCopyrightDetectComponent.kt", l = {550}, m = "invokeSuspend")
public final class C352080DrC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C907110ZiH LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352080DrC(C907110ZiH c907110ZiH, NLEModel nLEModel, InterfaceC1364105Vn<? super C352080DrC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c907110ZiH;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352080DrC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditAudioCopyrightDetectComponent@e8b5.submitProcess$1$extractAudio$path$1");
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
            VideoPublishEditModel videoPublishEditModelI3 = this.LLILLJJLI.i3();
            NLEModel nLEModel = this.LLILLL;
            this.LL = 1;
            obj = c352190DrN.LIZIZ(nLEModel, videoPublishEditModelI3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditAudioCopyrightDetectComponent@e8b5.submitProcess$1$extractAudio$path$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EditAudioCopyrightDetectComponent@e8b5.submitProcess$1$extractAudio$path$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
