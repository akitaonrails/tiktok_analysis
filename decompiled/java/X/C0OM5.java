package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinReddotStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OM5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM5 {
    public static final C0OM5 BULLETIN_REDDOT_STYLE_NONE;
    public static final C0OM5 BULLETIN_REDDOT_STYLE_NUMBER;
    public static final C0OM5 BULLETIN_REDDOT_STYLE_POINT;
    public static final C0OM8 Companion;
    public static final /* synthetic */ C0OM5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static final C0OM5 fromValue(Integer num) {
        Companion.getClass();
        return C0OM8.LIZ(num);
    }

    public static InterfaceC2044707zh<C0OM5> getEntries() {
        return LLILLL;
    }

    static {
        C0OM5 c0om5 = new C0OM5("BULLETIN_REDDOT_STYLE_NONE", 0, 0);
        BULLETIN_REDDOT_STYLE_NONE = c0om5;
        C0OM5 c0om52 = new C0OM5("BULLETIN_REDDOT_STYLE_POINT", 1, 1);
        BULLETIN_REDDOT_STYLE_POINT = c0om52;
        C0OM5 c0om53 = new C0OM5("BULLETIN_REDDOT_STYLE_NUMBER", 2, 2);
        BULLETIN_REDDOT_STYLE_NUMBER = c0om53;
        C0OM5[] c0om5Arr = {c0om5, c0om52, c0om53};
        LLILLJJLI = c0om5Arr;
        LLILLL = new C2254308sP(c0om5Arr);
        Companion = new C0OM8();
    }

    public static C0OM5[] values() {
        return (C0OM5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static final C0OM5 fromString(String str) {
        Integer numLJIIJJI;
        Companion.getClass();
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return C0OM8.LIZ(Integer.valueOf(numLJIIJJI.intValue()));
        }
        return BULLETIN_REDDOT_STYLE_NONE;
    }

    public static final C0OM5 fromStruct(BulletinReddotStruct bulletinReddotStruct) {
        String str;
        Integer numLJIIJJI;
        Companion.getClass();
        if (bulletinReddotStruct != null && (str = bulletinReddotStruct.reddotStyle) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return C0OM8.LIZ(Integer.valueOf(numLJIIJJI.intValue()));
        }
        return BULLETIN_REDDOT_STYLE_NONE;
    }

    public static final boolean shouldShowReddot(BulletinReddotStruct bulletinReddotStruct) {
        C0OM5 c0om5LIZ;
        String str;
        Integer numLJIIJJI;
        Companion.getClass();
        if (bulletinReddotStruct != null && (str = bulletinReddotStruct.reddotStyle) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            c0om5LIZ = C0OM8.LIZ(Integer.valueOf(numLJIIJJI.intValue()));
        } else {
            c0om5LIZ = BULLETIN_REDDOT_STYLE_NONE;
        }
        if (c0om5LIZ != BULLETIN_REDDOT_STYLE_NONE) {
            return true;
        }
        return false;
    }

    public static C0OM5 valueOf(String str) {
        return (C0OM5) C08FF.LIZ(C0OM5.class, str);
    }

    public static final String getReddotCountText(BulletinReddotStruct bulletinReddotStruct, int i) {
        C0OM5 c0om5LIZ;
        long jLongValue;
        Long l;
        String str;
        Integer numLJIIJJI;
        Companion.getClass();
        if (bulletinReddotStruct != null && (str = bulletinReddotStruct.reddotStyle) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            c0om5LIZ = C0OM8.LIZ(Integer.valueOf(numLJIIJJI.intValue()));
        } else {
            c0om5LIZ = BULLETIN_REDDOT_STYLE_NONE;
        }
        if (c0om5LIZ != BULLETIN_REDDOT_STYLE_NUMBER) {
            return null;
        }
        if (bulletinReddotStruct != null && (l = bulletinReddotStruct.reddotCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('+');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(jLongValue);
    }

    public C0OM5(String str, int i, int i2) {
        this.LL = i2;
    }
}
