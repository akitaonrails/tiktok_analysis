package X;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.codec.DefaultVideoEncoderFactory;
import com.ss.pusher.core.engine.MediaEncodeStream;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.transport.LibRTMPTransport;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278750jNh {
    public static final String LJIIIIZZ = C1278750jNh.class.getSimpleName();
    public final C1277590jLp LIZ;
    public final PushBase LIZIZ;
    public final C1278910jNx LIZJ;
    public String[] LIZLLL;
    public C1279190jOP LJ;
    public String LJFF;
    public int LJI;
    public int LJII;

    public final String LIZ() {
        String str;
        String strGetSupportedFormats;
        C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
        DefaultVideoEncoderFactory defaultVideoEncoderFactory = c1278760jNiLIZIZ != null ? c1278760jNiLIZIZ.LLJILJIL : null;
        String[] strArr = this.LIZLLL;
        String str2 = LJIIIIZZ;
        if (strArr == null) {
            if (defaultVideoEncoderFactory == null || (strGetSupportedFormats = defaultVideoEncoderFactory.GetSupportedFormats()) == null) {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Supports video encoder list:");
            sbLIZ.append(strGetSupportedFormats);
            AVLog.d(str2, C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL = strGetSupportedFormats.split(":");
        }
        PushBase pushBase = this.LIZIZ;
        EnumC1278030jMX enumC1278030jMX = pushBase.LJJI;
        boolean z = pushBase.useHardwareEncode;
        if (enumC1278030jMX == EnumC1278030jMX.VeLiveVideoCodecH264) {
            String[] strArr2 = this.LIZLLL;
            int length = strArr2.length;
            int i = 0;
            while (true) {
                str = "video/bytevc0";
                if (i < length) {
                    String str3 = strArr2[i];
                    str = z ? "video/avc" : "video/bytevc0";
                    if (z == str3.contains("video_enable_accelera=true")) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("video_type=");
                        sbLIZ2.append(str);
                        if (str3.contains(C2188811AlT.LIZIZ(sbLIZ2))) {
                            break;
                        }
                    }
                    i++;
                } else {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (String str4 : this.LIZLLL) {
                        if (!str4.contains("video_enable_accelera=true")) {
                            if (str4.contains("video_type=video/bytevc1")) {
                                z2 = true;
                            } else if (str4.contains("video_type=video/bytevc0")) {
                                z3 = true;
                            }
                        }
                    }
                    if (this.LIZ.LJI.mPushBase.videoEncodePerfPrior && z2) {
                        str = "video/bytevc1";
                    } else if (!z3) {
                        str = null;
                    }
                    boolean zEquals = str.equals("video/bytevc1");
                    PushBase pushBase2 = this.LIZIZ;
                    pushBase2.useHardwareEncode = false;
                    pushBase2.LJJI = zEquals ? EnumC1278030jMX.VeLiveVideoCodecByteVC1 : EnumC1278030jMX.VeLiveVideoCodecH264;
                    pushBase2.LJJIIZ = zEquals ? EnumC1278020jMW.ByteVC1Main : EnumC1278020jMW.H264High;
                    AVLog.iow(str2, C786410Ut5.j4("Hardware video encoder not found, use %s instead.", new Object[]{str}));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("h264 ");
                    sbLIZ3.append(z ? "hardware" : "software");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(zEquals ? "ByteVC1" : "h264");
                    sbLIZ4.append(" software");
                    LIZLLL(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        } else {
            if (enumC1278030jMX == EnumC1278030jMX.VeLiveVideoCodecByteVC1) {
                for (String str5 : this.LIZLLL) {
                    if (str5.contains("video_type=video/bytevc1") && z == str5.contains("video_enable_accelera=true")) {
                        str = "video/bytevc1";
                    }
                }
                if (!this.LIZIZ.LJIJJLI) {
                    if (z) {
                        AVLog.iow(str2, "ByteVC1 hardware encoder not found, use ByteVC1 software encoder instead.");
                        LIZLLL("ByteVC1 hardware", "ByteVC1 software");
                        this.LIZIZ.useHardwareEncode = false;
                    } else {
                        AVLog.iow(str2, "ByteVC1 software encoder not found, use H.264 software encoder instead.");
                        LIZLLL("ByteVC1 software", "h264 software");
                        PushBase pushBase3 = this.LIZIZ;
                        pushBase3.LJJI = EnumC1278030jMX.VeLiveVideoCodecH264;
                        pushBase3.LJJIIZ = EnumC1278020jMW.H264High;
                    }
                    return LIZ();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("ByteVC1 ");
                sbLIZ5.append(z ? "hardware" : "software");
                sbLIZ5.append(" encoder not found, use H.264 hardware encoder instead.");
                AVLog.iow(str2, C2188811AlT.LIZIZ(sbLIZ5));
                LIZLLL(z ? "ByteVC1 hardware" : "ByteVC1 software", "h264 hardware");
                PushBase pushBase4 = this.LIZIZ;
                pushBase4.LJJI = EnumC1278030jMX.VeLiveVideoCodecH264;
                pushBase4.useHardwareEncode = true;
                pushBase4.LJJIIZ = EnumC1278020jMW.H264High;
                return LIZ();
            }
            str = null;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Use video encoder: ");
        sbLIZ6.append(str);
        AVLog.ioi(str2, C2188811AlT.LIZIZ(sbLIZ6));
        return str;
    }

    public C1278750jNh(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp;
        this.LIZIZ = c1277590jLp.LJI.mPushBase;
        this.LIZJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIIJJI = new WeakReference<>(this);
    }

    public static void LIZLLL(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "Change videoEncoder");
            jSONObject.put("lastEncoder", str);
            jSONObject.put("newEncoder", str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logKibana(4, "Change videoEncoder", C786410Ut5.J3(jSONObject), null);
    }

    public final void LIZIZ(String str, boolean z) {
        if (this.LIZLLL != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.LIZLLL;
                if (i < strArr.length) {
                    String str2 = strArr[i];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("video_type=");
                    sbLIZ.append(str);
                    if (str2.contains(C2188811AlT.LIZIZ(sbLIZ)) && z == this.LIZLLL[i].contains("video_enable_accelera=true")) {
                        this.LIZLLL[i] = "";
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [X.0jOP] */
    public final void LIZJ(int i, int i2, long j, String str, LibRTMPTransport libRTMPTransport, TEBundle tEBundle) {
        MediaEncodeStream mediaEncodeStream;
        EnumC1278020jMW enumC1278020jMW;
        String str2;
        if (i != 1) {
            TEBundle tEBundle2 = null;
            if (i != 2) {
                if (i != 5) {
                    if (i != 14) {
                        if (i != 31) {
                            if (i != 33) {
                                switch (i) {
                                    case 16:
                                        String str3 = LJIIIIZZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        if (this.LIZIZ.useHardwareEncode) {
                                            str2 = "Hardware";
                                        } else {
                                            str2 = "Software";
                                        }
                                        sbLIZ.append(str2);
                                        sbLIZ.append(" roi is disabled, reason: ");
                                        sbLIZ.append(i2);
                                        AVLog.iow(str3, C2188811AlT.LIZIZ(sbLIZ));
                                        if (this.LIZIZ.LIZJ() != 1) {
                                            return;
                                        }
                                        PushBase pushBase = this.LIZIZ;
                                        EnumC1278030jMX enumC1278030jMX = pushBase.LJJI;
                                        boolean z = pushBase.useHardwareEncode;
                                        synchronized (pushBase.LJJJLL) {
                                            try {
                                                PushBase.Roi roiLIZ = pushBase.LJJJLL.LIZ(enumC1278030jMX, z);
                                                if (roiLIZ == null) {
                                                    roiLIZ = new PushBase.Roi();
                                                }
                                                roiLIZ.roiOn = i2;
                                                pushBase.LJJJLL.LIZIZ(enumC1278030jMX, z, roiLIZ);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                        return;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("Encode frame invalid(");
                                        sbLIZ2.append(i2);
                                        sbLIZ2.append("x");
                                        sbLIZ2.append(j);
                                        sbLIZ2.append(") VS Encoder(");
                                        sbLIZ2.append(this.LIZIZ.width);
                                        sbLIZ2.append("x");
                                        sbLIZ2.append(this.LIZIZ.height);
                                        sbLIZ2.append(")");
                                        AVLog.logToIODevice2(5, LJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ2), (Throwable) null, 35, LSPassThroughRecordSizeConfig.DEFAULT);
                                        this.LIZJ.LIZJ().LIZJ(402);
                                        return;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        if (this.LJ == null) {
                                            this.LIZIZ.getClass();
                                            this.LIZIZ.getClass();
                                            this.LJ = new Object() { // from class: X.0jOP
                                            };
                                        }
                                        getClass();
                                        WeakReference<Object> weakReference = this.LIZJ.LJIILJJIL;
                                        if (weakReference != null && weakReference.get() != null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        return;
                                }
                            }
                            this.LIZJ.LIZJ().LIZIZ(new C1278510jNJ(true, EnumC1277870jMH.Encoded));
                            return;
                        }
                        this.LIZJ.LJ().LJJIIJ(str, false);
                        return;
                    }
                    String str4 = LJIIIIZZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Video Encoder Error: code ");
                    sbLIZ3.append(i2);
                    AVLog.logKibana(6, str4, C2188811AlT.LIZIZ(sbLIZ3), null);
                    this.LIZJ.LJ().LJJIII(i2, false);
                    return;
                }
                C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
                if (c1278760jNiLIZIZ == null) {
                    return;
                }
                MediaEncodeStream mediaEncodeStream2 = c1278760jNiLIZIZ.LLJILLL;
                TEBundle tEBundle3 = c1278760jNiLIZIZ.LLJJ;
                if (mediaEncodeStream2 == null || tEBundle3 == null) {
                    return;
                }
                String str5 = LJIIIIZZ;
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 5) {
                        return;
                    }
                    try {
                        int iIndexOf = str.indexOf(120);
                        int i3 = CastIntegerProtector.parseInt(str.substring(0, iIndexOf));
                        int i4 = CastIntegerProtector.parseInt(str.substring(iIndexOf + 1));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Video encode size change to ");
                        sbLIZ4.append(str);
                        AVLog.ioi(str5, C2188811AlT.LIZIZ(sbLIZ4));
                        tEBundle3.setInt("video_width", i3);
                        tEBundle3.setInt("video_height", i4);
                        mediaEncodeStream2.LJIIIZ(tEBundle3);
                        if (libRTMPTransport != null && tEBundle != null) {
                            tEBundle.setInt("video_width", i3);
                            tEBundle.setInt("video_height", i4);
                            libRTMPTransport.setParameter(tEBundle);
                        }
                        this.LIZJ.LIZJ().LIZJ(403);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Video encode bitrate adjust from ");
                sbLIZ5.append(this.LIZIZ.LJ);
                sbLIZ5.append(" to ");
                sbLIZ5.append(j);
                AVLog.ioi(str5, C2188811AlT.LIZIZ(sbLIZ5));
                this.LIZJ.LJ().LJIJJLI(i2, j, str);
                int i5 = (int) j;
                this.LIZIZ.LJ = i5;
                tEBundle3.setLong("video_bitrate", i5);
                return;
            }
            C1278760jNi c1278760jNiLIZIZ2 = this.LIZJ.LIZIZ();
            if (c1278760jNiLIZIZ2 != null) {
                mediaEncodeStream = c1278760jNiLIZIZ2.LLJILLL;
                tEBundle2 = c1278760jNiLIZIZ2.LLJJ;
            } else {
                mediaEncodeStream = null;
            }
            String str6 = LJIIIIZZ;
            if (mediaEncodeStream != null && tEBundle2 != null) {
                String string = tEBundle2.getString("video_type");
                String string2 = tEBundle2.getString("video_type");
                boolean bool = tEBundle2.getBool("video_enable_accelera");
                int i6 = tEBundle2.getInt("video_profileLevel");
                EnumC1278020jMW enumC1278020jMW2 = this.LIZIZ.LJJIIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("failed encoder:");
                sbLIZ6.append(string);
                sbLIZ6.append(", hardware ");
                sbLIZ6.append(bool);
                sbLIZ6.append(", profile ");
                sbLIZ6.append(i6);
                AVLog.iow(str6, C2188811AlT.LIZIZ(sbLIZ6));
                if (this.LIZIZ.LJJI == EnumC1278030jMX.VeLiveVideoCodecH264) {
                    enumC1278020jMW = EnumC1278020jMW.H264Baseline;
                    if (enumC1278020jMW2 == enumC1278020jMW) {
                        LIZIZ(string2, bool);
                        string2 = LIZ();
                        enumC1278020jMW = this.LIZIZ.LJJIIZ;
                    } else if (enumC1278020jMW2 == EnumC1278020jMW.H264High) {
                        enumC1278020jMW = EnumC1278020jMW.H264Main;
                    }
                } else {
                    enumC1278020jMW = EnumC1278020jMW.ByteVC1Main;
                    if (enumC1278020jMW2 == enumC1278020jMW) {
                        LIZIZ(string2, bool);
                        string2 = LIZ();
                        enumC1278020jMW = this.LIZIZ.LJJIIZ;
                    }
                }
                if (!TextUtils.isEmpty(string2)) {
                    this.LJFF = string2;
                    this.LIZIZ.LJJIIZ = enumC1278020jMW;
                    this.LJI = enumC1278020jMW.getProfile();
                    boolean z2 = this.LIZIZ.useHardwareEncode;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("Video encoder switch to ");
                    sbLIZ7.append(this.LJFF);
                    sbLIZ7.append(", hardware ");
                    sbLIZ7.append(z2);
                    sbLIZ7.append(", profile ");
                    sbLIZ7.append(this.LJI);
                    AVLog.iow(str6, C2188811AlT.LIZIZ(sbLIZ7));
                    tEBundle2.setString("video_type", this.LJFF);
                    if (z2) {
                        this.LIZIZ.getClass();
                    }
                    tEBundle2.setBool("oes_texture_frame", false);
                    tEBundle2.setBool("video_enable_accelera", z2);
                    tEBundle2.setInt("video_profileLevel", this.LJI);
                    tEBundle2.setBundle("roi_settings", this.LIZIZ.LIZLLL());
                    mediaEncodeStream.LJIIIZ(tEBundle2);
                    if (tEBundle != null) {
                        tEBundle.setString("video_type", this.LJFF);
                        tEBundle.setBool("video_enable_accelera", z2);
                        tEBundle.setInt("video_profileLevel", this.LJI);
                        if (libRTMPTransport != null) {
                            libRTMPTransport.setParameter(tEBundle);
                        }
                    }
                    this.LIZJ.LIZJ().LIZJ(401);
                    return;
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("Video encoder(");
                sbLIZ8.append(string);
                sbLIZ8.append(") created failed and no other encoder available.");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                AVLog.ioe(str6, strLIZIZ);
                EnumC1270030j9d enumC1270030j9d = EnumC1270030j9d.VeLivePusherVideoEncoderError;
                c1278760jNiLIZIZ2.LJI(C1278920jNy.LIZ(enumC1270030j9d.getCode()));
                this.LIZJ.LIZJ().LIZ(enumC1270030j9d.getCode(), 0, strLIZIZ, new Object[0]);
                return;
            }
            AVLog.iow(str6, "Opt is null and maybe encoder already release.");
            return;
        }
        this.LJII++;
        this.LIZJ.LJ().LJJIIJZLJL();
    }
}
