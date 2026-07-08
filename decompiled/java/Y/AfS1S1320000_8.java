package Y;

import X.AbstractC577770MlL;
import X.C09JN;
import X.C0MOA;
import X.C0MOZ;
import X.C1C7U;
import X.C564170MAt;
import X.C577670MlB;
import X.C577840MlS;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IPendingPhotoCanvasInjectorService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AfS1S1320000_8 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;
    public boolean z5;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1320000_8 afS1S1320000_8, Object obj) throws Throwable {
        C1C7U.LIZ("PhotoStage@abaf.action$disposable$1");
        C0MOZ c0moz = (C0MOZ) obj;
        C577670MlB.LIZ.getClass();
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL = C577670MlB.LIZLLL();
        if (iStoryAlbumEnterEditTimingServiceLIZLLL != null) {
            iStoryAlbumEnterEditTimingServiceLIZLLL.LIZ();
        }
        if (afS1S1320000_8.z4) {
            CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(c0moz, ((C577840MlS) ((AbstractC577770MlL) afS1S1320000_8.l1)).LIZ.LIZJ);
            IPendingPhotoCanvasInjectorService iPendingPhotoCanvasInjectorService = (IPendingPhotoCanvasInjectorService) afS1S1320000_8.l2;
            if (iPendingPhotoCanvasInjectorService != null) {
                iPendingPhotoCanvasInjectorService.LIZ(((ShortVideoContext) afS1S1320000_8.l3).getCreationId(), canvasVideoDataLIZLLL);
            }
            IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL2 = C577670MlB.LIZLLL();
            if (iStoryAlbumEnterEditTimingServiceLIZLLL2 != null) {
                iStoryAlbumEnterEditTimingServiceLIZLLL2.LIZ();
            }
        }
        if (afS1S1320000_8.z5) {
            C577670MlB.LJFF(afS1S1320000_8.s0, c0moz.LIZ, ((ShortVideoContext) afS1S1320000_8.l3).getCreationId());
            IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL3 = C577670MlB.LIZLLL();
            if (iStoryAlbumEnterEditTimingServiceLIZLLL3 != null) {
                iStoryAlbumEnterEditTimingServiceLIZLLL3.LIZ();
            }
        }
        C1C7U.LIZIZ("PhotoStage@abaf.action$disposable$1");
    }

    public static final void accept$1(AfS1S1320000_8 afS1S1320000_8, Object obj) throws Throwable {
        List<String> listSingletonList;
        C1C7U.LIZ("PhotoStage@abaf.action$disposable$2");
        C0MOZ c0moz = (C0MOZ) obj;
        C577670MlB.LIZ.getClass();
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL = C577670MlB.LIZLLL();
        if (iStoryAlbumEnterEditTimingServiceLIZLLL != null) {
            iStoryAlbumEnterEditTimingServiceLIZLLL.LIZ();
        }
        ((C564170MAt) afS1S1320000_8.l1).LIZ();
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        if (!afS1S1320000_8.z4) {
            C577670MlB.LJFF(afS1S1320000_8.s0, c0moz.LIZ, ((ShortVideoContext) afS1S1320000_8.l2).getCreationId());
            IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL2 = C577670MlB.LIZLLL();
            if (iStoryAlbumEnterEditTimingServiceLIZLLL2 != null) {
                iStoryAlbumEnterEditTimingServiceLIZLLL2.LIZ();
            }
        }
        if (!afS1S1320000_8.z5) {
            if (((ShortVideoContext) afS1S1320000_8.l2).creativeModel.changeAvatarModel.isFromChangeAvatar) {
                String str = afS1S1320000_8.s0;
                c0moz.LIZ = str;
                listSingletonList = Collections.singletonList(str);
            } else {
                listSingletonList = ((C577840MlS) ((AbstractC577770MlL) afS1S1320000_8.l3)).LIZ.LIZJ;
            }
            if (((ShortVideoContext) afS1S1320000_8.l2).creativeModel.changeAvatarModel.isFromChangeAvatar) {
                C577670MlB.LJ(((C577840MlS) ((AbstractC577770MlL) afS1S1320000_8.l3)).LIZ, C0MOA.LIZJ(c0moz, listSingletonList), null);
            } else {
                C577670MlB.LJ(((C577840MlS) ((AbstractC577770MlL) afS1S1320000_8.l3)).LIZ, C0MOA.LIZLLL(c0moz, listSingletonList), null);
                IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingServiceLIZLLL3 = C577670MlB.LIZLLL();
                if (iStoryAlbumEnterEditTimingServiceLIZLLL3 != null) {
                    iStoryAlbumEnterEditTimingServiceLIZLLL3.LIZ();
                }
            }
        }
        C1C7U.LIZIZ("PhotoStage@abaf.action$disposable$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS1S1320000_8(Object obj, C564170MAt c564170MAt, boolean z, String str, ShortVideoContext shortVideoContext, boolean z2, AbstractC577770MlL<Object> abstractC577770MlL) {
        this.$t = abstractC577770MlL;
        this.l1 = obj;
        this.z4 = c564170MAt;
        this.s0 = z;
        this.l2 = str;
        this.z5 = shortVideoContext;
        this.l3 = z2;
    }
}
