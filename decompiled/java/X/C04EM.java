package X;

import Y.ARunnableS4S0301000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS280S0300000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04EM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04EM extends LinearLayoutCompat {
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final ArrayList<ViewGroup> LLJJI;
    public C04EP LLJJIII;

    public C04EM(Context context) {
        super(context, null, 0);
        this.LLJJI = new ArrayList<>();
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void setCheckedChangeListener(C04EP c04ep) {
        this.LLJJIII = c04ep;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String[]] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIIIIZZ(SkuInfo skuInfo, SkcInfo skcInfo, String[] strArr, SeaSkuPanelViewModel seaSkuPanelViewModel, InterfaceC1631620sYq interfaceC1631620sYq, SeaSkuPanelFragment seaSkuPanelFragment) {
        List<SkuItem> list;
        List<SaleProp> list2;
        boolean z;
        boolean zLJFF;
        boolean z2;
        String str;
        List<SalePropValue> list3;
        int i;
        ProductBase productBase;
        SizeGuide sizeGuide;
        int i2;
        Object next;
        String str2;
        C042Y c042y;
        boolean z3;
        boolean z4;
        SkuItem skuItemLIZJ;
        SkuPrice skuPrice;
        Float fLJIIIIZZ;
        String priceVal;
        Skc skc;
        Image image;
        List<Skc> list4;
        Skc next2;
        String str3;
        String str4;
        C04HS c04hs;
        ?? r8 = strArr;
        if (skuInfo != null && (list = skuInfo.skuList) != null && !list.isEmpty() && (list2 = skuInfo.salePropList) != null && !list2.isEmpty()) {
            Throwable th = null;
            if (getChildCount() > 0) {
                Iterator it2 = new C1076804Ja(this, 17).iterator();
                while (true) {
                    C1076904Jb c1076904Jb = (C1076904Jb) it2;
                    if (!c1076904Jb.hasNext()) {
                        break;
                    }
                    View view = (View) c1076904Jb.next();
                    if ((view instanceof C04HS) && (c04hs = (C04HS) view) != null) {
                        c04hs.removeOnLayoutChangeListener(c04hs.LLJJI);
                    }
                }
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
            }
            int size = skuInfo.salePropList.size();
            C259800zU c259800zU = new C259800zU();
            if (r8 == 0) {
                r8 = new String[size];
                for (int i3 = 0; i3 < size; i3++) {
                    r8[i3] = "";
                }
            }
            c259800zU.element = r8;
            if (r8.length < size) {
                ?? r3 = new String[size];
                int i4 = 0;
                do {
                    r3[i4] = "";
                    i4++;
                } while (i4 < size);
                c259800zU.element = r3;
            }
            List<SkuItem> list5 = skuInfo.skuList;
            List<SaleProp> list6 = skuInfo.salePropList;
            try {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list6, 10));
                int i5 = -1;
                int i6 = 0;
                for (SaleProp saleProp : list6) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        SaleProp saleProp2 = saleProp;
                        ArrayList<C042Y> arrayList2 = new ArrayList();
                        List<SalePropValue> list7 = saleProp2.salePropValueList;
                        if (skcInfo != null && (str4 = skcInfo.skcPropertyId) != null && !a0.LJJJIL(str4)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean z5 = !z;
                        if (z5) {
                            String str5 = saleProp2.propId;
                            if (skcInfo != null) {
                                str3 = skcInfo.skcPropertyId;
                            } else {
                                str3 = null;
                            }
                            zLJFF = Intrinsics.LJFF(str5, str3);
                        } else {
                            zLJFF = false;
                        }
                        if (list7 != null && !list7.isEmpty()) {
                            C042Y c042y2 = null;
                            for (SalePropValue salePropValue : list7) {
                                if (salePropValue.propValueId != null && salePropValue.propValue != null) {
                                    if (zLJFF) {
                                        if (skcInfo == null || (list4 = skcInfo.skcList) == null) {
                                            skc = null;
                                        } else {
                                            Iterator<Skc> it3 = list4.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next2 = it3.next();
                                                    if (Intrinsics.LJFF(next2.skcId, salePropValue.propValueId)) {
                                                        break;
                                                    }
                                                } else {
                                                    next2 = null;
                                                    break;
                                                }
                                            }
                                            skc = next2;
                                        }
                                        String str6 = salePropValue.propValueId;
                                        String str7 = salePropValue.propValue;
                                        String str8 = salePropValue.propValueDisplayPrice;
                                        if (skc != null) {
                                            image = skc.colorBlockImage;
                                        } else {
                                            image = null;
                                        }
                                        c042y = new C042Y(str6, str7, str8, image, true, salePropValue.salePropTag);
                                        c042y.LLJJI = salePropValue.daInfo;
                                    } else if (i6 != 0 || !Intrinsics.LJFF(saleProp2.hasImage, Boolean.TRUE)) {
                                        c042y = new C042Y(salePropValue.propValueId, salePropValue.propValue, salePropValue.propValueDisplayPrice, null, false, salePropValue.salePropTag);
                                        c042y.LLJJI = salePropValue.daInfo;
                                    } else {
                                        c042y = new C042Y(salePropValue.propValueId, salePropValue.propValue, salePropValue.propValueDisplayPrice, salePropValue.image, false, salePropValue.salePropTag);
                                        c042y.LLJJI = salePropValue.daInfo;
                                    }
                                    Object[] objArr = (Object[]) c259800zU.element;
                                    String[] strArr2 = (String[]) Arrays.copyOf(objArr, objArr.length);
                                    strArr2[i6] = salePropValue.propValueId;
                                    if (list5 != null && !list5.isEmpty() && (skuItemLIZJ = C731902tR.LIZJ(C036I.LIZ(strArr2), list5)) != null && (skuPrice = skuItemLIZJ.price) != null) {
                                        Price price = skuPrice.realPrice;
                                        if (price != null && (priceVal = price.getPriceVal()) != null) {
                                            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
                                        } else {
                                            fLJIIIIZZ = null;
                                        }
                                        c042y.LLJILJILJ = fLJIIIIZZ;
                                        c042y.LLJILLL = skuPrice.discount;
                                    }
                                    if (C731902tR.LIZ(list5, strArr2) > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c042y.LLIZLLLIL = z3;
                                    if (salePropValue.salePropTag != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    c042y.LLJ = z4;
                                    if (Intrinsics.LJFF(((String[]) c259800zU.element)[i6], c042y.LL)) {
                                        c042y2 = c042y;
                                    }
                                    arrayList2.add(c042y);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (((C042Y) obj).LIZIZ()) {
                                    arrayList3.add(obj);
                                }
                            }
                            int size2 = arrayList3.size();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                SalePropTag salePropTag = ((C042Y) it4.next()).LLILZLL;
                                if (salePropTag != null && (str2 = salePropTag.tagValue) != null) {
                                    arrayList4.add(str2);
                                }
                            }
                            SeaSkuPanelFragment seaSkuPanelFragment2 = null;
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
                            for (C042Y c042y3 : arrayList2) {
                                c042y3.LLJJIII = Integer.valueOf(size2);
                                c042y3.LLJJIJI = strLJJLIIIJ;
                            }
                            final AwS280S0300000_1 awS280S0300000_1 = new AwS280S0300000_1(c259800zU, (C259800zU<String[]>) this, (C04EM) list5, (List<SkuItem>) 10);
                            final C1077704Jj c1077704Jj = new C1077704Jj(this, 11);
                            if (Intrinsics.LJFF(saleProp2.hasImage, Boolean.TRUE) && !zLJFF) {
                                C04HT c04ht = new C04HT(getContext());
                                c04ht.setTag(R.id.en4, seaSkuPanelFragment);
                                if (c042y2 != null) {
                                    c04ht.setCheckedViewInfo(c042y2);
                                    Iterator it5 = arrayList2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next = it5.next();
                                            if (Intrinsics.LJFF(((C042Y) next).LL, c042y2.LL)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    C042Y c042y4 = (C042Y) next;
                                    if (c042y4 != null) {
                                        c042y4.LLJI = true;
                                    }
                                }
                                this.LLJJI.add(c04ht);
                                th = null;
                                int i8 = i6;
                                c04ht.h0(saleProp2.propId, i8, saleProp2.propName, seaSkuPanelViewModel, true, interfaceC1631620sYq, arrayList2, new C04EO(awS280S0300000_1, c1077704Jj));
                                C16GA c16ga = new C16GA(-1, -2);
                                if (i8 == 0) {
                                    i2 = LLJJIJIIJIL;
                                } else {
                                    i2 = LLJJIJI;
                                }
                                ((LinearLayout.LayoutParams) c16ga).topMargin = i2;
                                ((LinearLayout.LayoutParams) c16ga).bottomMargin = LLJJIJIL;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04ht);
                                c04ht.setLayoutParams(c16ga);
                                addView(c04ht);
                                if (i5 == -1 && Intrinsics.LJFF(((String[]) c259800zU.element)[i8], "")) {
                                    if (saleProp2.propName != null) {
                                        HandlerHook.viewPost(c04ht, new ARunnableS4S0301000_1(c04ht, i8, this, saleProp2, 3));
                                    }
                                    i5 = i8;
                                }
                            } else {
                                th = null;
                                C04HS c04hs2 = new C04HS(getContext());
                                c04hs2.setTag(R.id.en4, seaSkuPanelFragment);
                                if (c042y2 != null) {
                                    c04hs2.setCheckedViewInfo(c042y2);
                                }
                                c04hs2.setOnItemCheckedListener(new InterfaceC1072204Hg() { // from class: X.04EN
                                    @Override // X.InterfaceC1072204Hg
                                    public final void LIZ(int i9, C042Y c042y5) {
                                        awS280S0300000_1.invoke(Integer.valueOf(i9), c042y5);
                                    }

                                    @Override // X.InterfaceC1072204Hg
                                    public final void LIZIZ(int i9, int i10, C042Y c042y5, boolean z6) {
                                        c1077704Jj.invoke(Integer.valueOf(i9), Integer.valueOf(i10), c042y5, Boolean.valueOf(z6));
                                    }
                                });
                                if (seaSkuPanelViewModel.LLLIIL) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                ProductPackStruct productPackStruct = seaSkuPanelViewModel.LLJILJILJ;
                                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
                                    str = sizeGuide.showSalePropId;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str, saleProp2.propId)) {
                                    list3 = saleProp2.salePropValueList;
                                } else {
                                    list3 = null;
                                }
                                String str9 = saleProp2.propId;
                                String str10 = saleProp2.propName;
                                String str11 = saleProp2.propToolTipSchema;
                                if (seaSkuPanelFragment instanceof SeaSkuPanelFragment) {
                                    seaSkuPanelFragment2 = seaSkuPanelFragment;
                                }
                                c04hs2.LIZ(str9, z2, z5, str10, arrayList2, i6, seaSkuPanelViewModel, list3, str11, seaSkuPanelFragment2, interfaceC1631620sYq);
                                seaSkuPanelViewModel.LLLIIL = false;
                                this.LLJJI.add(c04hs2);
                                C16GA c16ga2 = new C16GA(-1, -2);
                                if (C1867160ygk.LIZ() && i6 == 0) {
                                    i = LLJJIJIIJIL;
                                } else {
                                    i = LLJJIJI;
                                }
                                ((LinearLayout.LayoutParams) c16ga2).topMargin = i;
                                ((LinearLayout.LayoutParams) c16ga2).bottomMargin = LLJJIJIL;
                                ((LinearLayout.LayoutParams) c16ga2).leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                ((LinearLayout.LayoutParams) c16ga2).rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04hs2);
                                c04hs2.setLayoutParams(c16ga2);
                                addView(c04hs2);
                                if (i5 == -1 && Intrinsics.LJFF(((String[]) c259800zU.element)[i6], "")) {
                                    if (saleProp2.propName != null) {
                                        HandlerHook.viewPost(c04hs2, new ARunnableS4S0301000_1(c04hs2, i6, this, saleProp2, 4));
                                    }
                                    i5 = i6;
                                }
                            }
                        } else {
                            th = null;
                        }
                        arrayList.add(Unit.LIZ);
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw th;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
