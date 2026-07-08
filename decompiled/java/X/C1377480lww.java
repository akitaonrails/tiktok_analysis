package X;

import Y.ACallableS237S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377480lww implements InterfaceC1370310llN {
    public final String LL;
    public final List<String> LLILLJJLI;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_download_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_arrow_to_bottom;
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
        return true;
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
        return R.string.sg8;
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
    public final String key() {
        return "image_save";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
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

    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, android.net.Uri] */
    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(final Context context, BaseSharePackage baseSharePackage) throws Throwable {
        String str = this.LL;
        if (str != null) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("web_image_downloader_switch", false)) {
                    C1383460m6a c1383460m6a = new C1383460m6a(new WeakReference(context));
                    final Activity activityLJII = C1375500ltk.LJII(context);
                    c1383460m6a.LIZ(str, new C1377550lx3(activityLJII) { // from class: X.0lx2
                        @Override // X.C1377550lx3, X.InterfaceC1377580lx6
                        public final void onSuccess(String str2) {
                            super.onSuccess(str2);
                            C1233040iBy c1233040iBy = new C1233040iBy(context);
                            c1233040iBy.LIZIZ(2131849129);
                            c1233040iBy.LIZLLL();
                        }
                    });
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            final Activity activityLJII2 = C1375500ltk.LJII(context);
            if (activityLJII2 != null) {
                new C1377500lwy(new WeakReference(context)).LIZ(str, new C1377510lwz(activityLJII2) { // from class: X.0lx1
                    public final /* synthetic */ Activity LIZJ;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(activityLJII2);
                        this.LIZJ = activityLJII2;
                    }

                    @Override // X.InterfaceC1377560lx4
                    public final void LIZIZ(Uri uri) {
                        DialogC1389620mGW dialogC1389620mGW = this.LIZIZ;
                        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
                            dialogC1389620mGW.dismiss();
                            C785410UrT.LIZ(dialogC1389620mGW);
                        }
                        C1233040iBy c1233040iBy = new C1233040iBy(this.LIZJ);
                        c1233040iBy.LIZIZ(2131849129);
                        c1233040iBy.LIZLLL();
                    }
                });
                return;
            }
            return;
        }
        List<String> list = this.LLILLJJLI;
        if (list != null) {
            if (C1375500ltk.LJI(context)) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C0VSJ c0vsj = new C0VSJ(it2.next());
                    C259800zU c259800zU = new C259800zU();
                    ?? LJFF = C2400409as.LJFF(context, c0vsj.getName(), null);
                    c259800zU.element = LJFF;
                    if (LJFF == 0) {
                        c259800zU.element = C2400409as.LIZ(context, c0vsj.getName());
                    }
                    C15O7.LIZJ(new ACallableS237S0200000_3(c259800zU, c0vsj, 9));
                }
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131849129);
                C1389890mGx c1389890mGx = c1233040iBy.LIZIZ;
                if (c1389890mGx != null) {
                    c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                }
                C1389890mGx c1389890mGx2 = c1233040iBy.LIZIZ;
                if (c1389890mGx2 != null) {
                    c1389890mGx2.LJII(R.attr.a0i);
                }
                c1233040iBy.LIZLLL();
                return;
            }
            C1374720lsU.LJIIIIZZ(context, TokenCert.Companion.with("bpea-share_jsb_save_local_image_permission"), null, null, null);
        }
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

    public C1377480lww(String str, List list, int i) {
        str = (i & 1) != 0 ? null : str;
        list = (i & 2) != 0 ? null : list;
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
