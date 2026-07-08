package X;

import Y.ARunnableS117S0100000_17;
import android.os.Handler;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveFollowCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080200eDS extends GroupableElementSpecImpl {
    public final LayeredElementContext LL;
    public final C01GW LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;

    public C1080200eDS(LayeredElementContext layeredElementContext) {
        super(R.id.s88);
        this.LL = layeredElementContext;
        this.LLILLJJLI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(177));
        this.LLILZ = true;
        addSceneObserver(new DataChannelSceneObserver<C520220Kai, ProgrammedLiveMenuVisibilityChannel>() { // from class: X.0eDR
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
                return ProgrammedLiveMenuVisibilityChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                ((Handler) this.LIZ.LLILLJJLI.getValue()).removeCallbacksAndMessages(null);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C520220Kai c520220Kai) {
                int i;
                C1080200eDS c1080200eDS = this.LIZ;
                boolean z = true;
                boolean z2 = !c520220Kai.LIZ;
                ((Handler) c1080200eDS.LLILLJJLI.getValue()).removeCallbacksAndMessages(null);
                if (z2) {
                    i = c1080200eDS.LLILLL & (-2);
                } else {
                    i = c1080200eDS.LLILLL | 1;
                }
                c1080200eDS.LLILLL = i;
                if (z2) {
                    c1080200eDS.LLILZ = false;
                    C786410Ut5.LJLIIL(20000L, (Handler) c1080200eDS.LLILLJJLI.getValue(), new ARunnableS117S0100000_17(c1080200eDS, 195));
                    return;
                }
                DataChannel dataChannel = c1080200eDS.LL.getDataChannel();
                if (c1080200eDS.LLILLL != 0 || !c1080200eDS.LLILZ) {
                    z = false;
                }
                dataChannel.zW(ProgrammedLiveFollowCardVisibilityChannel.class, new C512770K9b(z));
            }
        });
    }
}
