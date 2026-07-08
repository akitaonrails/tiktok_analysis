package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0sOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625440sOs implements InterfaceC1625180sOS<Effect> {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC1448980noG LIZJ;
    public final List<Effect> LIZLLL;
    public final Bundle LJ;
    public final InterfaceC1625550sP3 LJFF;
    public final InterfaceC1625560sP4 LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final C1625920sPe LJIIIZ;
    public final String LJIIJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerWrapperSelectedRequest(");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sticker = ");
        sbLIZ2.append(this.LIZ.getName());
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
        sbLIZ5.append("tabIndex = ");
        sbLIZ5.append(this.LJII);
        sbLIZ5.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("shouldAutoUseAfterDownloaded = ");
        sbLIZ6.append(this.LJIIIIZZ);
        sbLIZ6.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("stickerDownloadConfig = ");
        sbLIZ7.append(this.LJIIIZ);
        sbLIZ7.append(", ");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ7));
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

    /* JADX WARN: Multi-variable type inference failed */
    public C1625440sOs(Effect effect, int i, EnumC1448980noG enumC1448980noG, List<? extends Effect> list, Bundle bundle, InterfaceC1625550sP3 interfaceC1625550sP3, InterfaceC1625560sP4 interfaceC1625560sP4, int i2, boolean z, C1625920sPe c1625920sPe, String str) {
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = enumC1448980noG;
        this.LIZLLL = list;
        this.LJ = bundle;
        this.LJFF = interfaceC1625550sP3;
        this.LJI = interfaceC1625560sP4;
        this.LJII = i2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = c1625920sPe;
        this.LJIIJ = str;
    }
}
