package X;

import android.widget.SeekBar;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12YM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YM implements SeekBar.OnSeekBarChangeListener {
    public final int $t;
    public Object l0;

    public static final void onStartTrackingTouch$0(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$1(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$2(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$3(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$4(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$5(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$6(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$7(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$8(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStartTrackingTouch$9(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$0(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$1(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$2(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$3(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$4(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$5(C12YM c12ym, SeekBar seekBar) {
    }

    public static final void onStopTrackingTouch$8(C12YM c12ym, SeekBar seekBar) {
    }

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
            case 4:
                onProgressChanged$4(this, seekBar, i, z);
                break;
            case 5:
                onProgressChanged$5(this, seekBar, i, z);
                break;
            case 6:
                onProgressChanged$6(this, seekBar, i, z);
                break;
            case 7:
                onProgressChanged$7(this, seekBar, i, z);
                break;
            case 8:
                onProgressChanged$8(this, seekBar, i, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onProgressChanged$9(this, seekBar, i, z);
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
            case 4:
                onStartTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStartTrackingTouch$5(this, seekBar);
                break;
            case 6:
                onStartTrackingTouch$6(this, seekBar);
                break;
            case 7:
                onStartTrackingTouch$7(this, seekBar);
                break;
            case 8:
                onStartTrackingTouch$8(this, seekBar);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onStartTrackingTouch$9(this, seekBar);
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
            case 4:
                onStopTrackingTouch$4(this, seekBar);
                break;
            case 5:
                onStopTrackingTouch$5(this, seekBar);
                break;
            case 6:
                onStopTrackingTouch$6(this, seekBar);
                break;
            case 7:
                onStopTrackingTouch$7(this, seekBar);
                break;
            case 8:
                onStopTrackingTouch$8(this, seekBar);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onStopTrackingTouch$9(this, seekBar);
                break;
        }
    }

    public C12YM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStopTrackingTouch$6(C12YM c12ym, SeekBar seekBar) {
        VideoPublishEditModel videoPublishEditModel = ((C12XT) c12ym.l0).LJIIJ;
        if (videoPublishEditModel != null) {
            C1403470mcr.LJIIIZ(seekBar.getProgress(), videoPublishEditModel, "background");
        }
    }

    public static final void onStopTrackingTouch$7(C12YM c12ym, SeekBar seekBar) {
        VideoPublishEditModel videoPublishEditModel = ((C12XT) c12ym.l0).LJIIJ;
        if (videoPublishEditModel != null) {
            C1403470mcr.LJIIIZ(seekBar.getProgress(), videoPublishEditModel, "voice");
        }
    }

    public static final void onStopTrackingTouch$9(C12YM c12ym, SeekBar seekBar) {
        ((C196868120s) c12ym.l0).getClass();
    }

    public static final void onProgressChanged$0(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C19760712Td) c12ym.l0).LLLLIL().LIZLLL.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C19760712Td) c12ym.l0).LLJLILLLLZIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(C19760712Td.LLLLLJIL(i));
        }
    }

    public static final void onProgressChanged$1(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C19760712Td) c12ym.l0).LLLLIL().LJ.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C19760712Td) c12ym.l0).LLJLIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onProgressChanged$2(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C19760712Td) c12ym.l0).LLLLIL().LIZJ.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C19760712Td) c12ym.l0).LLJL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            ((C19760712Td) c12ym.l0).LLLLLL();
        }
    }

    public static final void onProgressChanged$3(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C12TM) c12ym.l0).LLLLIL().LIZLLL.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C12TM) c12ym.l0).LLJLILLLLZIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onProgressChanged$4(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C12TM) c12ym.l0).LLLLIL().LJ.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C12TM) c12ym.l0).LLJLIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onProgressChanged$5(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((C12TM) c12ym.l0).LLLLIL().LIZJ.invoke(Integer.valueOf(i));
            TuxTextView tuxTextView = ((C12TM) c12ym.l0).LLJL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            ((C12TM) c12ym.l0).LLLLLJLJLL();
        }
    }

    public static final void onProgressChanged$6(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        float f = (i * 1.0f) / 100.0f;
        C12XZ c12xz = ((C12XT) c12ym.l0).LJIIJJI;
        if (c12xz != null) {
            if ((!c12xz.LIZ.LLLIIIIL().isFastImport() && !c12xz.LIZ.LLLIIIIL().isCutSameVideoType() && !c12xz.LIZ.LLLIIIIL().hasOriginalSound()) || c12xz.LIZ.LLLIIIIL().isMuted() || c12xz.LIZ.LLLIIIIL().isStitchMode() || c12xz.LIZ.LLLIIIIL().getMMusicPath() != null) {
                c12xz.LIZ.LLLII().EY0(VEVolumeChangeOp.ofMusic(f));
            }
            c12xz.LIZ.LLLIIIIL().setMusicVolume(f);
        }
        ((C12XT) c12ym.l0).LJII = i;
    }

    public static final void onProgressChanged$7(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        float f = (i * 1.0f) / 100.0f;
        C12XZ c12xz = ((C12XT) c12ym.l0).LJIIJJI;
        if (c12xz != null) {
            if (c12xz.LIZ.LLLIIIIL().isStitchMode()) {
                c12xz.LIZ.LLLII().EY0(VEVolumeChangeOp.ofVoice(f));
            } else {
                c12xz.LIZ.LLLII().EY0(VEVolumeChangeOp.ofVoice(f));
            }
            c12xz.LIZ.LLLIIIIL().setVoiceVolume(f);
        }
        ((C12XT) c12ym.l0).LJIIIIZZ = i;
    }

    public static final void onProgressChanged$8(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        C121I c121i;
        InterfaceC1452170ntP interfaceC1452170ntP;
        long jLJII;
        if (z) {
            C121W c121w = (C121W) c12ym.l0;
            if (c121w.LLLFFI && (c121i = c121w.LLL) != null && (interfaceC1452170ntP = c121w.LLJJIII) != null) {
                int i2 = 0;
                float fLIZLLL = c121w.LLL.LIZLLL(0) + (((c121i.LIZIZ(interfaceC1452170ntP.getDuration()) - c121w.LLL.LIZLLL(0)) * i) / 100.0f);
                MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = c121w.LLJJIJI.vW1();
                List<VideoSegment> listZQ2 = c121w.LLIZ.getVideoEditViewModel().zQ2();
                float fCQ2 = c121w.LLIZ.getVideoEditViewModel().CQ2();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < listZQ2.size(); i3++) {
                    if (!((VideoSegment) ListProtector.get(listZQ2, i3)).isDeleted) {
                        arrayList.add(ListProtector.get(listZQ2, i3));
                    }
                }
                long j = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i4);
                    j += videoSegment.duration;
                    if (fLIZLLL <= (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * fCQ2)) {
                        i2 = i4;
                        break;
                    } else {
                        fLIZLLL -= (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * fCQ2);
                        i4++;
                    }
                }
                if (i4 == arrayList.size()) {
                    jLJII = (j - ((VideoSegment) ListProtector.get(arrayList, i2)).duration) + ((VideoSegment) ListProtector.get(arrayList, i2)).LIZLLL();
                } else {
                    jLJII = (long) ((j - ((VideoSegment) ListProtector.get(arrayList, i2)).duration) + ((VideoSegment) ListProtector.get(arrayList, i2)).LJII() + (fLIZLLL * ((VideoSegment) ListProtector.get(arrayList, i2)).LJI() * fCQ2));
                }
                mutableLiveDataVW1.setValue(C1452730nuJ.LIZIZ(jLJII));
            }
        }
    }

    public static final void onProgressChanged$9(C12YM c12ym, SeekBar seekBar, int i, boolean z) {
        C121I c121i;
        InterfaceC1452170ntP interfaceC1452170ntP;
        if (z) {
            C196868120s c196868120s = (C196868120s) c12ym.l0;
            if (c196868120s.LLLIIIL && (c121i = c196868120s.LLLII) != null && (interfaceC1452170ntP = c196868120s.LLJJIJI) != null && c196868120s.LLIZ != null) {
                int i2 = 0;
                float fLIZLLL = c196868120s.LLLII.LIZLLL(0) + (((c121i.LIZIZ(interfaceC1452170ntP.getDuration()) - c196868120s.LLLII.LIZLLL(0)) * i) / 100.0f);
                MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = c196868120s.LLJJIJIIJIL.vW1();
                List<VideoSegment> listZQ2 = c196868120s.LLIZ.getVideoEditViewModel().zQ2();
                float fCQ2 = c196868120s.LLIZ.getVideoEditViewModel().CQ2();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < listZQ2.size(); i3++) {
                    if (!((VideoSegment) ListProtector.get(listZQ2, i3)).isDeleted) {
                        arrayList.add(ListProtector.get(listZQ2, i3));
                    }
                }
                long jLJII = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i4);
                    jLJII += videoSegment.duration;
                    if (fLIZLLL <= (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * fCQ2)) {
                        i2 = i4;
                        break;
                    } else {
                        fLIZLLL -= (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * fCQ2);
                        i4++;
                    }
                }
                if (i4 != arrayList.size()) {
                    jLJII = (long) ((((long) (((jLJII - ((VideoSegment) ListProtector.get(arrayList, i2)).duration) + ((VideoSegment) ListProtector.get(arrayList, i2)).LJII()) + ((fLIZLLL * ((VideoSegment) ListProtector.get(arrayList, i2)).LJI()) * fCQ2))) / ((VideoSegment) ListProtector.get(arrayList, i2)).LJI()) * fCQ2);
                }
                mutableLiveDataVW1.setValue(C1452730nuJ.LIZIZ(jLJII));
            }
        }
    }
}
