package X;

import android.os.Build;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694815yU extends AbstractC20694715yT {
    public final boolean LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final C419910GdJ LLJILLL;
    public final String LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final Object LLJJIJI;
    public final EnumC1216700hlc LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final PushItem LLJJJ;

    @Override // X.AbstractC20694715yT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20694815yU)) {
            return false;
        }
        C20694815yU c20694815yU = (C20694815yU) obj;
        return this.LLJ == c20694815yU.LLJ && this.LLJI == c20694815yU.LLJI && Intrinsics.LJFF(this.LLJIJIL, c20694815yU.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c20694815yU.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c20694815yU.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c20694815yU.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c20694815yU.LLJJ) && this.LLJJI == c20694815yU.LLJJI && this.LLJJIII == c20694815yU.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c20694815yU.LLJJIJI) && this.LLJJIJIIJIL == c20694815yU.LLJJIJIIJIL && this.LLJJIJIL == c20694815yU.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c20694815yU.LLJJJ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJILLL;
        int iHashCode = (iZ2 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        String str = this.LLJJ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31;
        Object obj = this.LLJJIJI;
        return ((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + this.LLJJJ.hashCode();
    }

    public final String toString() {
        return "CommonPushSwitchItem(isChecked=" + this.LLJ + ", isSubPage=" + this.LLJI + ", pageLabel=" + this.LLJIJIL + ", uniqueId=" + this.LLJILJIL + ", title=" + this.LLJILJILJ + ", icon=" + this.LLJILLL + ", subTitle=" + this.LLJJ + ", visibility=" + this.LLJJI + ", divider=" + this.LLJJIII + ", tag=" + this.LLJJIJI + ", cellVariant=" + this.LLJJIJIIJIL + ", enable=" + this.LLJJIJIL + ", payload=" + this.LLJJJ + ')';
    }

    @Override // X.AbstractC20694715yT, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20694715yT
    public final PushItem LIZIZ() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC20694715yT
    public final String getUniqueId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC20694715yT
    public final AbstractC20694715yT LIZLLL(Function1 function1, boolean z) {
        C20694915yV c20694915yV;
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = this.LLJJIJI;
            if ((obj instanceof C20694915yV) && (c20694915yV = (C20694915yV) obj) != null) {
                boolean zLIZ = C824420WVs.LIZ(c20694915yV.LIZ);
                if (c20694915yV.LIZJ != zLIZ) {
                    c20694915yV.LIZJ = zLIZ;
                    if (!c20694915yV.LIZIZ && zLIZ) {
                        c20694915yV.LIZIZ = true;
                        if (function1 != null) {
                            function1.invoke(new C20696115yh(c20694915yV.LIZ, this.LLJIJIL, this.LLJI));
                        }
                    }
                }
                return LJ(this, c20694915yV.LIZ(), c20694915yV, z, 5630);
            }
        }
        return LJ(this, false, null, z, 6143);
    }

    public static C20694815yU LJ(C20694815yU c20694815yU, boolean z, C20694915yV c20694915yV, boolean z2, int i) {
        boolean z3;
        String str;
        String str2;
        String str3;
        C419910GdJ c419910GdJ;
        String str4;
        boolean z4;
        EnumC1216700hlc enumC1216700hlc;
        boolean z5 = z2;
        Object obj = c20694915yV;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c20694815yU.LLJ;
        }
        boolean z7 = false;
        if ((i & 2) != 0) {
            z3 = c20694815yU.LLJI;
        } else {
            z3 = false;
        }
        PushItem pushItem = null;
        if ((i & 4) != 0) {
            str = c20694815yU.LLJIJIL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = c20694815yU.LLJILJIL;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = c20694815yU.LLJILJILJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            c419910GdJ = c20694815yU.LLJILLL;
        } else {
            c419910GdJ = null;
        }
        if ((i & 64) != 0) {
            str4 = c20694815yU.LLJJ;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            z4 = c20694815yU.LLJJI;
        } else {
            z4 = false;
        }
        if ((i & 256) != 0) {
            z7 = c20694815yU.LLJJIII;
        }
        if ((i & 512) != 0) {
            obj = c20694815yU.LLJJIJI;
        }
        if ((i & 1024) != 0) {
            enumC1216700hlc = c20694815yU.LLJJIJIIJIL;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z5 = c20694815yU.LLJJIJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            pushItem = c20694815yU.LLJJJ;
        }
        c20694815yU.getClass();
        return new C20694815yU(c419910GdJ, enumC1216700hlc, pushItem, obj, str, str2, str3, str4, z6, z3, z4, z7, z5);
    }

    public /* synthetic */ C20694815yU(C419910GdJ c419910GdJ, PushItem pushItem, C20694915yV c20694915yV, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this(c419910GdJ, EnumC1216700hlc.NORMAL, pushItem, c20694915yV, str, str2, str3, str4, z, z2, z3, false, z4);
    }

    public C20694815yU(C419910GdJ c419910GdJ, EnumC1216700hlc enumC1216700hlc, PushItem pushItem, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(str2, z3, z4, obj, pushItem);
        this.LLJ = z;
        this.LLJI = z2;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = c419910GdJ;
        this.LLJJ = str4;
        this.LLJJI = z3;
        this.LLJJIII = z4;
        this.LLJJIJI = obj;
        this.LLJJIJIIJIL = enumC1216700hlc;
        this.LLJJIJIL = z5;
        this.LLJJJ = pushItem;
    }
}
