package X;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0M7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563440M7y implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
            Intent intent = new Intent("com.ss.android.ugc.tiktok.pns.screen.anti.addiction.broadcast");
            intent.putExtra("action_id", "anti_addiction_click");
            Boolean.valueOf(LocalBroadcastManager.LIZ(activityLIZIZ).LIZJ(intent));
        }
        return new C1387205bq(null);
    }
}
