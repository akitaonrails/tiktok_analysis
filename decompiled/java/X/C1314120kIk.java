package X;

import com.bytedance.sdui.render.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1314120kIk {
    public EnumC1314200kIs LIZJ;
    public EnumC1314200kIs LIZLLL;
    public float LIZIZ = 1.0E21f;
    public float LIZ = 1.0E21f;

    public C1314120kIk() {
        EnumC1314200kIs enumC1314200kIs = EnumC1314200kIs.NUMBER;
        this.LIZLLL = enumC1314200kIs;
        this.LIZJ = enumC1314200kIs;
    }

    public static C1314120kIk LIZ(int i, ReadableArray readableArray) {
        EnumC1314200kIs enumC1314200kIs;
        EnumC1314200kIs enumC1314200kIs2;
        C1314120kIk c1314120kIk = new C1314120kIk();
        c1314120kIk.LIZ = (float) readableArray.getDouble(i);
        if (readableArray.getInt(i + 1) == 1) {
            enumC1314200kIs = EnumC1314200kIs.PERCENTAGE;
        } else {
            enumC1314200kIs = EnumC1314200kIs.NUMBER;
        }
        c1314120kIk.LIZJ = enumC1314200kIs;
        c1314120kIk.LIZIZ = (float) readableArray.getDouble(i + 2);
        if (readableArray.getInt(i + 3) == 1) {
            enumC1314200kIs2 = EnumC1314200kIs.PERCENTAGE;
        } else {
            enumC1314200kIs2 = EnumC1314200kIs.NUMBER;
        }
        c1314120kIk.LIZLLL = enumC1314200kIs2;
        return c1314120kIk;
    }
}
