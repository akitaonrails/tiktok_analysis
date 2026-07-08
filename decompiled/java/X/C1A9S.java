package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A9S, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9S extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Integer>, Unit> {
    public C1A9S() {
        super(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem r6, X.C291001Au<? extends java.lang.Integer> r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem r6 = (com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem) r6
            if (r7 == 0) goto Lbd
            boolean r0 = X.C690950R8j.LIZIZ
            r4 = 0
            if (r0 != 0) goto L28
            com.ss.android.ugc.aweme.search.copyrightmute.ISearchCopyrightMuteService r1 = r6.Ep()
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r0.LL
        L13:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            r0.getAweme()
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r0.LL
        L1e:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r0 = r0.mEventType
            boolean r0 = r1.LIZLLL(r0)
            if (r0 == 0) goto L92
        L28:
            r6.Wp()
            X.1A9g r3 = X.C2174741A9g.LIZIZ
            boolean r0 = r3.LJIJ()
            if (r0 == 0) goto L49
            boolean r0 = r6.LLLLLLLLL
            if (r0 == 0) goto L49
            boolean r0 = r6.LLLLLLLLLL
            if (r0 != 0) goto L49
            Y.ARunnableS132S0100000_32 r2 = new Y.ARunnableS132S0100000_32
            r0 = 9
            r2.<init>(r6, r0)
            r6.LLLLLLZ = r2
            r0 = 5000(0x1388, double:2.4703E-320)
            X.C2487409ou.LIZLLL(r0, r2)
        L49:
            boolean r0 = X.C302070Bsj.LIZIZ()
            if (r0 != 0) goto L59
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            java.lang.String r0 = r3.LIZIZ(r0)
            r6.LLLLLLLZIL = r0
        L59:
            r2 = 1
            r6.LLLLLZ = r2
            java.lang.String r0 = "holder_select"
            r6.qq(r0)
            X.06qJ r1 = r6.LLLF
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem.LLLZ
            r0 = r0[r2]
            java.lang.Object r3 = r1.getValue(r6, r0)
            com.ss.android.ugc.aweme.feed.assem.music.RecordMuteVM r3 = (com.ss.android.ugc.aweme.feed.assem.music.RecordMuteVM) r3
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = r0.LL
        L73:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            boolean r0 = r3.LLILLJJLI
            if (r0 == 0) goto L92
            java.util.HashSet<java.lang.String> r1 = r3.LL
            java.lang.String r0 = r2.getAid()
            r1.add(r0)
            java.util.HashSet<java.lang.String> r0 = r3.LL
            int r1 = r0.size()
            r0 = 3
            if (r1 <= r0) goto L92
            r0 = 0
            r3.LLILLJJLI = r0
        L92:
            java.util.concurrent.ExecutorService r1 = X.C20684815ws.LJFF()
            X.0P2Q r0 = new X.0P2Q
            r0.<init>()
            r1.submit(r0)
            X.1A9R r0 = r6.LLLIZZ
            if (r0 == 0) goto La3
            r4 = r0
        La3:
            r4.getClass()
            boolean r0 = X.C20586815h4.LIZ()
            if (r0 == 0) goto Lbd
            android.view.View r3 = r4.LJIILIIL
            if (r3 == 0) goto Lbd
            X.10rc r2 = new X.10rc
            r2.<init>(r4)
            int r0 = X.C300480BqA.LIZ()
            long r0 = (long) r0
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lc0:
            r0 = r4
            goto L73
        Lc2:
            r0 = r4
            goto L1e
        Lc5:
            r0 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A9S.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
