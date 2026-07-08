package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0mnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409900mnE extends AbstractC1664490tPr<C1409750mmz, C1409760mn0> {
    public ViewGroup LLJJJIL;
    public C1415620mwS LLJJJJ;
    public final C1466910oHB LLJJJJJIL = new C1466910oHB(this, 1);

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        View view;
        C1415620mwS c1415620mwS = this.LLJJJJ;
        if (c1415620mwS != null && (view = c1415620mwS.LLJI) != null && view.getVisibility() == 0) {
            c1415620mwS.LIZLLL();
            View view2 = c1415620mwS.LLJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            C1390410mHn c1390410mHn = c1415620mwS.LLJIJIL;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 8);
            }
            C1390410mHn c1390410mHn2 = c1415620mwS.LLJIJIL;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZLLL();
            }
        }
        C1447800nmM.LIZIZ(this).LLLLLLLZIL(this.LLJJJJJIL);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLJJJJJIL);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJJ = (C1415620mwS) requireViewById(R.id.kt6);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mn6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1409750mmz) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 102));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mnB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1409750mmz) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 103));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mnC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1409750mmz) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 104));
        C1415620mwS c1415620mwS = this.LLJJJJ;
        if (c1415620mwS != null) {
            c1415620mwS.setOnItemExposed(new AwS636S0100000_22(this, 4));
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mn8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1409750mmz) obj).LJ;
            }
        }, new AwS601S0100000_22(this, 105));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mn7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1409750mmz) obj).LJFF;
            }
        }, new AwS601S0100000_22(this, 99));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mnA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1409750mmz) obj).LJI;
            }
        }, new AwS601S0100000_22(this, 100));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mn9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1409750mmz) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 101));
        C1415620mwS c1415620mwS2 = this.LLJJJJ;
        if (c1415620mwS2 != null) {
            c1415620mwS2.setInspirationPanelClickListener(new InterfaceC1410010mnP() { // from class: X.0mnD
                @Override // X.InterfaceC1410010mnP
                public final void LIZJ() {
                    this.LIZ.LLLLIL().LJ.invoke();
                }

                @Override // X.InterfaceC1410010mnP
                public final void LIZ(boolean z) {
                    this.LIZ.LLLLIL().LIZLLL.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1410010mnP
                public final void LIZIZ(boolean z) {
                    this.LIZ.LLLLIL().LIZJ.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1410010mnP
                public final void LIZLLL(int i) {
                    C1415620mwS c1415620mwS3 = this.LIZ.LLJJJJ;
                    if (c1415620mwS3 != null) {
                        View view = c1415620mwS3.LLILLJJLI;
                        if (view != null) {
                            view.setEnabled(true);
                        }
                        View view2 = c1415620mwS3.LLILLJJLI;
                        if (view2 != null) {
                            C786410Ut5.T4(view2, 1.0f);
                        }
                    }
                    this.LIZ.LLLLIL().LIZIZ.invoke(Integer.valueOf(i));
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eoc, viewGroup, false);
        if (viewTd instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewTd;
        } else {
            viewGroup2 = null;
        }
        this.LLJJJIL = viewGroup2;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        throw new IllegalArgumentException("parentLayout is null");
    }
}
