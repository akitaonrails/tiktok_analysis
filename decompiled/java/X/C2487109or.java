package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS371S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.09or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicApplyHandler$saveMagicBitmap$2", f = "MagicApplyHandler.kt", l = {}, m = "invokeSuspend")
public final class C2487109or extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ C0E0B LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487109or(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, C0E0B c0e0b, InterfaceC1364105Vn<? super C2487109or> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = c0e0b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2487109or(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MagicApplyHandler@7aa1.saveMagicBitmap$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2486309oj c2486309oj = C2486309oj.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        NLETrackSlot nLETrackSlot = this.LLILLJJLI;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this.LLILLL, nLETrackSlot, 54);
        c2486309oj.getClass();
        Pair pairLIZLLL = C2486309oj.LIZLLL(videoPublishEditModel.getCreativeInfo(), nLETrackSlot, awS371S0200000_5);
        C1C7U.LIZIZ("MagicApplyHandler@7aa1.saveMagicBitmap$2");
        return pairLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
