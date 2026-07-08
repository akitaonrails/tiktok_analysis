package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIE {
    public static final String LIZ(C0SJF c0sjf) {
        StringBuilder sb = new StringBuilder();
        c0sjf.LIZLLL(new C0SIU(sb));
        return sb.toString();
    }

    public static final boolean LIZIZ(C0SJL<C719000SIg> c0sjl) {
        if (c0sjl instanceof C0SJE) {
            return true;
        }
        if (!(c0sjl instanceof C0SJK)) {
            return false;
        }
        List<C0SJL<C719000SIg>> list = ((C0SJK) c0sjl).LLJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C0SJL<C719000SIg> c0sjl2 : list) {
            if ((c0sjl2 instanceof C0SJK) && LIZIZ(c0sjl2)) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZJ(C0SJL<C719000SIg> c0sjl, int i, int i2, Function1<Object, Unit> function1) {
        float f;
        TextExtraStruct textExtraStruct;
        List<Object> list = c0sjl.LLIZLLLIL;
        list.clear();
        C0R68.LIZ.getClass();
        if (C0R68.LIZ() != 0) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        C719000SIg c719000SIg = c0sjl.LLIZ;
        if (c719000SIg != null) {
            textExtraStruct = c719000SIg.LIZ;
        } else {
            textExtraStruct = null;
        }
        C0HD1 c0hd1 = new C0HD1(f, i, textExtraStruct);
        c0hd1.LLILZ = function1;
        list.add(c0hd1);
        list.add(new C444920HcY(i2, true));
    }

    public static final void LIZLLL(C0SJF c0sjf, final Context context, final float f, final Aweme aweme, final String str, final C0SF1 c0sf1, final Integer num) {
        c0sjf.LIZLLL(new C0SJU(C1697810uHb.LJIIJJI(new C0SJV() { // from class: X.0SIH
            @Override // X.C0SJV
            public final void LIZ(C0SJL<C719000SIg> c0sjl) {
                TextExtraStruct textExtraStruct;
                C719000SIg c719000SIg = c0sjl.LLIZ;
                if (c719000SIg != null && (textExtraStruct = c719000SIg.LIZ) != null) {
                    List<Object> list = c0sjl.LLIZLLLIL;
                    Context context2 = context;
                    float f2 = f;
                    String str2 = str;
                    Aweme aweme2 = aweme;
                    Integer num2 = num;
                    Function1<Object, Unit> function1 = c0sf1;
                    list.clear();
                    C0HD1 c0hd1 = new C0HD1(0.0f, 0, textExtraStruct);
                    c0hd1.LLILZ = function1;
                    list.add(c0hd1);
                    if (aweme2 != null) {
                        AwemeExtKt.isAdTraffic(aweme2);
                    }
                    list.add(C0SIM.LIZJ(context2, f2, textExtraStruct, str2, num2));
                }
            }

            @Override // X.C0SJV
            public final boolean LIZIZ(C0SJL<C719000SIg> c0sjl) {
                C719000SIg c719000SIg = c0sjl.LLIZ;
                if (c719000SIg != null && c719000SIg.LIZ()) {
                    String strLIZ = c0sjl.LIZ();
                    TextExtraStruct textExtraStruct = c719000SIg.LIZ;
                    if (strLIZ.length() != 0) {
                        if ((textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && strLIZ.charAt(0) == '@')) || C11VF.LIZIZ.LJ(textExtraStruct)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }, new C0SJV() { // from class: X.0SIF
            @Override // X.C0SJV
            public final void LIZ(C0SJL<C719000SIg> c0sjl) {
                TextExtraStruct textExtraStruct;
                int iIntValue;
                int iIntValue2;
                String aid;
                C719000SIg c719000SIg = c0sjl.LLIZ;
                if (c719000SIg != null && (textExtraStruct = c719000SIg.LIZ) != null) {
                    List<Object> list = c0sjl.LLIZLLLIL;
                    Context context2 = context;
                    Integer num2 = num;
                    Function1<Object, Unit> function1 = c0sf1;
                    list.clear();
                    C0HD1 c0hd1 = new C0HD1(0.0f, 0, textExtraStruct);
                    c0hd1.LLILZ = function1;
                    list.add(c0hd1);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = R.attr.eh;
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, context2);
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    list.add(new ForegroundColorSpan(iIntValue2));
                    C0SIZ c0siz = C0SIZ.LIZ;
                    Aweme aweme2 = aweme;
                    if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                        aid = "";
                    }
                    c0siz.getClass();
                    C0SIZ.LIZ(textExtraStruct, aid);
                }
            }

            @Override // X.C0SJV
            public final boolean LIZIZ(C0SJL<C719000SIg> c0sjl) {
                C719000SIg c719000SIg = c0sjl.LLIZ;
                if (c719000SIg != null && c719000SIg.LIZ()) {
                    TextExtraStruct textExtraStruct = c719000SIg.LIZ;
                    if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        })));
    }
}
