package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.entity.PlayRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20377614oQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C20377014oK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20377614oQ(String str, long j, C20377014oK c20377014oK) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c20377014oK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20425514w9 c20425514w9;
        C20426114wF c20426114wF;
        C20424814w2 c20424814w2;
        C20361214lm c20361214lmLJIILJJIL;
        PlayRule playRule;
        C20361314ln c20361314lnLIZLLL;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigChangeSuccess, newJsonParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stateId=");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        C20377014oK c20377014oK = this.LLILLL;
        String str2 = this.LL;
        long j = this.LLILLJJLI;
        if (str2 == null) {
            c20377014oK.getClass();
        } else {
            if (c20377014oK.LIZJ == null) {
                C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", "getTempSymphonyEngineInstance");
                c20425514w9 = new C20425514w9(c20377014oK.LIZ);
                PlaybookContent playbookContent = c20377014oK.LJFF.LIZ.content;
                if (playbookContent == null || (str = playbookContent.flowStr) == null) {
                    str = "";
                }
                c20425514w9.LJIILJJIL(str);
            } else {
                c20425514w9 = null;
            }
            C20379114of c20379114of = c20377014oK.LJFF;
            C20425514w9 c20425514w92 = c20377014oK.LIZJ;
            if (c20425514w92 == null) {
                c20425514w92 = c20425514w9;
            }
            String strLIZ = C01EI.LIZ(130, "PLAYBOOK_UTIL");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateByStateParamsChange, symphonyEngineInstance=");
            sbLIZ2.append(c20425514w92);
            sbLIZ2.append(", newJsonParams=");
            sbLIZ2.append(str2);
            sbLIZ2.append(", stateId=");
            sbLIZ2.append(j);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            if (c20425514w92 != null && (c20426114wF = (C20426114wF) c20425514w92.LJIILIIL(true, null, "modifyTaskStateJsonParams", new C20425314w7(str2, j, c20425514w92))) != null) {
                String strLIZLLL = c20425514w92.LIZLLL(c20426114wF);
                PlaybookContent playbookContent2 = c20379114of.LIZ.content;
                if (playbookContent2 != null) {
                    playbookContent2.flowStr = strLIZLLL;
                }
                C20425114w5 c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(j), c20426114wF.LIZLLL);
                if (c20425114w5LIZIZ != null && (c20424814w2 = c20425114w5LIZIZ.LIZJ) != null && (c20361214lmLJIILJJIL = PlaybookUtilKt.LJIILJJIL(c20379114of, Long.valueOf(j))) != null && (playRule = c20361214lmLJIILJJIL.LIZLLL) != null && (c20361314lnLIZLLL = playRule.LIZLLL(c20424814w2, "")) != null) {
                    String strLIZ2 = C01EI.LIZ(140, "PLAYBOOK_UTIL");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateByStateParamsChange, playbookTask.update, newJsonParams=");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(", newUIConfig=");
                    sbLIZ3.append(c20361314lnLIZLLL);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                    c20361214lmLJIILJJIL.LIZIZ(str2);
                    c20361214lmLJIILJJIL.LIZJ = c20361314lnLIZLLL;
                }
            }
            if (c20425514w9 != null) {
                c20425514w9.LIZJ();
                c20425514w9.LIZIZ();
            }
            c20377014oK.LIZ(true);
        }
        return Unit.LIZ;
    }
}
