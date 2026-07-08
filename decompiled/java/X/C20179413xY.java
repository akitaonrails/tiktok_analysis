package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13xY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.SmartCoverStrategy$extract$2$1$onGeneratorBitmap$scoringJob$1", f = "SmartCoverStrategy.kt", l = {66, 69, 232, 84, 255, 106}, m = "invokeSuspend")
public final class C20179413xY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public double LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Bitmap LLJ;
    public final /* synthetic */ C2292908yd LLJI;
    public final /* synthetic */ InterfaceC383701eN LLJIJIL;
    public final /* synthetic */ AtomicInteger LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ C1457070o1J LLJILLL;
    public final /* synthetic */ C05XL<Bitmap> LLJJ;
    public final /* synthetic */ int LLJJI;
    public final /* synthetic */ List<C20180613xk> LLJJIII;
    public final /* synthetic */ int LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20179413xY(String str, Bitmap bitmap, C2292908yd c2292908yd, InterfaceC383701eN interfaceC383701eN, AtomicInteger atomicInteger, int i, C1457070o1J c1457070o1J, C05XL<Bitmap> c05xl, int i2, List<C20180613xk> list, int i3, InterfaceC1364105Vn<? super C20179413xY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = str;
        this.LLJ = bitmap;
        this.LLJI = c2292908yd;
        this.LLJIJIL = interfaceC383701eN;
        this.LLJILJIL = atomicInteger;
        this.LLJILJILJ = i;
        this.LLJILLL = c1457070o1J;
        this.LLJJ = c05xl;
        this.LLJJI = i2;
        this.LLJJIII = list;
        this.LLJJIJI = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20179413xY(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:7:0x0020, B:72:0x017e, B:74:0x0183, B:76:0x0187, B:78:0x018d, B:79:0x01a0, B:80:0x01be, B:83:0x01c3, B:84:0x01c6, B:54:0x0126, B:56:0x0133, B:87:0x01cb, B:88:0x01ce, B:13:0x0043, B:26:0x007c, B:27:0x007f, B:29:0x0083, B:30:0x0087, B:16:0x004f, B:21:0x0065, B:20:0x0062, B:60:0x014a, B:71:0x017c, B:63:0x0156, B:65:0x0160, B:66:0x0165, B:69:0x0176), top: B:100:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:86:0x01c8, B:35:0x00ac, B:37:0x00bb, B:48:0x00ff, B:50:0x0103, B:40:0x00c9, B:42:0x00d1, B:43:0x00e0, B:46:0x00fb), top: B:100:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:7:0x0020, B:72:0x017e, B:74:0x0183, B:76:0x0187, B:78:0x018d, B:79:0x01a0, B:80:0x01be, B:83:0x01c3, B:84:0x01c6, B:54:0x0126, B:56:0x0133, B:87:0x01cb, B:88:0x01ce, B:13:0x0043, B:26:0x007c, B:27:0x007f, B:29:0x0083, B:30:0x0087, B:16:0x004f, B:21:0x0065, B:20:0x0062, B:60:0x014a, B:71:0x017c, B:63:0x0156, B:65:0x0160, B:66:0x0165, B:69:0x0176), top: B:100:0x000d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:60:0x014a, B:71:0x017c, B:63:0x0156, B:65:0x0160, B:66:0x0165, B:69:0x0176), top: B:103:0x014a, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179413xY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
