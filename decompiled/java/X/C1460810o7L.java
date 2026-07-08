package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460810o7L extends AbstractC1643610ssB<FTCEditStickerViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final AFwS210S0000000_22 LLJ = AFwS210S0000000_22.get$arr$(292);
    public final C01GW LLJI;

    @Override // X.AbstractC1643600ssA
    public final void o2() {
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        ((FTCEditStickerViewModel) X1()).hD1((C1460790o7J) this.LLJI.getValue());
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditStickerViewModel> W1() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1460810o7L(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 811));
        this.LLJI = c01gwLIZIZ;
        C1460790o7J c1460790o7J = (C1460790o7J) c01gwLIZIZ.getValue();
        c1460790o7J.LLJJI = (InterfaceC1461390o8H) c1drg.LJII(InterfaceC1461390o8H.class, null);
        c1460790o7J.LLJJIII = (C121O) c1drg.LJII(C121O.class, null);
        c1460790o7J.LLJJJJLIIL = (InterfaceC384890F7f) c1drg.LJII(InterfaceC384890F7f.class, null);
        c19a3.add(R.id.grj, c1460790o7J, "FTCEditStickerScene");
    }
}
