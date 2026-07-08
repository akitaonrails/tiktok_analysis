package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0amk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948320amk extends C09AY implements Function1<Context, RecyclerView> {
    public final /* synthetic */ C05P1<C948300ami> LL;
    public final /* synthetic */ C05P1<Function1<Integer, AnchorPanelLayoutTypeSetting>> LLILLJJLI;
    public final /* synthetic */ C05P1<Function2<C948400ams, Integer, Unit>> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C05P1<Function2<Integer, Integer, Unit>> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948320amk(C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, String str, C05P0 c05p04, C05P0 c05p05) {
        super(1);
        this.LL = c05p0;
        this.LLILLJJLI = c05p02;
        this.LLILLL = c05p03;
        this.LLILZ = str;
        this.LLILZIL = c05p04;
        this.LLILZLL = c05p05;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ RecyclerView invoke(Context context) {
        Context context2 = context;
        RecyclerView recyclerView = new RecyclerView(context2);
        final C05P1<C948300ami> c05p1 = this.LL;
        final C05P1<Function1<Integer, AnchorPanelLayoutTypeSetting>> c05p12 = this.LLILLJJLI;
        final C05P1<Function2<C948400ams, Integer, Unit>> c05p13 = this.LLILLL;
        final String str = this.LLILZ;
        final C05P1<Function2<Integer, Integer, Unit>> c05p14 = this.LLILZIL;
        final C05P0<Boolean> c05p0 = this.LLILZLL;
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        C948360amo c948360amo = new C948360amo(new InterfaceC930220aJY() { // from class: X.0aml
            @Override // X.InterfaceC930220aJY
            public final void LIZLLL(int i) {
            }

            @Override // X.InterfaceC930220aJY
            public final void LJ(int i, int i2) {
            }

            @Override // X.InterfaceC930220aJY
            public final Integer LJFF() {
                return null;
            }

            @Override // X.InterfaceC930220aJY
            public final void LJI() {
            }

            @Override // X.InterfaceC930220aJY
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC930220aJY
            public final void LJIIIZ(int i) {
            }

            @Override // X.InterfaceC930220aJY
            public final int getPanelLayoutType() {
                return 1;
            }

            @Override // X.InterfaceC930220aJY
            public final int LIZJ() {
                return C1666070tSP.LIZIZ(c05p1).LIZLLL + 1;
            }

            @Override // X.InterfaceC930220aJY
            public final int LJII(int i) {
                AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSettingInvoke = c05p12.getValue().invoke(Integer.valueOf(i));
                if (anchorPanelLayoutTypeSettingInvoke != null) {
                    return anchorPanelLayoutTypeSettingInvoke.maxPosition;
                }
                return 1;
            }
        });
        c948360amo.LLIZLLLIL = new InterfaceC948410amt() { // from class: X.0amj
            @Override // X.InterfaceC948410amt
            public final void LIZ(int i, int i2) {
            }

            @Override // X.InterfaceC948410amt
            public final void LIZIZ(int i, C948400ams c948400ams) {
                if (!C1666070tSP.LIZIZ(c05p1).LJ) {
                    c05p13.getValue().invoke(c948400ams, Integer.valueOf(i));
                }
            }

            @Override // X.InterfaceC948410amt
            public final void LIZJ(View view, C948400ams c948400ams) {
                if (C1666070tSP.LIZIZ(c05p1).LJ) {
                    return;
                }
                C0H79.LIZIZ(view, c948400ams.LIZIZ, C1666070tSP.LIZIZ(c05p1).LIZLLL, c05p14.getValue(), str);
            }
        };
        recyclerView.setAdapter(c948360amo);
        c948360amo.LLLI(C1666070tSP.LIZIZ(c05p1).LIZ);
        int iLLLIILIL = c948360amo.LLLIILIL();
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        recyclerView.addItemDecoration(new C943340aei(iLLLIILIL, iLIZIZ, iLIZIZ));
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0amf
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                String str2;
                String str3;
                Integer numValueOf;
                if (recyclerView2.getScrollState() == 1 && !c05p0.getValue().booleanValue() && i != 0) {
                    C948100amO c948100amOLIZ = C0H79.LIZ();
                    if (c948100amOLIZ != null) {
                        str2 = c948100amOLIZ.LIZLLL;
                    } else {
                        str2 = null;
                    }
                    String strValueOf = String.valueOf(str2);
                    C948100amO c948100amOLIZ2 = C0H79.LIZ();
                    if (c948100amOLIZ2 != null) {
                        str3 = c948100amOLIZ2.LJ;
                    } else {
                        str3 = null;
                    }
                    String strValueOf2 = String.valueOf(str3);
                    C948100amO c948100amOLIZ3 = C0H79.LIZ();
                    if (c948100amOLIZ3 != null) {
                        numValueOf = Integer.valueOf(c948100amOLIZ3.LIZIZ());
                    } else {
                        numValueOf = null;
                    }
                    String strValueOf3 = String.valueOf(numValueOf);
                    List listLJII = C942210act.LIZ.LJII(null, false);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listLJII.iterator();
                    while (it2.hasNext()) {
                        String strValueOf4 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
                        if (strValueOf4 != null) {
                            arrayList.add(strValueOf4);
                        }
                    }
                    C931740aM0.LJIIJJI(new C931750aM1("swipe", strValueOf, strValueOf2, strValueOf3, null, arrayList, "origin_panel", str, 240));
                    c05p0.setValue(Boolean.TRUE);
                }
            }
        });
        return recyclerView;
    }
}
