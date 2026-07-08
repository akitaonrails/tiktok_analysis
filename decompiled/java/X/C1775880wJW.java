package X;

import Y.ARunnableS113S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem.ECLivePlaybackVideoControlAssem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wJW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775880wJW implements SeekBar.OnSeekBarChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.$t) {
            case 0:
                onProgressChanged$0(this, seekBar, i, z);
                break;
            case 1:
                onProgressChanged$1(this, seekBar, i, z);
                break;
            case 2:
                onProgressChanged$2(this, seekBar, i, z);
                break;
            case 3:
                onProgressChanged$3(this, seekBar, i, z);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStartTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStartTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStartTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStartTrackingTouch$3(this, seekBar);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.$t) {
            case 0:
                onStopTrackingTouch$0(this, seekBar);
                break;
            case 1:
                onStopTrackingTouch$1(this, seekBar);
                break;
            case 2:
                onStopTrackingTouch$2(this, seekBar);
                break;
            case 3:
                onStopTrackingTouch$3(this, seekBar);
                break;
        }
    }

    public C1775880wJW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStartTrackingTouch$0(C1775880wJW c1775880wJW, SeekBar seekBar) {
        ((C1765730w39) c1775880wJW.l0).setCustomSliding(true);
        InterfaceC1765790w3F onPlayerActionBarListener = ((C1765730w39) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZ();
        }
    }

    public static final void onStartTrackingTouch$1(C1775880wJW c1775880wJW, SeekBar seekBar) {
        ((C1765620w2y) c1775880wJW.l0).setCustomSliding(true);
        InterfaceC1765630w2z onPlayerActionBarListener = ((C1765620w2y) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZ();
        }
    }

    public static final void onStartTrackingTouch$2(C1775880wJW c1775880wJW, SeekBar seekBar) {
        Map<String, Object> mapLJ;
        ECLivePlaybackVideoControlAssem eCLivePlaybackVideoControlAssem = (ECLivePlaybackVideoControlAssem) c1775880wJW.l0;
        eCLivePlaybackVideoControlAssem.LLJJIJIL = true;
        C1743890vTv c1743890vTv = C1743890vTv.LIZ;
        C1743900vTw c1743900vTw = eCLivePlaybackVideoControlAssem.Ho().LLILLJJLI;
        if (c1743900vTw != null) {
            mapLJ = c1743900vTw.LJ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("click_area", "progress_bar"), new Pair("click_type", "slide"));
        View viewLJJIJL = ((ECLivePlaybackVideoControlAssem) c1775880wJW.l0).LJJIJL();
        c1743890vTv.getClass();
        C1743890vTv.LIZIZ(LSPassThroughRecordSizeConfig.DEFAULT, mapLJ, mapLJIIIIZZ, viewLJJIJL);
    }

    public static final void onStartTrackingTouch$3(C1775880wJW c1775880wJW, SeekBar seekBar) {
        ViewGroup.LayoutParams layoutParams;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C1761460vwG c1761460vwG = (C1761460vwG) c1775880wJW.l0;
        c1761460vwG.LLJILJIL = true;
        View view = c1761460vwG.LLILZ;
        View viewFindViewById4 = null;
        if (view != null) {
            viewFindViewById4 = view.findViewById(R.id.tv_play_progress_seek_current);
        }
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
        }
        View view2 = c1761460vwG.LLILZ;
        if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.tv_play_progress_seek_separator)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        View view3 = c1761460vwG.LLILZ;
        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.tv_play_progress_seek_total)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
        }
        View view4 = c1761460vwG.LLILZ;
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.tgr)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        c1761460vwG.LLJI = Integer.valueOf(C0H9H.LIZIZ(12));
        c1761460vwG.LJIIIIZZ();
        SeekBar seekBarLIZIZ = c1761460vwG.LIZIZ();
        if (seekBarLIZIZ != null && (layoutParams = seekBarLIZIZ.getLayoutParams()) != null) {
            layoutParams.height = C0H9H.LIZIZ(16) + seekBarLIZIZ.getPaddingTop() + seekBarLIZIZ.getPaddingBottom();
        }
        c1761460vwG.LIZ();
        SeekBar seekBarLIZIZ2 = c1761460vwG.LIZIZ();
        if (seekBarLIZIZ2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(seekBarLIZIZ2);
            seekBarLIZIZ2.setAlpha(1.0f);
        }
        C04E5 c04e5 = c1761460vwG.LL.LLJLLIL;
        if (c04e5 != null) {
            C786410Ut5.T4(c04e5, 0.0f);
        }
    }

    public static final void onStopTrackingTouch$0(C1775880wJW c1775880wJW, SeekBar seekBar) {
        int progress = 0;
        ((C1765730w39) c1775880wJW.l0).setCustomSliding(false);
        if (seekBar != null) {
            progress = seekBar.getProgress();
        }
        InterfaceC1765790w3F onPlayerActionBarListener = ((C1765730w39) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LJ((progress * 1.0f) / 10000);
        }
    }

    public static final void onStopTrackingTouch$1(C1775880wJW c1775880wJW, SeekBar seekBar) {
        int progress = 0;
        ((C1765620w2y) c1775880wJW.l0).setCustomSliding(false);
        if (seekBar != null) {
            progress = seekBar.getProgress();
        }
        InterfaceC1765630w2z onPlayerActionBarListener = ((C1765620w2y) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LJ((progress * 1.0f) / 10000);
        }
    }

    public static final void onStopTrackingTouch$2(C1775880wJW c1775880wJW, SeekBar seekBar) {
        ECLivePlaybackVideoControlAssem eCLivePlaybackVideoControlAssem = (ECLivePlaybackVideoControlAssem) c1775880wJW.l0;
        ECVideoPlaybackController eCVideoPlaybackController = eCLivePlaybackVideoControlAssem.LLJJI;
        if (eCVideoPlaybackController != null) {
            float f = eCLivePlaybackVideoControlAssem.LLJJIJIIJIL;
            InterfaceC1484830ok5 interfaceC1484830ok5 = eCVideoPlaybackController.LLIZLLLIL;
            if (interfaceC1484830ok5 != null) {
                interfaceC1484830ok5.seek(f);
            }
        }
        ECLivePlaybackVideoControlAssem eCLivePlaybackVideoControlAssem2 = (ECLivePlaybackVideoControlAssem) c1775880wJW.l0;
        eCLivePlaybackVideoControlAssem2.LLJJIJIL = false;
        eCLivePlaybackVideoControlAssem2.LLJJIJIIJIL = 0;
    }

    public static final void onStopTrackingTouch$3(C1775880wJW c1775880wJW, SeekBar seekBar) {
        ViewGroup.LayoutParams layoutParams;
        C1765720w38 c1765720w38;
        C1765720w38 c1765720w382;
        View viewFindViewById;
        if (seekBar == null) {
            return;
        }
        C1761460vwG c1761460vwG = (C1761460vwG) c1775880wJW.l0;
        float progress = seekBar.getProgress() / seekBar.getMax();
        c1761460vwG.LLJILJIL = false;
        c1761460vwG.LIZLLL();
        View view = c1761460vwG.LLILZ;
        if (view != null && (viewFindViewById = view.findViewById(R.id.tgr)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C1508330pLz c1508330pLz = c1761460vwG.LLJIJIL;
        if (c1508330pLz != null) {
            long jLongValue = Long.valueOf(c1508330pLz.LIZJ()).longValue();
            C1508330pLz c1508330pLz2 = c1761460vwG.LLJIJIL;
            if (c1508330pLz2 != null && (c1765720w382 = c1508330pLz2.LIZ) != null) {
                c1765720w382.setVideoLength$player_release((int) jLongValue);
            }
        }
        C1508330pLz c1508330pLz3 = c1761460vwG.LLJIJIL;
        if (c1508330pLz3 != null && (c1765720w38 = c1508330pLz3.LIZ) != null) {
            c1765720w38.LJIIJ(progress);
        }
        C19736512Jv c19736512JvLIZJ = c1761460vwG.LIZJ();
        if (c19736512JvLIZJ != null) {
            C786410Ut5.LJLLLLLL(8, c19736512JvLIZJ);
        }
        c1761460vwG.LIZ();
        c1761460vwG.LLJILJILJ = new ARunnableS113S0100000_13(c1761460vwG, 303);
        SeekBar seekBarLIZIZ = c1761460vwG.LIZIZ();
        if (seekBarLIZIZ != null) {
            HandlerHook.viewPostDelay(seekBarLIZIZ, c1761460vwG.LLJILJILJ, 3000L);
        }
        c1761460vwG.LLJI = Integer.valueOf(C0H9H.LIZIZ(10));
        c1761460vwG.LJIIIIZZ();
        SeekBar seekBarLIZIZ2 = c1761460vwG.LIZIZ();
        if (seekBarLIZIZ2 != null && (layoutParams = seekBarLIZIZ2.getLayoutParams()) != null) {
            layoutParams.height = C0H9H.LIZIZ(4) + seekBarLIZIZ2.getPaddingTop() + seekBarLIZIZ2.getPaddingBottom();
        }
        c1761460vwG.LIZ();
        c1761460vwG.LLJILJILJ = new ARunnableS113S0100000_13(c1761460vwG, 303);
        SeekBar seekBarLIZIZ3 = c1761460vwG.LIZIZ();
        if (seekBarLIZIZ3 != null) {
            HandlerHook.viewPostDelay(seekBarLIZIZ3, c1761460vwG.LLJILJILJ, 3000L);
        }
        C04E5 c04e5 = c1761460vwG.LL.LLJLLIL;
        if (c04e5 != null) {
            C786410Ut5.T4(c04e5, 1.0f);
        }
    }

    public static final void onProgressChanged$0(C1775880wJW c1775880wJW, SeekBar seekBar, int i, boolean z) {
        InterfaceC1765790w3F onPlayerActionBarListener = ((C1765730w39) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZJ((i * 1.0f) / 10000);
        }
    }

    public static final void onProgressChanged$1(C1775880wJW c1775880wJW, SeekBar seekBar, int i, boolean z) {
        InterfaceC1765630w2z onPlayerActionBarListener = ((C1765620w2y) c1775880wJW.l0).getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZJ((i * 1.0f) / 10000);
        }
    }

    public static final void onProgressChanged$2(C1775880wJW c1775880wJW, SeekBar seekBar, int i, boolean z) {
        ECLivePlaybackVideoControlAssem eCLivePlaybackVideoControlAssem = (ECLivePlaybackVideoControlAssem) c1775880wJW.l0;
        eCLivePlaybackVideoControlAssem.LLJJIJIIJIL = i;
        if (eCLivePlaybackVideoControlAssem.LLJJIJIL) {
            eCLivePlaybackVideoControlAssem.Lo((long) (((eCLivePlaybackVideoControlAssem.LLJJIII * 1.0d) * ((double) i)) / ((double) 100)));
        }
    }

    public static final void onProgressChanged$3(C1775880wJW c1775880wJW, SeekBar seekBar, int i, boolean z) {
        C1761460vwG c1761460vwG;
        C1508330pLz c1508330pLz;
        TextView textView;
        if (seekBar != null && (c1508330pLz = (c1761460vwG = (C1761460vwG) c1775880wJW.l0).LLJIJIL) != null) {
            View view = c1761460vwG.LLILZ;
            TextView textView2 = null;
            if (view != null) {
                textView2 = (TextView) view.findViewById(R.id.tv_play_progress_seek_current);
            }
            if (textView2 != null) {
                textView2.setText(C1765670w33.LIZ((int) (((c1508330pLz.LIZJ() / LSPassThroughRecordSizeConfig.DEFAULT) * i) / seekBar.getMax())));
            }
            View view2 = c1761460vwG.LLILZ;
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.tv_play_progress_seek_total)) != null) {
                textView.setText(C1765670w33.LIZ((int) (c1508330pLz.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
            }
        }
    }
}
