package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS231S0300000_22;

/* JADX INFO: renamed from: X.0mq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411710mq9 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ Function1<EnumC1411090mp9, Unit> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1411690mq7 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ Function1<RecommendDescResponse, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411710mq9(AwS231S0300000_22 awS231S0300000_22, long j, C1411690mq7 c1411690mq7, String str, String str2, VideoPublishEditModel videoPublishEditModel, String str3, List list, Function1 function1) {
        super(1);
        this.LL = awS231S0300000_22;
        this.LLILLJJLI = j;
        this.LLILLL = c1411690mq7;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = str3;
        this.LLIZLLLIL = list;
        this.LLJ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        boolean z;
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip upload_task error uri is empty");
            C1403010mc7.LIZ.getMusicService().dl();
            C1458410o3T.LJIIJJI(true);
            this.LL.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
            C1411690mq7 c1411690mq7 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            c1411690mq7.getClass();
            String strLIZIZ = C1411690mq7.LIZIZ(str3, str4);
            C1411690mq7 c1411690mq72 = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
            c1411690mq72.getClass();
            C0F7L.LIZ.getClass();
            String strLIZ = C0F7L.LIZ(videoPublishEditModel).LIZ();
            String strSubstring = strLIZ.substring(0, Math.min(strLIZ.length(), 400));
            String strLIZIZ2 = this.LLIZ;
            if (strLIZIZ2 == null) {
                C1411690mq7 c1411690mq73 = this.LLILLL;
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_copy_writing_prompt_type", true);
                c1411690mq73.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"prompt_type\":");
                sbLIZ.append(iLJIJ);
                sbLIZ.append('}');
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            RecommendDescRequestBody recommendDescRequestBody = new RecommendDescRequestBody(str2, strLIZIZ, strSubstring, strLIZIZ2, "", true);
            C1411690mq7 c1411690mq74 = this.LLILLL;
            c1411690mq74.LIZIZ = this.LLIZLLLIL;
            c1411690mq74.LIZ = recommendDescRequestBody;
            c1411690mq74.LJI(this.LLILZLL);
            C1411720mqA c1411720mqA = new C1411720mqA();
            final VideoPublishEditModel videoPublishEditModel2 = this.LLILZLL;
            final Function1<RecommendDescResponse, Unit> function1 = this.LLJ;
            final Function1<EnumC1411090mp9, Unit> function12 = this.LL;
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            final int length = recommendDescRequestBody.texts.length() + recommendDescRequestBody.description.length();
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip request photo_text_description/generate start");
            this.LLILLL.LIZJ.LIZ(((InterfaceC1411770mqF) c1411720mqA.LIZ.getValue()).LIZIZ(recommendDescRequestBody).LJLJI(30000 - jCurrentTimeMillis, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0mpy
                /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.String r3 = "RecommendDescApi@bf84.generateRecommendDesc$1"
                        X.C1C7U.LIZ(r3)
                        com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse r14 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse) r14
                        java.util.List<java.lang.String> r0 = r14.generatedDescriptions
                        if (r0 == 0) goto L99
                        boolean r0 = r0.isEmpty()
                        r1 = 1
                        r0 = r0 ^ 1
                        if (r0 != r1) goto L99
                    L14:
                        java.lang.String r2 = "ai_tip"
                        if (r1 != 0) goto L67
                        com.ss.android.ugc.gamora.editor.sticker.inspiration.api.GeneratedTitlesAndSuggestions r0 = r14.generatedTitlesAndSuggestions
                        if (r0 != 0) goto L67
                        X.1Ds4 r0 = X.C0CHQ.LIZ()
                        X.0nYH r0 = r0.getPublishService()
                        X.0nVl r1 = r0.LJJLIIIJ()
                        java.lang.String r0 = "ai_tip request photo_text_description/generate error no data return"
                        r1.LIZ(r2, r0)
                        kotlin.jvm.functions.Function1<X.0mp9, kotlin.Unit> r1 = r8
                        X.0mp9 r0 = X.EnumC1411090mp9.NO_RESULT_RETURN
                        r1.invoke(r0)
                        java.lang.Integer r0 = r14.statusCode
                        if (r0 == 0) goto L64
                        int r1 = r0.intValue()
                        r0 = 3019014(0x2e1106, float:4.23054E-39)
                        if (r1 != r0) goto L64
                        X.0mq2 r6 = X.EnumC1411640mq2.TNS_REFUSE
                    L43:
                        X.0mq4 r2 = X.C1411660mq4.LIZ
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r2
                        X.0jbY r5 = X.EnumC1287340jbY.FAILURE
                        java.lang.String r7 = r14.statusMsg
                        if (r7 != 0) goto L4f
                        java.lang.String r7 = ""
                    L4f:
                        long r8 = r3
                        long r10 = java.lang.System.currentTimeMillis()
                        long r0 = r5
                        long r10 = r10 - r0
                        int r12 = r7
                        r2.getClass()
                        X.C1411660mq4.LIZ(r4, r5, r6, r7, r8, r10, r12)
                    L60:
                        X.C1C7U.LIZIZ(r3)
                        return
                    L64:
                        X.0mq2 r6 = X.EnumC1411640mq2.EMPTY_RESPONSE
                        goto L43
                    L67:
                        X.1Ds4 r0 = X.C0CHQ.LIZ()
                        X.0nYH r0 = r0.getPublishService()
                        X.0nVl r1 = r0.LJJLIIIJ()
                        java.lang.String r0 = "ai_tip request photo_text_description/generate success"
                        r1.LIZ(r2, r0)
                        kotlin.jvm.functions.Function1<com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse, kotlin.Unit> r0 = r1
                        r0.invoke(r14)
                        X.0mq4 r2 = X.C1411660mq4.LIZ
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r2
                        X.0jbY r5 = X.EnumC1287340jbY.SUCCESS
                        X.0mq2 r6 = X.EnumC1411640mq2.SUCCESS
                        java.lang.String r7 = ""
                        long r8 = r3
                        long r10 = java.lang.System.currentTimeMillis()
                        long r0 = r5
                        long r10 = r10 - r0
                        int r12 = r7
                        r2.getClass()
                        X.C1411660mq4.LIZ(r4, r5, r6, r7, r8, r10, r12)
                        goto L60
                    L99:
                        r1 = 0
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1411600mpy.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.0mq1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("RecommendDescApi@bf84.generateRecommendDesc$2");
                    Throwable th = (Throwable) obj;
                    if (th instanceof TimeoutException) {
                        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip request photo_text_description/generate error timeout");
                        function12.invoke(EnumC1411090mp9.TIMEOUT);
                    } else {
                        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ai_tip request photo_text_description/generate error ");
                        sbLIZ2.append(th.getMessage());
                        c1437510nVlLJJLIIIJ.LIZ("ai_tip", C2188811AlT.LIZIZ(sbLIZ2));
                        function12.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
                    }
                    C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                    EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
                    EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.OTHERS;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    long j = jCurrentTimeMillis;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    int i = length;
                    c1411660mq4.getClass();
                    C1411660mq4.LIZ(videoPublishEditModel3, enumC1287340jbY, enumC1411640mq2, message, j, jCurrentTimeMillis3, i);
                    C1C7U.LIZIZ("RecommendDescApi@bf84.generateRecommendDesc$2");
                }
            }));
        }
        return Unit.LIZ;
    }
}
