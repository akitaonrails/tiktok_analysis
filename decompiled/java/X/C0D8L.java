package X;

import android.content.Context;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D8L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D8L {
    public static List<NewUserInterestStruct> LIZ = C13BV.INSTANCE;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0086
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.List LIZ(android.content.Context r5) {
        /*
            android.content.res.AssetManager r2 = r5.getAssets()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "interest_list/interest_list_"
            r1.<init>(r0)
            X.01GW r0 = X.C0D8M.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.InputStream r1 = r2.open(r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r1, r0)
            boolean r0 = r4 instanceof java.io.BufferedReader
            if (r0 != 0) goto L36
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r0)
            r4 = r1
        L36:
            r3 = 0
            java.lang.String r2 = X.C08KC.LIZJ(r4)     // Catch: java.lang.Throwable -> L7e
            X.C2107108Nh.LIZ(r4, r3)
            com.google.gson.Gson r1 = X.C08JS.LIZIZ()
            X.04qa r0 = new X.04qa
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L59
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L5e
        L59:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
        L5e:
            java.util.Iterator r3 = r4.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct r2 = (com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct) r2
            java.lang.String r0 = r2.id
            java.lang.String r1 = LIZIZ(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L62
            r2.text = r1
            goto L62
        L7d:
            return r4
        L7e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            r3 = r1
            goto L87
        L86:
            r0 = move-exception
        L87:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D8L.LIZ(android.content.Context):java.util.List");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(Context context, String str) {
        switch (str.hashCode()) {
            case -2028215897:
                if (!str.equals("Clothing & Apparel")) {
                    return "";
                }
                return context.getString(2131837994);
            case -1963180254:
                if (!str.equals("Kollywood")) {
                    return "";
                }
                return context.getString(2131838012);
            case -1811893345:
                if (!str.equals("Sports")) {
                    return "";
                }
                return context.getString(2131838024);
            case -1797219060:
                if (!str.equals("Talent")) {
                    return "";
                }
                return context.getString(2131838025);
            case -1781830854:
                if (!str.equals("Travel")) {
                    return "";
                }
                return context.getString(2131838028);
            case -1082679165:
                if (!str.equals("Oddly Satisfying")) {
                    return "";
                }
                return context.getString(2131838020);
            case -1050401237:
                if (!str.equals("Tollywood")) {
                    return "";
                }
                return context.getString(2131838017);
            case -833750813:
                if (!str.equals("Daily Life")) {
                    return "";
                }
                return context.getString(2131837996);
            case -752113842:
                if (!str.equals("Life Hacks")) {
                    return "";
                }
                if (u.LJIJI("US", (String) C0D8M.LIZJ.getValue(), true)) {
                    return context.getString(2131838030);
                }
                return context.getString(2131837998);
            case -720253902:
                if (!str.equals("Science & Education")) {
                    return "";
                }
                return context.getString(2131838023);
            case -686144149:
                if (!str.equals("Occupation")) {
                    return "";
                }
                return context.getString(2131838019);
            case -317480538:
                if (!str.equals("Emotional")) {
                    return "";
                }
                return context.getString(2131838009);
            case -254629764:
                if (!str.equals("Motivation & Advice")) {
                    return "";
                }
                return context.getString(2131838018);
            case -210304353:
                if (!str.equals("Pop Culture")) {
                    return "";
                }
                return context.getString(2131838022);
            case -86374264:
                if (!str.equals("Fashion Accessories")) {
                    return "";
                }
                return context.getString(2131838002);
            case 66115:
                if (!str.equals("Art")) {
                    return "";
                }
                return context.getString(2131837991);
            case 67700:
                if (!str.equals("DIY")) {
                    return "";
                }
                return context.getString(2131838029);
            case 2052559:
                if (!str.equals("Auto")) {
                    return "";
                }
                return context.getString(2131837992);
            case 2195582:
                if (!str.equals("Food")) {
                    return "";
                }
                return context.getString(2131838004);
            case 2602678:
                if (!str.equals("Tech")) {
                    return "";
                }
                return context.getString(2131838026);
            case 65798035:
                if (!str.equals("Dance")) {
                    return "";
                }
                return context.getString(2131837997);
            case 66292295:
                if (!str.equals("Drama")) {
                    return "";
                }
                return context.getString(2131837999);
            case 74710533:
                if (!str.equals("Music")) {
                    return "";
                }
                return context.getString(2131838031);
            case 123562007:
                if (!str.equals("Outdoors")) {
                    return "";
                }
                return context.getString(2131838021);
            case 169588576:
                if (!str.equals("Tech & Science")) {
                    return "";
                }
                return context.getString(2131838016);
            case 400139022:
                if (!str.equals("Fitness & Health")) {
                    return "";
                }
                return context.getString(2131838003);
            case 587876755:
                if (!str.equals("Beauty & Style")) {
                    return "";
                }
                return context.getString(2131837993);
            case 807717335:
                if (!str.equals("Animals")) {
                    return "";
                }
                return context.getString(2131837990);
            case 982113085:
                if (!str.equals("Arts & Crafts")) {
                    return "";
                }
                return context.getString(2131838007);
            case 1085311376:
                if (!str.equals("Home & Garden")) {
                    return "";
                }
                return context.getString(2131838006);
            case 1298968424:
                if (!str.equals("Entertainment")) {
                    return "";
                }
                return context.getString(2131838010);
            case 1414863620:
                if (!str.equals("Home decor")) {
                    return "";
                }
                return context.getString(2131838011);
            case 1419008025:
                if (!str.equals("Bollywood")) {
                    return "";
                }
                return context.getString(2131838008);
            case 1461903030:
                if (!str.equals("Motivation")) {
                    return "";
                }
                return context.getString(2131838014);
            case 1638848318:
                if (!str.equals("Learning")) {
                    return "";
                }
                return context.getString(2131838013);
            case 1665004953:
                if (!str.equals("Nature & Wildlife")) {
                    return "";
                }
                return context.getString(2131838015);
            case 1961668532:
                if (!str.equals("DIY & Life Hacks")) {
                    return "";
                }
                return context.getString(2131837998);
            case 2024011449:
                if (!str.equals("Comedy")) {
                    return "";
                }
                return context.getString(2131837995);
            case 2096973700:
                if (!str.equals("Family")) {
                    return "";
                }
                return context.getString(2131838000);
            case 2096998767:
                if (!str.equals("Fandom")) {
                    return "";
                }
                return context.getString(2131838001);
            case 2125602895:
                if (!str.equals("Gaming")) {
                    return "";
                }
                return context.getString(2131838005);
            default:
                return "";
        }
    }
}
