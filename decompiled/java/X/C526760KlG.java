package X;

import Y.AObserverS212S0100000_8;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526760KlG implements InterfaceC522120Kdm {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public C526940KlY LLILZIL;
    public final ArrayList<TikTokMediaModel> LLILZLL;
    public final C2252321DDq LLIZ;
    public InterfaceC528020KnI LLIZLLLIL;
    public AbstractC528270Knh LLJ;
    public AbstractC528270Knh LLJI;
    public AbstractC528270Knh LLJIJIL;
    public List<String> LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public ChooseMediaViewModel LLJJ;
    public boolean LLJJI;

    @Override // X.InterfaceC522120Kdm
    public final void LIZ(int i, int i2) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LIZIZ(C0L90 c0l90) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJFF() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJI(LifecycleOwner lifecycleOwner, AObserverS212S0100000_8 aObserverS212S0100000_8) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIIZ(TikTokMediaModel tikTokMediaModel) {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC522120Kdm
    public final C0HZQ LJIIJJI() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIL() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIILIIL(int i) {
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJ(boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final CutSameVideoImageExtraData LJIJI() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJJ(TikTokMediaModel tikTokMediaModel) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJJLI(LifecycleOwner lifecycleOwner, AObserverS212S0100000_8 aObserverS212S0100000_8) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJI() {
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJJIFFI() {
        return -1;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIII(Function0<Unit> function0) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIJ(boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIJZLJL(View view, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
    }

    @Override // X.InterfaceC522120Kdm
    public final boolean LJJIIZ() {
        return false;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIZI(Map<String, LivePhotoInfo> map) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJ() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJJIJIL(int i, int i2) {
        return 21;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJL(List<? extends TikTokMediaModel> list) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJLIJ(int i) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIL() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void oe(int i) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void onPause() {
    }

    @Override // X.InterfaceC522120Kdm
    public final View LIZLLL() {
        C526940KlY c526940KlY = this.LLILZIL;
        if (c526940KlY == null) {
            c526940KlY = null;
        }
        return c526940KlY.getSureTextView();
    }

    @Override // X.InterfaceC522120Kdm
    public final C05YD<Boolean> LJIILJJIL() {
        return C09IC.LIZIZ(this.LLIZ);
    }

    public final void LJJJ() {
        if (this.LLILZLL.size() == 1) {
            this.LLJILLL = true;
            C526940KlY c526940KlY = this.LLILZIL;
            if (c526940KlY == null) {
                c526940KlY = null;
            }
            C197039127h c197039127h = c526940KlY.LLILLJJLI;
            (c197039127h != null ? c197039127h : null).setEnabled(true);
            return;
        }
        this.LLJILLL = false;
        C526940KlY c526940KlY2 = this.LLILZIL;
        if (c526940KlY2 == null) {
            c526940KlY2 = null;
        }
        C197039127h c197039127h2 = c526940KlY2.LLILLJJLI;
        (c197039127h2 != null ? c197039127h2 : null).setEnabled(false);
    }

    public final void LJJJI() {
        this.LLIZ.setValue(Boolean.valueOf(this.LLILZLL.size() > 0));
    }

    public final void LJJJIL() {
        int i = 1;
        for (TikTokMediaModel tikTokMediaModel : this.LLILZLL) {
            tikTokMediaModel.selectIndex = i;
            if (this.LLJJI) {
                tikTokMediaModel.mediaIndex = i - 1;
            }
            i++;
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final List<TikTokMediaModel> LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJIL() {
        return this.LLILZLL;
    }

    public C526760KlG(Bundle bundle) {
        long j;
        String string;
        String string2;
        String string3;
        String str = "";
        this.LL = (bundle == null || (string3 = bundle.getString("creation_id")) == null) ? "" : string3;
        this.LLILLJJLI = (bundle == null || (string2 = bundle.getString("shoot_way")) == null) ? "" : string2;
        if (bundle != null) {
            j = bundle.getLong("start_time");
        } else {
            j = 0;
        }
        this.LLILLL = j;
        if (bundle != null && (string = bundle.getString("enter_from")) != null) {
            str = string;
        }
        this.LLILZ = str;
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLJILJIL = new ArrayList();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJII(C522090Kdj c522090Kdj) {
        this.LLIZLLLIL = c522090Kdj.LIZIZ;
        this.LLJ = c522090Kdj.LJIIJJI;
        this.LLJI = c522090Kdj.LJIIL;
        this.LLJIJIL = c522090Kdj.LJIILIIL;
        this.LLJILJIL = c522090Kdj.LJJ;
        C533730KwV.LIZ.getClass();
        this.LLJILJILJ = C533730KwV.LJII();
        this.LLJJ = c522090Kdj.LJJIFFI;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJII(boolean z) {
        C526940KlY c526940KlY = null;
        if (z) {
            C526940KlY c526940KlY2 = this.LLILZIL;
            if (c526940KlY2 != null) {
                c526940KlY = c526940KlY2;
            }
            C786410Ut5.F0(c526940KlY, 0);
            return;
        }
        C526940KlY c526940KlY3 = this.LLILZIL;
        if (c526940KlY3 != null) {
            c526940KlY = c526940KlY3;
        }
        C786410Ut5.F0(c526940KlY, 8);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJIL(boolean z) {
        this.LLJJI = z;
    }

    public final void LJJIZ(boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LL);
        c2344009Gk.LJIIIIZZ("shoot_way", this.LLILLJJLI);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("in_detail", str);
        C20684815ws.LJIILLIIL("choose_upload_music_content", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIILL(View view, boolean z) {
        C526940KlY c526940KlY = (C526940KlY) view;
        this.LLILZIL = c526940KlY;
        C526940KlY c526940KlY2 = null;
        if (c526940KlY == null) {
            c526940KlY = null;
        }
        C786410Ut5.F0(c526940KlY, 0);
        C526940KlY c526940KlY3 = this.LLILZIL;
        if (c526940KlY3 == null) {
            c526940KlY3 = null;
        }
        C197039127h c197039127h = c526940KlY3.LLILLJJLI;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(false);
        LJJJ();
        LJJJI();
        C526940KlY c526940KlY4 = this.LLILZIL;
        if (c526940KlY4 != null) {
            c526940KlY2 = c526940KlY4;
        }
        c526940KlY2.setOnExtractClick(new C580850MqJ(this, 15, 42));
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJ(View view, String str) {
        C526940KlY c526940KlY = (C526940KlY) view;
        this.LLILZIL = c526940KlY;
        C526940KlY c526940KlY2 = null;
        if (c526940KlY == null) {
            c526940KlY = null;
        }
        C197039127h c197039127h = c526940KlY.LLILLJJLI;
        if (c197039127h == null) {
            c197039127h = null;
        }
        c197039127h.setEnabled(false);
        C526940KlY c526940KlY3 = this.LLILZIL;
        if (c526940KlY3 != null) {
            c526940KlY2 = c526940KlY3;
        }
        C786410Ut5.F0(c526940KlY2, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LL);
        c2344009Gk.LJIIIIZZ("shoot_way", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILZ);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("enter_upload_music_page", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[PHI: r1
      0x00ea: PHI (r1v6 int) = (r1v3 int), (r1v10 int) binds: [B:55:0x00e0, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r6, boolean r7, boolean r8, X.C0L90 r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526760KlG.LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, boolean, boolean, X.0L90):int");
    }
}
