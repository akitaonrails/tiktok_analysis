package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839300WwC {
    public static final ConcurrentHashMap<String, InterfaceC839340WwG> LIZ;
    public static final C826770Wbz LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Wbz] */
    static {
        ConcurrentHashMap<String, InterfaceC839340WwG> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        LIZIZ = new InterfaceC826030Wan() { // from class: X.0Wbz
            @Override // X.InterfaceC826030Wan
            public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str, int i, String str2, String str3, String str4, C0WZW c0wzw) {
                if (!interfaceC826050Wap.pc(str)) {
                    return true;
                }
                return false;
            }
        };
        concurrentHashMap.put("period", new InterfaceC839340WwG() { // from class: X.0WwB
            @Override // X.InterfaceC839340WwG
            public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                String str = map.get("period");
                if (str == null) {
                    str = "60000";
                }
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        return new InterfaceC826030Wan(60000L) { // from class: X.0Wbu
                            public final long LIZ;
                            public long LIZIZ;

                            {
                                this.LIZ = j;
                            }

                            @Override // X.InterfaceC826030Wan
                            public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str2, int i2, String str3, String str4, String str5, C0WZW c0wzw) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                if (!interfaceC826050Wap.pc(str2)) {
                                    this.LIZIZ = jElapsedRealtime;
                                    return true;
                                }
                                if (jElapsedRealtime - this.LIZIZ > this.LIZ) {
                                    this.LIZIZ = jElapsedRealtime;
                                    return true;
                                }
                                return false;
                            }
                        };
                    }
                }
                return new InterfaceC826030Wan(CastLongProtector.parseLong(str)) { // from class: X.0Wbu
                    public final long LIZ;
                    public long LIZIZ;

                    {
                        this.LIZ = j;
                    }

                    @Override // X.InterfaceC826030Wan
                    public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str2, int i2, String str3, String str4, String str5, C0WZW c0wzw) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (!interfaceC826050Wap.pc(str2)) {
                            this.LIZIZ = jElapsedRealtime;
                            return true;
                        }
                        if (jElapsedRealtime - this.LIZIZ > this.LIZ) {
                            this.LIZIZ = jElapsedRealtime;
                            return true;
                        }
                        return false;
                    }
                };
            }
        });
        concurrentHashMap.put("persist", new InterfaceC839340WwG() { // from class: X.0WwE
            @Override // X.InterfaceC839340WwG
            public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                return C839300WwC.LIZIZ;
            }
        });
        concurrentHashMap.put("rule", new InterfaceC839340WwG() { // from class: X.0WwF
            @Override // X.InterfaceC839340WwG
            public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                return new InterfaceC826030Wan() { // from class: X.0WxC
                    @Override // X.InterfaceC826030Wan
                    public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str, int i, String str2, String str3, String str4, C0WZW c0wzw) {
                        C2097608Jq.LJIIJ(new Pair(EnumC839930WxD.SOURCE.getValue(), "guard"), new Pair(EnumC839930WxD.API_ID.getValue(), Integer.valueOf(i)), new Pair(EnumC839930WxD.IS_REFLECTION.getValue(), Boolean.valueOf(c0wzw.LIZ)), new Pair(EnumC839930WxD.CLASS_NAME.getValue(), str2), new Pair(EnumC839930WxD.MEMBER_NAME.getValue(), str3), new Pair(EnumC839930WxD.RETURN_TYPE.getValue(), str4));
                        return false;
                    }
                };
            }
        });
        concurrentHashMap.put("cache_background", new InterfaceC839340WwG() { // from class: X.0Ww8
            @Override // X.InterfaceC839340WwG
            public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                return new C826730Wbv();
            }
        });
        concurrentHashMap.put("cache_foreground", new InterfaceC839340WwG() { // from class: X.0Ww9
            @Override // X.InterfaceC839340WwG
            public final InterfaceC826030Wan LIZ(Map<String, String> map) {
                return new C826750Wbx();
            }
        });
    }
}
