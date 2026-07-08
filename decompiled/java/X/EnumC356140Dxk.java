package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356140Dxk {
    public static final /* synthetic */ EnumC356140Dxk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC356140Dxk None;
    public static final EnumC356140Dxk RecordFromEditorPro;
    public static final EnumC356140Dxk RecordFromRecordPage;
    public static final EnumC356140Dxk UploadFromEditorPro;
    public static final EnumC356140Dxk UploadFromRecordPage;
    public final int LL;

    public static InterfaceC2044707zh<EnumC356140Dxk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356140Dxk enumC356140Dxk = new EnumC356140Dxk("None", 0, 0);
        None = enumC356140Dxk;
        EnumC356140Dxk enumC356140Dxk2 = new EnumC356140Dxk("RecordFromRecordPage", 1, 1);
        RecordFromRecordPage = enumC356140Dxk2;
        EnumC356140Dxk enumC356140Dxk3 = new EnumC356140Dxk("UploadFromRecordPage", 2, 2);
        UploadFromRecordPage = enumC356140Dxk3;
        EnumC356140Dxk enumC356140Dxk4 = new EnumC356140Dxk("RecordFromEditorPro", 3, 3);
        RecordFromEditorPro = enumC356140Dxk4;
        EnumC356140Dxk enumC356140Dxk5 = new EnumC356140Dxk("UploadFromEditorPro", 4, 4);
        UploadFromEditorPro = enumC356140Dxk5;
        EnumC356140Dxk[] enumC356140DxkArr = {enumC356140Dxk, enumC356140Dxk2, enumC356140Dxk3, enumC356140Dxk4, enumC356140Dxk5};
        LLILLJJLI = enumC356140DxkArr;
        LLILLL = new C2254308sP(enumC356140DxkArr);
    }

    public static EnumC356140Dxk[] values() {
        return (EnumC356140Dxk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC356140Dxk valueOf(String str) {
        return (EnumC356140Dxk) C08FF.LIZ(EnumC356140Dxk.class, str);
    }

    public EnumC356140Dxk(String str, int i, int i2) {
        this.LL = i2;
    }
}
