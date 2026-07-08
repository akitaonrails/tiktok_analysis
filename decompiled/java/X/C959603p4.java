package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubbleExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS210S0300000_1;

/* JADX INFO: renamed from: X.03p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C959603p4 extends CardView {
    public final LinearLayout LLIZLLLIL;
    public final SmartImageView LLJ;
    public final TuxTextView LLJI;
    public final C1361400lX0 LLJIJIL;

    private final Drawable getBackgroundDrawable() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        return c384050F3z.LIZ(this.LLJIJIL);
    }

    public C959603p4(Context context, AttributeSet attributeSet) {
        super(new C1361400lX0(context, R.style.y3), attributeSet, 0);
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y3);
        this.LLJIJIL = c1361400lX0;
        C1755600vmo.LIZ.getClass();
        C1755600vmo.LIZ(R.layout.awl, c1361400lX0, this, true, false);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.jzp);
        this.LLJ = (SmartImageView) findViewById(R.id.lzv);
        this.LLJI = (TuxTextView) findViewById(R.id.tv_widget_title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(EntranceBubble entranceBubble, SeaPdpViewModel seaPdpViewModel) {
        Image icon;
        int i;
        if (entranceBubble == null) {
            C0H1U.LIZIZ(this);
            return;
        }
        C12ES.LJIILL(0, this);
        Integer num = entranceBubble.bubbleType;
        if (num != null && num.intValue() == 1) {
            C12ES.LJIILL(0, this.LLIZLLLIL);
            this.LLIZLLLIL.setBackground(getBackgroundDrawable());
            Icon icon2 = entranceBubble.icon;
            final Function0 function0 = null;
            Object[] objArr = 0;
            if (icon2 != null) {
                icon = icon2.getIcon();
            } else {
                icon = null;
            }
            SmartImageView smartImageView = this.LLJ;
            EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            int i2 = layoutParams.height;
            if (i2 > 0 && (i = layoutParams.width) > 0) {
                c1331670kl3LIZLLL.LJIIIIZZ = i;
                c1331670kl3LIZLLL.LJIIIZ = i2;
            }
            c1331670kl3LIZLLL.LIZLLL = true;
            c1331670kl3LIZLLL.LJJLIIIJJI = true;
            c1331670kl3LIZLLL.LJJ = enumC1338240kve;
            c1331670kl3LIZLLL.LJJ(smartImageView);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            c1331670kl3LIZLLL.LJIIJ(new InterfaceC427850Gq7() { // from class: X.03p5
                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    Function1<Throwable, Unit> function1 = objArr2;
                    if (function1 != null) {
                        function1.invoke(th);
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
            C03C8.LIZJ(this.LLJI, entranceBubble.title, "pdp_entrance_bubble", null);
            C786410Ut5.I7(new AjS20S0300000_1(entranceBubble, this, seaPdpViewModel, 46), this);
        } else {
            C0H1U.LIZIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gec_pdp_live_playback_widget unknown bubbleType ");
            sbLIZ.append(entranceBubble);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (getVisibility() != 0) {
            return;
        }
        C1748720vbi.LIZLLL(this, new C10515049h(), new AwS210S0300000_1(this, seaPdpViewModel, entranceBubble, 100));
    }

    public final Map LJIIIZ(EntranceBubble entranceBubble, SeaPdpViewModel seaPdpViewModel) {
        Object obj;
        Object obj2;
        IECommerceHostService iECommerceHostService;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String name;
        Map<String, Object> map;
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", seaPdpViewModel.NR2());
        linkedHashMap.put("page_name", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModel.LLIZ;
        Unit unit = null;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            obj = map2.get("previous_page");
        } else {
            obj = null;
        }
        linkedHashMap.put("previous_page", obj);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = seaPdpViewModel.LLIZ;
        if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null) {
            obj2 = map.get("source_page_type");
        } else {
            obj2 = null;
        }
        linkedHashMap.put("source_page_type", obj2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            INetworkUtilDependencyService iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            if (iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = INetworkUtilDependencyService.class.getName();
            if (iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                name = iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iNetworkUtilDependencyServiceCreateINetworkUtilDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        linkedHashMap.put("network_type", Integer.valueOf(((INetworkUtilDependencyService) iECommerceHostService).isWifi(this.LLJIJIL) ? 1 : 0));
        linkedHashMap.put("module_name", "entrance_bubble");
        try {
            EntranceBubbleExtraInfo entranceBubbleExtraInfo = entranceBubble.extraInfo;
            if (entranceBubbleExtraInfo != null && (str = entranceBubbleExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                linkedHashMap.putAll(mapLJIIJ);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }
}
