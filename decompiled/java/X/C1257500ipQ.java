package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ipQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257500ipQ extends C19U1 {
    public int LL;
    public AbstractC480470Isn LLILLJJLI;
    public FragmentStateAdapter LLILLL;
    public final Map<Integer, C1257950iq9> LLILZ;
    public final Map<Integer, Integer> LLILZIL;
    public final Map<Integer, View> LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public C0P0T LLJ;
    public ProfileComponents LLJI;
    public List<? extends ITabBusinessListener> LLJIJIL;

    public final void LJFF() {
        C21546519Tz c21546519Tz;
        if (getTabMode() == 0) {
            int tabCount = getTabCount();
            for (int i = 0; i < tabCount; i++) {
                C19U0 tabAt = getTabAt(i);
                if (tabAt != null && (c21546519Tz = tabAt.LJIIIIZZ) != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), -1);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546519Tz);
                    c21546519Tz.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final int getLandingTabType() {
        return this.LLIZLLLIL;
    }

    public final ProfileComponents getProfileComponents() {
        return this.LLJI;
    }

    public final C0P0T getSortToolTips() {
        return this.LLJ;
    }

    public final int getTabViewMode() {
        return this.LL;
    }

    public final boolean getTextNavigatorScrollable() {
        return this.LLIZ;
    }

    public static int LJ(String str) {
        LocaleSpan localeSpan = new LocaleSpan(Resources.getSystem().getConfiguration().locale);
        Paint paint = new Paint();
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, localeSpan, 0, spannableString.length(), 33);
        paint.setTextSize(C418440Gaw.LIZIZ(16));
        return (int) paint.measureText(spannableString, 0, spannableString.length());
    }

    public static void LJI(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view2.setBackground(null);
        }
    }

    public static void LJII(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view2.onTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            view2.onTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, 0.0f, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C698190Ra5 LIZJ(int r7) {
        /*
            r6 = this;
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r6.LLJI
            r4 = 0
            if (r0 == 0) goto L4f
            java.util.List<? extends com.ss.android.ugc.profile.platform.base.data.ProfileComponents> r0 = r0.components
            if (r0 == 0) goto L4f
            java.util.Iterator r5 = r0.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = (com.ss.android.ugc.profile.platform.base.data.ProfileComponents) r0
            java.lang.String r2 = r0.componentName
            X.0ibm r0 = X.C1249040ibm.LIZ
            r0.getClass()
            java.util.Map r1 = X.C1249040ibm.LIZ()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto Ld
        L33:
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r3 = (com.ss.android.ugc.profile.platform.base.data.ProfileComponents) r3
            if (r3 == 0) goto L4f
            com.google.gson.n r0 = r3.bizData
            if (r0 == 0) goto L4f
            goto L3e
        L3c:
            r3 = r4
            goto L33
        L3e:
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L4b
            java.lang.Class<com.ss.android.ugc.profile.platform.base.data.BizBaseData> r0 = com.ss.android.ugc.profile.platform.base.data.BizBaseData.class
            java.lang.Object r1 = X.C1250210idf.LIZ(r1, r0)     // Catch: java.lang.Exception -> L4b
            com.ss.android.ugc.profile.platform.base.data.BizBaseData r1 = (com.ss.android.ugc.profile.platform.base.data.BizBaseData) r1     // Catch: java.lang.Exception -> L4b
            goto L50
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            r1 = r4
        L50:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C1721460utk.LIZ
            android.content.Context r3 = r6.getContext()
            if (r1 == 0) goto L75
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r1.getIcon()
            if (r0 == 0) goto L75
            java.lang.String r2 = r0.getLocalIcon()
        L62:
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r1.getIcon()
            if (r0 == 0) goto L6c
            java.lang.String r4 = r0.getIconColor()
        L6c:
            java.lang.String r1 = "profile_tab_base_item"
            java.lang.String r0 = ""
            X.0Ra5 r0 = X.C1721460utk.LIZJ(r3, r2, r4, r1, r0)
            return r0
        L75:
            r2 = r4
            if (r1 == 0) goto L6c
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1257500ipQ.LIZJ(int):X.0Ra5");
    }

    public final void setLandingTabType(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setMode(int i) {
        setTabMode(1);
        this.LL = i;
        setTabGravity(0);
    }

    public final void setProfileComponents(ProfileComponents profileComponents) {
        this.LLJI = profileComponents;
    }

    public final void setSortToolTips(C0P0T c0p0t) {
        this.LLJ = c0p0t;
    }

    @Override // X.C19U1
    public void setTabMode(int i) {
        super.setTabMode(i);
        if (this.LLILLL != null) {
            LJFF();
        }
    }

    public final void setTextNavigatorScrollable(boolean z) {
        this.LLIZ = z;
    }

    public C1257500ipQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = new LinkedHashMap();
        this.LLIZ = true;
    }

    public static void LIZ(int i, View view) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "profile_nav_bar_action_view_id", true, false)) {
            return;
        }
        C1249040ibm.LIZ.getClass();
        String str = (String) C1249040ibm.LIZ().get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        C1248990ibh.LIZ(view, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1257680ipi LIZLLL(android.content.Context r18, X.C1257950iq9 r19) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1257500ipQ.LIZLLL(android.content.Context, X.0iq9):X.0ipi");
    }

    public static int LIZIZ(int i, boolean z, AbstractC480470Isn abstractC480470Isn) {
        int count;
        if (abstractC480470Isn != null) {
            count = abstractC480470Isn.getCount();
        } else {
            count = 0;
        }
        if (count <= i) {
            return 0;
        }
        if (z && (abstractC480470Isn instanceof C1258150iqT)) {
            C1258150iqT c1258150iqT = (C1258150iqT) abstractC480470Isn;
            if (c1258150iqT == null) {
                return 0;
            }
            return ((Integer) ListProtector.get(c1258150iqT.LLIZLLLIL, i)).intValue();
        }
        if (abstractC480470Isn == null) {
            return 0;
        }
        return (int) abstractC480470Isn.LJJIJL(i);
    }
}
