package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625460sOu implements InterfaceC1625180sOS<Effect> {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC1448980noG LIZJ;
    public final Bundle LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerWrapperUnselectedRequest(");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sticker = ");
        Effect effect = this.LIZ;
        sbLIZ2.append(effect != null ? effect.getName() : null);
        sbLIZ2.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("position = ");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("requestSource = ");
        sbLIZ4.append(this.LIZJ);
        sbLIZ4.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("wantToUse = ");
        sbLIZ5.append(this.LJ);
        sbLIZ5.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ5));
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1625180sOS
    public final EnumC1448980noG LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1625180sOS
    public final /* bridge */ /* synthetic */ Effect LIZIZ() {
        return this.LIZ;
    }

    public C1625460sOu(int i, Bundle bundle, EnumC1448980noG enumC1448980noG, Effect effect, boolean z) {
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = enumC1448980noG;
        this.LIZLLL = bundle;
        this.LJ = z;
    }
}
