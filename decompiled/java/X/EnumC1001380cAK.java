package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1001380cAK {
    public static final EnumC1001380cAK ANOLE_COMPONENT_OPERATION;
    public static final EnumC1001380cAK CARD_OPERATION;
    public static final /* synthetic */ EnumC1001380cAK[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1001380cAK OTHER;
    public static final EnumC1001380cAK STICKER_OPERATION;
    public static final EnumC1001380cAK SUPER_LIKE_OPERATION;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1001380cAK> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1001380cAK enumC1001380cAK = new EnumC1001380cAK("ANOLE_COMPONENT_OPERATION", 0, 1, "anole_component");
        ANOLE_COMPONENT_OPERATION = enumC1001380cAK;
        EnumC1001380cAK enumC1001380cAK2 = new EnumC1001380cAK("CARD_OPERATION", 1, 2, "card");
        CARD_OPERATION = enumC1001380cAK2;
        EnumC1001380cAK enumC1001380cAK3 = new EnumC1001380cAK("STICKER_OPERATION", 2, 3, "sticker");
        STICKER_OPERATION = enumC1001380cAK3;
        EnumC1001380cAK enumC1001380cAK4 = new EnumC1001380cAK("SUPER_LIKE_OPERATION", 3, 4, "superlike");
        SUPER_LIKE_OPERATION = enumC1001380cAK4;
        EnumC1001380cAK enumC1001380cAK5 = new EnumC1001380cAK("OTHER", 4, 999, "other");
        OTHER = enumC1001380cAK5;
        EnumC1001380cAK[] enumC1001380cAKArr = {enumC1001380cAK, enumC1001380cAK2, enumC1001380cAK3, enumC1001380cAK4, enumC1001380cAK5};
        LLILLL = enumC1001380cAKArr;
        LLILZ = new C2254308sP(enumC1001380cAKArr);
    }

    public static EnumC1001380cAK[] values() {
        return (EnumC1001380cAK[]) LLILLL.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public final String getValue() {
        return this.LLILLJJLI;
    }

    public static EnumC1001380cAK valueOf(String str) {
        return (EnumC1001380cAK) C08FF.LIZ(EnumC1001380cAK.class, str);
    }

    public final String getTaskIdWithType(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEnabledForIdlePreload(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), this.LLILLJJLI)) {
                return true;
            }
        }
        return false;
    }

    public EnumC1001380cAK(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
