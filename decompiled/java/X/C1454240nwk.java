package X;

import Y.ACListenerS156S0100000_22;
import Y.AsS17S0110000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import com.ss.android.ugc.aweme.image.collage.view.CenterLinearLayoutManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS448S0200000_12;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0nwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454240nwk extends AbstractC1664490tPr<C1454230nwj, C1454220nwi> implements InterfaceC362610EJn, InterfaceC484050IyZ {
    public CollageIntParam LLJJJIL;
    public C0F2K LLJJJJJIL;
    public RecyclerView LLJJJJLIIL;
    public RecyclerView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxIconView LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public ViewGroup LLJLLIL;
    public C0GSR LLJLLL;
    public C21368618js LLL;
    public int LLJJJJ = -1;
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(74));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(72));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 119));
    public final int LLLFF = C1450870nrJ.LIZIZ;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 114));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 112));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 115));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(73));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 118));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 113));

    public final C1454190nwf LLLLLJIL() {
        return (C1454190nwf) this.LLLFZ.getValue();
    }

    public final C0TM3 LLLLLJLJLL() {
        return (C0TM3) this.LLJZIJLIL.getValue();
    }

    public final void LLLLLLIL() {
        ViewGroup viewGroup;
        C0F2K c0f2k = this.LLJJJJJIL;
        if (c0f2k != null) {
            ViewParent parent = c0f2k.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c0f2k, viewGroup);
            }
        }
        this.LLJJJJJIL = null;
        this.LLJJJJ = -1;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        ViewGroup viewGroup;
        C436230H8r c436230H8r = (C436230H8r) this.LLLII.getValue();
        C1322110kVd c1322110kVd = c436230H8r.LIZ;
        if (c1322110kVd != null) {
            c1322110kVd.setController(null);
            ViewParent parent = c1322110kVd.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1322110kVd, viewGroup);
            }
        }
        c436230H8r.LIZ = null;
        super.onDestroyView();
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        InterfaceC524950KiL interfaceC524950KiL;
        C21368618js c21368618js = this.LLL;
        if (c21368618js != null) {
            c21368618js.LIZIZ(new AwS566S0100000_22(this, 116), new AwS566S0100000_22(this, 117));
        }
        C128Y c128yLIZ = C372650EjH.LIZ(this);
        if (!(c128yLIZ instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) c128yLIZ) == null) {
            return;
        }
        interfaceC524950KiL.Qh(this);
        interfaceC524950KiL.kF(this);
    }

    public final VideoPublishEditModel LLLLLL() {
        return LLLLILI().LIZ.LIZ;
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        InterfaceC524950KiL interfaceC524950KiL;
        C128Y c128yLIZ = C372650EjH.LIZ(this);
        if (!(c128yLIZ instanceof InterfaceC524950KiL) || (interfaceC524950KiL = (InterfaceC524950KiL) c128yLIZ) == null) {
            return;
        }
        interfaceC524950KiL.T4(this);
        interfaceC524950KiL.b8(this);
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                tuxIconView.performClick();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC1452680nuE abstractC1452680nuE;
        int screenHeight;
        int statusBarHeight;
        int statusBarHeight2;
        View view2;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tsc);
        C21368618js c21368618js = null;
        if (viewGroup != null) {
            C426750GoL.LJIIL(viewGroup, null, Integer.valueOf(((Number) this.LLLF.getValue()).intValue()), null, null, 29);
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nxB
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return true;
                }
            });
        } else {
            viewGroup = null;
        }
        Context contextRequireSceneContext = requireSceneContext();
        C372580EjA c372580EjA = new C372580EjA(contextRequireSceneContext);
        c372580EjA.LJII = true;
        c372580EjA.LIZIZ = EnumC372850Ejb.NO_NAV_BAR;
        c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d5g, viewGroup, false);
        int i = C21368618js.LJIJ;
        c372580EjA.LIZLLL = C1697810uHb.LJIILJJIL(new C372880Eje(i, 2));
        c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), R.layout.d5f, viewGroup, false);
        C372830EjZ c372830EjZ = new C372830EjZ(c372580EjA);
        if (viewGroup != null) {
            viewGroup.addView(c372830EjZ, -1, -1);
        }
        this.LLJJJJLIIL = (RecyclerView) findViewById(R.id.txb);
        this.LLJJL = (RecyclerView) findViewById(R.id.tvv);
        this.LLJLIL = (TuxIconView) findViewById(R.id.lcx);
        this.LLJL = findViewById(R.id.e5u);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) findViewById(R.id.lap);
        int i2 = (int) (this.LLLFF / 0.75f);
        this.LLJLILLLLZIIL = (FrameLayout) findViewById(R.id.e5v);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.iur);
        if (viewGroup2 != null) {
            viewGroup2.getLayoutParams().height = i2;
        } else {
            viewGroup2 = null;
        }
        this.LLJLLIL = viewGroup2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.rpd);
        if (frameLayout != null) {
            frameLayout.getLayoutParams().height = i2;
        } else {
            frameLayout = null;
        }
        this.LLJLL = frameLayout;
        if (C0BLZ.LIZ()) {
            C0GSR c0gsr = (C0GSR) findViewById(R.id.rqk);
            if (c0gsr != null) {
                c0gsr.getLayoutParams().height = i2;
                c0gsr.setColorRes(R.attr.ob);
            } else {
                c0gsr = null;
            }
            this.LLJLLL = c0gsr;
        }
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter((AbstractC21673619ry) this.LLJZ.getValue());
        }
        ((C745280TLi) this.LLJZ.getValue()).LLILLL = new InterfaceC745300TLk() { // from class: X.0TM8
            @Override // X.InterfaceC745300TLk
            public final boolean LIZIZ(C745310TLl c745310TLl) {
                if (((C1454530nxD) this.LIZ.LLLIIIIL.getValue()).LLILZ) {
                    return false;
                }
                C0TM3 c0tm3LLLLLJLJLL = this.LIZ.LLLLLJLJLL();
                Integer num = c0tm3LLLLLJLJLL.LLILLL.get(Integer.valueOf(c745310TLl.LIZ));
                if (num != null) {
                    int iIntValue = num.intValue();
                    C0TM5 c0tm5 = c0tm3LLLLLJLJLL.LLILZIL;
                    if (c0tm5 != null) {
                        c0tm5.LIZJ(iIntValue, true);
                    }
                }
                return true;
            }

            @Override // X.InterfaceC745300TLk
            public final void LIZ(int i3, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initTabRecyclerView scrollToPos: ");
                sbLIZ.append(i3);
                sbLIZ.append(" smooth: ");
                sbLIZ.append(z);
                C1454250nwl.LIZ("ImageCollageScene", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    RecyclerView recyclerView2 = this.LIZ.LLJJJJLIIL;
                    if (recyclerView2 != null) {
                        recyclerView2.smoothScrollToPosition(i3);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView3 = this.LIZ.LLJJJJLIIL;
                if (recyclerView3 == null) {
                    return;
                }
                C688990R0v.LIZ(recyclerView3, i3);
            }
        };
        RecyclerView recyclerView2 = this.LLJJL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new CenterLinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setAdapter(LLLLLJLJLL());
            recyclerView2.addOnScrollListener(new AsS17S0110000_12(this, 0));
        }
        LLLLLJLJLL().LLILZIL = new C0TM5() { // from class: X.0UoO
            @Override // X.C0TM5
            public final void LIZIZ(CollageIntParam collageIntParam) {
                if (((C1454530nxD) this.LIZ.LLLIIIIL.getValue()).LLILZ) {
                    return;
                }
                C1454240nwk c1454240nwk = this.LIZ;
                c1454240nwk.LLLLLLIL();
                ((C1454530nxD) c1454240nwk.LLLIIIIL.getValue()).LLIZ = -1;
                c1454240nwk.LLJJJIL = collageIntParam;
                C1454380nwy c1454380nwyLJIIIZ = C1454030nwP.LJIIIZ(collageIntParam);
                List listLJJJJLI = C13LP.LJJJJLI(c1454240nwk.LLLLLJIL().LIZJ);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
                Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C1454420nx2) it2.next()).LIZ);
                }
                c1454240nwk.LLLLIL().LJI.invoke(c1454380nwyLJIIIZ, arrayList, new AwS448S0200000_12(c1454240nwk, c1454380nwyLJIIIZ, 2));
                C0GSR c0gsr2 = c1454240nwk.LLJLLL;
                if (c0gsr2 != null) {
                    c0gsr2.setPattern(collageIntParam);
                }
                ((C745280TLi) this.LIZ.LLJZ.getValue()).LLLFZ(collageIntParam.getCells().size());
            }

            @Override // X.C0TM5
            public final void LIZ(int i3, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initLayoutRecyclerView scrollToPos: ");
                sbLIZ.append(i3);
                sbLIZ.append(" smooth: ");
                sbLIZ.append(z);
                C1454250nwl.LIZ("ImageCollageScene", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    RecyclerView recyclerView3 = this.LIZ.LLJJL;
                    if (recyclerView3 != null) {
                        recyclerView3.smoothScrollToPosition(i3);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView4 = this.LIZ.LLJJL;
                if (recyclerView4 == null) {
                    return;
                }
                C688990R0v.LIZ(recyclerView4, i3);
            }

            @Override // X.C0TM5
            public final void LIZJ(int i3, boolean z) {
                LinearLayoutManager linearLayoutManager;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initLayoutRecyclerView scrollToPosStart: ");
                sbLIZ.append(i3);
                sbLIZ.append(" smooth: ");
                sbLIZ.append(z);
                C1454250nwl.LIZ("ImageCollageScene", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    RecyclerView recyclerView3 = this.LIZ.LLJJL;
                    if (recyclerView3 != null) {
                        C688990R0v.LIZIZ(recyclerView3, i3);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView4 = this.LIZ.LLJJL;
                if (recyclerView4 == null) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView4.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                    return;
                }
                linearLayoutManager.scrollToPositionWithOffset(i3, 0);
            }
        };
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 6));
        }
        TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS156S0100000_22(this, 7));
        }
        ((InterfaceC1461390o8H) this.LLLI.getValue()).LIZIZ(new GestureInteractItem(0, (C0FUM) this.LLLIIIIL.getValue()));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nwt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1454230nwj) obj).LJII;
            }
        }, AFwS231S0000000_3.get$arr$(45));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nwv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1454230nwj) obj).LJIIIZ;
            }
        }, new AwS591S0100000_12(this, 614));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nww
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1454230nwj) obj).LJIIJ;
            }
        }, new AwS591S0100000_12(this, 615));
        View view3 = this.LLJL;
        if (view3 != null && (abstractC1452680nuE = LLLLILI().LIZ.LIZJ) != null) {
            VESize initSize = abstractC1452680nuE.LJJ().getInitSize();
            int i3 = initSize.width;
            if (Build.VERSION.SDK_INT >= 35) {
                statusBarHeight = ((ScreenUtils.getScreenHeight(getSceneContext()) - i) - ((i3 * 4) / 3)) / 2;
                statusBarHeight2 = ScreenUtils.getStatusBarHeight(getSceneContext());
            } else {
                Scene scene = this.mParentScene;
                if (scene != null && (view2 = scene.mView) != null) {
                    screenHeight = view2.getHeight();
                } else {
                    screenHeight = ScreenUtils.getScreenHeight(getSceneContext());
                }
                statusBarHeight = (((screenHeight - i) - ScreenUtils.getStatusBarHeight(getSceneContext())) - ((i3 * 4) / 3)) / 2;
                statusBarHeight2 = ScreenUtils.getStatusBarHeight(getSceneContext());
            }
            c21368618js = new C21368618js(view3, abstractC1452680nuE, LLLLILI().LIZ.LIZLLL, initSize.width, initSize.height, statusBarHeight + statusBarHeight2);
        }
        this.LLL = c21368618js;
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (i != 10011 || i2 != -1) {
            return false;
        }
        ArrayList parcelableArrayListExtra2 = null;
        if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("photo_mode_add_media_data");
            parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("key_choose_media_data");
        } else {
            parcelableArrayListExtra = null;
        }
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty() || parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
            return true;
        }
        MediaModel mediaModel = (MediaModel) C13LP.LJJJLL(parcelableArrayListExtra);
        if (mediaModel == null) {
            return false;
        }
        CollageInnerImageInfo collageInnerImageInfoLIZ = C1454030nwP.LIZ(mediaModel);
        C1454420nx2 c1454420nx2LIZIZ = LLLLLJIL().LIZIZ(this.LLJJJJ);
        if (c1454420nx2LIZIZ == null) {
            return false;
        }
        LLLLLJIL().LIZJ(this.LLJJJJ, collageInnerImageInfoLIZ);
        LLLLIL().LJII.invoke(c1454420nx2LIZIZ);
        return true;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eq7, viewGroup, false);
    }
}
