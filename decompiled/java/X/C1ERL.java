package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SubQueueInfoResponse;

/* JADX INFO: renamed from: X.1ERL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ERL extends C09AY implements Function0<C489930JJf> {
    public C1ERL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JJf] */
    @Override // kotlin.jvm.functions.Function0
    public final C489930JJf invoke() {
        return new C0JKF() { // from class: X.0JJf
            @Override // X.C0JKF
            public final void LIZIZ() {
            }

            @Override // X.C0JKF
            public final void LIZLLL() {
            }

            @Override // X.C0JKF
            public final void LIZ(final long j, final Context context, final Map map) {
                C480460Ism.LIZ().getClass();
                PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
                String secUid = UserService.getInstance().user().getCurrentUser().getSecUid();
                secUid.toString();
                C11NZ<C470590Icr<SubQueueInfoResponse.ResponseData>> subQueueInfo = pcsApi.getSubQueueInfo(secUid, CardStruct.IStatusCode.DEFAULT, String.valueOf(j), false);
                LifecycleOwner lifecycleOwner = null;
                InterfaceC420801kM interfaceC420801kMLJJLL = C1808280x9m.LJFF(subQueueInfo, null, "/sub/queue/info/", null, 13).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1AG3
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r14) {
                        /*
                            Method dump skipped, instruction units count: 287
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1AG3.accept(java.lang.Object):void");
                    }
                }, new C09JN() { // from class: X.00MG
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LiveSdkPcsNavigateService@c645.openPcsQueueEntranceScheme$dispose$2");
                        C1C7U.LIZIZ("LiveSdkPcsNavigateService@c645.openPcsQueueEntranceScheme$dispose$2");
                    }
                });
                ComponentCallbacks2 componentCallbacks2LIZ = C06MM.LIZ(context);
                if (componentCallbacks2LIZ instanceof LifecycleOwner) {
                    lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ;
                }
                PlayEntityUtilKt.LJIILL(lifecycleOwner, new C489940JJg((C11JF) interfaceC420801kMLJJLL));
            }

            @Override // X.C0JKF
            public final void LIZJ(Context context, String str, Map<String, String> map) {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build());
            }
        };
    }
}
