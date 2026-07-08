package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.List;

/* JADX INFO: renamed from: X.0MKU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKU<T> implements InterfaceC346701Wf {
    public final /* synthetic */ InterfaceC346701Wf LL;
    public final /* synthetic */ List LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C0MMK LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    public C0MKU(InterfaceC346701Wf interfaceC346701Wf, List list, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Context context) {
        this.LL = interfaceC346701Wf;
        this.LLILLJJLI = list;
        this.LLILLL = creativeInfo;
        this.LLILZ = forwardMedia;
        this.LLILZIL = c0mmk;
        this.LLILZLL = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // X.InterfaceC346701Wf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r13, X.InterfaceC1364105Vn r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C0MKV
            if (r0 == 0) goto L86
            r4 = r14
            X.0MKV r4 = (X.C0MKV) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L8c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            X.01Wf r2 = r12.LL
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r0 = r12.LLILLJJLI
            java.util.List r1 = X.C13LP.LLIILII(r13, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r11.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r8 = r1.iterator()
        L43:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r8.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            X.0MKJ r7 = X.C0MKJ.LIZ
            java.lang.Object r6 = r0.getFirst()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.getSecond()
            com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader$DownloadConfig r0 = (com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadConfig) r0
            java.lang.String r1 = r0.fileName
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r12.LLILLL
            r7.getClass()
            java.lang.String r0 = X.C0MKJ.LJFF(r0, r6, r1)
            r11.add(r0)
            goto L43
        L6c:
            X.0MKF r6 = new X.0MKF
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r7 = r12.LLILLL
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r8 = r12.LLILZ
            X.0MMK r9 = r12.LLILZIL
            android.content.Context r0 = r12.LLILZLL
            kotlin.Pair r10 = X.C0MUO.LIZ(r0)
            r6.<init>(r7, r8, r9, r10, r11)
            r4.LLILLJJLI = r5
            java.lang.Object r0 = r2.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L86:
            X.0MKV r4 = new X.0MKV
            r4.<init>(r12, r14)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MKU.emit(java.lang.Object, X.05Vn):java.lang.Object");
    }
}
