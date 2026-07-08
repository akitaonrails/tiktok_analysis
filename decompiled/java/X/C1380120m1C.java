package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AIDubbingSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0m1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380120m1C implements InterfaceC1370310llN {
    public final Aweme LL;
    public boolean LLILLJJLI = true;
    public C11JL LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_human_soundwave_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_human_soundwave_fill;
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
        return 2131830352;
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
        return "author_auto_dubbing";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1380120m1C(Aweme aweme) {
        this.LL = aweme;
    }

    public static void LIZ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_name", "video_share");
        c0lab.LJ("module_name", "ai_dub_auth");
        c0lab.LJ("type", "module");
        c0lab.LJ("click_for", str);
        C20684815ws.LJIILLIIL("affiliate_button_click", c0lab.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        boolean zBooleanValue;
        Boolean showDubbedVideo;
        C19EG c19egLIZIZ = C2493909px.LIZIZ(context);
        if (c19egLIZIZ != null) {
            AIDubbingSheetFragment aIDubbingSheetFragment = new AIDubbingSheetFragment();
            TranslatedVideo translatedVideo = this.LL.getTranslatedVideo();
            if (translatedVideo != null && (showDubbedVideo = translatedVideo.getShowDubbedVideo()) != null) {
                zBooleanValue = showDubbedVideo.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLILLJJLI = zBooleanValue;
            aIDubbingSheetFragment.LLIZ = zBooleanValue;
            aIDubbingSheetFragment.LLIZLLLIL = new AwS600S0100000_21(this, 279);
            aIDubbingSheetFragment.LLJ = new AwS565S0100000_21(this, 1308);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = aIDubbingSheetFragment;
            tuxSheet.LLJLLL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c19egLIZIZ);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            tuxSheet2.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(0);
            DialogInterfaceOnDismissListenerC1402030maX dialogInterfaceOnDismissListenerC1402030maX = new DialogInterfaceOnDismissListenerC1402030maX(aIDubbingSheetFragment, this, 1);
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            tuxSheet3.LLILLJJLI = dialogInterfaceOnDismissListenerC1402030maX;
            tuxSheet3.show(c19egLIZIZ.getSupportFragmentManager(), "AIDubbingSheet");
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
}
