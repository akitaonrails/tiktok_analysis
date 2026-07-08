package X;

import X.InterfaceC1644770su3;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.StrArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0suN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1644970suN<T extends InterfaceC1644770su3> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV, InterfaceC1644770su3 {
    public static final C1645140sue LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final String LLJLLIL;
    public final boolean LL;
    public final C1DRG LLILLJJLI;
    public final C1645020suS LLILLL;
    public final Function1<C1645070suX, C1645070suX> LLILZ;
    public final Function0<Boolean> LLILZIL;
    public final C1645130sud LLILZLL;
    public final Keva LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final h0<FilterBean> LLJIJIL;
    public final MutableLiveData<List<C1643870ssb>> LLJILJIL;
    public final MutableLiveData<C1643870ssb> LLJILJILJ;
    public final C560530Lyd<C1644900suG> LLJILLL;
    public final C560530Lyd<C1644940suK> LLJJ;
    public final MutableLiveData<Unit> LLJJI;
    public final MutableLiveData<Boolean> LLJJIII;
    public Pair<? extends FilterBean, C1643870ssb> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public FilterBean LLJJIJIL;
    public boolean LLJJJ;
    public final Observer<List<FilterBean>> LLJJJIL;
    public final T LLJJJJ;
    public final h0<FilterBean> LLJJJJJIL;
    public final MutableLiveData<C1643870ssb> LLJJJJLIIL;
    public final MutableLiveData<List<C1643870ssb>> LLJJL;
    public final C560530Lyd<C1644940suK> LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<C1644900suG> LLJL;
    public final MutableLiveData<Unit> LLJLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0sue] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644970suN.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1644970suN.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1644970suN.class, "beautyFilterDelegateApi", "getBeautyFilterDelegateApi()Lcom/bytedance/creativex/recorder/beauty/BeautyFilterLazyDelegationAPI;", 0)};
        LLJLILLLLZIIL = new Object() { // from class: X.0sue
        };
        LLJLLIL = "isFilterOnTop";
    }

    @Override // X.InterfaceC1644770su3
    public void aC() {
        this.LLJJJ = true;
        FilterBean filterBean = this.LLJJIJIL;
        if (filterBean != null) {
            yL2(false, "build_in");
            MO(filterBean, "recover", false, false, true, true);
        }
    }

    @Override // X.InterfaceC1644770su3
    public void am2() {
        this.LLJJIJI = null;
        G2(this, null, null, 2, null);
        this.LLJIJIL.LJII(null);
        this.LLJJI.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1644770su3
    public void bU() {
    }

    @Override // X.InterfaceC1644770su3
    public void nr1() {
        this.LLJJJ = false;
        FilterBean filterBeanLIZJ = this.LLJJJJJIL.LIZJ();
        if (filterBeanLIZJ != null) {
            this.LLJJIJIL = filterBeanLIZJ;
            yL2(true, "build_in");
        }
    }

    private final C1643870ssb H2() {
        String str = this.LLILZLL.LIZIZ;
        C1645020suS c1645020suS = this.LLILLL;
        return new C1643870ssb(str, c1645020suS.LIZ, new C1453110nuv(c1645020suS.LIZIZ, new C1645060suW(getCameraApiComponent().getEffectController())), this.LLILLL.LIZJ);
    }

    private final InterfaceC1646290swV c3() {
        return (InterfaceC1646290swV) this.LLJI.getValue(this, LLJLL[2]);
    }

    private final void z4() {
        E5(this, this.LLILZLL.LIZIZ, false, 2, null);
    }

    public final boolean H4() {
        String str;
        C1643870ssb value = this.LLJILJILJ.getValue();
        if (value == null || (str = value.LIZ) == null) {
            return false;
        }
        return K4(str);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLIZLLLIL.getValue(this, LLJLL[0]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJ.getValue(this, LLJLL[1]);
    }

    public void o4() {
        String enName;
        C1643870ssb second;
        InterfaceC1452660nuC interfaceC1452660nuC;
        Pair<? extends FilterBean, C1643870ssb> pair = this.LLJJIJI;
        FilterBean first = null;
        if (pair != null && (first = pair.getFirst()) != null && (enName = first.getEnName()) != null) {
            getCameraApiComponent().pw0().recordContext.filterLabels.add(enName);
            Pair<? extends FilterBean, C1643870ssb> pair2 = this.LLJJIJI;
            getCameraApiComponent().pw0().recordContext.filterValues.add(((pair2 == null || (second = pair2.getSecond()) == null || (interfaceC1452660nuC = second.LIZJ) == null) ? 0 : Float.valueOf(C1453230nv7.LJIIIIZZ(first, interfaceC1452660nuC))).toString());
            StrArray strArray = getCameraApiComponent().pw0().recordContext.filterEnterMethod;
            String enterMethod = first.getEnterMethod();
            if (enterMethod == null) {
                enterMethod = "";
            }
            strArray.add(enterMethod);
            StrArray strArray2 = getCameraApiComponent().pw0().recordContext.filterCategoryKeys;
            String categoryKey = first.getCategoryKey();
            strArray2.add(categoryKey != null ? categoryKey : "");
        }
        C1645000suQ.LIZ(this.LLJILJILJ.getValue(), getCameraApiComponent().pw0().recordContext.filterIds, first);
    }

    private final void F4() {
        getCameraApiComponent().yj1().LIZ(this, new AObjectS246S0100000_25(this, 10));
        getCameraApiComponent().fT0().LIZ(this, new AObjectS246S0100000_25(this, 11));
        getCameraApiComponent().Q30().LIZ(this, new AObjectS246S0100000_25(this, 12));
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS604S0100000_25(this, 61));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        z4();
        F4();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        Keva keva = this.LLIZ;
        String str = LLJLLIL;
        Boolean value = this.LLJJIII.getValue();
        keva.storeBoolean(str, value != null ? value.booleanValue() : false);
    }

    public MutableLiveData<C1643870ssb> B3() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ LiveEvent BZ0() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ LiveData EI1() {
        return this.LLJJL;
    }

    public MutableLiveData<List<C1643870ssb>> H3() {
        return this.LLJJL;
    }

    public C560530Lyd<C1644940suK> O3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C560530Lyd<C1644900suG> Q3() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ LiveData RT() {
        return this.LLJJJJLIIL;
    }

    public T W2() {
        return this.LLJJJJ;
    }

    public final MutableLiveData<C1643870ssb> e4() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C1645020suS i3() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ C385670FAf i70() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ LiveData iZ() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1644770su3
    public /* bridge */ /* synthetic */ LiveEvent ka0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public MutableLiveData<Unit> m3() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1644770su3
    public void nI1() {
        am2();
    }

    public h0<FilterBean> q3() {
        return this.LLJJJJJIL;
    }

    public final Pair<FilterBean, C1643870ssb> v3() {
        return this.LLJJIJI;
    }

    private final boolean K4(String str) {
        C1643870ssb next;
        InterfaceC1645100sua interfaceC1645100sua;
        List<C1643870ssb> value = this.LLJILJIL.getValue();
        if (value != null) {
            Iterator<C1643870ssb> it2 = value.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1643870ssb c1643870ssb = next;
            if (c1643870ssb != null && (interfaceC1645100sua = c1643870ssb.LIZLLL) != null) {
                return interfaceC1645100sua.LIZJ();
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
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
    private final void P4(String str) {
        ?? arrayList;
        List<C1643870ssb> value = this.LLJILJIL.getValue();
        if (value != null) {
            for (C1643870ssb c1643870ssb : value) {
                if (Intrinsics.LJFF(c1643870ssb.LIZ, str)) {
                    if (c1643870ssb != null) {
                        LiveData liveData = this.LLJILJIL;
                        List list = (List) liveData.getValue();
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (!Intrinsics.LJFF(((C1643870ssb) obj).LIZ, str)) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        liveData.setValue(arrayList);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void o2(C1643870ssb c1643870ssb) {
        ArrayList arrayList;
        List<C1643870ssb> value = this.LLJILJIL.getValue();
        if (value != null) {
            Iterator<C1643870ssb> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1643870ssb next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, c1643870ssb.LIZ)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        MutableLiveData<List<C1643870ssb>> mutableLiveData = this.LLJILJIL;
        List<C1643870ssb> value2 = mutableLiveData.getValue();
        if (value2 != null) {
            arrayList = new ArrayList(value2);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(c1643870ssb);
        mutableLiveData.setValue(arrayList);
    }

    public FilterBean E3(C1643870ssb c1643870ssb) {
        String strLIZ;
        InterfaceC1645100sua interfaceC1645100sua = c1643870ssb.LIZLLL;
        Object obj = null;
        if (interfaceC1645100sua instanceof InterfaceC1645160sug) {
            String strLIZIZ = ((InterfaceC1645160sug) interfaceC1645100sua).LIZIZ();
            List list = (List) c1643870ssb.LIZIZ.LJJI().LJFF().getValue();
            if (list == null) {
                return null;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((FilterBean) next).getResId(), strLIZIZ)) {
                    obj = next;
                    break;
                }
            }
            return (FilterBean) obj;
        }
        C1441190nbh c1441190nbhLIZ = getCameraApiComponent().pw0().LIZ();
        if ((c1441190nbhLIZ == null || c1441190nbhLIZ.isEmpty()) && this.LLILZLL.LIZ) {
            strLIZ = "-1";
        } else {
            strLIZ = interfaceC1645100sua.LIZ(getCameraApiComponent().LJLJJLL());
        }
        List list2 = (List) c1643870ssb.LIZIZ.LJJI().LJFF().getValue();
        if (list2 == null) {
            return null;
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(((FilterBean) next2).getId(), strLIZ)) {
                obj = next2;
                break;
            }
        }
        return (FilterBean) obj;
    }

    @Override // X.InterfaceC1644770su3
    public void F42(String str) {
        P4(str);
    }

    public void H5(Pair<? extends FilterBean, C1643870ssb> pair) {
        C385670FAf<Boolean> c385670FAfJv2;
        InterfaceC1648570t0B recordControlApi = getRecordControlApi();
        if (recordControlApi != null && (c385670FAfJv2 = recordControlApi.Jv2()) != null && Intrinsics.LJFF(c385670FAfJv2.LIZJ(), Boolean.FALSE)) {
            getCameraApiComponent().pw0().recordContext.filterLabels.add(pair.getFirst().getEnName());
            getCameraApiComponent().pw0().recordContext.filterIds.add(pair.getFirst().getEnName());
            getCameraApiComponent().pw0().recordContext.filterValues.add(String.valueOf(C1453230nv7.LJIIIIZZ(pair.getFirst(), pair.getSecond().LIZJ)));
            getCameraApiComponent().pw0().recordContext.filterCategoryKeys.add(pair.getFirst().getCategoryKey());
        }
        X1(pair.getFirst(), pair.getSecond().LIZLLL);
    }

    @Override // X.InterfaceC1644770su3
    public void JY1(boolean z) {
        Z4(this, z, true, false, 4, null);
    }

    public void O4(C1644940suK c1644940suK) {
        this.LLJJ.LJIIJ(c1644940suK);
    }

    @Override // X.InterfaceC1644770su3
    public void Pb1(boolean z) {
        FilterBean filterBeanLIZJ;
        if (z && (filterBeanLIZJ = this.LLJIJIL.LIZJ()) != null) {
            n5(this, filterBeanLIZJ, null, false, false, true, false, false, false, 224, null);
        }
        this.LLJJIII.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1644770su3
    public boolean QJ(String str) {
        return K4(str);
    }

    public void W1(C1645070suX c1645070suX) {
        if (c1645070suX == null) {
            getCameraApiComponent().setFilter("");
        } else if (c1645070suX.LIZLLL == null) {
            getCameraApiComponent().setFilter(c1645070suX.LIZJ);
        } else {
            getCameraApiComponent().setFilter(c1645070suX.LIZJ, c1645070suX.LIZLLL.floatValue());
        }
    }

    public final void d5(Pair<? extends FilterBean, C1643870ssb> pair) {
        this.LLJJIJI = pair;
    }

    @Override // X.InterfaceC1644770su3
    public void rX(C1643870ssb c1643870ssb) {
        o2(c1643870ssb);
    }

    private final void D5(String str, boolean z) {
        String str2;
        List<C1643870ssb> value;
        InterfaceC1639870sm9 interfaceC1639870sm9;
        InterfaceC1640320sms interfaceC1640320smsLJJI;
        MutableLiveData mutableLiveDataLJFF;
        C1643870ssb value2 = this.LLJILJILJ.getValue();
        C1643870ssb c1643870ssb = null;
        if (value2 != null) {
            str2 = value2.LIZ;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, str) && (value = this.LLJILJIL.getValue()) != null) {
            Iterator<C1643870ssb> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1643870ssb next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    c1643870ssb = next;
                    break;
                }
            }
            C1643870ssb c1643870ssb2 = c1643870ssb;
            if (c1643870ssb2 != null) {
                this.LLJILJILJ.setValue(c1643870ssb2);
                if (value2 != null && (interfaceC1639870sm9 = value2.LIZIZ) != null && (interfaceC1640320smsLJJI = interfaceC1639870sm9.LJJI()) != null && (mutableLiveDataLJFF = interfaceC1640320smsLJJI.LJFF()) != null) {
                    mutableLiveDataLJFF.removeObserver(this.LLJJJIL);
                }
                c1643870ssb2.LIZIZ.LJJI().LJFF().observe(this, this.LLJJJIL);
            }
        }
    }

    private final void T2(Pair<? extends FilterBean, C1643870ssb> pair, Pair<? extends FilterBean, C1643870ssb> pair2) {
        AwS604S0100000_25 awS604S0100000_25;
        EnumC1153670g7x enumC1153670g7x;
        Pair pair3 = null;
        if (pair != null && pair.getFirst() != null) {
            pair3 = new Pair(pair.getFirst(), pair.getSecond());
        }
        Pair pair4 = new Pair(pair2.getFirst(), pair2.getSecond());
        if (pair3 == null) {
            enumC1153670g7x = EnumC1153670g7x.RIGHT_TO_LEFT;
        } else {
            if (Intrinsics.LJFF(((C1643870ssb) pair3.getSecond()).LIZ, ((C1643870ssb) pair4.getSecond()).LIZ)) {
                awS604S0100000_25 = new AwS604S0100000_25((C1643870ssb) pair3.getSecond(), 59);
            } else {
                awS604S0100000_25 = new AwS604S0100000_25(this, 60);
            }
            if (((Number) awS604S0100000_25.invoke(pair3)).intValue() <= ((Number) awS604S0100000_25.invoke(pair4)).intValue()) {
                enumC1153670g7x = EnumC1153670g7x.RIGHT_TO_LEFT;
            } else {
                enumC1153670g7x = EnumC1153670g7x.LEFT_TO_RIGHT;
            }
        }
        O4(new C1644940suK(pair3, pair4, enumC1153670g7x));
    }

    private final void t5(boolean z, String str) {
        String str2;
        InterfaceC1645100sua interfaceC1645100sua;
        C1643870ssb c1643870ssb = null;
        this.LLJJIJIL = null;
        C1643870ssb value = this.LLJILJILJ.getValue();
        if (value != null) {
            str2 = value.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str) && z) {
            am2();
        }
        List<C1643870ssb> value2 = this.LLJILJIL.getValue();
        if (value2 != null) {
            Iterator<C1643870ssb> it2 = value2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1643870ssb next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    c1643870ssb = next;
                    break;
                }
            }
            C1643870ssb c1643870ssb2 = c1643870ssb;
            if (c1643870ssb2 != null && (interfaceC1645100sua = c1643870ssb2.LIZLLL) != null) {
                interfaceC1645100sua.LJ(z);
            }
        }
    }

    private final void v5(FilterBean filterBean, float f) {
        C1643870ssb next;
        InterfaceC1452660nuC interfaceC1452660nuC;
        List<C1643870ssb> value = this.LLJILJIL.getValue();
        if (value != null) {
            Iterator<C1643870ssb> it2 = value.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZIZ.LJIILLIIL(filterBean.getId(), filterBean.getCategoryKey()) != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1643870ssb c1643870ssb = next;
            if (c1643870ssb != null && (interfaceC1452660nuC = c1643870ssb.LIZJ) != null) {
                interfaceC1452660nuC.LIZJ(filterBean, f);
            }
        }
        Pair<? extends FilterBean, C1643870ssb> pair = this.LLJJIJI;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), filterBean)) {
            w2(pair, Float.valueOf(f));
        }
    }

    private final void w2(Pair<? extends FilterBean, C1643870ssb> pair, Float f) {
        float fLIZIZ;
        C1645070suX c1645070suXInvoke;
        InterfaceC1646290swV interfaceC1646290swVC3;
        if (this.LL && (interfaceC1646290swVC3 = c3()) != null && interfaceC1646290swVC3.a20()) {
            this.LLJJJ = true;
            return;
        }
        if (pair == null) {
            W1(null);
            return;
        }
        String id = pair.getFirst().getId();
        HashMap<String, Boolean> map = C1643880ssc.LIZ;
        if (id != null && id.length() != 0 && !Intrinsics.LJFF(id, "-1")) {
            if (f != null) {
                fLIZIZ = f.floatValue();
            } else {
                fLIZIZ = pair.getSecond().LIZJ.LIZIZ(pair.getFirst());
            }
        } else {
            fLIZIZ = 1.0f;
        }
        C1645070suX c1645070suX = new C1645070suX(pair.getFirst(), pair.getSecond(), C1638720skI.LJ(pair.getFirst()), Float.valueOf(fLIZIZ));
        Function1<C1645070suX, C1645070suX> function1 = this.LLILZ;
        if (function1 != null && (c1645070suXInvoke = function1.invoke(c1645070suX)) != null) {
            c1645070suX = c1645070suXInvoke;
        }
        W1(c1645070suX);
    }

    private final void x5(FilterBean filterBean, int i) {
        C1643870ssb next;
        InterfaceC1452660nuC interfaceC1452660nuC;
        List<C1643870ssb> value = this.LLJILJIL.getValue();
        if (value != null) {
            Iterator<C1643870ssb> it2 = value.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZIZ.LJIILLIIL(filterBean.getId(), filterBean.getCategoryKey()) != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1643870ssb c1643870ssb = next;
            if (c1643870ssb != null && (interfaceC1452660nuC = c1643870ssb.LIZJ) != null) {
                interfaceC1452660nuC.LIZJ(filterBean, C1453210nv5.LIZLLL(filterBean, i, interfaceC1452660nuC.LIZ()));
            }
        }
        Pair<? extends FilterBean, C1643870ssb> pair = this.LLJJIJI;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), filterBean)) {
            G2(this, pair, null, 2, null);
        }
    }

    @Override // X.InterfaceC1644770su3
    public void RX1(FilterBean filterBean, int i) {
        x5(filterBean, i);
    }

    public void X1(FilterBean filterBean, InterfaceC1645100sua interfaceC1645100sua) {
        interfaceC1645100sua.LIZLLL(getCameraApiComponent().LJLJJLL(), filterBean.getId());
    }

    @Override // X.InterfaceC1644770su3
    public void aZ(FilterBean filterBean, float f) {
        v5(filterBean, f);
    }

    @Override // X.InterfaceC1644770su3
    public void dm0(String str, boolean z) {
        D5(str, z);
    }

    @Override // X.InterfaceC1644770su3
    public void yL2(boolean z, String str) {
        t5(z, str);
    }

    private final void C5(FilterBean filterBean, FilterBean filterBean2, float f) {
        C1645070suX c1645070suXInvoke;
        C1645070suX c1645070suXInvoke2;
        C1643870ssb value = this.LLJILJILJ.getValue();
        C1645070suX c1645070suX = new C1645070suX(filterBean, value, C1638720skI.LJ(filterBean), Float.valueOf(value.LIZJ.LIZIZ(filterBean)));
        Function1<C1645070suX, C1645070suX> function1 = this.LLILZ;
        if (function1 != null && (c1645070suXInvoke2 = function1.invoke(c1645070suX)) != null) {
            c1645070suX = c1645070suXInvoke2;
        }
        C1645070suX c1645070suX2 = new C1645070suX(filterBean2, value, C1638720skI.LJ(filterBean2), Float.valueOf(value.LIZJ.LIZIZ(filterBean2)));
        Function1<C1645070suX, C1645070suX> function12 = this.LLILZ;
        if (function12 != null && (c1645070suXInvoke = function12.invoke(c1645070suX2)) != null) {
            c1645070suX2 = c1645070suXInvoke;
        }
        Z1(c1645070suX, c1645070suX2, f);
    }

    public void T4(boolean z, boolean z2, boolean z3) {
        C1643870ssb value;
        if (!H4() && (value = this.LLJILJILJ.getValue()) != null) {
            FilterBean filterBeanE3 = E3(value);
            if (filterBeanE3 != null) {
                n5(this, filterBeanE3, null, z, false, z2, z3, false, false, 192, null);
            } else {
                am2();
            }
        }
    }

    public void Z1(C1645070suX c1645070suX, C1645070suX c1645070suX2, float f) {
        getCameraApiComponent().qM(new Pair<>(c1645070suX.LIZJ, c1645070suX.LIZLLL), new Pair<>(c1645070suX2.LIZJ, c1645070suX2.LIZLLL), f);
    }

    @Override // X.InterfaceC1644770su3
    public void jP1(FilterBean filterBean, FilterBean filterBean2, float f) {
        C5(filterBean, filterBean2, f);
    }

    public static /* synthetic */ void E5(C1644970suN c1644970suN, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            c1644970suN.D5(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterSourceInternal");
    }

    public static /* synthetic */ void G2(C1644970suN c1644970suN, Pair pair, Float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = null;
            }
            c1644970suN.w2(pair, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyFilter2Camera");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1644970suN(boolean z, C1DRG c1drg, C1645020suS c1645020suS, Function1<? super C1645070suX, C1645070suX> function1, Function0<Boolean> function0, Function1<? super C1645130sud, Unit> function12) {
        this.LL = z;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c1645020suS;
        this.LLILZ = function1;
        this.LLILZIL = function0;
        C1645130sud c1645130sud = new C1645130sud();
        this.LLILZLL = c1645130sud;
        Keva repo = Keva.getRepo("IS_LAST_FILTER_USED_ON_TOP");
        this.LLIZ = repo;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646290swV.class, null);
        h0<FilterBean> h0Var = new h0<>(null);
        this.LLJIJIL = h0Var;
        MutableLiveData<List<C1643870ssb>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Collections.singletonList(H2()));
        this.LLJILJIL = mutableLiveData;
        MutableLiveData<C1643870ssb> mutableLiveData2 = new MutableLiveData<>();
        this.LLJILJILJ = mutableLiveData2;
        C560530Lyd<C1644900suG> c560530Lyd = new C560530Lyd<>();
        this.LLJILLL = c560530Lyd;
        C560530Lyd<C1644940suK> c560530Lyd2 = new C560530Lyd<>();
        this.LLJJ = c560530Lyd2;
        MutableLiveData<Unit> mutableLiveData3 = new MutableLiveData<>();
        this.LLJJI = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.LLJJIII = mutableLiveData4;
        this.LLJJIJIIJIL = true;
        this.LLJJJ = true;
        this.LLJJJIL = new AObserverS227S0100000_25(this, 4);
        if (function12 != null) {
            function12.invoke(c1645130sud);
        }
        mutableLiveData4.setValue(Boolean.valueOf(repo.getBoolean(LLJLLIL, false)));
        this.LLJJJJ = this;
        this.LLJJJJJIL = h0Var;
        this.LLJJJJLIIL = mutableLiveData2;
        this.LLJJL = mutableLiveData;
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd2;
        this.LLJL = c560530Lyd;
        this.LLJLIL = mutableLiveData3;
    }

    public static /* synthetic */ void Z4(C1644970suN c1644970suN, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            c1644970suN.T4(z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChosenFilterFromStoreInternal");
    }

    @Override // X.InterfaceC1644770su3
    public void MO(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        n5(this, filterBean, str, z, z2, z3, false, false, z4, 96, null);
    }

    public void k5(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str2;
        InterfaceC1646290swV interfaceC1646290swVC3;
        if (H4() || z5) {
            if (z2) {
                C1643870ssb value = this.LLJILJILJ.getValue();
                if (value != null) {
                    this.LLJJJJ.yL2(false, value.LIZ);
                }
            } else {
                return;
            }
        }
        Pair<? extends FilterBean, C1643870ssb> pair = this.LLJJIJI;
        if (pair != null) {
            if (Intrinsics.LJFF(pair.getFirst(), filterBean) && !z3) {
                return;
            }
            if (Intrinsics.LJFF(pair.getFirst(), filterBean) && z3) {
                z = false;
            }
        }
        C1643870ssb value2 = this.LLJILJILJ.getValue();
        if (!C1453230nv7.LJIIIZ(filterBean, value2.LIZIZ)) {
            return;
        }
        Pair<? extends FilterBean, C1643870ssb> pair2 = this.LLJJIJI;
        filterBean.setSaveFilter2BeautySequence(!z4);
        if (str != null && str.length() != 0) {
            str2 = str;
        } else {
            str2 = "click";
        }
        filterBean.setEnterMethod(str2);
        Pair<? extends FilterBean, C1643870ssb> pair3 = new Pair<>(filterBean, value2);
        this.LLJJIJI = pair3;
        if (this.LL && (interfaceC1646290swVC3 = c3()) != null && interfaceC1646290swVC3.a20()) {
            this.LLJJJ = true;
            this.LLJJIJIL = filterBean;
            return;
        }
        if (z6 && this.LLJJJ) {
            G2(this, pair3, null, 2, null);
        } else {
            this.LLJJIJIL = filterBean;
        }
        H5(pair3);
        this.LLJIJIL.LJII(pair3.getFirst());
        this.LLJILLL.LJIIJ(new C1644900suG(pair3.getFirst(), value2, z2, str));
        if (z) {
            T2(pair2, pair3);
        }
    }

    public static /* synthetic */ void n5(C1644970suN c1644970suN, FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z3 = false;
            }
            if ((i & 32) != 0) {
                z4 = false;
            }
            if ((i & 64) != 0) {
                z5 = false;
            }
            if ((i & 128) != 0) {
                z6 = true;
            }
            c1644970suN.k5(filterBean, str, z, z2, z3, z4, z5, z6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterChosenInternal");
    }
}
