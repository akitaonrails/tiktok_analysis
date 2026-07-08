package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694615yS extends AbstractC20694715yT {
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final C419910GdJ LLJILLL;
    public final Object LLJJ;
    public final PushItem LLJJI;
    public final boolean LLJJIII;
    public final EnumC1216700hlc LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final boolean LLJJJ;

    @Override // X.AbstractC20694715yT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20694615yS)) {
            return false;
        }
        C20694615yS c20694615yS = (C20694615yS) obj;
        return Intrinsics.LJFF(this.LLJ, c20694615yS.LLJ) && this.LLJI == c20694615yS.LLJI && this.LLJIJIL == c20694615yS.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c20694615yS.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c20694615yS.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c20694615yS.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c20694615yS.LLJJ) && Intrinsics.LJFF(this.LLJJI, c20694615yS.LLJJI) && this.LLJJIII == c20694615yS.LLJJIII && this.LLJJIJI == c20694615yS.LLJJIJI && this.LLJJIJIIJIL == c20694615yS.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c20694615yS.LLJJIJIL) && this.LLJJJ == c20694615yS.LLJJJ;
    }

    public final int hashCode() {
        String str = this.LLJ;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJILLL;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        Object obj = this.LLJJ;
        int iHashCode3 = (((((((((iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LLJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31;
        String str2 = this.LLJJIJIL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJ);
    }

    public final String toString() {
        return "BottomRadiosSubPagePushItem(label=" + this.LLJ + ", showArrow=" + this.LLJI + ", showAlertBadge=" + this.LLJIJIL + ", uniqueId=" + this.LLJILJIL + ", title=" + this.LLJILJILJ + ", icon=" + this.LLJILLL + ", tag=" + this.LLJJ + ", payload=" + this.LLJJI + ", visibility=" + this.LLJJIII + ", cellVariant=" + this.LLJJIJI + ", divider=" + this.LLJJIJIIJIL + ", subTitle=" + this.LLJJIJIL + ", enable=" + this.LLJJJ + ')';
    }

    @Override // X.AbstractC20694715yT, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC20694715yT
    public final PushItem LIZIZ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20694715yT
    public final String getUniqueId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC20694715yT
    public final AbstractC20694715yT LIZLLL(Function1 function1, boolean z) {
        return LJ(this, null, z, 4095);
    }

    public static C20694615yS LJ(C20694615yS c20694615yS, String str, boolean z, int i) {
        boolean z2;
        boolean z3;
        String str2;
        String str3;
        C419910GdJ c419910GdJ;
        Object obj;
        PushItem pushItem;
        boolean z4;
        EnumC1216700hlc enumC1216700hlc;
        boolean z5 = z;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c20694615yS.LLJ;
        }
        boolean z6 = false;
        if ((i & 2) != 0) {
            z2 = c20694615yS.LLJI;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = c20694615yS.LLJIJIL;
        } else {
            z3 = false;
        }
        String str5 = null;
        if ((i & 8) != 0) {
            str2 = c20694615yS.LLJILJIL;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = c20694615yS.LLJILJILJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            c419910GdJ = c20694615yS.LLJILLL;
        } else {
            c419910GdJ = null;
        }
        if ((i & 64) != 0) {
            obj = c20694615yS.LLJJ;
        } else {
            obj = null;
        }
        if ((i & 128) != 0) {
            pushItem = c20694615yS.LLJJI;
        } else {
            pushItem = null;
        }
        if ((i & 256) != 0) {
            z4 = c20694615yS.LLJJIII;
        } else {
            z4 = false;
        }
        if ((i & 512) != 0) {
            enumC1216700hlc = c20694615yS.LLJJIJI;
        } else {
            enumC1216700hlc = null;
        }
        if ((i & 1024) != 0) {
            z6 = c20694615yS.LLJJIJIIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str5 = c20694615yS.LLJJIJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = c20694615yS.LLJJJ;
        }
        c20694615yS.getClass();
        return new C20694615yS(c419910GdJ, enumC1216700hlc, pushItem, obj, str4, str2, str3, str5, z2, z3, z4, z6, z5);
    }

    public /* synthetic */ C20694615yS(C419910GdJ c419910GdJ, PushItem pushItem, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this(c419910GdJ, EnumC1216700hlc.NORMAL, pushItem, null, str, str2, str3, str4, true, false, z, false, z2);
    }

    public C20694615yS(C419910GdJ c419910GdJ, EnumC1216700hlc enumC1216700hlc, PushItem pushItem, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(str2, z3, z4, obj, pushItem);
        this.LLJ = str;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = c419910GdJ;
        this.LLJJ = obj;
        this.LLJJI = pushItem;
        this.LLJJIII = z3;
        this.LLJJIJI = enumC1216700hlc;
        this.LLJJIJIIJIL = z4;
        this.LLJJIJIL = str4;
        this.LLJJJ = z5;
    }
}
