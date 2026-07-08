package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.12HO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$initComposerNodes$2$list$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
public final class C12HO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C12HU<BeautyComposerInfo>>, Object> {
    public final /* synthetic */ C12HN LL;
    public final /* synthetic */ ArrayList<BeautyCategory> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12HO(C12HN c12hn, ArrayList<BeautyCategory> arrayList, InterfaceC1364105Vn<? super C12HO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c12hn;
        this.LLILLJJLI = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12HO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        Object next3;
        C787110UuD next4;
        ComposerBeauty next5;
        ComposerBeauty next6;
        boolean z;
        List<ComposerBeauty> childList;
        ComposerBeauty next7;
        ComposerBeauty next8;
        BeautyCategory next9;
        C1C7U.LIZ("BeautySource@786f.initComposerNodes$2$list$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C12HN c12hn = this.LL;
        ArrayList<BeautyCategory> arrayList = this.LLILLJJLI;
        c12hn.getClass();
        Iterator<BeautyCategory> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().setSelected(false);
        }
        Iterator<BeautyCategory> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            for (ComposerBeauty composerBeauty : it3.next().getBeautyList()) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                    if (childList2 != null) {
                        Iterator<ComposerBeauty> it4 = childList2.iterator();
                        while (it4.hasNext()) {
                            C12HN.LJIIIZ(it4.next());
                        }
                    }
                    C12HN.LJIIIZ(composerBeauty);
                } else {
                    C12HN.LJIIIZ(composerBeauty);
                }
            }
        }
        String strLIZ = c12hn.LIZ.LIZ(c12hn.LJJIIJZLJL);
        if (strLIZ != null) {
            Iterator<BeautyCategory> it5 = arrayList.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next9 = it5.next();
                    if (Intrinsics.LJFF(next9.getCategoryResponse().getId(), strLIZ)) {
                        break;
                    }
                } else {
                    next9 = null;
                    break;
                }
            }
            BeautyCategory beautyCategory = next9;
            if (beautyCategory != null) {
                beautyCategory.setSelected(true);
            } else {
                C12HN.LJJII(arrayList);
            }
        } else {
            C12HN.LJJII(arrayList);
        }
        for (BeautyCategory beautyCategory2 : arrayList) {
            if (beautyCategory2.getBeautyCategoryExtra().exclusive) {
                String strLJIILL = c12hn.LIZ.LJIILL(c12hn.LJJIIJZLJL, beautyCategory2.getCategoryResponse().getId());
                if (strLJIILL != null && strLJIILL.length() != 0) {
                    Iterator<ComposerBeauty> it6 = beautyCategory2.getBeautyList().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next8 = it6.next();
                            if (Intrinsics.LJFF(next8.getEffect().getEffectId(), strLJIILL)) {
                                break;
                            }
                        } else {
                            next8 = null;
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = next8;
                    if (composerBeauty2 != null) {
                        composerBeauty2.setSelected(true);
                    } else {
                        C12HN.LJJIFFI(beautyCategory2.getBeautyList());
                    }
                } else {
                    C12HN.LJJIFFI(beautyCategory2.getBeautyList());
                }
            } else {
                Iterator<ComposerBeauty> it7 = beautyCategory2.getBeautyList().iterator();
                while (it7.hasNext()) {
                    c12hn.LJJIII(it7.next(), false);
                }
            }
        }
        Iterator<BeautyCategory> it8 = arrayList.iterator();
        while (it8.hasNext()) {
            for (ComposerBeauty composerBeauty3 : it8.next().getBeautyList()) {
                if (composerBeauty3.isCollectionType() && (childList = composerBeauty3.getChildList()) != null && !childList.isEmpty()) {
                    String strLf = c12hn.lf(composerBeauty3);
                    if (strLf != null && strLf.length() != 0) {
                        Iterator<ComposerBeauty> it9 = childList.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next7 = it9.next();
                                if (Intrinsics.LJFF(next7.getEffect().getResourceId(), strLf)) {
                                    break;
                                }
                            } else {
                                next7 = null;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty4 = next7;
                        if (composerBeauty4 != null) {
                            composerBeauty4.setSelected(true);
                            c12hn.LJJIII(composerBeauty4, false);
                        } else {
                            C12HN.LJJI(c12hn, childList);
                        }
                    } else {
                        C12HN.LJJI(c12hn, childList);
                    }
                }
            }
        }
        C12HN c12hn2 = this.LL;
        ArrayList<BeautyCategory> arrayList2 = this.LLILLJJLI;
        c12hn2.getClass();
        Iterator<BeautyCategory> it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            for (ComposerBeauty composerBeauty5 : it10.next().getBeautyList()) {
                Effect effect = composerBeauty5.getEffect();
                C19729312Hb c19729312Hb = c12hn2.LJJIFFI;
                String resourceId = effect.getResourceId();
                List<String> tags = effect.getTags();
                if (tags == null) {
                    tags = new ArrayList<>();
                }
                String tagsUpdatedAt = effect.getTagsUpdatedAt();
                c19729312Hb.getClass();
                if (tags.contains("new") && tagsUpdatedAt != null && tagsUpdatedAt.compareTo(C12HK.LIZ.getString(resourceId, CardStruct.IStatusCode.DEFAULT)) > 0) {
                    z = true;
                    c19729312Hb.LIZ.add(resourceId);
                } else {
                    z = false;
                }
                composerBeauty5.setShowRedDot(z);
            }
        }
        if (!C2281551ESb.LIZIZ.LJIIZILJ()) {
            C12HN c12hn3 = this.LL;
            ArrayList<BeautyCategory> arrayList3 = this.LLILLJJLI;
            c12hn3.getClass();
            Iterator<BeautyCategory> it11 = arrayList3.iterator();
            while (it11.hasNext()) {
                for (ComposerBeauty composerBeauty6 : it11.next().getBeautyList()) {
                    if (composerBeauty6.isCollectionType()) {
                        List<ComposerBeauty> childList3 = composerBeauty6.getChildList();
                        if (childList3 != null && !childList3.isEmpty()) {
                            for (ComposerBeauty composerBeauty7 : childList3) {
                                composerBeauty7.setDownloadState(c12hn3.LJIILL.LIZIZ(composerBeauty7, false));
                            }
                        }
                    } else {
                        composerBeauty6.setDownloadState(c12hn3.LJIILL.LIZIZ(composerBeauty6, false));
                    }
                }
            }
        }
        C12HI.LIZ(this.LL.LJII, true);
        ArrayList<ComposerBeauty> arrayList4 = new ArrayList();
        C12HN c12hn4 = this.LL;
        ArrayList<BeautyCategory> arrayList5 = this.LLILLJJLI;
        c12hn4.getClass();
        for (BeautyCategory beautyCategory3 : arrayList5) {
            if (beautyCategory3.getBeautyCategoryExtra().exclusive) {
                Iterator<ComposerBeauty> it12 = beautyCategory3.getBeautyList().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next5 = it12.next();
                        if (next5.getSelected()) {
                            break;
                        }
                    } else {
                        next5 = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty8 = next5;
                if (composerBeauty8 != null) {
                    C12HN.LJIIL(composerBeauty8, c12hn4, arrayList4);
                }
            } else {
                for (ComposerBeauty composerBeauty9 : beautyCategory3.getBeautyList()) {
                    if (1 == composerBeauty9.getEffect().getEffectType()) {
                        List<ComposerBeauty> childList4 = composerBeauty9.getChildList();
                        if (childList4 != null) {
                            Iterator<ComposerBeauty> it13 = childList4.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next6 = it13.next();
                                    if (next6.getSelected()) {
                                        break;
                                    }
                                } else {
                                    next6 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty10 = next6;
                            if (composerBeauty10 != null) {
                                C12HN.LJIIL(composerBeauty10, c12hn4, arrayList4);
                            }
                        }
                    } else if (c12hn4.LJFF(composerBeauty9)) {
                        C12HN.LJIIL(composerBeauty9, c12hn4, arrayList4);
                    }
                }
            }
        }
        C12HU c12hu = new C12HU();
        C12HN c12hn5 = this.LL;
        final C12HR c12hrLJIILJJIL = c12hn5.LJIILJJIL();
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(c12hn5, 583);
        synchronized (c12hrLJIILJJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sort sequence: ");
            sbLIZ.append(c12hrLJIILJJIL.LIZJ);
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            C08XD.LJJ(arrayList4, new Comparator() { // from class: X.12HV
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return c12hrLJIILJJIL.LIZJ.indexOf(new C787110UuD(((ComposerBeauty) obj2).getEffect().getEffectId(), 1)) - c12hrLJIILJJIL.LIZJ.indexOf(new C787110UuD(((ComposerBeauty) obj3).getEffect().getEffectId(), 1));
                }
            });
            Iterator it14 = arrayList4.iterator();
            while (it14.hasNext()) {
                ComposerBeauty composerBeauty11 = (ComposerBeauty) it14.next();
                if (((Boolean) awS608S0100000_29.invoke(composerBeauty11)).booleanValue()) {
                    Iterator<C787110UuD> it15 = c12hrLJIILJJIL.LIZJ.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            next4 = it15.next();
                            if (Intrinsics.LJFF(composerBeauty11.getEffect().getEffectId(), next4.LIZ)) {
                                break;
                            }
                        } else {
                            next4 = null;
                            break;
                        }
                    }
                    if (next4 == null) {
                        it14.remove();
                    }
                }
            }
            int iIndexOf = c12hrLJIILJJIL.LIZJ.indexOf(new C787110UuD("EFFECT_ID_TYPE_FILTER", 2));
            if (iIndexOf >= 0 && iIndexOf < c12hrLJIILJJIL.LIZJ.size()) {
                ComposerBeauty composerBeauty12 = new ComposerBeauty(new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null), new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 6291448, null);
                composerBeauty12.getEffect().setEffectId("EFFECT_ID_TYPE_FILTER");
                if (iIndexOf == c12hrLJIILJJIL.LIZJ.size() - 1) {
                    arrayList4.add(composerBeauty12);
                } else if (iIndexOf == 0) {
                    int size = c12hrLJIILJJIL.LIZJ.size();
                    int i = 1;
                    boolean z2 = false;
                    while (true) {
                        if (i < size) {
                            if (z2) {
                                break;
                            }
                            C787110UuD c787110UuD = c12hrLJIILJJIL.LIZJ.get(i);
                            Iterator it16 = arrayList4.iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    next3 = it16.next();
                                    if (Intrinsics.LJFF(((ComposerBeauty) next3).getEffect().getEffectId(), c787110UuD.LIZ)) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty13 = (ComposerBeauty) next3;
                            if (composerBeauty13 != null) {
                                ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty13), composerBeauty12);
                                z2 = true;
                            }
                            i++;
                        } else if (!z2) {
                            arrayList4.add(composerBeauty12);
                        }
                    }
                } else {
                    int i2 = iIndexOf - 1;
                    boolean z3 = false;
                    while (true) {
                        if (i2 < 1) {
                            if (z3) {
                                break;
                            }
                            C787110UuD c787110UuD2 = c12hrLJIILJJIL.LIZJ.get(i2);
                            Iterator it17 = arrayList4.iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    next2 = it17.next();
                                    if (Intrinsics.LJFF(((ComposerBeauty) next2).getEffect().getEffectId(), c787110UuD2.LIZ)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            ComposerBeauty composerBeauty14 = (ComposerBeauty) next2;
                            if (composerBeauty14 != null) {
                                ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty14) + 1, composerBeauty12);
                                z3 = true;
                            }
                            i2++;
                        } else if (!z3) {
                            int i3 = iIndexOf + 1;
                            int size2 = c12hrLJIILJJIL.LIZJ.size();
                            while (true) {
                                if (i3 < size2) {
                                    if (z3) {
                                        break;
                                    }
                                    C787110UuD c787110UuD3 = c12hrLJIILJJIL.LIZJ.get(i3);
                                    Iterator it18 = arrayList4.iterator();
                                    while (true) {
                                        if (it18.hasNext()) {
                                            next = it18.next();
                                            if (Intrinsics.LJFF(((ComposerBeauty) next).getEffect().getEffectId(), c787110UuD3.LIZ)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    ComposerBeauty composerBeauty15 = (ComposerBeauty) next;
                                    if (composerBeauty15 != null) {
                                        ListProtector.add(arrayList4, arrayList4.indexOf(composerBeauty15), composerBeauty12);
                                        z3 = true;
                                    }
                                    i3++;
                                } else if (!z3) {
                                    arrayList4.add(composerBeauty12);
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean z4 = false;
        for (ComposerBeauty composerBeauty16 : arrayList4) {
            if (Intrinsics.LJFF(composerBeauty16.getEffect().getEffectId(), "EFFECT_ID_TYPE_FILTER")) {
                c12hu.add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", "", "", ""));
                if (composerBeauty16.needFaceDetect()) {
                    z4 = true;
                }
            } else {
                List<BeautyComposerInfo> listXe = c12hn5.Xe(composerBeauty16, false, false, false);
                if (!listXe.isEmpty()) {
                    composerBeauty16.setAdd2Nodes(true);
                    c12hu.addAll(listXe);
                    if (composerBeauty16.needFaceDetect()) {
                        z4 = true;
                    }
                }
            }
        }
        SafeMutableLiveData<C1499920p8Q<ComposerBeauty>> safeMutableLiveData = c12hn5.LJIJI;
        C1499920p8Q c1499920p8Q = new C1499920p8Q();
        if (true ^ arrayList4.isEmpty()) {
            for (Object obj2 : arrayList4) {
                if (obj2 != null) {
                    c1499920p8Q.add(obj2);
                }
            }
        }
        C12HI.LIZ(safeMutableLiveData, c1499920p8Q);
        c12hn5.LIZ.LJII(z4);
        C1C7U.LIZIZ("BeautySource@786f.initComposerNodes$2$list$1");
        return c12hu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C12HU<BeautyComposerInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
