package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15M1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15M1 extends C09AY implements Function1<AsyncAVService, Unit> {
    public final /* synthetic */ MusicShootAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MusicModel LLILLL;
    public final /* synthetic */ UrlModel LLILZ;
    public final /* synthetic */ MusicDetail LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15M1(MusicShootAssem musicShootAssem, String str, MusicModel musicModel, UrlModel urlModel, MusicDetail musicDetail) {
        super(1);
        this.LL = musicShootAssem;
        this.LLILLJJLI = str;
        this.LLILLL = musicModel;
        this.LLILZ = urlModel;
        this.LLILZIL = musicDetail;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[PHI: r0
      0x0094: PHI (r0v17 int) = (r0v16 int), (r0v18 int) binds: [B:25:0x00a3, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.services.AsyncAVService r20) {
        /*
            r19 = this;
            r2 = r20
            com.ss.android.ugc.aweme.services.AsyncAVService r2 = (com.ss.android.ugc.aweme.services.AsyncAVService) r2
            r8 = r19
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = r8.LL
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r1 = r8.LL
            r0 = 0
            java.lang.String r7 = r1.aq(r0)
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = r8.LL
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            android.content.Intent r1 = X.C629480OmY.LIZJ(r0)
            r14 = 0
            if (r1 == 0) goto Laa
            java.lang.String r0 = "is_story_page"
            boolean r6 = r1.getBooleanExtra(r0, r14)
        L28:
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = r8.LL
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            android.content.Intent r1 = X.C629480OmY.LIZJ(r0)
            if (r1 == 0) goto La8
            java.lang.String r0 = "is_friend_page"
            boolean r1 = r1.getBooleanExtra(r0, r14)
        L3a:
            com.ss.android.ugc.aweme.services.external.IUIService r5 = r2.uiService()
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r0 = r8.LL
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto Lad
            com.ss.android.ugc.aweme.composer.CreationComposerDsl r3 = new com.ss.android.ugc.aweme.composer.CreationComposerDsl
            r3.<init>()
            java.lang.String r2 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r10 = r8.LLILLL
            com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem r12 = r8.LL
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r8.LLILZ
            com.ss.android.ugc.aweme.music.model.MusicDetail r11 = r8.LLILZIL
            X.15M2 r0 = new X.15M2
            r0.<init>(r12, r6, r1, r7)
            r3.basic(r0)
            kotlin.jvm.internal.AwS117S0400000_21 r8 = new kotlin.jvm.internal.AwS117S0400000_21
            r13 = 5
            r8.<init>(r9, r10, r11, r12, r13)
            r3.musicShareStory(r8)
            kotlin.jvm.internal.AwS610S0100000_31 r1 = new kotlin.jvm.internal.AwS610S0100000_31
            r0 = 367(0x16f, float:5.14E-43)
            r1.<init>(r12, r0)
            r3.callback(r1)
            com.ss.android.ugc.aweme.composer.model.MusicComposerModel r6 = new com.ss.android.ugc.aweme.composer.model.MusicComposerModel
            java.lang.Class<com.ss.android.ugc.aweme.services.music.IMusicBridgeService> r13 = com.ss.android.ugc.aweme.services.music.IMusicBridgeService.class
            r17 = 14
            r18 = 0
            r15 = r14
            r16 = r14
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.services.music.IMusicBridgeService r0 = (com.ss.android.ugc.aweme.services.music.IMusicBridgeService) r0
            if (r0 == 0) goto La6
            boolean r1 = r0.enableMusicEndTimeOnShoot()
            r0 = 1
            if (r1 != r0) goto La6
        L8a:
            int r1 = r10.getDuration()
            if (r0 == 0) goto La1
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r1 <= r0) goto L95
        L94:
            r1 = r0
        L95:
            r6.<init>(r2, r14, r1, r10)
            r3.setMusic(r6)
            r5.startCreation(r4, r3)
        L9e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La1:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r1 <= r0) goto L95
            goto L94
        La6:
            r0 = 0
            goto L8a
        La8:
            r1 = 0
            goto L3a
        Laa:
            r6 = 0
            goto L28
        Lad:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15M1.invoke(java.lang.Object):java.lang.Object");
    }
}
