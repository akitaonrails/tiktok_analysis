package X;

import X.C0IJT;
import X.C0TEY;
import X.C474500IjA;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0TEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TEZ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LifecycleObserver, com.bytedance.android.livesdk.game.broadcast.mirror.DualDeviceSourceReport$Companion$addActivityDestroyedCallback$callback$1] */
    public static void LIZ(final C19EG c19eg, final String str, final String str2) {
        if (c19eg == null || C0TEY.LIZLLL != null) {
            return;
        }
        C0TEY.LJI = str;
        C0TEY.LJII = str2;
        C0TEY.LJFF = System.currentTimeMillis();
        ?? r1 = new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.game.broadcast.mirror.DualDeviceSourceReport$Companion$addActivityDestroyedCallback$callback$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c19eg.getLifecycle().removeObserver(this);
                    long jCurrentTimeMillis = (System.currentTimeMillis() - C0TEY.LJFF) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    String str3 = str;
                    String str4 = str2;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_connect_quality");
                    c474500IjALIZ.LJJII(Boolean.valueOf(C0TEY.LJIIIZ), "is_first_connect_succeed");
                    c474500IjALIZ.LJJII(Boolean.valueOf(C0TEY.LJIIIIZZ), "is_first_cast_succeed");
                    c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
                    c474500IjALIZ.LJJII(Integer.valueOf(C0TEY.LJIIJ), "times_disconnect");
                    c474500IjALIZ.LJJII(Integer.valueOf(C0TEY.LJIIJJI), "times_reconnect_auto");
                    c474500IjALIZ.LJJII(Integer.valueOf(C0TEY.LJIIL), "times_reconnect_manual");
                    c474500IjALIZ.LJJII(str3, "user_id");
                    c474500IjALIZ.LJJII(str4, "room_id");
                    c474500IjALIZ.LIZ();
                    C0TEY.LJIIJ = 0;
                    C0TEY.LJIIJJI = 0;
                    C0TEY.LJIIL = 0;
                    C0TEY.LJIIIIZZ = false;
                    C0TEY.LJIIIZ = false;
                    C0TEY.LIZLLL = null;
                    C0TEY.LJFF = 0L;
                    C0TEY.LJI = CardStruct.IStatusCode.DEFAULT;
                    C0TEY.LJII = CardStruct.IStatusCode.DEFAULT;
                }
            }
        };
        C0TEY.LIZLLL = r1;
        c19eg.getLifecycle().addObserver(r1);
    }
}
