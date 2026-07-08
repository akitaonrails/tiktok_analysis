package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: renamed from: X.0jJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1276390jJt {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;

    static {
        int[] iArr = new int[EnumC1276410jJv.values().length];
        LJ = iArr;
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
        } catch (NoSuchFieldError e2) {
            e = e2;
        }
        try {
            iArr[EnumC1276410jJv.MULTI_GUEST.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                    try {
                        LJ[EnumC1276410jJv.CO_HOST.ordinal()] = 2;
                    } catch (NoSuchFieldError e4) {
                        e = e4;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e5) {
                    e = e5;
                }
            } catch (NoSuchFieldError e6) {
                e = e6;
            }
        } catch (NoSuchFieldError e7) {
            e = e7;
        }
        try {
            try {
                try {
                    try {
                        LJ[EnumC1276410jJv.GAME_DUAL_DEVICE.ordinal()] = 3;
                    } catch (NoSuchFieldError e8) {
                        e = e8;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e9) {
                    e = e9;
                }
            } catch (NoSuchFieldError e10) {
                e = e10;
            }
        } catch (NoSuchFieldError e11) {
            e = e11;
        }
        try {
            try {
                try {
                    try {
                        LJ[EnumC1276410jJv.UNKNOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError e12) {
                        e = e12;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e13) {
                    e = e13;
                }
            } catch (NoSuchFieldError e14) {
                e = e14;
            }
        } catch (NoSuchFieldError e15) {
            e = e15;
        }
        int[] iArr2 = new int[EnumC1269590j8v.values().length];
        LIZLLL = iArr2;
        try {
            try {
                try {
                    iArr2[EnumC1269590j8v.UpdateVideoParameters.ordinal()] = 1;
                } catch (NoSuchFieldError e16) {
                    e = e16;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e17) {
                e = e17;
            }
        } catch (NoSuchFieldError e18) {
            e = e18;
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e19) {
                    e = e19;
                }
            } catch (NoSuchFieldError e20) {
                e = e20;
            }
        } catch (NoSuchFieldError e21) {
            e = e21;
        }
        try {
            LIZLLL[EnumC1269590j8v.SimulcastUpdateLayoutConfig.ordinal()] = 2;
        } catch (NoSuchFieldError e22) {
            e = e22;
            TryCatchGuardChecker.doCheck(e);
        }
        int[] iArr3 = new int[LogUtil.LogLevel.values().length];
        LIZJ = iArr3;
        try {
            try {
                try {
                    iArr3[LogUtil.LogLevel.LOG_LEVEL_TRACE.ordinal()] = 1;
                } catch (NoSuchFieldError e23) {
                    e = e23;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e24) {
                e = e24;
            }
        } catch (NoSuchFieldError e25) {
            e = e25;
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e26) {
                    e = e26;
                }
                try {
                    LIZJ[LogUtil.LogLevel.LOG_LEVEL_DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError e27) {
                    e = e27;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e28) {
                e = e28;
            }
        } catch (NoSuchFieldError e29) {
            e = e29;
        }
        try {
            try {
                try {
                    try {
                        LIZJ[LogUtil.LogLevel.LOG_LEVEL_INFO.ordinal()] = 3;
                    } catch (NoSuchFieldError e30) {
                        e = e30;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e31) {
                    e = e31;
                }
            } catch (NoSuchFieldError e32) {
                e = e32;
            }
        } catch (NoSuchFieldError e33) {
            e = e33;
        }
        try {
            try {
                try {
                    try {
                        LIZJ[LogUtil.LogLevel.LOG_LEVEL_WARNING.ordinal()] = 4;
                    } catch (NoSuchFieldError e34) {
                        e = e34;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e35) {
                    e = e35;
                }
            } catch (NoSuchFieldError e36) {
                e = e36;
            }
        } catch (NoSuchFieldError e37) {
            e = e37;
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e38) {
                    e = e38;
                }
                try {
                    LIZJ[LogUtil.LogLevel.LOG_LEVEL_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError e39) {
                    e = e39;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e40) {
                e = e40;
            }
        } catch (NoSuchFieldError e41) {
            e = e41;
        }
        int[] iArr4 = new int[ForwardStreamStateInfo.ForwardStreamState.values().length];
        LIZIZ = iArr4;
        try {
            try {
                try {
                    iArr4[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError e42) {
                    e = e42;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e43) {
                e = e43;
            }
        } catch (NoSuchFieldError e44) {
            e = e44;
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e45) {
                    e = e45;
                }
                try {
                    LIZIZ[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_SUCCESS.ordinal()] = 2;
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
                try {
                    try {
                        LIZIZ[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_FAILURE.ordinal()] = 3;
                    } catch (NoSuchFieldError e49) {
                        e = e49;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e50) {
                    e = e50;
                }
            } catch (NoSuchFieldError e51) {
                e = e51;
            }
        } catch (NoSuchFieldError e52) {
            e = e52;
        }
        int[] iArr5 = new int[EnumC1276430jJx.values().length];
        LIZ = iArr5;
        try {
            try {
            } catch (NoSuchFieldError e53) {
                e = e53;
            }
            try {
                iArr5[EnumC1276430jJx.PERFORMANCE_PROFILE_HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError e54) {
                e = e54;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e55) {
            e = e55;
        }
        try {
            try {
                try {
                    try {
                        LIZ[EnumC1276430jJx.PERFORMANCE_PROFILE_MID.ordinal()] = 2;
                    } catch (NoSuchFieldError e56) {
                        e = e56;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e57) {
                    e = e57;
                }
            } catch (NoSuchFieldError e58) {
                e = e58;
            }
        } catch (NoSuchFieldError e59) {
            e = e59;
        }
        try {
            try {
                try {
                    try {
                        LIZ[EnumC1276430jJx.PERFORMANCE_PROFILE_LOW.ordinal()] = 3;
                    } catch (NoSuchFieldError e60) {
                        e = e60;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e61) {
                    e = e61;
                }
            } catch (NoSuchFieldError e62) {
                e = e62;
            }
        } catch (NoSuchFieldError e63) {
            e = e63;
        }
    }
}
