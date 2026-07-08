package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$clipVideoAndGenerate$1", f = "EPAIGCPanelRootComponent.kt", l = {1204, 1215, 1219, 1230, 1232, 1254, 1258, 1270, 1272}, m = "invokeSuspend")
public final class C378990EtV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public FrameCacheViewModel LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C378920EtO LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ NLETrackSlot LLJ;
    public final /* synthetic */ AIGCGenerationParam LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ NLESegmentVideo LLJILJILJ;
    public final /* synthetic */ Activity LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378990EtV(C378920EtO c378920EtO, long j, NLETrackSlot nLETrackSlot, AIGCGenerationParam aIGCGenerationParam, long j2, long j3, NLESegmentVideo nLESegmentVideo, Activity activity, InterfaceC1364105Vn<? super C378990EtV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c378920EtO;
        this.LLIZLLLIL = j;
        this.LLJ = nLETrackSlot;
        this.LLJI = aIGCGenerationParam;
        this.LLJIJIL = j2;
        this.LLJILJIL = j3;
        this.LLJILJILJ = nLESegmentVideo;
        this.LLJILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378990EtV(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c2  */
    /* JADX WARN: Type inference failed for: r24v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundGenerateParams] */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378990EtV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
