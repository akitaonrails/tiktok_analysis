package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$loopUpdateProgress$2", f = "SocialAvatarGenerator.kt", l = {110, 127}, m = "invokeSuspend")
public final class C0HKN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<EnumC439240HKg, Unit> LLILZIL;
    public final /* synthetic */ Function1<EnumC439250HKh, Unit> LLILZLL;
    public final /* synthetic */ Function2<EnumC439280HKk, C0HKO, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HKN(String str, Function1<? super EnumC439240HKg, Unit> function1, Function1<? super EnumC439250HKh, Unit> function12, Function2<? super EnumC439280HKk, ? super C0HKO, Unit> function2, InterfaceC1364105Vn<? super C0HKN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HKN c0hkn = new C0HKN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0hkn.LLILLL = obj;
        return c0hkn;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: 094W -> 0x0146, TryCatch #1 {094W -> 0x0146, blocks: (B:17:0x004e, B:18:0x0059, B:20:0x0062, B:22:0x0065, B:23:0x0074, B:25:0x007a, B:28:0x0088, B:32:0x008f, B:34:0x009c, B:37:0x00a1, B:50:0x00c2, B:51:0x00c5, B:53:0x00c9, B:54:0x00cd, B:59:0x00e1, B:60:0x00e6, B:48:0x00bc, B:49:0x00bf, B:40:0x00ae, B:61:0x00e7, B:73:0x0109, B:74:0x010b, B:76:0x0112, B:84:0x012a, B:85:0x012c, B:81:0x0121, B:82:0x0124, B:83:0x0127, B:70:0x0100, B:71:0x0103, B:72:0x0106, B:64:0x00ef, B:86:0x0131, B:88:0x0144, B:89:0x0145, B:19:0x005a), top: B:98:0x004e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131 A[Catch: 094W -> 0x0146, TryCatch #1 {094W -> 0x0146, blocks: (B:17:0x004e, B:18:0x0059, B:20:0x0062, B:22:0x0065, B:23:0x0074, B:25:0x007a, B:28:0x0088, B:32:0x008f, B:34:0x009c, B:37:0x00a1, B:50:0x00c2, B:51:0x00c5, B:53:0x00c9, B:54:0x00cd, B:59:0x00e1, B:60:0x00e6, B:48:0x00bc, B:49:0x00bf, B:40:0x00ae, B:61:0x00e7, B:73:0x0109, B:74:0x010b, B:76:0x0112, B:84:0x012a, B:85:0x012c, B:81:0x0121, B:82:0x0124, B:83:0x0127, B:70:0x0100, B:71:0x0103, B:72:0x0106, B:64:0x00ef, B:86:0x0131, B:88:0x0144, B:89:0x0145, B:19:0x005a), top: B:98:0x004e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00db -> B:15:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x012c -> B:15:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0131 -> B:15:0x004a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
