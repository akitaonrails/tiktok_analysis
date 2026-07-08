package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FOX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOX extends AbstractC19563811gS<C0FOY, C0FGX> {
    public int LLL;

    @Override // X.AbstractC19563811gS
    public final void LLLLLL() {
        super.LLLLLL();
        View view = this.LLJLLL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 10), view);
        }
    }

    @Override // X.AbstractC19563811gS
    public final void LLLLLLIL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C387490FHf) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 146));
        super.LLLLLLIL();
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FOV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 147));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FOW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 148));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FOb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJIIJ;
            }
        }, new AwS584S0100000_5(this, 149));
    }

    @Override // X.AbstractC19563811gS
    public final RecyclerView.ViewHolder LLLLLJLJLL(ViewGroup viewGroup) {
        int i;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(requireSceneContext());
        if (C357780E0y.LIZ()) {
            i = R.layout.fso;
        } else {
            i = R.layout.fsn;
        }
        C0FOY c0foy = new C0FOY(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
        int i2 = this.LLL;
        if (i2 > 0 && (viewFindViewById = c0foy.LL.findViewById(R.id.l1o)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = i2;
        }
        return c0foy;
    }

    @Override // X.AbstractC19563811gS
    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder, C0FGT c0fgt) {
        ViewGroup.LayoutParams layoutParams;
        UrlModel iconUrl;
        List<String> url_list;
        C0FOY c0foy = (C0FOY) viewHolder;
        int i = this.LLL;
        if (i <= 0) {
            c0foy.getClass();
        } else {
            View viewFindViewById = c0foy.LL.findViewById(R.id.l1o);
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.height = i;
            }
        }
        Effect effect = c0fgt.LIZ;
        if (effect != null && (iconUrl = effect.getIconUrl()) != null && (url_list = iconUrl.getUrl_list()) != null) {
            SmartImageView smartImageView = c0foy.LLILLJJLI;
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(url_list));
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIJ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        c0foy.LLILLL.setSelected(c0fgt.LIZJ);
        EnumC1641420soe enumC1641420soe = c0fgt.LIZLLL;
        Integer numValueOf = Integer.valueOf(c0fgt.LJ);
        int i2 = C0FOZ.LIZ[enumC1641420soe.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C337180DJs.LIZ(c0foy.LLILZ);
                    C337180DJs.LIZ(c0foy.LLILZIL);
                } else {
                    C337180DJs.LIZ(c0foy.LLILZ);
                }
            } else {
                c0foy.LLILZ.setProgress(100);
                C337180DJs.LIZ(c0foy.LLILZ);
                C337180DJs.LIZ(c0foy.LLILZIL);
            }
        } else {
            C337180DJs.LIZJ(c0foy.LLILZ);
            C337180DJs.LIZ(c0foy.LLILZIL);
        }
        if (numValueOf != null) {
            c0foy.LLILZ.setProgress(numValueOf.intValue());
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
