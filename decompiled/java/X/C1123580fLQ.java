package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123580fLQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (Intrinsics.LJFF(str, EnumC1123470fLF.GIFT_GUIDE_POPUP_NEW_GIFTER.getValue())) {
            return EnumC1123470fLF.GIFT_GUIDE_POPUP.getValue();
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static boolean LIZIZ(String str) {
        EnumC1123470fLF[] enumC1123470fLFArrValues = EnumC1123470fLF.values();
        ArrayList arrayList = new ArrayList(enumC1123470fLFArrValues.length);
        for (EnumC1123470fLF enumC1123470fLF : enumC1123470fLFArrValues) {
            arrayList.add(enumC1123470fLF.getValue());
        }
        return C13LP.LJJJJ(str, arrayList);
    }
}
