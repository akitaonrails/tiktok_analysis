package X;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0iNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240250iNb {
    public static final void LIZ(List<C1240530iO3> list, String str, EnumC1240620iOC enumC1240620iOC) {
        C1240210iNX c1240210iNX;
        C1240220iNY c1240220iNY;
        int i = 0;
        for (C1240530iO3 c1240530iO3 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1240530iO3 c1240530iO32 = c1240530iO3;
                c1240530iO32.LLJILJIL = str;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c1240530iO32.LLILZIL);
                linkedHashMap.put("rank_num", String.valueOf(i));
                linkedHashMap.put("tab_name", enumC1240620iOC.getValue());
                c1240530iO32.LLILZIL = linkedHashMap;
                InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO32.LL;
                if ((interfaceC1240540iO4 instanceof C1240220iNY) && (c1240220iNY = (C1240220iNY) interfaceC1240540iO4) != null) {
                    c1240220iNY.LJIIIIZZ = c1240530iO32;
                }
                if ((interfaceC1240540iO4 instanceof C1240210iNX) && (c1240210iNX = (C1240210iNX) interfaceC1240540iO4) != null) {
                    c1240210iNX.LJIIIIZZ = c1240530iO32;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
