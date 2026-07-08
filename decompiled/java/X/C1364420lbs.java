package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364420lbs implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLILZ = 0;
    public final Aweme LL;
    public final String LLILLJJLI;
    public int LLILLL = -1;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_add_to_story_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_add_to_story;
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
        return 2131847917;
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
        return "share_to_story";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public final String LIZ() {
        if (this.LL.getAwemeType() == 501) {
            return "image";
        }
        if (this.LL.getAwemeType() == 502) {
            return "video";
        }
        return null;
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

    public C1364420lbs(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        Bundle bundle = baseSharePackage.extras;
        InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
        String strLIZ = LIZ();
        String str = "";
        if (strLIZ != null) {
            String string = baseSharePackage.extras.getString("enter_method");
            if (string == null) {
                string = "";
            }
            C912070ZqH.LIZIZ.LJFF().LJIILIIL(strLIZ, "add_to_story", Intrinsics.LJFF(string, "long_press"), null, C0I0B.LJFF.LIZIZ());
        }
        Aweme aweme = this.LL;
        String string2 = bundle.getString("enter_from", "");
        if (strLIZ != null && strLIZ.length() != 0) {
            str = "detail_page_share_panel";
        }
        interfaceC1618460sDcLJIJJLI.LJIIJ(new C20271514Tp(context, aweme, string2, null, str, null, 0, C1375730lu7.LIZIZ.LJI(), null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031656));
        interfaceC1618460sDcLJIJJLI.LJI(this.LL, "share_to_story_click", new AwS104S1200000_21(bundle, strLIZ, this, 12));
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

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        C1618440sDa.LIZIZ.LJIJJLI().LJI(this.LL, "share_to_story_show", new AwS128S0101000_21(this, i, 5));
        this.LLILLL = i;
    }
}
