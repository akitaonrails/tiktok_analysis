package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U2M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U2M extends RecyclerView.ViewHolder {
    public final int LL;
    public C0U22 LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C16F5 LLIZLLLIL;
    public C0U2W LLJ;
    public C1143920fsE LLJI;

    public boolean L5() {
        return true;
    }

    public final void I5(final C0U22 c0u22) {
        C1324610kZf c1324610kZfLJIJJ = C1819620xS4.LIZ().LJIJJ(R.drawable.f01);
        c1324610kZfLJIJJ.LJJ = Boolean.FALSE;
        c1324610kZfLJIJJ.LIZJ(c0u22.LJFF);
        c1324610kZfLJIJJ.LJIJI(Float.valueOf((int) C497740JfY.LIZIZ(4.0f)));
        c1324610kZfLJIJJ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0U2P
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str, Exception exc) {
                int iLIZJ;
                C0U17 c0u17 = C0U17.LIZ;
                C0U2M c0u2m = this.LIZ;
                C0U2W c0u2w = c0u2m.LLJ;
                if (c0u2w != null) {
                    iLIZJ = c0u2w.LIZJ();
                } else {
                    iLIZJ = c0u2m.LL;
                }
                long j = c0u22.LIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_karaoke_cover_download_fail");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
                c474500IjALIZ.LJJII(C0U17.LIZJ(Integer.valueOf(iLIZJ)), "user_type");
                c474500IjALIZ.LJJII(-1, "error_code");
                c474500IjALIZ.LIZ();
            }
        };
        c1324610kZfLJIJJ.LJJI(this.LLILLL);
    }

    public C0U2M(int i, View view) {
        super(view);
        this.LL = i;
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.m3l);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.qm4);
        this.LLILZIL = (C16F5) view.findViewById(R.id.m3u);
        this.LLILZLL = (C16F5) view.findViewById(R.id.m3k);
        this.LLIZ = (C16F5) view.findViewById(R.id.m3s);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.m3n);
        if (Intrinsics.LJFF(InterfaceC766480U4w.LJJLL.LIZIZ(), Boolean.TRUE)) {
            view.setOnLongClickListener(new ViewOnLongClickListenerC786000UsQ(this, 2));
        }
    }

    public void P5(int i, C0U22 c0u22) {
        int i2 = C0U2L.LIZIZ[c0u22.LJIILJJIL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C16F5 c16f5 = this.LLILZIL;
                    if (c16f5 != null) {
                        c16f5.setSelected(true);
                    }
                    C1324720kZq c1324720kZq = this.LLILZ;
                    if (c1324720kZq != null) {
                        C786410Ut5.LLJJIII(c1324720kZq, 8);
                    }
                    C1143920fsE c1143920fsE = this.LLJI;
                    if (c1143920fsE != null) {
                        c1143920fsE.LIZ();
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                c16f52.setSelected(true);
            }
            C1324720kZq c1324720kZq2 = this.LLILZ;
            if (c1324720kZq2 == null) {
                return;
            }
            if (c1324720kZq2.getVisibility() != 4) {
                C786410Ut5.LLJJIII(c1324720kZq2, 0);
            }
            C1143920fsE c1143920fsE2 = this.LLJI;
            if (c1143920fsE2 == null) {
                C1143920fsE c1143920fsE3 = new C1143920fsE();
                c1143920fsE3.LIZIZ = "tiktok_live_broadcast_demand_1";
                c1143920fsE3.LIZJ = "karaoke_playing.webp";
                c1143920fsE3.LJIILIIL = true;
                c1143920fsE3.LIZ = this.LLILZ;
                c1143920fsE3.LJI = Integer.MAX_VALUE;
                c1143920fsE3.LJFF = true;
                c1143920fsE3.LJ = new C786380Ut2(this, 2);
                this.LLJI = c1143920fsE3;
                C1143680frq.LJIIIIZZ(c1143920fsE3);
                return;
            }
            c1143920fsE2.LJFF();
            return;
        }
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            c16f53.setSelected(false);
        }
        C1324720kZq c1324720kZq3 = this.LLILZ;
        if (c1324720kZq3 != null) {
            C786410Ut5.LLJJIII(c1324720kZq3, 8);
        }
        C1143920fsE c1143920fsE4 = this.LLJI;
        if (c1143920fsE4 == null) {
            return;
        }
        c1143920fsE4.LIZ();
    }

    public void N5(C0U22 c0u22, int i, C0U2K c0u2k) {
        this.LLILLJJLI = c0u22;
        int i2 = C0U2L.LIZ[c0u2k.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    I5(c0u22);
                    return;
                }
                return;
            } else {
                if (!L5()) {
                    return;
                }
                P5(i, c0u22);
                return;
            }
        }
        I5(c0u22);
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null) {
            c1324720kZq.setTag(Long.valueOf(c0u22.LIZ));
        }
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(c0u22.LIZJ);
        }
        C16F5 c16f52 = this.LLILZLL;
        if (c16f52 != null) {
            c16f52.setText(c0u22.LIZLLL);
        }
        C16F5 c16f53 = this.LLIZ;
        if (c16f53 != null) {
            long j = c0u22.LJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long j2 = 60;
            c16f53.setText(C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2)));
        }
        if (!L5()) {
            return;
        }
        P5(i, c0u22);
    }
}
