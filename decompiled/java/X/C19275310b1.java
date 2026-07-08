package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;

/* JADX INFO: renamed from: X.10b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19275310b1 extends AbstractC19275510b3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC19275410b2 interfaceC19275410b2 = (InterfaceC19275410b2) xBaseParamModel;
        String itemID = interfaceC19275410b2.getItemID();
        final String musicID = interfaceC19275410b2.getMusicID();
        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
        C15O7<SuggestMusicList> c15o7LJIIJ = C1911640zqU.LJIIJ(itemID, musicID);
        if (c15o7LJIIJ == null || c15o7LJIIJ.LIZLLL(new InterfaceC2385309Wh(completionBlock, musicID, this) { // from class: X.10b5
            public final /* synthetic */ CompletionBlock<InterfaceC19275610b4> LIZ;
            public final /* synthetic */ String LIZIZ;

            /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C15O7 r9) {
                /*
                    r8 = this;
                    java.lang.String r7 = "PrefetchPromoteRecommendMusicListMethod@7b4d.handle$1"
                    X.C1C7U.LIZ(r7)
                    boolean r0 = r9.LJIILIIL()
                    r6 = 4
                    r5 = 0
                    r4 = 0
                    if (r0 != 0) goto Lb2
                    boolean r0 = r9.LJIILL()
                    if (r0 != 0) goto Lb2
                    java.lang.Object r0 = r9.LJIIL()
                    if (r0 == 0) goto Lb2
                    java.lang.Object r0 = r9.LJIIL()
                    com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList r0 = (com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList) r0
                    if (r0 == 0) goto L85
                    java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.musicList
                    if (r0 == 0) goto L85
                    java.lang.String r2 = r8.LIZIZ
                    java.util.Iterator r1 = r0.iterator()
                L2c:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L83
                    java.lang.Object r3 = r1.next()
                    r0 = r3
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
                    java.lang.String r0 = r0.getMusicId()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L2c
                L45:
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r3
                    if (r3 == 0) goto L85
                    com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.10b4> r2 = r8.LIZ
                    java.lang.Class<X.10b4> r0 = X.InterfaceC19275610b4.class
                    com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r4)
                    X.10b4 r1 = (X.InterfaceC19275610b4) r1
                    java.lang.String r0 = r3.getMusicId()
                    r1.setMusicID(r0)
                    java.lang.String r0 = r3.getName()
                    r1.setMusicName(r0)
                    java.lang.String r0 = r3.getSinger()
                    r1.setAuthorName(r0)
                    int r0 = r3.getDuration()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1.setDuration(r0)
                    java.lang.String r0 = r3.getPicSmall()
                    r1.setPicUrl(r0)
                    X.C2382909Vj.LIZIZ(r2, r1)
                L7d:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    X.C1C7U.LIZIZ(r7)
                    return r0
                L83:
                    r3 = r4
                    goto L45
                L85:
                    com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.10b4> r2 = r8.LIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "musicList size= "
                    r1.append(r0)
                    java.lang.Object r0 = r9.LJIIL()
                    com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList r0 = (com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList) r0
                    if (r0 == 0) goto Lb0
                    java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.musicList
                    if (r0 == 0) goto Lb0
                    int r0 = r0.size()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                La4:
                    r1.append(r0)
                    X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "musicList is empty or unmatched"
                    X.C2382909Vj.LIZ(r2, r5, r0, r4, r6)
                    goto L7d
                Lb0:
                    r0 = r4
                    goto La4
                Lb2:
                    com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.10b4> r1 = r8.LIZ
                    java.lang.String r0 = "prefetch task acquire failed"
                    X.C2382909Vj.LIZ(r1, r5, r0, r4, r6)
                    goto L7d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19275710b5.then(X.15O7):java.lang.Object");
            }
        }) == null) {
            C2382909Vj.LIZ(completionBlock, 0, "prefetch task acquire null", null, 4);
        }
    }
}
