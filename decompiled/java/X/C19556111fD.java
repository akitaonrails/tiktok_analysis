package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19556111fD extends AbstractC683590Qrd<C19556311fF> implements InterfaceC19554711ez {
    public final InterfaceC19556411fG LL;
    public final InterfaceC19413110xF LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC19554711ez
    public final void LJLLI() {
        setShowFooter(false);
    }

    @Override // X.InterfaceC19554711ez
    public final void LJJLIIJ(List<C19556311fF> list) {
        super.addData(new ArrayList(list));
    }

    @Override // X.InterfaceC19554711ez
    public final void LJLI(List<C19556311fF> list) {
        super.setData(new ArrayList(list));
    }

    @Override // X.InterfaceC19554711ez
    public final void LLJ(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(this);
    }

    @Override // X.InterfaceC19554711ez
    public final void LLJZIJLIL(ArrayList<C19556311fF> arrayList) {
        super.setDataAfterLoadMore(arrayList);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<T> list;
        C19556311fF c19556311fF;
        TuxTextView tuxTextView;
        boolean z;
        if ((viewHolder instanceof C19556211fE) && (list = this.mmItems) != 0 && (c19556311fF = (C19556311fF) C13LP.LJJJLZIJ(i, list)) != null) {
            C19556211fE c19556211fE = (C19556211fE) viewHolder;
            c19556211fE.LLILZLL = c19556311fF;
            SoundEffect soundEffect = c19556311fF.LIZ;
            TuxTextView tuxTextView2 = c19556211fE.LLJ;
            TuxIconView tuxIconView = null;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(soundEffect.musicName);
            int i2 = soundEffect.duration;
            if (i2 < 1) {
                i2 = 1;
            }
            TuxTextView tuxTextView3 = c19556211fE.LLJI;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setText(C0F3O.LIZ(i2 * LSPassThroughRecordSizeConfig.DEFAULT));
            TuxTextView tuxTextView4 = c19556211fE.LLJI;
            if (tuxTextView4 != null) {
                tuxTextView = tuxTextView4;
            } else {
                tuxTextView = null;
                tuxTextView4 = null;
            }
            tuxTextView.setContentDescription(C0F3O.LIZIZ(tuxTextView4.getResources(), i2));
            TuxIconView tuxIconView2 = c19556211fE.LLJILJIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            Boolean bool = c19556211fE.LLILZ.LIZJ.get(String.valueOf(soundEffect.id));
            if (bool != null && bool.booleanValue()) {
                c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
            } else {
                c419910GdJ.LIZ = R.raw.icon_bookmark;
            }
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView2.setTuxIcon(c419910GdJ);
            if (c19556311fF.LIZIZ == 0) {
                z = true;
            } else {
                z = false;
            }
            c19556211fE.L5(z);
            int i3 = c19556311fF.LIZLLL;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        c19556211fE.L5(false);
                    } else {
                        c19556211fE.I5().setLoading(false);
                        c19556211fE.I5().setText(c19556211fE.itemView.getContext().getString(2131846531));
                    }
                } else {
                    c19556211fE.I5().setLoading(false);
                    c19556211fE.I5().setText(c19556211fE.itemView.getContext().getString(2131833427));
                }
            } else {
                c19556211fE.I5().setLoading(true);
            }
            if (c19556311fF.LIZJ == 3) {
                C1295960jpS c1295960jpS = c19556211fE.LLJILJILJ;
                if (c1295960jpS == null) {
                    c1295960jpS = null;
                }
                C786410Ut5.LLD(0, c1295960jpS);
                c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
                c1295960jpS.setRepeatCount(-1);
                c1295960jpS.playAnimation();
                TuxIconView tuxIconView3 = c19556211fE.LLIZLLLIL;
                if (tuxIconView3 != null) {
                    tuxIconView = tuxIconView3;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, 4);
            } else {
                C1295960jpS c1295960jpS2 = c19556211fE.LLJILJILJ;
                if (c1295960jpS2 == null) {
                    c1295960jpS2 = null;
                }
                c1295960jpS2.pauseAnimation();
                C1295960jpS c1295960jpS3 = c19556211fE.LLJILJILJ;
                if (c1295960jpS3 == null) {
                    c1295960jpS3 = null;
                }
                C786410Ut5.LLD(4, c1295960jpS3);
                TuxIconView tuxIconView4 = c19556211fE.LLIZLLLIL;
                if (tuxIconView4 != null) {
                    tuxIconView = tuxIconView4;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            c19556211fE.LLILLL.LIZIZ(new Pair(Integer.valueOf(c19556211fE.LL), Integer.valueOf(c19556211fE.getBindingAdapterPosition())), c19556311fF);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        int i2 = C19556211fE.LLJJ;
        return new C19556211fE(this.LLILLL, C786410Ut5.Td(layoutInflaterNe, R.layout.uc, viewGroup, false), this.LL, (C19552511ed) this.LLILZ.getValue());
    }

    public C19556111fD(InterfaceC19556411fG interfaceC19556411fG, InterfaceC19413110xF interfaceC19413110xF, int i) {
        super(false);
        this.LL = interfaceC19556411fG;
        this.LLILLJJLI = interfaceC19413110xF;
        this.LLILLL = i;
        setLoadMoreListener(new AwS573S0100000_29(this, 711));
        showLoadMoreLoading();
        this.LLILZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(289));
    }

    @Override // X.InterfaceC19554711ez
    public final void LLF(int i, EnumC19554111et enumC19554111et, int i2) {
        C19556311fF c19556311fF;
        List<C19556311fF> data = getData();
        if (data != null && (c19556311fF = (C19556311fF) C13LP.LJJJLZIJ(i, data)) != null) {
            int i3 = C19554211eu.LIZ[enumC19554111et.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            c19556311fF.LIZLLL = i2;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c19556311fF.LJ = i2;
                    }
                } else {
                    c19556311fF.LIZJ = i2;
                }
            } else {
                c19556311fF.LIZIZ = i2;
            }
            notifyItemChanged(i);
        }
    }
}
