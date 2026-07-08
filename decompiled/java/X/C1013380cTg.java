package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import java.util.List;

/* JADX INFO: renamed from: X.0cTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013380cTg implements InterfaceC1013490cTr {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final FrameLayout LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C1013630cU5 LJ;
    public final /* synthetic */ AnoleMultiContentItemModel LJFF;

    @Override // X.InterfaceC1013490cTr
    public final void LIZIZ() {
        C1013630cU5 c1013630cU5 = this.LJ;
        InterfaceC1013420cTk interfaceC1013420cTk = c1013630cU5.LLILLJJLI;
        int i = c1013630cU5.LLIZLLLIL;
        interfaceC1013420cTk.LLIIL(i, new C0RAO(i) { // from class: X.0RAN
            public final int LIZ;

            @Override // X.C0RAO
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0RAN) && this.LIZ == ((C0RAN) obj).LIZ;
            }

            @Override // X.C0RAO
            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0RAN.class.getSimpleName());
                sbLIZ.append('_');
                sbLIZ.append(this.LIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = i;
            }
        });
    }

    public final String LJ() {
        return this.LJFF.getPlayerAccessKey();
    }

    @Override // X.InterfaceC1013490cTr
    public final void onStart() {
        C1013630cU5 c1013630cU5 = this.LJ;
        InterfaceC1013420cTk interfaceC1013420cTk = c1013630cU5.LLILLJJLI;
        int i = c1013630cU5.LLIZLLLIL;
        interfaceC1013420cTk.LLIIL(i, new C0RAO(i) { // from class: X.0RAR
            public final int LIZ;

            @Override // X.C0RAO
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0RAR) && this.LIZ == ((C0RAR) obj).LIZ;
            }

            @Override // X.C0RAO
            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0RAR.class.getSimpleName());
                sbLIZ.append('_');
                sbLIZ.append(this.LIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = i;
            }
        });
    }

    @Override // X.InterfaceC1013490cTr
    public final FrameLayout M4() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1013490cTr
    public final String getItemId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1013490cTr
    public final void LIZ(int i) {
        C1013630cU5 c1013630cU5 = this.LJ;
        InterfaceC1013420cTk interfaceC1013420cTk = c1013630cU5.LLILLJJLI;
        int i2 = c1013630cU5.LLIZLLLIL;
        interfaceC1013420cTk.LLIIL(i2, new C0RAU(i2, i));
    }

    @Override // X.InterfaceC1013490cTr
    public final void LIZJ(int i) {
        C1013630cU5 c1013630cU5 = this.LJ;
        InterfaceC1013420cTk interfaceC1013420cTk = c1013630cU5.LLILLJJLI;
        int i2 = c1013630cU5.LLIZLLLIL;
        interfaceC1013420cTk.LLIIL(i2, new C0RAV(i2, i));
    }

    @Override // X.InterfaceC1013490cTr
    public final void LIZLLL(C1481290oeN c1481290oeN) {
        Integer numValueOf;
        C1013630cU5 c1013630cU5 = this.LJ;
        InterfaceC1013420cTk interfaceC1013420cTk = c1013630cU5.LLILLJJLI;
        final int i = c1013630cU5.LLIZLLLIL;
        interfaceC1013420cTk.LLIIL(i, new C0RAO(i) { // from class: X.0RAQ
            public final int LIZ;

            @Override // X.C0RAO
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0RAQ) && this.LIZ == ((C0RAQ) obj).LIZ;
            }

            @Override // X.C0RAO
            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0RAQ.class.getSimpleName());
                sbLIZ.append('_');
                sbLIZ.append(this.LIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = i;
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pos: ");
        sbLIZ.append(this.LJ.LLIZLLLIL);
        sbLIZ.append(" onError error = ");
        if (c1481290oeN != null) {
            numValueOf = Integer.valueOf(c1481290oeN.LJ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" sourceId = ");
        sbLIZ.append(this.LIZLLL);
        C1022620cia.LIZ("MultiContentVideoItemViewHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1013380cTg(String str, List<String> list, C1013630cU5 c1013630cU5, AnoleMultiContentItemModel anoleMultiContentItemModel) {
        this.LIZLLL = str;
        this.LJ = c1013630cU5;
        this.LJFF = anoleMultiContentItemModel;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c1013630cU5.LLILZ;
    }
}
