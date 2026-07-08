package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$downloadAudio$1$file$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2374809Sg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super File>, Object> {
    public final /* synthetic */ TTSFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374809Sg(TTSFragment tTSFragment, String str, InterfaceC1364105Vn<? super C2374809Sg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTSFragment;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2374809Sg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.downloadAudio$1$file$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsjLIZ = C2279808wW.LIZ(this.LL.ZS().getCreativeInfo(), this.LLILLJJLI, "");
        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1$file$1");
        return c0vsjLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super File> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
