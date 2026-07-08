package X;

import Y.AfS69S0400000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0lxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1377850lxX implements InterfaceC1370310llN {
    public final String LL;
    public final boolean LLILLJJLI;

    public C1377850lxX() {
        this(null, false, 7);
    }

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_link_fill;
    }

    @Override // X.InterfaceC1370310llN
    public int LJIIIIZZ() {
        return R.raw.icon_2pt_link;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
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
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
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
    public final int LJJLIIIJJIZ() {
        return 2131847874;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "copy";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public static int LIZIZ() {
        return ((Boolean) C0AEL.LIZ.getValue()).booleanValue() ? 2131827876 : 2131829543;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    public C1377850lxX(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String LJ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L2e
            java.lang.String r1 = r5.url
            java.lang.String r0 = r5.itemType
            java.lang.String r0 = X.C1375910luP.LIZ(r0, r1, r6, r5)
            boolean r1 = X.C10EU.LJIIIIZZ()
            if (r1 != 0) goto L2c
            java.lang.String r3 = r5.itemType
            android.os.Bundle r2 = r5.extras
            java.lang.String r1 = "bool_persist"
            r2.getBoolean(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2e
            com.ss.android.ugc.aweme.share.ShareExtService r2 = X.C621180OYa.LIZIZ
            r1 = 0
            X.11Kn r0 = r2.LJIJI(r1, r3, r6, r0)
            java.lang.Object r0 = r0.LIZLLL()
            java.lang.String r0 = (java.lang.String) r0
        L2c:
            if (r0 != 0) goto L30
        L2e:
            java.lang.String r0 = ""
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377850lxX.LJ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC1370310llN
    public void LJIILIIL(Context context, final BaseSharePackage baseSharePackage) {
        ShareFlavorService.LIZ.getClass();
        C04UB.LIZ().LIZJ();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(context, 717));
        C0FNV.LIZJ((Dialog) c01gwLIZIZ.getValue());
        final String str = "copy_link";
        AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0e5o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BaseCopyAction@bb2c.execute$1");
                String strLJ = this.LL.LJ(baseSharePackage, str);
                C1C7U.LIZIZ("BaseCopyAction@bb2c.execute$1");
                return strLJ;
            }
        }).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LJIIIZ(new AfS69S0400000_21(baseSharePackage, this, context, c01gwLIZIZ, 2)).LJJIIJ();
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

    public /* synthetic */ C1377850lxX(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 4) != 0 ? true : z);
    }

    public final void LIZ(String str, Context context, Cert cert, View view) {
        try {
            C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(context, "clipboard"), ClipData.newPlainText(str, str), cert);
            if (this.LLILLJJLI) {
                boolean zLIZJ = C299060Bns.LIZJ();
                int iIntValue = 0;
                if (C304410BwV.LIZ() && C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LIZ()) {
                    C304420BwW.LIZ();
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ != null) {
                        if (zLIZJ) {
                            C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                            c1389880mGw.LJIIIIZZ(2131830949);
                            if (C299060Bns.LIZIZ()) {
                                c1389880mGw.LJ(R.raw.icon_tick);
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                }
                                c1389880mGw.LJFF(iIntValue);
                            }
                            c1389880mGw.LJIIJ();
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C19209810Dg(this, context, activityLIZ, null), 3);
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                        c1389890mGx.LJII(R.attr.a0i);
                        c1389890mGx.LJIIIZ(2131830949);
                        c1389890mGx.LIZJ(new AwS265S0300000_21(this, context, activityLIZ, 19));
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                if (view != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                    c1389890mGx2.LJIIIZ(LIZIZ());
                    c1389890mGx2.LIZJ(new AwS422S0200000_21(context, this, 89));
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                if (zLIZJ) {
                    Activity activityLIZ2 = C1388190mED.LIZ(context);
                    if (activityLIZ2 != null) {
                        C1389880mGw c1389880mGw2 = new C1389880mGw(activityLIZ2);
                        c1389880mGw2.LJIIIIZZ(LIZIZ());
                        if (C299060Bns.LIZIZ()) {
                            c1389880mGw2.LJ(R.raw.icon_tick);
                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context);
                            if (numLIZJ2 != null) {
                                iIntValue = numLIZJ2.intValue();
                            }
                            c1389880mGw2.LJFF(iIntValue);
                        }
                        c1389880mGw2.LJIIJ();
                    }
                } else {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZIZ(LIZIZ());
                    c1233040iBy.LIZLLL();
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C19209710Df(this, context, null), 3);
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }
}
