package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService$queryStateWithPolling$1", f = "NetworkBackedBatchSocialAvatarService.kt", l = {210, 224, 237}, m = "invokeSuspend")
public final class C1341005Mq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public InterfaceC332260D0u LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ Map<Integer, List<String>> LLJ;
    public final /* synthetic */ NetworkBackedBatchSocialAvatarService LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341005Mq(Map<Integer, List<String>> map, NetworkBackedBatchSocialAvatarService networkBackedBatchSocialAvatarService, InterfaceC1364105Vn<? super C1341005Mq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = map;
        this.LLJI = networkBackedBatchSocialAvatarService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1341005Mq(this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r9 == 0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:16:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0158 -> B:8:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341005Mq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
