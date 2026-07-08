package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS320S0000000_32;

/* JADX INFO: renamed from: X.17zY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21211017zY {
    public static volatile C1097680efe LIZIZ;
    public static volatile C1537720q7O LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile InterfaceC1541990qEH LJ;
    public static volatile String LJFF;
    public static volatile long LJI;
    public static volatile long LJII;
    public static final C21211017zY LIZ = new C21211017zY();
    public static final Set<String> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZ() {
        if (LIZLLL) {
            return;
        }
        C1546510qLZ c1546510qLZ = new C1546510qLZ();
        c1546510qLZ.LIZ = true;
        c1546510qLZ.LJFF = "ec_anchor_shop_bag_biz";
        c1546510qLZ.LIZLLL = 1;
        c1546510qLZ.LJIIL = Collections.singletonList("reactl");
        c1546510qLZ.LJIILIIL = C13BV.INSTANCE;
        c1546510qLZ.LJIIIZ = AFwS320S0000000_32.get$arr$(2);
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        Boolean bool = Boolean.FALSE;
        c1546500qLY.getClass();
        C1546500qLY.LJI(c1546510qLZ, bool);
        LIZLLL = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean LIZIZ(String str) {
        Object obj;
        String string;
        if (str.length() == 0 || !LIZLLL) {
            return false;
        }
        String str2 = str;
        if (C21211217za.LIZ().crossPageReuseEnabled) {
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            str2 = str;
            if (iUserService != null) {
                String currentUserID = iUserService.getCurrentUserID();
                str2 = str;
                if (currentUserID != null) {
                    str2 = str;
                    if (currentUserID.length() != 0) {
                        try {
                            Uri uri = UriProtector.parse(str);
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                                string = str;
                            } else {
                                Uri.Builder builderQuery = uri.buildUpon().query(null);
                                for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                                    Iterator<String> it2 = UriProtector.getQueryParameters(uri, str3).iterator();
                                    while (it2.hasNext()) {
                                        builderQuery.appendQueryParameter(str3, it2.next());
                                    }
                                }
                                builderQuery.appendQueryParameter("user_id", currentUserID);
                                string = builderQuery.build().toString();
                            }
                            C189200o6.m2constructorimpl(string);
                            obj = string;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj = c098200Yq;
                        }
                        Object obj2 = str;
                        if (!C189200o6.m7isFailureimpl(obj)) {
                            obj2 = obj;
                        }
                        str2 = (String) obj2;
                    }
                }
            }
        }
        if (C1546560qLe.LIZ.LJ(str2, "ec_anchor_shop_bag_biz") != null) {
            return true;
        }
        return false;
    }

    public static void LJ(InterfaceC1541990qEH interfaceC1541990qEH) {
        LJ = interfaceC1541990qEH;
        if (LJI > 0 && LJII != LJI) {
            interfaceC1541990qEH.U0(C2097908Jt.LIZJ(new Pair("shopping_list_datas", C2097908Jt.LIZJ(new Pair("start_click_time", Long.valueOf(LJI))))));
            LJII = LJI;
            interfaceC1541990qEH.LIZ("globalPropsUpdated", null);
        }
        String str = LJFF;
        if (str != null) {
            LIZ.getClass();
            LIZJ(interfaceC1541990qEH, str);
            LJFF = null;
        }
    }

    public static void LJFF(String str) {
        InterfaceC1105930esx interfaceC1105930esx;
        LJFF = str;
        if (str == null) {
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = LJ;
        if ((interfaceC1541990qEH instanceof InterfaceC1105930esx) && (interfaceC1105930esx = (InterfaceC1105930esx) interfaceC1541990qEH) != null && interfaceC1105930esx.LIZIZ()) {
            LIZ.getClass();
            LIZJ((InterfaceC1541990qEH) interfaceC1105930esx, str);
            LJFF = null;
            return;
        }
        C1537720q7O c1537720q7O = LIZJ;
        if (c1537720q7O != null && c1537720q7O.LIZIZ()) {
            LIZ.getClass();
            LIZJ(c1537720q7O, str);
            LJFF = null;
        }
    }

    public static void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        interfaceC1541990qEH.updateData(C2097608Jq.LJIIIIZZ(new Pair("lru_anchor_live_bag_assemble", str), new Pair("lru_anchor_shop_bag", str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:3:0x000b, B:5:0x001c, B:7:0x002e, B:9:0x0034, B:11:0x003a, B:13:0x0040, B:29:0x0076, B:16:0x0047, B:18:0x0059, B:20:0x005f, B:25:0x006a, B:27:0x0070), top: B:39:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.String r11 = "before_live"
            java.lang.String r12 = "user_id"
            java.lang.String r9 = "room_id"
            java.lang.String r1 = "live_status"
            java.lang.String r10 = "surl"
            r8 = 0
            android.net.Uri r7 = com.bytedance.mt.protector.impl.UriProtector.parse(r13)     // Catch: java.lang.Throwable -> L7e
            android.net.Uri r6 = com.bytedance.mt.protector.impl.UriProtector.parse(r14)     // Catch: java.lang.Throwable -> L7e
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig r0 = X.C21211217za.LIZ()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.crossPageReuseEnabled     // Catch: java.lang.Throwable -> L7e
            r5 = 1
            if (r0 == 0) goto L47
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r7, r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r6, r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r7, r12)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r6, r12)     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L47
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L47
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L47
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r3)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L76
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r11)     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L76
            goto L68
        L47:
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r7, r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r6, r10)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r7, r9)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r6, r9)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L68
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L68
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r3)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L68
            if (r2 == 0) goto L68
            goto L6a
        L68:
            r5 = 0
            goto L76
        L6a:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L68
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L68
        L76:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L7e
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7e
            goto L8a
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L8a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L91
            r1 = 0
        L91:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L99
            boolean r8 = r1.booleanValue()
        L99:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21211017zY.LIZLLL(java.lang.String, java.lang.String):boolean");
    }
}
