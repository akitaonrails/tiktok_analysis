package X;

/* JADX INFO: renamed from: X.0j96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269700j96 {
    CameraView_Render(0),
    SingleView_Render(1),
    CameraView_And_SingleViewRender(2);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1269700j96 valueOf(String str) {
        return (EnumC1269700j96) C08FF.LIZ(EnumC1269700j96.class, str);
    }

    EnumC1269700j96(int i) {
        this.LL = i;
    }
}
