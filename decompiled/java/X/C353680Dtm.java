package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.shared.results.EditorProAIGCResultsPanelComponent$regenerateInner$1", f = "EditorProAIGCResultsPanelComponent.kt", l = {958, 964, 985, 991}, m = "invokeSuspend")
public final class C353680Dtm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C377730ErT LLIZLLLIL;
    public final /* synthetic */ NLETrackSlot LLJ;
    public final /* synthetic */ NLETrackSlot LLJI;
    public final /* synthetic */ C259800zU<AIGCGenerationParam> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353680Dtm(C377730ErT c377730ErT, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, C259800zU<AIGCGenerationParam> c259800zU, InterfaceC1364105Vn<? super C353680Dtm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c377730ErT;
        this.LLJ = nLETrackSlot;
        this.LLJI = nLETrackSlot2;
        this.LLJIJIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353680Dtm c353680Dtm = new C353680Dtm(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c353680Dtm.LLIZ = obj;
        return c353680Dtm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024f  */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam] */
    /* JADX WARN: Type inference failed for: r3v26, types: [T, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353680Dtm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
