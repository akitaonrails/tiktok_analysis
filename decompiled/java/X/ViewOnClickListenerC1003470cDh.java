package X;

import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.nativecardcomponent.AnoleNativeDisplayCardModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1003470cDh extends AbstractC1014240cV4 implements View.OnClickListener {
    public C424560Gko LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C21279718Pj LLJLL;
    public boolean LLJLLIL;
    public Bitmap LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0cDj] */
    public final void LJJI() {
        String cardImageUrl;
        boolean z = true;
        if (this.LLJLLL != null) {
            this.LLJLLIL = true;
            LJIJJLI();
            C424560Gko c424560Gko = this.LLJLIL;
            if (c424560Gko != null) {
                c424560Gko.setImageBitmap(this.LLJLLL);
                return;
            }
            return;
        }
        if (this.LLJLIL == null) {
            this.LLJZ = "card_ImageView_empty";
            return;
        }
        AnoleNativeDisplayCardModel anoleNativeDisplayCardModelLJJ = LJJ();
        if (anoleNativeDisplayCardModelLJJ != null && (cardImageUrl = anoleNativeDisplayCardModelLJJ.getCardImageUrl()) != null && !a0.LJJJIL(cardImageUrl)) {
            z = false;
        }
        if (z) {
            if (LJJ() == null) {
                this.LLJZ = "native_card_data_empty";
                return;
            } else {
                this.LLJZ = "url_empty";
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadCardImage iconUrl = ");
        AnoleNativeDisplayCardModel anoleNativeDisplayCardModelLJJ2 = LJJ();
        sbLIZ.append(anoleNativeDisplayCardModelLJJ2 != null ? anoleNativeDisplayCardModelLJJ2.getCardImageUrl() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        final Context context = this.LLILZ;
        AnoleNativeDisplayCardModel anoleNativeDisplayCardModelLJJ3 = LJJ();
        final String cardImageUrl2 = anoleNativeDisplayCardModelLJJ3 != null ? anoleNativeDisplayCardModelLJJ3.getCardImageUrl() : null;
        AnoleComponentSizeModel anoleComponentSizeModel = this.LL.size;
        final Integer numValueOf = anoleComponentSizeModel != null ? Integer.valueOf((int) anoleComponentSizeModel.width) : null;
        AnoleComponentSizeModel anoleComponentSizeModel2 = this.LL.size;
        final Integer numValueOf2 = anoleComponentSizeModel2 != null ? Integer.valueOf((int) anoleComponentSizeModel2.height) : null;
        final ?? r6 = new InterfaceC1003520cDm() { // from class: X.0cDj
            @Override // X.InterfaceC1003520cDm
            public final void onFailed() {
                ViewOnClickListenerC1003470cDh viewOnClickListenerC1003470cDh = this.LIZ;
                viewOnClickListenerC1003470cDh.LLJLLIL = false;
                viewOnClickListenerC1003470cDh.LJIJJLI();
            }

            @Override // X.InterfaceC1003520cDm
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                ViewOnClickListenerC1003470cDh viewOnClickListenerC1003470cDh = this.LIZ;
                viewOnClickListenerC1003470cDh.LLJLLIL = true;
                viewOnClickListenerC1003470cDh.LJIJJLI();
                ViewOnClickListenerC1003470cDh viewOnClickListenerC1003470cDh2 = this.LIZ;
                viewOnClickListenerC1003470cDh2.LLJLLL = bitmap;
                C424560Gko c424560Gko2 = viewOnClickListenerC1003470cDh2.LLJLIL;
                if (c424560Gko2 != null) {
                    HandlerHook.viewPost(c424560Gko2, new ARunnableS85S0200000_16(viewOnClickListenerC1003470cDh2, bitmap, 69));
                }
            }
        };
        if (cardImageUrl2 == null) {
            this.LLJZ = "url_empty";
            return;
        }
        if (context == null) {
            this.LLJZ = "context_empty";
            return;
        }
        if (numValueOf == null) {
            this.LLJZ = "width_empty";
            return;
        }
        numValueOf.intValue();
        if (numValueOf2 == null) {
            this.LLJZ = "height_empty";
        } else {
            numValueOf2.intValue();
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0cDl
                public final void LIZ() {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(cardImageUrl2);
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    c1331670kl3LJIIIZ.LJIIIIZZ = iIntValue;
                    c1331670kl3LJIIIZ.LJIIIZ = iIntValue2;
                    c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LJIIIZ.LIZLLL("commerce_native_display_card");
                    c1331670kl3LJIIIZ.LJJIJL(context);
                    c1331670kl3LJIIIZ.LJJII(new C1077120e8U(r6, this, 1));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AnoleNativeDisplayCardExtKt@66db.loadImageWithUrl$5");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AnoleNativeDisplayCardExtKt@66db.loadImageWithUrl$5");
                }
            });
        }
    }

    public final AnoleNativeDisplayCardModel LJJ() {
        return (AnoleNativeDisplayCardModel) this.LLLFF.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(this.LLJLLIL, "image_load_failed");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        LJJI();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLJLLL = null;
        C424560Gko c424560Gko = this.LLJLIL;
        if (c424560Gko != null) {
            c424560Gko.setImageBitmap(null);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        LJJI();
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        String cardImageUrl;
        super.LJII(anoleComponentAppearModel);
        AnoleNativeDisplayCardModel anoleNativeDisplayCardModelLJJ = LJJ();
        if (anoleNativeDisplayCardModelLJJ == null || (cardImageUrl = anoleNativeDisplayCardModelLJJ.getCardImageUrl()) == null) {
            cardImageUrl = "";
        }
        this.LLJZIJLIL = cardImageUrl;
        C1003480cDi.LIZ(this, true);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        String cardImageUrl;
        super.LJIIIIZZ(str);
        AnoleNativeDisplayCardModel anoleNativeDisplayCardModelLJJ = LJJ();
        if (anoleNativeDisplayCardModelLJJ == null || (cardImageUrl = anoleNativeDisplayCardModelLJJ.getCardImageUrl()) == null) {
            cardImageUrl = "";
        }
        this.LLJZIJLIL = cardImageUrl;
        C1003480cDi.LIZ(this, false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Long lValueOf = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            numValueOf2 = Integer.valueOf(tuxIconView.getId());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            this.LLILLL.LJIJ(new C991660bue(this.LL.type), this);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL((String) this.LLL.getValue(), "close", this.LLILLJJLI.LIZLLL);
            c1022820ciuLIZLLL.LIZJ(this.LLLF.getValue(), "refer");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(this.LL.getID()), "component_id");
            AnoleModel anoleModel = this.LLILLJJLI.LIZLLL.getAnoleModel();
            if (anoleModel != null) {
                lValueOf = Long.valueOf(anoleModel.templateID);
            }
            c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
            c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        C21279718Pj c21279718Pj = this.LLJLL;
        if (c21279718Pj != null) {
            numValueOf3 = Integer.valueOf(c21279718Pj.getId());
        } else {
            numValueOf3 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf3)) {
            C424560Gko c424560Gko = this.LLJLIL;
            if (c424560Gko != null) {
                numValueOf4 = Integer.valueOf(c424560Gko.getId());
            } else {
                numValueOf4 = null;
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf4)) {
                return;
            }
        }
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILLL;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 71));
        mapLJIIJ.put(EnumC1005330cGh.REFER.getRName(), this.LLLF.getValue());
        mapLJIIJ.put(EnumC1005330cGh.TAG.getRName(), this.LLL.getValue());
        String rName = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_id", Long.valueOf(this.LL.getID()));
        AnoleModel anoleModel2 = this.LLILLJJLI.LIZLLL.getAnoleModel();
        if (anoleModel2 != null) {
            lValueOf = Long.valueOf(anoleModel2.templateID);
        }
        linkedHashMap.put("template_id", lValueOf);
        linkedHashMap.put("component_type", this.LL.type);
        mapLJIIJ.put(rName, linkedHashMap);
        interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC1003470cDh(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r8, X.C1009340cNA r9, X.InterfaceC1014270cV7 r10, android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1003470cDh.<init>(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel, X.0cNA, X.0cV7, android.content.Context):void");
    }
}
