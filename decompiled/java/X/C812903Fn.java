package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ProductSafetyModule;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.03Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812903Fn extends ConstraintLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    private final TuxTextView getBioContent() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxIconView getBioIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    private final TuxIconView getBioRightIcon() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    private final TuxTextView getBioTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final ConstraintLayout getRootLayout() {
        return (ConstraintLayout) this.LL.getValue();
    }

    public final void h0() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        getBioTitle().setTextColorRes(R.attr.a1p);
        getBioContent().setTextColorRes(R.attr.a1p);
        getBioIcon().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        C786410Ut5.I7(new AjS10S0000000_1(4), getRootLayout());
    }

    public final void i0() {
        TuxIconView bioRightIcon = getBioRightIcon();
        if (bioRightIcon != null) {
            C786410Ut5.LLLLLLZZ(bioRightIcon, 8);
        }
    }

    public C812903Fn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C812903Fn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 581));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 580));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 578));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 577));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 579));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b26, this, true);
    }

    public final void e0(final ProductSafetyModule productSafetyModule, final String str, final String str2, final HashMap map, final String str3) {
        String str4;
        Icon icon;
        Image icon2;
        if (productSafetyModule != null) {
            String str5 = productSafetyModule.title;
            if (str5 != null) {
                getBioTitle().setText(str5);
            }
            List<Icon> list = productSafetyModule.iconList;
            C03IT imageUrlModel = null;
            if (list != null && (icon = (Icon) C13LP.LJJJLL(list)) != null) {
                if (C960203pA.LIZIZ(getContext())) {
                    icon2 = icon.getIconDark();
                } else {
                    icon2 = icon.getIcon();
                }
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                if (icon2 != null) {
                    imageUrlModel = icon2.toImageUrlModel();
                }
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                c1331670kl3LIZLLL.LJJI(getBioIcon());
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
            List<String> list2 = productSafetyModule.safetyText;
            if (list2 != null && (str4 = (String) C13LP.LJJJLL(list2)) != null) {
                getBioContent().setText(str4);
            }
            C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.03Bc
                @Override // X.AbstractViewOnClickListenerC420730Ged
                public final void LIZ(View view) {
                    Type type;
                    if (view != null) {
                        C212391189t c212391189t = C212391189t.LIZ;
                        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(productSafetyModule);
                        c212391189t.getClass();
                        C212391189t.LIZIZ("combined_sku_order_submit_params", "ec_osp_bio_info", strLJIIIIZZ);
                        boolean zLJFF = Intrinsics.LJFF(str, "item_details");
                        String str6 = productSafetyModule.schema;
                        if (str6 != null) {
                            String str7 = str2;
                            Object obj = null;
                            try {
                                Gson gsonLJFF = C1741890vQh.LJFF();
                                C1120604Zw.LIZ.getClass();
                                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                    C13JX c13jx = KTypeProjection.LIZJ;
                                    C13JW c13jwLJII = C13LE.LJII(String.class);
                                    c13jx.getClass();
                                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
                                } else {
                                    type = new TypeToken<HashMap<String, Object>>() { // from class: X.03Bd
                                    }.getType();
                                }
                                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str7, type);
                                if (!(objFromJson instanceof HashMap)) {
                                    objFromJson = null;
                                }
                                obj = objFromJson;
                            } catch (s e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String str8 = "order_submit";
                            linkedHashMap.put("previous_page", "order_submit");
                            if (obj != null) {
                                linkedHashMap.put("entrance_info", C1741890vQh.LJIIIIZZ(obj));
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            HashMap map2 = map;
                            if (map2 != null) {
                                linkedHashMap2.putAll(map2);
                            }
                            linkedHashMap2.put("previous_page", "order_submit");
                            String str9 = str;
                            if (str9 != null) {
                                str8 = str9;
                            }
                            linkedHashMap2.put("page_name", str8);
                            linkedHashMap.put("trackParams", linkedHashMap2);
                            linkedHashMap.put("is_show_back_button", Integer.valueOf(zLJFF ? 1 : 0));
                            C919503ib.LIZIZ(this.getContext(), str6, linkedHashMap, false).open();
                        }
                        C1748720vbi.LIZLLL(this, new C10516049i(), new AwS11S2000000_1(str, str3, 5));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                }
            }, getRootLayout());
        }
    }
}
