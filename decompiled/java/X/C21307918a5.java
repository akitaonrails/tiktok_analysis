package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import java.net.MalformedURLException;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.18a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21307918a5 implements InterfaceC1320650kTH<InterfaceC1330440kj4> {
    public final String LIZ;
    public final String LIZIZ;
    public final DurationPerfMon LIZJ;
    public final C01GW LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        DurationPerfMon durationPerfMon = this.LIZJ;
        AbstractC1492605sq abstractC1492605sqLIZ = C902280ZaU.LIZ((String) this.LIZLLL.getValue(), this.LIZIZ);
        String str2 = this.LIZIZ;
        String str3 = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        durationPerfMon.LIZJ(abstractC1492605sqLIZ, new C159000jE(false, 0, 0, false, str2, str3, "Cancellation", "Cancellation", 7));
    }

    public C21307918a5(String str, String str2) {
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1366690lfX;
        this.LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(1));
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        String canonicalName;
        String strLIZIZ;
        this.LJ = true;
        DurationPerfMon durationPerfMon = this.LIZJ;
        AbstractC1492605sq abstractC1492605sqLIZ = C902280ZaU.LIZ((String) this.LIZLLL.getValue(), this.LIZIZ);
        String str2 = this.LIZIZ;
        String str3 = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        if (th == null) {
            canonicalName = "NullThrowable";
        } else if (th instanceof C1494690ozz) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CronetIOException: ");
            sbLIZ.append(((C1494690ozz) th).getStatusCode());
            canonicalName = C2188811AlT.LIZIZ(sbLIZ);
        } else if (th instanceof MalformedURLException) {
            canonicalName = "MalformedURLException";
        } else if (th instanceof IllegalArgumentException) {
            canonicalName = "IllegalArgumentException";
        } else if (th instanceof IllegalStateException) {
            canonicalName = "IllegalStateException";
        } else if (th instanceof OutOfMemoryError) {
            canonicalName = "OutOfMemoryError";
        } else if (th instanceof UnsatisfiedLinkError) {
            canonicalName = "UnsatisfiedLinkError";
        } else if (th instanceof C1494430ozZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HttpResponseException: ");
            sbLIZ2.append(((C1494430ozZ) th).getStatusCode());
            canonicalName = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (th instanceof C1494450ozb) {
            canonicalName = "NetworkNotAvailabeException";
        } else if (th instanceof C1329280khC) {
            canonicalName = "DecodeException";
        } else if (th instanceof C0V01) {
            canonicalName = "InvalidValueException";
        } else if (th instanceof C0VFX) {
            canonicalName = "InvalidSizeException";
        } else if (th instanceof C0VFY) {
            canonicalName = "SizeTooLargeException";
        } else if (th instanceof C0V02) {
            canonicalName = "PoolSizeViolationException";
        } else {
            canonicalName = th.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th.getClass().getName();
            }
        }
        String str4 = this.LIZ;
        if (str4 == null) {
            str4 = "empty url";
        }
        if (th == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("NullThrowable: url: ");
            sbLIZ3.append(str4);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (th instanceof C1494690ozz) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("CronetIOException: url: ");
            sbLIZ4.append(str4);
            sbLIZ4.append(" error: ");
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            sbLIZ4.append(c1494690ozz.getStatusCode());
            sbLIZ4.append(": ");
            sbLIZ4.append(c1494690ozz.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(th.getClass().getCanonicalName());
            sbLIZ5.append(": url: ");
            sbLIZ5.append(str4);
            sbLIZ5.append(" error: ");
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            sbLIZ5.append(message);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        durationPerfMon.LIZJ(abstractC1492605sqLIZ, new C159000jE(false, 0, 0, false, str2, str3, canonicalName, strLIZIZ, 7));
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        this.LIZJ.LIZIZ(C902280ZaU.LIZ((String) this.LIZLLL.getValue(), this.LIZIZ), true);
    }

    @Override // X.InterfaceC1320650kTH
    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
    }

    @Override // X.InterfaceC1320650kTH
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final void LJ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
        boolean z;
        int width;
        this.LJ = true;
        DurationPerfMon durationPerfMon = this.LIZJ;
        AbstractC1492605sq abstractC1492605sqLIZ = C902280ZaU.LIZ((String) this.LIZLLL.getValue(), this.LIZIZ);
        int height = 0;
        if (animatable != null) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1330440kj4 != null) {
            width = interfaceC1330440kj4.getWidth();
            height = interfaceC1330440kj4.getHeight();
        } else {
            width = 0;
        }
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        durationPerfMon.LIZJ(abstractC1492605sqLIZ, new C159000jE(z, width, height, true, this.LIZIZ, str2, null, null, 384));
    }
}
