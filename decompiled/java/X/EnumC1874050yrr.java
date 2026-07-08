package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yrr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1874050yrr {
    public static final EnumC1874050yrr BANNER;
    public static final EnumC1874050yrr BOTTOM_TAB;
    public static final C1869280ykA Companion;
    public static final List<EnumC1874050yrr> LLILLL;
    public static final /* synthetic */ EnumC1874050yrr[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1874050yrr STATUS_BAR;
    public static final EnumC1874050yrr TOP_TAB;
    public static final List<EnumC1874050yrr> bottomAreaList;
    public static final List<EnumC1874050yrr> topAreaList;
    public final String LL;
    public final C0J35 LLILLJJLI;
    public final int maskValue;

    public static InterfaceC2044707zh<EnumC1874050yrr> getEntries() {
        return LLILZIL;
    }

    static {
        C0J35 c0j35 = C0J35.TOP;
        EnumC1874050yrr enumC1874050yrr = new EnumC1874050yrr("STATUS_BAR", 0, "status bar", 0, c0j35);
        STATUS_BAR = enumC1874050yrr;
        EnumC1874050yrr enumC1874050yrr2 = new EnumC1874050yrr("TOP_TAB", 1, "top tab", 1, c0j35);
        TOP_TAB = enumC1874050yrr2;
        C0J35 c0j352 = C0J35.BOTTOM;
        EnumC1874050yrr enumC1874050yrr3 = new EnumC1874050yrr("BOTTOM_TAB", 2, "bottom tab", 0, c0j352);
        BOTTOM_TAB = enumC1874050yrr3;
        EnumC1874050yrr enumC1874050yrr4 = new EnumC1874050yrr("BANNER", 3, "banner", 1, c0j352);
        BANNER = enumC1874050yrr4;
        EnumC1874050yrr[] enumC1874050yrrArr = {enumC1874050yrr, enumC1874050yrr2, enumC1874050yrr3, enumC1874050yrr4};
        LLILZ = enumC1874050yrrArr;
        LLILZIL = new C2254308sP(enumC1874050yrrArr);
        Companion = new C1869280ykA();
        List<EnumC1874050yrr> listLJIIJJI = C1697810uHb.LJIIJJI(enumC1874050yrr, enumC1874050yrr2, enumC1874050yrr4, enumC1874050yrr3);
        LLILLL = listLJIIJJI;
        ArrayList arrayList = new ArrayList();
        for (EnumC1874050yrr enumC1874050yrr5 : listLJIIJJI) {
            if (enumC1874050yrr5.LLILLJJLI == C0J35.TOP) {
                arrayList.add(enumC1874050yrr5);
            }
        }
        topAreaList = C13LP.LJLLLL(new Comparator() { // from class: X.0qfJ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC1874050yrr) t).maskValue), Integer.valueOf(((EnumC1874050yrr) t2).maskValue));
            }
        }, arrayList);
        List<EnumC1874050yrr> list = LLILLL;
        ArrayList arrayList2 = new ArrayList();
        for (EnumC1874050yrr enumC1874050yrr6 : list) {
            if (enumC1874050yrr6.LLILLJJLI == C0J35.BOTTOM) {
                arrayList2.add(enumC1874050yrr6);
            }
        }
        bottomAreaList = C13LP.LJLLLL(new Comparator() { // from class: X.0qfK
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC1874050yrr) t).maskValue), Integer.valueOf(((EnumC1874050yrr) t2).maskValue));
            }
        }, arrayList2);
    }

    public static EnumC1874050yrr[] values() {
        return (EnumC1874050yrr[]) LLILZ.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1874050yrr valueOf(String str) {
        return (EnumC1874050yrr) C08FF.LIZ(EnumC1874050yrr.class, str);
    }

    public final float getHeight(InterfaceC1874070yrt interfaceC1874070yrt) {
        int i = C1874060yrs.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return interfaceC1874070yrt.getBottomTabHeight();
                    }
                    throw new C1954807lC();
                }
                return interfaceC1874070yrt.getBottomBannerHeight();
            }
            return interfaceC1874070yrt.getTopTabHeight();
        }
        return interfaceC1874070yrt.getStatusBarHeight();
    }

    public final int getVisibility(int i) {
        return (i >> this.maskValue) & 1;
    }

    public EnumC1874050yrr(String str, int i, String str2, int i2, C0J35 c0j35) {
        this.LL = str2;
        this.maskValue = i2;
        this.LLILLJJLI = c0j35;
    }
}
