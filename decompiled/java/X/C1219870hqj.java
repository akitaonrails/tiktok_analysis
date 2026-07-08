package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: renamed from: X.0hqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219870hqj implements InterfaceC1370310llN {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final InterfaceC1219880hqk LLILLL;

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
        return 2131822788;
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
        return "remove_ugc_template";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        InterfaceC1219880hqk interfaceC1219880hqk = this.LLILLL;
        return interfaceC1219880hqk != null ? interfaceC1219880hqk.LJII() : R.raw.icon_template_fill_slash;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        InterfaceC1219880hqk interfaceC1219880hqk = this.LLILLL;
        return interfaceC1219880hqk != null ? interfaceC1219880hqk.LJIIIIZZ() : R.raw.icon_template_fill_slash;
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

    public final void LIZ(String str) {
        String id;
        String str2;
        String str3 = "";
        if (C1210510hbd.LIZLLL(this.LLILLJJLI)) {
            for (AnchorCommonStruct anchorCommonStruct : this.LLILLJJLI.getAnchors()) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                    id = anchorCommonStruct.getId();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (C1210510hbd.LIZIZ(this.LLILLJJLI)) {
            for (AnchorCommonStruct anchorCommonStruct2 : this.LLILLJJLI.getAnchors()) {
                if (anchorCommonStruct2.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    id = anchorCommonStruct2.getId();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (!C1210510hbd.LIZJ(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), this.LLILLJJLI)) {
            id = "";
        } else {
            for (AnchorCommonStruct anchorCommonStruct3 : this.LLILLJJLI.getAnchors()) {
                if (anchorCommonStruct3.getType() == EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()) {
                    id = anchorCommonStruct3.getId();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = this.LLILLJJLI.getAid();
        if (aid != null) {
            str3 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        String str4 = "1";
        if (C1210510hbd.LIZIZ(this.LLILLJJLI)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_allow_pugc_template", str2);
        if (!C1210510hbd.LIZLLL(this.LLILLJJLI)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_allow_ugc_template", str4);
        c2344009Gk.LJIIIIZZ("template_id", id);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
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
        C1397580mTM c1397580mTM;
        LIZ("click_remove_template_entrance");
        if (C1210510hbd.LIZJ(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE(), this.LLILLJJLI)) {
            c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZIZ(context.getString(2131839825));
        } else {
            c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(context.getString(2131821914));
            c1397580mTM.LIZIZ(context.getString(2131821911));
        }
        C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(context, this, 87));
        new C1397510mTF(c1397580mTM).LIZLLL();
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

    public C1219870hqj(Aweme aweme, InterfaceC1219880hqk interfaceC1219880hqk, String str) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = interfaceC1219880hqk;
    }
}
