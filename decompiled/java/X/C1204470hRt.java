package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204470hRt implements InterfaceC1204490hRv {
    public final Aweme LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final Boolean LLILZ;
    public final int LLILZIL;
    public final EnumC1204030hRB LLILZLL;
    public final Long LLIZ;
    public Boolean LLIZLLLIL;
    public final EnumC1204410hRn LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204470hRt)) {
            return false;
        }
        C1204470hRt c1204470hRt = (C1204470hRt) obj;
        return Intrinsics.LJFF(this.LL, c1204470hRt.LL) && this.LLILLJJLI == c1204470hRt.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1204470hRt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1204470hRt.LLILZ) && this.LLILZIL == c1204470hRt.LLILZIL && this.LLILZLL == c1204470hRt.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1204470hRt.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1204470hRt.LLIZLLLIL) && this.LLJ == c1204470hRt.LLJ && this.LLJI == c1204470hRt.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1204470hRt.LLJIJIL);
    }

    public final String toString() {
        return "NearbyCardModel(aweme=" + this.LL + ", userDigged=" + this.LLILLJJLI + ", logId=" + this.LLILLL + ", lsModelResult=" + this.LLILZ + ", cacheType=" + this.LLILZIL + ", loadScene=" + this.LLILZLL + ", networkReqTime=" + this.LLIZ + ", isExposed=" + this.LLIZLLLIL + ", dataSource=" + this.LLJ + ", isPreviewData=" + this.LLJI + ", dataType=" + this.LLJIJIL + ')';
    }

    public final int hashCode() {
        if (((Boolean) C266780Acu.LIZ.getValue()).booleanValue()) {
            String aid = this.LL.getAid();
            if (aid != null) {
                return aid.hashCode();
            }
            return 0;
        }
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LLILZIL) * 31;
        EnumC1204030hRB enumC1204030hRB = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (enumC1204030hRB != null ? enumC1204030hRB.hashCode() : 0)) * 31;
        Long l = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool2 = this.LLIZLLLIL;
        int iHashCode6 = (((((iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        String str2 = this.LLJIJIL;
        return (str2 != null ? str2.hashCode() : 0) + iHashCode6;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1204470hRt c1204470hRt;
        Aweme aweme;
        String aid = null;
        if (interfaceC1891350zJl instanceof C1204470hRt) {
            c1204470hRt = (C1204470hRt) interfaceC1891350zJl;
            if (c1204470hRt != null && (aweme = c1204470hRt.LL) != null) {
                aid = aweme.getAid();
            }
        } else {
            c1204470hRt = null;
        }
        if (!Intrinsics.LJFF(aid, this.LL.getAid()) || c1204470hRt == null || c1204470hRt.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1204470hRt c1204470hRt;
        Aweme aweme;
        String aid = null;
        if ((interfaceC1891350zJl instanceof C1204470hRt) && (c1204470hRt = (C1204470hRt) interfaceC1891350zJl) != null && (aweme = c1204470hRt.LL) != null) {
            aid = aweme.getAid();
        }
        return Intrinsics.LJFF(aid, this.LL.getAid());
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1204470hRt) && ((C1204470hRt) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
            return new Object() { // from class: X.0hRu
            };
        }
        return null;
    }

    public static C1204470hRt LIZ(C1204470hRt c1204470hRt, Aweme aweme, boolean z, EnumC1204410hRn enumC1204410hRn, String str, int i) {
        String str2;
        Boolean bool;
        int i2;
        EnumC1204030hRB enumC1204030hRB;
        Long l;
        boolean z2;
        String str3 = str;
        EnumC1204410hRn enumC1204410hRn2 = enumC1204410hRn;
        boolean z3 = z;
        Aweme aweme2 = aweme;
        if ((i & 1) != 0) {
            aweme2 = c1204470hRt.LL;
        }
        if ((i & 2) != 0) {
            z3 = c1204470hRt.LLILLJJLI;
        }
        Boolean bool2 = null;
        if ((i & 4) != 0) {
            str2 = c1204470hRt.LLILLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = c1204470hRt.LLILZ;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            i2 = c1204470hRt.LLILZIL;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            enumC1204030hRB = c1204470hRt.LLILZLL;
        } else {
            enumC1204030hRB = null;
        }
        if ((i & 64) != 0) {
            l = c1204470hRt.LLIZ;
        } else {
            l = null;
        }
        if ((i & 128) != 0) {
            bool2 = c1204470hRt.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            enumC1204410hRn2 = c1204470hRt.LLJ;
        }
        if ((i & 512) != 0) {
            z2 = c1204470hRt.LLJI;
        } else {
            z2 = false;
        }
        if ((i & 1024) != 0) {
            str3 = c1204470hRt.LLJIJIL;
        }
        return new C1204470hRt(aweme2, z3, str2, bool, i2, enumC1204030hRB, l, bool2, enumC1204410hRn2, z2, str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1204470hRt(Aweme aweme, boolean z, String str, int i, EnumC1204030hRB enumC1204030hRB, Long l, EnumC1204410hRn enumC1204410hRn, boolean z2, String str2, int i2) {
        Boolean bool;
        String str3 = str2;
        boolean z3 = z2;
        EnumC1204410hRn enumC1204410hRn2 = enumC1204410hRn;
        Long l2 = l;
        EnumC1204030hRB enumC1204030hRB2 = enumC1204030hRB;
        int i3 = (i2 & 16) != 0 ? 0 : i;
        enumC1204030hRB2 = (i2 & 32) != 0 ? null : enumC1204030hRB2;
        l2 = (i2 & 64) != 0 ? null : l2;
        if ((i2 & 128) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        this(aweme, z, str, null, i3, enumC1204030hRB2, l2, bool, (i2 & 256) != 0 ? EnumC1204410hRn.REFRESH : enumC1204410hRn2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? null : str3);
    }

    public C1204470hRt(Aweme aweme, boolean z, String str, Boolean bool, int i, EnumC1204030hRB enumC1204030hRB, Long l, Boolean bool2, EnumC1204410hRn enumC1204410hRn, boolean z2, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = bool;
        this.LLILZIL = i;
        this.LLILZLL = enumC1204030hRB;
        this.LLIZ = l;
        this.LLIZLLLIL = bool2;
        this.LLJ = enumC1204410hRn;
        this.LLJI = z2;
        this.LLJIJIL = str2;
    }
}
