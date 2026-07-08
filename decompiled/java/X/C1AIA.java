package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS84S0210000_33;
import wh6.AbS335S0300000_33;

/* JADX INFO: renamed from: X.1AIA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AIA extends C0J8P<C1AIE, C1AIG> {
    public final C1AI9 LIZIZ;
    public final C1AIP LIZJ;
    public final DataChannel LIZLLL;

    public final boolean LJIIIIZZ() {
        C2176881AHm c2176881AHm;
        EnumC774050UXz enumC774050UXz;
        DataChannel dataChannel = this.LIZLLL;
        return (dataChannel == null || (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) == null || (enumC774050UXz = c2176881AHm.LIZ) == null || !enumC774050UXz.isInViewerWishesCreator()) ? false : true;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C1AIE c1aie) {
        boolean z;
        String strLJIJI;
        View view;
        Context context;
        C1AIG c1aig = (C1AIG) viewHolder;
        C1AIE c1aie2 = c1aie;
        c1aig.LL = (C1324720kZq) c1aig.itemView.findViewById(R.id.viewer_wishes_item_gift_pic);
        c1aig.LLILLJJLI = (C16F5) c1aig.itemView.findViewById(R.id.viewer_wishes_item_gift_price);
        c1aig.LLILLL = c1aig.itemView.findViewById(R.id.viewer_wishes_item_gift_price_bg);
        c1aig.LLILZ = c1aig.itemView.findViewById(R.id.viewer_wishes_item_coin_icon);
        c1aig.LLILZIL = (C16F5) c1aig.itemView.findViewById(R.id.viewer_wishes_item_edit_description);
        c1aig.LLILZLL = c1aig.itemView.findViewById(R.id.viewer_wishes_item_edit_btn);
        c1aig.LLIZ = c1aig.itemView.findViewById(R.id.viewer_wishes_item_delete_btn);
        c1aig.LLIZLLLIL = (C16F5) c1aig.itemView.findViewById(R.id.viewer_wishes_item_content_unavailable);
        c1aig.LLJ = (TuxSpinner) c1aig.itemView.findViewById(R.id.viewer_wishes_item_content_loading_icon);
        c1aig.LLJI = c1aig.itemView.findViewById(R.id.viewer_wishes_item_content_loading_finish_icon);
        c1aig.LLJIJIL = c1aig.itemView.findViewById(R.id.viewer_wishes_item_faq);
        c1aig.LLJILJIL = c1aig.itemView.findViewById(R.id.viewer_wishes_gift_item);
        C1819620xS4.LIZ().LJIIIZ(c1aie2.LJ).LJJI(c1aig.LL);
        C16F5 c16f5 = c1aig.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(c1aie2.LIZJ));
        }
        if (c1aie2.LJIILJJIL && LJIIIIZZ()) {
            z = false;
        } else {
            z = true;
        }
        View view2 = c1aig.LLILZLL;
        if (view2 != null) {
            C635860Owq.LIZ.LIZJ(10, view2);
        }
        if (z) {
            View view3 = c1aig.LLILZLL;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
        } else {
            View view4 = c1aig.LLILZLL;
            if (view4 != null) {
                C786410Ut5.T4(view4, 0.3f);
            }
        }
        View view5 = c1aig.LLILZLL;
        if (view5 != null) {
            C786410Ut5.I7(new AbS335S0300000_33(this, new AwS84S0210000_33(z, this, c1aie2, 2), view5, 1), view5);
        }
        if (!(!LJIIIIZZ())) {
            C500260Jjc.LJIILIIL(c1aig.LLIZ);
        } else {
            C500260Jjc.LLFFF(c1aig.LLIZ);
            View view6 = c1aig.LLIZ;
            if (view6 != null) {
                C635860Owq.LIZ.LIZJ(10, view6);
            }
            View view7 = c1aig.LLIZ;
            if (view7 != null) {
                C786410Ut5.I7(new AbS335S0300000_33(this, new AwS242S0300000_33(c1aie2, c1aig, this, 10), view7, 0), view7);
            }
        }
        if (c1aie2.LJFF.length() == 0) {
            C16F5 c16f52 = c1aig.LLILZIL;
            if (c16f52 != null) {
                c16f52.setHint(C497740JfY.LJIJI(2131856939));
            }
        } else {
            C16F5 c16f53 = c1aig.LLILZIL;
            if (c16f53 != null) {
                c16f53.setHint("");
            }
        }
        C16F5 c16f54 = c1aig.LLILZIL;
        if (c16f54 != null) {
            c16f54.setText(c1aie2.LJFF);
        }
        C16F5 c16f55 = c1aig.LLILZIL;
        if (c16f55 != null && (context = c16f55.getContext()) != null) {
            if (c1aie2.LJIILJJIL) {
                C16F5 c16f56 = c1aig.LLILZIL;
                if (c16f56 != null) {
                    c16f56.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, context));
                }
            } else {
                C16F5 c16f57 = c1aig.LLILZIL;
                if (c16f57 != null) {
                    c16f57.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, context));
                }
            }
        }
        C16F5 c16f58 = c1aig.LLILZIL;
        if (c16f58 != null) {
            C786410Ut5.I7(new AbS335S0300000_33(this, new AwS242S0300000_33(c1aie2, c1aig, this, 11), c16f58, 0), c16f58);
        }
        if (C497740JfY.LJJ() && (view = c1aig.LLJIJIL) != null) {
            C786410Ut5.Ob(view, -1.0f);
        }
        View view8 = c1aig.LLJIJIL;
        if (view8 != null) {
            C786410Ut5.I7(new AbS335S0300000_33(this, new AwS383S0200000_17(view8, this, 107), view8, 1), view8);
        }
        if (!LJIIIIZZ()) {
            C1324720kZq c1324720kZq = c1aig.LL;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 1.0f);
            }
            View view9 = c1aig.LLILLL;
            if (view9 != null) {
                C786410Ut5.T4(view9, 1.0f);
            }
            View view10 = c1aig.LLILZ;
            if (view10 != null) {
                C786410Ut5.T4(view10, 1.0f);
            }
            C1324720kZq c1324720kZq2 = c1aig.LL;
            if (c1324720kZq2 != null) {
                C786410Ut5.I7(new AbS335S0300000_33(this, new AwS399S0200000_33(this, c1aie2, 45), c1324720kZq2, 1), c1324720kZq2);
            }
        } else {
            C1324720kZq c1324720kZq3 = c1aig.LL;
            if (c1324720kZq3 != null) {
                C786410Ut5.h5(c1324720kZq3, 0.3f);
            }
            View view11 = c1aig.LLILLL;
            if (view11 != null) {
                C786410Ut5.T4(view11, 0.3f);
            }
            View view12 = c1aig.LLILZ;
            if (view12 != null) {
                C786410Ut5.T4(view12, 0.3f);
            }
            C1324720kZq c1324720kZq4 = c1aig.LL;
            if (c1324720kZq4 != null) {
                C786410Ut5.I7(new AbS335S0300000_33(this, AFwS279S0000000_33.get$arr$(392), c1324720kZq4, 0), c1324720kZq4);
            }
        }
        C16F5 c16f59 = c1aig.LLIZLLLIL;
        if (c16f59 != null) {
            if (C1142910fqb.LIZ(c1aie2.LJI)) {
                int i = c1aie2.LJII;
                if (i != 0) {
                    if (i != 1) {
                        strLJIJI = C497740JfY.LJIJI(2131856931);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131856943);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131856940);
                }
            } else {
                strLJIJI = c1aie2.LJI;
            }
            c16f59.setText(strLJIJI);
        }
        int i2 = c1aie2.LJII;
        if (i2 != 0) {
            if (i2 != 3) {
                if (i2 != 4) {
                    LJIIIZ(this, c1aig, false, false, false, true, 14);
                    return;
                } else {
                    LJIIIZ(this, c1aig, true, false, false, false, 28);
                    return;
                }
            }
            LJIIIZ(this, c1aig, false, c1aie2.LJIILJJIL, true, false, 18);
            return;
        }
        LJIIIZ(this, c1aig, false, false, false, true, 14);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C1AIG(C786410Ut5.Td(layoutInflater, R.layout.hx3, viewGroup, false));
    }

    public C1AIA(DataChannel dataChannel, C1AI9 c1ai9, C1AIP c1aip) {
        this.LIZIZ = c1ai9;
        this.LIZJ = c1aip;
        this.LIZLLL = dataChannel;
    }

    public static void LJIIIZ(C1AIA c1aia, C1AIG c1aig, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        c1aia.getClass();
        C500260Jjc.LJIILIIL(c1aig.LLJ);
        C500260Jjc.LJIILIIL(c1aig.LLJI);
        C500260Jjc.LJIILIIL(c1aig.LLJIJIL);
        if (z) {
            C500260Jjc.LLFFF(c1aig.LLJ);
        } else if (z2) {
            C500260Jjc.LLFFF(c1aig.LLJIJIL);
        } else if (z3) {
            C500260Jjc.LLFFF(c1aig.LLJI);
        }
        if (z4) {
            C500260Jjc.LLFFF(c1aig.LLIZLLLIL);
            View view = c1aig.LLJILJIL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.dky);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(c1aig.LLIZLLLIL);
        View view2 = c1aig.LLJILJIL;
        if (view2 == null) {
            return;
        }
        view2.setBackgroundResource(R.drawable.dkx);
    }
}
