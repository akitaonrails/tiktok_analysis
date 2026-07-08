package X;

import com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager$batchSendMediaMsgs$1$3$1$1", f = "MediaMsgSendManager.kt", l = {419, 425}, m = "invokeSuspend")
public final class C1407750mjl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC2249061D1c<?, ?> LLILLJJLI;
    public final /* synthetic */ IAlbumPreuploadManager LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, C1157680gEQ> LLILZLL;
    public final /* synthetic */ Map<String, C1157720gEU> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407750mjl(AbstractC2249061D1c<?, ?> abstractC2249061D1c, IAlbumPreuploadManager iAlbumPreuploadManager, String str, String str2, Map<String, C1157680gEQ> map, Map<String, C1157720gEU> map2, InterfaceC1364105Vn<? super C1407750mjl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC2249061D1c;
        this.LLILLL = iAlbumPreuploadManager;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
        this.LLIZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407750mjl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r2 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:33:0x0086, B:34:0x0089, B:36:0x008d, B:37:0x0091, B:39:0x0095, B:43:0x009b, B:44:0x009c, B:15:0x0047, B:16:0x004a, B:18:0x004e, B:19:0x0052, B:21:0x0056, B:25:0x005c, B:26:0x005d, B:10:0x0023, B:12:0x0029, B:27:0x005e, B:29:0x0062, B:38:0x0092, B:20:0x0053), top: B:53:0x0011, inners: #0, #1 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r2 = r17
            java.lang.String r0 = "MediaMsgSendManager@3ccc.batchSendMediaMsgs$1$3$1$1"
            X.C1C7U.LIZ(r0)
            java.lang.Object r1 = X.C099R.LJFF()
            r9 = r16
            int r0 = r9.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L20
            if (r0 == r3) goto L47
            if (r0 != r4) goto L18
            goto L86
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r2)
            X.1D1c<?, ?> r2 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> L9d
            boolean r0 = r2 instanceof X.C1DUR     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager r4 = r9.LLILLL     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r9.LLILZ     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = r9.LLILZIL     // Catch: java.lang.Throwable -> L9d
            X.0mjm r0 = X.C1407760mjm.LIZ     // Catch: java.lang.Throwable -> L9d
            r0.getClass()     // Catch: java.lang.Throwable -> L9d
            X.01GW r0 = X.C1407760mjm.LIZJ     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L9d
            com.ss.android.ugc.aweme.exp.DMAlbumPreuploadSettingsConfig r0 = (com.ss.android.ugc.aweme.exp.DMAlbumPreuploadSettingsConfig) r0     // Catch: java.lang.Throwable -> L9d
            long r6 = r0.awaitTimeoutMs     // Catch: java.lang.Throwable -> L9d
            r9.LL = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r4.LIZIZ(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L9d
            if (r2 != r1) goto L4a
            goto L80
        L47:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L9d
        L4a:
            X.0gEQ r2 = (X.C1157680gEQ) r2     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto Lb6
            java.util.Map<java.lang.String, X.0gEQ> r1 = r9.LLILZLL     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r9.LLILZIL     // Catch: java.lang.Throwable -> L9d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9d
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            goto Lb6
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L5e:
            boolean r0 = r2 instanceof X.C1DUQ     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto Lb6
            com.ss.android.ugc.aweme.creation.publish.album.IAlbumPreuploadManager r10 = r9.LLILLL     // Catch: java.lang.Throwable -> L9d
            java.lang.String r11 = r9.LLILZ     // Catch: java.lang.Throwable -> L9d
            java.lang.String r14 = r9.LLILZIL     // Catch: java.lang.Throwable -> L9d
            X.0mjm r0 = X.C1407760mjm.LIZ     // Catch: java.lang.Throwable -> L9d
            r0.getClass()     // Catch: java.lang.Throwable -> L9d
            X.01GW r0 = X.C1407760mjm.LIZJ     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L9d
            com.ss.android.ugc.aweme.exp.DMAlbumPreuploadSettingsConfig r0 = (com.ss.android.ugc.aweme.exp.DMAlbumPreuploadSettingsConfig) r0     // Catch: java.lang.Throwable -> L9d
            long r12 = r0.awaitTimeoutMs     // Catch: java.lang.Throwable -> L9d
            r9.LL = r4     // Catch: java.lang.Throwable -> L9d
            r15 = r9
            java.lang.Object r2 = r10.LJII(r11, r12, r14, r15)     // Catch: java.lang.Throwable -> L9d
            if (r2 != r1) goto L89
        L80:
            java.lang.String r0 = "MediaMsgSendManager@3ccc.batchSendMediaMsgs$1$3$1$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L86:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L9d
        L89:
            X.0gEU r2 = (X.C1157720gEU) r2     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto Lb6
            java.util.Map<java.lang.String, X.0gEU> r1 = r9.LLIZ     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r9.LLILZIL     // Catch: java.lang.Throwable -> L9d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9d
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            goto Lb6
        L97:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.String r2 = "MediaMsgSendManager"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "preupload await error: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0YS1.LIZ(r2, r0)
        Lb6:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "MediaMsgSendManager@3ccc.batchSendMediaMsgs$1$3$1$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407750mjl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
