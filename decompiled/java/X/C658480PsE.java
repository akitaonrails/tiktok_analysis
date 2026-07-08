package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658480PsE implements InterfaceC658970Pt1 {
    public InterfaceC641090PCp LIZ;
    public InterfaceC652950PjJ LIZIZ;
    public C652990PjN LIZJ;
    public AbstractC653010PjP LIZLLL;
    public InterfaceC655620Pnc LJ;
    public int LJFF;
    public Aweme LJI;
    public C653660PkS LJII;
    public C1ACD LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public AbstractC658540PsK LJIIJJI;
    public Function0<? extends Map<String, String>> LJIIL;
    public String LJIILIIL;

    public C658480PsE() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C658480PsE)) {
            return false;
        }
        C658480PsE c658480PsE = (C658480PsE) obj;
        return Intrinsics.LJFF(this.LIZ, c658480PsE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c658480PsE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c658480PsE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c658480PsE.LIZLLL) && Intrinsics.LJFF(this.LJ, c658480PsE.LJ) && this.LJFF == c658480PsE.LJFF && Intrinsics.LJFF(this.LJI, c658480PsE.LJI) && Intrinsics.LJFF(this.LJII, c658480PsE.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c658480PsE.LJIIIIZZ) && this.LJIIIZ == c658480PsE.LJIIIZ && this.LJIIJ == c658480PsE.LJIIJ && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJIIJJI, c658480PsE.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c658480PsE.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c658480PsE.LJIILIIL);
    }

    public final int hashCode() {
        InterfaceC641090PCp interfaceC641090PCp = this.LIZ;
        int iHashCode = (interfaceC641090PCp == null ? 0 : interfaceC641090PCp.hashCode()) * 31;
        InterfaceC652950PjJ interfaceC652950PjJ = this.LIZIZ;
        int iHashCode2 = (iHashCode + (interfaceC652950PjJ == null ? 0 : interfaceC652950PjJ.hashCode())) * 31;
        C652990PjN c652990PjN = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c652990PjN == null ? 0 : c652990PjN.hashCode())) * 31;
        AbstractC653010PjP abstractC653010PjP = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (abstractC653010PjP == null ? 0 : abstractC653010PjP.hashCode())) * 31;
        InterfaceC655620Pnc interfaceC655620Pnc = this.LJ;
        int iHashCode5 = (((iHashCode4 + (interfaceC655620Pnc == null ? 0 : interfaceC655620Pnc.hashCode())) * 31) + this.LJFF) * 31;
        Aweme aweme = this.LJI;
        int iHashCode6 = (iHashCode5 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C653660PkS c653660PkS = this.LJII;
        int iHashCode7 = (iHashCode6 + (c653660PkS == null ? 0 : c653660PkS.hashCode())) * 31;
        C1ACD c1acd = this.LJIIIIZZ;
        int iHashCode8 = (((((iHashCode7 + (c1acd == null ? 0 : c1acd.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31 * 31;
        AbstractC658540PsK abstractC658540PsK = this.LJIIJJI;
        int iHashCode9 = (iHashCode8 + (abstractC658540PsK == null ? 0 : abstractC658540PsK.hashCode())) * 31;
        Function0<? extends Map<String, String>> function0 = this.LJIIL;
        int iHashCode10 = (iHashCode9 + (function0 == null ? 0 : function0.hashCode())) * 31;
        String str = this.LJIILIIL;
        return iHashCode10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SearchLiveDataProvider(containerStatusProvider=" + this.LIZ + ", mPlayVideoObserver=" + this.LIZIZ + ", mScrollStateManager=" + this.LIZJ + ", mScrollStateObserver=" + this.LIZLLL + ", searchMediaLiveHelper=" + this.LJ + ", rank=" + this.LJFF + ", aweme=" + this.LJI + ", itemMobParam=" + this.LJII + ", mLivePlayHelper=" + this.LJIIIIZZ + ", mLiveStarted=" + this.LJIIIZ + ", mAttached=" + this.LJIIJ + ", mobListener=null, defaultSearchLivePlayListener=" + this.LJIIJJI + ", onLiveDurationParams=" + this.LJIIL + ", cardSchema=" + this.LJIILIIL + ')';
    }

    @Override // X.InterfaceC658970Pt1
    public final Aweme getAweme() {
        return this.LJI;
    }

    public C658480PsE(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = -1;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
    }
}
