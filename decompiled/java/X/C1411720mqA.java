package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411720mqA {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(21));

    public final C11JF LIZ(final VideoPublishEditModel videoPublishEditModel, final RecommendDescRequestBody recommendDescRequestBody, long j, final long j2, final int i, final Function1 function1, final Function1 function12) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int length = recommendDescRequestBody.texts.length() + recommendDescRequestBody.description.length() + recommendDescRequestBody.title.length();
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip request generatePowerText start");
        return (C11JF) ((InterfaceC1411770mqF) this.LIZ.getValue()).LIZIZ(recommendDescRequestBody).LJLJI(j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0mpz
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r18) {
                /*
                    r17 = this;
                    r4 = r18
                    java.lang.String r5 = "RecommendDescApi@bf84.generatePowerText$1"
                    X.C1C7U.LIZ(r5)
                    com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse r4 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse) r4
                    java.util.List<com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem> r0 = r4.generatedPoweredText
                    if (r0 == 0) goto La9
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    r0 = r0 ^ 1
                    if (r0 != r1) goto La9
                L16:
                    java.lang.String r3 = "ai_tip"
                    r0 = r17
                    if (r1 == 0) goto L59
                    X.1Ds4 r1 = X.C0CHQ.LIZ()
                    X.0nYH r1 = r1.getPublishService()
                    X.0nVl r2 = r1.LJJLIIIJ()
                    java.lang.String r1 = "ai_tip request generatePowerText success"
                    r2.LIZ(r3, r1)
                    kotlin.jvm.functions.Function1<com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse, kotlin.Unit> r1 = r1
                    r1.invoke(r4)
                    X.0mq4 r3 = X.C1411660mq4.LIZ
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r2
                    X.0jbY r7 = X.EnumC1287340jbY.SUCCESS
                    X.0mq2 r8 = X.EnumC1411640mq2.SUCCESS
                    java.lang.String r9 = ""
                    long r10 = r3
                    long r12 = java.lang.System.currentTimeMillis()
                    long r1 = r5
                    long r12 = r12 - r1
                    int r14 = r7
                    int r15 = r8
                    com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody r0 = r9
                    boolean r0 = r0.degrade
                    r3.getClass()
                    r16 = r0
                    X.C1411660mq4.LIZIZ(r6, r7, r8, r9, r10, r12, r14, r15, r16)
                L55:
                    X.C1C7U.LIZIZ(r5)
                    return
                L59:
                    X.1Ds4 r1 = X.C0CHQ.LIZ()
                    X.0nYH r1 = r1.getPublishService()
                    X.0nVl r2 = r1.LJJLIIIJ()
                    java.lang.String r1 = "ai_tip request generatePowerText error no data return"
                    r2.LIZ(r3, r1)
                    kotlin.jvm.functions.Function1<X.0mp9, kotlin.Unit> r2 = r10
                    X.0mp9 r1 = X.EnumC1411090mp9.NO_RESULT_RETURN
                    r2.invoke(r1)
                    java.lang.Integer r1 = r4.statusCode
                    if (r1 == 0) goto La6
                    int r2 = r1.intValue()
                    r1 = 3019014(0x2e1106, float:4.23054E-39)
                    if (r2 != r1) goto La6
                    X.0mq2 r8 = X.EnumC1411640mq2.TNS_REFUSE
                L80:
                    X.0mq4 r3 = X.C1411660mq4.LIZ
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r2
                    X.0jbY r7 = X.EnumC1287340jbY.FAILURE
                    java.lang.String r9 = r4.statusMsg
                    if (r9 != 0) goto L8c
                    java.lang.String r9 = ""
                L8c:
                    long r10 = r3
                    long r12 = java.lang.System.currentTimeMillis()
                    long r1 = r5
                    long r12 = r12 - r1
                    int r14 = r7
                    int r15 = r8
                    com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody r0 = r9
                    boolean r0 = r0.degrade
                    r3.getClass()
                    r16 = r0
                    X.C1411660mq4.LIZIZ(r6, r7, r8, r9, r10, r12, r14, r15, r16)
                    goto L55
                La6:
                    X.0mq2 r8 = X.EnumC1411640mq2.EMPTY_RESPONSE
                    goto L80
                La9:
                    r1 = 0
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1411610mpz.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0mq0
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecommendDescApi@bf84.generatePowerText$2");
                Throwable th = (Throwable) obj;
                if (th instanceof TimeoutException) {
                    C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip request generatePowerText error timeout");
                    function12.invoke(EnumC1411090mp9.TIMEOUT);
                } else {
                    C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ai_tip request generatePowerText error ");
                    sbLIZ.append(th.getMessage());
                    c1437510nVlLJJLIIIJ.LIZ("ai_tip", C2188811AlT.LIZIZ(sbLIZ));
                    function12.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
                }
                C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
                EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.OTHERS;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                long j3 = j2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                int i2 = length;
                int i3 = i;
                boolean z = recommendDescRequestBody.degrade;
                c1411660mq4.getClass();
                C1411660mq4.LIZIZ(videoPublishEditModel2, enumC1287340jbY, enumC1411640mq2, message, j3, jCurrentTimeMillis2, i2, i3, z);
                C1C7U.LIZIZ("RecommendDescApi@bf84.generatePowerText$2");
            }
        });
    }
}
