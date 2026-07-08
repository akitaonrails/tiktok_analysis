package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20426514wJ extends C09AY implements Function1<SymphonyEngine, C20426214wG> {
    public final /* synthetic */ List<Long> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C20425214w6 LLILLL;
    public final /* synthetic */ C20425514w9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20426514wJ(List<Long> list, long j, C20425214w6 c20425214w6, C20425514w9 c20425514w9) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = c20425214w6;
        this.LLILZ = c20425514w9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426214wG invoke(com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine r6) {
        /*
            r5 = this;
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine r6 = (com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine) r6
            java.util.List<java.lang.Long> r3 = r5.LL
            long r1 = r5.LLILLJJLI
            X.14w6 r0 = r5.LLILLL
            X.14wN r4 = r6.LJIILL(r3, r1, r0)
            X.14wP r0 = r4.LIZ
            if (r0 == 0) goto L37
            boolean r1 = X.C20427014wO.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L37
        L17:
            java.lang.String r3 = "SymphonyEngineInstance"
            if (r0 == 0) goto L39
            X.14wG r2 = r4.LIZIZ
            X.14w9 r0 = r5.LLILZ
            r0.LIZLLL = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "insertState, success, newRootFlow="
            r1.append(r0)
            X.14wG r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            return r2
        L37:
            r0 = 0
            goto L17
        L39:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "insertState, error="
            r1.append(r0)
            X.14wP r0 = r4.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20426514wJ.invoke(java.lang.Object):java.lang.Object");
    }
}
