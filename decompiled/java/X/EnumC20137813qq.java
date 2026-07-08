package X;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20137813qq {
    public static final EnumC20137813qq INSTANCE;
    public static final /* synthetic */ EnumC20137813qq[] LL;
    public HashMap<String, C1387670mDN> idToPresenter = new HashMap<>();
    public HashMap<C1387670mDN, String> presenterToId = new HashMap<>();

    static {
        EnumC20137813qq enumC20137813qq = new EnumC20137813qq();
        INSTANCE = enumC20137813qq;
        LL = new EnumC20137813qq[]{enumC20137813qq};
    }

    public static EnumC20137813qq[] values() {
        return (EnumC20137813qq[]) LL.clone();
    }

    public void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    public static EnumC20137813qq valueOf(String str) {
        return (EnumC20137813qq) C08FF.LIZ(EnumC20137813qq.class, str);
    }

    public void add(final C1387670mDN c1387670mDN) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1387670mDN.getClass().getSimpleName());
        sbLIZ.append("/");
        sbLIZ.append(System.nanoTime());
        sbLIZ.append("/");
        sbLIZ.append((int) (Math.random() * 2.147483647E9d));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.idToPresenter.put(strLIZIZ, c1387670mDN);
        this.presenterToId.put(c1387670mDN, strLIZIZ);
        c1387670mDN.LIZIZ.add(new InterfaceC1387680mDO() { // from class: X.13qr
            @Override // X.InterfaceC1387680mDO
            public final void onDestroy() {
                EnumC20137813qq enumC20137813qq = this.LIZIZ;
                enumC20137813qq.idToPresenter.remove(enumC20137813qq.presenterToId.remove(c1387670mDN));
            }
        });
    }

    public String getId(C1387670mDN c1387670mDN) {
        return this.presenterToId.get(c1387670mDN);
    }

    public <P> P getPresenter(String str) {
        return (P) this.idToPresenter.get(str);
    }
}
