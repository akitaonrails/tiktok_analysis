package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061Z implements InterfaceC0148002o {
    public final int LL;
    public final UrlModel LLILLJJLI;
    public final boolean LLILLL;
    public final IMAIBotInfo LLILZ;
    public final String LLILZIL;
    public final float LLILZLL;
    public final AbstractC15396061a LLIZ;
    public final boolean LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C061Z)) {
            return false;
        }
        C061Z c061z = (C061Z) obj;
        return this.LL == c061z.LL && Intrinsics.LJFF(this.LLILLJJLI, c061z.LLILLJJLI) && this.LLILLL == c061z.LLILLL && Intrinsics.LJFF(this.LLILZ, c061z.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c061z.LLILZIL) && Float.compare(this.LLILZLL, c061z.LLILZLL) == 0 && Intrinsics.LJFF(this.LLIZ, c061z.LLIZ) && this.LLIZLLLIL == c061z.LLIZLLLIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAIBotCreationState(createStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", createdBotInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", progressText=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", progressPercent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", alphaVideoState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", inRetryProcess=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        UrlModel urlModel = this.LLILLJJLI;
        int iHashCode = (((i + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        IMAIBotInfo iMAIBotInfo = this.LLILZ;
        int iHashCode2 = (iHashCode + (iMAIBotInfo == null ? 0 : iMAIBotInfo.hashCode())) * 31;
        String str = this.LLILZIL;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C061Z(int i, String str, float f, int i2) {
        C15397061b c15397061b;
        float f2 = f;
        String str2 = (i2 & 16) != 0 ? null : str;
        f2 = (i2 & 32) != 0 ? 0.0f : f2;
        if ((i2 & 64) != 0) {
            c15397061b = new AbstractC15396061a() { // from class: X.061b
                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C15397061b);
                }

                public final int hashCode() {
                    return -818036546;
                }

                public final String toString() {
                    return "Idle";
                }
            };
        } else {
            c15397061b = null;
        }
        this(i, null, false, null, str2, f2, c15397061b, false);
    }

    public C061Z(int i, UrlModel urlModel, boolean z, IMAIBotInfo iMAIBotInfo, String str, float f, AbstractC15396061a abstractC15396061a, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = urlModel;
        this.LLILLL = z;
        this.LLILZ = iMAIBotInfo;
        this.LLILZIL = str;
        this.LLILZLL = f;
        this.LLIZ = abstractC15396061a;
        this.LLIZLLLIL = z2;
    }

    public static C061Z LIZ(C061Z c061z, int i, UrlModel urlModel, boolean z, IMAIBotInfo iMAIBotInfo, String str, float f, AbstractC15396061a abstractC15396061a, boolean z2, int i2) {
        boolean z3 = z2;
        AbstractC15396061a abstractC15396061a2 = abstractC15396061a;
        float f2 = f;
        String str2 = str;
        IMAIBotInfo iMAIBotInfo2 = iMAIBotInfo;
        boolean z4 = z;
        UrlModel urlModel2 = urlModel;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c061z.LL;
        }
        if ((i2 & 2) != 0) {
            urlModel2 = c061z.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z4 = c061z.LLILLL;
        }
        if ((i2 & 8) != 0) {
            iMAIBotInfo2 = c061z.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str2 = c061z.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            f2 = c061z.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            abstractC15396061a2 = c061z.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z3 = c061z.LLIZLLLIL;
        }
        c061z.getClass();
        return new C061Z(i3, urlModel2, z4, iMAIBotInfo2, str2, f2, abstractC15396061a2, z3);
    }
}
