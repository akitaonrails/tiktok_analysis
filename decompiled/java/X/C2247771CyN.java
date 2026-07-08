package X;

import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AwS171S0101000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.text.a0;
import mn3.e0;

/* JADX INFO: renamed from: X.1CyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247771CyN extends AbstractC2255721DQs<InterfaceC1650700t3c> implements InterfaceC1650700t3c, InterfaceC379610EuV {
    public static final C2247801CyQ LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LL;
    public C09AE LLILZLL;
    public AbstractC1929607h8 LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public float LLJJI;
    public int LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public volatile boolean LLJJJ;
    public final C19EG LLILLJJLI = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public boolean LLJJ = true;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1CyQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2247771CyN.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C2247771CyN.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(C2247771CyN.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};
        LLJJJIL = new Object() { // from class: X.1CyQ
        };
        LLJJJJJIL = 8;
    }

    public InterfaceC1650700t3c W1() {
        return this;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1("LowLightHintComponent onCreate");
        getRecordAdapterApi().PX1(this);
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS613S0100000_34(this, 51));
        }
        this.LLIZLLLIL = C2247791CyP.LIZIZ().isOneShot;
        this.LLJ = C2247791CyP.LIZIZ().useAmbientLightSensor;
        this.LLJI = C2247791CyP.LIZIZ().alsThreshold;
        this.LLJIJIL = C2247791CyP.LIZIZ().useCameraExposure;
        this.LLJILJIL = C2247791CyP.LIZIZ().expoTimeThreshold;
        this.LLJILJILJ = C2247791CyP.LIZIZ().isoThreshold;
        this.LLJILLL = C2247791CyP.LIZIZ().hintTextType;
        this.LLJJ = C2247791CyP.LIZIZ().isToastPositionCenter;
        if (C2247791CyP.LIZIZ().isOneShot) {
            this.LLIZ = new C1929507h7(C0CHQ.LIZ().LJJIIZI(), C2247791CyP.LIZIZ().version, C2247791CyP.LIZIZ().oneShotMaxTimes);
        } else {
            final InterfaceC1444620nhE interfaceC1444620nhELJJIIZI = C0CHQ.LIZ().LJJIIZI();
            final String str = C2247791CyP.LIZIZ().version;
            final int i = C2247791CyP.LIZIZ().recurrentConsecutiveDaysLimit;
            final int i2 = C2247791CyP.LIZIZ().recurrentMaxTimes;
            this.LLIZ = new AbstractC1929607h8(interfaceC1444620nhELJJIIZI, str, i, i2) { // from class: X.07h6
                public final int LIZJ;
                public final int LIZLLL;
                public final String LJ;
                public final String LJFF;

                @Override // X.AbstractC1929607h8
                public final void LIZLLL() {
                    this.LIZ.LJJJJ(this.LJFF, "");
                }

                public final List<Long> LJFF() {
                    String strLJIILLIIL = this.LIZ.LJIILLIIL(this.LJFF);
                    if (strLJIILLIIL.length() == 0) {
                        return C13BV.INSTANCE;
                    }
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIILLIIL, new String[]{","}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                        if (lLJIILIIL != null) {
                            arrayList.add(lLJIILIIL);
                        }
                    }
                    return arrayList;
                }

                @Override // X.AbstractC1929607h8
                public final boolean LIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long rawOffset = TimeZone.getDefault().getRawOffset();
                    long j = jCurrentTimeMillis - ((jCurrentTimeMillis + rawOffset) % 86400000);
                    long j2 = jCurrentTimeMillis - (((long) this.LIZJ) * 86400000);
                    List<Long> listLJFF = LJFF();
                    ArrayList arrayList = new ArrayList();
                    for (Long l : listLJFF) {
                        if (l.longValue() >= j2) {
                            arrayList.add(l);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            long jLongValue = ((Number) it2.next()).longValue();
                            if (jLongValue - ((jLongValue + rawOffset) % 86400000) == j) {
                                return false;
                            }
                        }
                    }
                    return arrayList2.size() < this.LIZLLL;
                }

                @Override // X.AbstractC1929607h8
                public final boolean LJ() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long rawOffset = TimeZone.getDefault().getRawOffset();
                    long j = jCurrentTimeMillis - ((jCurrentTimeMillis + rawOffset) % 86400000);
                    long j2 = jCurrentTimeMillis - (((long) this.LIZJ) * 86400000);
                    List<Long> listLJFF = LJFF();
                    ArrayList arrayList = new ArrayList();
                    for (Long l : listLJFF) {
                        if (l.longValue() >= j2) {
                            arrayList.add(l);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            long jLongValue = ((Number) it2.next()).longValue();
                            if (jLongValue - ((jLongValue + rawOffset) % 86400000) == j) {
                                return false;
                            }
                        }
                    }
                    if (arrayList2.size() >= this.LIZLLL) {
                        return false;
                    }
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis));
                    this.LIZ.LJJJJ(this.LJFF, C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
                    return true;
                }

                @Override // X.AbstractC1929607h8
                public final String LIZJ() {
                    return this.LJ;
                }

                {
                    this.LIZJ = i;
                    this.LIZLLL = i2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("toast_version_");
                    sbLIZ.append("record_low_light_detected_hint");
                    sbLIZ.append('_');
                    sbLIZ.append(str);
                    this.LJ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("toast_timestamps_");
                    sbLIZ2.append("record_low_light_detected_hint");
                    this.LJFF = C2188811AlT.LIZIZ(sbLIZ2);
                    LIZIZ();
                }
            };
        }
        AbstractC1929607h8 abstractC1929607h8 = this.LLIZ;
        if (abstractC1929607h8 == null || abstractC1929607h8.LIZ()) {
            C09AE c09ae = this.LLILZLL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLILZLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C2247781CyO(30, 2000L, this, null), 2);
        }
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZ.getValue(this, LLJJJJ[1]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILZIL.getValue(this, LLJJJJ[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILLL.getValue(this, LLJJJJ[0]);
    }

    @Override // X.InterfaceC1650700t3c
    public void oO0() {
        if (this.LLIZLLLIL) {
            AbstractC1929607h8 abstractC1929607h8 = this.LLIZ;
            if (abstractC1929607h8 instanceof C1929507h7) {
                C1929507h7 c1929507h7 = (C1929507h7) abstractC1929607h8;
                c1929507h7.LIZ.LJJJJ(c1929507h7.LJFF, "true");
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Z1("LowLightHintComponent onDestroy");
        getRecordAdapterApi().PX1(null);
        super.onDestroy();
    }

    public final InterfaceC1650620t3U X1() {
        InterfaceC1650620t3U interfaceC1650620t3U = (InterfaceC1650620t3U) getDiContainer().LJIIL(null, InterfaceC1650620t3U.class);
        return interfaceC1650620t3U == null ? getRecordAdapterApi().eX1().LIZJ() : interfaceC1650620t3U;
    }

    public final void o2() {
        C0CNO.LIZLLL(0L, new AwS171S0101000_34(C2247791CyP.LIZIZ().hintTextType, this, 0));
    }

    @Override // X.InterfaceC1650700t3c
    public boolean Cx1() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1650700t3c
    public boolean Ed1() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C2247771CyN(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void Z1(String str) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "record_low_light_hint", str);
    }
}
