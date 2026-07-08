package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarStickerAnimationStatusDataSource$triggerPolling$1", f = "SocialAvatarStickerAnimationStatusDataSource.kt", l = {93, 95}, m = "invokeSuspend")
public final class C442710HXp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C442720HXq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442710HXp(C442720HXq c442720HXq, InterfaceC1364105Vn<? super C442710HXp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c442720HXq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C442710HXp c442710HXp = new C442710HXp(this.LLILLL, interfaceC1364105Vn);
        c442710HXp.LLILLJJLI = obj;
        return c442710HXp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:31:0x00d2, B:33:0x00d6, B:18:0x0072, B:20:0x0078, B:22:0x008f, B:25:0x00b8, B:28:0x00c3, B:69:0x017b, B:34:0x00e4, B:36:0x00ef, B:37:0x00fb, B:39:0x0101, B:62:0x013a, B:57:0x012e, B:42:0x0108, B:43:0x010c, B:45:0x0112, B:47:0x011c), top: B:76:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:31:0x00d2, B:33:0x00d6, B:18:0x0072, B:20:0x0078, B:22:0x008f, B:25:0x00b8, B:28:0x00c3, B:69:0x017b, B:34:0x00e4, B:36:0x00ef, B:37:0x00fb, B:39:0x0101, B:62:0x013a, B:57:0x012e, B:42:0x0108, B:43:0x010c, B:45:0x0112, B:47:0x011c), top: B:76:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:31:0x00d2, B:33:0x00d6, B:18:0x0072, B:20:0x0078, B:22:0x008f, B:25:0x00b8, B:28:0x00c3, B:69:0x017b, B:34:0x00e4, B:36:0x00ef, B:37:0x00fb, B:39:0x0101, B:62:0x013a, B:57:0x012e, B:42:0x0108, B:43:0x010c, B:45:0x0112, B:47:0x011c), top: B:76:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d6 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x012e -> B:18:0x0072). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C442710HXp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
