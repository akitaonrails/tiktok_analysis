package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.aiself.AiSelfTemplateComponent$createTemplateDownloadCallback$1$onSuccess$2", f = "AiSelfTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C573880Mf4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C573850Mf1 LL;
    public final /* synthetic */ C0L7B LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C573880Mf4(C573850Mf1 c573850Mf1, C0L7B c0l7b, InterfaceC1364105Vn<? super C573880Mf4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c573850Mf1;
        this.LLILLJJLI = c0l7b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C573880Mf4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AVMusic aVMusic;
        C1C7U.LIZ("AiSelfTemplateComponent@5a3.createTemplateDownloadCallback$1$onSuccess$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1413540mt6 interfaceC1413540mt6I3 = this.LL.i3();
        if (interfaceC1413540mt6I3 != null) {
            C0L7B c0l7b = this.LLILLJJLI;
            if (c0l7b != null) {
                aVMusic = c0l7b.LJIIIIZZ;
            } else {
                aVMusic = null;
            }
            interfaceC1413540mt6I3.lz(aVMusic);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiSelfTemplateComponent@5a3.createTemplateDownloadCallback$1$onSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
