package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377760lxO implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLILZ = 0;
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_sticker_plus_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_rectangle_smile_face_plus;
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
        return R.string.effect_tool_createsticker_title;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "create_sticker";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        InteractionPermission allowCreateSticker;
        Integer numValueOf;
        IMStickerApi.LIZ.getClass();
        if (C457760HxG.LIZIZ(true)) {
            return (!this.LL.isSubOnlyVideo() || C729980SkG.LJIIIIZZ(this.LL)) && (allowCreateSticker = this.LL.getInteractPermission().getAllowCreateSticker()) != null && (numValueOf = Integer.valueOf(allowCreateSticker.status)) != null && numValueOf.intValue() == 0;
        }
        return false;
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

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String str;
        InteractPermission interactPermission;
        InteractionPermission allowCreateSticker;
        String str2;
        InteractionPermission allowCreateSticker2;
        if (C036E.LIZ.LIZJ == C0O0L.NOT_AVAILABLE) {
            if (C299060Bns.LIZ()) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                    c1389880mGw.LJIIIIZZ(2131829438);
                    c1389880mGw.LJIIJ();
                }
            } else {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131829438);
                c1233040iBy.LIZLLL();
            }
            LIZ("", 0L, 0L, 0L, Integer.valueOf(EnumC1377810lxT.NETWORK_NOT_CONNECT.getStatus()), "");
            return;
        }
        InterfaceC453640Hqc imStickerAnalytics = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
        String str3 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        String aid = this.LL.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(this.LL);
        boolean zEnable = enable();
        InteractPermission interactPermission2 = this.LL.getInteractPermission();
        if (interactPermission2 == null || (allowCreateSticker2 = interactPermission2.getAllowCreateSticker()) == null || (str = allowCreateSticker2.toast) == null) {
            str = "";
        }
        imStickerAnalytics.LJJIIZ(str3, str4, aid, authorUid, zEnable, str, C0I0B.LJFF.LIZIZ());
        if (!enable()) {
            if ((!this.LL.isSubOnlyVideo() || C729980SkG.LJIIIIZZ(this.LL)) && (interactPermission = this.LL.getInteractPermission()) != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null && (str2 = allowCreateSticker.toast) != null && C123100dR.LIZ(str2)) {
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZJ(str2);
                c1233040iBy2.LIZLLL();
                return;
            }
            return;
        }
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII == null) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activityLJII);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.setCancelable(false);
        C786410Ut5.J4(dialogC1389620mGW);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C062Y(this, activityLJII, SystemClock.elapsedRealtime(), dialogC1389620mGW, context, null), 3);
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

    public C1377760lxO(Aweme aweme, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    public final void LIZ(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics().LJ(num, l, l2, l3, this.LL.getAid(), this.LLILLJJLI, this.LLILLL, str, str2);
    }
}
