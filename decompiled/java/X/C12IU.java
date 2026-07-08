package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12IU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12IU implements C12JF {
    public final Context LIZ;
    public final View LIZIZ;
    public final C12J0 LIZJ;
    public final C12IT LIZLLL;
    public final RelativeLayout LJ;
    public final C19518211Xw LJFF;
    public final ImageView LJI;

    @Override // X.C12JF
    public final void LIZ() {
        if (this.LIZLLL.LIZJ()) {
            C786410Ut5.Y4(this.LJ, 0.5f);
        } else {
            C786410Ut5.Y4(this.LJ, 1.0f);
            this.LJ.setContentDescription(this.LIZ.getString(2131826964));
        }
    }

    @Override // X.C12JF
    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams = this.LJ.getLayoutParams();
        if (BeautyContext.INSTANCE.supportSeekClear()) {
            C786410Ut5.D1(this.LJFF, 0);
            layoutParams.width = (int) C11VU.LIZIZ(76.0f, this.LIZ);
        } else {
            C786410Ut5.D1(this.LJFF, 8);
            layoutParams.width = (int) C11VU.LIZIZ(52.0f, this.LIZ);
        }
        this.LJFF.setTextSize(2, this.LIZJ.LJI.LIZIZ);
        this.LJI.setImageResource(this.LIZJ.LJI.LIZJ);
        this.LIZJ.getClass();
        C786410Ut5.LLIIL(this.LJ, 0);
        C786410Ut5.e6(this.LJ, layoutParams);
        C786410Ut5.S7(this.LJ, new ACListenerS163S0100000_29(this, 168));
        LIZ();
        C377000EqI.LIZ(this.LJ);
    }

    public final void LJFF() {
        ComposerBeauty composerBeauty;
        ArrayList<ComposerBeauty> arrayList;
        ComposerBeauty next;
        ArrayList<ComposerBeauty> arrayList2;
        Integer numValueOf;
        C19733412Iq c19733412IqLJIIIIZZ;
        ArrayList<ComposerBeauty> arrayList3;
        ComposerBeauty next2;
        ComposerBeauty next3;
        ComposerBeauty next4;
        C12IT c12it = this.LIZLLL;
        Iterator<BeautyCategory> it2 = c12it.LIZ.ne().iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty2 : it2.next().getBeautyList()) {
                if (composerBeauty2.isBeautyMode()) {
                    List<ComposerBeauty> childList = composerBeauty2.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                            C12IT.LJIIIZ(composerBeauty2, c12it);
                        }
                    }
                } else {
                    C12IT.LJIIIZ(composerBeauty2, c12it);
                }
            }
        }
        C12IT c12it2 = this.LIZLLL;
        c12it2.getClass();
        C12HU c12hu = new C12HU();
        Iterator<BeautyComposerInfo> it4 = c12it2.LIZ.ue().iterator();
        while (it4.hasNext()) {
            c12hu.add(it4.next());
        }
        Iterator<T> it5 = c12hu.iterator();
        while (true) {
            composerBeauty = null;
            if (!it5.hasNext()) {
                break;
            }
            String str = ((BeautyComposerInfo) it5.next()).effectId;
            for (BeautyCategory beautyCategory : c12it2.LIZ.ne()) {
                ComposerBeauty composerBeauty3 = (ComposerBeauty) C13LP.LJJJLL(beautyCategory.getBeautyList());
                if (composerBeauty3 == null || !composerBeauty3.isBeautyMode()) {
                    Iterator<ComposerBeauty> it6 = beautyCategory.getBeautyList().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next3 = it6.next();
                            if (Intrinsics.LJFF(next3.getEffect().getEffectId(), str)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty4 = next3;
                    if (composerBeauty4 != null) {
                        c12it2.LJIIJ(composerBeauty4, null);
                    }
                } else {
                    Iterator<ComposerBeauty> it7 = beautyCategory.getBeautyList().iterator();
                    while (it7.hasNext()) {
                        List<ComposerBeauty> childList2 = it7.next().getChildList();
                        if (childList2 != null) {
                            Iterator<ComposerBeauty> it8 = childList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next4 = it8.next();
                                    if (Intrinsics.LJFF(next4.getEffect().getEffectId(), str)) {
                                        break;
                                    }
                                } else {
                                    next4 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty5 = next4;
                            if (composerBeauty5 != null) {
                                c12it2.LJIIJ(composerBeauty5, null);
                            }
                        }
                    }
                }
            }
        }
        List<BeautyCategory> listNe = c12it2.LIZ.ne();
        ArrayList<BeautyCategory> arrayList4 = new ArrayList();
        for (BeautyCategory beautyCategory2 : listNe) {
            if (beautyCategory2.getBeautyCategoryExtra().exclusive) {
                arrayList4.add(beautyCategory2);
            }
        }
        for (BeautyCategory beautyCategory3 : arrayList4) {
            Iterator<ComposerBeauty> it9 = beautyCategory3.getBeautyList().iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                ComposerBeauty composerBeauty6 = next2;
                if (composerBeauty6.getExtra().getDefault() && composerBeauty6.getEnable()) {
                    break;
                }
            }
            ComposerBeauty composerBeauty7 = next2;
            if (composerBeauty7 != null) {
                C12IT.LIZLLL(c12it2, composerBeauty7, beautyCategory3.getBeautyList());
                c12it2.LIZ.ve(composerBeauty7, new C19732112Id(c12it2));
            } else {
                List<ComposerBeauty> beautyList = beautyCategory3.getBeautyList();
                if (beautyList != null && !beautyList.isEmpty()) {
                    C12IT.LIZLLL(c12it2, (ComposerBeauty) ListProtector.get(beautyList, 0), beautyCategory3.getBeautyList());
                    c12it2.LIZ.ve((ComposerBeauty) ListProtector.get(beautyList, 0), new C19732112Id(c12it2));
                }
            }
        }
        for (BeautyCategory beautyCategory4 : c12it2.LIZ.ne()) {
            c12it2.LIZ.qe();
            List<ComposerBeauty> beautyList2 = beautyCategory4.getBeautyList();
            ArrayList arrayList5 = new ArrayList();
            for (ComposerBeauty composerBeauty8 : beautyList2) {
                if (composerBeauty8.isCollectionType()) {
                    arrayList5.add(composerBeauty8);
                }
            }
            Iterator it10 = arrayList5.iterator();
            while (it10.hasNext()) {
                C12IT.LJFF((ComposerBeauty) it10.next(), c12it2);
            }
        }
        C12IT c12it3 = this.LIZLLL;
        C12IV c12iv = (C12IV) c12it3.LJ.LIZ(C12IV.class);
        if (c12iv != null) {
            if (c12iv.LIZLLL()) {
                C19733412Iq c19733412IqLJIIL = c12iv.LJIIL();
                if (c19733412IqLJIIL != null && (arrayList3 = c19733412IqLJIIL.LLILZ) != null) {
                    Iterator<ComposerBeauty> it11 = arrayList3.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            break;
                        }
                        ComposerBeauty next5 = it11.next();
                        if (Intrinsics.LJFF(next5, c12iv.LJIILJJIL())) {
                            composerBeauty = next5;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty9 = composerBeauty;
                    if (composerBeauty9 != null) {
                        C12IT.LJI(composerBeauty9, c12it3);
                    }
                }
            } else {
                C19733412Iq c19733412IqLJIIIIZZ2 = c12iv.LJIIIIZZ();
                if (c19733412IqLJIIIIZZ2 != null && (arrayList = c19733412IqLJIIIIZZ2.LLILZ) != null) {
                    Iterator<ComposerBeauty> it12 = arrayList.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next = it12.next();
                            if (Intrinsics.LJFF(next, c12iv.LJIIIZ())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty10 = next;
                    if (composerBeauty10 != null) {
                        C12IT.LJI(composerBeauty10, c12it3);
                        C19733412Iq c19733412IqLJIIIIZZ3 = c12iv.LJIIIIZZ();
                        if (c19733412IqLJIIIIZZ3 != null && (arrayList2 = c19733412IqLJIIIIZZ3.LLILZ) != null && (numValueOf = Integer.valueOf(arrayList2.indexOf(composerBeauty10))) != null && numValueOf.intValue() >= 0 && numValueOf.intValue() < c12iv.LJIIIIZZ().LLILZ.size() && (c19733412IqLJIIIIZZ = c12iv.LJIIIIZZ()) != null) {
                            c19733412IqLJIIIIZZ.LLLFZ(composerBeauty10);
                        }
                    }
                }
            }
        }
        C12IT c12it4 = this.LIZLLL;
        c12it4.LIZ.Ie();
        c12it4.LIZ.LIZLLL(true);
        C12IV c12iv2 = (C12IV) c12it4.LJ.LIZ(C12IV.class);
        if (c12iv2 != null) {
            c12iv2.LIZJ(true);
        }
        LIZ();
        InterfaceC19732212Ie interfaceC19732212Ie = (InterfaceC19732212Ie) this.LIZLLL.LJ.LIZ(InterfaceC19732212Ie.class);
        if (interfaceC19732212Ie != null) {
            interfaceC19732212Ie.LIZJ();
        }
    }

    @Override // X.C12JF
    public final void V3() {
        LJFF();
    }

    @Override // X.C12JF
    public final void LIZIZ(Map<ComposerBeauty, Float> map) {
        C12IT c12it = this.LIZLLL;
        c12it.getClass();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            ComposerBeauty composerBeauty = (ComposerBeauty) entry.getKey();
            AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c12it, (C12IT) entry, (Map.Entry<ComposerBeauty, Float>) 57);
            if (composerBeauty.isCollectionType()) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<ComposerBeauty> it2 = childList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ComposerBeauty next = it2.next();
                            if (next.getSelected()) {
                                if (next != null) {
                                    awS395S0200000_29.invoke(next);
                                }
                            }
                        }
                    }
                }
            } else {
                awS395S0200000_29.invoke(composerBeauty);
            }
        }
    }

    @Override // X.C12JF
    public final void LIZLLL(boolean z) {
        C12IT c12it = this.LIZLLL;
        c12it.LIZ.af(z, true);
        C12IV c12iv = (C12IV) c12it.LJ.LIZ(C12IV.class);
        if (c12iv != null) {
            c12iv.LIZJ(true);
        }
    }

    @Override // X.C12JF
    public final void LJ(List<ComposerBeauty> list) {
        C12IT c12it = this.LIZLLL;
        c12it.getClass();
        Iterator<ComposerBeauty> it2 = list.iterator();
        while (it2.hasNext()) {
            C12IT.LJII(it2.next(), new AwS608S0100000_29(c12it, 477));
        }
        Iterator<ComposerBeauty> it3 = list.iterator();
        while (it3.hasNext()) {
            C12IT.LJII(it3.next(), new AwS608S0100000_29(c12it, 478));
        }
        Iterator<ComposerBeauty> it4 = list.iterator();
        while (it4.hasNext()) {
            C12IT.LJII(it4.next(), new AwS608S0100000_29(c12it, 479));
        }
    }

    public C12IU(Context context, View view, C12J0 c12j0, C12IT c12it) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c12j0;
        this.LIZLLL = c12it;
        this.LJ = (RelativeLayout) view.findViewById(R.id.tnt);
        this.LJFF = (C19518211Xw) view.findViewById(R.id.zej);
        this.LJI = (ImageView) view.findViewById(R.id.lck);
    }
}
