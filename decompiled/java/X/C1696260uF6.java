package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1696260uF6 implements C09B3, Serializable {
    public final Class LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final Object receiver;

    public InterfaceC329330Cvb getOwner() {
        Class cls = this.LL;
        if (cls == null) {
            return null;
        }
        if (!this.LLILZ) {
            return C13LE.LIZ(cls);
        }
        C13LE.LIZ.getClass();
        return new C1554850qZ1(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.LL;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + (this.LLILZ ? 1231 : 1237)) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public String toString() {
        C13LE.LIZ.getClass();
        return C09R3.LIZ(this);
    }

    @Override // X.C09B3
    public int getArity() {
        return this.LLILZIL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696260uF6)) {
            return false;
        }
        C1696260uF6 c1696260uF6 = (C1696260uF6) obj;
        if (this.LLILZ == c1696260uF6.LLILZ && this.LLILZIL == c1696260uF6.LLILZIL && this.LLILZLL == c1696260uF6.LLILZLL && Intrinsics.LJFF(this.receiver, c1696260uF6.receiver) && Intrinsics.LJFF(this.LL, c1696260uF6.LL) && this.LLILLJJLI.equals(c1696260uF6.LLILLJJLI) && this.LLILLL.equals(c1696260uF6.LLILLL)) {
            return true;
        }
        return false;
    }

    public C1696260uF6(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC2217471Bqb.NO_RECEIVER, cls, str, str2, i2);
    }

    public C1696260uF6(int i, Object obj, Class cls, String str, String str2, int i2) {
        boolean z;
        this.receiver = obj;
        this.LL = cls;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2 >> 1;
    }
}
