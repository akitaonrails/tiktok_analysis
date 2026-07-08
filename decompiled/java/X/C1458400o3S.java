package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.preload.PreEmbTaskManager$selectMedia$3", f = "PreEmbTaskManager.kt", l = {1358, 1373, 1385}, m = "invokeSuspend")
public final class C1458400o3S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1DEV LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1458730o3z LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ ShortVideoContext LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458400o3S(C1458730o3z c1458730o3z, boolean z, ShortVideoContext shortVideoContext, boolean z2, InterfaceC1364105Vn<? super C1458400o3S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1458730o3z;
        this.LLIZ = z;
        this.LLIZLLLIL = shortVideoContext;
        this.LLJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458400o3S(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3 A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #0 {all -> 0x0285, blocks: (B:66:0x0196, B:68:0x01a3, B:71:0x01ac, B:73:0x01b2, B:74:0x01b6, B:75:0x01bf, B:77:0x01c5, B:79:0x01d0, B:81:0x01d6), top: B:118:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac A[Catch: all -> 0x0285, TRY_ENTER, TryCatch #0 {all -> 0x0285, blocks: (B:66:0x0196, B:68:0x01a3, B:71:0x01ac, B:73:0x01b2, B:74:0x01b6, B:75:0x01bf, B:77:0x01c5, B:79:0x01d0, B:81:0x01d6), top: B:118:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a A[Catch: all -> 0x025d, TryCatch #2 {all -> 0x025d, blocks: (B:96:0x023d, B:98:0x024a, B:100:0x0253, B:102:0x0257), top: B:121:0x023d }] */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458400o3S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
