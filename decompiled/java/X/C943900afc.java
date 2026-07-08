package X;

import Y.AfS48S1100000_15;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.model.message.ReserveContent;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0afc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943900afc extends C1119660fF6 {
    public long LJJIIJ;
    public final C16F5 LJJIIJZLJL;
    public final C11JF LJJIIZ;

    public C943900afc(final C943780afQ c943780afQ, C943780afQ c943780afQ2) {
        String string;
        long j;
        InterfaceC420801kM interfaceC420801kMLJJZ;
        super(c943780afQ2);
        Context context = this.LIZ;
        if (context != null) {
            View viewSd = C786410Ut5.Sd(R.layout.gyf, C786410Ut5.ne(context), null);
            C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.n8r);
            this.LJJIIJZLJL = c16f5;
            C16FS c16fs = (C16FS) viewSd.findViewById(R.id.n8p);
            if (c16fs != null) {
                c16fs.setText(C497740JfY.LJIJI(2131841207));
            }
            CharSequence charSequence = c943780afQ2.LJIJJ;
            if (charSequence.length() > 12) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) charSequence.subSequence(0, 12));
                sbLIZ.append("...");
                string = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                string = charSequence.toString();
            }
            if (c943780afQ.LJJIJ) {
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJJ(2131854917, string));
                }
            } else {
                ReserveContent reserveContent = c943780afQ2.LJJIIZI;
                if (reserveContent != null) {
                    j = reserveContent.createdTimestamp;
                } else {
                    j = 0;
                }
                long jLIZLLL = C916430ZxJ.LIZLLL(j);
                this.LJJIIJ = jLIZLLL;
                if (1 <= jLIZLLL && jLIZLLL < 300) {
                    jLIZLLL++;
                }
                this.LJJIIJ = jLIZLLL;
                if (jLIZLLL > 0) {
                    interfaceC420801kMLJJZ = C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(jLIZLLL).LJJJJZI(new C517101zt(jLIZLLL, 2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS48S1100000_15(this, string, 0), new C09JN() { // from class: X.00K5
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("MultiCoHostNudgeTooltipBuilder$MultiCoHostNudgeTooltipBuilderParams@1777.startCountDown$3");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("bubble startCountDown, throwable = ");
                            sbLIZ2.append(obj);
                            C20441214yg.LJIIIZ("NudgeToolTip", C2188811AlT.LIZIZ(sbLIZ2));
                            C1C7U.LIZIZ("MultiCoHostNudgeTooltipBuilder$MultiCoHostNudgeTooltipBuilderParams@1777.startCountDown$3");
                        }
                    }, new InterfaceC781210Ukh() { // from class: X.0afm
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C20441214yg.LJIIIZ("NudgeToolTip", "bubble startCountDown");
                        }
                    });
                } else {
                    interfaceC420801kMLJJZ = null;
                }
                this.LJJIIZ = (C11JF) interfaceC420801kMLJJZ;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJJ(2131843684, string, C963140bAe.LJIIJ(this.LJJIIJ)));
                }
            }
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, c943780afQ.LJJIIJZLJL);
            }
            this.LJIIL = true;
            this.LIZJ = viewSd;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c96, this.LIZ);
            if (numLIZJ != null) {
                this.LJIJ = numLIZJ.intValue();
            }
            this.LJIIZILJ = new InterfaceC254900yh() { // from class: X.0afb
                @Override // X.InterfaceC254900yh
                public final void x1(int i) {
                    C20441214yg.LJIIIZ("NudgeToolTip", "nudge bubble dismiss");
                    C11JF c11jf = this.LIZ.LJJIIZ;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    if (i != 6) {
                        C20441214yg.LJIIIZ("NudgeToolTip", "dismiss by anchor view touched");
                        C944220ag8.LIZJ = false;
                    }
                    InterfaceC254900yh interfaceC254900yh = c943780afQ.LJJIIZ;
                    if (interfaceC254900yh != null) {
                        interfaceC254900yh.x1(i);
                    }
                }
            };
        }
    }
}
