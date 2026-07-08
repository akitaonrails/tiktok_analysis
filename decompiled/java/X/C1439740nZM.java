package X;

import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439740nZM {
    public final VideoPublishEditModel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 954));

    public final StickerChallenge LIZ() {
        return (StickerChallenge) this.LIZIZ.getValue();
    }

    public final Collection<AVChallenge> LIZIZ() {
        return LIZ().getRecordStickerChallengeList();
    }

    public C1439740nZM(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r5.LIZ.removeChallengeFromTitleAndStruct(java.util.Collections.singleton(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZ()
            java.util.HashMap r0 = r0.getStickerToChallenge()
            java.lang.Object r4 = r0.get(r6)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r4
            if (r4 == 0) goto L3e
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZ()
            java.util.List r0 = r0.getRecordStickerChallengeList()
            java.util.Iterator r3 = r0.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = (com.ss.android.ugc.aweme.shortvideo.AVChallenge) r0
            java.lang.String r1 = r4.challengeName
            java.lang.String r0 = r0.challengeName
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L3e
        L35:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.LIZ
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r1.removeChallengeFromTitleAndStruct(r0)
        L3e:
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZ()
            java.util.List r0 = r0.getStickerList()
            java.util.Collection r0 = X.C19719512Dh.LIZ(r0)
            r0.remove(r6)
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZ()
            java.util.List r0 = r0.getStickerList()
            boolean r0 = X.C13LP.LJJJJ(r6, r0)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r5.LIZ()
            java.util.HashMap r0 = r0.getStickerToChallenge()
            java.util.Map r0 = X.C19719512Dh.LIZJ(r0)
            r0.remove(r6)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439740nZM.LIZJ(java.lang.String):void");
    }

    public final void LIZLLL(List<? extends AVChallenge> list) {
        if ((!((ArrayList) list).isEmpty()) && list != null) {
            LIZ().getRecordStickerChallengeList().clear();
            LIZ().getRecordStickerChallengeList().addAll(list);
        }
    }
}
