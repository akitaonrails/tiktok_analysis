package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback;
import com.bytedance.retrofit2.mime.TypedInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183201AcQ extends C09AY implements Function1<C926820aE4<TypedInput>, Unit> {
    public final /* synthetic */ LinkMicResponseCallback LL;
    public final /* synthetic */ C2183221AcS LLILLJJLI;
    public final /* synthetic */ C2183171AcN LLILLL;
    public final /* synthetic */ C2183211AcR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183201AcQ(LinkMicResponseCallback linkMicResponseCallback, C2183221AcS c2183221AcS, C2183171AcN c2183171AcN, C2183211AcR c2183211AcR) {
        super(1);
        this.LL = linkMicResponseCallback;
        this.LLILLJJLI = c2183221AcS;
        this.LLILLL = c2183171AcN;
        this.LLILZ = c2183211AcR;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.jvm.functions.Function1
    public final kotlin.Unit invoke(X.C926820aE4<com.bytedance.retrofit2.mime.TypedInput> r9) {
        /*
            r8 = this;
            X.0aE4 r9 = (X.C926820aE4) r9
            X.1AcS r5 = r8.LLILLJJLI
            X.1AcN r4 = r8.LLILLL
            X.1AcR r2 = r8.LLILZ
            r3 = 0
            R extends com.bytedance.android.livesdk.model.Extra r7 = r9.extra     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L42
            r6.<init>()     // Catch: java.lang.Throwable -> L42
            boolean r0 = r7.hasMore     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "has_more"
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L42
            long r0 = r7.now     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "now"
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L42
            r5.LIZLLL = r6     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> L42
            r5.LIZJ = r0     // Catch: java.lang.Throwable -> L42
            X.1AcT r1 = new X.1AcT     // Catch: java.lang.Throwable -> L42
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L42
            X.1AcP r0 = new X.1AcP     // Catch: java.lang.Throwable -> L42
            r0.<init>(r4, r2, r5, r9)     // Catch: java.lang.Throwable -> L42
            X.C188600o0.LIZ(r9, r3, r1, r0)     // Catch: java.lang.Throwable -> L42
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L42
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L42
            goto L4e
        L42:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback r2 = r8.LL
            X.1AcS r0 = r8.LLILLJJLI
            r2.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5b
            X.C1306420k6K.LIZ(r2, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            r3 = r1
            goto L64
        L63:
            r0 = move-exception
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            X.C1306420k6K.LIZ(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183201AcQ.invoke(java.lang.Object):java.lang.Object");
    }
}
