package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {138}, m = "invokeSuspend")
public final class C1433140nOi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public VideoPublishEditModel LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ VideoPublishEditModel LLJILJIL;
    public final /* synthetic */ Activity LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ boolean LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433140nOi(String str, VideoPublishEditModel videoPublishEditModel, Activity activity, int i, boolean z, InterfaceC1364105Vn<? super C1433140nOi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = str;
        this.LLJILJIL = videoPublishEditModel;
        this.LLJILJILJ = activity;
        this.LLJILLL = i;
        this.LLJJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1433140nOi c1433140nOi = new C1433140nOi(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c1433140nOi.LLJI = obj;
        return c1433140nOi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:253|37|255|38) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0121, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r7);
        X.C201955140j.LJIIIZ(X.C830690WiJ.LIZIZ, "StoryPhotoModePublisher", "start activity error", r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x0131, B:18:0x00ba], limit reached: 284 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v50, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0106 -> B:6:0x0031). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1433140nOi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
