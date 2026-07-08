package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS300S0000000_16;

/* JADX INFO: renamed from: X.0lnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371600lnS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJLI;
    public List<InterfaceC1369790lkX> LIZ = new ArrayList();
    public EnumC1369720lkQ LIZIZ = EnumC1369720lkQ.EXPAND;
    public EnumC1369700lkO LIZJ = EnumC1369700lkO.MIDDLE;
    public EnumC1371620lnU LIZLLL = EnumC1371620lnU.SYNC;
    public List<String> LJ = new ArrayList();
    public List<InterfaceC1370310llN> LJFF = new ArrayList();
    public boolean LJI = true;
    public List<Integer> LJII = new ArrayList();
    public EnumC1369720lkQ LJIIIIZZ;
    public EnumC1369700lkO LJIIIZ;
    public EnumC1369700lkO LJIIJ;
    public EnumC1369720lkQ LJIIJJI;
    public EnumC1369720lkQ LJIIL;
    public EnumC1369700lkO LJIILIIL;
    public EnumC1369700lkO LJIILJJIL;
    public final List<String> LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public AbstractC19877212pu<InterfaceC1370310llN> LJIJ;
    public InterfaceC1371630lnV<InterfaceC1370310llN> LJIJI;
    public AbstractC19877212pu<InterfaceC1369790lkX> LJIJJ;
    public Comparator<InterfaceC1369790lkX> LJIJJLI;
    public Function2<? super InterfaceC1369790lkX, ? super Boolean, Boolean> LJIL;
    public Function1<? super InterfaceC1370310llN, Boolean> LJJ;
    public int LJJI;
    public int LJJIFFI;
    public float LJJII;
    public int LJJIII;
    public BaseSharePackage LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public Integer LJJIIZI;
    public Integer LJJIJ;
    public boolean LJJIJIIJI;
    public long LJJIJIIJIL;
    public View LJJIJIL;
    public C1370670llx LJJIJL;
    public C1370680lly LJJIJLIJ;
    public InterfaceC1366490lfD LJJIL;
    public InterfaceC1364520lc2 LJJIZ;
    public Function0<Boolean> LJJJ;
    public boolean LJJJI;
    public float LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public int LJJJJJ;
    public boolean LJJJJJL;
    public String LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public InterfaceC1631620sYq<? super Integer, ? super Boolean, ? super Integer, ? extends Pair<? extends View, ? extends FrameLayout.LayoutParams>> LJJJJZ;
    public Drawable LJJJJZI;
    public String LJJJLIIL;
    public String LJJJLL;
    public Function1<? super C0M7Y, Unit> LJJJLZIJ;
    public Boolean LJJJZ;
    public Boolean LJJL;
    public boolean LJJLI;
    public String LJJLIIIIJ;
    public final C1264130j07 LJJLIIIJ;
    public C1369950lkn LJJLIIIJILLIZJL;
    public C1370200llC LJJLIIIJJI;
    public C1369610lkF LJJLIIIJJIZ;
    public C1362230lYL LJJLIIIJL;
    public Boolean LJJLIIIJLJLI;
    public InterfaceC1370040lkw LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public C1370870lmH LJJLIL;
    public boolean LJJLJ;
    public boolean LJJLJLI;
    public Boolean LJJLL;
    public String LJJZ;
    public C1388300mEO LJJZZI;
    public InterfaceC1058150ddt LJJZZIII;
    public String LJL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1371600lnS.class, "parentView", "getParentView()Landroid/view/View;", 0);
        C13LE.LIZ.getClass();
        LJLI = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final C1371590lnR LJ() {
        return new C1371590lnR(this);
    }

    public final View LJI() {
        C1264130j07 c1264130j07 = this.LJJLIIIJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJLI;
        return (View) c1264130j07.LIZ.get();
    }

    public C1371600lnS() {
        EnumC1369720lkQ enumC1369720lkQ = EnumC1369720lkQ.HORIZONTAL;
        this.LJIIIIZZ = enumC1369720lkQ;
        EnumC1369700lkO enumC1369700lkO = EnumC1369700lkO.TOP;
        this.LJIIIZ = enumC1369700lkO;
        EnumC1369700lkO enumC1369700lkO2 = EnumC1369700lkO.BOTTOM;
        this.LJIIJ = enumC1369700lkO2;
        this.LJIIJJI = EnumC1369720lkQ.VERTICAL;
        this.LJIIL = enumC1369720lkQ;
        this.LJIILIIL = enumC1369700lkO2;
        this.LJIILJJIL = enumC1369700lkO;
        this.LJIILL = new ArrayList();
        this.LJIIZILJ = true;
        this.LJIJ = AbstractC19877212pu.LIZ(new Comparator() { // from class: X.0i9o
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        });
        this.LJIJJ = AbstractC19877212pu.LIZ(new Comparator() { // from class: X.0i9p
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        });
        this.LJIL = AFwS300S0000000_16.get$arr$(69);
        this.LJJ = AFwS257S0000000_19.get$arr$(696);
        this.LJJIFFI = R.attr.s3;
        this.LJJII = 1.0f;
        this.LJJIIJZLJL = true;
        this.LJJIJIIJIL = 100L;
        this.LJJJIL = 0.7f;
        this.LJJJJ = true;
        this.LJJJJJL = true;
        this.LJJJLIIL = "";
        this.LJJJLL = "";
        Boolean bool = Boolean.FALSE;
        this.LJJJZ = bool;
        this.LJJL = bool;
        this.LJJLIIIIJ = "";
        this.LJJLIIIJ = new C1264130j07(AFwS209S0000000_21.get$arr$(508));
    }

    public final void LIZ(Comparator comparator) {
        this.LJIJ = AbstractC19877212pu.LIZ(comparator);
    }

    public final void LIZIZ(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ.add(interfaceC1369790lkX);
    }

    public final void LIZJ(InterfaceC1370310llN interfaceC1370310llN) {
        this.LJFF.add(interfaceC1370310llN);
    }

    public final void LIZLLL(String str) {
        ((ArrayList) this.LJIILL).add(str);
    }

    public final void LJFF(Comparator comparator) {
        this.LJIJJLI = comparator;
        this.LJIJJ = AbstractC19877212pu.LIZ(comparator);
    }

    public final void LJII(View view) {
        C1264130j07 c1264130j07 = this.LJJLIIIJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJLI;
        c1264130j07.getClass();
        c1264130j07.LIZ = new WeakReference<>(view);
    }
}
