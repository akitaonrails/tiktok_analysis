package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$uploadAndSaveAvatars$1", f = "SocialAvatarTaskHandler.kt", l = {100, 112}, m = "invokeSuspend")
public final class C0HDO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C436960HBm LLILZ;
    public final /* synthetic */ C0HFS LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ C0HDQ LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDO(C436960HBm c436960HBm, C0HFS c0hfs, boolean z, boolean z2, long j, int i, boolean z3, boolean z4, C0HDQ c0hdq, InterfaceC1364105Vn<? super C0HDO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c436960HBm;
        this.LLILZIL = c0hfs;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = j;
        this.LLJ = i;
        this.LLJI = z3;
        this.LLJIJIL = z4;
        this.LLJILJIL = c0hdq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDO(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0123 A[Catch: CancellationException -> 0x0172, 0HDR -> 0x0180, all -> 0x01ce, TryCatch #3 {0HDR -> 0x0180, CancellationException -> 0x0172, blocks: (B:34:0x0111, B:35:0x0114, B:37:0x0123, B:38:0x013c, B:40:0x0142, B:20:0x0079, B:21:0x007c, B:23:0x00a0, B:25:0x00a4, B:27:0x00ae, B:30:0x00b8, B:41:0x015c, B:42:0x0171, B:11:0x002e, B:13:0x003f, B:16:0x0048), top: B:53:0x0014, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142 A[Catch: CancellationException -> 0x0172, 0HDR -> 0x0180, all -> 0x01ce, TryCatch #3 {0HDR -> 0x0180, CancellationException -> 0x0172, blocks: (B:34:0x0111, B:35:0x0114, B:37:0x0123, B:38:0x013c, B:40:0x0142, B:20:0x0079, B:21:0x007c, B:23:0x00a0, B:25:0x00a4, B:27:0x00ae, B:30:0x00b8, B:41:0x015c, B:42:0x0171, B:11:0x002e, B:13:0x003f, B:16:0x0048), top: B:53:0x0014, outer: #1 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HDO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
