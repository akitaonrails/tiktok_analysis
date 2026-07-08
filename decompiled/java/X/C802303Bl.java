package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C802303Bl extends AbstractC21673619ry<C802403Bm> {
    public final Fragment LL;
    public final View LLILLJJLI;
    public final OrderSubmitAssemViewModel LLILLL;
    public final C19EG LLILZ;
    public MainOrderSetting LLILZIL;
    public Integer LLILZLL;
    public final List<C719102rN> LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public final Drawable LLJI;
    public final Drawable LLJIJIL;

    public C802303Bl() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C719102rN c719102rN = (C719102rN) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (c719102rN == null || !c719102rN.LIZLLL()) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C802403Bm c802403Bm = (C802403Bm) viewHolder;
        super.onViewRecycled(c802403Bm);
        C802903Br c802903Br = c802403Bm.LLJILJIL;
        c802903Br.getClass();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_osp_promotion_event", c802903Br);
        C830403Mg c830403Mg = c802403Bm.LLJILJILJ;
        c830403Mg.getClass();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_osp_promotion_event", c830403Mg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void LLLFZ(C802403Bm c802403Bm, C719102rN c719102rN) {
        List<InsuranceInfo> list;
        int i;
        List<InsuranceInfo> list2;
        String str;
        ?? HasDefaultSelected;
        C817603Hi c817603Hi;
        String str2;
        InsuranceModule insuranceModule = c719102rN.LLLIIII;
        C038K c038k = c802403Bm.LLJJL;
        Map<String, Object> mapLIZ = null;
        if (insuranceModule != null) {
            list = insuranceModule.exposureInsuranceInfoList;
        } else {
            list = null;
        }
        ?? HasDefaultSelected2 = 0;
        if (list != null) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c038k);
        if (insuranceModule != null && (list2 = insuranceModule.exposureInsuranceInfoList) != null) {
            InsuranceInfo insuranceInfo = (InsuranceInfo) C13LP.LJJJLL(list2);
            c802403Bm.LLJJL.e0(c719102rN, this.LLILLL, this.LLILZ);
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = this.LLILLL.hi1(false);
            if (insuranceInfo != null) {
                str = insuranceInfo.insuranceProductNameEn;
            } else {
                str = null;
            }
            mapHi1.put("insurance_name", String.valueOf(str));
            if (insuranceInfo != null) {
                HasDefaultSelected = insuranceInfo.hasDefaultSelected();
            } else {
                HasDefaultSelected = 0;
            }
            mapHi1.put("is_default", Integer.valueOf((int) HasDefaultSelected));
            Integer num = (Integer) ((LinkedHashMap) this.LLILLL.L).get(c719102rN.LLILZLL);
            if (num != null) {
                HasDefaultSelected2 = num.intValue();
            } else if (insuranceInfo != null) {
                HasDefaultSelected2 = insuranceInfo.hasDefaultSelected();
            }
            mapHi1.put("if_always_default", Integer.valueOf((int) HasDefaultSelected2));
            if (insuranceInfo != null && (str2 = insuranceInfo.insurancePayType) != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("insurance_growth_info");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object objOpt = jSONObjectOptJSONObject.opt(next);
                            if (objOpt != null) {
                                mapHi1.put(next, objOpt);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLL;
            if (orderSubmitAssemViewModel != null && (c817603Hi = orderSubmitAssemViewModel.LLLZLZ) != null) {
                mapLIZ = c817603Hi.LIZ("c62882");
            }
            C03O0.LJJJZ(c03o0, "insurance", mapHi1, null, null, null, null, null, null, null, mapLIZ, null, null, null, 1015804);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Type inference failed for: r3v199 */
    /* JADX WARN: Type inference failed for: r3v200, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v403 */
    /* JADX WARN: Type inference failed for: r4v39, types: [kotlin.jvm.internal.AwS367S0200000_1] */
    /* JADX WARN: Type inference failed for: r4v43, types: [kotlin.jvm.internal.AwS16S0001000_1] */
    /* JADX WARN: Type inference failed for: r5v35, types: [X.0GnO, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel] */
    /* JADX WARN: Type inference failed for: r6v43, types: [X.03IN, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v45, types: [X.03oe, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [X.0FJJ, android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.ss.android.ugc.aweme.ecommerce.base.common.model.Price] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r30, int r31) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802303Bl.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        C802403Bm c802403Bm = new C802403Bm(C03XA.LIZJ(context, R.layout.b44, viewGroup, false));
        try {
            View view = c802403Bm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c802403Bm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c802403Bm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C802403Bm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c802403Bm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c802403Bm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C802403Bm.class.getName();
        return c802403Bm;
    }

    public final void LLLI(C802703Bp c802703Bp, C719102rN c719102rN, UserRightDetail userRightDetail) {
        HashMap map = new HashMap();
        String str = c719102rN.LLLLIL;
        if (str != null) {
            map.put("product_id", str);
        }
        String str2 = c719102rN.LLJJIJIL;
        if (str2 != null) {
            map.put("author_id", str2);
        }
        String str3 = userRightDetail.nameEn;
        if (str3 != null) {
            map.put("module_name", str3);
            map.put("rights_content", str3);
        }
        map.put("module_type", "user_rights");
        Integer num = userRightDetail.popupStyle;
        if (num != null && num.intValue() == 1) {
            C786410Ut5.I7(new AjS20S0300000_1(this, map, userRightDetail, 40), c802703Bp);
        }
    }

    public C802303Bl(Fragment fragment, View view, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C19EG c19eg) {
        ArrayList arrayList = new ArrayList();
        this.LL = fragment;
        this.LLILLJJLI = view;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = c19eg;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = arrayList;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1645));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJ = Integer.valueOf(C960203pA.LIZ(R.attr.na, view.getContext()));
        c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.na, view.getContext()));
        this.LLJI = c384050F3z.LIZ(view.getContext());
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z2.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.fx, view.getContext()));
        this.LLJIJIL = c384050F3z2.LIZ(view.getContext());
    }
}
