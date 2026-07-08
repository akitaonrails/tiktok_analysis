package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.feed.model.AppAdsDetectAppModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import java.util.List;

/* JADX INFO: renamed from: X.1Amw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189721Amw implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public static final void run$0(C2189721Amw c2189721Amw) {
        ((LivePreviewPlayerVM) c2189721Amw.l0).LQ2(false);
    }

    public static final void run$1(C2189721Amw c2189721Amw) {
        List list = (List) c2189721Amw.l0;
        int iMin = Math.min(list.size(), 64);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMin; i++) {
            if (((Boolean) ListProtector.get(list, i)).booleanValue()) {
                j2 |= 1 << i;
            }
        }
        if (list.size() > 64) {
            int iMin2 = Math.min(list.size(), 128);
            for (int i2 = 64; i2 < iMin2; i2++) {
                if (((Boolean) ListProtector.get(list, i2)).booleanValue()) {
                    j |= 1 << (i2 - 64);
                }
            }
        }
        AppAdsDetectAppModel appAdsDetectAppModel = new AppAdsDetectAppModel(Long.valueOf(((Number) C2187271Aiz.LIZLLL.getValue()).longValue()), Long.valueOf(j2), Long.valueOf(j), -1L, -1L, Long.valueOf(System.currentTimeMillis()));
        C2187231Aiv.LIZIZ = appAdsDetectAppModel;
        ((Keva) C2187231Aiv.LIZ.getValue()).storeString("app_ads_detect_app_data", C309390CAv.LIZIZ(appAdsDetectAppModel));
    }

    public static final void run$2(C2189721Amw c2189721Amw) {
        ((C2177071AIf) c2189721Amw.l0).LJIILL("overall");
    }

    public static final void run$3(C2189721Amw c2189721Amw) {
        ((C2177071AIf) c2189721Amw.l0).LJIILL("separate");
    }

    public C2189721Amw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
