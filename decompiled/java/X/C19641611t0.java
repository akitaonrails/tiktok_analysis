package X;

import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.AfS198S0100000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ogc.news.sticker.common.ArticleStickerStorage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19641611t0 implements InterfaceC2485909of {
    public final FrameLayout LIZ;
    public final ArticleStickerStorage LIZIZ;
    public AObserverS231S0100000_29 LIZJ;
    public C11JF LIZLLL = (C11JF) C11NZ.LJJJJI(new ACallableS432S0100000_29(this, 12)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS198S0100000_29(this, 50));

    public final void LIZIZ() {
        try {
            View viewFindViewWithTag = this.LIZ.findViewWithTag("ArticleStickerNewTag");
            if (viewFindViewWithTag != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC2485909of
    public final void release() {
        AObserverS231S0100000_29 aObserverS231S0100000_29 = this.LIZJ;
        if (aObserverS231S0100000_29 != null) {
            this.LIZIZ.getClass();
            ArticleStickerStorage.LJI.removeObserver(aObserverS231S0100000_29);
            this.LIZJ = null;
        }
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
    }

    public static TuxTextView LIZ(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        tuxTextView.setBackground(gradientDrawable);
        tuxTextView.setTuxFont(92);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, context);
        if (numLIZJ2 != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        tuxTextView.setText(C20467080b.LIZIZ(2131826647));
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
        return tuxTextView;
    }

    public C19641611t0(FrameLayout frameLayout, ArticleStickerStorage articleStickerStorage) {
        this.LIZ = frameLayout;
        this.LIZIZ = articleStickerStorage;
    }
}
