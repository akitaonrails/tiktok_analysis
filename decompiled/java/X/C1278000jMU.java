package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.livepusher.LiveProbeResult;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason;

/* JADX INFO: renamed from: X.0jMU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1278000jMU {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;
    public static final /* synthetic */ int[] LJFF;
    public static final /* synthetic */ int[] LJI;
    public static final /* synthetic */ int[] LJII;
    public static final /* synthetic */ int[] LJIIIIZZ;

    static {
        int[] iArr = new int[EnumC1277920jMM.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC1277920jMM.VeLivePushSceneLive.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        try {
            try {
            } catch (NoSuchFieldError e4) {
                e = e4;
            }
        } catch (NoSuchFieldError e5) {
            e = e5;
        }
        try {
            iArr[EnumC1277920jMM.VeLivePushSceneLinkMic.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1278030jMX.values().length];
        try {
            try {
                try {
                    iArr2[EnumC1278030jMX.VeLiveVideoCodecH264.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                    e = e7;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e8) {
                e = e8;
            }
        } catch (NoSuchFieldError e9) {
            e = e9;
        }
        try {
            try {
                try {
                    iArr2[EnumC1278030jMX.VeLiveVideoCodecByteVC1.ordinal()] = 2;
                } catch (NoSuchFieldError e10) {
                    e = e10;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e11) {
                e = e11;
            }
        } catch (NoSuchFieldError e12) {
            e = e12;
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1278040jMY.values().length];
        try {
            try {
            } catch (NoSuchFieldError e13) {
                e = e13;
            }
            try {
                iArr3[EnumC1278040jMY.VeLiveAudioCodecFdkAAC.ordinal()] = 1;
            } catch (NoSuchFieldError e14) {
                e = e14;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e15) {
            e = e15;
        }
        try {
            try {
            } catch (NoSuchFieldError e16) {
                e = e16;
            }
            try {
                iArr3[EnumC1278040jMY.VeLiveAudioCodecMediaCodecAAC.ordinal()] = 2;
            } catch (NoSuchFieldError e17) {
                e = e17;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e18) {
            e = e18;
        }
        try {
            try {
            } catch (NoSuchFieldError e19) {
                e = e19;
            }
        } catch (NoSuchFieldError e20) {
            e = e20;
        }
        try {
            iArr3[EnumC1278040jMY.VeLiveAudioCodecFFmpegAAC.ordinal()] = 3;
        } catch (NoSuchFieldError e21) {
            e = e21;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC1278010jMV.values().length];
        try {
            try {
                try {
                    iArr4[EnumC1278010jMV.HEv1.ordinal()] = 1;
                } catch (NoSuchFieldError e22) {
                    e = e22;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e23) {
                e = e23;
            }
        } catch (NoSuchFieldError e24) {
            e = e24;
        }
        try {
            try {
                try {
                    iArr4[EnumC1278010jMV.HEv2.ordinal()] = 2;
                } catch (NoSuchFieldError e25) {
                    e = e25;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e26) {
                e = e26;
            }
        } catch (NoSuchFieldError e27) {
            e = e27;
        }
        try {
            try {
                try {
                    iArr4[EnumC1278010jMV.LC.ordinal()] = 3;
                } catch (NoSuchFieldError e28) {
                    e = e28;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e29) {
                e = e29;
            }
        } catch (NoSuchFieldError e30) {
            e = e30;
        }
        LIZLLL = iArr4;
        int[] iArr5 = new int[LiveProbeResult.values().length];
        try {
            try {
            } catch (NoSuchFieldError e31) {
                e = e31;
            }
            try {
                iArr5[LiveProbeResult.LIVE_PROBER_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError e32) {
                e = e32;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e33) {
            e = e33;
        }
        try {
            try {
            } catch (NoSuchFieldError e34) {
                e = e34;
            }
        } catch (NoSuchFieldError e35) {
            e = e35;
        }
        try {
            iArr5[LiveProbeResult.LIVE_PROBER_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e36) {
            e = e36;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
            } catch (NoSuchFieldError e37) {
                e = e37;
            }
        } catch (NoSuchFieldError e38) {
            e = e38;
        }
        try {
            iArr5[LiveProbeResult.LIVE_PROBER_STOP_MANUALLY.ordinal()] = 3;
        } catch (NoSuchFieldError e39) {
            e = e39;
            TryCatchGuardChecker.doCheck(e);
        }
        LJ = iArr5;
        int[] iArr6 = new int[PerformanceAlarmReason.values().length];
        try {
            try {
                try {
                    iArr6[PerformanceAlarmReason.PERFORMANCE_FALLBACKED.ordinal()] = 1;
                } catch (NoSuchFieldError e40) {
                    e = e40;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e41) {
                e = e41;
            }
        } catch (NoSuchFieldError e42) {
            e = e42;
        }
        try {
            try {
                try {
                    iArr6[PerformanceAlarmReason.PERFORMANCE_RESUMED.ordinal()] = 2;
                } catch (NoSuchFieldError e43) {
                    e = e43;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e44) {
                e = e44;
            }
        } catch (NoSuchFieldError e45) {
            e = e45;
        }
        try {
            try {
                try {
                    iArr6[PerformanceAlarmReason.BANDWIDTH_FALLBACKED.ordinal()] = 3;
                } catch (NoSuchFieldError e46) {
                    e = e46;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e47) {
                e = e47;
            }
        } catch (NoSuchFieldError e48) {
            e = e48;
        }
        try {
            try {
            } catch (NoSuchFieldError e49) {
                e = e49;
            }
            try {
                iArr6[PerformanceAlarmReason.BANDWIDTH_RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e50) {
                e = e50;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e51) {
            e = e51;
        }
        LJFF = iArr6;
        int[] iArr7 = new int[LyraxVideoPerformanceAlarmReason.values().length];
        try {
            try {
            } catch (NoSuchFieldError e52) {
                e = e52;
            }
        } catch (NoSuchFieldError e53) {
            e = e53;
        }
        try {
            iArr7[LyraxVideoPerformanceAlarmReason.PERFORMANCE_FALLBACKED.ordinal()] = 1;
        } catch (NoSuchFieldError e54) {
            e = e54;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    iArr7[LyraxVideoPerformanceAlarmReason.PERFORMANCE_RESUMED.ordinal()] = 2;
                } catch (NoSuchFieldError e55) {
                    e = e55;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e56) {
                e = e56;
            }
        } catch (NoSuchFieldError e57) {
            e = e57;
        }
        try {
            try {
                try {
                    iArr7[LyraxVideoPerformanceAlarmReason.BANDWIDTH_FALLBACKED.ordinal()] = 3;
                } catch (NoSuchFieldError e58) {
                    e = e58;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e59) {
                e = e59;
            }
        } catch (NoSuchFieldError e60) {
            e = e60;
        }
        try {
            try {
                try {
                    iArr7[LyraxVideoPerformanceAlarmReason.BANDWIDTH_RESUMED.ordinal()] = 4;
                } catch (NoSuchFieldError e61) {
                    e = e61;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e62) {
                e = e62;
            }
        } catch (NoSuchFieldError e63) {
            e = e63;
        }
        LJI = iArr7;
        int[] iArr8 = new int[LyraxNetworkQuality.values().length];
        try {
            try {
            } catch (NoSuchFieldError e64) {
                e = e64;
            }
            try {
                iArr8[LyraxNetworkQuality.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError e65) {
                e = e65;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e66) {
            e = e66;
        }
        try {
            try {
            } catch (NoSuchFieldError e67) {
                e = e67;
            }
            try {
                iArr8[LyraxNetworkQuality.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError e68) {
                e = e68;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e69) {
            e = e69;
        }
        try {
            try {
            } catch (NoSuchFieldError e70) {
                e = e70;
            }
        } catch (NoSuchFieldError e71) {
            e = e71;
        }
        try {
            iArr8[LyraxNetworkQuality.POOR.ordinal()] = 3;
        } catch (NoSuchFieldError e72) {
            e = e72;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
            } catch (NoSuchFieldError e73) {
                e = e73;
            }
        } catch (NoSuchFieldError e74) {
            e = e74;
        }
        try {
            iArr8[LyraxNetworkQuality.BAD.ordinal()] = 4;
        } catch (NoSuchFieldError e75) {
            e = e75;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    iArr8[LyraxNetworkQuality.DOWN.ordinal()] = 5;
                } catch (NoSuchFieldError e76) {
                    e = e76;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e77) {
                e = e77;
            }
        } catch (NoSuchFieldError e78) {
            e = e78;
        }
        try {
            try {
                try {
                    iArr8[LyraxNetworkQuality.VERYBAD.ordinal()] = 6;
                } catch (NoSuchFieldError e79) {
                    e = e79;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e80) {
                e = e80;
            }
        } catch (NoSuchFieldError e81) {
            e = e81;
        }
        LJII = iArr8;
        int[] iArr9 = new int[LyraxStreamProtocol.values().length];
        try {
            try {
            } catch (NoSuchFieldError e82) {
                e = e82;
            }
            try {
                iArr9[LyraxStreamProtocol.RTMP.ordinal()] = 1;
            } catch (NoSuchFieldError e83) {
                e = e83;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e84) {
            e = e84;
        }
        try {
            try {
            } catch (NoSuchFieldError e85) {
                e = e85;
            }
        } catch (NoSuchFieldError e86) {
            e = e86;
        }
        try {
            iArr9[LyraxStreamProtocol.RTP.ordinal()] = 2;
        } catch (NoSuchFieldError e87) {
            e = e87;
            TryCatchGuardChecker.doCheck(e);
        }
        LJIIIIZZ = iArr9;
    }
}
