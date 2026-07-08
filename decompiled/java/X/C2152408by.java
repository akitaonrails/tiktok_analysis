package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152408by {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final long LJFF = System.currentTimeMillis();
    public final Map<EnumC2152608c0, C2152508bz> LJI = new LinkedHashMap();
    public volatile String LJII = "";
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    public final synchronized void LJII(EnumC2152608c0 enumC2152608c0) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJI;
        if (linkedHashMap.get(enumC2152608c0) == null) {
            linkedHashMap.put(enumC2152608c0, new C2152508bz(System.currentTimeMillis()));
        }
    }

    public final void LIZJ(long j, EnumC2152608c0 enumC2152608c0) {
        String str;
        if (enumC2152608c0 == null) {
            synchronized (this) {
                EnumC2152608c0[] enumC2152608c0ArrValues = EnumC2152608c0.values();
                int length = enumC2152608c0ArrValues.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        enumC2152608c0 = enumC2152608c0ArrValues[length];
                        C2152508bz c2152508bz = (C2152508bz) ((LinkedHashMap) this.LJI).get(enumC2152608c0);
                        if (c2152508bz != null) {
                            str = c2152508bz.LIZJ;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.LJFF(str, "fail")) {
                            if (i < 0) {
                                break;
                            } else {
                                length = i;
                            }
                        } else {
                            break;
                        }
                    }
                    enumC2152608c0 = null;
                } else {
                    enumC2152608c0 = null;
                }
            }
            if (enumC2152608c0 == null) {
                enumC2152608c0 = EnumC2152608c0.CREATE;
            }
        }
        LIZIZ("fail", Long.valueOf(j), enumC2152608c0);
    }

    public final synchronized void LJFF(EnumC2152608c0 enumC2152608c0, int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJI;
        Object c2152508bz = linkedHashMap.get(enumC2152608c0);
        if (c2152508bz == null) {
            c2152508bz = new C2152508bz(System.currentTimeMillis());
            linkedHashMap.put(enumC2152608c0, c2152508bz);
        }
        ((C2152508bz) c2152508bz).LJ = i;
    }

    public final synchronized void LJI(long j, EnumC2152608c0 enumC2152608c0) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJI;
        Object c2152508bz = linkedHashMap.get(enumC2152608c0);
        if (c2152508bz == null) {
            c2152508bz = new C2152508bz(System.currentTimeMillis());
            linkedHashMap.put(enumC2152608c0, c2152508bz);
        }
        ((C2152508bz) c2152508bz).LJFF.add(Long.valueOf(j));
    }

    public final synchronized void LJIIIIZZ(EnumC2152608c0 enumC2152608c0, Map<String, String> map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJI;
        Object c2152508bz = linkedHashMap.get(enumC2152608c0);
        if (c2152508bz == null) {
            c2152508bz = new C2152508bz(System.currentTimeMillis());
            linkedHashMap.put(enumC2152608c0, c2152508bz);
        }
        C2152508bz c2152508bz2 = (C2152508bz) c2152508bz;
        c2152508bz2.LIZIZ = System.currentTimeMillis();
        c2152508bz2.LIZJ = "success";
        c2152508bz2.LJI.putAll(map);
    }

    public final Map<String, String> LIZ(String str, Long l, EnumC2152608c0 enumC2152608c0) {
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bulletin_board_id", this.LIZ);
        String str2 = "1";
        if (this.LIZJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_resend", obj);
        linkedHashMap.put("record_duration", String.valueOf(this.LIZLLL));
        C2233808p6.LIZ.getClass();
        String str3 = "unknown";
        try {
            C844470XAv.LIZ.getClass();
            String strC3 = C786410Ut5.c3(C844470XAv.LIZ());
            if (strC3.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                strC3 = "unknown";
            }
            C189200o6.m2constructorimpl(strC3);
            obj2 = strC3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Object obj3 = str3;
        if (!C189200o6.m7isFailureimpl(obj2)) {
            obj3 = obj2;
        }
        linkedHashMap.put("network_type", obj3);
        linkedHashMap.put("total_duration", String.valueOf(System.currentTimeMillis() - this.LJFF));
        linkedHashMap.put("publish_status", str);
        linkedHashMap.put("final_stage", enumC2152608c0.getKey());
        if (l != null) {
            linkedHashMap.put("final_err_code", l.toString());
        }
        if (this.LJII.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put("vid", this.LJII);
        }
        if (!this.LJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_hw_encode", str2);
        for (EnumC2152608c0 enumC2152608c02 : EnumC2152608c0.values()) {
            C2152508bz c2152508bz = (C2152508bz) ((LinkedHashMap) this.LJI).get(enumC2152608c02);
            if (c2152508bz != null) {
                String key = enumC2152608c02.getKey();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(key);
                sbLIZ.append("_status");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str4 = c2152508bz.LIZJ;
                if (str4 == null) {
                    str4 = "fail";
                }
                linkedHashMap.put(strLIZIZ, str4);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(key);
                sbLIZ2.append("_duration");
                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), String.valueOf(c2152508bz.LIZIZ - c2152508bz.LIZ));
                Long l2 = c2152508bz.LIZLLL;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(key);
                    sbLIZ3.append("_err_code");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ3), String.valueOf(jLongValue));
                }
                if (c2152508bz.LJ > 1) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(key);
                    sbLIZ4.append("_retry_count");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ4), String.valueOf(c2152508bz.LJ));
                }
                if (!c2152508bz.LJFF.isEmpty()) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(key);
                    sbLIZ5.append("_retry_err_codes");
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), C13LP.LJJLIIIJ(c2152508bz.LJFF, ",", null, null, 0, null, null, 62));
                }
                for (Map.Entry<String, String> entry : c2152508bz.LJI.entrySet()) {
                    String key2 = entry.getKey();
                    String value = entry.getValue();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(key);
                    sbLIZ6.append('_');
                    sbLIZ6.append(key2);
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ6), value);
                }
            }
        }
        return linkedHashMap;
    }

    public final synchronized void LIZIZ(String str, Long l, EnumC2152608c0 enumC2152608c0) {
        String str2;
        if (!this.LJIIIIZZ.compareAndSet(false, true)) {
            return;
        }
        try {
            Map<String, String> mapLIZ = LIZ(str, l, enumC2152608c0);
            if (Intrinsics.LJFF(str, "fail")) {
                str2 = "error";
            } else {
                str2 = "info";
            }
            C2233808p6.LIZ.getClass();
            C2233808p6.LIZ(str2, mapLIZ);
            C2233808p6.LIZIZ.remove(this.LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2233808p6 c2233808p6 = C2233808p6.LIZ;
            String str3 = this.LIZIZ;
            c2233808p6.getClass();
            C2233808p6.LIZIZ.remove(str3);
            throw th;
        }
    }

    public final synchronized void LIZLLL(EnumC2152608c0 enumC2152608c0, long j, Map<String, String> map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJI;
        Object c2152508bz = linkedHashMap.get(enumC2152608c0);
        if (c2152508bz == null) {
            c2152508bz = new C2152508bz(System.currentTimeMillis());
            linkedHashMap.put(enumC2152608c0, c2152508bz);
        }
        C2152508bz c2152508bz2 = (C2152508bz) c2152508bz;
        c2152508bz2.LIZIZ = System.currentTimeMillis();
        c2152508bz2.LIZJ = "fail";
        c2152508bz2.LIZLLL = Long.valueOf(j);
        c2152508bz2.LJI.putAll(map);
    }

    public C2152408by(String str, long j, String str2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = z2;
    }
}
