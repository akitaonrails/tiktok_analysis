package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1EQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2281151EQn {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", "lossless"),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", ""),
    L_Standard_HDR("240p HDR", ""),
    Standard_HDR("360p HDR", ""),
    High_HDR("480p HDR", ""),
    H_High_HDR("540p HDR", ""),
    SuperHigh_HDR("720p HDR", ""),
    ExtremelyHigh_HDR("1080p HDR", ""),
    TwoK_HDR("2k HDR", ""),
    FourK_HDR("4k HDR", ""),
    EightK("8k", ""),
    ExtremelyHighPlus("1080p+", "");

    public final String LL;
    public final String LLILLJJLI;

    public static EnumC2281151EQn[] getAllResolutions() {
        try {
            return new EnumC2281151EQn[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHighPlus, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F, L_Standard_HDR, Standard_HDR, High_HDR, H_High_HDR, SuperHigh_HDR, ExtremelyHigh_HDR, TwoK_HDR, FourK_HDR, EightK};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new EnumC2281151EQn[0];
        }
    }

    public int getIndex() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC2281151EQn forString(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        if (str.equals("Undefine")) {
            return Undefine;
        }
        if (str.equals("Standard")) {
            return Standard;
        }
        if (str.equals("High")) {
            return High;
        }
        if (str.equals("SuperHigh")) {
            return SuperHigh;
        }
        if (str.equals("FourK")) {
            return FourK;
        }
        if (str.equals("HDR")) {
            return HDR;
        }
        if (str.equals("Auto")) {
            return Auto;
        }
        if (str.equals("L_Standard")) {
            return L_Standard;
        }
        if (str.equals("H_High")) {
            return H_High;
        }
        if (str.equals("TwoK")) {
            return TwoK;
        }
        if (str.equals("ExtremelyHigh_50F")) {
            return ExtremelyHigh_50F;
        }
        if (str.equals("TwoK_50F")) {
            return TwoK_50F;
        }
        if (str.equals("FourK_50F")) {
            return FourK_50F;
        }
        if (str.equals("ExtremelyHigh_60F")) {
            return ExtremelyHigh_60F;
        }
        if (str.equals("TwoK_60F")) {
            return TwoK_60F;
        }
        if (str.equals("FourK_60F")) {
            return FourK_60F;
        }
        if (str.equals("ExtremelyHigh_120F")) {
            return ExtremelyHigh_120F;
        }
        if (str.equals("TwoK_120F")) {
            return TwoK_120F;
        }
        if (str.equals("FourK_120F")) {
            return FourK_120F;
        }
        if (str.equals("L_Standard_HDR")) {
            return L_Standard_HDR;
        }
        if (str.equals("Standard_HDR")) {
            return Standard_HDR;
        }
        if (str.equals("High_HDR")) {
            return High_HDR;
        }
        if (str.equals("H_High_HDR")) {
            return H_High_HDR;
        }
        if (str.equals("SuperHigh_HDR")) {
            return SuperHigh_HDR;
        }
        if (str.equals("ExtremelyHigh_HDR")) {
            return ExtremelyHigh_HDR;
        }
        if (str.equals("TwoK_HDR")) {
            return TwoK_HDR;
        }
        if (str.equals("FourK_HDR")) {
            return FourK_HDR;
        }
        if (str.equals("EightK")) {
            return EightK;
        }
        if (str.equals("1080p+")) {
            return ExtremelyHighPlus;
        }
        return Undefine;
    }

    public static String toString(EnumC2281151EQn enumC2281151EQn) {
        if (enumC2281151EQn == null || enumC2281151EQn == Undefine) {
            return "Undefine";
        }
        if (enumC2281151EQn == Standard) {
            return "Standard";
        }
        if (enumC2281151EQn == High) {
            return "High";
        }
        if (enumC2281151EQn == SuperHigh) {
            return "SuperHigh";
        }
        if (enumC2281151EQn == FourK) {
            return "FourK";
        }
        if (enumC2281151EQn == HDR) {
            return "HDR";
        }
        if (enumC2281151EQn == Auto) {
            return "Auto";
        }
        if (enumC2281151EQn == L_Standard) {
            return "L_Standard";
        }
        if (enumC2281151EQn == H_High) {
            return "H_High";
        }
        if (enumC2281151EQn == TwoK) {
            return "TwoK";
        }
        if (enumC2281151EQn == ExtremelyHigh_50F) {
            return "ExtremelyHigh_50F";
        }
        if (enumC2281151EQn == TwoK_50F) {
            return "TwoK_50F";
        }
        if (enumC2281151EQn == FourK_50F) {
            return "FourK_50F";
        }
        if (enumC2281151EQn == ExtremelyHigh_60F) {
            return "ExtremelyHigh_60F";
        }
        if (enumC2281151EQn == TwoK_60F) {
            return "TwoK_60F";
        }
        if (enumC2281151EQn == FourK_60F) {
            return "FourK_60F";
        }
        if (enumC2281151EQn == ExtremelyHigh_120F) {
            return "ExtremelyHigh_120F";
        }
        if (enumC2281151EQn == TwoK_120F) {
            return "TwoK_120F";
        }
        if (enumC2281151EQn == FourK_120F) {
            return "FourK_120F";
        }
        if (enumC2281151EQn == L_Standard_HDR) {
            return "L_Standard_HDR";
        }
        if (enumC2281151EQn == Standard_HDR) {
            return "Standard_HDR";
        }
        if (enumC2281151EQn == High_HDR) {
            return "High_HDR";
        }
        if (enumC2281151EQn == H_High_HDR) {
            return "H_High_HDR";
        }
        if (enumC2281151EQn == SuperHigh_HDR) {
            return "SuperHigh_HDR";
        }
        if (enumC2281151EQn == ExtremelyHigh_HDR) {
            return "ExtremelyHigh_HDR";
        }
        if (enumC2281151EQn == TwoK_HDR) {
            return "TwoK_HDR";
        }
        if (enumC2281151EQn == FourK_HDR) {
            return "FourK_HDR";
        }
        if (enumC2281151EQn == EightK) {
            return "EightK";
        }
        if (enumC2281151EQn != ExtremelyHighPlus) {
            return "Undefine";
        }
        return "1080p+";
    }

    public static EnumC2281151EQn valueOf(int i) {
        EnumC2281151EQn enumC2281151EQn = Undefine;
        if (i >= enumC2281151EQn.ordinal() && i <= FourK_HDR.ordinal()) {
            return values()[i];
        }
        return enumC2281151EQn;
    }

    public static EnumC2281151EQn valueOf(String str) {
        return (EnumC2281151EQn) C08FF.LIZ(EnumC2281151EQn.class, str);
    }

    public String toString(int i) {
        if (i == 1) {
            return this.LLILLJJLI;
        }
        if (i == 0) {
            return this.LL;
        }
        return "";
    }

    EnumC2281151EQn(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
