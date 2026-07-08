package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19546511df {
    public volatile long LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();
    public volatile String LJIIIIZZ = String.valueOf(EnumC19547111dl.ALL.ordinal());
    public final ReentrantLock LJIIIZ = new ReentrantLock();
    public final ReentrantLock LJIIJ = new ReentrantLock();

    public final void LJII() {
        String str = this.LIZLLL.get("cache_status");
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (Intrinsics.LJFF(str, "1")) {
            LIZJ("loading_cost_ms", CardStruct.IStatusCode.DEFAULT);
            LIZJ("connect_cost_ms", CardStruct.IStatusCode.DEFAULT);
            LIZJ("first_frame_cost_ms", CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJIIIIZZ() {
        Float fLJIIIIZZ;
        String str = this.LIZJ.get("cache_rate");
        if (str == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) == null || fLJIIIIZZ.floatValue() < 1.0f) {
            return;
        }
        LIZLLL("loading_cost_ms", CardStruct.IStatusCode.DEFAULT);
        LIZLLL("preview_cost_ms", CardStruct.IStatusCode.DEFAULT);
        LIZLLL("video_loading_duration_ms", CardStruct.IStatusCode.DEFAULT);
        LIZLLL("audio_loading_duration_ms", CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJIIL() {
        try {
            this.LJIIIZ.lock();
            LJIIIIZZ();
            Map<String, String> mapLJIIL = C2097608Jq.LJIIL(this.LIZJ, this.LIZIZ);
            if (LJI(mapLJIIL)) {
                C11YX c11yx = new C11YX();
                C19518711Yb c19518711Yb = C19518711Yb.LIZ;
                C11YY c11yyLIZ = c11yx.LIZ();
                c19518711Yb.getClass();
                C19518711Yb.LIZIZ("stream_voice_conversion_effect", mapLJIIL, c11yyLIZ);
            }
            this.LJIIIZ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIIZ.unlock();
            throw th;
        }
    }

    public static boolean LJIIIZ(String str) {
        if (str != null && !a0.LJJJIL(str) && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(String str) {
        if (str != null && !a0.LJJJIL(str) && str.length() < 12) {
            return false;
        }
        return true;
    }

    public final void LJ(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 40) {
                    String str = CardStruct.IStatusCode.DEFAULT;
                    if (i != 50) {
                        if (i != 53) {
                            if (i != 55) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 13) {
                                            if (i != 14) {
                                                if (i != 23) {
                                                    if (i != 24) {
                                                        if (i != 43) {
                                                            if (i != 44) {
                                                                switch (i) {
                                                                    case 30:
                                                                        LIZLLL("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                                                                        LJIIIIZZ();
                                                                        LJIIL();
                                                                        break;
                                                                    case 31:
                                                                        LIZLLL("video_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                                                                        break;
                                                                    case 32:
                                                                        LIZLLL("audio_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                                                                        break;
                                                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                                        LIZJ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJI));
                                                                        String str2 = this.LIZLLL.get("cache_status");
                                                                        if (str2 != null) {
                                                                            str = str2;
                                                                        }
                                                                        boolean zLJFF = Intrinsics.LJFF(str, "1");
                                                                        LJII();
                                                                        LJIIJJI(false, zLJFF);
                                                                        break;
                                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                                        LIZIZ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJII));
                                                                        String str3 = this.LJ.get("cache_status");
                                                                        if (str3 == null) {
                                                                            str3 = CardStruct.IStatusCode.DEFAULT;
                                                                        }
                                                                        boolean zLJFF2 = Intrinsics.LJFF(str3, "1");
                                                                        if (zLJFF2) {
                                                                            LIZIZ("loading_cost_ms", CardStruct.IStatusCode.DEFAULT);
                                                                            LIZIZ("connect_cost_ms", CardStruct.IStatusCode.DEFAULT);
                                                                            LIZIZ("first_frame_cost_ms", CardStruct.IStatusCode.DEFAULT);
                                                                        }
                                                                        LJIIJJI(true, zLJFF2);
                                                                        break;
                                                                }
                                                                return;
                                                            }
                                                            LIZIZ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJII));
                                                            LJIIJJI(true, false);
                                                            return;
                                                        }
                                                        LIZJ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJI));
                                                        LJIIJJI(false, false);
                                                        return;
                                                    }
                                                    LIZIZ("connect_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJII));
                                                    return;
                                                }
                                                LIZJ("connect_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJI));
                                                return;
                                            }
                                            LIZIZ("first_frame_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJII));
                                            return;
                                        }
                                        LIZJ("first_frame_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJI));
                                        return;
                                    }
                                    this.LJII = System.currentTimeMillis();
                                    return;
                                }
                                this.LJI = System.currentTimeMillis();
                                return;
                            }
                            LIZIZ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJII));
                            LIZ("user_cancel", "1");
                            LJIIJJI(true, false);
                            return;
                        }
                        LIZJ("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJI));
                        LIZ("user_cancel", "1");
                        LJIIJJI(false, false);
                        return;
                    }
                    String str4 = this.LJIIIIZZ;
                    if (Intrinsics.LJFF(str4, String.valueOf(EnumC19547111dl.ALL.ordinal()))) {
                        LIZLLL("video_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                        LIZLLL("audio_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                    } else if (Intrinsics.LJFF(str4, String.valueOf(EnumC19547111dl.ONLY_AUDIO_WITHOUT_DUB.ordinal()))) {
                        LIZLLL("video_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                        LIZLLL("audio_loading_duration_ms", CardStruct.IStatusCode.DEFAULT);
                    } else if (Intrinsics.LJFF(str4, String.valueOf(EnumC19547111dl.ONLY_DUB.ordinal()))) {
                        LIZLLL("video_loading_duration_ms", CardStruct.IStatusCode.DEFAULT);
                        LIZLLL("audio_loading_duration_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                    }
                    LIZLLL("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                    LIZ("user_cancel", "1");
                    LJIIL();
                    return;
                }
                LIZLLL("loading_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
                LJIIL();
                return;
            }
            LIZLLL("preview_cost_ms", String.valueOf(System.currentTimeMillis() - this.LJFF));
            return;
        }
        this.LJFF = System.currentTimeMillis();
        String strValueOf = String.valueOf(EnumC19547111dl.ALL.ordinal());
        String str5 = this.LIZ.get("vc_type");
        if (str5 != null) {
            strValueOf = str5;
        }
        this.LJIIIIZZ = strValueOf;
    }

    public final boolean LJFF(Map<String, String> map) {
        String str;
        String str2;
        boolean z;
        if (!map.isEmpty() && (str = map.get("effect_name")) != null && str.length() != 0 && (str2 = map.get("speakerID")) != null && str2.length() != 0 && !LJIIIZ(map.get("origin_duration_ms")) && !LJIIJ(map.get("loading_cost_ms")) && !LJIIJ(map.get("connect_cost_ms")) && !LJIIJ(map.get("first_frame_cost_ms"))) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.LIZLLL;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z || this.LJI != 0) {
                ConcurrentHashMap<String, String> concurrentHashMap2 = this.LJ;
                if (concurrentHashMap2 != null && !concurrentHashMap2.isEmpty() && this.LJII == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJI(Map<String, String> map) {
        CharSequence charSequence;
        String str;
        Float fLJIIIIZZ;
        if (!map.isEmpty() && this.LJFF != 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            CharSequence charSequence2 = (CharSequence) linkedHashMap.get("effect_name");
            if (charSequence2 != null && charSequence2.length() != 0 && (charSequence = (CharSequence) linkedHashMap.get("speakerID")) != null && charSequence.length() != 0 && !LJIIJ((String) linkedHashMap.get("video_loading_duration_ms")) && !LJIIJ((String) linkedHashMap.get("audio_loading_duration_ms")) && !LJIIJ((String) linkedHashMap.get("loading_cost_ms")) && !LJIIJ((String) linkedHashMap.get("preview_cost_ms")) && ((str = (String) linkedHashMap.get("cache_rate")) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) == null || fLJIIIIZZ.floatValue() <= 1.0f)) {
                ConcurrentHashMap<String, String> concurrentHashMap = this.LIZLLL;
                if (concurrentHashMap != null && !concurrentHashMap.isEmpty() && LJIIIZ((String) linkedHashMap.get("video_process_duration_ms"))) {
                    return false;
                }
                ConcurrentHashMap<String, String> concurrentHashMap2 = this.LJ;
                if (concurrentHashMap2 != null && !concurrentHashMap2.isEmpty() && LJIIIZ((String) linkedHashMap.get("audio_process_duration_ms"))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LIZ(String str, String str2) {
        this.LIZIZ.put(str, str2);
    }

    public final void LIZIZ(String str, String str2) {
        this.LJ.put(str, str2);
    }

    public final void LIZJ(String str, String str2) {
        this.LIZLLL.put(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZJ.put(str, str2);
    }

    public final void LJIIJJI(boolean z, boolean z2) {
        String str;
        Map<String, String> mapLJIIL;
        try {
            this.LJIIJ.lock();
            if (z2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJII();
            if (z) {
                LIZIZ("cache_status", str);
                mapLJIIL = C2097608Jq.LJIIL(this.LIZIZ, this.LJ);
                this.LJ.clear();
                this.LJII = System.currentTimeMillis();
            } else {
                LIZJ("cache_status", str);
                mapLJIIL = C2097608Jq.LJIIL(this.LIZIZ, this.LIZLLL);
                this.LIZLLL.clear();
                this.LJI = System.currentTimeMillis();
            }
            if (LJFF(mapLJIIL)) {
                C11YX c11yx = new C11YX();
                C19518711Yb c19518711Yb = C19518711Yb.LIZ;
                C11YY c11yyLIZ = c11yx.LIZ();
                c19518711Yb.getClass();
                C19518711Yb.LIZIZ("stream_voice_conversion_single_file", mapLJIIL, c11yyLIZ);
            }
            this.LJIIJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIJ.unlock();
            throw th;
        }
    }
}
