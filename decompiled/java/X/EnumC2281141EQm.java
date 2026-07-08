package X;

import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;

/* JADX INFO: renamed from: X.1EQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2281141EQm {
    Undefine("", 0),
    Standard("360p", 360),
    High("480p", 480),
    SuperHigh("720p", 720),
    ExtremelyHigh("1080p", 1080),
    FourK("4k", 2160),
    HDR("hdr", SpeechEngineDefines.TTS_WORK_MODE_BOTH),
    Auto("auto", 0),
    L_Standard("240p", 240),
    H_High("540p", 540),
    TwoK("2k", 1080),
    ExtremelyHigh_50F("1080p 50fps", 1080),
    TwoK_50F("2k 50fps", 1080),
    FourK_50F("4k 50fps", 2160),
    ExtremelyHigh_60F("1080p 60fps", 1080),
    TwoK_60F("2k 60fps", 1080),
    FourK_60F("4k 60fps", 2160),
    ExtremelyHigh_120F("1080p 120fps", 1080),
    TwoK_120F("2k 120fps", 1080),
    FourK_120F("4k 120fps", 2160);

    public final String LL;
    public final int LLILLJJLI;
    public List<Integer> allBitrates;
    public int bitrate;
    public int bitrateQuality;
    public double curveFirstParam;
    public double curveFourthParam;
    public double curveMinBitrate;
    public double curveSecondParam;
    public double curveThirdParam;
    public int nativeBrSelectDiff;
    public String nativeChangedReason;
    public String originChangedReason;
    public int speed;

    public int getResolutionInt() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC2281141EQm fromStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        EnumC2281141EQm enumC2281141EQm = Standard;
        if (str.equals(enumC2281141EQm.toString())) {
            return enumC2281141EQm;
        }
        EnumC2281141EQm enumC2281141EQm2 = High;
        if (str.equals(enumC2281141EQm2.toString())) {
            return enumC2281141EQm2;
        }
        EnumC2281141EQm enumC2281141EQm3 = SuperHigh;
        if (str.equals(enumC2281141EQm3.toString())) {
            return enumC2281141EQm3;
        }
        EnumC2281141EQm enumC2281141EQm4 = ExtremelyHigh;
        if (str.equals(enumC2281141EQm4.toString())) {
            return enumC2281141EQm4;
        }
        EnumC2281141EQm enumC2281141EQm5 = FourK;
        if (str.equals(enumC2281141EQm5.toString())) {
            return enumC2281141EQm5;
        }
        EnumC2281141EQm enumC2281141EQm6 = HDR;
        if (str.equals(enumC2281141EQm6.toString())) {
            return enumC2281141EQm6;
        }
        EnumC2281141EQm enumC2281141EQm7 = Auto;
        if (str.equals(enumC2281141EQm7.toString())) {
            return enumC2281141EQm7;
        }
        EnumC2281141EQm enumC2281141EQm8 = L_Standard;
        if (str.equals(enumC2281141EQm8.toString())) {
            return enumC2281141EQm8;
        }
        EnumC2281141EQm enumC2281141EQm9 = H_High;
        if (str.equals(enumC2281141EQm9.toString())) {
            return enumC2281141EQm9;
        }
        EnumC2281141EQm enumC2281141EQm10 = TwoK;
        if (str.equals(enumC2281141EQm10.toString())) {
            return enumC2281141EQm10;
        }
        EnumC2281141EQm enumC2281141EQm11 = ExtremelyHigh_50F;
        if (str.equals(enumC2281141EQm11.toString())) {
            return enumC2281141EQm11;
        }
        EnumC2281141EQm enumC2281141EQm12 = TwoK_50F;
        if (str.equals(enumC2281141EQm12.toString())) {
            return enumC2281141EQm12;
        }
        EnumC2281141EQm enumC2281141EQm13 = FourK_50F;
        if (str.equals(enumC2281141EQm13.toString())) {
            return enumC2281141EQm13;
        }
        EnumC2281141EQm enumC2281141EQm14 = ExtremelyHigh_60F;
        if (str.equals(enumC2281141EQm14.toString())) {
            return enumC2281141EQm14;
        }
        EnumC2281141EQm enumC2281141EQm15 = TwoK_60F;
        if (str.equals(enumC2281141EQm15.toString())) {
            return enumC2281141EQm15;
        }
        EnumC2281141EQm enumC2281141EQm16 = FourK_60F;
        if (str.equals(enumC2281141EQm16.toString())) {
            return enumC2281141EQm16;
        }
        EnumC2281141EQm enumC2281141EQm17 = ExtremelyHigh_120F;
        if (str.equals(enumC2281141EQm17.toString())) {
            return enumC2281141EQm17;
        }
        EnumC2281141EQm enumC2281141EQm18 = TwoK_120F;
        if (str.equals(enumC2281141EQm18.toString())) {
            return enumC2281141EQm18;
        }
        EnumC2281141EQm enumC2281141EQm19 = FourK_120F;
        if (str.equals(enumC2281141EQm19.toString())) {
            return enumC2281141EQm19;
        }
        return Undefine;
    }

    public static EnumC2281141EQm valueOf(String str) {
        return (EnumC2281141EQm) C08FF.LIZ(EnumC2281141EQm.class, str);
    }

    EnumC2281141EQm(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
