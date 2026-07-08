package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$resizeImages$1", f = "VideoImageMixedController.kt", l = {3175, 3207}, m = "invokeSuspend")
public final class C504501xr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ArrayList<TikTokMediaModel> LLILLL;
    public final /* synthetic */ VideoImageMixedController LLILZ;
    public final /* synthetic */ List<TikTokMediaModel> LLILZIL;
    public final /* synthetic */ Function1<ArrayList<TikTokMediaModel>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C504501xr(ArrayList<TikTokMediaModel> arrayList, VideoImageMixedController videoImageMixedController, List<TikTokMediaModel> list, Function1<? super ArrayList<TikTokMediaModel>, Unit> function1, InterfaceC1364105Vn<? super C504501xr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = arrayList;
        this.LLILZ = videoImageMixedController;
        this.LLILZIL = list;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C504501xr c504501xr = new C504501xr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c504501xr.LLILLJJLI = obj;
        return c504501xr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1 A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:16:0x0051, B:17:0x005c, B:19:0x0062, B:21:0x006a, B:23:0x0072, B:25:0x007a, B:27:0x0087, B:29:0x0092, B:32:0x0099, B:34:0x009f, B:40:0x00a8, B:43:0x00b7, B:51:0x00ce, B:52:0x00d0, B:54:0x00d4, B:60:0x00de, B:62:0x00e4, B:68:0x00ed, B:71:0x00ff, B:77:0x0108, B:79:0x0117, B:78:0x010b, B:69:0x00f1, B:50:0x00c1, B:41:0x00ab), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124 A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #0 {all -> 0x0192, blocks: (B:85:0x0131, B:86:0x0136, B:82:0x0124, B:84:0x012f, B:87:0x015a, B:95:0x018d, B:96:0x0191), top: B:105:0x0131 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C504501xr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
