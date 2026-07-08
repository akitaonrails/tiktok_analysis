package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.ImageModeStrategy$extract$2", f = "ImageModeStrategy.kt", l = {27}, m = "invokeSuspend")
public final class C20177313xD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20177213xC LLILLL;
    public final /* synthetic */ C1457070o1J LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20177313xD(C20177213xC c20177213xC, C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super C20177313xD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20177213xC;
        this.LLILZ = c1457070o1J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20177313xD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:13:0x0040, B:14:0x0043, B:16:0x0048, B:18:0x005a, B:34:0x00c2, B:36:0x00c8, B:39:0x00cd, B:42:0x00d8, B:43:0x00df, B:26:0x008f, B:29:0x0097, B:31:0x00ac, B:44:0x00e0, B:45:0x00e7, B:46:0x00e8, B:47:0x00ef), top: B:55:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:13:0x0040, B:14:0x0043, B:16:0x0048, B:18:0x005a, B:34:0x00c2, B:36:0x00c8, B:39:0x00cd, B:42:0x00d8, B:43:0x00df, B:26:0x008f, B:29:0x0097, B:31:0x00ac, B:44:0x00e0, B:45:0x00e7, B:46:0x00e8, B:47:0x00ef), top: B:55:0x0040 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws X.C20176113x1 {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20177313xD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
