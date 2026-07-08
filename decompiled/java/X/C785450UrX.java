package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785450UrX {
    public final C0TF5 LIZ;
    public final EnumC785500Urc LIZIZ;
    public final View LIZJ;
    public final Integer LIZLLL;
    public final Drawable LJ;
    public final int LJFF;
    public final boolean LJI;

    public C785450UrX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C785450UrX)) {
            return false;
        }
        C785450UrX c785450UrX = (C785450UrX) obj;
        return this.LIZ == c785450UrX.LIZ && this.LIZIZ == c785450UrX.LIZIZ && Intrinsics.LJFF(this.LIZJ, c785450UrX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c785450UrX.LIZLLL) && Intrinsics.LJFF(this.LJ, c785450UrX.LJ) && this.LJFF == c785450UrX.LJFF && this.LJI == c785450UrX.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        View view = this.LIZJ;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Drawable drawable = this.LJ;
        return ((((iHashCode3 + (drawable != null ? drawable.hashCode() : 0)) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PadFallbackConfig(displayType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", implType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scrollTargetView=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bandBackgroundColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bandBackgroundDrawable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", containerWidthDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableAutoGridSpan=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public C785450UrX(int i) {
        float fMin;
        float fLIZLLL;
        C0TF5 c0tf5 = C0TF5.NONE;
        EnumC785500Urc enumC785500Urc = EnumC785500Urc.CONTAINER_VIEW;
        Resources system = Resources.getSystem();
        Configuration configuration = system.getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 > 0 && i3 > 0) {
            fMin = Math.min(i2, i3);
        } else {
            fMin = Math.min(r2.widthPixels, r2.heightPixels) / system.getDisplayMetrics().density;
        }
        try {
            fLIZLLL = C13LZ.LIZLLL(((Number) C20593515i9.LIZ.invoke()).floatValue(), 0.0f, 1.0f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fLIZLLL = 0.75f;
        }
        int iLIZIZ = C814420VxA.LIZIZ(fMin * fLIZLLL);
        this.LIZ = c0tf5;
        this.LIZIZ = enumC785500Urc;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = iLIZIZ;
        this.LJI = false;
    }
}
