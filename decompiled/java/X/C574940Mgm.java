package X;

import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574940Mgm implements InterfaceC575170Mh9<BasicModelCompat, Unit> {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.ugc.aweme.creation.base.BasicModel r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C574960Mgo
            if (r0 == 0) goto L97
            r5 = r11
            X.0Mgo r5 = (X.C574960Mgo) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L9e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r1 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r1
            X.0nef r0 = X.C1443030nef.LJII()
            r0.LIZ(r1)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.util.List r1 = r9.getChallenges()
            if (r1 == 0) goto L3f
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r10.creativeModel
            com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel r0 = r0.tangramPersistenceModel
            if (r0 == 0) goto L3f
            r0.challenges = r1
        L3f:
            com.ss.ugc.aweme.creation.base.ChallengeModel r1 = r9.getChallenge()
            if (r1 == 0) goto L2b
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r10.creativeModel
            com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel r0 = r0.tangramPersistenceModel
            if (r0 == 0) goto L4d
            r0.challengeModel = r1
        L4d:
            java.lang.String r7 = r1.getChallengeId()
            if (r7 == 0) goto L2b
            r5.LLILLL = r2
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r4.<init>(r2, r0)
            r4.LJIJJ()
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Exception -> L79
            X.0MJv r3 = r0.getChallengeService()     // Catch: java.lang.Exception -> L79
            X.0Mqi r2 = new X.0Mqi     // Catch: java.lang.Exception -> L79
            r0 = 3
            r2.<init>(r4, r0)     // Catch: java.lang.Exception -> L79
            X.0Mqi r1 = new X.0Mqi     // Catch: java.lang.Exception -> L79
            r0 = 4
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> L79
            r3.LIZ(r7, r2, r1)     // Catch: java.lang.Exception -> L79
            goto L87
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L87
            r0 = 0
            X.C0MP6.LIZ(r0, r4)
        L87:
            java.lang.Object r1 = r4.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L94
            X.C099Q.LIZJ(r5)
        L94:
            if (r1 != r6) goto L22
            return r6
        L97:
            X.0Mgo r5 = new X.0Mgo
            r5.<init>(r8, r11)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574940Mgm.LIZIZ(com.ss.ugc.aweme.creation.base.BasicModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    @Override // X.InterfaceC575170Mh9
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat r8, X.C569090MTr r9, X.InterfaceC1364105Vn r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574940Mgm.LIZ(com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat, X.0MTr, X.05Vn):java.lang.Object");
    }
}
