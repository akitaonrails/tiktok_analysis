package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: renamed from: X.01Ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C341401Ue {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final GuestShowdownConfig LIZJ;
    public final Function2<Long, Integer, Unit> LIZLLL;
    public final int LJ;
    public C16FS LJI;
    public C16FS LJII;
    public C16FS LJIIIIZZ;
    public C16FS LJIIIZ;
    public C16FS LJIIJ;
    public C16FS LJIIJJI;
    public Integer LJIIL;
    public C16FS LJIILJJIL;
    public C16FS LJIILL;
    public TextView LJIILLIIL;
    public TuxSheet LJIJ;
    public final HashMap<Integer, C16FS> LJFF = new HashMap<>();
    public int LJIILIIL = 1;
    public int LJIIZILJ = 1;

    public final void LIZ(int i) {
        TextView textView = this.LJIILLIIL;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        C16FS c16fs = this.LJIILJJIL;
        if (c16fs != null) {
            c16fs.setEnabled(true);
        }
        C16FS c16fs2 = this.LJIILL;
        if (c16fs2 != null) {
            c16fs2.setEnabled(true);
        }
        C16FS c16fs3 = this.LJIILJJIL;
        if (c16fs3 != null) {
            C786410Ut5.j5(c16fs3, 1.0f);
        }
        C16FS c16fs4 = this.LJIILL;
        if (c16fs4 != null) {
            C786410Ut5.j5(c16fs4, 1.0f);
        }
        if (i >= this.LJ) {
            C16FS c16fs5 = this.LJIILJJIL;
            if (c16fs5 != null) {
                c16fs5.setEnabled(false);
            }
            C16FS c16fs6 = this.LJIILJJIL;
            if (c16fs6 != null) {
                C786410Ut5.j5(c16fs6, 0.4f);
            }
        } else if (i < 1) {
            C16FS c16fs7 = this.LJIILL;
            if (c16fs7 != null) {
                c16fs7.setEnabled(false);
            }
            C16FS c16fs8 = this.LJIILL;
            if (c16fs8 != null) {
                C786410Ut5.j5(c16fs8, 0.4f);
            }
        }
        this.LJIIZILJ = i;
        Function2<Long, Integer, Unit> function2 = this.LIZLLL;
        if (function2 != null) {
            function2.invoke(Long.valueOf(((long) this.LJIILIIL) * 60), Integer.valueOf(this.LJIIZILJ));
        }
    }

    public final void LIZIZ(int i) {
        for (View view : this.LJFF.values()) {
            if (view != null) {
                view.setSelected(false);
            }
        }
        C16FS c16fs = this.LJFF.get(Integer.valueOf(i));
        int iIntValue = 1;
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        this.LJIILIIL = i;
        if (i == 0) {
            Integer num = this.LJIIL;
            if (num != null) {
                iIntValue = num.intValue();
            }
            this.LJIILIIL = iIntValue;
        }
        Function2<Long, Integer, Unit> function2 = this.LIZLLL;
        if (function2 != null) {
            function2.invoke(Long.valueOf(((long) this.LJIILIIL) * 60), Integer.valueOf(this.LJIIZILJ));
        }
    }

    public final void LIZJ(View view) {
        this.LJI = (C16FS) view.findViewById(R.id.uwt);
        this.LJII = (C16FS) view.findViewById(R.id.uwu);
        this.LJIIIIZZ = (C16FS) view.findViewById(R.id.uwm);
        this.LJIIIZ = (C16FS) view.findViewById(R.id.uwn);
        this.LJIIJ = (C16FS) view.findViewById(R.id.uwq);
        this.LJIIJJI = (C16FS) view.findViewById(R.id.uww);
        C16FS c16fs = this.LJI;
        int i = 3;
        int i2 = 1;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIIL(2131755565, 3, 3));
        }
        C16FS c16fs2 = this.LJII;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIIL(2131755565, 5, 5));
        }
        C16FS c16fs3 = this.LJIIIIZZ;
        if (c16fs3 != null) {
            c16fs3.setText(C497740JfY.LJIIL(2131755565, 10, 10));
        }
        C16FS c16fs4 = this.LJIIIZ;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIIL(2131755565, 15, 15));
        }
        C16FS c16fs5 = this.LJIIJ;
        if (c16fs5 != null) {
            c16fs5.setText(C497740JfY.LJIIL(2131755565, 20, 20));
        }
        HashMap<Integer, C16FS> map = this.LJFF;
        map.put(3, this.LJI);
        map.put(5, this.LJII);
        map.put(10, this.LJIIIIZZ);
        map.put(15, this.LJIIIZ);
        map.put(20, this.LJIIJ);
        map.put(0, this.LJIIJJI);
        for (C16FS c16fs6 : map.values()) {
            if (c16fs6 != null) {
                c16fs6.LLILLL.LJI(0);
            }
            Context context = this.LIZ;
            if (context != null) {
                if (c16fs6 != null) {
                    c16fs6.setBackground(C424030Gjx.LIZ(context));
                    c16fs6.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LIZ));
                    c16fs6.setSelected(false);
                }
            } else if (c16fs6 != null) {
                c16fs6.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LIZ));
                c16fs6.setSelected(false);
            }
        }
        LIZLLL(this.LJI, 3);
        LIZLLL(this.LJII, 5);
        LIZLLL(this.LJIIIIZZ, 10);
        LIZLLL(this.LJIIIZ, 15);
        LIZLLL(this.LJIIJ, 20);
        LIZLLL(this.LJIIJJI, 0);
        GuestShowdownConfig guestShowdownConfig = this.LIZJ;
        if (guestShowdownConfig != null && (i = (int) (guestShowdownConfig.duration / ((long) 60))) < 1) {
            i = 1;
        }
        if (this.LJFF.get(Integer.valueOf(i)) != null) {
            LIZIZ(i);
        } else {
            C16FS c16fs7 = this.LJIIJJI;
            if (c16fs7 != null) {
                c16fs7.setText(C497740JfY.LJIIL(2131755565, i, Integer.valueOf(i)));
            }
            this.LJIIL = Integer.valueOf(i);
            LIZIZ(0);
        }
        C16FS c16fs8 = (C16FS) view.findViewById(R.id.uxa);
        C16FS c16fs9 = null;
        if (c16fs8 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs8, new C5183020f(this, 308));
        } else {
            c16fs8 = null;
        }
        this.LJIILJJIL = c16fs8;
        C16FS c16fs10 = (C16FS) view.findViewById(R.id.ux1);
        if (c16fs10 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs10, new C5183020f(this, 309));
            c16fs9 = c16fs10;
        }
        this.LJIILL = c16fs9;
        this.LJIILLIIL = (TextView) view.findViewById(R.id.ux8);
        GuestShowdownConfig guestShowdownConfig2 = this.LIZJ;
        if (guestShowdownConfig2 != null) {
            i2 = guestShowdownConfig2.loserNum;
        }
        LIZ(i2);
    }

    public final void LIZLLL(C16FS c16fs, int i) {
        if (c16fs != null) {
            c16fs.setTextColor(C20736316Cj.LIZIZ(R.attr.ex3, this.LIZ));
            C500260Jjc.LJLIIIL(500L, c16fs, new C341501Uf(i, this));
        }
    }

    public C341401Ue(Context context, DataChannel dataChannel, GuestShowdownConfig guestShowdownConfig, C5185020h c5185020h, int i) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = guestShowdownConfig;
        this.LIZLLL = c5185020h;
        this.LJ = i;
    }
}
