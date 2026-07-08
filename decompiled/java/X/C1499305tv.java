package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMMarkdownAnalysis$reportMarkdownTagPerf$1", f = "IMMarkdownAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1499305tv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499305tv(String str, long j, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499305tv(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMarkdownAnalysis@2704.reportMarkdownTagPerf$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C054G c054g = C1499405tw.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, this.LL), new Pair("tag_type", this.LLILLJJLI), new Pair("duration_ms", String.valueOf(this.LLILLL)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_im_markdown_message_tag_perf", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMarkdownAnalysis@2704.reportMarkdownTagPerf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
