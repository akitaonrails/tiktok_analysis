package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0OPX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPX {
    public static final long LIZ() {
        return AbstractC19994813Le.Default.nextLong(Long.MIN_VALUE, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, java.lang.String] */
    public static String LJ(Bundle bundle) {
        boolean z;
        C259800zU c259800zU = new C259800zU();
        String str = "";
        c259800zU.element = "";
        if (bundle != null) {
            ?? string = bundle.getString("bulletin_board_id", "");
            c259800zU.element = string;
            if (string == 0 || Intrinsics.LJFF(string, "")) {
                Long lValueOf = Long.valueOf(bundle.getLong("bulletin_board_id"));
                if (lValueOf.longValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                T t = str;
                if (Boolean.valueOf(z).booleanValue()) {
                    String string2 = lValueOf.toString();
                    t = str;
                    if (string2 != null) {
                        t = string2;
                    }
                }
                c259800zU.element = t;
            }
        }
        return (String) c259800zU.element;
    }

    public static final void LJII(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("bulletin_board", str);
    }

    public static final void LJIIIIZZ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("bulletin_board", str);
    }

    public static final void LJIIIZ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("bulletin_hybrid", str);
    }

    public static final void LJIIJ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ("bulletin_hybrid", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[PHI: r1
      0x0022: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:12:0x0020, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJIILLIIL(java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV> r5) {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            if (r5 == 0) goto L3b
            java.util.Iterator r3 = r5.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV) r0
            java.lang.String r2 = ""
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.key
            if (r1 != 0) goto L22
        L1f:
            r1 = r2
            if (r0 == 0) goto L27
        L22:
            java.lang.String r0 = r0.value
            if (r0 == 0) goto L27
            r2 = r0
        L27:
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb
            r4.put(r1, r2)
            goto Lb
        L3b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OPX.LJIILLIIL(java.util.List):java.util.Map");
    }

    public static long LIZLLL(Bundle bundle, String str) {
        Long lLJIILIIL;
        if (bundle == null) {
            return 0L;
        }
        long j = bundle.getLong(str, 0L);
        if (j == 0) {
            String string = bundle.getString(str, String.valueOf(0L));
            if (string == null || (lLJIILIIL = C2095008Iq.LJIILIIL(string)) == null) {
                return 0L;
            }
            return lLJIILIIL.longValue();
        }
        return j;
    }

    public static String LJFF(int i, long j) {
        try {
            Locale locale = Locale.getDefault();
            return u.LJJIFFI(C20642515q3.LJ(i, Math.max((int) j, 1), Long.valueOf(j)), C786410Ut5.k4(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)), String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28)), false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static void LJIIJJI(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page lifecycle - pageName: [");
        sbLIZ.append(str);
        sbLIZ.append("], lifecycle: [");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILJJIL(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page router - pageName: [");
        sbLIZ.append(str);
        sbLIZ.append("], routerInfo: ");
        sbLIZ.append(str2);
        C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIZILJ(Fragment fragment, String str) {
        if (fragment == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    public static final void LIZJ(List<BulletinBaseItem> list, BulletinBaseItem bulletinBaseItem, Function1<? super Integer, Unit> function1) {
        int iIndexOf;
        String string = null;
        if (bulletinBaseItem != null) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (bulletinBaseItem.areItemTheSame((BulletinBaseItem) next)) {
                    if (next != null && (iIndexOf = arrayList.indexOf(next)) != -1) {
                        function1.invoke(Integer.valueOf(iIndexOf));
                        return;
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find oldItem: ");
        if (bulletinBaseItem != null) {
            string = bulletinBaseItem.toString();
        }
        sbLIZ.append(string);
        LJII(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJI(Context context, int i, String str) {
        if (i == 2) {
            return context.getString(2131825152, str);
        }
        if (i > 2) {
            return context.getString(2131825153, str, Integer.valueOf(i - 1));
        }
        return context.getString(2131835475, str);
    }

    public static final void LJIILIIL(String str, String str2, String str3) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network - api: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: [");
        sbLIZ.append(str2);
        sbLIZ.append("], content: ");
        sbLIZ.append(str3);
        C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIIL(String str, String str2, String str3, String str4) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publish - publishType: [");
        sbLIZ.append(str);
        sbLIZ.append("], contentType: [");
        sbLIZ.append(str2);
        sbLIZ.append("] status: [");
        sbLIZ.append(str3);
        sbLIZ.append("], content: ");
        sbLIZ.append(str4);
        C1720106oR.LJI("bulletin_board", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILL(kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C0OPY
            if (r0 == 0) goto L2a
            r5 = r9
            X.0OPY r5 = (X.C0OPY) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L30
            if (r0 == r2) goto L30
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2a:
            X.0OPY r5 = new X.0OPY
            r5.<init>(r9)
            goto L12
        L30:
            kotlin.jvm.functions.Function1 r8 = r5.LL
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L67
            goto L70
        L36:
            X.C155000ia.LIZIZ(r4)
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L67
            r0.getClass()     // Catch: java.lang.Exception -> L67
            X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L67
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L48
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L67
            r0 = 0
        L4d:
            if (r0 != 0) goto L5c
            if (r7 == 0) goto L70
            r5.LL = r8     // Catch: java.lang.Exception -> L67
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r7.invoke(r5)     // Catch: java.lang.Exception -> L67
            if (r0 != r3) goto L70
            return r3
        L5c:
            r5.LL = r8     // Catch: java.lang.Exception -> L67
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r6.invoke(r5)     // Catch: java.lang.Exception -> L67
            if (r0 != r3) goto L70
            return r3
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r8 == 0) goto L70
            r8.invoke(r0)
        L70:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OPX.LJIILL(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public static void LIZIZ(User user, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i) {
        String str5;
        String str6;
        if ((i & 2) != 0) {
            str = "bulletin_board_page";
        }
        String str7 = "";
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJJLIIJ = user.getUid();
        c735410St1.LIZLLL = str;
        c735410St1.LJJLIIIJILLIZJL = str2;
        C1365450ldX.LIZLLL(c735410St1, user);
        c735410St1.LJZ = str5;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (str6 = matchedFriendStruct.recType) != null) {
            str7 = str6;
        }
        c735410St1.LJIJJ = str7;
        c735410St1.LLIIII = str4;
        if (bool != null) {
            bool.booleanValue();
            c735410St1.LLIIIILZ = bool.booleanValue() ? 1 : 0;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            c735410St1.LLIIIJ = !Intrinsics.LJFF(bool2, Boolean.TRUE) ? 1 : 0;
        }
        c735410St1.LJIILJJIL();
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", user.getUid());
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("extra_previous_page_position", "card_head");
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        smartRouteBuildRoute.withParam("extra_from_pre_page", str3);
        smartRouteBuildRoute.open();
    }
}
