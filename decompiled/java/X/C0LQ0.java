package X;

import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$innerRestore$2", f = "DraftRestoreOp.kt", l = {190, 217, 226, 238, 247, 264, 276, 290, 312}, m = "invokeSuspend")
public final class C0LQ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ>, Object> {
    public DraftRestoreResult LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C542550LPp LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ ProgressDialogC1399790mWv LLILZLL;
    public final /* synthetic */ CreativeLoadingDialog LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LQ0(C542550LPp c542550LPp, CreativeLoadingDialog creativeLoadingDialog, ProgressDialogC1399790mWv progressDialogC1399790mWv, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c542550LPp;
        this.LLILZIL = str;
        this.LLILZLL = progressDialogC1399790mWv;
        this.LLIZ = creativeLoadingDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C542550LPp c542550LPp = this.LLILZ;
        String str = this.LLILZIL;
        return new C0LQ0(c542550LPp, this.LLIZ, this.LLILZLL, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0136 A[Catch: all -> 0x03cf, TRY_ENTER, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0208 A[Catch: all -> 0x03cf, TRY_ENTER, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b0 A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ea A[Catch: all -> 0x03cf, TRY_ENTER, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0353 A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b1 A[Catch: all -> 0x03cf, TryCatch #0 {all -> 0x03cf, blocks: (B:7:0x0021, B:13:0x007a, B:15:0x00a0, B:21:0x00ac, B:22:0x00bb, B:24:0x00fc, B:34:0x016d, B:28:0x0136, B:38:0x017f, B:40:0x0195, B:44:0x019e, B:46:0x01b1, B:47:0x01b7, B:64:0x026d, B:51:0x0208, B:53:0x0221, B:55:0x022d, B:56:0x022f, B:68:0x027f, B:70:0x02b0, B:83:0x0337, B:74:0x02ea, B:76:0x0312, B:77:0x0316, B:87:0x0349, B:89:0x0353, B:90:0x0357, B:97:0x03c6, B:91:0x03b1, B:12:0x0077, B:33:0x016a, B:37:0x017c, B:63:0x026a, B:67:0x027c, B:82:0x0334, B:86:0x0346, B:96:0x03c3), top: B:114:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b9  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v4, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.Map] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LQ0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
