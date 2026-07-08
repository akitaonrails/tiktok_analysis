package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694515yR extends AbstractC20694715yT {
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final C419910GdJ LLJJ;
    public final Object LLJJI;
    public final PushItem LLJJIII;
    public final boolean LLJJIJI;
    public final EnumC1216700hlc LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final String LLJJJ;
    public final boolean LLJJJIL;

    @Override // X.AbstractC20694715yT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20694515yR)) {
            return false;
        }
        C20694515yR c20694515yR = (C20694515yR) obj;
        return Intrinsics.LJFF(this.LLJ, c20694515yR.LLJ) && this.LLJI == c20694515yR.LLJI && this.LLJIJIL == c20694515yR.LLJIJIL && this.LLJILJIL == c20694515yR.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c20694515yR.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c20694515yR.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c20694515yR.LLJJ) && Intrinsics.LJFF(this.LLJJI, c20694515yR.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c20694515yR.LLJJIII) && this.LLJJIJI == c20694515yR.LLJJIJI && this.LLJJIJIIJIL == c20694515yR.LLJJIJIIJIL && this.LLJJIJIL == c20694515yR.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c20694515yR.LLJJJ) && this.LLJJJIL == c20694515yR.LLJJJIL;
    }

    public final int hashCode() {
        String str = this.LLJ;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJJ;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        Object obj = this.LLJJI;
        int iHashCode3 = (((((((((iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LLJJIII.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31;
        String str2 = this.LLJJJ;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJIL);
    }

    public final String toString() {
        return "SubPageWithSchemaPushItem(label=" + this.LLJ + ", showArrow=" + this.LLJI + ", showAlertBadge=" + this.LLJIJIL + ", isSMSType=" + this.LLJILJIL + ", uniqueId=" + this.LLJILJILJ + ", title=" + this.LLJILLL + ", icon=" + this.LLJJ + ", tag=" + this.LLJJI + ", payload=" + this.LLJJIII + ", visibility=" + this.LLJJIJI + ", cellVariant=" + this.LLJJIJIIJIL + ", divider=" + this.LLJJIJIL + ", subTitle=" + this.LLJJJ + ", enable=" + this.LLJJJIL + ')';
    }

    @Override // X.AbstractC20694715yT, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC20694715yT
    public final PushItem LIZIZ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC20694715yT
    public final String getUniqueId() {
        return this.LLJILJILJ;
    }

    public static C20694515yR LJ(C20694515yR c20694515yR, boolean z) {
        String str = c20694515yR.LLJ;
        boolean z2 = c20694515yR.LLJI;
        boolean z3 = c20694515yR.LLJIJIL;
        boolean z4 = c20694515yR.LLJILJIL;
        String str2 = c20694515yR.LLJILJILJ;
        String str3 = c20694515yR.LLJILLL;
        C419910GdJ c419910GdJ = c20694515yR.LLJJ;
        Object obj = c20694515yR.LLJJI;
        PushItem pushItem = c20694515yR.LLJJIII;
        boolean z5 = c20694515yR.LLJJIJI;
        EnumC1216700hlc enumC1216700hlc = c20694515yR.LLJJIJIIJIL;
        boolean z6 = c20694515yR.LLJJIJIL;
        String str4 = c20694515yR.LLJJJ;
        c20694515yR.getClass();
        return new C20694515yR(str, z2, z3, z4, str2, str3, c419910GdJ, obj, pushItem, z5, enumC1216700hlc, z6, str4, z);
    }

    @Override // X.AbstractC20694715yT
    public final AbstractC20694715yT LIZLLL(Function1 function1, boolean z) {
        return LJ(this, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20694515yR(boolean z, String str, String str2, C419910GdJ c419910GdJ, PushItem pushItem, boolean z2, String str3, boolean z3, int i) {
        boolean z4;
        EnumC1216700hlc enumC1216700hlc;
        boolean z5 = z3;
        String str4 = str3;
        boolean z6 = z2;
        C419910GdJ c419910GdJ2 = c419910GdJ;
        boolean z7 = z;
        if ((i & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z7 = (i & 8) != 0 ? false : z7;
        c419910GdJ2 = (i & 64) != 0 ? null : c419910GdJ2;
        z6 = (i & 512) != 0 ? true : z6;
        if ((i & 1024) != 0) {
            enumC1216700hlc = EnumC1216700hlc.NORMAL;
        } else {
            enumC1216700hlc = null;
        }
        this(null, z4, false, z7, str, str2, c419910GdJ2, null, pushItem, z6, enumC1216700hlc, false, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str4, (i & 8192) != 0 ? true : z5);
    }

    public C20694515yR(String str, boolean z, boolean z2, boolean z3, String str2, String str3, C419910GdJ c419910GdJ, Object obj, PushItem pushItem, boolean z4, EnumC1216700hlc enumC1216700hlc, boolean z5, String str4, boolean z6) {
        super(str2, z4, z5, obj, pushItem);
        this.LLJ = str;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = str2;
        this.LLJILLL = str3;
        this.LLJJ = c419910GdJ;
        this.LLJJI = obj;
        this.LLJJIII = pushItem;
        this.LLJJIJI = z4;
        this.LLJJIJIIJIL = enumC1216700hlc;
        this.LLJJIJIL = z5;
        this.LLJJJ = str4;
        this.LLJJJIL = z6;
    }
}
