package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763050TwV {
    public final C21546719Ub LIZ;
    public final BGMSongListViewModel LIZIZ;
    public int LIZJ = -1;
    public final List<C763220Twm> LIZLLL = new ArrayList();
    public boolean LJ = true;

    public static void LIZ(C763970Txz c763970Txz) {
        ImageView imageView;
        if (c763970Txz != null) {
            View view = c763970Txz.LJI;
            if (view != null) {
                C16F5 c16f5 = (C16F5) view.findViewById(R.id.wy6);
                if (c16f5 != null) {
                    C786410Ut5.k5(c16f5, 0.9f);
                }
                if (c763970Txz == null) {
                    return;
                }
            }
            View view2 = c763970Txz.LJI;
            if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.wxw)) != null) {
                imageView.setSelected(true);
            }
        }
    }

    public static void LIZIZ(C763970Txz c763970Txz) {
        ImageView imageView;
        C16F5 c16f5;
        View view = c763970Txz.LJI;
        if (view != null && (c16f5 = (C16F5) view.findViewById(R.id.wy6)) != null) {
            C786410Ut5.k5(c16f5, 0.5f);
        }
        View view2 = c763970Txz.LJI;
        if (view2 != null && (imageView = (ImageView) view2.findViewById(R.id.wxw)) != null) {
            imageView.setSelected(false);
        }
    }

    public C763050TwV(C21546719Ub c21546719Ub, final DataChannel dataChannel, BGMSongListViewModel bGMSongListViewModel) {
        this.LIZ = c21546719Ub;
        this.LIZIZ = bGMSongListViewModel;
        c21546719Ub.setSelectedTabIndicatorGravity(0);
        c21546719Ub.LIZ(new InterfaceC20485215Du() { // from class: X.0TwU
            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                int i;
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(BGMDismissVolumeBarEvent.class);
                }
                this.getClass();
                C763050TwV.LIZ(c763970Txz);
                if (c763970Txz != null) {
                    i = c763970Txz.LJFF;
                } else {
                    i = 0;
                }
                C763050TwV c763050TwV = this;
                BGMSongListViewModel bGMSongListViewModel2 = c763050TwV.LIZIZ;
                bGMSongListViewModel2.LLJI = i;
                bGMSongListViewModel2.LLJILJIL = ((C763220Twm) ListProtector.get(c763050TwV.LIZLLL, i)).LIZIZ;
                C763050TwV c763050TwV2 = this;
                if (!c763050TwV2.LJ) {
                    DataChannel dataChannel3 = dataChannel;
                    long j = ((C763220Twm) ListProtector.get(c763050TwV2.LIZLLL, i)).LIZIZ;
                    String str = ((C763220Twm) ListProtector.get(this.LIZLLL, i)).LIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_tab_click");
                    c474500IjALIZ.LJIJJLI(dataChannel3);
                    c474500IjALIZ.LJJII(Long.valueOf(j), "collection_id");
                    c474500IjALIZ.LJJII(str, "tab");
                    c474500IjALIZ.LIZ();
                }
                this.LJ = false;
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
                this.getClass();
                C763050TwV.LIZIZ(c763970Txz);
            }
        });
    }
}
