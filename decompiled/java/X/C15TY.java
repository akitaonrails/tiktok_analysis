package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS77S0100100_31;
import njp.a;

/* JADX INFO: renamed from: X.15TY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.lynx.ExploreLynxExploreInsertController$onExploreUgCardShow$1", f = "ExploreLynxExploreInsertController.kt", l = {213, 218}, m = "invokeSuspend")
public final class C15TY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AwS77S0100100_31 LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1178204jE LLILZLL;
    public final /* synthetic */ Set<String> LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ C05XL<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15TY(boolean z, long j, String str, C1178204jE c1178204jE, Set<String> set, List<String> list, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C15TY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = c1178204jE;
        this.LLIZ = set;
        this.LLIZLLLIL = list;
        this.LLJ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15TY(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134 A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0153 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:29:0x0097, B:31:0x009f, B:35:0x00a8, B:36:0x00b3, B:38:0x00bd, B:40:0x00c3, B:42:0x00c7, B:51:0x00d8, B:53:0x00e3, B:55:0x00e7, B:61:0x00f3, B:62:0x00f5, B:63:0x00fc, B:65:0x0103, B:67:0x0107, B:73:0x0113, B:75:0x011f, B:77:0x0123, B:86:0x0134, B:87:0x0147, B:88:0x0153, B:64:0x0101, B:21:0x0068, B:25:0x007e), top: B:112:0x0019 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15TY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
