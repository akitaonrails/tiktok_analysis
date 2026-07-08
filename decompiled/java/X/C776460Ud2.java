package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ud2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776460Ud2 extends PushStreamInfo.Quality implements Comparable<C776460Ud2> {
    public C776460Ud2(PushStreamInfo.Quality quality) {
        this.sdkKey = quality.sdkKey;
        this.name = quality.name;
        this.desc = quality.desc;
        this.height = quality.height;
        this.width = quality.width;
        this.min_bitrate = quality.min_bitrate;
        this.max_bitrate = quality.max_bitrate;
        this.default_bitrate = quality.default_bitrate;
        this.fps = quality.fps;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C776460Ud2 c776460Ud2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.sdkKey;
        if (str5 == null) {
            return -1;
        }
        int iHashCode = str5.hashCode();
        if (iHashCode != -846238328) {
            if (iHashCode != 3324) {
                if (iHashCode != 3448) {
                    if (iHashCode != 3665) {
                        if (iHashCode != 115761) {
                            if (iHashCode != 99118301 || !str5.equals("hd_60") || (str4 = c776460Ud2.sdkKey) == null) {
                                return -1;
                            }
                            int iHashCode2 = str4.hashCode();
                            if (iHashCode2 != 3324) {
                                if (iHashCode2 != 3448) {
                                    if (iHashCode2 != 3665) {
                                        if (iHashCode2 != 99118301 || !str4.equals("hd_60")) {
                                            return -1;
                                        }
                                        return 0;
                                    }
                                    if (!str4.equals("sd")) {
                                        return -1;
                                    }
                                    return 1;
                                }
                                if (!str4.equals("ld")) {
                                    return -1;
                                }
                                return 1;
                            }
                            if (!str4.equals("hd")) {
                                return -1;
                            }
                            return 1;
                        }
                        if (str5.equals("uhd") && (str3 = c776460Ud2.sdkKey) != null) {
                            int iHashCode3 = str3.hashCode();
                            if (iHashCode3 != 3324) {
                                if (iHashCode3 != 3448) {
                                    if (iHashCode3 != 3665) {
                                        if (iHashCode3 != 115761) {
                                            if (iHashCode3 == 99118301 && str3.equals("hd_60")) {
                                                return 1;
                                            }
                                        } else if (str3.equals("uhd")) {
                                            return 0;
                                        }
                                    } else {
                                        if (!str3.equals("sd")) {
                                            return -1;
                                        }
                                        return 1;
                                    }
                                } else {
                                    if (!str3.equals("ld")) {
                                        return -1;
                                    }
                                    return 1;
                                }
                            } else if (str3.equals("hd")) {
                                return 1;
                            }
                        }
                        return -1;
                    }
                    if (!str5.equals("sd")) {
                        return -1;
                    }
                    String str6 = c776460Ud2.sdkKey;
                    if (Intrinsics.LJFF(str6, "ld")) {
                        return 1;
                    }
                    if (!Intrinsics.LJFF(str6, "sd")) {
                        return -1;
                    }
                    return 0;
                }
                if (!str5.equals("ld") || !Intrinsics.LJFF(c776460Ud2.sdkKey, "ld")) {
                    return -1;
                }
                return 0;
            }
            if (str5.equals("hd") && (str2 = c776460Ud2.sdkKey) != null) {
                int iHashCode4 = str2.hashCode();
                if (iHashCode4 != 3324) {
                    if (iHashCode4 != 3448) {
                        if (iHashCode4 == 3665 && str2.equals("sd")) {
                            return 1;
                        }
                    } else {
                        if (!str2.equals("ld")) {
                            return -1;
                        }
                        return 1;
                    }
                } else if (str2.equals("hd")) {
                    return 0;
                }
            }
            return -1;
        }
        if (!str5.equals("uhd_60") || (str = c776460Ud2.sdkKey) == null) {
            return -1;
        }
        int iHashCode5 = str.hashCode();
        if (iHashCode5 != -846238328) {
            if (iHashCode5 != 3324) {
                if (iHashCode5 != 3448) {
                    if (iHashCode5 != 3665) {
                        if (iHashCode5 != 115761) {
                            if (iHashCode5 != 99118301 || !str.equals("hd_60")) {
                                return -1;
                            }
                            return 1;
                        }
                        if (!str.equals("uhd")) {
                            return -1;
                        }
                        return 1;
                    }
                    if (!str.equals("sd")) {
                        return -1;
                    }
                    return 1;
                }
                if (!str.equals("ld")) {
                    return -1;
                }
                return 1;
            }
            if (!str.equals("hd")) {
                return -1;
            }
            return 1;
        }
        if (!str.equals("uhd_60")) {
            return -1;
        }
        return 0;
    }
}
