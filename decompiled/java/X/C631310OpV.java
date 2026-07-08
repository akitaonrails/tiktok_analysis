package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM$onDurationChange$1", f = "VideoMusicBaseVM.kt", l = {}, m = "invokeSuspend")
public final class C631310OpV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoMusicBaseVM LL;
    public final /* synthetic */ double LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631310OpV(VideoMusicBaseVM videoMusicBaseVM, double d, InterfaceC1364105Vn<? super C631310OpV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoMusicBaseVM;
        this.LLILLJJLI = d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631310OpV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r19 = "VideoMusicBaseVM@92f.onDurationChange$1"
            X.C1C7U.LIZ(r19)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r21)
            r12 = r20
            com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM r0 = r12.LL
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.music.model.Music r4 = r0.getMusic()
        L21:
            double r8 = r12.LLILLJJLI
            r0 = 1000(0x3e8, float:1.401E-42)
            double r0 = (double) r0
            double r8 = r8 * r0
            if (r4 != 0) goto L37
            r0 = 0
        L2a:
            com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM r1 = r12.LL
            androidx.lifecycle.MutableLiveData<java.lang.Long> r1 = r1.LLILLJJLI
            r1.postValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r19)
            return r0
        L37:
            com.ss.android.ugc.aweme.music.model.MusicFusion r11 = r4.getMusicFusion()
            r3 = 1
            r2 = 0
            if (r11 == 0) goto Lad
            boolean r0 = X.C631290OpT.LIZ(r11)
            if (r0 != r3) goto Lad
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r0 = r11.fusedMusicInfos
            java.util.Iterator r18 = r0.iterator()
            r16 = 0
        L4d:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r4 = r18.next()
            int r13 = r2 + 1
            if (r2 < 0) goto Lba
            com.ss.android.ugc.aweme.music.model.FusedMusic r4 = (com.ss.android.ugc.aweme.music.model.FusedMusic) r4
            com.ss.android.ugc.aweme.music.model.Music r10 = r4.music
            long r6 = r4.endTimeInMs
            long r0 = r4.startTimeInMs
            long r6 = r6 - r0
            boolean r0 = r11.isEpMultiMusic()
            if (r0 == 0) goto La7
            long r4 = r4.playStartTimeInMs
        L6c:
            long r14 = r4 + r6
            boolean r0 = r11.isEpMultiMusic()
            if (r0 == 0) goto La5
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r0 = r11.fusedMusicInfos
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r2 >= r0) goto La5
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r0 = r11.fusedMusicInfos
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r13)
            com.ss.android.ugc.aweme.music.model.FusedMusic r0 = (com.ss.android.ugc.aweme.music.model.FusedMusic) r0
            long r2 = r0.playStartTimeInMs
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto La5
        L8b:
            if (r10 == 0) goto La0
            double r0 = (double) r4
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto La0
            double r0 = (double) r2
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto La0
            long r0 = r10.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L2a
        La0:
            long r16 = r16 + r6
            r2 = r13
            r3 = 1
            goto L4d
        La5:
            r2 = r14
            goto L8b
        La7:
            r4 = r16
            goto L6c
        Laa:
            r0 = 0
            goto L2a
        Lad:
            long r0 = r4.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L2a
        Lb7:
            r4 = 0
            goto L21
        Lba:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C631310OpV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
