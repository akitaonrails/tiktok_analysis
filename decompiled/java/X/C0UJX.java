package X;

import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment$collectCameraExposureParam$1", f = "LiveBroadcastPreviewFragment.kt", l = {3210, 3230}, m = "invokeSuspend")
public final class C0UJX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public C013C LLILLL;
    public int LLILZ;
    public final /* synthetic */ LiveBroadcastPreviewFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UJX(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, InterfaceC1364105Vn<? super C0UJX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = liveBroadcastPreviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UJX(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:72:0x018f, B:42:0x00e3], limit reached: 107 */
    /* JADX WARN: Path cross not found for [B:74:0x019d, B:76:0x01a1], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[LOOP:0: B:12:0x0039->B:110:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: Exception -> 0x01bc, TryCatch #2 {Exception -> 0x01bc, blocks: (B:18:0x004f, B:21:0x0056, B:23:0x005c, B:24:0x0060, B:26:0x0072, B:27:0x0079, B:33:0x009e, B:36:0x00a7, B:38:0x00c7, B:40:0x00dd, B:42:0x00e3), top: B:96:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: Exception -> 0x01bc, TryCatch #2 {Exception -> 0x01bc, blocks: (B:18:0x004f, B:21:0x0056, B:23:0x005c, B:24:0x0060, B:26:0x0072, B:27:0x0079, B:33:0x009e, B:36:0x00a7, B:38:0x00c7, B:40:0x00dd, B:42:0x00e3), top: B:96:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: Exception -> 0x01bc, TryCatch #2 {Exception -> 0x01bc, blocks: (B:18:0x004f, B:21:0x0056, B:23:0x005c, B:24:0x0060, B:26:0x0072, B:27:0x0079, B:33:0x009e, B:36:0x00a7, B:38:0x00c7, B:40:0x00dd, B:42:0x00e3), top: B:96:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c5 -> B:89:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0132 -> B:88:0x01bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x019f -> B:89:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01ae -> B:89:0x01c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UJX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
