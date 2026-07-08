package X;

import com.ss.android.ugc.aweme.feed.lynxcard.dynamic.RealTimeCardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20551915bR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CardInsertInfo LLILZ;
    public final /* synthetic */ RealTimeCardModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20551915bR(Aweme aweme, String str, String str2, CardInsertInfo cardInsertInfo, RealTimeCardModel realTimeCardModel, String str3) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = cardInsertInfo;
        this.LLILZIL = realTimeCardModel;
        this.LLILZLL = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r12 = this;
            com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility r4 = X.C20551815bQ.LIZLLL
            r3 = 0
            if (r4 == 0) goto L88
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.LL
            int r0 = X.C20551815bQ.LJFF
            int r1 = r0 + 1
            X.0Nq1 r0 = X.C606500Nqa.LIZLLL
            java.lang.String r0 = "real_time_lynx_card"
            X.0Nqa r0 = X.C606130Npz.LIZ(r0)
            X.0Nqk r2 = r4.Gm2(r2, r1, r0)
            if (r2 == 0) goto L89
            int r0 = r2.LIZ
            if (r0 != 0) goto L89
            X.080C r5 = X.C080C.REALTIME_SPECIAL_CARD
            java.lang.String r4 = r12.LLILLJJLI
            java.lang.String r1 = r12.LLILLL
            java.lang.String r0 = "card_insert"
            X.C080A.LIZ(r5, r0, r4, r1)
            java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.feed.lynxcard.dynamic.RealTimeCardModel> r4 = X.C20551815bQ.LJII
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r12.LLILZ
            int r0 = r0.getCardType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.feed.lynxcard.dynamic.RealTimeCardModel r0 = r12.LLILZIL
            r4.put(r1, r0)
            X.15be r5 = X.C20553215be.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r12.LL
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r12.LLILZ
            int r0 = r0.getCardType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = X.C20551815bQ.LJFF
            int r0 = r0 + 1
            r5.getClass()
            X.C20553215be.LJIIJ(r1, r4, r0)
        L51:
            X.C20551815bQ.LJI = r3
            X.15ec r4 = X.C20571615ec.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "RealTimeCard tryInsertCardToFeed, result: "
            r1.append(r0)
            if (r2 == 0) goto L86
            int r0 = r2.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L66:
            r1.append(r0)
            java.lang.String r0 = ", index: "
            r1.append(r0)
            if (r2 == 0) goto L76
            int r0 = r2.LIZJ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L76:
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.getClass()
            X.C20571615ec.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L86:
            r0 = r3
            goto L66
        L88:
            r2 = r3
        L89:
            X.080C r4 = X.C080C.REALTIME_SPECIAL_CARD
            java.lang.String r5 = "card_insert"
            java.lang.String r6 = r12.LLILLJJLI
            java.lang.String r7 = r12.LLILLL
            r8 = 60207(0xeb2f, float:8.4368E-41)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "insertAt status="
            r1.append(r0)
            if (r2 == 0) goto Lb4
            int r0 = r2.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        La5:
            r1.append(r0)
            java.lang.String r9 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r10 = r12.LLILZLL
            r11 = 128(0x80, float:1.8E-43)
            X.C080G.LIZJ(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L51
        Lb4:
            r0 = r3
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20551915bR.invoke():java.lang.Object");
    }
}
