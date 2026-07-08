package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.openplatform.CreatePublicGroupPreCheckHelper$processPublicGroupCreation$1", f = "CreatePublicGroupPreCheckHelper.kt", l = {119, 121, 181, 136, 181, 181, 181, 181}, m = "invokeSuspend")
public final class C1228510i4f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1228470i4b LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ DialogC1389620mGW LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228510i4f(C1228470i4b c1228470i4b, Context context, String str, String str2, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C1228510i4f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1228470i4b;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228510i4f(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ac A[Catch: Exception -> 0x01ec, all -> 0x0211, TryCatch #1 {Exception -> 0x01ec, blocks: (B:7:0x001c, B:12:0x0033, B:14:0x0039, B:20:0x0043, B:25:0x005e, B:33:0x0082, B:35:0x008e, B:41:0x00a0, B:42:0x00ab, B:44:0x00b1, B:46:0x00bc, B:47:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00e1, B:60:0x00f7, B:64:0x00ff, B:69:0x011a, B:77:0x013f, B:80:0x014f, B:82:0x0153, B:83:0x0157, B:85:0x015d, B:94:0x0173, B:95:0x0175, B:98:0x0188, B:101:0x018e, B:115:0x01ac, B:116:0x01c1, B:102:0x0191, B:104:0x0197, B:107:0x019e, B:11:0x0030, B:24:0x005b, B:68:0x0117), top: B:138:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c1 A[Catch: Exception -> 0x01ec, all -> 0x0211, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ec, blocks: (B:7:0x001c, B:12:0x0033, B:14:0x0039, B:20:0x0043, B:25:0x005e, B:33:0x0082, B:35:0x008e, B:41:0x00a0, B:42:0x00ab, B:44:0x00b1, B:46:0x00bc, B:47:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00e1, B:60:0x00f7, B:64:0x00ff, B:69:0x011a, B:77:0x013f, B:80:0x014f, B:82:0x0153, B:83:0x0157, B:85:0x015d, B:94:0x0173, B:95:0x0175, B:98:0x0188, B:101:0x018e, B:115:0x01ac, B:116:0x01c1, B:102:0x0191, B:104:0x0197, B:107:0x019e, B:11:0x0030, B:24:0x005b, B:68:0x0117), top: B:138:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: Exception -> 0x01ec, all -> 0x0211, TryCatch #1 {Exception -> 0x01ec, blocks: (B:7:0x001c, B:12:0x0033, B:14:0x0039, B:20:0x0043, B:25:0x005e, B:33:0x0082, B:35:0x008e, B:41:0x00a0, B:42:0x00ab, B:44:0x00b1, B:46:0x00bc, B:47:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00e1, B:60:0x00f7, B:64:0x00ff, B:69:0x011a, B:77:0x013f, B:80:0x014f, B:82:0x0153, B:83:0x0157, B:85:0x015d, B:94:0x0173, B:95:0x0175, B:98:0x0188, B:101:0x018e, B:115:0x01ac, B:116:0x01c1, B:102:0x0191, B:104:0x0197, B:107:0x019e, B:11:0x0030, B:24:0x005b, B:68:0x0117), top: B:138:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: Exception -> 0x01ec, all -> 0x0211, TRY_ENTER, TryCatch #1 {Exception -> 0x01ec, blocks: (B:7:0x001c, B:12:0x0033, B:14:0x0039, B:20:0x0043, B:25:0x005e, B:33:0x0082, B:35:0x008e, B:41:0x00a0, B:42:0x00ab, B:44:0x00b1, B:46:0x00bc, B:47:0x00c0, B:48:0x00c6, B:50:0x00cc, B:52:0x00e1, B:60:0x00f7, B:64:0x00ff, B:69:0x011a, B:77:0x013f, B:80:0x014f, B:82:0x0153, B:83:0x0157, B:85:0x015d, B:94:0x0173, B:95:0x0175, B:98:0x0188, B:101:0x018e, B:115:0x01ac, B:116:0x01c1, B:102:0x0191, B:104:0x0197, B:107:0x019e, B:11:0x0030, B:24:0x005b, B:68:0x0117), top: B:138:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1228510i4f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
