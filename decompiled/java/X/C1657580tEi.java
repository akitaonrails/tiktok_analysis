package X;

import Y.AObjectS246S0100000_25;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657580tEi extends AbstractC2255721DQs<InterfaceC1650770t3j> implements InterfaceC1650770t3j, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final List<C1650980t44> LLILZ;
    public final C1650980t44 LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final InterfaceC1657610tEl LLIZ;
    public final ShortVideoContext LLIZLLLIL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final a LLJ = (a) getDiContainer().LJII(a.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650670t3Z.class, null);
    public final InterfaceC1650770t3j LLJIJIL = this;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(104));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 165));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 164));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1657580tEi.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/aweme/ftc/speed/FTCSpeedApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = 8;
    }

    private final C1657620tEm Z1() {
        return (C1657620tEm) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1650770t3j
    public int Qp() {
        return this.LLIZ.Qp();
    }

    public final InterfaceC1650670t3Z X1() {
        return (InterfaceC1650670t3Z) this.LLJI.getValue(this, LLJJ[0]);
    }

    public final C1657600tEk o2() {
        return (C1657600tEk) this.LLJILJILJ.getValue();
    }

    public final C560530Lyd<Boolean> w2() {
        return (C560530Lyd) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLIZ.setItems(this.LLILZ);
        this.LLIZ.LIZIZ(this.LLILZIL);
        this.LL.add(this.LLILLL, o2(), "FTCToolbarScene");
        final C1657600tEk c1657600tEkO2 = o2();
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 163);
        c1657600tEkO2.getClass();
        final GestureDetector gestureDetector = new GestureDetector(c1657600tEkO2.getSceneContext(), new C1698440uIc(c1657600tEkO2, 0));
        RecyclerView recyclerView = c1657600tEkO2.LLJILJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setClickable(true);
        RecyclerView recyclerView2 = c1657600tEkO2.LLJILJIL;
        (recyclerView2 != null ? recyclerView2 : null).addOnItemTouchListener(new C0KFD() { // from class: X.0tEj
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView3, MotionEvent motionEvent) {
                InterfaceC1657650tEp interfaceC1657650tEp;
                C1650980t44 c1650980t44Xv;
                InterfaceC1657650tEp interfaceC1657650tEp2;
                gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 2) {
                    C1657600tEk c1657600tEk = c1657600tEkO2;
                    if (c1657600tEk.LLJJ) {
                        if (c1657600tEk.LLLIIIIL(1) == null) {
                            return false;
                        }
                        float x = motionEvent.getX() - c1657600tEkO2.LLJJI.getFirst().floatValue();
                        float y = motionEvent.getY() - c1657600tEkO2.LLJJI.getSecond().floatValue();
                        if (y > 88.0f || y < -88.0f) {
                            C1650980t44 c1650980t44Xv2 = c1657600tEkO2.xv(1);
                            if (c1650980t44Xv2 != null && (interfaceC1657650tEp = c1650980t44Xv2.LLJILJIL) != null) {
                                interfaceC1657650tEp.LIZIZ((int) motionEvent.getX(), (int) (motionEvent.getY() - r8.getTop()), (int) x, (int) y);
                            }
                            c1657600tEkO2.LLJJI = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
                        }
                        Rect rect = new Rect();
                        RecyclerView recyclerView4 = c1657600tEkO2.LLJILJIL;
                        if (recyclerView4 == null) {
                            recyclerView4 = null;
                        }
                        recyclerView4.getLocalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (c1650980t44Xv = c1657600tEkO2.xv(1)) != null && (interfaceC1657650tEp2 = c1650980t44Xv.LLJILJIL) != null) {
                            interfaceC1657650tEp2.LIZJ((int) motionEvent.getX(), (int) (motionEvent.getY() - r8.getTop()));
                        }
                    }
                }
                if (motionEvent.getAction() != 1 || !c1657600tEkO2.LLJJ) {
                    return false;
                }
                awS569S0100000_25.invoke();
                return true;
            }
        });
        this.LLJ.sK0().LIZ(this, new AObjectS246S0100000_25(this, 111));
        this.LLJ.RS().LIZ(this, new AObjectS246S0100000_25(this, 112));
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        List<C1650980t44> items;
        C1650980t44 next;
        super.onStart();
        if (!C1429350nIb.LIZ || (items = this.LLIZ.getItems()) == null) {
            return;
        }
        Iterator<C1650980t44> it2 = items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LL == 3) {
                    break;
                }
            }
        }
        C1650980t44 c1650980t44 = next;
        if (c1650980t44 != null) {
            this.LLIZ.Hu(c1650980t44);
        }
    }

    public InterfaceC1650770t3j W1() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1650770t3j
    public void Cl(List<? extends C1650980t44> list) {
        ArrayList arrayList = new ArrayList(this.LLIZ.getItems());
        Iterator<? extends C1650980t44> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
        this.LLIZ.setItems(arrayList);
    }

    @Override // X.InterfaceC1650770t3j
    public void Hu(C1650980t44 c1650980t44) {
        this.LLIZ.Hu(c1650980t44);
    }

    @Override // X.InterfaceC1650770t3j
    public void Jd0(boolean z) {
        if (C1447800nmM.LIZ(this.LL) == null) {
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (z) {
            if (o2().isVisible()) {
                this.LL.hide(o2());
            }
            if (!C523910Kgf.LIZ(Z1(), navigationSceneLIZ)) {
                C1657620tEm c1657620tEmZ1 = Z1();
                C569760MWg c569760MWg = new C569760MWg();
                c569760MWg.LIZ = true;
                c569760MWg.LIZJ = new C1661810tLX();
                navigationSceneLIZ.LLLLLLLLLL(c1657620tEmZ1, c569760MWg.LIZ());
                return;
            }
            return;
        }
        if (o2().isVisible()) {
            return;
        }
        this.LL.show(o2());
    }

    @Override // X.InterfaceC1650770t3j
    public void LLLZ(List<? extends C1650980t44> list) {
        ArrayList arrayList = new ArrayList(this.LLIZ.getItems());
        arrayList.addAll(list);
        this.LLIZ.setItems(arrayList);
    }

    @Override // X.InterfaceC1650770t3j
    public View LP1(int i) {
        return o2().LLLIIIIL(i);
    }

    @Override // X.InterfaceC1650770t3j
    public void cw(C1650980t44 c1650980t44) {
        this.LLIZ.cw(c1650980t44);
    }

    @Override // X.InterfaceC1650770t3j
    public void jc(int i) {
        this.LLIZ.jc(i);
    }

    @Override // X.InterfaceC1650770t3j
    public void m2(C1650980t44 c1650980t44) {
        this.LLIZ.m2(c1650980t44);
    }

    @Override // X.InterfaceC1650770t3j
    public void setItems(List<? extends C1650980t44> list) {
        this.LLIZ.setItems(list);
    }

    @Override // X.InterfaceC1650770t3j
    public C1650980t44 ss(int i) {
        return o2().xv(i);
    }

    public C1657580tEi(C19A3 c19a3, C1DRG c1drg, int i, List<C1650980t44> list, C1650980t44 c1650980t44, Function0<Unit> function0, int i2, InterfaceC1657610tEl interfaceC1657610tEl) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = c1650980t44;
        this.LLILZLL = function0;
        this.LLIZ = interfaceC1657610tEl;
        interfaceC1657610tEl.jc(i2);
    }
}
