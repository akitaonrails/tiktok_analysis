package X;

/* JADX INFO: renamed from: X.0kC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1309970kC3 {
    DUMP_ELEMENT(2),
    RECYCLE_TEMPLATE_BUNDLE(4),
    PROCESS_LAYOUT_WITHOUT_UI_FLUSH(8),
    RENDER_FOR_RECREATE_ENGINE(16);

    public final int LL;

    public int id() {
        return this.LL;
    }

    public static EnumC1309970kC3 valueOf(String str) {
        return (EnumC1309970kC3) C08FF.LIZ(EnumC1309970kC3.class, str);
    }

    EnumC1309970kC3(int i) {
        this.LL = i;
    }
}
