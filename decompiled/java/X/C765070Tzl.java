package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$fetchSongList$2", f = "KaraokeViewModel.kt", l = {988, 991, 996, 999, 1001, 1003, 1009, 1015, 1022}, m = "invokeSuspend")
public final class C765070Tzl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C765690U1v LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ KaraokeViewModel LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765070Tzl(boolean z, KaraokeViewModel karaokeViewModel, long j, boolean z2, InterfaceC1364105Vn<? super C765070Tzl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = karaokeViewModel;
        this.LLILZIL = j;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765070Tzl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153 A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #0 {all -> 0x01fa, blocks: (B:54:0x00f0, B:55:0x00f3, B:57:0x00f7, B:62:0x0100, B:63:0x0102, B:65:0x0111, B:77:0x0139, B:79:0x013d, B:107:0x01ec, B:83:0x0153, B:85:0x015b, B:89:0x0171, B:91:0x0177, B:93:0x0181, B:98:0x01b8, B:100:0x01ce, B:102:0x01d2, B:68:0x011c, B:71:0x0127, B:72:0x012c, B:39:0x00a9, B:40:0x00ac, B:42:0x00b0, B:45:0x00b6, B:48:0x00c8, B:50:0x00d8, B:30:0x007e, B:31:0x0081, B:33:0x008d, B:35:0x0091, B:10:0x002b, B:12:0x002f, B:13:0x003c, B:15:0x0048, B:17:0x004c, B:22:0x0059, B:24:0x0063, B:26:0x0069, B:76:0x0136, B:97:0x01b5, B:106:0x01e9), top: B:116:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C765070Tzl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
