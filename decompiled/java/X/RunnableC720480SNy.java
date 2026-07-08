package X;

import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0SNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC720480SNy implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PostModePhotosComponent LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    public RunnableC720480SNy(String str, PostModePhotosComponent postModePhotosComponent, int i) {
        this.LL = str;
        this.LLILLJJLI = postModePhotosComponent;
        this.LLILLL = i;
    }

    public final void LIZ() {
        Aweme awemeLLILZ;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C0SOW c0sow;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService == null || (awemeLLILZ = iAwemeService.LLILZ(this.LL)) == null || (photoModeImageInfo = awemeLLILZ.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.isEmpty()) {
            PostModePhotosComponent postModePhotosComponent = this.LLILLJJLI;
            String str = this.LL;
            int i = this.LLILLL + 1;
            postModePhotosComponent.getClass();
            if (i < 10) {
                RunnableC720480SNy runnableC720480SNy = new RunnableC720480SNy(str, postModePhotosComponent, i);
                postModePhotosComponent.LLLJL = runnableC720480SNy;
                C0SOM c0som = postModePhotosComponent.LLILZ;
                if (c0som != null) {
                    HandlerHook.viewPostDelay(c0som, runnableC720480SNy, 500L);
                    return;
                }
                return;
            }
            return;
        }
        Aweme aweme = this.LLILLJJLI.LL.LIZJ;
        if (aweme != null) {
            aweme.setPhotoModeImageInfo(awemeLLILZ.getPhotoModeImageInfo());
        }
        this.LLILLJJLI.LLILLJJLI.setAweme(awemeLLILZ);
        C719880SLq c719880SLq = this.LLILLJJLI.LLIZ;
        if (c719880SLq != null) {
            c719880SLq.LJJJLIIL(C0ST8.LIZIZ(awemeLLILZ), null, null);
        }
        C716660S9g c716660S9g = this.LLILLJJLI.LLILZLL;
        if (c716660S9g != null) {
            c716660S9g.setTotalNum(imageList.size());
        }
        ViewGroup viewGroupLJIIIIZZ = this.LLILLJJLI.LL.LJIIIIZZ();
        if (viewGroupLJIIIIZZ != null && (c0sow = (C0SOW) viewGroupLJIIIIZZ.findViewById(R.id.inp)) != null) {
            c0sow.setCount(imageList.size());
        }
        this.LLILLJJLI.LL.LJIIIIZZ.LLJZIJLIL.setValue(Boolean.TRUE);
        this.LLILLJJLI.LLLJL = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PostModePhotosComponent@3b97.retryLoadPhotosFromCache$runnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModePhotosComponent@3b97.retryLoadPhotosFromCache$runnable$1");
    }
}
