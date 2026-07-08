package X;

import X.InterfaceC1618170sD9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PW2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PW2<T extends InterfaceC1618170sD9<T>> {
    public static List<? extends C0PW2<?>> LJ = C13BV.INSTANCE;
    public static final ConcurrentHashMap<String, C0PWF> LJFF = new ConcurrentHashMap<>();
    public final C0PW1<T> LIZ = new C0PW1<>(new C0PWD(this));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0PWB(this));
    public final ArrayList<EnumC646250PWl> LIZJ = new ArrayList<>();
    public final C0PWE<T> LIZLLL = new C0PWE<>();

    public abstract T LIZ();

    public C0PW2() {
        LJ = C13LP.LJLILLLLZI(this, LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e9 A[Catch: Exception -> 0x0348, TryCatch #0 {Exception -> 0x0348, blocks: (B:22:0x00a6, B:24:0x00aa, B:26:0x00b4, B:27:0x00c1, B:29:0x00c6, B:36:0x00de, B:38:0x00e2, B:40:0x00ea, B:43:0x00f6, B:44:0x00fb, B:48:0x0109, B:50:0x0113, B:51:0x0120, B:53:0x0124, B:54:0x0128, B:64:0x013e, B:65:0x0144, B:70:0x014d, B:72:0x0151, B:73:0x0157, B:75:0x015b, B:77:0x015f, B:79:0x0165, B:82:0x016d, B:85:0x0173, B:88:0x017e, B:90:0x0187, B:93:0x018d, B:57:0x012f, B:59:0x0133, B:94:0x0193, B:96:0x0197, B:98:0x019b, B:99:0x019f, B:101:0x01a3, B:102:0x01ad, B:109:0x01b9, B:111:0x01bd, B:112:0x01c3, B:114:0x01c7, B:116:0x01cb, B:118:0x01d1, B:121:0x01d9, B:123:0x01dd, B:125:0x01e9, B:127:0x01f5, B:130:0x01fb, B:133:0x0208, B:136:0x0210, B:182:0x02af, B:184:0x02b9, B:185:0x02c4, B:187:0x02c8, B:189:0x02d0, B:192:0x02dd, B:142:0x0225, B:144:0x0229, B:146:0x022f, B:148:0x0235, B:150:0x023b, B:151:0x0240, B:153:0x0244, B:155:0x0248, B:157:0x024e, B:166:0x026e, B:160:0x025b, B:162:0x0261, B:164:0x0267, B:167:0x0274, B:169:0x027a, B:170:0x0283, B:172:0x0287, B:174:0x028b, B:176:0x0291, B:181:0x02a9, B:179:0x029e, B:193:0x02e5, B:195:0x02e9, B:197:0x02ef, B:199:0x02f3, B:201:0x02f7, B:203:0x0301, B:204:0x030d, B:206:0x0313, B:207:0x031c, B:209:0x0320, B:211:0x0324, B:213:0x032a, B:218:0x0342, B:216:0x0337), top: B:233:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LIZJ$redex$base(X.C0PWT r14, X.C0PWA r15) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PW2.LIZJ$redex$base(X.0PWT, X.0PWA):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb A[Catch: Exception -> 0x034a, TryCatch #0 {Exception -> 0x034a, blocks: (B:21:0x00a8, B:23:0x00ac, B:25:0x00b6, B:26:0x00c3, B:28:0x00c8, B:35:0x00e0, B:37:0x00e4, B:39:0x00ec, B:42:0x00f8, B:43:0x00fd, B:47:0x010b, B:49:0x0115, B:50:0x0122, B:52:0x0126, B:53:0x012a, B:63:0x0140, B:64:0x0146, B:69:0x014f, B:71:0x0153, B:72:0x0159, B:74:0x015d, B:76:0x0161, B:78:0x0167, B:81:0x016f, B:84:0x0175, B:87:0x0180, B:89:0x0189, B:92:0x018f, B:56:0x0131, B:58:0x0135, B:93:0x0195, B:95:0x0199, B:97:0x019d, B:98:0x01a1, B:100:0x01a5, B:101:0x01af, B:108:0x01bb, B:110:0x01bf, B:111:0x01c5, B:113:0x01c9, B:115:0x01cd, B:117:0x01d3, B:120:0x01db, B:122:0x01df, B:124:0x01eb, B:126:0x01f7, B:129:0x01fd, B:132:0x020a, B:135:0x0212, B:181:0x02b1, B:183:0x02bb, B:184:0x02c6, B:186:0x02ca, B:188:0x02d2, B:191:0x02df, B:141:0x0227, B:143:0x022b, B:145:0x0231, B:147:0x0237, B:149:0x023d, B:150:0x0242, B:152:0x0246, B:154:0x024a, B:156:0x0250, B:165:0x0270, B:159:0x025d, B:161:0x0263, B:163:0x0269, B:166:0x0276, B:168:0x027c, B:169:0x0285, B:171:0x0289, B:173:0x028d, B:175:0x0293, B:180:0x02ab, B:178:0x02a0, B:192:0x02e7, B:194:0x02eb, B:196:0x02f1, B:198:0x02f5, B:200:0x02f9, B:202:0x0303, B:203:0x030f, B:205:0x0315, B:206:0x031e, B:208:0x0322, B:210:0x0326, B:212:0x032c, B:217:0x0344, B:215:0x0339), top: B:232:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LIZJ$redex$opt(X.C0PWT r18, X.C0PWA r19) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PW2.LIZJ$redex$opt(X.0PWT, X.0PWA):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0PW3] */
    public final synchronized C0PW3 LIZIZ(final C0PWA c0pwa, final EnumC646250PWl enumC646250PWl) {
        if (!this.LIZJ.contains(enumC646250PWl)) {
            this.LIZJ.add(enumC646250PWl);
        }
        if (enumC646250PWl == EnumC646250PWl.EXTERNAL) {
            final C0PW6 c0pw6 = (C0PW6) this.LIZ.LIZLLL.getValue();
            c0pw6.getClass();
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0PW5
                public final void LIZ() {
                    try {
                        C0PW6<InterfaceC1618170sD9<Object>> c0pw62 = c0pw6;
                        c0pw62.LIZJ = (T) c0pw62.LJ.LJII(c0pw62.LIZLLL.getString(c0pw62.LIZIZ, "{}"), c0pw6.LIZ.getClass());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0PW6<InterfaceC1618170sD9<Object>> c0pw63 = c0pw6;
                        try {
                            C0Q45 c0q45 = C0Q45.COMMON;
                            EnumC664420Q4i enumC664420Q4i = EnumC664420Q4i.EVENT_TRACKING_EXTERNAL_STATE;
                            Pair[] pairArr = new Pair[4];
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            pairArr[0] = new Pair("message", message);
                            pairArr[1] = new Pair("initState", c0pw63.LIZ.getClass().getSimpleName());
                            pairArr[2] = new Pair("repoKey", c0pw63.LIZIZ);
                            pairArr[3] = new Pair("jsonDetail", c0pw63.LIZLLL.getString(c0pw63.LIZIZ, "{}"));
                            C664410Q4h.LIZIZ(c0q45, enumC664420Q4i, th, "ExternalStateCacheByKeva", C2097608Jq.LJIIIIZZ(pairArr), C2097608Jq.LJ(), "search");
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExternalStateCacheByKeva@431b.prepare$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExternalStateCacheByKeva@431b.prepare$1");
                }
            });
        }
        return new C0PCY<T>(c0pwa, enumC646250PWl, this) { // from class: X.0PW3
            public final C0PWA LIZ;
            public final EnumC646250PWl LIZIZ;
            public final C0PW2<T> LIZJ;

            @Override // X.C0PCY
            public final T LIZJ() {
                return (T) this.LIZJ.LIZ.LIZJ(this.LIZ, this.LIZIZ);
            }

            @Override // X.C0PCY
            public final void LIZ(C0PWT c0pwt) {
                C0PW4.LIZIZ(c0pwt, this.LIZ);
            }

            @Override // X.C0PCY
            public final void LIZIZ(C19719912Dl c19719912Dl, Function2 function2) {
                C0PW2<T> c0pw2 = this.LIZJ;
                synchronized (c0pw2) {
                    HashMap<String, Function2<T, C0PWT, T>> map = ((C0PW9) c0pw2.LIZIZ.getValue()).LIZ;
                    String strLIZLLL = c19719912Dl.LIZLLL();
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    map.put(strLIZLLL, new C0PWC(function2));
                    C0PW4.LIZ(c19719912Dl.LIZLLL(), c0pw2);
                }
            }

            {
                this.LIZ = c0pwa;
                this.LIZIZ = enumC646250PWl;
                this.LIZJ = this;
            }
        };
    }

    public final void LIZJ(C0PWT c0pwt, C0PWA c0pwa) {
        if (!ReDexExperimentOpt.getAbTest()) {
            LIZJ$redex$base(c0pwt, c0pwa);
        } else {
            LIZJ$redex$opt(c0pwt, c0pwa);
        }
    }
}
