package X;

import Y.ACListenerS124S0200000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376770lvn implements InterfaceC1370290llL {
    public final C1376720lvi LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1393));

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        C1374250lrj c1374250lrj;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLJJLI.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZIZ;
        }
        C1376720lvi c1376720lvi = this.LL;
        if (c1376720lvi == null || (c1374250lrj = c1376720lvi.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C1374250lrj c1374250lrj;
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILLJJLI.getValue();
        if (c1376820lvs != null) {
            return c1376820lvs.LIZ;
        }
        C1376720lvi c1376720lvi = this.LL;
        if (c1376720lvi == null || (c1374250lrj = c1376720lvi.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZ;
    }

    @Override // X.InterfaceC1370290llL
    public final boolean LJJIJIIJI() {
        C1376720lvi c1376720lvi = this.LL;
        return (c1376720lvi == null || c1376720lvi.LIZJ == null) ? false : true;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        C1374250lrj c1374250lrj;
        C1376720lvi c1376720lvi = this.LL;
        if (c1376720lvi == null || (c1374250lrj = c1376720lvi.LIZ) == null) {
            return -1;
        }
        return c1374250lrj.LIZIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        C1374250lrj c1374250lrj;
        String str;
        C1376720lvi c1376720lvi = this.LL;
        return (c1376720lvi == null || (c1374250lrj = c1376720lvi.LIZ) == null || (str = c1374250lrj.LIZJ) == null) ? "" : str;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.LongPress;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1376770lvn(C1376720lvi c1376720lvi) {
        this.LL = c1376720lvi;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        if (enumC1369720lkQ == EnumC1369720lkQ.VERTICAL) {
            return R.attr.a1p;
        }
        return R.attr.a1j;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a A[PHI: r3
      0x011a: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:31:0x004d, B:29:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e A[PHI: r5 r8
      0x011e: PHI (r5v3 java.util.List<X.0lvl>) = (r5v0 java.util.List<X.0lvl>), (r5v4 java.util.List<X.0lvl>) binds: [B:18:0x0030, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r8v5 X.0lvg) = (r8v2 X.0lvg), (r8v6 X.0lvg) binds: [B:18:0x0030, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1370290llL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(final android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376770lvn.LJJJJJ(android.view.View):void");
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
        AbstractC736370SuZ abstractC736370SuZ;
        AbstractC736370SuZ abstractC736370SuZ2;
        Integer num;
        AbstractC736370SuZ abstractC736370SuZ3;
        AbstractC736370SuZ abstractC736370SuZ4;
        AbstractC736370SuZ abstractC736370SuZ5;
        C1376720lvi c1376720lvi = this.LL;
        String aid = null;
        if (c1376720lvi != null) {
            abstractC736370SuZ = c1376720lvi.LIZIZ;
        } else {
            abstractC736370SuZ = null;
        }
        if (abstractC736370SuZ instanceof C737360SwA) {
            SharePackage sharePackage = ((C737360SwA) abstractC736370SuZ).LLILZ.LLJILJILJ;
            String string = sharePackage.extras.getString("enter_method");
            if (string == null) {
                string = "share_panel";
            }
            Object objLJ = sharePackage.LJ("action_orientation");
            if (objLJ instanceof Integer) {
                num = (Integer) objLJ;
            } else {
                num = null;
            }
            if (TextUtils.equals(string, "long_press")) {
                int iOrdinal = EnumC1369720lkQ.VERTICAL.ordinal();
                if ((num == null || num.intValue() != iOrdinal) && LJJIJIIJI()) {
                    C1376720lvi c1376720lvi2 = this.LL;
                    if (c1376720lvi2 != null) {
                        if (c1376720lvi2.LIZJ != null) {
                            C737360SwA c737360SwA = (C737360SwA) c1376720lvi2.LIZIZ;
                            c737360SwA.LLILZ.LLJILJILJ.extras.putBoolean("enable_secondary_actions", true);
                            C1440005kM.LIZ(new C1210880hcE(this.LL.LIZIZ.LLILLL, "FUNCTION_FROM_NOT_INTERESTED", "not_interested", c737360SwA.LLILZ.LL));
                            C1376720lvi c1376720lvi3 = this.LL;
                            if (c1376720lvi3 != null && (abstractC736370SuZ5 = c1376720lvi3.LIZIZ) != null) {
                                abstractC736370SuZ5.LJII(view);
                            }
                            int i = 2131857752;
                            if (Intrinsics.LJFF("homepage_explore", this.LL.LIZIZ.LLILLL)) {
                                C844470XAv.LIZ.getClass();
                                C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                                c1233040iBy.LIZIZ(2131857752);
                                c1233040iBy.LIZLLL();
                                return;
                            }
                            Activity activityLJFF = C2214201BlK.LJFF();
                            if (activityLJFF == null) {
                                return;
                            }
                            View viewFindViewById = activityLJFF.getWindow().getDecorView().findViewById(R.id.viewpager);
                            if (viewFindViewById == null && (viewFindViewById = activityLJFF.getWindow().getDecorView().findViewById(R.id.view_pager)) == null) {
                                return;
                            }
                            View decorView = activityLJFF.getWindow().getDecorView();
                            Rect rect = new Rect();
                            decorView.getGlobalVisibleRect(rect);
                            Rect rect2 = new Rect();
                            viewFindViewById.getGlobalVisibleRect(rect2);
                            int iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            Aweme aweme = c737360SwA.LLILLJJLI;
                            C1389910mGz c1389910mGz = new C1389910mGz(activityLJFF);
                            c1389910mGz.LJI(R.style.y0);
                            c1389910mGz.LIZ.LIZIZ = 0;
                            Set<String> set = EarlyFeedbackButtonAssem.LLLIIL;
                            if (C20638515pP.LIZIZ(aweme)) {
                                i = 2131857835;
                            }
                            c1389910mGz.LJIIIZ(i);
                            c1389910mGz.LIZIZ(iLIZIZ);
                            if (Intrinsics.LJFF("repost_feed", this.LL.LIZIZ.LLILLL)) {
                                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                                c1360890lWB.LIZLLL = 3;
                                c1360890lWB.LJ = null;
                            } else {
                                c1389910mGz.LIZ.LIZLLL = 2;
                                c1389910mGz.LJFF(2131836313);
                                c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS124S0200000_21(viewFindViewById, this, 58);
                            }
                            c1389910mGz.LJIIJJI();
                            Aweme aweme2 = c737360SwA.LLILZ.LL;
                            String str = this.LL.LIZIZ.LLILLL;
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            if (aweme2 != null) {
                                aid = aweme2.getAid();
                            }
                            c2344009Gk.LJIIIIZZ("group_id", aid);
                            c2344009Gk.LJIIIIZZ("enter_from", str);
                            c2344009Gk.LJIIIIZZ("enter_method", string);
                            C20684815ws.LJIILLIIL("dislike_toast_show", c2344009Gk.LIZ);
                            return;
                        }
                        if (c1376720lvi2 == null || (abstractC736370SuZ4 = c1376720lvi2.LIZIZ) == null) {
                            return;
                        }
                        abstractC736370SuZ4.LJII(view);
                        return;
                    }
                    return;
                }
            }
            C1376720lvi c1376720lvi4 = this.LL;
            if (c1376720lvi4 == null || (abstractC736370SuZ3 = c1376720lvi4.LIZIZ) == null) {
                return;
            }
            abstractC736370SuZ3.LJII(view);
            return;
        }
        if (c1376720lvi == null || (abstractC736370SuZ2 = c1376720lvi.LIZIZ) == null) {
            return;
        }
        abstractC736370SuZ2.LJII(view);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }
}
