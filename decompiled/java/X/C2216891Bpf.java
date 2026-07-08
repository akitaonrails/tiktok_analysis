package X;

import Y.ACListenerS168S0100000_34;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Bpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216891Bpf {
    public final ViewGroup LIZ;
    public final EditCaptionScene LIZIZ;
    public final C0F6U LIZJ;
    public final RecyclerView LIZLLL;
    public InterfaceC2216881Bpe LJ;
    public final C01GW LJFF;
    public final InputMethodManager LJI;
    public final SoftKeyBoardListener LJII;
    public final TextView LJIIIIZZ;
    public C0F6W LJIIIZ;
    public final C19737512Kf LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public final ArrayList<CaptionUtterance> LJIILJJIL;
    public final ArrayList<CaptionUtterance> LJIILL;
    public boolean LJIILLIIL;

    public final void LIZ(final C19737512Kf c19737512Kf) {
        if (this.LJIILLIIL) {
            this.LJII.LIZIZ(new InterfaceC1391500mJY() { // from class: X.1Bpj
                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    C19737512Kf c19737512Kf2 = c19737512Kf;
                    final C2216891Bpf c2216891Bpf = this;
                    c19737512Kf2.LJFF(new C19510311Uv() { // from class: X.1Bpi
                        @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                        public final void LJII() {
                        }

                        @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                        public final void LIZ() {
                            C2216891Bpf c2216891Bpf2 = c2216891Bpf;
                            c2216891Bpf2.LJIIL = false;
                            c2216891Bpf2.LJII.LIZ();
                            C2216891Bpf c2216891Bpf3 = c2216891Bpf;
                            InterfaceC2216881Bpe interfaceC2216881Bpe = c2216891Bpf3.LJ;
                            if (interfaceC2216881Bpe != null) {
                                interfaceC2216881Bpe.LJLLI(c2216891Bpf3.LJIILIIL);
                            }
                            C2216891Bpf c2216891Bpf4 = c2216891Bpf;
                            C0F6W c0f6w = c2216891Bpf4.LJIIIZ;
                            if (c0f6w != null) {
                                c2216891Bpf4.LIZLLL.removeItemDecoration(c0f6w);
                                c2216891Bpf.LJIIIZ = null;
                            }
                        }
                    });
                    this.LJIILLIIL = false;
                }
            });
            View currentFocus = ((Activity) this.LJFF.getValue()).getCurrentFocus();
            if (currentFocus != null) {
                this.LJI.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        } else {
            c19737512Kf.LJFF(new C19510311Uv() { // from class: X.1Bph
                @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                public final void LJII() {
                }

                @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                public final void LIZ() {
                    C2216891Bpf c2216891Bpf = this.LIZ;
                    c2216891Bpf.LJIIL = false;
                    c2216891Bpf.LJII.LIZ();
                    C2216891Bpf c2216891Bpf2 = this.LIZ;
                    InterfaceC2216881Bpe interfaceC2216881Bpe = c2216891Bpf2.LJ;
                    if (interfaceC2216881Bpe != null) {
                        interfaceC2216881Bpe.LJLLI(c2216891Bpf2.LJIILIIL);
                    }
                    C2216891Bpf c2216891Bpf3 = this.LIZ;
                    C0F6W c0f6w = c2216891Bpf3.LJIIIZ;
                    if (c0f6w != null) {
                        c2216891Bpf3.LIZLLL.removeItemDecoration(c0f6w);
                        this.LIZ.LJIIIZ = null;
                    }
                }
            });
        }
        this.LIZJ.LLLFZ();
    }

    public C2216891Bpf(LinearLayout linearLayout, ViewGroup viewGroup, EditCaptionScene editCaptionScene, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LIZ = viewGroup;
        this.LIZIZ = editCaptionScene;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 81));
        this.LJFF = c01gwLIZIZ;
        this.LJIIJJI = "";
        this.LJIILJJIL = new ArrayList<>();
        this.LJIILL = new ArrayList<>();
        this.LJI = (InputMethodManager) C786410Ut5.J2((C19EG) c01gwLIZIZ.getValue(), "input_method");
        C0F6U c0f6u = new C0F6U(this, videoPublishEditModel, interfaceC1455860nzM);
        this.LIZJ = c0f6u;
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.grd);
        recyclerView.setLayoutManager(new LinearLayoutManager(linearLayout.getContext(), 1, false));
        recyclerView.setAdapter(c0f6u);
        recyclerView.addItemDecoration(new C0F6W((int) C12ES.LIZJ(0.0f, recyclerView.getContext()), (int) C12ES.LIZJ(40.0f, recyclerView.getContext())));
        recyclerView.setItemAnimator(null);
        this.LIZLLL = recyclerView;
        TextView textView = (TextView) linearLayout.findViewById(R.id.dat);
        this.LJIIIIZZ = textView;
        this.LJIIJ = new C19737512Kf(viewGroup.findViewById(R.id.wmu), linearLayout, viewGroup);
        C786410Ut5.T7(textView, new ACListenerS168S0100000_34(this, 20));
        C786410Ut5.T7((TextView) linearLayout.findViewById(R.id.wpw), new ACListenerS168S0100000_34(this, 21));
        this.LJII = C0FWN.LIZ((Activity) c01gwLIZIZ.getValue());
    }
}
