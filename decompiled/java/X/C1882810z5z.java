package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0z5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882810z5z {
    public static final Pair<Boolean, String> LIZJ(String str) {
        boolean z;
        String str2;
        MixSparkCard mixSparkCard;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(str);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (mixSparkCard = (MixSparkCard) interfaceC1883030z6LLIZ) != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1882830z61(mixSparkCard));
            z = true;
            str2 = "{}";
        } else {
            z = false;
            str2 = "container ID error";
        }
        return new Pair<>(Boolean.valueOf(z), str2);
    }

    public static final void LJFF(String str) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1882820z60(str));
    }

    public static final void LIZ(String str, boolean z) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1882860z64(str, z));
    }

    public static final Pair<Boolean, String> LIZLLL(String str, String str2) {
        boolean z;
        String str3;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(str);
        if (interfaceC1883030z6LLIZ != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1880810z2l(interfaceC1883030z6LLIZ, str2));
            z = true;
            str3 = "{}";
        } else {
            z = false;
            str3 = "container ID error";
        }
        return new Pair<>(Boolean.valueOf(z), str3);
    }

    public static final void LJ(String str, String str2) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1883790z7Z(str, str2));
    }

    public static final Pair<Boolean, String> LJII(String str, String str2) {
        boolean z;
        String str3;
        MixSparkCard mixSparkCard;
        Object objPutIfAbsent;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(str);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (mixSparkCard = (MixSparkCard) interfaceC1883030z6LLIZ) != null) {
            mixSparkCard.LJJJIL(str2);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mixSparkCard.LLJJJJ.getValue();
            Object copyOnWriteArraySet = concurrentHashMap.get(str2);
            if (copyOnWriteArraySet == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (copyOnWriteArraySet = new CopyOnWriteArraySet()))) != null) {
                copyOnWriteArraySet = objPutIfAbsent;
            }
            ((CopyOnWriteArraySet) copyOnWriteArraySet).add(str);
            z = true;
            str3 = "register successful";
        } else {
            z = false;
            str3 = "container ID error";
        }
        return new Pair<>(Boolean.valueOf(z), str3);
    }

    public static final Pair<Boolean, String> LJI(String str, String str2, String str3) {
        boolean z;
        String str4;
        AbstractC1882890z67 abstractC1882890z67;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(str);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (abstractC1882890z67 = (AbstractC1882890z67) interfaceC1883030z6LLIZ) != null) {
            abstractC1882890z67.LJJJI(str3, str2);
            z = true;
            str4 = "{}";
        } else {
            z = false;
            str4 = "container ID error";
        }
        return new Pair<>(Boolean.valueOf(z), str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair LIZIZ(java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, boolean r7) {
        /*
            X.0z6L r2 = X.C1882840z62.LIZ(r3)
            r3 = 1
            if (r5 == 0) goto L3a
            r1 = 0
            if (r7 == 0) goto L28
            if (r2 == 0) goto L16
            X.0z3c r0 = r2.LIZJ()
            if (r0 == 0) goto L16
            X.0z5L r1 = X.C1882380z5I.LJIIIIZZ(r0)
        L16:
            java.lang.String r2 = X.C1882380z5I.LJFF(r1, r4)
            if (r2 != 0) goto L1e
        L1c:
            java.lang.String r2 = "{}"
        L1e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r0, r2)
            return r1
        L28:
            if (r2 == 0) goto L34
            X.0z3c r0 = r2.LIZJ()
            if (r0 == 0) goto L34
            X.0z5L r1 = X.C1882380z5I.LJIIIIZZ(r0)
        L34:
            X.C1882380z5I.LJI(r1, r4, r6)
            java.lang.String r2 = ""
            goto L1e
        L3a:
            if (r7 == 0) goto L5c
            int r0 = r4.length()
            if (r0 != 0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
        L44:
            if (r2 == 0) goto L1c
            X.0z3c r0 = r2.LIZJ()
            if (r0 == 0) goto L1c
            org.json.JSONObject r0 = X.C1882380z5I.LJ(r0, r1)
            java.lang.String r2 = X.C786410Ut5.J3(r0)
            if (r2 != 0) goto L1e
            goto L1c
        L57:
            java.util.List r1 = java.util.Collections.singletonList(r4)
            goto L44
        L5c:
            java.lang.String r2 = "original data only get"
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882810z5z.LIZIZ(java.lang.String, java.lang.String, boolean, java.lang.String, boolean):kotlin.Pair");
    }
}
