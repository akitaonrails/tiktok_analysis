package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.album.internal.AlbumOpenApiSessionData;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525640KjS implements InterfaceC522520KeQ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C19EG LL;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525640KjS.class, "albumPlatformService", "getAlbumPlatformService()Lcom/ss/android/ugc/aweme/shortvideo/album/service/CreationAlbumPlatformService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525640KjS.class, "sessionData", "getSessionData()Lcom/ss/android/ugc/aweme/shortvideo/album/internal/AlbumOpenApiSessionData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C525640KjS.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C525640KjS.class, "eventTrackingConfig", "getEventTrackingConfig()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/AlbumEventTrackingConfig;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    public final AbstractC214814194y LIZJ() {
        return (AbstractC214814194y) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
        C1664750tQH c1664750tQH = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        String str = ((AlbumOpenApiSessionData) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1])).launchIntentKey;
        C524340KhM.LIZ.getClass();
        if (!Intrinsics.LJFF(str, C524340KhM.LIZIZ)) {
            LIZJ().setResult(0, null);
            return;
        }
        CreationAlbumPlatformService creationAlbumPlatformService = (CreationAlbumPlatformService) this.LLILLL.getValue(this, interfaceC2217461BqaArr[0]);
        if (creationAlbumPlatformService != null) {
            creationAlbumPlatformService.LIZJ();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C525640KjS(C19EG c19eg, C1DRG c1drg) {
        this.LL = c19eg;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, CreationAlbumPlatformService.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, AlbumOpenApiSessionData.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, AlbumEventTrackingConfig.class, null);
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        boolean z;
        Map<String, String> map;
        List<MediaModel> listLIZ = C525650KjT.LIZ(intent);
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        for (MediaModel mediaModel : listLIZ) {
            if (mediaModel.LJIILJJIL()) {
                i3++;
            } else if (!mediaModel.LJIIL()) {
                i4++;
            }
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
        String str = "";
        String str2 = "";
        String str3 = "photo";
        if (listLIZ.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C528210Knb c528210Knb = new C528210Knb(shortVideoContext, str, str2, i3, i4, str3, z, C525670KjV.LIZ(listLIZ), z2, z2, z2, C530690Krb.LIZ(listLIZ), listLIZ, null, 9984);
        C1664750tQH c1664750tQH = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        Map<String, String> map2 = ((AlbumEventTrackingConfig) c1664750tQH.getValue(this, interfaceC2217461BqaArr[3])).passThroughCommonParams;
        if (map2 != null) {
            c528210Knb.LIZIZ.LJI(map2);
        }
        Map<String, ? extends Map<String, String>> map3 = ((AlbumEventTrackingConfig) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[3])).passThroughParams;
        if (map3 != null && (map = map3.get("upload_content_next")) != null) {
            c528210Knb.LIZIZ.LJI(map);
        }
        c528210Knb.LIZ();
        String str4 = ((AlbumOpenApiSessionData) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1])).launchIntentKey;
        C524340KhM.LIZ.getClass();
        if (Intrinsics.LJFF(str4, C524340KhM.LIZIZ)) {
            CreationAlbumPlatformService creationAlbumPlatformService = (CreationAlbumPlatformService) this.LLILLL.getValue(this, interfaceC2217461BqaArr[0]);
            if (creationAlbumPlatformService != null) {
                C19EG c19eg = this.LL;
                AbstractC214814194y abstractC214814194yLIZJ = LIZJ();
                ArrayList arrayList = new ArrayList();
                for (MediaModel mediaModel2 : listLIZ) {
                    if ((mediaModel2 instanceof TikTokMediaModel) && mediaModel2 != null) {
                        arrayList.add(mediaModel2);
                    }
                }
                creationAlbumPlatformService.LJ(c19eg, abstractC214814194yLIZJ, new C345260DgC(intent, arrayList));
                return;
            }
            return;
        }
        LIZJ().setResult(-1, intent);
        LIZJ().finish();
    }
}
