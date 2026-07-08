package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1AsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193201AsY implements InterfaceC1259690isx, InterfaceC2193211AsZ {
    public final LifecycleOwner LIZIZ;
    public final InterfaceC2193211AsZ LIZJ;

    @Override // X.InterfaceC2193211AsZ
    public final void LIZLLL(C2193291Ash c2193291Ash) {
        this.LIZJ.LIZLLL(c2193291Ash);
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJ(C19720512Dr c19720512Dr, EnumC2193181AsW enumC2193181AsW, Map<String, ? extends Object> map) {
        this.LIZJ.LJ(c19720512Dr, enumC2193181AsW, map);
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJIIIIZZ(EnumC2193221Asa enumC2193221Asa) {
        this.LIZJ.LJIIIIZZ(enumC2193221Asa);
    }

    @Override // X.InterfaceC2193211AsZ
    public final void initialize() {
        this.LIZJ.initialize();
    }

    @Override // X.InterfaceC1259690isx
    public final InterfaceC346201Wa<C19720512Dr> LIZ() {
        return this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC2193211AsZ
    public final void LJFF() {
        this.LIZJ.LJFF();
    }

    @Override // X.InterfaceC1259690isx
    public final void destroy() {
        this.LIZJ.destroy();
    }

    @Override // X.InterfaceC1259690isx
    public final void LIZIZ(List<? extends Aweme> list) {
        this.LIZJ.LIZIZ(list);
    }

    @Override // X.InterfaceC1259690isx
    public final void LIZJ(String str) {
        this.LIZJ.LIZJ(str);
    }

    @Override // X.InterfaceC1259690isx
    public final void LJII(EnumC2193151AsT enumC2193151AsT) {
        EnumC2193221Asa enumC2193221Asa;
        InterfaceC2193211AsZ.LIZ.getClass();
        switch (C2193141AsS.LIZ[enumC2193151AsT.ordinal()]) {
            case 1:
                enumC2193221Asa = EnumC2193221Asa.PAGE_INIT;
                break;
            case 2:
                enumC2193221Asa = EnumC2193221Asa.PULL_TO_REFRESH;
                break;
            case 3:
                enumC2193221Asa = EnumC2193221Asa.VISIBILITY_CHANGE;
                break;
            case 4:
                enumC2193221Asa = EnumC2193221Asa.CLICK_PUBLISH;
                break;
            case 5:
                enumC2193221Asa = EnumC2193221Asa.DRAFT_SAVED;
                break;
            case 6:
                enumC2193221Asa = EnumC2193221Asa.DRAFT_DELETED;
                break;
            case 7:
                enumC2193221Asa = EnumC2193221Asa.DELETE_POST;
                break;
            default:
                throw new C1954807lC();
        }
        this.LIZJ.LJIIIIZZ(enumC2193221Asa);
    }

    public C2193201AsY(AwemeListFragmentImpl awemeListFragmentImpl, SearchCSIProfileBannerRepoV3 searchCSIProfileBannerRepoV3) {
        this.LIZIZ = awemeListFragmentImpl;
        this.LIZJ = searchCSIProfileBannerRepoV3;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(awemeListFragmentImpl), null, null, new AnonymousClass0942(this, null), 3);
    }

    @Override // X.InterfaceC1259690isx
    public final void LJI(C19720512Dr c19720512Dr, EnumC2193121AsQ enumC2193121AsQ, String str) {
        EnumC2193181AsW enumC2193181AsW;
        Map<String, ? extends Object> mapLIZJ;
        InterfaceC2193211AsZ.LIZ.getClass();
        switch (C2193141AsS.LIZIZ[enumC2193121AsQ.ordinal()]) {
            case 1:
                enumC2193181AsW = EnumC2193181AsW.SHOW;
                break;
            case 2:
                enumC2193181AsW = EnumC2193181AsW.CLICK;
                break;
            case 3:
                enumC2193181AsW = EnumC2193181AsW.CLOSE;
                break;
            case 4:
                enumC2193181AsW = EnumC2193181AsW.PUBLISH;
                break;
            case 5:
                enumC2193181AsW = EnumC2193181AsW.FLAG;
                break;
            case 6:
                enumC2193181AsW = EnumC2193181AsW.DISLIKE;
                break;
            default:
                throw new C1954807lC();
        }
        if (str != null) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("itemId", str));
        } else {
            mapLIZJ = null;
        }
        this.LIZJ.LJ(c19720512Dr, enumC2193181AsW, mapLIZJ);
    }
}
