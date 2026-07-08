package X;

/* JADX INFO: renamed from: X.10f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19300410f4 {
    LEFT(0),
    RIGHT(1);

    public static final C19301610fG Companion = new Object() { // from class: X.10fG
    };
    public final int LL;

    public static EnumC19300410f4 valueOf(String str) {
        return (EnumC19300410f4) C08FF.LIZ(EnumC19300410f4.class, str);
    }

    public final int getPosition() {
        return this.LL;
    }

    EnumC19300410f4(int i) {
        this.LL = i;
    }
}
