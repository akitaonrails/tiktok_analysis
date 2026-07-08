package X;

import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;

/* JADX INFO: renamed from: X.0t8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654020t8y extends AbstractC1664470tPp<InterfaceC1653810t8d, C1654180t9E, C1654190t9F> implements InterfaceC379610EuV, InterfaceC1653810t8d {
    public static final C1654250t9L LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C19A3 LLILLL;
    public final int LLILZ;
    public final C1DRG LLILZIL;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C1653860t8i.class, null);
    public final C11PQ<List<InterfaceC1654170t9D>> LLJILJIL = new C11PQ<>();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 380));
    public final C11SU<Pair<InterfaceC1654170t9D, Boolean>> LLJILLL = C11SU.LJLLLLLL();
    public final C1654040t90 LLJJ;
    public EnumC1653870t8j LLJJI;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0t9L] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654020t8y.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1654020t8y.class, "planCUiApiComponent", "getPlanCUiApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1654020t8y.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1654020t8y.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(C1654020t8y.class, "shootModeApi", "getShootModeApi()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0), new C2217381BqS(C1654020t8y.class, "tabRepository", "getTabRepository()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabRepository;", 0)};
        LLJJIII = new Object() { // from class: X.0t9L
        };
        LLJJIJIIJIL = 8;
    }

    private final List<InterfaceC1654170t9D> E3() {
        return (List) this.LLJILJILJ.getValue();
    }

    private final AbstractC21664519qV q3() {
        return new AbstractC21664519qV() { // from class: X.0t8x
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.v3().HF1() || !this.LL.LLJJ.isVisible()) {
                    return false;
                }
                if (motionEvent != null && motionEvent2 != null) {
                    if (this.LL.getShortVideoContext().LJII() != 0) {
                        return false;
                    }
                    AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                    if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                    if (abstractC21664519qVZk12 != null && abstractC21664519qVZk12.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                        return this.LL.O3(motionEvent2, motionEvent);
                    }
                    if (motionEvent.getX() <= motionEvent2.getX() || Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                        return false;
                    }
                    return this.LL.O3(motionEvent2, motionEvent);
                }
                return this instanceof r1k.a;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.v3().HF1() || !this.LL.LLJJ.isVisible() || motionEvent == null || motionEvent2 == null || this.LL.getShortVideoContext().LJII() != 0) {
                    return false;
                }
                AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onScroll(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
                AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                if ((abstractC21664519qVZk12 == null || !abstractC21664519qVZk12.onScroll(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    return false;
                }
                return true;
            }
        };
    }

    public final InterfaceC1653800t8c B3() {
        return (InterfaceC1653800t8c) this.LLJI.getValue(this, LLJJIJI[4]);
    }

    public final C1653860t8i H3() {
        return (C1653860t8i) this.LLJIJIL.getValue(this, LLJJIJI[5]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLIZLLLIL.getValue(this, LLJJIJI[2]);
    }

    public final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJ.getValue(this, LLJJIJI[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLJJIJI[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1654180t9E> o2() {
        return AFwS214S0000000_25.get$arr$(201);
    }

    public final a v3() {
        return (a) this.LLIZ.getValue(this, LLJJIJI[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1654190t9F> w2() {
        return new AwS569S0100000_25(this, 379);
    }

    private final void Xi() {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            getGestureApiComponent().AL1(q3(), 4, 200);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1654060t92(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.InterfaceC1653810t8d
    public EnumC1653870t8j LLLLLJIL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1653810t8d
    public void C6(boolean z) {
        C1654040t90 c1654040t90 = this.LLJJ;
        TabHost tabHost = c1654040t90.LLJJL;
        if (tabHost != null) {
            tabHost.setScrollEnabled(z);
        }
        TabHost tabHost2 = c1654040t90.LLJJL;
        if (tabHost2 != null) {
            tabHost2.setUISwitchEnabled(z);
        }
    }

    @Override // X.InterfaceC1653810t8d
    public void Vv0(boolean z) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootTopTapComponent top tap toggleVisibility: ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (!this.LLILLL.isAdded(this.LLJJ)) {
                this.LLILLL.add(this.LLILZ, this.LLJJ, "ShootTopTapComponent");
                return;
            } else {
                this.LLILLL.show(this.LLJJ);
                return;
            }
        }
        if (!this.LLILLL.isAdded(this.LLJJ)) {
            return;
        }
        this.LLILLL.hide(this.LLJJ);
    }

    @Override // X.InterfaceC1653810t8d
    public void gf2(EnumC1653870t8j enumC1653870t8j) {
        this.LLJJI = enumC1653870t8j;
    }

    @Override // X.InterfaceC1653810t8d
    public boolean qc2(EnumC1653870t8j enumC1653870t8j) {
        List<InterfaceC1654170t9D> listE3 = E3();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listE3, 10));
        Iterator<InterfaceC1654170t9D> it2 = listE3.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJIIJJI());
        }
        return arrayList.contains(enumC1653870t8j);
    }

    public final boolean O3(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent.getX() > motionEvent2.getX() && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent2.getY() - motionEvent.getY())) {
            this.LLJJ.LLLLLLIL(true);
            return true;
        }
        if (motionEvent2.getX() <= motionEvent.getX() || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent2.getY() - motionEvent.getY())) {
            return false;
        }
        this.LLJJ.LLLLLLIL(false);
        return true;
    }

    public final void Q3(InterfaceC1654170t9D interfaceC1654170t9D, int i) {
        Object value;
        B3().WF(interfaceC1654170t9D.LJIIJJI(), i);
        this.LLJJI = interfaceC1654170t9D.LJIIJJI();
        C1653860t8i c1653860t8iH3 = H3();
        EnumC1653870t8j enumC1653870t8jLJIIJJI = interfaceC1654170t9D.LJIIJJI();
        Iterator<C1657380tEO> it2 = ((C1654080t94) ListProtector.get(c1653860t8iH3.LIZ.LIZ.LIZ.LIZ, ((Number) c1653860t8iH3.LIZJ.getValue()).intValue())).LIZJ.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LIZIZ == enumC1653870t8jLJIIJJI) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        C2252321DDq c2252321DDq = c1653860t8iH3.LJ;
        do {
            value = c2252321DDq.getValue();
            ((Number) value).intValue();
        } while (!c2252321DDq.compareAndSet(value, Integer.valueOf(i2)));
    }

    @Override // X.InterfaceC1653810t8d
    public void mG1(EnumC1653870t8j enumC1653870t8j, int i) {
        i3(new AwS131S0101000_25(enumC1653870t8j, i, 4));
        this.LLJJI = enumC1653870t8j;
    }

    @Override // X.InterfaceC1653810t8d
    public void n41(InterfaceC1654170t9D interfaceC1654170t9D, boolean z) {
        this.LLJILLL.onNext(new Pair<>(interfaceC1654170t9D, Boolean.valueOf(z)));
    }

    public C1654020t8y(C19A3 c19a3, int i, C1DRG c1drg) {
        this.LLILLL = c19a3;
        this.LLILZ = i;
        this.LLILZIL = c1drg;
        List<C1657380tEO> list = ((C1654080t94) H3().LIZLLL.getValue()).LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator<C1657380tEO> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1654170t9D interfaceC1654170t9D = C1653950t8r.LIZ.get(it2.next().LIZIZ);
            if (interfaceC1654170t9D != null) {
                arrayList.add(interfaceC1654170t9D);
            }
        }
        C1654040t90 c1654040t90 = new C1654040t90(arrayList, this.LLJILJIL, v3().va(), this.LLJILLL);
        W1(c1654040t90);
        this.LLJJ = c1654040t90;
        this.LLJJI = EnumC1653870t8j.STORY;
    }
}
