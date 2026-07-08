package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0OFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616430OFt extends C1260870iur<AbstractC666100QAu<BaseResponse>, InterfaceC616440OFu> {
    public int LLILZ;
    public int LLILZIL;
    public String LLIZ;
    public int LLJI;
    public String LLILZLL = "";
    public final IFavoriteService LLIZLLLIL = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
    public int LLJ = 0;
    public int LLJIJIL = 0;
    public View LLJILJIL = null;
    public Boolean LLJILJILJ = Boolean.FALSE;

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        int i = this.LLILZIL;
        if (i == 6) {
            if (this.LLILZ == 2) {
                ((InterfaceC616440OFu) this.LLILLJJLI).Me1(C1BWL.LIZ().getString(2131826479));
            }
        } else if ((i == 1 && !TextUtils.equals(this.LLILZLL, "single_song") && !TextUtils.equals(this.LLILZLL, "similar_song")) || this.LLILZIL == 2) {
            if (this.LLILZIL == 2 && !LJIILL(this.LLILZLL)) {
                this.LLIZLLLIL.LJ();
            }
            if (this.LLILZIL != 2 || this.LLILZ != 1 || TextUtils.equals(this.LLILZLL, "music_dsp") || LJIILL(this.LLILZLL)) {
                ((InterfaceC616440OFu) this.LLILLJJLI).Me1(C1BWL.LIZ().getString(this.LLILZ == 1 ? 2131826480 : 2131826479));
            }
            if (this.LLILZIL == 2) {
                C1440005kM.LIZ(new AnonymousClass0345(this.LLIZ, this.LLILZ, this.LLJI));
            }
        }
        if (this.LLILLJJLI != 0) {
            T t = this.LL;
            if (t != 0) {
                t.getData();
            }
            ((InterfaceC616440OFu) this.LLILLJJLI).ZX();
        }
        if (Keva.getRepo("collect").getBoolean("first_favourite_success", false) || this.LLILZ != 1) {
            return;
        }
        Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
    }

    public C616430OFt() {
        LJIIJ(new C616450OFv(this));
    }

    public static final boolean LJIILL(String str) {
        if (!TextUtils.equals(str, "from_duet_mode") && !TextUtils.equals(str, "from_duet_mode_detail")) {
            return false;
        }
        return true;
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        int i = 2131828935;
        if (this.LLILZIL == 5) {
            C0XIR c0xir = (C0XIR) exc;
            if (c0xir.getErrorCode() == 4) {
                ((InterfaceC616440OFu) this.LLILLJJLI).Me1(c0xir.getErrorMsg());
            } else {
                if (this.LLILZ != 1) {
                    i = 2131828351;
                }
                ((InterfaceC616440OFu) this.LLILLJJLI).Me1(C1BWL.LIZ().getString(i));
            }
        } else {
            if (this.LLILZ != 1) {
                i = 2131828351;
            }
            String string = C1BWL.LIZ().getString(i);
            if (this.LLILZ != 1 || this.LLILZIL != 2) {
                ((InterfaceC616440OFu) this.LLILLJJLI).Me1(string);
            }
        }
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC616440OFu) k).p30(exc);
        }
    }
}
