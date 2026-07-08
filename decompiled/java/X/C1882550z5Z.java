package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882550z5Z implements C152I, InterfaceC1883280z6k {
    public final Context LL;
    public Fragment LLILLJJLI;
    public FrameLayout LLILLL;
    public C1880920z2w LLILZ;
    public Function1<? super String, Unit> LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    @Override // X.InterfaceC1883280z6k
    public final void LIZJ() {
        this.LLIZLLLIL = true;
    }

    @Override // X.InterfaceC1883280z6k
    public final void LJFF() {
        this.LLIZLLLIL = false;
        LJI(false);
    }

    @Override // X.C152I
    public final void LIZ() {
        C20441214yg.LIZIZ("GamePartnershipSearchEntityCardWidget", "onSearchGameEntityCardDestroyed");
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
        C1880920z2w c1880920z2w = this.LLILZ;
        if (c1880920z2w != null) {
            c1880920z2w.LJI();
        }
        this.LLILZ = null;
        this.LLIZLLLIL = false;
    }

    public C1882550z5Z(Context context) {
        this.LL = context;
    }

    @Override // X.InterfaceC1883280z6k
    public final void LIZLLL(boolean z) {
        this.LLIZLLLIL = !z;
        if (z) {
            LJI(this.LLJ);
        }
    }

    public final void LJI(boolean z) {
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            if (!z) {
                frameLayout.setPadding(0, 0, 0, 0);
                frameLayout.setBackground(null);
                return;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, frameLayout.getContext());
            if (numLIZJ == null) {
                return;
            }
            ColorDrawable colorDrawable = new ColorDrawable(numLIZJ.intValue());
            frameLayout.setPadding(0, 0, 0, C439101nJ.LIZ(24));
            LayerDrawable layerDrawable = new LayerDrawable(new ColorDrawable[]{colorDrawable});
            layerDrawable.setLayerGravity(0, 80);
            layerDrawable.setLayerHeight(0, C439101nJ.LIZ(8));
            frameLayout.setBackground(layerDrawable);
        }
    }

    public final View LJ(Fragment fragment, AwS589S0100000_10 awS589S0100000_10) {
        C20441214yg.LIZIZ("GamePartnershipSearchEntityCardWidget", "onSearchGameEntityCardHeaderViewCreated");
        this.LLILLJJLI = fragment;
        this.LLILZIL = awS589S0100000_10;
        FrameLayout frameLayout = new FrameLayout(this.LL);
        this.LLILLL = frameLayout;
        C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0z5a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        return this.LLILLL;
    }

    @Override // X.C152I
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, boolean z) {
        FrameLayout frameLayout;
        C20441214yg.LIZIZ("GamePartnershipSearchEntityCardWidget", "onSearchGameEntityCardDataUpdated");
        if (!this.LLIZLLLIL && Intrinsics.LJFF(str3, this.LLILZLL) && Intrinsics.LJFF(str4, this.LLIZ)) {
            C1880920z2w c1880920z2w = this.LLILZ;
            if (c1880920z2w != null) {
                c1880920z2w.LLJJI = str;
                c1880920z2w.LLJJIII = str2;
            }
            C1880920z2w c1880920z2w2 = this.LLILZ;
            if (c1880920z2w2 != null) {
                c1880920z2w2.LJIL(str5);
                return;
            }
            return;
        }
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null && (frameLayout = this.LLILLL) != null) {
            this.LLJ = z;
            this.LLILZLL = str3;
            this.LLIZ = str4;
            C786410Ut5.LJJJJIZL(frameLayout);
            C1880920z2w c1880920z2w3 = this.LLILZ;
            if (c1880920z2w3 != null) {
                c1880920z2w3.LJI();
            }
            C1880920z2w c1880920z2w4 = new C1880920z2w(this.LL, fragment, str3, str4, this.LLILZIL);
            c1880920z2w4.LLJJI = str;
            c1880920z2w4.LLJJIII = str2;
            c1880920z2w4.LJIL(str5);
            c1880920z2w4.LJIIIZ().LJIJI(this);
            c1880920z2w4.h(frameLayout);
            this.LLILZ = c1880920z2w4;
        }
    }
}
