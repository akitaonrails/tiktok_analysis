package X;

import android.graphics.Color;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.16Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20741616Ek implements InterfaceC1712206nA {
    public static final Map<String, Integer> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("H1_Regular", 11), new Pair("H1_Semibold", 12), new Pair("H1_Bold", 13), new Pair("H2_Regular", 21), new Pair("H2_Semibold", 22), new Pair("H2_Bold", 23), new Pair("H3_Regular", 31), new Pair("H3_Semibold", 32), new Pair("H3_Bold", 33), new Pair("H4_Regular", 41), new Pair("H4_Semibold", 42), new Pair("H4_Bold", 43), new Pair("P1_Regular", 51), new Pair("P1_Semibold", 52), new Pair("P1_Bold", 53), new Pair("P2_Regular", 61), new Pair("P2_Semibold", 62), new Pair("P2_Bold", 63), new Pair("P3_Regular", 71), new Pair("P3_Semibold", 72), new Pair("P3_Bold", 73), new Pair("SmallText1_Regular", 81), new Pair("SmallText1_Semibold", 82), new Pair("SmallText1_Bold", 83), new Pair("SmallText2_Regular", 91), new Pair("SmallText2_Semibold", 92), new Pair("SmallText2_Bold", 93), new Pair("LargeTitle_Semibold", 122), new Pair("LargeTitle_Bold", 123), new Pair("Headline_Regular", 101), new Pair("Headline_Semibold", 102), new Pair("Headline_Bold", 103), new Pair("Longform_Regular", 111), new Pair("Longform_Semibold", 112), new Pair("Longform_Bold", 113));
    public final LruCache<C206000qo, List<C880460YgO>> LIZ = new LruCache<>(LSPassThroughRecordSizeConfig.DEFAULT);
    public volatile InterfaceC830890Wid LIZIZ;

    public static int LIZJ(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
            string = "";
        }
        int color = 0;
        if (string.length() == 0) {
            return 0;
        }
        try {
            color = Color.parseColor(string);
            return color;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return color;
        }
    }

    public static C1777710wMT LIZLLL(Map map) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Object obj = map.get("textFontKey");
        if (obj == null || (string = obj.toString()) == null || string.length() <= 0) {
            string = null;
        }
        Object obj2 = map.get("textColorValue");
        if (obj2 == null || (string2 = obj2.toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        Object obj3 = map.get("textColorValueDark");
        if (obj3 == null || (string3 = obj3.toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        Object obj4 = map.get("backgroundColorValue");
        if (obj4 == null || (string4 = obj4.toString()) == null || string4.length() <= 0) {
            string4 = null;
        }
        Object obj5 = map.get("backgroundColorValueDark");
        if (obj5 == null || (string5 = obj5.toString()) == null || string5.length() <= 0) {
            string5 = null;
        }
        return new C1777710wMT(string, string2, string3, string4, string5);
    }

    public static C0Z8G LJ(C1777710wMT c1777710wMT) {
        int iIntValue;
        Integer num;
        if (c1777710wMT == null) {
            C0Z8G.Companion.getClass();
            return C881370Yhr.LIZ();
        }
        String str = c1777710wMT.LIZ;
        if (str != null && (num = LIZJ.get(str)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 72;
        }
        return new C0Z8G(iIntValue, 0, 0, LIZJ(c1777710wMT.LIZIZ), LIZJ(c1777710wMT.LIZJ), LIZJ(c1777710wMT.LIZLLL), LIZJ(c1777710wMT.LJ));
    }

    @Override // X.InterfaceC1712206nA
    public final void LIZ(InterfaceC830890Wid interfaceC830890Wid) {
        this.LIZIZ = interfaceC830890Wid;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1712206nA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C880460YgO> LIZIZ(X.C885380YoK r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20741616Ek.LIZIZ(X.0YoK, boolean):java.util.List");
    }
}
