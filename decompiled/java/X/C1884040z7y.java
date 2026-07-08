package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884040z7y extends PagerAdapter implements InterfaceC469360Ias {
    public final boolean LLILLJJLI;
    public List<? extends Object> LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public final Map<Object, Boolean> LLILZLL;
    public float LLIZ;
    public final /* synthetic */ GameIntroCardAssem LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return this.LLILLL.indexOf(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        int iLJIIZILJ;
        int i2;
        float f;
        if (this.LLILLJJLI) {
            iLJIIZILJ = C497740JfY.LJIILLIIL();
            i2 = GameIntroCardAssem.LLLF;
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
            i2 = GameIntroCardAssem.LLLF;
        }
        int i3 = iLJIIZILJ - (i2 * 2);
        if (this.LLILZ == 1) {
            f = this.LLILZIL;
        } else {
            f = this.LLIZ;
        }
        return f / i3;
    }

    public final void LJJIJIL(int i) {
        C1883060z6O c1883060z6OLJIIJJI;
        C1881800z4M c1881800z4MLJIIIIZZ;
        if (i >= 0 && i < this.LLILLL.size()) {
            Object obj = ListProtector.get(this.LLILLL, i);
            GameIntroViewModel gameIntroViewModelIp = this.LLIZLLLIL.ip();
            InterfaceC1881340z3c interfaceC1881340z3cVQ2 = gameIntroViewModelIp.vQ2();
            if (interfaceC1881340z3cVQ2 != null && (c1883060z6OLJIIJJI = interfaceC1881340z3cVQ2.LJIIJJI()) != null && (c1881800z4MLJIIIIZZ = c1883060z6OLJIIJJI.LJIIIIZZ()) != null && c1881800z4MLJIIIIZZ.LIZ == ((C1155600gB4) gameIntroViewModelIp.LLILLJJLI.getValue()).LLILLL.LIZ.LIZ) {
                Object obj2 = ((LinkedHashMap) this.LLILZLL).get(obj);
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.LJFF(obj2, bool)) {
                    if (obj instanceof ImageModel) {
                        InterfaceC1881340z3c interfaceC1881340z3cVQ22 = this.LLIZLLLIL.ip().vQ2();
                        String str = ((C1155600gB4) this.LLIZLLLIL.ip().LLILLJJLI.getValue()).LLILLL.LIZ.LIZIZ;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_module_show");
                        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3cVQ22))));
                        c474500IjALIZ.LJJII("user_game_detail_picture", "module_name");
                        c474500IjALIZ.LJJII(String.valueOf(i + 1), "card_order");
                        c474500IjALIZ.LJJII(str, "tab_name");
                        c474500IjALIZ.LIZ();
                    } else if (obj instanceof GameStationGameInfo.Video) {
                        InterfaceC1881340z3c interfaceC1881340z3cVQ23 = this.LLIZLLLIL.ip().vQ2();
                        String str2 = ((C1155600gB4) this.LLIZLLLIL.ip().LLILLJJLI.getValue()).LLILLL.LIZ.LIZIZ;
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gamepad_module_show");
                        c474500IjALIZ2.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1881340z3cVQ23))));
                        c474500IjALIZ2.LJJII("user_game_detail_video", "module_name");
                        c474500IjALIZ2.LJJII(String.valueOf(i + 1), "card_order");
                        c474500IjALIZ2.LJJII(str2, "tab_name");
                        c474500IjALIZ2.LIZ();
                    }
                    this.LLILZLL.put(obj, bool);
                }
            }
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        LJJIJIL(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(final int r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
            r1 = 2131568254(0x7f0d267e, float:1.8762101E38)
            r0 = 0
            android.view.View r3 = X.C786410Ut5.Td(r2, r1, r7, r0)
            r0 = 2131377720(0x7f0a3e38, float:1.8375652E38)
            android.view.View r2 = r3.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131377713(0x7f0a3e31, float:1.8375638E38)
            android.view.View r4 = r3.findViewById(r0)
            java.util.List<? extends java.lang.Object> r0 = r5.LLILLL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.game.model.GameStationGameInfo.Video
            if (r0 == 0) goto L61
            X.C500260Jjc.LLFFF(r4)
            com.bytedance.android.livesdk.game.model.GameStationGameInfo$Video r1 = (com.bytedance.android.livesdk.game.model.GameStationGameInfo.Video) r1
            if (r1 == 0) goto L43
            com.bytedance.android.live.base.model.ImageModel r0 = r1.cover
            if (r0 == 0) goto L43
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L43
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L45
        L43:
            java.lang.String r1 = ""
        L45:
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.setUrl(r1)
            r0 = 1
            r1.LJIL = r0
            r1.LJJI(r2)
            r7.addView(r3)
            X.0z7z r1 = new X.0z7z
            com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem r0 = r5.LLIZLLLIL
            r1.<init>()
            X.C786410Ut5.Q7(r2, r1)
            return r3
        L61:
            X.C500260Jjc.LJIILIIL(r4)
            boolean r0 = r1 instanceof com.bytedance.android.live.base.model.ImageModel
            if (r0 == 0) goto L43
            com.bytedance.android.live.base.model.ImageModel r1 = (com.bytedance.android.live.base.model.ImageModel) r1
            if (r1 == 0) goto L43
            java.util.List r0 = r1.getUrls()
            if (r0 == 0) goto L43
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L45
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884040z7y.LJJI(int, android.view.ViewGroup):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1884040z7y(com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem r11, boolean r12, java.util.List<? extends java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884040z7y.<init>(com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroCardAssem, boolean, java.util.List):void");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        C786410Ut5.LJJJLZIJ(view, viewGroup);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        LJJIJIL(i);
    }
}
