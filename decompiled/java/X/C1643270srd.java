package X;

import Y.ARunnableS43S0400000_35;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0srd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643270srd implements InterfaceC1643190srV {
    public final Effect LIZ;
    public final InterfaceC1635390sev LIZIZ;
    public final l0 LIZJ;
    public final ShortVideoContext LIZLLL;
    public final List<C1643330srj> LJ = new ArrayList();
    public List<C1643080srK> LJFF = new ArrayList();

    @Override // X.InterfaceC1643190srV
    public final LinearLayoutManager Ci(Context context) {
        if (C1624550sNR.LIZLLL(this.LIZ)) {
            return new GridLayoutManager(context, 5);
        }
        return new LinearLayoutManager(context, 0, false);
    }

    public final void LJ(AbstractC1665240tR4[] abstractC1665240tR4Arr) {
        if (abstractC1665240tR4Arr != null) {
            C089E c089e = new C089E(abstractC1665240tR4Arr);
            while (c089e.hasNext()) {
                ((ArrayList) this.LJ).add(new C1643330srj((C1DPD) ((AbstractC1665240tR4) c089e.next())));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.Bitmap[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.graphics.Bitmap[]] */
    @Override // X.InterfaceC1643190srV
    public final void LIZ(final C1643220srY c1643220srY, final C1643170srT c1643170srT) {
        boolean z;
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPB c1dpb;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new Bitmap[0];
        C1643300srg c1643300srg = c1643220srY.LJ;
        if (c1643300srg != null && !c1643300srg.LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            if (c1643300srg != null) {
                str = c1643300srg.LIZJ;
            }
            Bitmap bitmapLJFF = LJFF(-1, -1, str);
            if (bitmapLJFF != null) {
                c259800zU.element = new Bitmap[]{bitmapLJFF};
            }
        }
        C1DPK c1dpkLJII = DiyPropParser.LJII(this.LIZ);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && (c1dpb = (C1DPB) abstractC1665240tR4) != null) {
                c1dpb.LIZLLL(c259800zU.element, UIAnnotationUpdateType.UIAnnotationUpdateType_Done, new C1DO8() { // from class: X.0sra
                    @Override // X.C1DO9
                    public final void onSuccess() {
                        int i = c1643220srY.LIZLLL;
                        for (C1643080srK c1643080srK : this.LJFF) {
                            if (Intrinsics.LJFF(c1643080srK.LIZ, "Green Screen")) {
                                List<C1643300srg> list = c1643080srK.LJ;
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    String str2 = ((C1643300srg) ListProtector.get(list, i2)).LIZJ;
                                    C1643300srg c1643300srg2 = c1643220srY.LJ;
                                    if (Intrinsics.LJFF(str2, c1643300srg2 != null ? c1643300srg2.LIZJ : null)) {
                                        i = i2;
                                    } else {
                                        ((C1643300srg) ListProtector.get(list, i2)).LJIIJ = false;
                                    }
                                }
                                ((C1643300srg) ListProtector.get(list, i)).LJIIJ = !(c259800zU.element.length == 0);
                                InterfaceC1643320sri interfaceC1643320sri = c1643170srT;
                                if (interfaceC1643320sri != null) {
                                    interfaceC1643320sri.LIZIZ(new Pair<>(Integer.valueOf(c1643220srY.LIZIZ), Integer.valueOf(i)));
                                    return;
                                }
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // X.C1DO7
                    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                        if (uIAnnotationErrorCode != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("lalaland - green screen error: ");
                            sbLIZ.append(uIAnnotationErrorCode);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1643190srV
    public final void LIZIZ(final C1643220srY c1643220srY, final C1643140srQ c1643140srQ) {
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4ArrLIZ;
        C1DPB c1dpb;
        C1DPK c1dpkLJII = DiyPropParser.LJII(this.LIZ);
        if (c1dpkLJII != null && (abstractC1665240tR4ArrLIZ = c1dpkLJII.LIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            AbstractC1665240tR4<?, ?> abstractC1665240tR4 = abstractC1665240tR4ArrLIZ[0];
            if ((abstractC1665240tR4 instanceof C1DPB) && (c1dpb = (C1DPB) abstractC1665240tR4) != null) {
                c1dpb.LIZLLL(new Bitmap[0], UIAnnotationUpdateType.UIAnnotationUpdateType_Done, new C1DO8() { // from class: X.0srb
                    @Override // X.C1DO9
                    public final void onSuccess() {
                        for (C1643080srK c1643080srK : this.LIZ.LJFF) {
                            if (Intrinsics.LJFF(c1643080srK.LIZ, "Green Screen")) {
                                Iterator<C1643300srg> it2 = c1643080srK.LJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJIIJ = false;
                                }
                                c1643140srQ.LIZIZ(new Pair<>(Integer.valueOf(c1643220srY.LIZIZ), -1));
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }

                    @Override // X.C1DO7
                    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                        if (uIAnnotationErrorCode != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("lalaland - green screen error: ");
                            sbLIZ.append(uIAnnotationErrorCode);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1643190srV
    public final void LIZLLL(final C1643220srY c1643220srY, final C1643150srR c1643150srR) {
        List<C1643330srj> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((C1643330srj) obj).LIZ.LIZ(), c1643220srY.LIZ)) {
                arrayList.add(obj);
            }
        }
        List<C1643080srK> list2 = this.LJFF;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (ArrayList) list2) {
            if (Intrinsics.LJFF(((C1643080srK) obj2).LIZ, c1643220srY.LIZ)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1643080srK) it2.next()).LIZJ);
        }
        l0 l0Var = this.LIZJ;
        if (l0Var != null) {
            l0Var.tf(c1643220srY.LIZJ);
        }
        C1DPD c1dpd = ((C1643330srj) ListProtector.get(arrayList, 0)).LIZ;
        Object[] array = arrayList3.toArray(new String[0]);
        UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
        C1DO8 c1do8 = new C1DO8() { // from class: X.0src
            @Override // X.C1DO9
            public final void onSuccess() {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("OptionCategoryPanelViewModel", "Updated view with clear selection successfully.");
                List<C1643080srK> list3 = this.LIZ.LJFF;
                C1643220srY c1643220srY2 = c1643220srY;
                for (C1643080srK c1643080srK : list3) {
                    if (Intrinsics.LJFF(c1643080srK.LIZ, c1643220srY2.LIZ)) {
                        Iterator<C1643300srg> it3 = c1643080srK.LJ.iterator();
                        while (it3.hasNext()) {
                            it3.next().LJIIJ = false;
                        }
                        c1643150srR.LIZIZ(new Pair<>(Integer.valueOf(c1643220srY.LIZIZ), -1));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            @Override // X.C1DO7
            public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Updating view with clear selection failed, errorCode:");
                sbLIZ.append(uIAnnotationErrorCode);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        c1dpd.getClass();
        C1DOD.LIZ();
        C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpd, array, uIAnnotationUpdateType, c1do8, 5));
    }

    public static Bitmap LJFF(int i, int i2, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inJustDecodeBounds = false;
            options.inSampleSize = C097U.LIZ(options, i2, i);
            return C2471909mP.LIZLLL(str, options);
        }
        return C2471909mP.LIZLLL(str, options);
    }

    @Override // X.InterfaceC1643190srV
    public final void LIZJ(final C1643220srY c1643220srY, final C1643160srS c1643160srS, final boolean z) {
        String str;
        final String[] strArr;
        List<C1643330srj> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String strLIZ = ((C1643330srj) next).LIZ.LIZ();
            C1643300srg c1643300srg = c1643220srY.LJ;
            if (c1643300srg != null) {
                str = c1643300srg.LJ;
            }
            if (Intrinsics.LJFF(strLIZ, str)) {
                arrayList.add(next);
            }
        }
        C1643300srg c1643300srg2 = c1643220srY.LJ;
        if (c1643300srg2 != null && c1643300srg2.LJIIJ && z) {
            List<C1643080srK> list2 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                if (Intrinsics.LJFF(((C1643080srK) obj).LIZ, c1643220srY.LIZ)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((C1643080srK) it3.next()).LIZJ);
            }
            strArr = (String[]) arrayList3.toArray(new String[0]);
        } else {
            strArr = new String[1];
            if (c1643300srg2 != null) {
                str = c1643300srg2.LIZJ;
            }
            strArr[0] = str;
        }
        if (true ^ arrayList.isEmpty()) {
            C1DPD c1dpd = ((C1643330srj) ListProtector.get(arrayList, 0)).LIZ;
            UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
            C1DO8 c1do8 = new C1DO8() { // from class: X.0srZ
                @Override // X.C1DO9
                public final void onSuccess() {
                    Effect effect;
                    String effectId;
                    Map<String, String> map;
                    l0 l0Var;
                    Map<String, String> map2;
                    l0 l0Var2;
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV("OptionCategoryPanelViewModel", "Updated view with new selection successfully.");
                    if (z) {
                        List<C1643080srK> list3 = this.LJFF;
                        C1643220srY c1643220srY2 = c1643220srY;
                        for (C1643080srK c1643080srK : (ArrayList) list3) {
                            if (Intrinsics.LJFF(c1643080srK.LIZ, c1643220srY2.LIZ)) {
                                C1643220srY c1643220srY3 = c1643220srY;
                                boolean z2 = false;
                                for (C1643300srg c1643300srg3 : c1643080srK.LJ) {
                                    if (Intrinsics.LJFF(c1643300srg3, c1643220srY3.LJ)) {
                                        z2 = c1643300srg3.LJIIJ;
                                    } else {
                                        c1643300srg3.LJIIJ = false;
                                    }
                                }
                                C1643220srY c1643220srY4 = c1643220srY;
                                C1643300srg c1643300srg4 = c1643220srY4.LJ;
                                if (c1643300srg4 != null) {
                                    c1643300srg4.LJIIJ = !z2;
                                }
                                if (strArr.length == 0) {
                                    l0 l0Var3 = this.LIZJ;
                                    if (l0Var3 != null) {
                                        l0Var3.tf(c1643220srY4.LIZJ);
                                    }
                                } else {
                                    l0 l0Var4 = this.LIZJ;
                                    if (l0Var4 != null && (map = l0Var4.LLLLLLLLLL) != null && map.containsKey(c1643220srY4.LIZJ) && (l0Var = this.LIZJ) != null) {
                                        l0Var.tf(c1643220srY.LIZJ);
                                    }
                                    C1643300srg c1643300srg5 = c1643220srY.LJ;
                                    if (c1643300srg5 != null && (effect = c1643300srg5.LJFF) != null && (effectId = effect.getEffectId()) != null) {
                                        C1643270srd c1643270srd = this;
                                        C1643220srY c1643220srY5 = c1643220srY;
                                        l0 l0Var5 = c1643270srd.LIZJ;
                                        if (l0Var5 != null) {
                                            l0Var5.J8(c1643220srY5.LIZJ, effectId);
                                        }
                                    }
                                }
                                if (C1624550sNR.LIZJ(this.LIZ)) {
                                    C1643270srd c1643270srd2 = this;
                                    C1643220srY c1643220srY6 = c1643220srY;
                                    String str2 = c1643220srY6.LIZ;
                                    String str3 = strArr[0];
                                    C1643300srg c1643300srg6 = c1643220srY6.LJ;
                                    String str4 = c1643300srg6 != null ? c1643300srg6.LIZLLL : null;
                                    c1643270srd2.getClass();
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("template_id", c1643270srd2.LIZ.getResourceId());
                                    c0lab.LJ("template_name", c1643270srd2.LIZ.getName());
                                    c0lab.LJ("item_category", str2);
                                    c0lab.LJ("name", str4);
                                    c0lab.LJ("item_id", str3);
                                    c0lab.LJ("creation_id", c1643270srd2.LIZLLL.getCreationId());
                                    c0lab.LJ("shoot_way", c1643270srd2.LIZLLL.shootWay);
                                    c0lab.LJ("enter_from", c1643270srd2.LIZLLL.enterFrom);
                                    C1449260noi.LJ("mobile_effect_face_filter_select_item", c0lab.LIZ);
                                    l0 l0Var6 = this.LIZJ;
                                    if (l0Var6 != null && (map2 = l0Var6.LLLLLLLLLL) != null && map2.containsKey(c1643220srY.LIZJ) && (l0Var2 = this.LIZJ) != null) {
                                        l0Var2.tf(c1643220srY.LIZJ);
                                    }
                                    String str5 = strArr[0];
                                    if (str5 != null) {
                                        C1643270srd c1643270srd3 = this;
                                        C1643220srY c1643220srY7 = c1643220srY;
                                        l0 l0Var7 = c1643270srd3.LIZJ;
                                        if (l0Var7 != null) {
                                            l0Var7.J8(c1643220srY7.LIZJ, str5);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    InterfaceC1643320sri interfaceC1643320sri = c1643160srS;
                    if (interfaceC1643320sri != null) {
                        interfaceC1643320sri.LIZIZ(new Pair<>(Integer.valueOf(c1643220srY.LIZIZ), Integer.valueOf(c1643220srY.LIZLLL)));
                    }
                }

                @Override // X.C1DO7
                public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Updating view with selection failed, errorCode:");
                    sbLIZ.append(uIAnnotationErrorCode);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1643320sri interfaceC1643320sri = c1643160srS;
                    if (interfaceC1643320sri != null) {
                        interfaceC1643320sri.LIZ(uIAnnotationErrorCode);
                    }
                }
            };
            c1dpd.getClass();
            C1DOD.LIZ();
            C823050WQl.LIZJ().execute(new ARunnableS43S0400000_35(c1dpd, strArr, uIAnnotationUpdateType, c1do8, 5));
        }
    }

    public C1643270srd(Effect effect, InterfaceC1635390sev interfaceC1635390sev, l0 l0Var, ShortVideoContext shortVideoContext) {
        this.LIZ = effect;
        this.LIZIZ = interfaceC1635390sev;
        this.LIZJ = l0Var;
        this.LIZLLL = shortVideoContext;
    }
}
