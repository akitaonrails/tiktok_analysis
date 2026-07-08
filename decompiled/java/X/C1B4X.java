package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B4X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B4X {
    public final Activity LIZ;
    public final LinkShareIntentModel LIZIZ;
    public final C1402840mbq LIZJ;
    public final C2198861B4a LIZLLL;
    public final Music LJ;
    public List<? extends EnumC1850560yFy> LJFF = C13BV.INSTANCE;
    public C09AY LJI;
    public C09AY LJII;
    public Function1<? super C1B4F, Unit> LJIIIIZZ;

    public final void LIZ(boolean z) {
        LinkedHashMap linkedHashMap;
        String str;
        Map<String, String> map = this.LIZJ.extraET;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_photo", str);
        this.LIZJ.extraET = linkedHashMap;
    }

    public final void LIZIZ(C1B4F c1b4f) {
        C2198871B4b.LIZJ(c1b4f, this.LIZIZ);
        Function1<? super C1B4F, Unit> function1 = this.LJIIIIZZ;
        if (function1 != null) {
            function1.invoke(c1b4f);
        }
    }

    public final void LIZJ(String str) {
        Object c098200Yq;
        C622680Oba.LIZJ(this);
        try {
            String string = UriProtector.parse(str).buildUpon().appendQueryParameter("m_unique_id", UUID.randomUUID().toString()).appendQueryParameter("m_need_share_finish_notification", "1").build().toString();
            this.LIZ.finish();
            C786410Ut5.ae(0, this.LIZ, 0);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1509905vd(string, null), 3);
            LIZIZ(C1B4F.LJ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            String simpleName = C1B4X.class.getSimpleName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openIMContactSharePanel error, ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C1720106oR.LIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "OpenIMContactSharePanel exception";
            }
            LIZIZ(new C1B4F(-1, -1, message));
            C1260120ite.LIZIZ(new ARunnableS131S0100000_31(this, 208));
        }
        C189200o6.m7isFailureimpl(c098200Yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0 A[Catch: Exception -> 0x0124, TryCatch #0 {Exception -> 0x0124, blocks: (B:23:0x008d, B:24:0x0090, B:26:0x0094, B:29:0x009b, B:31:0x00a1, B:33:0x00a5, B:38:0x00b0, B:43:0x00c3, B:45:0x00cf, B:51:0x010f, B:46:0x00ea, B:47:0x00f0, B:49:0x0108, B:50:0x010c, B:53:0x011c, B:54:0x0123, B:15:0x0035, B:17:0x006b, B:20:0x007f), top: B:59:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B4X.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @C14EU
    public final void onReceiveIMContactShareStatusEvent(C1531205z4 c1531205z4) {
        C1B45 c1b45;
        String str;
        C622680Oba.LIZLLL(this);
        int i = c1531205z4.LIZIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c1b45 = C1B45.LJFF;
                        } else {
                            return;
                        }
                    } else {
                        c1b45 = C1B45.LJIIIZ;
                    }
                } else {
                    c1b45 = C1B45.LJII;
                }
            } else {
                c1b45 = C1B45.LJ;
            }
        } else {
            c1b45 = C1B45.LIZLLL;
        }
        if (c1b45 != null) {
            String str2 = this.LIZIZ.clientKey;
            C1B4F c1b4fLIZ = c1b45.LIZ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("channel", str2);
            c2344009Gk.LJIIIIZZ("launch_method", "share_to_dm");
            c2344009Gk.LJIIIIZZ("launch_from", "link_share");
            c2344009Gk.LIZJ(c1b4fLIZ.LIZIZ, "error_code");
            if (c1b4fLIZ.LIZ == 0) {
                str = "success";
            } else {
                str = "fail";
            }
            c2344009Gk.LJIIIIZZ("result", str);
            c2344009Gk.LJIIIIZZ("sdk_name", "");
            c2344009Gk.LJFF("sdk_version", "");
            C20684815ws.LJIILLIIL("open_share_after_check_result", c2344009Gk.LIZ);
            if (!Intrinsics.LJFF(c1b45, C1B45.LIZLLL)) {
                ?? r0 = this.LJII;
                if (r0 != 0) {
                    r0.invoke(c1b45);
                    return;
                }
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1510405vi(this, null), 3);
        }
    }

    public final void LIZLLL(final MusicModel musicModel, final boolean z) {
        final MusicComposerModel musicComposerModel;
        if (musicModel != null && C123100dR.LIZ(musicModel.getUrl().getUri())) {
            String localPath = musicModel.getLocalPath();
            if (localPath == null) {
                localPath = musicModel.getUrl().getUri();
            }
            musicComposerModel = new MusicComposerModel(localPath, 0, musicModel.getDuration(), musicModel);
        } else {
            musicComposerModel = null;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(String.valueOf(C13LE.LIZ(C1B4X.class).LJI()), new SimpleServiceLoadCallback() { // from class: X.1B4q
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                EnumC567790MOr enumC567790MOr;
                IUIService iUIServiceUiService = asyncAVService.uiService();
                Activity activity = this.LIZ.LIZ;
                CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
                MusicComposerModel musicComposerModel2 = musicComposerModel;
                boolean z2 = z;
                C1B4X c1b4x = this.LIZ;
                MusicModel musicModel2 = musicModel;
                creationComposerDsl.basic(new AwS613S0100000_34(c1b4x, 163));
                creationComposerDsl.musicShareStory(new AwS400S0200000_34(c1b4x, musicModel2, 49));
                creationComposerDsl.callback(new AwS613S0100000_34(c1b4x, 164));
                creationComposerDsl.setMusic(musicComposerModel2);
                if (z2) {
                    enumC567790MOr = EnumC567790MOr.STORY;
                } else {
                    enumC567790MOr = EnumC567790MOr.PHOTO;
                }
                C1402840mbq c1402840mbq = c1b4x.LIZJ;
                float scale = c1b4x.LIZIZ.coverImageSize.getScale();
                LinkShareIntentModel linkShareIntentModel = c1b4x.LIZIZ;
                creationComposerDsl.setLinkShare(new LinkShareData(enumC567790MOr, c1402840mbq, scale, linkShareIntentModel.backgroundImagePath, linkShareIntentModel.backgroundColor));
                iUIServiceUiService.startCreation(activity, creationComposerDsl);
                this.LIZ.LIZIZ(C1B4F.LJ);
            }
        });
    }

    public C1B4X(Activity activity, LinkShareIntentModel linkShareIntentModel, C1402840mbq c1402840mbq, C2198861B4a c2198861B4a, Music music) {
        this.LIZ = activity;
        this.LIZIZ = linkShareIntentModel;
        this.LIZJ = c1402840mbq;
        this.LIZLLL = c2198861B4a;
        this.LJ = music;
    }
}
