package X;

import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel$fetchData$1", f = "ComposerFilterViewModel.kt", l = {53, 58, 61, 64, 70, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 74, 77, 80}, m = "invokeSuspend")
public final class C761030TtF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ ComposerFilterViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761030TtF(ComposerFilterViewModel composerFilterViewModel, InterfaceC1364105Vn<? super C761030TtF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = composerFilterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761030TtF(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[Catch: Exception -> 0x011b, TRY_ENTER, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102 A[Catch: Exception -> 0x011b, TRY_ENTER, TryCatch #0 {Exception -> 0x011b, blocks: (B:6:0x001c, B:12:0x0039, B:14:0x004d, B:19:0x0066, B:21:0x006c, B:26:0x0080, B:28:0x008b, B:30:0x0093, B:37:0x00af, B:40:0x00b9, B:45:0x00cf, B:47:0x00d7, B:51:0x00ec, B:55:0x0102, B:18:0x0063, B:25:0x007d, B:36:0x00ac, B:44:0x00cc), top: B:67:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C761030TtF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
