package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Og6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$updateTask$preloadHandler$1$1", f = "OfflineModeManager.kt", l = {721, 728, 732, 742, 744, 745}, m = "invokeSuspend")
public final class C625480Og6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ List<Aweme> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625480Og6(Aweme aweme, List<Aweme> list, InterfaceC1364105Vn<? super C625480Og6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = aweme;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625480Og6(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[Catch: Exception -> 0x02cc, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: Exception -> 0x02cc, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b A[Catch: Exception -> 0x02cc, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4 A[Catch: Exception -> 0x02cc, LOOP:1: B:59:0x01ce->B:61:0x01d4, LOOP_END, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0238 A[Catch: Exception -> 0x02cc, LOOP:2: B:69:0x0232->B:71:0x0238, LOOP_END, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0299 A[Catch: Exception -> 0x02cc, LOOP:3: B:79:0x0293->B:81:0x0299, LOOP_END, TryCatch #0 {Exception -> 0x02cc, blocks: (B:7:0x001f, B:12:0x0033, B:14:0x0048, B:22:0x0055, B:24:0x0059, B:35:0x00c5, B:37:0x00cd, B:43:0x00f7, B:45:0x0117, B:46:0x011e, B:48:0x012b, B:49:0x0146, B:51:0x014c, B:52:0x015a, B:58:0x0198, B:59:0x01ce, B:61:0x01d4, B:62:0x01e2, B:68:0x0223, B:69:0x0232, B:71:0x0238, B:72:0x0246, B:78:0x0284, B:79:0x0293, B:81:0x0299, B:82:0x02a7, B:29:0x0077, B:32:0x008d, B:11:0x0030, B:34:0x00c2, B:42:0x00f4, B:57:0x0195, B:67:0x0220, B:77:0x0281), top: B:87:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625480Og6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
