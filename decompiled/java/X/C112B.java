package X;

import Y.AfS198S0100000_29;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.112B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagUtils$fetchRecommendChallenges$1", f = "RecommendHashtagUtils.kt", l = {}, m = "invokeSuspend")
public final class C112B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EditInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112B(EditInfo editInfo, InterfaceC1364105Vn<? super C112B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = editInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C112B(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SearchRecommendChallengeList searchRecommendChallengeList;
        List<AVChallenge> list;
        C1C7U.LIZ("RecommendHashtagUtils@10e4.fetchRecommendChallenges$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C112C.LIZIZ && (searchRecommendChallengeList = C112C.LJIIJ) != null && (list = searchRecommendChallengeList.items) != null && !list.isEmpty()) {
            C112C c112c = C112C.LIZ;
            EditInfo editInfo = this.LL;
            EditInfo editInfo2 = C112C.LIZLLL;
            c112c.getClass();
            if (!editInfo.isEqualWith(editInfo2)) {
                C1403010mc7.LIZ.getMusicService().al();
                String strLIZIZ = C2275708vr.LIZIZ();
                int i = C112C.LJ + 1;
                C112C.LJ = i;
                C112C.LIZLLL(strLIZIZ, i, this.LL);
            } else {
                C11PQ<SearchRecommendChallengeList> c11pq = C112C.LJIIL;
                if (c11pq != null) {
                    c11pq.onError(new AnonymousClass1129(1007L, "The request condition is not met"));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecommendHashtagUtils@10e4.fetchRecommendChallenges$1");
                return unit;
            }
        } else {
            C112C.LJIIJ = null;
            C1403010mc7.LIZ.getMusicService().al();
            String strLIZIZ2 = C2275708vr.LIZIZ();
            if (C123100dR.LIZ(strLIZIZ2)) {
                C112C c112c2 = C112C.LIZ;
                int i2 = C112C.LJ + 1;
                C112C.LJ = i2;
                EditInfo editInfo3 = this.LL;
                c112c2.getClass();
                C112C.LIZLLL(strLIZIZ2, i2, editInfo3);
            } else {
                C1403010mc7.LIZ.getMusicService().al();
                C11NZ<String> c11nzLJ = C2275708vr.LJ();
                if (c11nzLJ != null) {
                    C19497811Qa c19497811QaLJLJJI = c11nzLJ.LJLJJI(2L, TimeUnit.SECONDS, new C098D() { // from class: X.111I
                        @Override // X.C098D
                        public final void LIZIZ(InterfaceC626120Oh8<? super String> interfaceC626120Oh8) {
                            interfaceC626120Oh8.onError(new RuntimeException("time out"));
                        }
                    });
                    EditInfo editInfo4 = this.LL;
                    C112C.LIZJ = (C11JF) c19497811QaLJLJJI.LJJLL(new AfS198S0100000_29(editInfo4, 28), new AfS198S0100000_29(editInfo4, 29));
                } else {
                    C112C c112c3 = C112C.LIZ;
                    int i3 = C112C.LJ + 1;
                    C112C.LJ = i3;
                    EditInfo editInfo5 = this.LL;
                    c112c3.getClass();
                    C112C.LIZLLL(null, i3, editInfo5);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecommendHashtagUtils@10e4.fetchRecommendChallenges$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
