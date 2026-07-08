package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605720rt4 {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final InterfaceC1605730rt5 LIZJ;
    public final C01GW LIZLLL;
    public long LJ;

    public final ConcurrentHashMap<String, MutableLiveData<C727780Sgi>> LIZIZ() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final ConcurrentHashMap<String, C727780Sgi> LIZJ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    public C1605720rt4(EnumC1615506Uf enumC1615506Uf) {
        if (((Boolean) C145100gz.LIZ.getValue()).booleanValue()) {
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            InterfaceC2188711AlJ interfaceC2188711AlJ = new InterfaceC2188711AlJ() { // from class: X.0Qxd
                @Override // X.InterfaceC2188711AlJ
                public final void LIZ(C1768270w7F c1768270w7F) {
                    C09QO c09qo = c1768270w7F.LIZIZ;
                    if (c09qo != null) {
                        int i = C687300Qxc.LIZ[c09qo.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                this.LIZ.LIZ("low_physical_mem");
                                return;
                            }
                            return;
                        }
                        this.LIZ.LIZ("low_java_mem");
                    }
                }
            };
            c2188561Al4.getClass();
            C2188561Al4.LJII(interfaceC2188711AlJ);
        }
        this.LIZ = C452501pT.LIZIZ(new C1605820rtE());
        this.LIZIZ = C452501pT.LIZIZ(new C1605810rtD());
        this.LIZJ = C1605760rt8.LIZ(enumC1615506Uf);
        this.LIZLLL = C452501pT.LIZIZ(new C1605830rtF());
    }

    public final void LIZ(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), C0PEM.LIZJ, null, new C0JFB(this, str, null), 2);
    }

    public final C727780Sgi LIZLLL(String str, C727780Sgi c727780Sgi, EnumC1605740rt6 enumC1605740rt6) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Long lValueOf;
        UserAllStoryMetadata userAllStoryMetadata;
        C727780Sgi c727780Sgi2 = LIZJ().get(str);
        C727780Sgi c727780SgiLIZ = c727780Sgi.LIZ();
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUserSocialStatusV2 [");
        sbLIZ.append(enumC1605740rt6.print());
        sbLIZ.append("']: \nuserSocialStatus: ");
        sbLIZ.append(c727780SgiLIZ.LIZ);
        sbLIZ.append(" version");
        UserAllStoryMetadata userAllStoryMetadata2 = c727780SgiLIZ.LIZLLL;
        Long lValueOf2 = null;
        if (userAllStoryMetadata2 != null) {
            numValueOf = Integer.valueOf(userAllStoryMetadata2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(": ");
        sbLIZ.append(c727780SgiLIZ.LIZIZ());
        sbLIZ.append(", \npreUserSocialStatus: ");
        if (c727780Sgi2 != null) {
            numValueOf2 = Integer.valueOf(c727780Sgi2.LIZ);
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" version");
        if (c727780Sgi2 != null && (userAllStoryMetadata = c727780Sgi2.LIZLLL) != null) {
            numValueOf3 = Integer.valueOf(userAllStoryMetadata.hashCode());
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(numValueOf3);
        sbLIZ.append(": ");
        if (c727780Sgi2 != null) {
            lValueOf2 = Long.valueOf(c727780Sgi2.LIZIZ());
        }
        sbLIZ.append(lValueOf2);
        sbLIZ.append(" \n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZIZ("SocPubStatusCache", strLIZIZ);
        long jLIZIZ = c727780SgiLIZ.LIZIZ();
        if (c727780Sgi2 != null && (lValueOf = Long.valueOf(c727780Sgi2.LIZIZ())) != null && jLIZIZ <= lValueOf.longValue() && jLIZIZ != -1) {
            return c727780Sgi2;
        }
        if (((Boolean) C104800aU.LIZ.getValue()).booleanValue() && c727780SgiLIZ.LIZ <= 0) {
            LIZJ().remove(str);
        } else {
            LIZJ().put(str, c727780SgiLIZ);
        }
        MutableLiveData<C727780Sgi> mutableLiveData = LIZIZ().get(str);
        if (mutableLiveData != null) {
            mutableLiveData.postValue(c727780SgiLIZ);
        }
        return c727780SgiLIZ;
    }
}
