package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PXB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXB {
    public static final C0PXB LIZ = new C0PXB();

    public static String LIZ(C0PVX c0pvx) {
        C0PXE c0pxe;
        boolean zBooleanValue;
        String str;
        String str2;
        Object c098200Yq;
        String string;
        Boolean bool;
        ISearchContextAbility iSearchContextAbilityLIZJ;
        C0PCY<C0PYD> c0pcyY30;
        C0PYD c0pyd;
        Aweme aweme = c0pvx.LLILLJJLI.getAweme();
        Object obj = null;
        if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null && (c0pcyY30 = iSearchContextAbilityLIZJ.Y30()) != null && (c0pyd = (C0PYD) c0pcyY30.LIZJ()) != null) {
            c0pxe = c0pyd.LLILZ;
        } else {
            c0pxe = null;
        }
        if (c0pxe != null && (bool = c0pxe.LIZ) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        String string2 = C308620C7w.LIZ().toString();
        C443120HZe c443120HZeLIZIZ = LIZIZ(aweme, null);
        String str3 = "";
        if (!Intrinsics.LJFF(c0pvx.LL.wordType, "2")) {
            str = "";
        } else {
            str = "hot";
        }
        if (zBooleanValue) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String strValueOf = String.valueOf(((Number) c443120HZeLIZIZ.getFirst()).intValue());
        Word word = c0pvx.LL.wordRecord;
        if (word != null && (string = Integer.valueOf(word.getWordPosition()).toString()) != null) {
            str3 = string;
        }
        C653750Pkb c653750Pkb = new C653750Pkb(str, str2, string2, strValueOf, str3, String.valueOf(((Number) c443120HZeLIZIZ.getSecond()).intValue()));
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(c653750Pkb);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[PHI: r0
      0x00f7: PHI (r0v28 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v27 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v92 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:34:0x00ce, B:41:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, X.C443120HZe r16) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PXB.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0HZe):X.0HZe");
    }
}
