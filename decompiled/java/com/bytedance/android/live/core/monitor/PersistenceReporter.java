package com.bytedance.android.live.core.monitor;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C190800oM;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC969400bKk;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS29S1200000_26;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PersistenceReporter implements InterfaceC969400bKk {
    public static final Keva LJIIIIZZ;
    public static final C01GW<Long> LJIIIZ;
    public final String LIZ;
    public Function1<? super JSONObject, Unit> LJ;
    public final Keva LJFF;
    public long LIZIZ = 300000;
    public long LIZJ = 2048;
    public long LIZLLL = Long.MAX_VALUE;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 30));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 31));

    static {
        new ConcurrentHashMap();
        LJIIIIZZ = Keva.getRepo("PersistenceReporter-config");
        LJIIIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(16));
    }

    public final void LIZLLL() throws JSONException {
        Companion.InnerRecord innerRecordLJII;
        Map<String, ?> all = this.LJFF.getAll();
        if (all.isEmpty()) {
            return;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            C497740JfY.LJII();
            try {
                if (!C036E.LIZ.LIZIZ()) {
                    return;
                }
                if ((entry.getValue() instanceof String) && (innerRecordLJII = LJII(entry.getKey(), String.valueOf(entry.getValue()))) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (innerRecordLJII.getCreateTimeStamp() > jCurrentTimeMillis) {
                        this.LJFF.erase(entry.getKey());
                    } else if (Math.abs(jCurrentTimeMillis - innerRecordLJII.getCreateTimeStamp()) > this.LIZLLL) {
                        this.LJFF.erase(entry.getKey());
                    } else if (innerRecordLJII.getStartID() != LJIIIZ.getValue().longValue()) {
                        if (!innerRecordLJII.getDiscardWhenNextBoot()) {
                            LJ(innerRecordLJII, false);
                        }
                        this.LJFF.erase(entry.getKey());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public final Handler LJI() {
        return (Handler) this.LJII.getValue();
    }

    public static final class Companion {

        public static final class InnerRecord {

            @C09CT("discard_next_boot")
            public boolean discardWhenNextBoot;

            @C09CT("start_id")
            public long startID = PersistenceReporter.LJIIIZ.getValue().longValue();

            @C09CT("create_time")
            public long createTimeStamp = System.currentTimeMillis();

            @C09CT("value")
            public String value = "{}";

            @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
            public int status = 1;

            public final long getCreateTimeStamp() {
                return this.createTimeStamp;
            }

            public final boolean getDiscardWhenNextBoot() {
                return this.discardWhenNextBoot;
            }

            public final long getStartID() {
                return this.startID;
            }

            public final int getStatus() {
                return this.status;
            }

            public final String getValue() {
                return this.value;
            }

            public final void setCreateTimeStamp(long j) {
                this.createTimeStamp = j;
            }

            public final void setDiscardWhenNextBoot(boolean z) {
                this.discardWhenNextBoot = z;
            }

            public final void setStartID(long j) {
                this.startID = j;
            }

            public final void setStatus(int i) {
                this.status = i;
            }

            public final void setValue(String str) {
                this.value = str;
            }
        }
    }

    public PersistenceReporter(String str) {
        this.LIZ = str;
        this.LJFF = Keva.getRepo(str);
        C786410Ut5.LJLJJI(10000, this.LIZIZ, LJI());
        C786410Ut5.LJLJJI(10004, 0L, LJI());
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, LJI(), new ARunnableS126S0100000_26(this, 6));
    }

    @Override // X.InterfaceC969400bKk
    public final void LIZJ(String str) throws JSONException {
        if (Intrinsics.LJFF(Looper.myLooper(), LJI().getLooper())) {
            LJIIIIZZ(str, false);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 10002;
        messageObtain.obj = str;
        C786410Ut5.LJLJJL(LJI(), messageObtain);
    }

    @Override // X.InterfaceC969400bKk
    public final void LIZ(String str, Function2<? super String, ? super Long, Unit> function2) {
        Object c098200Yq;
        if (Intrinsics.LJFF(Looper.myLooper(), LJI().getLooper())) {
            Companion.InnerRecord innerRecordLJII = LJII(str, this.LJFF.getString(str, "{}"));
            if (innerRecordLJII == null) {
                innerRecordLJII = new Companion.InnerRecord();
            }
            try {
                function2.invoke(innerRecordLJII.getValue(), Long.valueOf(innerRecordLJII.getCreateTimeStamp()));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJ("PersistenceReporter", thM5exceptionOrNullimpl.getMessage());
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C786410Ut5.LJJZZIII(LJI(), new ARunnableS29S1200000_26(this, function2, str, 1));
    }

    public final void LJ(Companion.InnerRecord innerRecord, boolean z) throws JSONException {
        Object c098200Yq;
        if (innerRecord.getValue().length() != 0 && !Intrinsics.LJFF(innerRecord.getValue(), "{}")) {
            try {
                c098200Yq = new JSONObject(innerRecord.getValue());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            if (z && jSONObject != null) {
                jSONObject.put("expire_info", new JSONObject("{expire:1}"));
            }
            if (innerRecord.getStartID() != LJIIIZ.getValue().longValue() && innerRecord.getStatus() != 0) {
                if (jSONObject != null) {
                    jSONObject.put("app_killed", true);
                } else {
                    return;
                }
            } else if (jSONObject == null) {
                return;
            }
            C1CC2.LJIIIIZZ(this.LIZ, innerRecord.getStatus(), jSONObject);
            Function1<? super JSONObject, Unit> function1 = this.LJ;
            if (function1 != null) {
                function1.invoke(jSONObject);
            }
        }
    }

    public final Companion.InnerRecord LJII(String str, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = (Companion.InnerRecord) new Gson().LJII(str2, Companion.InnerRecord.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Companion.InnerRecord innerRecord = (Companion.InnerRecord) c098200Yq;
        if (innerRecord == null) {
            this.LJFF.erase(str);
        }
        return innerRecord;
    }

    public final void LJIIIIZZ(String str, boolean z) throws JSONException {
        Companion.InnerRecord innerRecordLJII;
        if (str.length() != 0 && this.LJFF.contains(str)) {
            C497740JfY.LJII();
            try {
                if (!C036E.LIZ.LIZIZ() || (innerRecordLJII = LJII(str, this.LJFF.getString(str, "{}"))) == null) {
                    return;
                }
                if (z) {
                    innerRecordLJII.setStatus(1);
                }
                LJ(innerRecordLJII, z);
                this.LJFF.erase(str);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report specific record id empty  recordId =");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PersistenceReporter", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC969400bKk
    public final boolean LIZIZ(final boolean z, final long j, final boolean z2, final String str, final String str2, final boolean z3) throws JSONException {
        if (str.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF(Looper.myLooper(), LJI().getLooper())) {
            LJFF(z, j, z2, str, str2, z3);
            return true;
        }
        C786410Ut5.LJJZZIII(LJI(), new Runnable() { // from class: X.0uKc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PersistenceReporter@c927.updateValue$1");
                try {
                    PersistenceReporter persistenceReporter = this.LL;
                    String str3 = str;
                    String str4 = str2;
                    persistenceReporter.LJFF(z, j, z2, str3, str4, z3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PersistenceReporter@c927.updateValue$1");
            }
        });
        return true;
    }

    public final void LJFF(boolean z, long j, boolean z2, String str, String str2, boolean z3) throws JSONException {
        Companion.InnerRecord innerRecordLJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateValue,recordId =");
        sbLIZ.append(str);
        sbLIZ.append(",isEnd =");
        sbLIZ.append(z);
        sbLIZ.append(" jsonString length = ");
        sbLIZ.append(str2.length());
        C20441214yg.LIZIZ("PersistenceReporter", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJFF.contains(str)) {
            innerRecordLJII = new Companion.InnerRecord();
            if (j > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 10001;
                messageObtain.obj = str;
                C786410Ut5.LJLJLJ(LJI(), messageObtain, j);
            }
            C786410Ut5.LJLILLLLZI(LJI(), 10005);
        } else {
            innerRecordLJII = LJII(str, this.LJFF.getString(str, "{}"));
            if (innerRecordLJII == null) {
                innerRecordLJII = new Companion.InnerRecord();
            }
        }
        if (innerRecordLJII.getStatus() != 0) {
            int i = 1;
            if (z3) {
                innerRecordLJII.setDiscardWhenNextBoot(true);
            }
            if (z2) {
                JSONObject jSONObject = new JSONObject(innerRecordLJII.getValue());
                C190800oM.LIZIZ(jSONObject, new JSONObject(str2));
                str2 = C786410Ut5.J3(jSONObject);
            }
            innerRecordLJII.setValue(str2);
            if (z) {
                i = 0;
            }
            innerRecordLJII.setStatus(i);
            this.LJFF.storeString(str, GsonProtectorUtils.toJson(new Gson(), innerRecordLJII));
        }
    }
}
