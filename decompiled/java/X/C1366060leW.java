package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0leW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.data.loader.ShareSortedListManager$request$2", f = "ShareSortedListManager.kt", l = {398, 422}, m = "invokeSuspend")
public final class C1366060leW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public InterfaceC1366080leY LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1366080leY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366060leW(String str, int i, InterfaceC1366080leY interfaceC1366080leY, InterfaceC1364105Vn<? super C1366060leW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1366080leY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1366060leW(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014f A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169 A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198 A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7 A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5 A[Catch: all -> 0x01fe, TryCatch #1 {all -> 0x01fe, blocks: (B:59:0x013f, B:60:0x0142, B:62:0x014f, B:65:0x015b, B:67:0x0161, B:71:0x0198, B:72:0x019b, B:73:0x01a8, B:75:0x01ae, B:80:0x01c4, B:81:0x01c8, B:82:0x01d1, B:84:0x01d7, B:86:0x01e1, B:87:0x01e5, B:89:0x01f5, B:90:0x01fa, B:69:0x0169, B:21:0x0065, B:22:0x0068, B:24:0x0071, B:25:0x0076, B:27:0x007a, B:28:0x007f, B:34:0x008e, B:35:0x0093, B:36:0x00a5, B:38:0x00ad, B:40:0x00b6, B:41:0x00b8, B:42:0x00ed, B:55:0x012d, B:54:0x0122, B:17:0x0053, B:44:0x00f1, B:46:0x00fb, B:51:0x0104, B:52:0x011d), top: B:97:0x0011, inners: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366060leW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
