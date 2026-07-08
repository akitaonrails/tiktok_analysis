package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21374318kn extends RecyclerView.ViewHolder {
    public final C21374118kl LL;
    public C21148517pT LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ;
    public final C1324720kZq LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C1324720kZq LLIZLLLIL;
    public final C16F5 LLJ;
    public final TuxIconView LLJI;
    public final View LLJIJIL;
    public final FrameLayout LLJILJIL;

    public final InterfaceC475720Il8 I5() {
        return (InterfaceC475720Il8) this.LLILZ.getValue();
    }

    public final void L5() {
        InterfaceC21374418ko interfaceC21374418ko;
        Room roomLJIIIIZZ;
        InterfaceC21374418ko interfaceC21374418ko2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playThisItem, curPosition: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", curRoom: ");
        C21148517pT c21148517pT = this.LLILLJJLI;
        sbLIZ.append((c21148517pT == null || (interfaceC21374418ko2 = c21148517pT.LIZ) == null) ? null : interfaceC21374418ko2.LJIIIIZZ());
        sbLIZ.append(", gameLivePlayHelper: ");
        sbLIZ.append(I5());
        C20441214yg.LIZIZ("LiveViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        C21148517pT c21148517pT2 = this.LLILLJJLI;
        if (c21148517pT2 == null || (interfaceC21374418ko = c21148517pT2.LIZ) == null || (roomLJIIIIZZ = interfaceC21374418ko.LJIIIIZZ()) == null) {
            return;
        }
        InterfaceC475720Il8 interfaceC475720Il8I5 = I5();
        if (interfaceC475720Il8I5 != null) {
            getAbsoluteAdapterPosition();
            interfaceC475720Il8I5.LJ(roomLJIIIIZZ);
        }
        InterfaceC475720Il8 interfaceC475720Il8I52 = I5();
        if (interfaceC475720Il8I52 != null) {
            interfaceC475720Il8I52.LIZLLL(this.LLJILJIL);
        }
        InterfaceC475720Il8 interfaceC475720Il8I53 = I5();
        if (interfaceC475720Il8I53 != null) {
            interfaceC475720Il8I53.LIZ(InterfaceC1106030et7.C8.LIZIZ().booleanValue());
        }
        P5(this.LLJI, InterfaceC1106030et7.C8.LIZIZ().booleanValue());
    }

    public final void N5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopThisItem, curPosition: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", gameLivePlayHelper: ");
        sbLIZ.append(I5());
        C20441214yg.LIZIZ("LiveViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC475720Il8 interfaceC475720Il8I5 = I5();
        if (interfaceC475720Il8I5 != null) {
            interfaceC475720Il8I5.LIZIZ();
        }
    }

    public final boolean isPlaying() {
        InterfaceC475720Il8 interfaceC475720Il8I5 = I5();
        if (interfaceC475720Il8I5 != null) {
            return interfaceC475720Il8I5.isPlaying();
        }
        return false;
    }

    public C21374318kn(View view, C21374118kl c21374118kl) {
        super(view);
        this.LL = c21374118kl;
        this.LLILLL = -1;
        this.LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 672));
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.ir4);
        this.LLILZLL = (C16F5) view.findViewById(R.id.n9_);
        this.LLIZ = (C16F5) view.findViewById(R.id.tv_video_description);
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.lz0);
        this.LLJ = (C16F5) view.findViewById(R.id.tv_user_name);
        this.LLJI = (TuxIconView) view.findViewById(R.id.n0q);
        this.LLJIJIL = view.findViewById(R.id.ir6);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.n3x);
    }

    public static final void P5(TuxIconView tuxIconView, boolean z) {
        int i;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_speaker_x_mark_ltr;
        } else {
            i = R.raw.icon_speaker_2_ltr;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
        tuxIconView.setTuxIcon(c419910GdJ);
    }
}
