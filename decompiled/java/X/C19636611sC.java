package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11sC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19636611sC implements InterfaceC19637111sH {
    public final Context LIZ;
    public LinearLayout LIZIZ;
    public C418610GbD LIZJ;
    public C391430FWj LIZLLL;
    public TuxTextView LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public TuxTextView LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;

    @Override // X.InterfaceC19637111sH
    public final void destroy() {
    }

    public final C391430FWj LIZLLL() {
        C391430FWj c391430FWj = this.LIZLLL;
        if (c391430FWj != null) {
            return c391430FWj;
        }
        return null;
    }

    public C19636611sC(Context context) {
        this.LIZ = context;
    }

    public static String LIZJ(String str) {
        if (CastIntegerProtector.parseInt(str) < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // X.InterfaceC19637111sH
    public final void LIZIZ(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.ibf, viewGroup, false);
        this.LIZIZ = linearLayout;
        this.LIZLLL = (C391430FWj) linearLayout.findViewById(R.id.gn8);
        LinearLayout linearLayout2 = this.LIZIZ;
        LinearLayout linearLayout3 = null;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        this.LJ = (TuxTextView) linearLayout2.findViewById(R.id.zfn);
        LinearLayout linearLayout4 = this.LIZIZ;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        this.LJFF = (TuxTextView) linearLayout4.findViewById(R.id.zfp);
        LinearLayout linearLayout5 = this.LIZIZ;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        this.LJI = (TuxTextView) linearLayout5.findViewById(R.id.zfr);
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.LJJJJI(32.0f);
        TuxTextView tuxTextView2 = this.LJFF;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.LJJJJI(32.0f);
        TuxTextView tuxTextView3 = this.LJI;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.LJJJJI(32.0f);
        LinearLayout linearLayout6 = this.LIZIZ;
        if (linearLayout6 == null) {
            linearLayout6 = null;
        }
        this.LJII = (TuxTextView) linearLayout6.findViewById(R.id.zfo);
        LinearLayout linearLayout7 = this.LIZIZ;
        if (linearLayout7 == null) {
            linearLayout7 = null;
        }
        this.LJIIIIZZ = (TuxTextView) linearLayout7.findViewById(R.id.zfq);
        LinearLayout linearLayout8 = this.LIZIZ;
        if (linearLayout8 == null) {
            linearLayout8 = null;
        }
        this.LJIIIZ = (TuxTextView) linearLayout8.findViewById(R.id.zfs);
        LJ(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, true);
        LinearLayout linearLayout9 = this.LIZIZ;
        if (linearLayout9 == null) {
            linearLayout9 = null;
        }
        this.LIZJ = (C418610GbD) linearLayout9.findViewById(R.id.nc8);
        C11BV.LIZ(LIZLLL());
        LinearLayout linearLayout10 = this.LIZIZ;
        if (linearLayout10 != null) {
            linearLayout3 = linearLayout10;
        }
        viewGroup.addView(linearLayout3);
    }

    @Override // X.InterfaceC19637111sH
    public final void LIZ(C1664680tQA<LiveCountDownStickerModel> c1664680tQA, ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.11sE
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((LiveCountDownStickerModel) obj).getTitle();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LiveCountDownStickerModel) obj).setTitle((String) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 497));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11sB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LiveCountDownStickerModel) obj).getVisible());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(viewGroup, 498));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11sF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((LiveCountDownStickerModel) obj).getEndTime());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS395S0200000_29(c1664680tQA, this, 58));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11sG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((LiveCountDownStickerModel) obj).getLastEditTime());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS395S0200000_29(c1664680tQA, this, 59));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11sD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LiveCountDownStickerModel) obj).getClickable());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(viewGroup, 495));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.11sA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LiveCountDownStickerModel) obj).getEditable());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 496));
    }

    public final void LJ(String str, String str2, String str3, String str4, boolean z) {
        TuxTextView tuxTextView = null;
        if (z) {
            TuxTextView tuxTextView2 = this.LJ;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setText(LIZJ(str2));
            TuxTextView tuxTextView3 = this.LJFF;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setText(LIZJ(str3));
            TuxTextView tuxTextView4 = this.LJI;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(LIZJ(str4));
            TuxTextView tuxTextView5 = this.LJII;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView5, 4);
            TuxTextView tuxTextView6 = this.LJIIIIZZ;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 4);
            TuxTextView tuxTextView7 = this.LJIIIZ;
            if (tuxTextView7 != null) {
                tuxTextView = tuxTextView7;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 4);
            return;
        }
        TuxTextView tuxTextView8 = this.LJII;
        if (tuxTextView8 == null) {
            tuxTextView8 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView8, 0);
        TuxTextView tuxTextView9 = this.LJIIIIZZ;
        if (tuxTextView9 == null) {
            tuxTextView9 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView9, 0);
        TuxTextView tuxTextView10 = this.LJIIIZ;
        if (tuxTextView10 == null) {
            tuxTextView10 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView10, 0);
        if (CastIntegerProtector.parseInt(str) == 0) {
            TuxTextView tuxTextView11 = this.LJII;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            tuxTextView11.setText(this.LIZ.getResources().getText(2131829567));
            TuxTextView tuxTextView12 = this.LJIIIIZZ;
            if (tuxTextView12 == null) {
                tuxTextView12 = null;
            }
            tuxTextView12.setText(this.LIZ.getResources().getText(2131829568));
            TuxTextView tuxTextView13 = this.LJIIIZ;
            if (tuxTextView13 == null) {
                tuxTextView13 = null;
            }
            tuxTextView13.setText(this.LIZ.getResources().getText(2131829573));
            TuxTextView tuxTextView14 = this.LJ;
            if (tuxTextView14 == null) {
                tuxTextView14 = null;
            }
            tuxTextView14.setText(LIZJ(str2));
            TuxTextView tuxTextView15 = this.LJFF;
            if (tuxTextView15 == null) {
                tuxTextView15 = null;
            }
            tuxTextView15.setText(LIZJ(str3));
            TuxTextView tuxTextView16 = this.LJI;
            if (tuxTextView16 != null) {
                tuxTextView = tuxTextView16;
            }
            tuxTextView.setText(LIZJ(str4));
            return;
        }
        TuxTextView tuxTextView17 = this.LJII;
        if (tuxTextView17 == null) {
            tuxTextView17 = null;
        }
        tuxTextView17.setText(this.LIZ.getResources().getText(2131829557));
        TuxTextView tuxTextView18 = this.LJIIIIZZ;
        if (tuxTextView18 == null) {
            tuxTextView18 = null;
        }
        tuxTextView18.setText(this.LIZ.getResources().getText(2131829567));
        TuxTextView tuxTextView19 = this.LJIIIZ;
        if (tuxTextView19 == null) {
            tuxTextView19 = null;
        }
        tuxTextView19.setText(this.LIZ.getResources().getText(2131829568));
        TuxTextView tuxTextView20 = this.LJ;
        if (tuxTextView20 == null) {
            tuxTextView20 = null;
        }
        tuxTextView20.setText(LIZJ(str));
        TuxTextView tuxTextView21 = this.LJFF;
        if (tuxTextView21 == null) {
            tuxTextView21 = null;
        }
        tuxTextView21.setText(LIZJ(str2));
        TuxTextView tuxTextView22 = this.LJI;
        if (tuxTextView22 != null) {
            tuxTextView = tuxTextView22;
        }
        tuxTextView.setText(LIZJ(str3));
    }
}
