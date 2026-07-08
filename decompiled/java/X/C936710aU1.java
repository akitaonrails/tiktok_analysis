package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS57S2100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936710aU1 extends C09AY implements Function1<C935650aSJ, C935650aSJ> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MultiGuestSharedBgGuestViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;
    public final /* synthetic */ DownloadInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936710aU1(boolean z, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, String str, LiveEffect liveEffect, DownloadInfo downloadInfo) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = multiGuestSharedBgGuestViewModel;
        this.LLILLL = str;
        this.LLILZ = liveEffect;
        this.LLILZIL = downloadInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C935650aSJ invoke(C935650aSJ c935650aSJ) {
        boolean zXQ2;
        String targetFilePath;
        String targetFilePath2;
        List<? extends LiveEffect> list;
        String strLJJ;
        if (this.LL) {
            zXQ2 = this.LLILLJJLI.xQ2(true);
        } else {
            zXQ2 = true;
        }
        String str = this.LLILLL;
        String strLLJLLIL = this.LLILZ.LLJLLIL();
        DownloadInfo downloadInfo = this.LLILZIL;
        LiveEffect liveEffect = null;
        if (downloadInfo != null) {
            targetFilePath = downloadInfo.getTargetFilePath();
        } else {
            targetFilePath = null;
        }
        c935650aSJ.getClass();
        C935650aSJ c935650aSJ2 = new C935650aSJ(zXQ2, str, strLLJLLIL, targetFilePath);
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.LLILLJJLI;
        String str2 = this.LLILLL;
        DownloadInfo downloadInfo2 = this.LLILZIL;
        multiGuestSharedBgGuestViewModel.DQ2(str2, c935650aSJ2);
        C938970aXf c938970aXf = MultiGuestSharedBgGuestViewModel.LLJJ;
        if (c938970aXf != null) {
            if (downloadInfo2 != null) {
                targetFilePath2 = downloadInfo2.getTargetFilePath();
            } else {
                targetFilePath2 = null;
            }
            c938970aXf.LJI();
            if (str2 != null && targetFilePath2 != null && (list = c938970aXf.LJFF) != null) {
                Iterator<? extends LiveEffect> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LiveEffect next = it2.next();
                    if (Intrinsics.LJFF(next.getResourceId(), str2)) {
                        liveEffect = next;
                        break;
                    }
                }
                LiveEffect liveEffect2 = liveEffect;
                if (liveEffect2 != null && ((strLJJ = liveEffect2.LJJ()) == null || a0.LJJJIL(strLJJ))) {
                    liveEffect2.LJJJJL(targetFilePath2);
                    C403501hZ.LIZ(new AwS57S2100000_15(c938970aXf, str2, targetFilePath2, 2));
                }
            }
        }
        return c935650aSJ2;
    }
}
