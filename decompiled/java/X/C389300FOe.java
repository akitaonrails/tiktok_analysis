package X;

import Y.ACListenerS140S0100000_5;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389300FOe extends AbstractC19563811gS<C389310FOf, C387340FGq> {
    public int LLL;

    @Override // X.AbstractC19563811gS
    public final void LLLLLL() {
        super.LLLLLL();
        View view = this.LLJLLL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 9), view);
        }
    }

    @Override // X.AbstractC19563811gS
    public final void LLLLLLIL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C387490FHf) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 141));
        super.LLLLLLIL();
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FOc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 142));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 143));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FOi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJIIJ;
            }
        }, new AwS584S0100000_5(this, 144));
    }

    @Override // X.AbstractC19563811gS
    public final RecyclerView.ViewHolder LLLLLJLJLL(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(requireSceneContext()), R.layout.fsn, viewGroup, false);
        C389310FOf c389310FOf = new C389310FOf(viewTd);
        C786410Ut5.W5(viewTd, new RecyclerView.LayoutParams(-1, this.LLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        c389310FOf.I5(this.LLL);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.cf0);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C426750GoL.LJIIIZ(viewTd, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 0, false, 16);
        return c389310FOf;
    }

    @Override // X.AbstractC19563811gS
    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder, C0FGT c0fgt) {
        String name;
        UrlModel iconUrl;
        List<String> url_list;
        C389310FOf c389310FOf = (C389310FOf) viewHolder;
        c389310FOf.I5(this.LLL);
        Effect effect = c0fgt.LIZ;
        if (effect != null && (iconUrl = effect.getIconUrl()) != null && (url_list = iconUrl.getUrl_list()) != null) {
            SmartImageView smartImageView = c389310FOf.LLILLJJLI;
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(url_list));
            c1331670kl3LJIIJ.LIZLLL = true;
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIJ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        c389310FOf.LLILLL.setSelected(c0fgt.LIZJ);
        if (c0fgt.LIZJ) {
            C427150Goz c427150Goz = c389310FOf.LLILZ;
            int visibility = c427150Goz.getVisibility();
            c427150Goz.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c427150Goz);
            c427150Goz.setStoppedMarquee(false);
            c427150Goz.setSelected(true);
            C786410Ut5.LLLLZLL(c389310FOf.LLILZIL, 8);
            C786410Ut5.LJLLLLLL(8, c389310FOf.LLILZLL);
        } else {
            C427150Goz c427150Goz2 = c389310FOf.LLILZ;
            int visibility2 = c427150Goz2.getVisibility();
            c427150Goz2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c427150Goz2);
            c427150Goz2.setStoppedMarquee(true);
            c427150Goz2.setSelected(false);
            C786410Ut5.LLLLZLL(c389310FOf.LLILZIL, 0);
            C786410Ut5.LJLLLLLL(0, c389310FOf.LLILZLL);
        }
        TuxTextView tuxTextView = c389310FOf.LLILZIL;
        Effect effect2 = c0fgt.LIZ;
        String name2 = null;
        if (effect2 != null) {
            name = effect2.getName();
        } else {
            name = null;
        }
        tuxTextView.setText(name);
        C427150Goz c427150Goz3 = c389310FOf.LLILZ;
        Effect effect3 = c0fgt.LIZ;
        if (effect3 != null) {
            name2 = effect3.getName();
        }
        c427150Goz3.setText(name2);
        if (C2281551ESb.LIZIZ.LJJIJ()) {
            EnumC1641420soe enumC1641420soe = c0fgt.LIZLLL;
            Integer numValueOf = Integer.valueOf(c0fgt.LJ);
            int i = C389320FOg.LIZ[enumC1641420soe.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C337180DJs.LIZ(c389310FOf.LLIZ);
                        C337180DJs.LIZ(c389310FOf.LLIZLLLIL);
                    } else {
                        C337180DJs.LIZ(c389310FOf.LLIZ);
                        C337180DJs.LIZJ(c389310FOf.LLIZLLLIL);
                    }
                } else {
                    c389310FOf.LLIZ.setProgress(100);
                    C337180DJs.LIZ(c389310FOf.LLIZ);
                    C337180DJs.LIZ(c389310FOf.LLIZLLLIL);
                }
            } else {
                C337180DJs.LIZJ(c389310FOf.LLIZ);
                C337180DJs.LIZ(c389310FOf.LLIZLLLIL);
            }
            if (numValueOf != null) {
                c389310FOf.LLIZ.setProgress(numValueOf.intValue());
            }
        }
    }

    @Override // X.AbstractC19563811gS, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroupOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View view = this.LLJLLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (LLLLILI().LIZ.LJIIJJI > 0 && (layoutParams = viewGroupOnCreateView.getLayoutParams()) != null) {
            layoutParams.height = LLLLILI().LIZ.LJIIJJI + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        }
        return viewGroupOnCreateView;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
