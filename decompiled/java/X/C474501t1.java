package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.utils.BitmapProcessor$processBitmap$2", f = "BitmapProcessor.kt", l = {}, m = "invokeSuspend")
public final class C474501t1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474501t1(Context context, Bitmap bitmap, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474501t1(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends String>> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<? super C189200o6<String>>) interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x005a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "BitmapProcessor@bbbb.processBitmap$2"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.0VSJ r2 = new X.0VSJ     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            android.content.Context r0 = r7.LL     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.io.File r1 = X.C786410Ut5.w2(r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.String r0 = "temp_cover"
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            boolean r0 = r2.exists()     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            if (r0 != 0) goto L21
            r2.mkdirs()     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
        L21:
            X.0VSJ r5 = new X.0VSJ     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.String r0 = r7.LLILLJJLI     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            r1.append(r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.String r0 = ".png"
            r1.append(r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            r5.<init>(r2, r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            X.0VSV r4 = new X.0VSV     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            r4.<init>(r5)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            android.graphics.Bitmap r3 = r7.LLILLL     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L52
            r0 = 100
            r3.compress(r1, r0, r4)     // Catch: java.lang.Throwable -> L52
            X.C2107108Nh.LIZ(r4, r2)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            goto L7b
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5a
            throw r1     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            r2 = r1
            goto L5b
        L5a:
            r0 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5a
            X.C2107108Nh.LIZ(r4, r2)     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
            throw r0     // Catch: java.io.IOException -> L62 java.lang.NullPointerException -> L6f
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L7b
        L6f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7b:
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474501t1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
