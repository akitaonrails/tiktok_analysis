package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EI9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI9 implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final C0ELJ LLILZ;
    public final InterfaceC362350EIn LLILZIL;
    public final C0E48 LLILZLL;
    public final C0EIE LLIZ = C0EIE.ADJUST;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1618));

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    public final C361970EHb LIZ() {
        C361970EHb c361970EHb = new C361970EHb();
        c361970EHb.LIZ = this.LL.getString(2131825206);
        c361970EHb.LJ = "bottom_item_root_adjust_filter";
        c361970EHb.LIZJ = C357540E0a.LJJIJL(C0EJA.LJI() ? R.raw.icon_control : R.raw.icon_control_fill, this.LL);
        return c361970EHb;
    }

    public final void LIZIZ() {
        C0E48 c0e48 = this.LLILZLL;
        if (c0e48 != null) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                C361680EFy.LJJIII(editModel, c0e48, this.LLILZ.isTemplateCreate());
            }
        }
        InterfaceC359850E8x interfaceC359850E8xB20 = this.LLILLL.B20();
        ((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LIZ();
        C361970EHb c361970EHbLIZ = LIZ();
        c361970EHbLIZ.LIZIZ(((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LIZLLL(), "key_lottie_anim");
        c361970EHbLIZ.LIZIZ(((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LIZJ(), "key_view_anim");
        C361980EHc c361980EHcLIZ = c361970EHbLIZ.LIZ();
        C363750ENx.LJ("adjust_guide_has_shown_in_root");
        if (interfaceC359850E8xB20 != null) {
            interfaceC359850E8xB20.LIZJ("bottom_item_root_adjust_filter", c361980EHcLIZ, true);
        }
        ((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LLJI = new AwS406S0200000_5(this, interfaceC359850E8xB20, 156);
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return C363750ENx.LIZIZ("adjust_guide_has_shown_in_root");
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZ;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        if (list.contains("bottom_item_root_adjust_filter") && !C363750ENx.LIZIZ("adjust_guide_has_shown_in_root")) {
            LIZIZ();
            return true;
        }
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        if (list.contains("bottom_item_root_adjust_filter") && !C363750ENx.LIZIZ("adjust_guide_has_shown_in_root")) {
            LIZIZ();
            return true;
        }
        return false;
    }

    public C0EI9(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, C0ELJ c0elj, InterfaceC362350EIn interfaceC362350EIn, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = c0elj;
        this.LLILZIL = interfaceC362350EIn;
        this.LLILZLL = c0e48;
    }
}
