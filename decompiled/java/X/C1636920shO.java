package X;

import Y.ACListenerS159S0100000_25;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0shO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636920shO extends AbstractC1622390sJx implements InterfaceC1159800gHq {
    public final C19GS LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final ShortVideoContext LLILZ;
    public Effect LLILZIL;
    public View LLILZLL;
    public C0P0T LLIZ;

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LLIZ;
        if (c0p0t2 == null || !c0p0t2.isShowing() || (c0p0t = this.LLIZ) == null) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        this.LLILZLL = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // X.AbstractC1622390sJx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI(X.C1627370sRz r4) {
        /*
            r3 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.LIZ
            r3.LLILZIL = r0
            int r0 = r4.LIZIZ
            r1 = 1
            if (r0 <= 0) goto L5c
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r3.LLILLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLILZIL
            if (r0 == 0) goto L5c
            boolean r0 = r0.isBusiness()
            r2 = 0
            if (r0 != r1) goto L5c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLILZIL
            boolean r0 = X.C1624200sMs.LJIIIIZZ(r0)
            if (r0 != 0) goto L5c
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.LLILZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 == 0) goto L5c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLILZIL
            if (r0 == 0) goto L62
            java.util.List r0 = r0.getMusic()
            if (r0 == 0) goto L62
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L62
        L46:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLILZIL
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.getParentId()
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L5c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLILZIL
            boolean r0 = X.C1624570sNT.LJIL(r0)
            if (r0 == 0) goto L5d
        L5c:
            r2 = 1
        L5d:
            r0 = r2 ^ 1
            return r0
        L60:
            r0 = 0
            goto L4e
        L62:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.LLILZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 == 0) goto L5c
            boolean r0 = r0.isShouldShowCommerceTips()
            if (r0 != r1) goto L5c
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1636920shO.LJJI(X.0sRz):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        int i;
        ViewPager viewPager;
        C1636900shM c1636900shM;
        Map<Integer, InterfaceC1631590sYn<Fragment>> map;
        InterfaceC1631590sYn interfaceC1631590sYn;
        View view;
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        View viewFindViewByPosition;
        float fLIZIZ;
        Effect effect = c1627370sRz.LIZ;
        this.LLILZIL = effect;
        if (C1624200sMs.LJIILL(effect)) {
            i = 2131837743;
        } else {
            i = 2131837744;
        }
        View view2 = this.LLILZLL;
        PagerAdapter adapter = null;
        if (view2 != null) {
            viewPager = (ViewPager) view2.findViewById(R.id.viewpager_sticker);
            if (viewPager != null) {
                adapter = viewPager.getAdapter();
            }
        } else {
            viewPager = null;
        }
        if ((adapter instanceof C1636900shM) && (c1636900shM = (C1636900shM) adapter) != null && (map = c1636900shM.LLJIJIL) != null && (interfaceC1631590sYn = (InterfaceC1631590sYn) map.get(Integer.valueOf(viewPager.getCurrentItem()))) != 0) {
            interfaceC1631590sYn.LJJZZI();
            Fragment fragment = (Fragment) interfaceC1631590sYn;
            if (fragment != null && (view = fragment.getView()) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.w6_)) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (viewFindViewByPosition = layoutManager.findViewByPosition(c1627370sRz.LIZIZ)) != null) {
                int i2 = c1627370sRz.LIZIZ % 5;
                if (i2 != 1 && i2 != 2) {
                    fLIZIZ = C11VU.LIZIZ(22.0f, this.LLILLJJLI);
                } else {
                    fLIZIZ = C11VU.LIZIZ(12.0f, this.LLILLJJLI);
                }
                C450720Hlu c450720Hlu = new C450720Hlu(viewFindViewByPosition.getContext());
                EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZLLL = enumC1235690iGF;
                c1391600mJi.LIZIZ = viewFindViewByPosition;
                c1391600mJi.LJII = 3000L;
                c450720Hlu.LJIIJ(i);
                c450720Hlu.LLILLJJLI.LJIIIIZZ = (int) fLIZIZ;
                c450720Hlu.LJIIIZ(true, new ACListenerS159S0100000_25(this, 60));
                C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                this.LLIZ = c0p0tLIZIZ;
                c0p0tLIZIZ.show();
            }
        }
    }

    public C1636920shO(C19GS c19gs, AwS552S0100000_8 awS552S0100000_8, ShortVideoContext shortVideoContext) {
        this.LLILLJJLI = c19gs;
        this.LLILLL = awS552S0100000_8;
        this.LLILZ = shortVideoContext;
    }
}
