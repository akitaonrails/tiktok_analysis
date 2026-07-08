package X;

import Y.AObjectS116S0000000_13;
import Y.ARunnableS27S0100100_34;
import Y.ARunnableS6S1100100_34;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.engine.Session;
import com.bytedance.applog.filter.NativeFilterJNI;
import com.bytedance.applog.store.DbStore;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sdk.account.ticketguard.AccountTicketGuardHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209911BeP implements Handler.Callback, Comparator<AbstractC2209931BeR> {
    public static final List<String> LLJL = Collections.singletonList("Engine");
    public static volatile long LLJLIL = 10000;
    public final InterfaceC2209801BeE LL;
    public final Looper LLILLJJLI;
    public final C2209901BeO LLILLL;
    public final C2209571Bdr LLILZ;
    public C2209811BeF LLILZIL;
    public volatile DbStore LLIZ;
    public final C2209771BeB LLIZLLLIL;
    public volatile BPEAHandler LLJ;
    public List<AbstractC2209821BeG> LLJI;
    public final Session LLJIJIL;
    public C2210461BfI LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final C2210211Bet LLJILLL;
    public long LLJJ;
    public volatile boolean LLJJI;
    public volatile long LLJJIJI;
    public volatile AbstractC2194001Atq LLJJIJIIJIL;
    public volatile C2209741Be8 LLJJIJIL;
    public final C2194021Ats LLJJJ;
    public volatile C2210511BfN LLJJJIL;
    public final C2210141Bem LLJJJJJIL;
    public final C2210271Bez LLJJJJLIIL;
    public final C2209521Bdm LLJJL;
    public final C2210041Bec LLJJLIIIJLLLLLLLZ;
    public final ArrayList<AbstractC2209931BeR> LLILZLL = new ArrayList<>(32);
    public final ArrayList<AbstractC2209821BeG> LLJJIII = new ArrayList<>(4);
    public volatile int LLJJJJ = 0;

    public final C2210511BfN LJ() {
        if (this.LLJJJIL == null) {
            synchronized (this) {
                try {
                    C2210511BfN c2210511BfN = this.LLJJJIL;
                    if (c2210511BfN == null) {
                        c2210511BfN = new C2210511BfN(this.LLILLL, LJFF(), this.LLIZLLLIL);
                    }
                    this.LLJJJIL = c2210511BfN;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLJJJIL;
    }

    public final DbStore LJFF() {
        if (this.LLIZ == null) {
            synchronized (this) {
                try {
                    DbStore dbStore = this.LLIZ;
                    if (dbStore == null) {
                        dbStore = new DbStore(this, this.LLILZ.LIZIZ.LIZ());
                    }
                    this.LLIZ = dbStore;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLIZ;
    }

    public final List<AbstractC2209821BeG> LJI() {
        ArrayList arrayList = new ArrayList();
        C2209621Bdw c2209621Bdw = this.LLILZ.LJIIJJI;
        if (c2209621Bdw == null || !c2209621Bdw.LIZ()) {
            arrayList.add(new C2209891BeN(this));
        } else {
            for (C2209631Bdx c2209631Bdx : c2209621Bdw.LIZLLL.values()) {
                if (c2209631Bdx != null && c2209631Bdx.LIZ != 0) {
                    arrayList.add(new C2209891BeN(this, c2209631Bdx));
                }
            }
        }
        final C2201441BDy c2201441BDy = this.LLILZ.LJIILJJIL;
        if (c2201441BDy != null && c2201441BDy.LIZJ()) {
            arrayList.add(new AbstractC2209821BeG(this, c2201441BDy) { // from class: X.1BeJ
                public static final List<String> LJI = Collections.singletonList("ForwardSender");
                public final C2201441BDy LJFF;

                @Override // X.AbstractC2209821BeG
                public final String LIZLLL() {
                    return "ForwardSender";
                }

                @Override // X.AbstractC2209821BeG
                public final boolean LJFF() {
                    return true;
                }

                @Override // X.AbstractC2209821BeG
                public final long LJI() {
                    C2201441BDy c2201441BDy2 = this.LJFF;
                    return c2201441BDy2 != null ? c2201441BDy2.LIZIZ : this.LIZ.LLILZ.LIZIZ();
                }

                @Override // X.AbstractC2209821BeG
                public final long[] LJ() {
                    return AbstractC2209821BeG.LJ;
                }

                @Override // X.AbstractC2209821BeG
                public final synchronized boolean LIZJ(int i) {
                    boolean z;
                    String str;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C2209911BeP c2209911BeP = this.LIZ;
                    Session session = c2209911BeP.LLJIJIL;
                    C2209791BeD c2209791BeD = c2209911BeP.LLILLL.LJJZZI;
                    List<String> list = LJI;
                    Object[] objArr = new Object[4];
                    z = false;
                    objArr[0] = "ForwardSender";
                    objArr[1] = Long.valueOf(jCurrentTimeMillis);
                    if (session == null) {
                        str = "null";
                    } else {
                        str = session.LJIIIIZZ;
                    }
                    objArr[2] = str;
                    objArr[3] = Integer.valueOf(i);
                    c2209791BeD.LJIIIZ(0, list, "{} start doWork curTs={}, curSid={}, requestFrom={}", objArr);
                    DbStore dbStoreLJFF = this.LIZ.LJFF();
                    C2209771BeB c2209771BeB = this.LIZ.LLIZLLLIL;
                    if (c2209771BeB.LIZJ && this.LJFF != null) {
                        JSONObject jSONObjectLIZ = c2209771BeB.LIZ();
                        InterfaceC2209861BeK interfaceC2209861BeK = this.LIZ.LLILLL.LJIILLIIL;
                        if (interfaceC2209861BeK != null) {
                            try {
                                C2210791Bfp.LIZ(jSONObjectLIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PACK_ERROR_COUNT, 1);
                                this.LIZ.LLILLL.LJJJJLI.LJI("HeaderCustomTimelyCallback update header failed", th, true);
                                this.LIZ.LLILLL.LJJZZI.LJIIZILJ(LJI, "header custom callback updateHeader error", th, new Object[0]);
                            }
                        }
                        List<C2210841Bfu> listLJIL = dbStoreLJFF.LJIL();
                        if (!((ArrayList) listLJIL).isEmpty()) {
                            dbStoreLJFF.LJ(listLJIL);
                            LJII(i, listLJIL, jSONObjectLIZ);
                        }
                        z = true;
                    }
                    return z;
                }

                {
                    super(this);
                    this.LJFF = c2201441BDy;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void LJII(int i, List list, JSONObject jSONObject) {
                    int i2;
                    final boolean z;
                    boolean z2;
                    boolean z3;
                    int i3;
                    byte[] bytes;
                    if (this.LJFF == null) {
                        return;
                    }
                    Iterator it2 = ((ArrayList) list).iterator();
                    ArrayList<C2209881BeM> arrayList2 = new ArrayList();
                    final HashSet hashSet = new HashSet();
                    while (true) {
                        i2 = 2;
                        z = false;
                        z2 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        JSONArray jSONArray = new JSONArray();
                        C2209881BeM c2209881BeM = new C2209881BeM();
                        c2209881BeM.LJJIFFI(this.LIZ.LLILLL.LJIIIZ, jSONObject, null, null, null, new JSONArray[]{null, jSONArray, null}, new long[]{0, 0, 0}, null, null, i);
                        while (it2.hasNext()) {
                            AbstractC2209931BeR abstractC2209931BeR = (AbstractC2209931BeR) it2.next();
                            jSONArray.put(abstractC2209931BeR.LJIILJJIL());
                            if (!C2210111Bej.LIZIZ()) {
                                long j = abstractC2209931BeR.LLJJIII;
                                if (j > 0) {
                                    hashSet.add(Long.valueOf(j));
                                }
                            }
                            if (jSONArray.length() == 200) {
                                break;
                            }
                        }
                        c2209881BeM.LJJII();
                        arrayList2.add(c2209881BeM);
                    }
                    List<String> listLIZIZ = this.LJFF.LIZIZ();
                    if (listLIZIZ != null && !listLIZIZ.isEmpty()) {
                        z = true;
                        for (String str : listLIZIZ) {
                            C2209901BeO c2209901BeO = this.LIZ.LLILLL;
                            String strLIZ = c2209901BeO.LJ.LIZ(c2209901BeO.LJIIJ, str);
                            for (C2209881BeM c2209881BeM2 : arrayList2) {
                                C2209901BeO c2209901BeO2 = this.LIZ.LLILLL;
                                C2209651Bdz c2209651Bdz = c2209901BeO2.LJFF;
                                ConcurrentHashMap<String, String> concurrentHashMap = c2209901BeO2.LJJLIIIJJI;
                                c2209651Bdz.getClass();
                                if (c2209881BeM2 != null && !TextUtils.isEmpty(strLIZ)) {
                                    HashMap mapLIZLLL = c2209651Bdz.LIZLLL(c2209881BeM2.LLLI, c2209881BeM2.LLLII, z2);
                                    if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                                        mapLIZLLL.putAll(concurrentHashMap);
                                    }
                                    String string = UUID.randomUUID().toString();
                                    c2209651Bdz.LJII(strLIZ, string, mapLIZLLL, c2209881BeM2.LLJJJJLIIL);
                                    c2209651Bdz.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.REPORT_REQUEST_COUNT, z2 ? 1 : 0);
                                    try {
                                        C2209791BeD c2209791BeD = c2209651Bdz.LIZIZ.LJJZZI;
                                        List<String> list2 = C2209651Bdz.LIZLLL;
                                        Object[] objArr = new Object[i2];
                                        objArr[0] = string;
                                        objArr[1] = strLIZ;
                                        c2209791BeD.LJIIIZ(11, list2, "trySendForward start requestId={}, url={}", objArr);
                                        String strPost = c2209651Bdz.LIZIZ.getNetClient().post(strLIZ, mapLIZLLL, c2209881BeM2.LLJJJJLIIL);
                                        c2209651Bdz.LIZIZ.LJJZZI.LJIIIZ(11, list2, "trySendForward resp:{} ", strPost);
                                        if (TextUtils.isEmpty(strPost)) {
                                            i3 = -1;
                                        } else {
                                            i3 = 200;
                                        }
                                        if (TextUtils.isEmpty(strPost)) {
                                            bytes = null;
                                        } else {
                                            bytes = strPost.getBytes("UTF-8");
                                        }
                                        c2209651Bdz.LJI(i3, string, null, bytes);
                                        z3 = true;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c2209651Bdz.LIZIZ.LJJZZI.LJIILLIIL(11, C2209651Bdz.LIZLLL, "trySendForward failed ", th, new Object[0]);
                                        c2209651Bdz.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.REQUEST_ERROR_COUNT, 1);
                                        c2209651Bdz.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.REPORT_REQUEST_FAILED_COUNT, 1);
                                        c2209651Bdz.LIZIZ.LJJJJLI.LJI("api send forward log failed", th, true);
                                        c2209651Bdz.LJI(-1, string, "Send forward log error", null);
                                        z3 = false;
                                    }
                                } else {
                                    z3 = true;
                                }
                                z &= z3;
                                z2 = true;
                                i2 = 2;
                            }
                        }
                    }
                    final String str2 = this.LIZ.LLILLL.LJIIIZ;
                    if (!C2210111Bej.LIZIZ() && !hashSet.isEmpty()) {
                        C2210111Bej.LIZJ("event_upload_eid", new InterfaceC800590Var() { // from class: X.0otJ
                            @Override // X.InterfaceC800590Var
                            public final Object LIZ() {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("$$APP_ID", str2);
                                    JSONArray jSONArray2 = new JSONArray();
                                    Iterator it3 = hashSet.iterator();
                                    while (it3.hasNext()) {
                                        jSONArray2.put(it3.next());
                                    }
                                    jSONObject2.put("$$EVENT_LOCAL_ID_ARRAY", jSONArray2);
                                    jSONObject2.put("$$UPLOAD_STATUS", z ? "success" : "failed");
                                    return jSONObject2;
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return jSONObject2;
                                }
                            }
                        });
                    }
                }
            });
        }
        return arrayList;
    }

    public final C2210461BfI LJII() {
        if (this.LLJILJIL == null) {
            C2210461BfI c2210461BfI = this.LLILZ.LIZIZ.LJIIJJI;
            this.LLJILJIL = c2210461BfI;
            if (c2210461BfI == null) {
                this.LLJILJIL = null;
            }
        }
        return this.LLJILJIL;
    }

    public final void LIZIZ(boolean z) {
        SQLiteDatabase writableDatabase;
        C2209991BeX c2209991BeX;
        C844630XBl c844630XBl = LJII().LJ;
        C844630XBl c844630XBl2 = new C844630XBl(c844630XBl.LLILLJJLI, c844630XBl.LLILLL, c844630XBl.LLILZ, z);
        C0XCI c0xci = (C0XCI) ((C2210131Bel) this.LL).LIZIZ();
        Context contextLJ = c0xci.LJ();
        if (contextLJ != null) {
            c0xci.LJFF.LIZIZ(contextLJ).LJII(c844630XBl2);
        }
        DbStore dbStoreLJFF = LJFF();
        if (dbStoreLJFF.LJFF) {
            synchronized (dbStoreLJFF) {
                try {
                    dbStoreLJFF.LJIIL.clear();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        try {
            writableDatabase = dbStoreLJFF.LIZIZ.getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator<AbstractC2209931BeR> it2 = dbStoreLJFF.LIZJ.values().iterator();
                while (it2.hasNext()) {
                    writableDatabase.delete(it2.next().LJIIIZ(), null, null);
                }
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    dbStoreLJFF.LJII().LJIILIIL(5, "clear tables failed", th, new Object[0]);
                    dbStoreLJFF.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.DB_ERROR_COUNT, 1);
                    dbStoreLJFF.LIZ.LLILLL.LJJJJLI.LJI("clearAllTables failed", th, true);
                } catch (Throwable th2) {
                    C2200271B9l.LJFF(writableDatabase);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
        C2200271B9l.LJFF(writableDatabase);
        ArrayList<AbstractC2209931BeR> arrayList = new ArrayList<>();
        C2209991BeX c2209991BeX2 = this.LLILLL.LJIILJJIL.LLILLJJLI;
        if (c2209991BeX2 != null && (c2209991BeX = (C2209991BeX) c2209991BeX2.clone()) != null) {
            c2209991BeX.LJIIL(System.currentTimeMillis());
            c2209991BeX.LLJJJJLIIL = -1L;
            this.LLJIJIL.LJFF(c2209991BeX, arrayList, true);
            this.LLJIJIL.LIZ(c2209991BeX);
            arrayList.add(c2209991BeX);
        } else {
            this.LLJIJIL.LJFF(null, arrayList, false);
        }
        if (!arrayList.isEmpty()) {
            LJFF().LJJIII(arrayList, true);
        }
    }

    public final void LIZJ(String str) {
        InterfaceC2209801BeE interfaceC2209801BeE = this.LL;
        Application application = this.LLILLL.LJIIJ;
        C0XCI c0xci = (C0XCI) ((C2210131Bel) interfaceC2209801BeE).LIZIZ();
        c0xci.getClass();
        HashMap map = new HashMap();
        map.put("user_unique_id", str);
        c0xci.LJFF.LIZIZ(application).LJIIJ(application, map, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.util.ArrayList<X.AbstractC2209931BeR> r29) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209911BeP.LJIIJ(java.util.ArrayList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101, types: [X.1Bg7] */
    /* JADX WARN: Type inference failed for: r1v149, types: [X.0XCV] */
    /* JADX WARN: Type inference failed for: r2v69, types: [X.1BeF, java.lang.Object] */
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
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int iLIZIZ;
        InterfaceC844860XCi interfaceC844860XCi;
        long j;
        boolean z;
        SharedPreferences sharedPreferencesLIZJ;
        HashSet hashSet;
        HashMap map;
        C2194011Atr c2194011Atr;
        Map<String, ?> all;
        AbstractC2194001Atq c2193981Ato;
        if (message.what != 1) {
            BlockHelper.tryBlock();
        }
        long jLJFF = 0;
        String[] strArr = null;
        abstractC2194001Atq = null;
        abstractC2194001Atq = null;
        abstractC2194001Atq = null;
        AbstractC2194001Atq abstractC2194001Atq = null;
        switch (message.what) {
            case 1:
                this.LLJJJJ |= 1;
                C2209791BeD c2209791BeD = this.LLILLL.LJJZZI;
                List<String> list = LLJL;
                c2209791BeD.LJFF(0, list, "start bdinstall...", new Object[0]);
                if (this.LLILZ.LJ()) {
                    this.LLILLL.LJJZZI.LJFF(0, list, "start add observers to bdinstall...", new Object[0]);
                    C2210131Bel c2210131Bel = (C2210131Bel) this.LL;
                    ((C0XCI) c2210131Bel.LIZIZ()).LJII.LIZ.add(new C2210401BfC(c2210131Bel));
                    InterfaceC2209801BeE interfaceC2209801BeE = this.LL;
                    C2210831Bft c2210831Bft = new C2210831Bft(this);
                    C2210131Bel c2210131Bel2 = (C2210131Bel) interfaceC2209801BeE;
                    c2210131Bel2.getClass();
                    C2210171Bep c2210171Bep = new C2210171Bep(c2210131Bel2, c2210831Bft);
                    ((C0XCI) c2210131Bel2.LIZIZ()).LJIIIIZZ.LIZIZ(true, new C844840XCg(c2210171Bep));
                    ((C0XCI) c2210131Bel2.LIZIZ()).LIZIZ(true, c2210171Bep);
                }
                this.LLILLL.LJJZZI.LJFF(0, list, "start bdinstall service begin", new Object[0]);
                final C0XCI c0xci = (C0XCI) ((C2210131Bel) this.LL).LIZIZ();
                c0xci.LJFF.LIZIZ(c0xci.LIZ.LIZJ).start();
                C0XCI c0xci2 = C0XCJ.LIZIZ;
                InterfaceC844780XCa interfaceC844780XCa = c0xci2.LJIIIZ;
                if (interfaceC844780XCa != null && interfaceC844780XCa.LIZJ("enable_zti").booleanValue() && (interfaceC844860XCi = c0xci2.LJIIJ) != 0) {
                    interfaceC844860XCi.LIZJ(new Function0<Unit>() { // from class: X.0XCV
                        @Override // kotlin.jvm.functions.Function0
                        public final Unit invoke() {
                            C0XCI c0xci3 = c0xci;
                            c0xci3.getClass();
                            InterfaceC844780XCa interfaceC844780XCa2 = C0XCJ.LIZIZ.LJIIIZ;
                            if (interfaceC844780XCa2 != null && interfaceC844780XCa2.LIZJ("enable_zti").booleanValue()) {
                                AccountTicketGuardHelper.initTicketGuard(c0xci3.LJ(), Long.MAX_VALUE, new AObjectS116S0000000_13(2));
                            }
                            return Unit.LIZ;
                        }
                    });
                }
                this.LLILLL.LJJZZI.LJFF(0, list, "start bdinstall service end", new Object[0]);
                return true;
            case 2:
                C2209791BeD c2209791BeD2 = this.LLILLL.LJJZZI;
                List<String> list2 = LLJL;
                c2209791BeD2.LJFF(0, list2, "start to check header ready...", new Object[0]);
                if (this.LLILZ.LJ()) {
                    C2209771BeB c2209771BeB = this.LLIZLLLIL;
                    if (c2209771BeB.LIZIZ && c2209771BeB.LIZJ) {
                        this.LLJJJJ |= 8;
                        this.LLJ = new BPEAHandler(this.LLILLJJLI, this);
                        C786410Ut5.LJLILLLLZI(this.LLJ, 3);
                        if (this.LLILLL.LJJLIIIJ && this.LLILLL.LLLI() != null) {
                            this.LLILLL.LLLI().LJ();
                        }
                        if (this.LLILZLL.size() > 0) {
                            this.LLJILJILJ.removeMessages(4);
                            C786410Ut5.LJLJJI(4, 1000L, this.LLJILJILJ);
                        }
                        this.LLILLL.LJJZZI.LJFF(0, list2, "net handler start work", new Object[0]);
                        return true;
                    }
                    this.LLJILJILJ.removeMessages(2);
                    JSONObject jSONObject = new JSONObject();
                    if (((C0XCI) ((C2210131Bel) this.LL).LIZIZ()).LJFF(jSONObject)) {
                        this.LLIZLLLIL.getClass();
                        if (C2209771BeB.LJ(jSONObject)) {
                            this.LLIZLLLIL.LJII(jSONObject);
                            C786410Ut5.LJLILLLLZI(this.LLJILJILJ, 2);
                            this.LLILLL.LJJZZI.LJFF(0, list2, "net handler start work by get", new Object[0]);
                            return true;
                        }
                    }
                    C786410Ut5.LJLJJI(2, 1000L, this.LLJILJILJ);
                    this.LLILLL.LJJZZI.LJFF(0, list2, "header not ready, will check gain after 1s...", new Object[0]);
                    return true;
                }
                this.LLILLL.LJJZZI.LJ(0, list2, "workers will not start for current is not the main process!", new Object[0]);
                return true;
            case 3:
                this.LLJJJJ |= 16;
                this.LLILLL.LJJZZI.LJFF(0, LLJL, "start to build workers...", new Object[0]);
                if (this.LLILLL.LJJIJIIJIL) {
                    C1BWQ.LIZJ.LIZIZ(new Object[0]).LIZ.add(new C1BWS() { // from class: X.1Bfm
                        @Override // X.C1BWS
                        public final void LIZIZ() {
                            this.LIZ.LJIIIZ(false, null);
                        }
                    });
                }
                C2209571Bdr c2209571Bdr = this.LLILZ;
                if (c2209571Bdr.LJIILIIL.LJJLIIIJL) {
                    String string = c2209571Bdr.LJ.getString("header_custom_allow", null);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            c2209571Bdr.LJIIIZ(null, new JSONArray(string));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c2209571Bdr.LJIILIIL.LJJJJLI.LJI("parse custom header control config failed", th, true);
                        }
                    }
                    break;
                }
                if (c2209571Bdr.LJIILIIL.LJJLIIIJJIZ) {
                    String string2 = c2209571Bdr.LJ.getString("params_block", null);
                    if (!TextUtils.isEmpty(string2)) {
                        try {
                            c2209571Bdr.LJIIJ(null, new JSONObject(string2));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c2209571Bdr.LJIILIIL.LJJJJLI.LJI("parse event params control config failed", th2, true);
                        }
                    }
                    break;
                }
                if (!TextUtils.isEmpty(LJII().LIZJ)) {
                    ?? r2 = new AbstractC2209821BeG(this) { // from class: X.1BeF
                        public static final List<String> LJFF = Collections.singletonList("Configer");

                        @Override // X.AbstractC2209821BeG
                        public final String LIZLLL() {
                            return "configer";
                        }

                        @Override // X.AbstractC2209821BeG
                        public final boolean LJFF() {
                            return true;
                        }

                        @Override // X.AbstractC2209821BeG
                        public final long LJI() {
                            return this.LIZ.LLILZ.LJ.getLong("fetch_interval", 21600000L);
                        }

                        @Override // X.AbstractC2209821BeG
                        public final long[] LJ() {
                            return AbstractC2209821BeG.LJ;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(this);
                            long j2 = this.LLILZ.LJ.getLong("app_log_last_config_time", 0L);
                            this.LIZLLL = j2;
                            long j3 = this.LLILLL.LJJLL;
                            long jLJI = LJI();
                            if (j3 > 0) {
                                this.LLILLL.getClass();
                                long j4 = (C2209901BeO.LJLIL + j3) - jLJI;
                                if (j4 > this.LIZLLL) {
                                    this.LIZLLL = j4;
                                }
                            }
                            this.LLILLL.LJJZZI.LJFF(0, LJFF, "Configer firstDelay={}, interval={}, nextTime={}, newLastTime={}", Long.valueOf(j3), Long.valueOf(jLJI), Long.valueOf(this.LIZLLL));
                        }

                        @Override // X.AbstractC2209821BeG
                        public final boolean LIZJ(int i2) {
                            C2192081Aqk c2192081Aqk;
                            JSONObject jSONObjectOptJSONObject;
                            boolean zEquals;
                            boolean z2;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C2209791BeD c2209791BeD3 = this.LIZ.LLILLL.LJJZZI;
                            List<String> list3 = LJFF;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("configer");
                            sbLIZ.append(" start doWork curTs = {}");
                            c2209791BeD3.LJIIIZ(0, list3, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jCurrentTimeMillis));
                            C2209771BeB c2209771BeB2 = this.LIZ.LLIZLLLIL;
                            if (!c2209771BeB2.LIZJ) {
                                return false;
                            }
                            JSONObject jSONObjectLIZ = c2209771BeB2.LIZ();
                            InterfaceC801310Vc1 interfaceC801310Vc1 = this.LIZ.LLILLL.LJIIZILJ;
                            if (interfaceC801310Vc1 != null) {
                                try {
                                    interfaceC801310Vc1.LIZ(jSONObjectLIZ);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    this.LIZ.LLILLL.LJJZZI.LJIIZILJ(LJFF, "header custom callback updateHeaderFromLogSettings error", th3, new Object[0]);
                                    this.LIZ.LLILLL.LJJJJLI.LJI("Configer IHeaderCustomTimelyCallback updateHeaderFromLogSettings failed", th3, true);
                                }
                            }
                            C2209791BeD c2209791BeD4 = this.LIZ.LLILLL.LJJZZI;
                            List<String> list4 = LJFF;
                            c2209791BeD4.LJFF(0, list4, "doRequest start requestFrom = {}", Integer.valueOf(i2));
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("magic_tag", "ss_app_log");
                                jSONObject2.put("header", jSONObjectLIZ);
                                jSONObject2.put("_gen_time", System.currentTimeMillis());
                                JSONObject jSONObject3 = new JSONObject();
                                if (this.LIZ.LLILLL.LJJLIIIJJIZ) {
                                    jSONObject3.put("params_block_enable", 1);
                                }
                                if (this.LIZ.LLILLL.LJJLIIIJL) {
                                    jSONObject3.put("header_custom_allow_enable", 1);
                                }
                                if (jSONObject3.length() > 0) {
                                    jSONObject2.put("options", jSONObject3);
                                }
                                this.LIZ.LLILLL.LJFF.LIZIZ(jSONObject2, false);
                                C2209901BeO c2209901BeO = this.LIZ.LLILLL;
                                JSONObject jSONObjectLIZ2 = this.LIZ.LLILLL.LJFF.LIZ(C2209651Bdz.LIZJ(c2209901BeO.LJLILLLLZI(c2209901BeO.LJIIJ, this.LIZ.LJII().LIZJ, true, C0XDP.L1), C20223814Bg.LIZLLL), jSONObject2);
                                C2209911BeP c2209911BeP = this.LIZ;
                                C2209571Bdr c2209571Bdr2 = c2209911BeP.LLILZ;
                                C2210481BfK c2210481BfK = c2209911BeP.LLILLL.LJIJJ;
                                if (c2210481BfK != null) {
                                    JSONObject jSONObject4 = c2209571Bdr2.LJI;
                                    if (jSONObjectLIZ2 != null && jSONObject4 != null) {
                                        zEquals = C786410Ut5.J3(jSONObjectLIZ2).equals(C786410Ut5.J3(jSONObject4));
                                    } else {
                                        zEquals = Objects.equals(jSONObjectLIZ2, jSONObject4);
                                    }
                                    if (!zEquals) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c2210481BfK.LIZJ(jSONObjectLIZ2, z2);
                                }
                                if (jSONObjectLIZ2 != null) {
                                    c2209571Bdr2.LJI(jSONObjectLIZ2);
                                    C2209911BeP c2209911BeP2 = this.LIZ;
                                    if (c2209911BeP2.LLILZ.LIZIZ.LJJIFFI) {
                                        if (c2209911BeP2.LLILLL.LJJLIIJ) {
                                            C2209911BeP c2209911BeP3 = this.LIZ;
                                            C2209901BeO c2209901BeO2 = c2209911BeP3.LLILLL;
                                            if (jSONObjectLIZ2.has("event_list") && (jSONObjectOptJSONObject = jSONObjectLIZ2.optJSONObject("event_list")) != null) {
                                                c2192081Aqk = new C2192081Aqk(c2209901BeO2, jSONObjectOptJSONObject);
                                            } else {
                                                c2192081Aqk = null;
                                            }
                                            c2209911BeP3.LLJJIJIIJIL = c2192081Aqk;
                                        } else {
                                            C2209911BeP c2209911BeP4 = this.LIZ;
                                            C2209901BeO c2209901BeO3 = c2209911BeP4.LLILLL;
                                            c2209911BeP4.LLJJIJIIJIL = AbstractC2194001Atq.LJFF(c2209901BeO3, C1BF5.LIZIZ(c2209901BeO3, "sp_filter_name"), jSONObjectLIZ2);
                                        }
                                    }
                                    this.LIZ.LLILLL.LJJZZI.LJFF(0, list4, "Configer fetch config success", new Object[0]);
                                    this.LIZ.LLILLL.LJJZZI.LJFF(0, list4, "end doWork duration = {}, requestFrom = {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), Integer.valueOf(i2));
                                    return true;
                                }
                                this.LIZ.LLILLL.LJJZZI.LJFF(0, list4, "end doWork duration = {}, requestFrom = {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), Integer.valueOf(i2));
                                return false;
                            } catch (Throwable th4) {
                                try {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C2209791BeD c2209791BeD5 = this.LIZ.LLILLL.LJJZZI;
                                    List<String> list5 = LJFF;
                                    c2209791BeD5.LJIIZILJ(list5, "config error, requestFrom = {}", null, Integer.valueOf(i2), th4);
                                    C2209921BeQ c2209921BeQ = this.LIZ.LLILLL.LJJJJLI;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("Configer doRequest error, requestFrom = ");
                                    sbLIZ2.append(i2);
                                    c2209921BeQ.LJI(C2188811AlT.LIZIZ(sbLIZ2), th4, true);
                                    this.LIZ.LLILLL.LJJZZI.LJFF(0, list5, "end doWork duration = {}, requestFrom = {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), Integer.valueOf(i2));
                                    return false;
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    this.LIZ.LLILLL.LJJZZI.LJFF(0, LJFF, "end doWork duration = {}, requestFrom = {}", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), Integer.valueOf(i2));
                                    throw th5;
                                }
                            }
                        }
                    };
                    this.LLILZIL = r2;
                    this.LLJJIII.add(r2);
                }
                List<AbstractC2209821BeG> listLJI = LJI();
                this.LLJI = listLJI;
                this.LLJJIII.addAll(listLJI);
                this.LLILLL.LJJZZI.LJFF(0, LLJL, "{} workers prepared", Integer.valueOf(this.LLJJIII.size()));
                C2209771BeB c2209771BeB2 = this.LLIZLLLIL;
                c2209771BeB2.getClass();
                try {
                    j = c2209771BeB2.LJFF.getLong("version_code", 0L);
                    break;
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    j = c2209771BeB2.LJFF.getInt("version_code", 0);
                    c2209771BeB2.LJFF.edit().putLong("version_code", j).apply();
                }
                C844770XBz c844770XBz = ((C2210131Bel) this.LLIZLLLIL.LIZ).LIZIZ;
                if (c844770XBz != null) {
                    jLJFF = c844770XBz.LJFF();
                }
                if (j == jLJFF && TextUtils.equals(this.LLILZ.LJ.getString("channel", ""), this.LLILZ.LIZ())) {
                    if (this.LLILZ.LIZIZ.LJJIFFI) {
                        if (this.LLILLL.LJJLIIJ) {
                            this.LLJJIJIIJIL = new C2192081Aqk(this.LLILLL, null);
                        } else {
                            C2209901BeO c2209901BeO = this.LLILLL;
                            String strLIZIZ = C1BF5.LIZIZ(c2209901BeO, "sp_filter_name");
                            try {
                                z = c2209901BeO.LJJLIL;
                                if (!z) {
                                    sharedPreferencesLIZJ = C810670Vr7.LIZJ(c2209901BeO.LJIIJ, 0, strLIZIZ);
                                } else {
                                    sharedPreferencesLIZJ = null;
                                }
                                hashSet = new HashSet();
                                map = new HashMap();
                                c2194011Atr = AbstractC2194001Atq.LIZJ;
                                try {
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    c2209901BeO.LJJZZI.LJIIZILJ(null, "parseFilterFromLocal getAll error: ", th3, new Object[0]);
                                }
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                c2209901BeO.LJJZZI.LJIIZILJ(null, "parseFilterFromLocal error: ", th4, new Object[0]);
                            }
                            if (z) {
                                all = new HashMap<>();
                                c2194011Atr.LIZIZ(new Object[0]).buildNewMap(all);
                            } else {
                                all = sharedPreferencesLIZJ.getAll();
                                if (all != null) {
                                }
                                this.LLJJIJIIJIL = abstractC2194001Atq;
                            }
                            if (all.size() > 0) {
                                int i2 = 0;
                                for (Map.Entry<String, ?> entry : all.entrySet()) {
                                    if (entry != null) {
                                        String key = entry.getKey();
                                        if ("is_block".equals(key)) {
                                            if (z) {
                                                i2 = c2194011Atr.LIZIZ(new Object[0]).getInt("is_block", 0);
                                            } else {
                                                i2 = sharedPreferencesLIZJ.getInt("is_block", 0);
                                            }
                                        } else if ("events".equals(key)) {
                                            try {
                                                Set set = (Set) entry.getValue();
                                                if (set != null && set.size() > 0) {
                                                    hashSet.addAll(set);
                                                }
                                            } catch (Throwable th5) {
                                                TryCatchGuardChecker.doCheck(th5);
                                            }
                                        } else if (!TextUtils.isEmpty(key)) {
                                            HashSet hashSet2 = new HashSet();
                                            try {
                                                Set set2 = (Set) entry.getValue();
                                                if (set2 != null && set2.size() > 0) {
                                                    hashSet2.addAll(set2);
                                                }
                                            } catch (Throwable th6) {
                                                TryCatchGuardChecker.doCheck(th6);
                                            }
                                            if (hashSet2.size() > 0) {
                                                map.put(key, hashSet2);
                                            }
                                        }
                                    }
                                }
                                if (i2 > 0) {
                                    c2193981Ato = new C2193991Atp(hashSet, map);
                                } else {
                                    c2193981Ato = new C2193981Ato(hashSet, map);
                                }
                                abstractC2194001Atq = c2193981Ato;
                            }
                            this.LLJJIJIIJIL = abstractC2194001Atq;
                        }
                    }
                } else {
                    C2209811BeF c2209811BeF = this.LLILZIL;
                    if (c2209811BeF != null) {
                        c2209811BeF.LIZJ = true;
                    }
                    if (this.LLILZ.LIZIZ.LJJIFFI) {
                        if (this.LLILLL.LJJLIIJ) {
                            C2192081Aqk c2192081Aqk = new C2192081Aqk(this.LLILLL, null);
                            NativeFilterJNI.nativeClearCache(c2192081Aqk.LIZLLL);
                            c2192081Aqk.LJ = false;
                            this.LLJJIJIIJIL = null;
                        } else {
                            C2209901BeO c2209901BeO2 = this.LLILLL;
                            this.LLJJIJIIJIL = AbstractC2194001Atq.LJFF(c2209901BeO2, C1BF5.LIZIZ(c2209901BeO2, "sp_filter_name"), null);
                        }
                    }
                }
                C2210081Beg c2210081Beg = this.LLILZ.LIZIZ;
                if (c2210081Beg != null && c2210081Beg.LJJIIJ) {
                    this.LLILLL.LLLFF().LIZIZ();
                }
                this.LLJ.removeMessages(6);
                C786410Ut5.LJLILLLLZI(this.LLJ, 6);
                if (!C2210111Bej.LIZIZ()) {
                    C2210111Bej.LIZJ("start_end", new InterfaceC800590Var() { // from class: X.1BeI
                        @Override // X.InterfaceC800590Var
                        public final Object LIZ() {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("appId", this.LIZ.LLILLL.LJIIIZ);
                                jSONObject2.put("isMainProcess", this.LIZ.LLILZ.LJ());
                                return jSONObject2;
                            } catch (Throwable th7) {
                                TryCatchGuardChecker.doCheck(th7);
                                return jSONObject2;
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 4:
                LJIIIZ(false, (String[]) HandlerHook.getMessageObj(message.obj));
                return true;
            case 5:
            case BdTuring.TYPE_ECAF /* 9 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 15:
            case 16:
            default:
                this.LLILLL.LJJZZI.LJ(0, LLJL, "Not support message type", new Object[0]);
                return true;
            case 6:
                this.LLJ.removeMessages(6);
                this.LLILLL.LJJZZI.LJIIIZ(0, LLJL, "start to check worker to do...", new Object[0]);
                this.LLILZ.LIZIZ();
                this.LLILZ.LIZIZ.getClass();
                long j2 = Long.MAX_VALUE;
                for (AbstractC2209821BeG abstractC2209821BeG : this.LLJJIII) {
                    if (!(!abstractC2209821BeG.LIZ.LLILLL.LJIILL)) {
                        long jLIZ = abstractC2209821BeG.LIZ(message.arg1);
                        if (jLIZ < j2) {
                            j2 = jLIZ;
                        }
                    }
                }
                long jCurrentTimeMillis = j2 - System.currentTimeMillis();
                Message messageObtainMessage = this.LLJ.obtainMessage(6);
                messageObtainMessage.arg1 = 2;
                long jMax = Math.max(jCurrentTimeMillis, 100L);
                C786410Ut5.LJLJLJ(this.LLJ, messageObtainMessage, jMax);
                this.LLILLL.LJJZZI.LJIIIZ(0, LLJL, "post check worker task with delay: {}ms.", Long.valueOf(jMax));
                return true;
            case 7:
                this.LLILLL.LJJZZI.LJIIIZ(0, LLJL, "Terminate created", new Object[0]);
                synchronized (this.LLILZLL) {
                    try {
                        if (Session.LJIJI == null) {
                            Session.LJIJI = new C2210011BeZ() { // from class: X.1Bg7
                            };
                        }
                        Session.LJIJI.LJIIL(0L);
                        this.LLILZLL.add(Session.LJIJI);
                    } finally {
                    }
                    break;
                }
                LJIIIZ(false, null);
                return true;
            case 8:
                ArrayList<AbstractC2209931BeR> arrayList = (ArrayList) HandlerHook.getMessageObj(message.obj);
                for (AbstractC2209931BeR abstractC2209931BeR : arrayList) {
                    if (abstractC2209931BeR.LLJJ == 0) {
                        abstractC2209931BeR.LLJJ = -1;
                    }
                }
                LJFF().LJJIII(arrayList, true);
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                synchronized (this.LLILZLL) {
                    try {
                        iLIZIZ = this.LLJJLIIIJLLLLLLLZ.LIZIZ(this.LLILZLL);
                    } finally {
                    }
                    break;
                }
                this.LLILLL.LJJZZI.LJIIIZ(0, LLJL, "dump cache data count: {}", Integer.valueOf(iLIZIZ));
                C2210041Bec c2210041Bec = this.LLJJLIIIJLLLLLLLZ;
                int size = c2210041Bec.LIZIZ.size();
                if (size > 0) {
                    strArr = new String[size];
                    c2210041Bec.LIZIZ.toArray(strArr);
                    c2210041Bec.LIZIZ.clear();
                }
                LJIIIZ(false, strArr);
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                Object[] objArr = (Object[]) HandlerHook.getMessageObj(message.obj);
                String str = (String) objArr[0];
                C2209991BeX c2209991BeX = (C2209991BeX) objArr[1];
                LJIIL(10, this.LLJI);
                if (c2209991BeX == null && (c2209991BeX = this.LLILLL.LJIILJJIL.LLILLJJLI) != null) {
                    c2209991BeX = (C2209991BeX) c2209991BeX.clone();
                }
                ArrayList<AbstractC2209931BeR> arrayList2 = new ArrayList<>();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (c2209991BeX != null) {
                    long j3 = jCurrentTimeMillis2 - c2209991BeX.LLILLJJLI;
                    c2209991BeX.LJIIL(jCurrentTimeMillis2);
                    if (j3 >= 0) {
                        jLJFF = j3;
                    }
                    c2209991BeX.LLJJJJLIIL = jLJFF;
                    c2209991BeX.LLJLIL = this.LLJIJIL.LJIILL;
                    this.LLJIJIL.LIZ(c2209991BeX);
                    arrayList2.add(c2209991BeX);
                }
                LIZJ(str);
                if (c2209991BeX != null) {
                    C2209991BeX c2209991BeX2 = (C2209991BeX) c2209991BeX.clone();
                    c2209991BeX2.LJIIL(jCurrentTimeMillis2 + 1);
                    c2209991BeX2.LLJJJJLIIL = -1L;
                    C2209971BeV c2209971BeVLJFF = this.LLJIJIL.LJFF(c2209991BeX2, arrayList2, true);
                    if (c2209971BeVLJFF != null) {
                        c2209971BeVLJFF.LLJL = this.LLJIJIL.LJIILL;
                    }
                    this.LLJIJIL.LIZ(c2209991BeX2);
                    arrayList2.add(c2209991BeX2);
                }
                if (!arrayList2.isEmpty()) {
                    LJFF().LJJIII(arrayList2, true);
                }
                LJIIL(10, this.LLJI);
                return true;
            case 14:
                LJIIIZ(true, null);
                return true;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                this.LLILLL.LJJZZI.LJFF(0, LLJL, "Start to update sender workers...", new Object[0]);
                this.LLJJIII.removeAll(this.LLJI);
                List<AbstractC2209821BeG> listLJI2 = LJI();
                this.LLJI = listLJI2;
                this.LLJJIII.addAll(0, listLJI2);
                return true;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                C2210641Bfa c2210641Bfa = (C2210641Bfa) HandlerHook.getMessageObj(message.obj);
                LIZIZ(c2210641Bfa.LIZ);
                CountDownLatch countDownLatch = c2210641Bfa.LIZLLL;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    return true;
                }
                return true;
            case 19:
                C2210641Bfa c2210641Bfa2 = (C2210641Bfa) HandlerHook.getMessageObj(message.obj);
                boolean z2 = c2210641Bfa2.LIZ;
                long j4 = c2210641Bfa2.LIZJ;
                InterfaceC845020XCy interfaceC845020XCy = c2210641Bfa2.LIZIZ;
                C844630XBl c844630XBl = LJII().LJ;
                ((C0XCI) ((C2210131Bel) this.LL).LIZIZ()).LJIIIZ(this.LLILLL.LJIIJ, new C844630XBl(c844630XBl.LLILLJJLI, c844630XBl.LLILLL, c844630XBl.LLILZ, z2), j4 * 1000, interfaceC845020XCy);
                CountDownLatch countDownLatch2 = c2210641Bfa2.LIZLLL;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                    return true;
                }
                return true;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                C2210641Bfa c2210641Bfa3 = (C2210641Bfa) HandlerHook.getMessageObj(message.obj);
                long j5 = c2210641Bfa3.LIZJ;
                InterfaceC845020XCy interfaceC845020XCy2 = c2210641Bfa3.LIZIZ;
                C844630XBl c844630XBl2 = LJII().LJ;
                ((C0XCI) ((C2210131Bel) this.LL).LIZIZ()).LJIIIZ(this.LLILLL.LJIIJ, new C844630XBl(c844630XBl2.LLILLJJLI, c844630XBl2.LLILLL, c844630XBl2.LLILZ, c844630XBl2.LL), j5, interfaceC845020XCy2);
                CountDownLatch countDownLatch3 = c2210641Bfa3.LIZLLL;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                    return true;
                }
                return true;
            case 21:
                C2210641Bfa c2210641Bfa4 = (C2210641Bfa) HandlerHook.getMessageObj(message.obj);
                C844630XBl c844630XBl3 = LJII().LJ;
                C844630XBl c844630XBl4 = new C844630XBl(c844630XBl3.LLILLJJLI, c844630XBl3.LLILLL, c844630XBl3.LLILZ, c844630XBl3.LL);
                C0XCI c0xci3 = (C0XCI) ((C2210131Bel) this.LL).LIZIZ();
                Context contextLJ = c0xci3.LJ();
                if (contextLJ != null) {
                    c0xci3.LJFF.LIZIZ(contextLJ).LJII(c844630XBl4);
                }
                CountDownLatch countDownLatch4 = c2210641Bfa4.LIZLLL;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                    return true;
                }
                return true;
            case 22:
                if (HandlerHook.getMessageObj(message.obj) instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                    if (!this.LLILLL.LJJJZ()) {
                        this.LLILLL.LJJZZI.LJFF(0, LLJL, "[Task] Background session task is not enabled, isResume = {} will not work!", Boolean.valueOf(zBooleanValue));
                        return true;
                    }
                    C2210511BfN c2210511BfNLJ = LJ();
                    if (zBooleanValue) {
                        c2210511BfNLJ.getClass();
                        C0V1A.LIZJ().LIZIZ(new ARunnableS27S0100100_34(c2210511BfNLJ, System.currentTimeMillis(), 0));
                        return true;
                    }
                    c2210511BfNLJ.getClass();
                    C0V1A.LIZJ().LIZIZ(new ARunnableS27S0100100_34(c2210511BfNLJ, System.currentTimeMillis(), 1));
                    return true;
                }
                return true;
            case 23:
                if (HandlerHook.getMessageObj(message.obj) instanceof C2209991BeX) {
                    C2209991BeX c2209991BeX3 = (C2209991BeX) HandlerHook.getMessageObj(message.obj);
                    if (this.LLILLL.LJJJZ()) {
                        C2210511BfN c2210511BfNLJ2 = LJ();
                        if (c2209991BeX3.LLJJJJLIIL == -1) {
                            long j6 = c2209991BeX3.LLILLJJLI;
                            String str2 = c2209991BeX3.LLILZ;
                            c2210511BfNLJ2.getClass();
                            C0V1A.LIZJ().LIZIZ(new ARunnableS6S1100100_34(c2210511BfNLJ2, j6, str2, 0));
                            return true;
                        }
                        long j7 = c2209991BeX3.LLILLJJLI;
                        String str3 = c2209991BeX3.LLILZ;
                        c2210511BfNLJ2.getClass();
                        C0V1A.LIZJ().LIZIZ(new ARunnableS6S1100100_34(c2210511BfNLJ2, j7, str3, 1));
                        return true;
                    }
                }
                return true;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LJFF();
                List<String> list3 = C0190004e.LIZ;
                LJFF();
                LJFF();
                return true;
            case 25:
                if (this.LLILLL.LJJJJIZL && this.LLILLL.LJJJJLI.LL.LIZIZ && !TextUtils.isEmpty(LJII().LIZLLL)) {
                    this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PILED_UP_EVENT_COUNT, LJFF().LJIIIIZZ);
                    this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PILED_UP_LAUNCH_COUNT, LJFF().LJIIIZ);
                    this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PILED_UP_TERMINATE_COUNT, LJFF().LJIIJ);
                    this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.PILED_UP_PACK_COUNT, LJFF().LJIIJJI);
                    C2209921BeQ c2209921BeQ = this.LLILLL.LJJJJLI;
                    EnumC2210021Bea enumC2210021Bea = EnumC2210021Bea.PILED_UP_DB_SIZE_KB;
                    long j8 = LJFF().LIZIZ.LL;
                    if (j8 > 0) {
                        long j9 = j8 / 1024;
                        i = (int) j9;
                        if (j9 != i) {
                            throw new ArithmeticException();
                        }
                    } else {
                        i = 0;
                    }
                    c2209921BeQ.LIZIZ(enumC2210021Bea, i);
                    C2209921BeQ c2209921BeQ2 = this.LLILLL.LJJJJLI;
                    C2210451BfH c2210451BfH = new C2210451BfH();
                    C2210491BfL c2210491BfL = new C2210491BfL();
                    C2209571Bdr c2209571Bdr2 = this.LLILZ;
                    c2210491BfL.LIZ = c2209571Bdr2.LIZIZ.LIZ;
                    c2210491BfL.LIZIZ = c2209571Bdr2.LIZ();
                    C2210081Beg c2210081Beg2 = this.LLILZ.LIZIZ;
                    c2210491BfL.LIZLLL = c2210081Beg2.LJIIJ;
                    c2210491BfL.LIZJ = c2210081Beg2.LJIIL;
                    c2210491BfL.LJ = c2210081Beg2.LJIILL;
                    c2210491BfL.LJIIIZ = "5.7.17-bugfix.2";
                    c2210491BfL.LJFF = c2210081Beg2.LJJIIJ;
                    c2210491BfL.LJIIJ = C0XB1.LIZLLL(this.LLILLL.LJIIJ);
                    c2210491BfL.LJIIJJI = !C2210111Bej.LIZIZ();
                    C2210081Beg c2210081Beg3 = this.LLILZ.LIZIZ;
                    c2210491BfL.LJII = c2210081Beg3.LJIL;
                    c2210491BfL.LJIIIIZZ = c2210081Beg3.LJJIFFI;
                    c2210491BfL.LJI = c2210081Beg3.LJJIII;
                    c2210451BfH.LIZIZ = new C2210201Bes(c2210491BfL);
                    c2210451BfH.LJFF = C08UO.LJFF.LIZIZ(new Object[0]);
                    c2210451BfH.LIZJ = this.LLILZ.LIZIZ();
                    c2210451BfH.LIZLLL = this.LLILLL.getNetClient();
                    c2210451BfH.LJ = LJII().LIZLLL;
                    c2210451BfH.LIZ = this.LLILLL.LJIIJ;
                    c2210451BfH.LJI = new C2210231Bev(this);
                    c2209921BeQ2.LIZJ(new C2210161Beo(c2210451BfH));
                    return true;
                }
                this.LLILLL.LJJJJLI.LIZJ(new C2210161Beo(new C2210451BfH()));
                return true;
            case 26:
                if (HandlerHook.getMessageObj(message.obj) instanceof Boolean) {
                    LJFF().LJJIJLIJ(((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue());
                    return true;
                }
                return true;
            case 27:
                if (HandlerHook.getMessageObj(message.obj) instanceof Boolean) {
                    LJFF().LJI = ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                    return true;
                }
                return true;
            case 28:
                if (this.LLILLL.LLLI() != null) {
                    this.LLILLL.LLLI().LJ();
                    return true;
                }
                return true;
        }
    }

    public final boolean LJIIIIZZ(String str, JSONObject jSONObject) {
        C2209751Be9 c2209751Be9;
        Set<String> set;
        if (this.LLJJIJIL == null || this.LLILLL.LLLFFI() == 0) {
            return false;
        }
        C2209741Be8 c2209741Be8 = this.LLJJIJIL;
        C2189301AmG c2189301AmG = c2209741Be8.LIZ;
        if (c2209741Be8.LIZJ != null) {
            c2209751Be9 = c2209741Be8.LIZJ;
        } else {
            c2209741Be8.LIZJ = new C2209751Be9(c2209741Be8);
            c2209751Be9 = c2209741Be8.LIZJ;
        }
        for (AbstractC2189221Am8 abstractC2189221Am8 : (ArrayList) c2189301AmG.LJ) {
            abstractC2189221Am8.getClass();
            if (!TextUtils.isEmpty(str) && (((set = abstractC2189221Am8.LIZIZ) != null && set.contains(str)) || (jSONObject != null && abstractC2189221Am8.LIZIZ(str, jSONObject)))) {
                if (abstractC2189221Am8 instanceof C2189231Am9) {
                    return false;
                }
                return abstractC2189221Am8.LIZJ(c2209751Be9);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r23, java.lang.String[] r24) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209911BeP.LJIIIZ(boolean, java.lang.String[]):void");
    }

    public final void LJIIL(int i, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LJIILIIL((AbstractC2209821BeG) it2.next(), i);
            }
        }
    }

    public final void LJIILIIL(AbstractC2209821BeG abstractC2209821BeG, int i) {
        if (this.LLJ != null && abstractC2209821BeG != null) {
            abstractC2209821BeG.LIZJ = true;
            if (Looper.myLooper() == this.LLJ.getLooper()) {
                if (!(true ^ abstractC2209821BeG.LIZ.LLILLL.LJIILL)) {
                    abstractC2209821BeG.LIZ(i);
                }
            } else {
                this.LLJ.removeMessages(6);
                Message messageObtainMessage = this.LLJ.obtainMessage(6);
                messageObtainMessage.arg1 = i;
                C786410Ut5.LJLJJL(this.LLJ, messageObtainMessage);
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(AbstractC2209931BeR abstractC2209931BeR, AbstractC2209931BeR abstractC2209931BeR2) {
        long j = abstractC2209931BeR.LLILLJJLI - abstractC2209931BeR2.LLILLJJLI;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    public final void LIZLLL(ArrayList<AbstractC2209931BeR> arrayList, InterfaceC2194031Att interfaceC2194031Att, EnumC21646419na enumC21646419na) {
        if (interfaceC2194031Att.LIZIZ()) {
            return;
        }
        Iterator<AbstractC2209931BeR> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC2209931BeR next = it2.next();
            if (next instanceof C2209941BeS) {
                C2209941BeS c2209941BeS = (C2209941BeS) next;
                LJIIJJI(next, it2, interfaceC2194031Att, EnumC2192221Aqy.event_v3, enumC21646419na, c2209941BeS.LLJL, c2209941BeS.LLJJJJLIIL, c2209941BeS.LLJJL);
            } else if (next instanceof C2209961BeU) {
                C2209961BeU c2209961BeU = (C2209961BeU) next;
                LJIIJJI(next, it2, interfaceC2194031Att, EnumC2192221Aqy.event, enumC21646419na, c2209961BeU.LLJJL, c2209961BeU.LLJL, null);
            } else if (next instanceof C2209981BeW) {
                LJIIJJI(next, it2, interfaceC2194031Att, EnumC2192221Aqy.log_data, enumC21646419na, "log_data", ((C2209981BeW) next).LLJJJJLIIL, null);
            }
        }
    }

    public final void LIZ(boolean z, int i, long j, InterfaceC845020XCy interfaceC845020XCy) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Message messageObtainMessage = this.LLJILJILJ.obtainMessage(i);
        C2210641Bfa c2210641Bfa = new C2210641Bfa();
        c2210641Bfa.LIZ = z;
        c2210641Bfa.LIZIZ = interfaceC845020XCy;
        c2210641Bfa.LIZJ = j;
        c2210641Bfa.LIZLLL = countDownLatch;
        messageObtainMessage.obj = c2210641Bfa;
        C786410Ut5.LJLJJL(this.LLJILJILJ, messageObtainMessage);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LJJZZI.LJIIZILJ(LLJL, "clearOrResetWhenSwitchChildMode interrupted", e, new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.085o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ats] */
    public C2209911BeP(final C2209901BeO c2209901BeO, C2209571Bdr c2209571Bdr, C2209771BeB c2209771BeB, C2210131Bel c2210131Bel, C2210041Bec c2210041Bec, C2210271Bez c2210271Bez) {
        this.LLILLL = c2209901BeO;
        this.LLILZ = c2209571Bdr;
        c2209571Bdr.LJIILL = this;
        this.LLIZLLLIL = c2209771BeB;
        this.LLJJLIIIJLLLLLLLZ = c2210041Bec;
        this.LLJIJIL = new Session(this);
        this.LL = c2210131Bel;
        this.LLJJJ = new InterfaceC2194031Att(c2209901BeO) { // from class: X.1Ats
            public final C2209901BeO LIZ;

            @Override // X.InterfaceC2194031Att
            public final boolean LIZIZ() {
                this.LIZ.getClass();
                return true;
            }

            {
                this.LIZ = c2209901BeO;
            }

            @Override // X.InterfaceC2194031Att
            public final boolean LIZ(EnumC2192221Aqy enumC2192221Aqy, String str, String str2, JSONObject jSONObject) {
                this.LIZ.getClass();
                return false;
            }
        };
        this.LLJJJJLIIL = c2210271Bez;
        String str = c2209901BeO.LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bd_tracker_w:");
        sbLIZ.append(str);
        HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
        handlerThread.start();
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        this.LLJILJILJ = bPEAHandler;
        this.LLJILLL = new C2210211Bet(bPEAHandler, new C2210501BfM(this));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bd_tracker_n:");
        sbLIZ2.append(str);
        HandlerThread handlerThread2 = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ2));
        handlerThread2.start();
        Looper looperW2 = C786410Ut5.W2(handlerThread2);
        this.LLILLJJLI = looperW2;
        C844630XBl c844630XBl = LJII().LJ;
        c2210131Bel.getClass();
        C2210081Beg c2210081Beg = c2209571Bdr.LIZIZ;
        c2210131Bel.LIZJ = new C1BA2(c2210131Bel.LIZLLL, c2210131Bel.LIZIZ());
        if (!c2210131Bel.LJFF.isEmpty()) {
            c2210131Bel.LIZJ.LIZ(c2210131Bel.LJFF);
            c2210131Bel.LJFF.clear();
        }
        final BPEAHandler bPEAHandler2 = new BPEAHandler(looperW2);
        C2210991Bg9 c2210991Bg9 = new C2210991Bg9();
        c2210991Bg9.LIZ = new Executor() { // from class: X.085o
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (bPEAHandler2.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    C786410Ut5.LJJZZIII(bPEAHandler2, runnable);
                }
            }
        };
        c2210991Bg9.LIZIZ = looperW2;
        InterfaceC844530XBb interfaceC844530XBbLIZIZ = c2210131Bel.LIZIZ();
        String str2 = c2210081Beg.LIZ;
        interfaceC844530XBbLIZIZ.getClass();
        ExecutorC20610085o executorC20610085o = c2210991Bg9.LIZ;
        if (executorC20610085o != null) {
            ((ConcurrentHashMap) C824170WUt.LIZ).put(str2, executorC20610085o);
        }
        Looper looper = c2210991Bg9.LIZIZ;
        if (looper != null) {
            ((ConcurrentHashMap) C824170WUt.LIZJ).put(str2, looper);
        }
        C2210711Bfh c2210711Bfh = new C2210711Bfh(c2210131Bel);
        c2210131Bel.LIZLLL.LLLII();
        C0XC1 c0xc1 = c2210131Bel.LIZ;
        c0xc1.LJIIIIZZ = c2210131Bel.LIZLLL.LJIIJ;
        c0xc1.LJJII = null;
        c0xc1.LIZJ = c2210081Beg.LJIJJLI;
        c0xc1.LJI = CastIntegerProtector.parseInt(c2210081Beg.LIZ);
        c0xc1.getClass();
        c0xc1.LJIL = c2210081Beg.LIZLLL;
        c0xc1.LJJ = c2210081Beg.LJFF;
        c0xc1.LJIILLIIL = c2210081Beg.LJIIJ;
        c0xc1.LIZ = c2210711Bfh;
        c0xc1.LJIIZILJ = c2210081Beg.LIZJ;
        c0xc1.LJIJ = c2210081Beg.LJIILIIL;
        c0xc1.LIZLLL = c2210081Beg.LJII;
        c0xc1.LJJIII = c2210081Beg.LJJIII;
        c0xc1.LJIJJ = c2210081Beg.LJJII;
        c0xc1.LJFF = c2210131Bel.LIZLLL.LJIL;
        c0xc1.LJJIFFI = null;
        final C2209901BeO c2209901BeO2 = c2210131Bel.LIZLLL;
        c0xc1.LJII = new InterfaceC23070092e(c2209901BeO2) { // from class: X.1Be0
            public final C2209901BeO LIZ;

            {
                this.LIZ = c2209901BeO2;
            }

            public final void LIZJ(String str3, String str4) {
                if (C2210111Bej.LIZIZ()) {
                    return;
                }
                if (C2200271B9l.LJII(str4)) {
                    try {
                        this.LIZ.LJFF.LJI(200, str3, null, str4.getBytes("UTF-8"));
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                this.LIZ.LJFF.LJI(-1, str3, "BDInstall get response empty", null);
            }

            @Override // X.InterfaceC23070092e
            public final String get(String str3, Map<String, String> map) {
                String string;
                if (C2210111Bej.LIZIZ()) {
                    string = "";
                } else {
                    string = UUID.randomUUID().toString();
                    this.LIZ.LJFF.LJIIIIZZ(str3, string, null, 0, map);
                }
                String str4 = this.LIZ.getNetClient().get(str3, map);
                LIZJ(string, str4);
                return str4;
            }

            @Override // X.InterfaceC23070092e
            public final byte[] LIZ(String str3, Map map, byte[] bArr) {
                String str4;
                String strLIZIZ = LIZIZ(str3, map, bArr);
                byte[] bArrLIZ = this.LIZ.getNetClient().LIZ(str3, map, bArr);
                if (bArrLIZ != null) {
                    str4 = new String(bArrLIZ);
                } else {
                    str4 = "";
                }
                LIZJ(strLIZIZ, str4);
                return bArrLIZ;
            }

            public final String LIZIZ(String str3, Map map, byte[] bArr) {
                if (C2210111Bej.LIZIZ()) {
                    return "";
                }
                String string = UUID.randomUUID().toString();
                this.LIZ.LJFF.LJII(str3, string, map, bArr);
                return string;
            }

            @Override // X.InterfaceC23070092e
            public final String post(String str3, Map map, byte[] bArr) {
                boolean zLJI = MethodIDManager.LJI(137673);
                String strLIZIZ = LIZIZ(str3, map, bArr);
                String strPost = this.LIZ.getNetClient().post(str3, map, bArr);
                LIZJ(strLIZIZ, strPost);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return strPost;
            }
        };
        c0xc1.LJIILL = c2210081Beg.LJIILLIIL;
        c0xc1.LJIILIIL = c2210081Beg.LJIILJJIL;
        c0xc1.LJIIJJI = c2210081Beg.LJIIL;
        c0xc1.LJIILJJIL = c2210081Beg.LJIILL;
        c0xc1.LJIIL = c2210081Beg.LJIIZILJ;
        c0xc1.LJIJI = c2210081Beg.LJIIIZ;
        c0xc1.LIZIZ = false;
        c0xc1.LJIIIZ = c2210081Beg.LJJI;
        c0xc1.LJIIJ = c2210081Beg.LJIJ;
        C2123908Tt.LIZIZ = Boolean.valueOf(c2209571Bdr.LJ());
        c0xc1.LJ = c2210131Bel.LIZJ;
        c0xc1.LJJIIJZLJL = c2210081Beg.LJIJJ;
        c0xc1.LJJIIZ = null;
        c0xc1.LJJIIJ = c2210081Beg.LJJIIJZLJL;
        c0xc1.LJJIIZI = c2210081Beg.LJJIIZ;
        synchronized (C2210131Bel.class) {
            try {
                C844770XBz c844770XBzLIZ = c2210131Bel.LIZ.LIZ();
                ((C0XCI) c2210131Bel.LIZIZ()).LJIIIIZZ(c844770XBzLIZ, c844630XBl);
                c2210131Bel.LIZ = null;
                c2210131Bel.LIZIZ = c844770XBzLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c2209901BeO.LJJLJLI) {
            this.LLJJL = new C2209521Bdm(c2209901BeO, looperW2, Session.LIZLLL());
        } else {
            this.LLJJL = null;
        }
        this.LLJJJJJIL = new C2210141Bem(c2209901BeO, looperW2);
        if (c2209901BeO.LLLFFI() > 0) {
            this.LLJJIJIL = new C2209741Be8(this, C2189291AmF.LIZJ(c2209901BeO.LJIIJ, C1BF5.LIZIZ(c2209901BeO, "sampling_list")));
        }
        if (c2209571Bdr.LIZIZ.LIZIZ) {
            this.LLJJI = true;
            C786410Ut5.LJLILLLLZI(bPEAHandler, 1);
            C786410Ut5.LJLJJI(2, 200L, bPEAHandler);
        }
        C786410Ut5.LJLILLLLZI(bPEAHandler, 25);
        C786410Ut5.LJLILLLLZI(bPEAHandler, 10);
        c2209571Bdr.LIZIZ.getClass();
        if (c2209901BeO.LJJJI && AppLog.getInstance() == c2209901BeO) {
            C786410Ut5.LJLJJI(24, 10000L, bPEAHandler);
        }
    }

    public final void LJIIJJI(AbstractC2209931BeR abstractC2209931BeR, Iterator<AbstractC2209931BeR> it2, InterfaceC2194031Att interfaceC2194031Att, EnumC2192221Aqy enumC2192221Aqy, EnumC21646419na enumC21646419na, String str, String str2, JSONObject jSONObject) {
        if (interfaceC2194031Att.LIZ(enumC2192221Aqy, str, str2, jSONObject)) {
            it2.remove();
            if (abstractC2209931BeR.LLJJIJIIJIL > 0) {
                C2210101Bei.LIZIZ(this.LLILLL.LJJJJLI, enumC21646419na, abstractC2209931BeR);
            }
            this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.FILTER_DROP_EVENT_COUNT, 1);
            if (interfaceC2194031Att instanceof C2209741Be8) {
                this.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.SAMPLING_DROP_EVENT_COUNT, 1);
                C2210331Bf5.LJ.LIZIZ(EnumC2210371Bf9.InterruptionSampling, abstractC2209931BeR.LJI());
            } else {
                C2210331Bf5.LJ.LIZIZ(EnumC2210371Bf9.InterruptionEventList, abstractC2209931BeR.LJI());
            }
            this.LLILLL.LJJZZI.LJIIIZ(0, LLJL, "event:{} is match filter:{} drop!", str, interfaceC2194031Att);
        }
    }
}
