package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLR {
    public static final C0HLR CROP;
    public static final C439460HLc Companion;
    public static final C0HLR FACE_DETECTION;
    public static final C0HLR IMAGEX_UPLOAD;
    public static final /* synthetic */ C0HLR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HLR NONE;
    public static final C0HLR SA_CREATE_REQ;
    public static final C0HLR TNS_CHECK;
    public static final Map<Integer, C0HLR> map;
    public final int LL;

    public static InterfaceC2044707zh<C0HLR> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0HLc] */
    static {
        C0HLR c0hlr = new C0HLR("NONE", 0, 0);
        NONE = c0hlr;
        C0HLR c0hlr2 = new C0HLR("FACE_DETECTION", 1, 1);
        FACE_DETECTION = c0hlr2;
        C0HLR c0hlr3 = new C0HLR("CROP", 2, 2);
        CROP = c0hlr3;
        C0HLR c0hlr4 = new C0HLR("IMAGEX_UPLOAD", 3, 3);
        IMAGEX_UPLOAD = c0hlr4;
        C0HLR c0hlr5 = new C0HLR("TNS_CHECK", 4, 4);
        TNS_CHECK = c0hlr5;
        C0HLR c0hlr6 = new C0HLR("SA_CREATE_REQ", 5, 5);
        SA_CREATE_REQ = c0hlr6;
        C0HLR[] c0hlrArr = {c0hlr, c0hlr2, c0hlr3, c0hlr4, c0hlr5, c0hlr6};
        LLILLJJLI = c0hlrArr;
        LLILLL = new C2254308sP(c0hlrArr);
        Companion = new Object() { // from class: X.0HLc
        };
        C0HLR[] c0hlrArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c0hlrArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C0HLR c0hlr7 : c0hlrArrValues) {
            linkedHashMap.put(Integer.valueOf(c0hlr7.LL), c0hlr7);
        }
        map = linkedHashMap;
    }

    public static C0HLR[] values() {
        return (C0HLR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0HLR valueOf(String str) {
        return (C0HLR) C08FF.LIZ(C0HLR.class, str);
    }

    public C0HLR(String str, int i, int i2) {
        this.LL = i2;
    }
}
