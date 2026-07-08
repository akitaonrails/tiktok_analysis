package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspSkuItemCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C813303Fr extends ConstraintLayout {
    public InterfaceC813403Fs LL;

    public final InterfaceC813403Fs getSkuSpecListener() {
        return this.LL;
    }

    public final void setListener(InterfaceC813403Fs interfaceC813403Fs) {
        this.LL = interfaceC813403Fs;
    }

    public final void setSkuSpecListener(InterfaceC813403Fs interfaceC813403Fs) {
        this.LL = interfaceC813403Fs;
    }

    public C813303Fr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(SizeGuide sizeGuide, List list) {
        String str;
        String str2;
        SalePropValue salePropValue;
        View viewFindViewById = findViewById(R.id.dyu);
        if (viewFindViewById != null) {
            C03DZ.LIZJ(viewFindViewById);
            C0H1U.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), viewFindViewById);
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), viewFindViewById);
        }
        TextView textView = (TextView) findViewById(R.id.yyw);
        C7878035w c7878035w = C7878035w.LIZ;
        Context context = getContext();
        c7878035w.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = (ArrayList) list;
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                SaleProp saleProp = (SaleProp) obj;
                List<SalePropValue> list2 = saleProp.salePropValueList;
                if (list2 == null || (salePropValue = (SalePropValue) C13LP.LJJJLZIJ(0, list2)) == null || (str = salePropValue.propValue) == null) {
                    str = "";
                }
                if (str.length() != 0 && (str2 = saleProp.propName) != null && str2.length() != 0) {
                    spannableStringBuilder.append((CharSequence) saleProp.propName);
                    spannableStringBuilder.append((CharSequence) ": ");
                    SpannableString spannableString = new SpannableString(str);
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1k, context)), 0, spannableString.length(), 33);
                    C786410Ut5.p2(spannableString, new C444920HcY(41, false), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if ((!arrayList.isEmpty()) && i < arrayList.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                } else {
                    try {
                        if (i == arrayList.size() - 1 && spannableStringBuilder.length() > 2) {
                            spannableStringBuilder.replace(spannableStringBuilder.length() - 2, spannableStringBuilder.length(), (CharSequence) "");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((TextView) findViewById(R.id.yyv)).setText(spannableStringBuilder);
        if (sizeGuide != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(sizeGuide.showSalePropId, ((SaleProp) it2.next()).propId)) {
                    C03DZ.LIZJ(textView);
                    textView.setText(sizeGuide.skuSizeGuideTitle);
                    C786410Ut5.I7(new AjS40S0200000_1(this, sizeGuide, 87), textView);
                    InterfaceC813403Fs interfaceC813403Fs = this.LL;
                    if (interfaceC813403Fs != null) {
                        interfaceC813403Fs.LLLLZLL(textView);
                        return;
                    }
                    return;
                }
            }
        }
        C0H1U.LIZIZ(textView);
    }

    public C813303Fr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b2v, this, true);
    }

    public final void h0(SkuSelection skuSelection, Map<Integer, SaleProp> map, String[] strArr, Map<String, Boolean> map2) {
        List listLJJLL;
        SizeGuide sizeGuide;
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(OspSkuItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(false);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            SaleProp saleProp = (SaleProp) entry.getValue();
            if (strArr != null) {
                listLJJLL = C13LQ.LJJLL(strArr);
            } else {
                listLJJLL = null;
            }
            List<SkuItem> list = skuSelection.skus;
            SkcInfo skcInfo = skuSelection.skcInfo;
            Integer num = skuSelection.bizType;
            ProductBase productBase = skuSelection.baseInfo;
            if (productBase != null) {
                sizeGuide = productBase.sizeGuide;
            } else {
                sizeGuide = null;
            }
            if (map2 != null) {
                bool = (Boolean) ((LinkedHashMap) map2).get(saleProp.propId);
            } else {
                bool = null;
            }
            arrayList.add(new C1004203wG(iIntValue, saleProp, listLJJLL, list, skcInfo, num, sizeGuide, bool, this.LL, skuSelection.isSingleRow));
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
    }
}
