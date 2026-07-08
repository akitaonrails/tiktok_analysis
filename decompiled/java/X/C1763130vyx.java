package X;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763130vyx extends AbstractC1763170vz1 {
    public final Object LL;
    public final boolean LLILLJJLI;
    public final C1765720w38 LLILLL;
    public final C01GW LLILZ;
    public Aweme LLILZIL;
    public C1752030vh3 LLILZLL;
    public InterfaceC1763420vzQ LLIZ;
    public final C01GW LLIZLLLIL;
    public final C1763160vz0 LLJ;

    public final void L5() {
        View viewFindViewById;
        this.LLILLL.LIZLLL();
        View viewFindViewById2 = this.LLILLL.findViewById(R.id.qtg);
        if (viewFindViewById2 != null && (viewFindViewById = viewFindViewById2.findViewById(R.id.qmi)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        N5().LJI();
        this.LLILLL.LJIIJ(0.0f);
    }

    public final C1508330pLz N5() {
        return (C1508330pLz) this.LLILZ.getValue();
    }

    @Override // X.AbstractC1763170vz1
    public final void onViewDetachedFromWindow() {
        this.LLILLL.LIZ(false);
        this.LLILLL.LIZJ();
        C1508330pLz c1508330pLzN5 = N5();
        c1508330pLzN5.LIZLLL().remove(this.LLIZLLLIL.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1763170vz1
    public final void onViewAttachedToWindow() {
        C1508330pLz c1508330pLzN5 = N5();
        c1508330pLzN5.LIZLLL().add(this.LLIZLLLIL.getValue());
        this.LLILLL.LIZLLL();
    }

    @Override // X.AbstractC1763170vz1
    public final void I5(AbstractC1763110vyv abstractC1763110vyv) {
        DialogFragment dialogFragment;
        Window window;
        Window window2;
        C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.qtx));
        Aweme awemeLIZJ = ((C1762710vyH) abstractC1763110vyv).LIZJ();
        this.LLILZIL = awemeLIZJ;
        Video video = awemeLIZJ.getVideo();
        if (video != null) {
            C1508330pLz c1508330pLzN5 = N5();
            c1508330pLzN5.LJFF = video;
            c1508330pLzN5.LJI = 0;
            if (this.LLILLJJLI) {
                C1508330pLz c1508330pLzN52 = N5();
                Aweme aweme = this.LLILZIL;
                InterfaceC1508380pM4 interfaceC1508380pM4 = c1508330pLzN52.LJIIIIZZ;
                if (interfaceC1508380pM4 != null) {
                    interfaceC1508380pM4.LIZJ(aweme);
                }
            } else {
                C1508330pLz c1508330pLzN53 = N5();
                Aweme aweme2 = this.LLILZIL;
                InterfaceC1508380pM4 interfaceC1508380pM42 = c1508330pLzN53.LJIIIIZZ;
                if (interfaceC1508380pM42 != null) {
                    interfaceC1508380pM42.LIZIZ(aweme2);
                }
            }
            new C1752030vh3();
            C1752030vh3 c1752030vh3 = new C1752030vh3();
            c1752030vh3.LIZ = N5();
            c1752030vh3.LIZLLL = new C0JSE(video.getWidth(), video.getHeight());
            c1752030vh3.LJ = Integer.valueOf(video.getVideoLength());
            c1752030vh3.LJI = this.LLJ;
            this.LLILZLL = c1752030vh3;
            Object obj = this.LL;
            ViewGroup viewGroup = null;
            if (obj instanceof Fragment) {
                C19EG activity = ((Fragment) obj).getActivity();
                if (activity != null) {
                    window2 = activity.getWindow();
                } else {
                    window2 = null;
                }
                c1752030vh3.LIZJ = window2;
                C1752030vh3 c1752030vh32 = this.LLILZLL;
                if (c1752030vh32 != null) {
                    C19EG activity2 = ((Fragment) this.LL).getActivity();
                    if (activity2 != null) {
                        viewGroup = (ViewGroup) activity2.findViewById(android.R.id.content);
                    }
                    c1752030vh32.LIZIZ = viewGroup;
                }
            } else if (obj instanceof Dialog) {
                Dialog dialog = (Dialog) obj;
                if (dialog != null) {
                    c1752030vh3.LIZJ = dialog.getWindow();
                    C1752030vh3 c1752030vh33 = this.LLILZLL;
                    if (c1752030vh33 != null) {
                        c1752030vh33.LIZIZ = (ViewGroup) dialog.findViewById(android.R.id.content);
                    }
                }
            } else if ((obj instanceof DialogFragment) && (dialogFragment = (DialogFragment) obj) != null) {
                Dialog dialog2 = dialogFragment.getDialog();
                if (dialog2 != null) {
                    window = dialog2.getWindow();
                } else {
                    window = null;
                }
                c1752030vh3.LIZJ = window;
                C1752030vh3 c1752030vh34 = this.LLILZLL;
                if (c1752030vh34 != null) {
                    Dialog dialog3 = dialogFragment.getDialog();
                    if (dialog3 != null) {
                        viewGroup = (ViewGroup) dialog3.findViewById(android.R.id.content);
                    }
                    c1752030vh34.LIZIZ = viewGroup;
                }
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
            c1331670kl3LJIIIIZZ.LJJIJL(this.itemView.getContext());
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJII(new C1775640wJ8(this, 2));
            this.LLILLL.setParams(this.LLILZLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vz0] */
    public C1763130vyx(C21649519o5 c21649519o5, Object obj, boolean z) {
        super(c21649519o5);
        this.LL = obj;
        this.LLILLJJLI = z;
        this.LLILLL = (C1765720w38) c21649519o5.findViewById(R.id.player_view);
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 614));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 615));
        this.LLJ = new InterfaceC1763420vzQ() { // from class: X.0vz0
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                InterfaceC1763420vzQ interfaceC1763420vzQ = this.LIZ.LLIZ;
                if (interfaceC1763420vzQ != null) {
                    interfaceC1763420vzQ.LIZIZ();
                }
                Aweme aweme = this.LIZ.LLILZIL;
                if (aweme != null) {
                    aweme.getVideo();
                }
            }
        };
    }
}
