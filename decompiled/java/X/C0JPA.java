package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JPA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPA implements InterfaceC0148002o {
    public static final /* synthetic */ int LLJ = 0;
    public final SMBBookingEventResponse.ResponseData LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final EnumC2273991DzZ LLILZLL;
    public final EnumC491290JOl LLIZ;
    public final Throwable LLIZLLLIL;

    public C0JPA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JPA)) {
            return false;
        }
        C0JPA c0jpa = (C0JPA) obj;
        return Intrinsics.LJFF(this.LL, c0jpa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jpa.LLILLJJLI) && this.LLILLL == c0jpa.LLILLL && this.LLILZ == c0jpa.LLILZ && this.LLILZIL == c0jpa.LLILZIL && this.LLILZLL == c0jpa.LLILZLL && this.LLIZ == c0jpa.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0jpa.LLIZLLLIL);
    }

    public final int hashCode() {
        SMBBookingEventResponse.ResponseData responseData = this.LL;
        int iHashCode = (responseData == null ? 0 : responseData.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        Throwable th = this.LLIZLLLIL;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCalendlyMeetingVmState(bookingEventResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dmStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dmAuditStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pageStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JPA(int i) {
        this(null, null, 0, 0, 0, EnumC2273991DzZ.INIT, EnumC491290JOl.UNKNOWN, null);
    }

    public C0JPA(SMBBookingEventResponse.ResponseData responseData, String str, int i, int i2, int i3, EnumC2273991DzZ enumC2273991DzZ, EnumC491290JOl enumC491290JOl, Throwable th) {
        this.LL = responseData;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = enumC2273991DzZ;
        this.LLIZ = enumC491290JOl;
        this.LLIZLLLIL = th;
    }

    public static C0JPA LIZ(C0JPA c0jpa, SMBBookingEventResponse.ResponseData responseData, String str, int i, int i2, int i3, EnumC2273991DzZ enumC2273991DzZ, EnumC491290JOl enumC491290JOl, int i4) {
        Throwable th;
        EnumC491290JOl enumC491290JOl2 = enumC491290JOl;
        EnumC2273991DzZ enumC2273991DzZ2 = enumC2273991DzZ;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        String str2 = str;
        SMBBookingEventResponse.ResponseData responseData2 = responseData;
        if ((i4 & 1) != 0) {
            responseData2 = c0jpa.LL;
        }
        if ((i4 & 2) != 0) {
            str2 = c0jpa.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i7 = c0jpa.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i6 = c0jpa.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i5 = c0jpa.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            enumC2273991DzZ2 = c0jpa.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            enumC491290JOl2 = c0jpa.LLIZ;
        }
        if ((i4 & 128) != 0) {
            th = c0jpa.LLIZLLLIL;
        } else {
            th = null;
        }
        c0jpa.getClass();
        return new C0JPA(responseData2, str2, i7, i6, i5, enumC2273991DzZ2, enumC491290JOl2, th);
    }
}
