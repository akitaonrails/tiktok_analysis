package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19635811s4 implements InterfaceC19637111sH {
    public final Context LIZ;
    public final C19591211ks LIZIZ;
    public TextView LIZJ;
    public CountDownStickerStruct LIZLLL;
    public LinearLayout LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public C0FG4 LJIIIIZZ;
    public C0FG4 LJIIIZ;
    public C0FG4 LJIIJ;
    public ScheduledExecutorService LJIIJJI;
    public ScheduledFuture<?> LJIIL;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 679));

    @Override // X.InterfaceC19637111sH
    public final void LIZ(C1664680tQA<LiveCountDownStickerModel> c1664680tQA, ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
    }

    public final void LIZLLL() {
        Long lValueOf;
        CountDownStickerStruct countDownStickerStruct = this.LIZLLL;
        long jLongValue = (countDownStickerStruct == null || (lValueOf = Long.valueOf(countDownStickerStruct.getMillSecond())) == null) ? 0L : lValueOf.longValue() - System.currentTimeMillis();
        int i = (int) (jLongValue / 86400000);
        long j = jLongValue % 86400000;
        int i2 = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i3 = (int) (j2 / 60000);
        int i4 = (int) ((j2 % 60000) / 1000);
        if (i >= 1) {
            LIZJ(C19637711sN.LIZ);
            C0FG4 c0fg4 = this.LJIIIIZZ;
            if (c0fg4 != null) {
                c0fg4.LIZ(i / 10, i % 10);
            }
            C0FG4 c0fg42 = this.LJIIIZ;
            if (c0fg42 != null) {
                c0fg42.LIZ(i2 / 10, i2 % 10);
            }
            C0FG4 c0fg43 = this.LJIIJ;
            if (c0fg43 != null) {
                c0fg43.LIZ(i3 / 10, i3 % 10);
                return;
            }
            return;
        }
        LIZJ(C19637811sO.LIZ);
        C0FG4 c0fg44 = this.LJIIIIZZ;
        if (c0fg44 != null) {
            c0fg44.LIZ(i2 / 10, i2 % 10);
        }
        C0FG4 c0fg45 = this.LJIIIZ;
        if (c0fg45 != null) {
            c0fg45.LIZ(i3 / 10, i3 % 10);
        }
        C0FG4 c0fg46 = this.LJIIJ;
        if (c0fg46 != null) {
            c0fg46.LIZ(i4 / 10, i4 % 10);
        }
    }

    @Override // X.InterfaceC19637111sH
    public final void destroy() {
        ScheduledFuture<?> scheduledFuture;
        ScheduledFuture<?> scheduledFuture2 = this.LJIIL;
        if (scheduledFuture2 == null || scheduledFuture2.isCancelled() || (scheduledFuture = this.LJIIL) == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // X.InterfaceC19637111sH
    public final void LIZIZ(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.d3q, viewGroup, false);
        this.LJ = linearLayout;
        linearLayout.findViewById(R.id.zg4);
        LinearLayout linearLayout2 = this.LJ;
        LinearLayout linearLayout3 = null;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        this.LIZJ = (TextView) linearLayout2.findViewById(R.id.zvr);
        LinearLayout linearLayout4 = this.LJ;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        this.LJFF = (TextView) linearLayout4.findViewById(R.id.mk8);
        LinearLayout linearLayout5 = this.LJ;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        this.LJI = (TextView) linearLayout5.findViewById(R.id.oc3);
        LinearLayout linearLayout6 = this.LJ;
        if (linearLayout6 == null) {
            linearLayout6 = null;
        }
        this.LJII = (TextView) linearLayout6.findViewById(R.id.tlj);
        LinearLayout linearLayout7 = this.LJ;
        if (linearLayout7 == null) {
            linearLayout7 = null;
        }
        this.LJIIIIZZ = (C0FG4) linearLayout7.findViewById(R.id.f0w);
        LinearLayout linearLayout8 = this.LJ;
        if (linearLayout8 == null) {
            linearLayout8 = null;
        }
        this.LJIIIZ = (C0FG4) linearLayout8.findViewById(R.id.f0x);
        LinearLayout linearLayout9 = this.LJ;
        if (linearLayout9 == null) {
            linearLayout9 = null;
        }
        this.LJIIJ = (C0FG4) linearLayout9.findViewById(R.id.f0y);
        LinearLayout linearLayout10 = this.LJ;
        if (linearLayout10 == null) {
            linearLayout10 = null;
        }
        TuxTextView tuxTextView = (TuxTextView) linearLayout10.findViewById(R.id.tv_right);
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(37.0f);
        }
        LinearLayout linearLayout11 = this.LJ;
        if (linearLayout11 == null) {
            linearLayout11 = null;
        }
        TuxTextView tuxTextView2 = (TuxTextView) linearLayout11.findViewById(R.id.zti);
        if (tuxTextView2 != null) {
            tuxTextView2.LJJJJI(37.0f);
        }
        LinearLayout linearLayout12 = this.LJ;
        if (linearLayout12 != null) {
            linearLayout3 = linearLayout12;
        }
        viewGroup.addView(linearLayout3);
    }

    public final void LIZJ(AbstractC19637511sL abstractC19637511sL) {
        if (Intrinsics.LJFF(abstractC19637511sL, C19637711sN.LIZ)) {
            TextView textView = this.LJFF;
            if (textView != null) {
                textView.setText(this.LIZ.getString(2131829557));
            }
            TextView textView2 = this.LJI;
            if (textView2 != null) {
                textView2.setText(this.LIZ.getString(2131829567));
            }
            TextView textView3 = this.LJII;
            if (textView3 != null) {
                textView3.setText(this.LIZ.getString(2131829568));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(abstractC19637511sL, C19637811sO.LIZ)) {
            TextView textView4 = this.LJFF;
            if (textView4 != null) {
                textView4.setText(this.LIZ.getString(2131829567));
            }
            TextView textView5 = this.LJI;
            if (textView5 != null) {
                textView5.setText(this.LIZ.getString(2131829568));
            }
            TextView textView6 = this.LJII;
            if (textView6 == null) {
                return;
            }
            textView6.setText(this.LIZ.getString(2131829573));
            return;
        }
        throw new C1954807lC();
    }

    public C19635811s4(Context context, C19591211ks c19591211ks) {
        this.LIZ = context;
        this.LIZIZ = c19591211ks;
    }
}
