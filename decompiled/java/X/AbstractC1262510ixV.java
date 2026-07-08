package X;

import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ixV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1262510ixV {
    public static final EnumC1070410dxf[] LJI;
    public final EnumC1070410dxf[] LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Function0<Boolean> LJ;
    public final EnumC1260230itp LJFF;

    public AbstractC1262510ixV() {
        throw null;
    }

    public int LIZIZ(boolean z) {
        return 0;
    }

    static {
        LJI = SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB) ? new EnumC1070410dxf[]{EnumC1070410dxf.CONTACT, EnumC1070410dxf.FACEBOOK} : new EnumC1070410dxf[]{EnumC1070410dxf.CONTACT};
    }

    public final List<C1261770iwJ> LIZ() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return C13BV.INSTANCE;
        }
        EnumC1070410dxf[] enumC1070410dxfArr = this.LIZ;
        ArrayList arrayList = new ArrayList(enumC1070410dxfArr.length);
        for (EnumC1070410dxf enumC1070410dxf : enumC1070410dxfArr) {
            arrayList.add(new C1261770iwJ(enumC1070410dxf, this, this.LIZIZ));
        }
        return arrayList;
    }

    public AbstractC1262510ixV(EnumC1070410dxf[] enumC1070410dxfArr, boolean z, boolean z2, boolean z3, Function0 function0, EnumC1260230itp enumC1260230itp, int i) {
        enumC1070410dxfArr = (i & 1) != 0 ? LJI : enumC1070410dxfArr;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        function0 = (i & 16) != 0 ? AFwS207S0000000_19.get$arr$(694) : function0;
        enumC1260230itp = (i & 32) != 0 ? EnumC1260230itp.DEFAULT : enumC1260230itp;
        this.LIZ = enumC1070410dxfArr;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = function0;
        this.LJFF = enumC1260230itp;
    }
}
