package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiTrace;
import com.ss.android.ugc.aweme.poi.anchor.component.PoiAnchorPanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.component.PoiAnchorPanelComponent$checkAndTrackPoiException$1", f = "PoiAnchorPanelComponent.kt", l = {64}, m = "invokeSuspend")
public final class C613000O2o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiAnchorPanelComponent LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PoiTrace LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613000O2o(PoiAnchorPanelComponent poiAnchorPanelComponent, Aweme aweme, String str, PoiTrace poiTrace, InterfaceC1364105Vn<? super C613000O2o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiAnchorPanelComponent;
        this.LLILLL = aweme;
        this.LLILZ = str;
        this.LLILZIL = poiTrace;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613000O2o(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:13:0x0036, B:14:0x0039, B:16:0x0046, B:18:0x004c, B:19:0x0050, B:21:0x0056, B:23:0x0068, B:37:0x0085, B:39:0x0094, B:43:0x009f, B:45:0x00b5, B:46:0x00b7, B:51:0x00c7, B:55:0x00d4, B:58:0x00de, B:61:0x00eb, B:62:0x00f3, B:66:0x00fc, B:75:0x011a, B:79:0x0134, B:69:0x0103, B:9:0x001c), top: B:84:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:13:0x0036, B:14:0x0039, B:16:0x0046, B:18:0x004c, B:19:0x0050, B:21:0x0056, B:23:0x0068, B:37:0x0085, B:39:0x0094, B:43:0x009f, B:45:0x00b5, B:46:0x00b7, B:51:0x00c7, B:55:0x00d4, B:58:0x00de, B:61:0x00eb, B:62:0x00f3, B:66:0x00fc, B:75:0x011a, B:79:0x0134, B:69:0x0103, B:9:0x001c), top: B:84:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:13:0x0036, B:14:0x0039, B:16:0x0046, B:18:0x004c, B:19:0x0050, B:21:0x0056, B:23:0x0068, B:37:0x0085, B:39:0x0094, B:43:0x009f, B:45:0x00b5, B:46:0x00b7, B:51:0x00c7, B:55:0x00d4, B:58:0x00de, B:61:0x00eb, B:62:0x00f3, B:66:0x00fc, B:75:0x011a, B:79:0x0134, B:69:0x0103, B:9:0x001c), top: B:84:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:13:0x0036, B:14:0x0039, B:16:0x0046, B:18:0x004c, B:19:0x0050, B:21:0x0056, B:23:0x0068, B:37:0x0085, B:39:0x0094, B:43:0x009f, B:45:0x00b5, B:46:0x00b7, B:51:0x00c7, B:55:0x00d4, B:58:0x00de, B:61:0x00eb, B:62:0x00f3, B:66:0x00fc, B:75:0x011a, B:79:0x0134, B:69:0x0103, B:9:0x001c), top: B:84:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011a A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:13:0x0036, B:14:0x0039, B:16:0x0046, B:18:0x004c, B:19:0x0050, B:21:0x0056, B:23:0x0068, B:37:0x0085, B:39:0x0094, B:43:0x009f, B:45:0x00b5, B:46:0x00b7, B:51:0x00c7, B:55:0x00d4, B:58:0x00de, B:61:0x00eb, B:62:0x00f3, B:66:0x00fc, B:75:0x011a, B:79:0x0134, B:69:0x0103, B:9:0x001c), top: B:84:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:19:0x0050->B:89:?, LOOP_END, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613000O2o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
