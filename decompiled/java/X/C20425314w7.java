package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425314w7 extends C09AY implements Function1<SymphonyEngine, C20426114wF> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C20425514w9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20425314w7(String str, long j, C20425514w9 c20425514w9) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c20425514w9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20426114wF invoke(SymphonyEngine symphonyEngine) {
        List<C20425214w6> list;
        C20425214w6 next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modifyTaskStateJsonParams, jsonParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stateId=");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LIZIZ("SymphonyEngineInstance", C2188811AlT.LIZIZ(sbLIZ));
        C20426214wG c20426214wG = this.LLILLL.LIZLLL;
        if (c20426214wG != null && (list = c20426214wG.LIZLLL) != null) {
            Long lValueOf = Long.valueOf(this.LLILLJJLI);
            Iterator<C20425214w6> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    long j = next.LIZ;
                    if (lValueOf != null && j == lValueOf.longValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C20425214w6 c20425214w6 = next;
            if (c20425214w6 != null) {
                String str = this.LL;
                C20425514w9 c20425514w9 = this.LLILLL;
                if (Intrinsics.LJFF(c20425214w6.LIZIZ, "Task")) {
                    C20425014w4 c20425014w4 = c20425214w6.LIZJ;
                    if (c20425014w4 != null) {
                        c20425014w4.LJII = str;
                    }
                    C20426114wF c20426114wFLJII = c20425514w9.LJII(new C20425114w5(c20425214w6));
                    if (c20426114wFLJII != null) {
                        c20425514w9.LIZLLL = C20425414w8.LIZ(c20426114wFLJII);
                        return c20426114wFLJII;
                    }
                } else {
                    C20441214yg.LIZIZ("SymphonyEngineInstance", "modifyTaskStateJsonParams, stateType not taskType");
                }
            }
        }
        C20441214yg.LIZIZ("SymphonyEngineInstance", "modifyTaskStateJsonParams, state is null");
        return null;
    }
}
