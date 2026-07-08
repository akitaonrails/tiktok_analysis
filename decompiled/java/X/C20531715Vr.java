package X;

import Y.ARunnableS131S0100000_31;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.explore.experiment.performance.LCPConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20531715Vr implements InterfaceC1848620yCq {
    public static final BPEAHandler LLJJL = new BPEAHandler(Looper.getMainLooper());
    public volatile AnonymousClass1582 LL;
    public Long LLILLL;
    public Long LLILZ;
    public Long LLILZIL;
    public Long LLILZLL;
    public Long LLIZ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Long LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public Integer LLJJI;
    public Integer LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public EnumC1779750wPl LLJJJJJIL;
    public final ARunnableS131S0100000_31 LLJJJJLIIL;
    public final long LLILLJJLI = System.currentTimeMillis();
    public final Map<String, C20531815Vs> LLIZLLLIL = new LinkedHashMap();
    public final Map<String, C20531815Vs> LLJ = new LinkedHashMap();

    public final synchronized boolean LJ() {
        return this.LLJJJ;
    }

    public final synchronized void LJIIJJI() {
        if (this.LLJJIJIIJIL || this.LLJJJ) {
            return;
        }
        this.LLJJIJIIJIL = true;
        LJIIIIZZ(EnumC1083610eIx.START, null);
    }

    @Override // X.InterfaceC1848620yCq
    public final String getEventName() {
        return "ttexp_homepage_explore_lcp_perf";
    }

    public final void LJIIL() throws JSONException {
        EnumC20531915Vt enumC20531915Vt;
        if (this.LLJJJ || this.LLJJIJIL || !this.LLJILJIL) {
            return;
        }
        Collection collectionValues = ((LinkedHashMap) this.LLIZLLLIL).values();
        ArrayList<C20531815Vs> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C20531815Vs) obj).LIZ == EnumC20125213oo.LL) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            enumC20531915Vt = EnumC20531915Vt.NORMAL;
        } else {
            for (C20531815Vs c20531815Vs : arrayList) {
                if (!c20531815Vs.LIZLLL || !c20531815Vs.LJI) {
                    enumC20531915Vt = EnumC20531915Vt.AUTO_REFRESH;
                    break;
                }
            }
            enumC20531915Vt = EnumC20531915Vt.NORMAL;
        }
        this.LLJJIJIL = true;
        LJIIIIZZ(EnumC1083610eIx.CACHE_SHOW, enumC20531915Vt);
    }

    public final void LJIILIIL() throws JSONException {
        if (this.LLJJJ) {
            return;
        }
        if (this.LLJJIJIL) {
            if (!this.LLJILJIL || this.LLJ.isEmpty() || !this.LLJIJIL) {
                return;
            }
            Collection<C20531815Vs> collectionValues = ((LinkedHashMap) this.LLJ).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (C20531815Vs c20531815Vs : collectionValues) {
                    if (!c20531815Vs.LIZLLL || !c20531815Vs.LJI) {
                        return;
                    }
                }
            }
        } else {
            if (!this.LLJI) {
                return;
            }
            Collection collectionValues2 = ((LinkedHashMap) this.LLIZLLLIL).values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it2 = collectionValues2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((C20531815Vs) it2.next()).LIZ == EnumC20125213oo.LL) {
                        if (!this.LLJILJIL) {
                            return;
                        }
                    }
                }
            }
            if (!this.LLIZLLLIL.isEmpty()) {
                Collection<C20531815Vs> collectionValues3 = ((LinkedHashMap) this.LLIZLLLIL).values();
                if (!(collectionValues3 instanceof Collection) || !collectionValues3.isEmpty()) {
                    for (C20531815Vs c20531815Vs2 : collectionValues3) {
                        if (!c20531815Vs2.LIZLLL || !c20531815Vs2.LJI) {
                            return;
                        }
                    }
                }
            }
        }
        this.LLJJJ = true;
        LLJJL.removeCallbacks(this.LLJJJJLIIL);
        LJIIIIZZ(EnumC1083610eIx.END, this.LLJJJJ ? EnumC20531915Vt.FAILED : EnumC20531915Vt.NORMAL);
    }

    public final long LIZIZ() {
        return System.currentTimeMillis() - this.LLILLJJLI;
    }

    public C20531715Vr(AnonymousClass1582 anonymousClass1582) {
        this.LL = anonymousClass1582;
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 58);
        this.LLJJJJLIIL = aRunnableS131S0100000_31;
        LJII(C15V4.START);
        if (C1267604xe.LIZ()) {
            long j = ((LCPConfig) C1267604xe.LIZIZ.getValue()).timeoutMills;
            C786410Ut5.LJLIIL(j < 1 ? 1L : j, LLJJL, aRunnableS131S0100000_31);
        }
    }

    public final void LIZ(EnumC20531915Vt enumC20531915Vt) throws JSONException {
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        LLJJL.removeCallbacks(this.LLJJJJLIIL);
        LJIIIIZZ(EnumC1083610eIx.END, enumC20531915Vt);
    }

    public final synchronized void LIZJ(String str) {
        if (this.LLJJJ) {
            return;
        }
        if (this.LLJILLL == null) {
            this.LLJILLL = str;
        }
    }

    public final synchronized void LIZLLL(String str) {
        if (this.LLJJJ) {
            return;
        }
        if (this.LLJJ == null) {
            this.LLJJ = str;
        }
    }

    public final synchronized void LJFF(String str) {
        String str2;
        if (this.LLJJJ) {
            return;
        }
        if (str != null && str.length() != 0 && ((str2 = this.LLJJIJI) == null || str2.length() == 0)) {
            this.LLJJIJI = str;
        }
    }

    public final synchronized void LJI(Integer num) {
        if (this.LLJJJ) {
            return;
        }
        if (num != null && this.LLJJIII == null) {
            this.LLJJIII = num;
        }
    }

    public final synchronized void LJII(C15V4 c15v4) {
        if (this.LLJJJ) {
            return;
        }
        int i = C15V5.LIZ[c15v4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.LLILZLL == null) {
                        this.LLILZLL = Long.valueOf(LIZIZ());
                    } else if (this.LLJILJIL && this.LLIZ == null) {
                        this.LLIZ = Long.valueOf(LIZIZ());
                    }
                }
            } else if (this.LLILZIL == null) {
                this.LLILZIL = Long.valueOf(LIZIZ());
            }
        } else if (this.LLILZ == null) {
            this.LLILZ = Long.valueOf(LIZIZ());
        }
    }

    public final void LJIIIIZZ(EnumC1083610eIx enumC1083610eIx, EnumC20531915Vt enumC20531915Vt) throws JSONException {
        boolean z;
        long jLIZIZ;
        String string;
        String str;
        Map<String, C20531815Vs> map;
        Long l;
        Long lValueOf;
        String value;
        C20531815Vs c20531815Vs;
        AnonymousClass1581 anonymousClass1581;
        if (!C1267604xe.LIZ()) {
            return;
        }
        boolean z2 = false;
        if (enumC1083610eIx == EnumC1083610eIx.START) {
            z = true;
            jLIZIZ = 0;
        } else {
            z = false;
            jLIZIZ = LIZIZ();
        }
        String str2 = this.LLJILLL;
        if (str2 == null) {
            str2 = "homepage_hot";
        }
        AnonymousClass1582 anonymousClass1582 = this.LL;
        Integer numValueOf = null;
        if ((anonymousClass1582 instanceof AnonymousClass1581) && (anonymousClass1581 = (AnonymousClass1581) anonymousClass1582) != null) {
            string = Long.valueOf(anonymousClass1581.LIZIZ).toString();
        } else {
            string = null;
        }
        if (this.LL instanceof AnonymousClass1581) {
            str = this.LLJJIJI;
        } else {
            str = null;
        }
        if (enumC1083610eIx == EnumC1083610eIx.END && (!this.LLJ.isEmpty())) {
            z2 = true;
            map = this.LLJ;
        } else {
            map = this.LLIZLLLIL;
        }
        Collection collectionValues = ((LinkedHashMap) map).values();
        if (z2) {
            l = this.LLIZ;
            if (l == null) {
                l = this.LLJILJILJ;
            }
        } else {
            l = this.LLILZLL;
        }
        Iterator it2 = collectionValues.iterator();
        if (!it2.hasNext()) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(((C20531815Vs) it2.next()).LIZJ);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((C20531815Vs) it2.next()).LIZJ);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("step", enumC1083610eIx.getValue());
        jSONObject.putOpt(Scene.SCENE_SERVICE, this.LL.LIZ);
        jSONObject.put("duration", jLIZIZ);
        jSONObject.putOpt("enter_from", str2);
        jSONObject.putOpt("enter_method", this.LLJJ);
        jSONObject.putOpt("is_top_tab", this.LLJJIII);
        jSONObject.putOpt("interest_id", string);
        jSONObject.putOpt("interest_name", str);
        if (!z) {
            if (enumC20531915Vt != null) {
                value = enumC20531915Vt.getValue();
            } else {
                value = null;
            }
            jSONObject.putOpt("state", value);
            EnumC1779750wPl enumC1779750wPl = this.LLJJJJJIL;
            if (enumC1779750wPl != null) {
                jSONObject.putOpt("exception_reason", enumC1779750wPl.getValue());
            }
            jSONObject.putOpt("pull_type", this.LLJJI);
            if (z2) {
                c20531815Vs = (C20531815Vs) C13LP.LJJJLIIL(((LinkedHashMap) this.LLJ).values());
            } else {
                c20531815Vs = (C20531815Vs) C13LP.LJJJLIIL(((LinkedHashMap) this.LLIZLLLIL).values());
            }
            if (c20531815Vs != null) {
                numValueOf = Integer.valueOf(c20531815Vs.LIZIZ);
            }
            jSONObject.putOpt("model_source", numValueOf);
            jSONObject.putOpt("page_create_time", this.LLILLL);
            jSONObject.putOpt("page_build_time", this.LLILZ);
            jSONObject.putOpt("page_appear_time", this.LLILZIL);
            jSONObject.putOpt("data_build_time", l);
            jSONObject.putOpt("data_appear_time", lValueOf);
            jSONObject.putOpt("first_cover_appear_time", LJIIJ(collectionValues, AFwS276S0000000_31.get$arr$(92), AFwS276S0000000_31.get$arr$(93)));
            jSONObject.putOpt("all_cover_appear_time", LJIIIZ(collectionValues, AFwS276S0000000_31.get$arr$(94), AFwS276S0000000_31.get$arr$(95)));
            jSONObject.putOpt("first_avatar_appear_time", LJIIJ(collectionValues, AFwS276S0000000_31.get$arr$(96), AFwS276S0000000_31.get$arr$(97)));
            jSONObject.putOpt("all_avatar_appear_time", LJIIIZ(collectionValues, AFwS276S0000000_31.get$arr$(98), AFwS276S0000000_31.get$arr$(99)));
        }
        C1848630yCr.LIZ(this, jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttexp_homepage_explore_lcp_perf");
        sbLIZ.append(" step=");
        sbLIZ.append(enumC1083610eIx.getValue());
        sbLIZ.append(' ');
        sbLIZ.append(jSONObject);
        C1848630yCr.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Long LJIIIZ(Collection<C20531815Vs> collection, Function1<? super C20531815Vs, Boolean> function1, Function1<? super C20531815Vs, Long> function12) {
        if (!collection.isEmpty()) {
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!function1.invoke(it2.next()).booleanValue()) {
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = collection.iterator();
            while (it3.hasNext()) {
                Long lInvoke = function12.invoke(it3.next());
                if (lInvoke != null) {
                    arrayList.add(lInvoke);
                }
            }
            return (Long) C13LP.LJJLIIIJLJLI(arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Long LJIIJ(Collection<C20531815Vs> collection, Function1<? super C20531815Vs, Long> function1, Function1<? super C20531815Vs, Boolean> function12) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (function12.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Long lInvoke = function1.invoke(it2.next());
            if (lInvoke != null) {
                arrayList2.add(lInvoke);
            }
        }
        return (Long) C13LP.LJJLL(arrayList2);
    }
}
