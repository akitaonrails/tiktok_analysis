package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0fak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1133080fak implements Runnable {
    public static final RunnableC1133080fak LL = new RunnableC1133080fak();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GiftInteractiveAssetPreDownloadHelperImpl@3a7f.preDownloadOnGoLive$1");
        try {
            C1138630fjh c1138630fjh = C1138630fjh.LIZ;
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            C1133070faj.LIZIZ = C1138630fjh.LJIIJ(17, Long.valueOf(room != null ? room.getId() : 0L), true, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftInteractiveAssetPreDownloadHelperImpl@3a7f.preDownloadOnGoLive$1");
    }
}
