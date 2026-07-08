package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0PCB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCB implements Serializable {
    public static final int $stable = 8;
    public final C1988007qY abnormalInfo;
    public final EnumC053900Hp customContentType;
    public final C0PC7 fakeNullifyCardInfo;
    public final boolean showDivider;
    public final C0PCC skeletonInfo;
    public final String title;
    public final C0PCD titleInfo;

    public C0PCB() {
        this(true, null, EnumC053900Hp.DEFAULT, null, null, null, null);
    }

    public C0PCB(boolean z, String str, EnumC053900Hp enumC053900Hp, C0PC7 c0pc7, C0PCC c0pcc, C0PCD c0pcd, C1988007qY c1988007qY) {
        this.showDivider = z;
        this.title = str;
        this.customContentType = enumC053900Hp;
        this.fakeNullifyCardInfo = c0pc7;
        this.skeletonInfo = c0pcc;
        this.titleInfo = c0pcd;
        this.abnormalInfo = c1988007qY;
    }
}
