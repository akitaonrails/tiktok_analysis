package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC437540HDs {
    public static final C437550HDt Companion;
    public static final EnumC437540HDs DELETED;
    public static final EnumC437540HDs FAILED;
    public static final EnumC437540HDs GENERATING;
    public static final EnumC437540HDs IDLE;
    public static final EnumC437540HDs IN_QUEUE;
    public static final /* synthetic */ EnumC437540HDs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC437540HDs REGENERATING;
    public static final EnumC437540HDs START_REGENERATE;
    public static final EnumC437540HDs SUCCESSFUL;
    public static final EnumC437540HDs UNKNOWN;
    public static final EnumC437540HDs UPLOADING;
    public static final Map<Integer, EnumC437540HDs> map;
    public final int LL;

    public static InterfaceC2044707zh<EnumC437540HDs> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0HDt] */
    static {
        EnumC437540HDs enumC437540HDs = new EnumC437540HDs("UNKNOWN", 0, 0);
        UNKNOWN = enumC437540HDs;
        EnumC437540HDs enumC437540HDs2 = new EnumC437540HDs("IDLE", 1, 1);
        IDLE = enumC437540HDs2;
        EnumC437540HDs enumC437540HDs3 = new EnumC437540HDs("GENERATING", 2, 2);
        GENERATING = enumC437540HDs3;
        EnumC437540HDs enumC437540HDs4 = new EnumC437540HDs("SUCCESSFUL", 3, 3);
        SUCCESSFUL = enumC437540HDs4;
        EnumC437540HDs enumC437540HDs5 = new EnumC437540HDs("FAILED", 4, 4);
        FAILED = enumC437540HDs5;
        EnumC437540HDs enumC437540HDs6 = new EnumC437540HDs("IN_QUEUE", 5, 5);
        IN_QUEUE = enumC437540HDs6;
        EnumC437540HDs enumC437540HDs7 = new EnumC437540HDs("START_REGENERATE", 6, 6);
        START_REGENERATE = enumC437540HDs7;
        EnumC437540HDs enumC437540HDs8 = new EnumC437540HDs("REGENERATING", 7, 7);
        REGENERATING = enumC437540HDs8;
        EnumC437540HDs enumC437540HDs9 = new EnumC437540HDs("DELETED", 8, 8);
        DELETED = enumC437540HDs9;
        EnumC437540HDs enumC437540HDs10 = new EnumC437540HDs("UPLOADING", 9, 9);
        UPLOADING = enumC437540HDs10;
        EnumC437540HDs[] enumC437540HDsArr = {enumC437540HDs, enumC437540HDs2, enumC437540HDs3, enumC437540HDs4, enumC437540HDs5, enumC437540HDs6, enumC437540HDs7, enumC437540HDs8, enumC437540HDs9, enumC437540HDs10};
        LLILLJJLI = enumC437540HDsArr;
        LLILLL = new C2254308sP(enumC437540HDsArr);
        Companion = new Object() { // from class: X.0HDt
        };
        EnumC437540HDs[] enumC437540HDsArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC437540HDsArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC437540HDs enumC437540HDs11 : enumC437540HDsArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC437540HDs11.LL), enumC437540HDs11);
        }
        map = linkedHashMap;
    }

    public static EnumC437540HDs[] values() {
        return (EnumC437540HDs[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC437540HDs valueOf(String str) {
        return (EnumC437540HDs) C08FF.LIZ(EnumC437540HDs.class, str);
    }

    public EnumC437540HDs(String str, int i, int i2) {
        this.LL = i2;
    }
}
