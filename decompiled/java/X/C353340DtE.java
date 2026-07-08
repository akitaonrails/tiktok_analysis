package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.bottombar.logic.funchandler.AiExtendFunctionHandler$Companion$startAiExtendFromSlot$1$1", f = "AiExtendFunctionHandler.kt", l = {}, m = "invokeSuspend")
public final class C353340DtE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19A3 LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ NLETrackSlot LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ AbstractC359300E6u LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353340DtE(C19A3 c19a3, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, String str, String str2, NLETrackSlot nLETrackSlot, boolean z, AbstractC359300E6u abstractC359300E6u, long j, InterfaceC1364105Vn<? super C353340DtE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19a3;
        this.LLILLJJLI = c0e48;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = nLETrackSlot;
        this.LLIZ = z;
        this.LLIZLLLIL = abstractC359300E6u;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353340DtE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiExtendFunctionHandler$Companion@4285.startAiExtendFromSlot$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C359140E6e.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiExtendFunctionHandler$Companion@4285.startAiExtendFromSlot$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
