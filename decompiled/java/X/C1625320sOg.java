package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;

/* JADX INFO: renamed from: X.0sOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1625320sOg implements InterfaceC1623090sL5 {
    public final C19GS LIZ;
    public final C1629320sV8 LIZIZ;
    public final InterfaceC1629550sVV LIZJ;
    public final InterfaceC1635390sev LIZLLL;
    public final List<EffectCategoryModel> LJ;
    public final C1625920sPe LJFF;
    public final LifecycleOwner LJI;
    public InterfaceC1629750sVp LJII;
    public InterfaceC1629370sVD LJIIIIZZ;
    public final C1624340sN6 LJIIIZ;

    @Override // X.InterfaceC1623090sL5
    public final InterfaceC1624480sNK create() {
        InterfaceC1628820sUK interfaceC1628820sUKLIZIZ = LIZIZ(this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, false);
        return LIZ(this.LIZ, this.LIZIZ, interfaceC1628820sUKLIZIZ, this.LJIIIZ, this.LJIIIIZZ, this.LJFF, this.LJI);
    }

    public InterfaceC1628820sUK LIZIZ(C1629320sV8 c1629320sV8, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1629550sVV interfaceC1629550sVV, List<? extends EffectCategoryModel> list, boolean z) {
        C1629150sUr c1629150sUr = new C1629150sUr(c1629320sV8, interfaceC1635390sev, interfaceC1629550sVV, list, z);
        InterfaceC1629750sVp interfaceC1629750sVp = this.LJII;
        if (interfaceC1629750sVp != null) {
            c1629150sUr.LJFF = interfaceC1629750sVp;
        }
        return c1629150sUr;
    }

    public C1625320sOg(C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1629550sVV interfaceC1629550sVV, InterfaceC1635390sev interfaceC1635390sev, List list, LifecycleOwner lifecycleOwner, int i) {
        list = (i & 16) != 0 ? C1625360sOk.LIZ(c19gs) : list;
        lifecycleOwner = (i & 64) != 0 ? c19gs : lifecycleOwner;
        this.LIZ = c19gs;
        this.LIZIZ = c1629320sV8;
        this.LIZJ = interfaceC1629550sVV;
        this.LIZLLL = interfaceC1635390sev;
        this.LJ = list;
        this.LJFF = null;
        this.LJI = lifecycleOwner;
        this.LJIIIZ = new C1624340sN6();
    }

    public InterfaceC1624480sNK LIZ(C19GS c19gs, C1629320sV8 c1629320sV8, InterfaceC1628820sUK interfaceC1628820sUK, C1624340sN6 c1624340sN6, InterfaceC1629370sVD interfaceC1629370sVD, C1625920sPe c1625920sPe, LifecycleOwner lifecycleOwner) {
        return new DefaultStickerDataManager(c19gs, c1629320sV8, interfaceC1628820sUK, c1624340sN6, interfaceC1629370sVD, c1625920sPe, lifecycleOwner, 0, 128);
    }
}
