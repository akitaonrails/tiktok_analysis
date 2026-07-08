package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19507611Tu implements InterfaceC111300bX {
    public final EnumC20618915mF LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19507611Tu)) {
            return false;
        }
        C19507611Tu c19507611Tu = (C19507611Tu) obj;
        return this.LL == c19507611Tu.LL && this.LLILLJJLI == c19507611Tu.LLILLJJLI && this.LLILLL == c19507611Tu.LLILLL && this.LLILZ == c19507611Tu.LLILZ && this.LLILZIL == c19507611Tu.LLILZIL && this.LLILZLL == c19507611Tu.LLILZLL && Intrinsics.LJFF(this.LLIZ, c19507611Tu.LLIZ) && this.LLIZLLLIL == c19507611Tu.LLIZLLLIL;
    }

    public final int hashCode() {
        return (((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditShareStyle(style=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCombineSaveToLocalAndSendToDm=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isShowSaveToLocalBtn=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isShowSaveToLocalCompliance=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isShowQuickPublish=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isShowQuickPublishAsStory=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", vmKey=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isSaveToLocalWithTypeOptions=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19507611Tu(EnumC20618915mF enumC20618915mF, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        this.LL = enumC20618915mF;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
        this.LLIZ = str;
        this.LLIZLLLIL = z6;
    }
}
