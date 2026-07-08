package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.preview.BulletinPreviewOGFetcher$fetchOgMeta$2", f = "BulletinPreviewOGFetcher.kt", l = {78, 88, 123}, m = "invokeSuspend")
public final class C844430XAr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0OT8>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844430XAr(String str, InterfaceC1364105Vn<? super C844430XAr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C844430XAr c844430XAr = new C844430XAr(this.LLILZLL, interfaceC1364105Vn);
        c844430XAr.LLILZIL = obj;
        return c844430XAr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Type inference failed for: r0v102, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v107, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C844430XAr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0OT8> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
