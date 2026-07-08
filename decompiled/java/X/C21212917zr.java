package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212917zr {
    public final C19343010lw LIZ = new C19343010lw();
    public final ShopBagIconGuidanceAnimConfigSettings.ECShopBagAnimConfig LIZIZ = ShopBagIconGuidanceAnimConfigSettings.LIZ().config;
    public final int LIZJ;
    public WeakReference<BagGuideTooltipController> LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public WeakReference<Context> LJIIZILJ;
    public int LJIJ;
    public Function0<Boolean> LJIJI;
    public Function0<Unit> LJIJJ;
    public Function0<Unit> LJIJJLI;
    public C21200117xn LJIL;
    public C21200017xm LJJ;
    public LiveBagIconAnimation LJJI;
    public LiveBagIconAnimationItem LJJIFFI;
    public AnonymousClass1800 LJJII;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212917zr.LIZ():void");
    }

    public final AnonymousClass1800 LIZIZ() {
        WeakReference<Context> weakReference = this.LJIIZILJ;
        Context context = weakReference != null ? weakReference.get() : null;
        AnonymousClass1800 anonymousClass1800 = this.LJJII;
        if (anonymousClass1800 != null) {
            anonymousClass1800.init(context);
            return anonymousClass1800;
        }
        int i = this.LIZJ;
        if (i == 1) {
            C20533615Wk c20533615Wk = C20533615Wk.LIZ;
            this.LJJII = c20533615Wk;
            return c20533615Wk;
        }
        if (i != 2) {
            return null;
        }
        C15O6 c15o6 = new C15O6();
        c15o6.LIZ = context;
        this.LJJII = c15o6;
        return c15o6;
    }

    public final void LIZJ() {
        C21200017xm c21200017xm;
        C21200117xn c21200117xn = this.LJIL;
        if (c21200117xn != null && (c21200017xm = this.LJJ) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LJIL = null;
        Function0<Unit> function0 = this.LJIJJLI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LJ() {
        LIZLLL("show_anim", null, true);
        Long l = this.LJ;
        if (l != null) {
            long jLongValue = l.longValue();
            C19343010lw c19343010lw = this.LIZ;
            String str = this.LJFF;
            Keva keva = c19343010lw.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_anim_room_set_");
            sbLIZ.append(str);
            String[] stringArray = keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
            C19343010lw c19343010lw2 = this.LIZ;
            ArrayList arrayList = new ArrayList();
            C19719612Di.LJJII(arrayList, stringArray);
            arrayList.add(String.valueOf(jLongValue));
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String str2 = this.LJFF;
            Keva keva2 = c19343010lw2.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("show_anim_room_set_");
            sbLIZ2.append(str2);
            keva2.storeStringArray(C2188811AlT.LIZIZ(sbLIZ2), strArr);
            C21213217zu.LIZLLL = this.LJI;
        }
    }

    public C21212917zr() {
        C21213117zt.LIZ.getClass();
        this.LIZJ = C21213117zt.LJII();
        this.LJFF = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r0.isEmpty() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ac, code lost:
    
        if (r0 >= 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.List r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.LJIILL
            if (r0 != 0) goto L5a
            r2 = 1
            r7.LJIILL = r2
            r4 = 0
            if (r8 == 0) goto L26
            java.lang.Object r0 = X.C13LP.LJJJLL(r8)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation) r0
            if (r0 == 0) goto L26
            java.lang.Integer r0 = r0.animationType
            int r1 = r7.LIZJ
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
            if (r0 != r1) goto L26
            java.lang.Object r0 = X.C13LP.LJJJLL(r8)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation) r0
            r7.LJJI = r0
        L26:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation r6 = r7.LJJI
            r5 = 0
            if (r6 == 0) goto L3c
            int r1 = r7.LIZJ
            if (r1 == r2) goto L6e
            r0 = 2
            if (r1 != r0) goto L3c
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationItem> r0 = r6.animationItemList
            if (r0 == 0) goto L3c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La2
        L3c:
            if (r8 == 0) goto L4c
            boolean r0 = X.C290560BaA.LIZ()
            if (r0 == 0) goto L5e
            X.07yb r0 = new X.07yb
            r0.<init>(r8)
            X.C1440005kM.LIZIZ(r0)
        L4c:
            r7.LIZJ()
            if (r9 == 0) goto L5b
            java.lang.String r1 = "time_out"
        L53:
            java.lang.String r0 = "before_show"
            r7.LIZLLL(r0, r1, r4)
            X.C21213217zu.LIZLLL = r5
        L5a:
            return
        L5b:
            java.lang.String r1 = "no_animation_data"
            goto L53
        L5e:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController> r0 = r7.LIZLLL
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController r0 = (com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.bagicon.BagGuideTooltipController) r0
            if (r0 == 0) goto L4c
            r0.handleLiveBagIconAnimationInfos(r8)
            goto L4c
        L6e:
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage> r0 = r6.animationImgList
            if (r0 == 0) goto L3c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            java.util.List<java.lang.String> r0 = r6.animationTextList
            if (r0 == 0) goto L3c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage> r0 = r6.animationImgList
            if (r0 == 0) goto L3c
            int r0 = r0.size()
            r1 = 3
            if (r0 <= r1) goto Lac
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation r3 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation
            java.lang.Integer r2 = r6.animationType
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage> r0 = r6.animationImgList
            if (r0 == 0) goto L99
            java.util.List r5 = r0.subList(r4, r1)
        L99:
            java.util.List<java.lang.String> r1 = r6.animationTextList
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationItem> r0 = r6.animationItemList
            r3.<init>(r2, r5, r1, r0)
            r7.LJJI = r3
        La2:
            X.17xn r0 = r7.LJIL
            if (r0 == 0) goto La8
            r0.LIZLLL = r4
        La8:
            r7.LIZ()
            return
        Lac:
            if (r0 < r1) goto L3c
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212917zr.LJFF(java.util.List, boolean):void");
    }

    public final void LIZLLL(String str, String str2, boolean z) {
        String string;
        Long l = this.LJ;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        C1421105hJ.LIZLLL("rd_tiktokec_shop_bag_anim_event", new Pair("room_id", string), new Pair("enter_from_merge", this.LJI), new Pair("enter_method", this.LJII), new Pair("action_type", this.LJIIIIZZ), new Pair("anim_type", Integer.valueOf(this.LIZJ)), new Pair("step", str), new Pair("is_success", Integer.valueOf(z ? 1 : 0)), new Pair("error_msg", str2), new Pair("is_rtl", Integer.valueOf(this.LJIIIZ ? 1 : 0)));
    }
}
