package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.10vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19403310vf implements InterfaceC19403010vc {
    public static final /* synthetic */ int LJIIL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC587610N2x LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public C19403110vd LJFF;
    public C19401910vR LJIIIIZZ;
    public C19425210zC LJIIIZ;
    public String LJIIJJI;
    public final ArrayList<InterfaceC19426310zN> LJI = new ArrayList<>();
    public HashMap<String, C19425410zE> LJII = new LinkedHashMap();
    public final HashMap<String, C19425110zB> LJIIJ = new LinkedHashMap();

    @Override // X.InterfaceC19403010vc
    public final HashMap<String, C19425410zE> LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC19403010vc
    public final C19425210zC LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC19403010vc
    public final ArrayList<InterfaceC19426310zN> LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC19403010vc
    public final HashMap<String, C19425110zB> LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC19403010vc
    public final boolean LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC19403010vc
    public final C19401910vR LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC19403010vc
    public final C19403110vd getExtra() {
        return this.LJFF;
    }

    @Override // X.InterfaceC19403010vc
    public final String getGroupId() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC19403010vc
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19403010vc
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC19403010vc
    public final EnumC587610N2x getType() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19403010vc
    public final void LJI(HashMap<String, C19425410zE> map) {
        this.LJII = map;
    }

    public C19403310vf(String str, String str2, EnumC587610N2x enumC587610N2x, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC587610N2x;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
