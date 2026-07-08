package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1651870t5V {
    public static final EnumC1651870t5V DM_GROUP_SHOT;
    public static final EnumC1651870t5V IMAGE_EDIT;
    public static final /* synthetic */ EnumC1651870t5V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1651870t5V NORMAL_EDIT;
    public static final EnumC1651870t5V PHOTO_SWAP;
    public static final EnumC1651870t5V RECORD_PHOTO;
    public static final EnumC1651870t5V RECORD_VIDEO;
    public static final EnumC1651870t5V STORY;

    public static InterfaceC2044707zh<EnumC1651870t5V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1651870t5V enumC1651870t5V = new EnumC1651870t5V("RECORD_VIDEO", 0);
        RECORD_VIDEO = enumC1651870t5V;
        EnumC1651870t5V enumC1651870t5V2 = new EnumC1651870t5V("RECORD_PHOTO", 1);
        RECORD_PHOTO = enumC1651870t5V2;
        EnumC1651870t5V enumC1651870t5V3 = new EnumC1651870t5V("NORMAL_EDIT", 2);
        NORMAL_EDIT = enumC1651870t5V3;
        EnumC1651870t5V enumC1651870t5V4 = new EnumC1651870t5V("STORY", 3);
        STORY = enumC1651870t5V4;
        EnumC1651870t5V enumC1651870t5V5 = new EnumC1651870t5V("PHOTO_SWAP", 4);
        PHOTO_SWAP = enumC1651870t5V5;
        EnumC1651870t5V enumC1651870t5V6 = new EnumC1651870t5V("IMAGE_EDIT", 5);
        IMAGE_EDIT = enumC1651870t5V6;
        EnumC1651870t5V enumC1651870t5V7 = new EnumC1651870t5V("DM_GROUP_SHOT", 6);
        DM_GROUP_SHOT = enumC1651870t5V7;
        EnumC1651870t5V[] enumC1651870t5VArr = {enumC1651870t5V, enumC1651870t5V2, enumC1651870t5V3, enumC1651870t5V4, enumC1651870t5V5, enumC1651870t5V6, enumC1651870t5V7};
        LL = enumC1651870t5VArr;
        LLILLJJLI = new C2254308sP(enumC1651870t5VArr);
    }

    public static EnumC1651870t5V[] values() {
        return (EnumC1651870t5V[]) LL.clone();
    }

    public static EnumC1651870t5V valueOf(String str) {
        return (EnumC1651870t5V) C08FF.LIZ(EnumC1651870t5V.class, str);
    }

    public EnumC1651870t5V(String str, int i) {
    }
}
