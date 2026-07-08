package X;

import Y.ARunnableS128S0100000_28;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.scene.Scene;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserService;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.AdjustableWhyThisVideoManager;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336910kx extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    public static final void LJLIIL$0(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.$t != 0) {
            super.LJJZ(interfaceC1541990qEH);
        } else {
            LJJZ$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 1:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 6:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 7:
                LJL$2(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 6:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 7:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 6:
                LJLIIL$0(this, interfaceC1541990qEH, str);
                break;
            case 7:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (4 - this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        if (5 - this.$t != 0) {
            super.LJLJLLL(sparkContext);
        } else {
            LJLJLLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        if (3 - this.$t != 0) {
            super.LJLL(sparkContext);
        } else {
            LJLL$0(this, sparkContext);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (2 - this.$t != 0) {
            super.LJLLJ(sparkContext, c1548490qOl);
        } else {
            LJLLJ$0(this, sparkContext, c1548490qOl);
        }
    }

    public C19336910kx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJZ$0(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH) {
        String schema = interfaceC1541990qEH.getSchema();
        if (schema != null && a0.LJJIIZI(schema, "personal_homepage", false)) {
            return;
        }
        FundraiserService fundraiserService = (FundraiserService) c19336910kx.l0;
        C1910500zoe c1910500zoe = fundraiserService.LLILLL;
        if (c1910500zoe != null) {
            c1910500zoe.LIZLLL();
        }
        fundraiserService.LLILLL = null;
        fundraiserService.LLILLJJLI = null;
    }

    public static final void LJLIIIL$0(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1894200zOM c1894200zOM = (C1894200zOM) c19336910kx.l0;
        c1894200zOM.LLJILLL = true;
        c1894200zOM.LIZIZ();
    }

    public static final void LJLIIIL$1(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH) {
        InterfaceC1899900zXY interfaceC1899900zXY = ((C1899950zXd) c19336910kx.l0).LJIILIIL;
        if (interfaceC1899900zXY != null) {
            interfaceC1899900zXY.LJIJJLI();
        }
    }

    public static final void LJLJI$0(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH) {
        WebKitView webKitView;
        if ((interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != null && (webKitView = (WebKitView) interfaceC1541990qEH) != null) {
            final CreatorCenterFragment creatorCenterFragment = (CreatorCenterFragment) c19336910kx.l0;
            webKitView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0zo0
                public float LL;
                public float LLILLJJLI;

                /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
                
                    if (r1 != 3) goto L9;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                    /*
                        r6 = this;
                        int r1 = r8.getAction()
                        r5 = 1
                        r3 = 0
                        r2 = 0
                        if (r1 == 0) goto L4f
                        if (r1 == r5) goto L44
                        r0 = 2
                        if (r1 == r0) goto L12
                        r0 = 3
                        if (r1 == r0) goto L44
                    L11:
                        return r2
                    L12:
                        float r1 = r8.getX()
                        float r0 = r6.LL
                        float r1 = r1 - r0
                        float r4 = r8.getY()
                        float r0 = r6.LLILLJJLI
                        float r4 = r4 - r0
                        float r1 = java.lang.Math.abs(r1)
                        float r0 = java.lang.Math.abs(r4)
                        int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                        if (r0 <= 0) goto L11
                        com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r1 = r1
                        boolean r0 = r1.LLJJ
                        if (r0 == 0) goto L3b
                        androidx.viewpager.widget.ViewPager r0 = r1.LLJIJIL
                        if (r0 == 0) goto L37
                        r3 = r0
                    L37:
                        r3.requestDisallowInterceptTouchEvent(r2)
                        return r2
                    L3b:
                        androidx.viewpager.widget.ViewPager r0 = r1.LLJIJIL
                        if (r0 == 0) goto L40
                        r3 = r0
                    L40:
                        r3.requestDisallowInterceptTouchEvent(r5)
                        return r2
                    L44:
                        com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r1
                        androidx.viewpager.widget.ViewPager r0 = r0.LLJIJIL
                        if (r0 == 0) goto L4b
                        r3 = r0
                    L4b:
                        r3.requestDisallowInterceptTouchEvent(r2)
                        return r2
                    L4f:
                        float r0 = r8.getX()
                        r6.LL = r0
                        float r0 = r8.getY()
                        r6.LLILLJJLI = r0
                        com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r1
                        androidx.viewpager.widget.ViewPager r0 = r0.LLJIJIL
                        if (r0 == 0) goto L62
                        r3 = r0
                    L62:
                        r3.requestDisallowInterceptTouchEvent(r5)
                        com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r1
                        r0.LLJJ = r2
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1910100zo0.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            final CreatorCenterFragment creatorCenterFragment2 = (CreatorCenterFragment) c19336910kx.l0;
            webKitView.setWebOverScrollByListener(new InterfaceC1541790qDx() { // from class: X.0zo1
                @Override // X.InterfaceC1541790qDx
                public final void LIZ(int i, int i2, int i3, int i4) {
                    boolean z;
                    CreatorCenterFragment creatorCenterFragment3 = creatorCenterFragment2;
                    if (Math.abs(i) > Math.abs(i2) && Math.abs(i) >= ViewConfiguration.getTouchSlop()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    creatorCenterFragment3.LLJJ = z;
                }
            });
        }
    }

    public static final void LJLJLLL$0(C19336910kx c19336910kx, SparkContext sparkContext) {
        C622680Oba.LIZJ((AdjustableWhyThisVideoManager) c19336910kx.l0);
    }

    public static final void LJLL$0(C19336910kx c19336910kx, SparkContext sparkContext) {
        FundraiserContainerViewModel fundraiserContainerViewModel;
        C1910590zon c1910590zon = (C1910590zon) c19336910kx.l0;
        if (!c1910590zon.LLJIJIL && (fundraiserContainerViewModel = c1910590zon.LLILZ) != null) {
            fundraiserContainerViewModel.xQ2(null, null, false);
        }
    }

    public static final void LJLIIL$1(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        InterfaceC1899900zXY interfaceC1899900zXY = ((C1899950zXd) c19336910kx.l0).LJIILIIL;
        if (interfaceC1899900zXY != null) {
            interfaceC1899900zXY.LIZ();
        }
    }

    public static final void LJLLJ$0(C19336910kx c19336910kx, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (c1548490qOl.LIZIZ == 0) {
            ((C013C) c19336910kx.l0).element = true;
        }
    }

    public static final void LJL$0(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        Integer numValueOf;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        DynamicDialog dynamicDialog = ((DynamicPopupTask) c19336910kx.l0).LLILZIL;
        Integer num = null;
        if (dynamicDialog != null) {
            numValueOf = Integer.valueOf(dynamicDialog.LIZ);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "touch_point_id");
        DynamicDialog dynamicDialog2 = ((DynamicPopupTask) c19336910kx.l0).LLILZIL;
        if (dynamicDialog2 != null) {
            str2 = dynamicDialog2.LIZIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("touch_point_name", str2);
        DynamicDialog dynamicDialog3 = ((DynamicPopupTask) c19336910kx.l0).LLILZIL;
        if (dynamicDialog3 != null) {
            num = dynamicDialog3.LIZJ;
        }
        c2344009Gk.LJ(num, "launch_plan_id");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, ((DynamicPopupTask) c19336910kx.l0).LL);
        c2344009Gk.LJIIIIZZ("reason", c1542120qEU.LIZIZ);
        C20684815ws.LJIILLIIL("dynamic_popup_load_fail", c2344009Gk.LIZ);
    }

    public static final void LJL$1(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        int iIntValue;
        Integer num = c1542120qEU.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        String str2 = c1542120qEU.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        C1894200zOM c1894200zOM = (C1894200zOM) c19336910kx.l0;
        c1894200zOM.getClass();
        C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
        C739380SzQ.LIZ().LIZLLL(new ARunnableS128S0100000_28(c1894200zOM, 120));
        String str3 = ((C1894200zOM) c19336910kx.l0).LL;
        long jCurrentTimeMillis = System.currentTimeMillis() - ((C1894200zOM) c19336910kx.l0).LLJILJILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("spark fail: ");
        sbLIZ.append(str2);
        C1894220zOO.LIZIZ(iIntValue, str3, jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJL$2(C19336910kx c19336910kx, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        InterfaceC1899900zXY interfaceC1899900zXY = ((C1899950zXd) c19336910kx.l0).LJIILIIL;
        if (interfaceC1899900zXY != null) {
            interfaceC1899900zXY.LJIL(c1542120qEU.LIZIZ);
        }
        C1899920zXa c1899920zXa = C1899920zXa.LIZ;
        String str2 = ((C1899950zXd) c19336910kx.l0).LIZIZ;
        EnumC1899960zXe enumC1899960zXe = EnumC1899960zXe.RESOURCE_LOAD_FAILED;
        c1899920zXa.getClass();
        C1899920zXa.LIZJ(str2, enumC1899960zXe);
    }
}
