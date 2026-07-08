package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414540mui extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1412860ms0 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1414560muk LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C1412800mru LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414540mui(C1412860ms0 c1412860ms0, boolean z, C1414560muk c1414560muk, int i, int i2, boolean z2, C1412800mru c1412800mru, boolean z3) {
        super(0);
        this.LL = c1412860ms0;
        this.LLILLJJLI = z;
        this.LLILLL = c1414560muk;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z2;
        this.LLIZ = c1412800mru;
        this.LLIZLLLIL = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1412800mru c1412800mruLJIL;
        C1414580mum.LIZJ(C1414580mum.LIZ, this.LL.LIZ.getAsset_id(), true, this.LLILLJJLI);
        C1412860ms0 c1412860ms0 = this.LL;
        AbstractC1412880ms2 abstractC1412880ms2 = c1412860ms0.LIZIZ;
        if (abstractC1412880ms2 != null) {
            this.LLIZ.LJ = abstractC1412880ms2;
        }
        C1414560muk c1414560muk = this.LLILLL;
        C1414640mus c1414640mus = c1414560muk.LIZ;
        InterfaceC1414530muh interfaceC1414530muh = c1414640mus.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1414530muh != null) {
            boolean z = this.LLIZLLLIL;
            C1412800mru c1412800mru = this.LLIZ;
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            boolean z2 = this.LLILZLL;
            boolean zMR1 = interfaceC1414530muh.mR1(c1412860ms0.LIZ.getAsset_id());
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MixEditingMaterialOperationComponent -> onMixMaterialResourceReady -> assetId=");
            sbLIZ.append(c1412860ms0.LIZ.getAsset_id());
            sbLIZ.append(", isApplied=");
            sbLIZ.append(zMR1);
            sbLIZ.append(", forceApply=");
            sbLIZ.append(z);
            sbLIZ.append(", shouldApply=");
            sbLIZ.append(zMR1 || z);
            C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
            if (zMR1 || z) {
                if (c1412800mru.LIZ() != null) {
                    c1414560muk.LIZ.nB(new C1414670muv(i, i2, 0, c1412860ms0, z2, c1412800mru, 96), C1412450mrL.LIZ(c1412800mru));
                }
                if (C0BYM.LIZ()) {
                    c1414560muk.LIZ.LLLFF.LIZ(false, c1412860ms0, true, 0, true);
                }
            } else {
                if (C0BYM.LIZ()) {
                    InterfaceC1414530muh interfaceC1414530muh2 = c1414560muk.LIZ.LLJJLIIIJLLLLLLLZ;
                    if (interfaceC1414530muh2 == null || (c1412800mruLJIL = interfaceC1414530muh2.LJIL()) == null || c1412800mruLJIL.LIZ == MixEditingMaterialType.CANCEL_TYPE) {
                        c1414560muk.LIZ.LLLFF.LIZ(false, c1412860ms0, true, 0, true);
                    } else {
                        c1414560muk.LIZ.LLLFF.LIZ(false, c1412860ms0, false, 0, false);
                    }
                }
                InterfaceC1414570mul interfaceC1414570mul = c1414560muk.LIZ.LLJL;
                if (interfaceC1414570mul != null) {
                    interfaceC1414570mul.LIZIZ(c1412800mru);
                }
            }
        } else {
            int i3 = this.LLILZ;
            int i4 = this.LLILZIL;
            boolean z3 = this.LLILZLL;
            C1412800mru c1412800mru2 = this.LLIZ;
            c1414640mus.nB(new C1414670muv(i3, i4, 0, c1412860ms0, z3, c1412800mru2, 96), C1412450mrL.LIZ(c1412800mru2));
        }
        return Unit.LIZ;
    }
}
