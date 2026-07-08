package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418830n1d extends AbstractC1664490tPr<C1418670n1N, C1417770mzv> implements InterfaceC1436400nTy {
    public static final /* synthetic */ int LLLLJ = 0;
    public LinearLayout LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxIconView LLJZ;
    public RecyclerView LLJZIJLIL;
    public View LLL;
    public C427870Gq9 LLLF;
    public C0GTR LLLFF;
    public LinearLayout LLLFFI;
    public ViewGroup LLLFZ;
    public View LLLI;
    public FrameLayout LLLII;
    public TuxIconView LLLIIII;
    public C371310Eh7 LLLIIIIL;
    public TuxTextView LLLIIIL;
    public Animator LLLIIL;
    public C1420490n4J LLLIL;
    public View LLLILZ;
    public View LLLILZJ;
    public TuxIconView LLLILZLLLI;
    public AutoCutCategory LLLJL;
    public C1418950n1p LLLLII;
    public final C01GW LLLIILIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS190S0000000_4.get$arr$(1953));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 258));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 257));
    public final LinkedHashMap<AutoCutCategory, List<AutoCutThemeData>> LLLJIL = new LinkedHashMap<>();
    public int LLLL = -1;
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(126));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 172));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 254));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 255));
    public final C01GW LLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(121));
    public final C01GW LLLLILI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 256));

    public final boolean LLLLLJLJLL() {
        return ((Boolean) this.LLLLIILLL.getValue()).booleanValue();
    }

    public final VideoPublishEditModel LLLLLL() {
        return (VideoPublishEditModel) this.LLLLIIL.getValue();
    }

    public final boolean LLLLLLIL() {
        return ((Boolean) this.LLLLILI.getValue()).booleanValue();
    }

    public final void LLLLLLLLLL() {
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C337180DJs.LIZJ((View) this.LLLIZZ.getValue());
    }

    public static final void LLLLLJIL(View view) {
        GradientDrawable gradientDrawable;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        ((InterfaceC332260D0u) this.LLLIILIL.getValue()).setValue(EnumC319780CgC.SAVING);
        TuxTextView tuxTextView = this.LLLIIIL;
        if (tuxTextView != null) {
            tuxTextView.setText("0%");
        }
        C371310Eh7 c371310Eh7 = this.LLLIIIIL;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(0);
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void LJJJLIIL(String str) {
        ((InterfaceC332260D0u) this.LLLIILIL.getValue()).setValue(EnumC319780CgC.IDLE);
        TuxTextView tuxTextView = this.LLLIIIL;
        if (tuxTextView != null) {
            tuxTextView.setText("100%");
        }
        C371310Eh7 c371310Eh7 = this.LLLIIIIL;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(100);
        }
    }

    public final EnumC1154250g8t LLLLLLJ(Boolean bool) {
        if (!LLLLLJLJLL()) {
            return null;
        }
        if (!C1418880n1i.LIZ() && !LLLLILI().LIZ.LJIILLIIL) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_autocut_switch_pop_none_pos", true) == 1) {
                return EnumC1154250g8t.FIRST_IN_TEMPLATE_LIST;
            }
            return EnumC1154250g8t.LEFT_TOP_CORNER;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return EnumC1154250g8t.LEFT_IN_BAR;
        }
        if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
            return null;
        }
        return EnumC1154250g8t.LEFT_TOP_CORNER;
    }

    public final Pair<AutoCutCategory, Integer> LLLLLLL(int i) {
        int size = i;
        for (Map.Entry<AutoCutCategory, List<AutoCutThemeData>> entry : this.LLLJIL.entrySet()) {
            AutoCutCategory key = entry.getKey();
            List<AutoCutThemeData> value = entry.getValue();
            if (size < value.size()) {
                return new Pair<>(key, Integer.valueOf(size));
            }
            size -= value.size();
        }
        return new Pair<>(null, Integer.valueOf(i));
    }

    public final void LLLLLLLLL(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLLIIII;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C371310Eh7 c371310Eh7 = this.LLLIIIIL;
            if (c371310Eh7 != null) {
                int visibility = c371310Eh7.getVisibility();
                c371310Eh7.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c371310Eh7);
            }
            TuxTextView tuxTextView = this.LLLIIIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLLIIII;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
        C371310Eh7 c371310Eh72 = this.LLLIIIIL;
        if (c371310Eh72 != null) {
            int visibility2 = c371310Eh72.getVisibility();
            c371310Eh72.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c371310Eh72);
        }
        TuxTextView tuxTextView2 = this.LLLIIIL;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06aa  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418830n1d.onActivityCreated(android.os.Bundle):void");
    }

    public final int LLLLLLLZIL(AutoCutCategory autoCutCategory, int i) {
        if (!this.LLLJIL.isEmpty() && autoCutCategory != null) {
            int size = 0;
            for (Map.Entry<AutoCutCategory, List<AutoCutThemeData>> entry : this.LLLJIL.entrySet()) {
                AutoCutCategory key = entry.getKey();
                List<AutoCutThemeData> value = entry.getValue();
                if (Intrinsics.LJFF(key, autoCutCategory)) {
                    return i + size;
                }
                size += value.size();
            }
            return size;
        }
        return i;
    }

    @Override // X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        int iIntValue;
        ((InterfaceC332260D0u) this.LLLIILIL.getValue()).setValue(EnumC319780CgC.SAVING);
        TuxTextView tuxTextView = this.LLLIIIL;
        int iIntValue2 = 0;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            sbLIZ.append(iIntValue);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C371310Eh7 c371310Eh7 = this.LLLIIIIL;
        if (c371310Eh7 != null) {
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            c371310Eh7.setProgress(iIntValue2);
        }
    }

    @Override // X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        ((InterfaceC332260D0u) this.LLLIILIL.getValue()).setValue(EnumC319780CgC.SAVING);
        TuxTextView tuxTextView = this.LLLIIIL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C371310Eh7 c371310Eh7 = this.LLLIIIIL;
        if (c371310Eh7 != null) {
            c371310Eh7.setProgress(i);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.vz, viewGroup, false);
    }
}
