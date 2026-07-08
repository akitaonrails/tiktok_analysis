package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21200217xo extends AbstractC21202217y8 implements InterfaceC1733560vDG {
    public C1781690wSt LLILZLL;
    public ISeaLiveContextAbility LLIZ;
    public C21200317xp LLIZLLLIL;
    public Function0<Unit> LLJ;
    public Long LLJI;
    public View LLJIJIL;

    public abstract void B0();

    public abstract void C0();

    public abstract String F0(PopupCardVO popupCardVO);

    public abstract String I0(PopupCardVO popupCardVO);

    public Long L0(PopupCardVO popupCardVO, boolean z) {
        return null;
    }

    public JSONObject M0(PopupCardVO popupCardVO) {
        return null;
    }

    public abstract int getCardDefaultHeight();

    @Override // X.AbstractC21202217y8
    public abstract /* synthetic */ Map<String, String> getCommonShowParams();

    public String getKey() {
        return null;
    }

    @Override // X.AbstractC21202217y8, X.InterfaceC21184117vD
    public abstract /* synthetic */ List<String> getProductShowIds();

    public abstract C1781690wSt j0(PopupCardVO popupCardVO, C1781700wSu c1781700wSu);

    @Override // X.AbstractC21202217y8
    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    public void z0() {
    }

    @Override // X.AbstractC21202217y8
    public final void e0() {
        C1776350wKH c1776350wKH;
        InterfaceC21200617xs interfaceC21200617xs;
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        C599810Nfn.LIZ.getClass();
        C599810Nfn.LIZ("SeaLiveLynxPopCardBaseView", "destroy: when dismiss");
        super.e0();
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLIZ;
        if (iSeaLiveContextAbility != null && (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
            c1732860vC8LIZ.LIZJ(InterfaceC1733560vDG.class, this);
        }
        if (this.LLIZ != null) {
            C0();
        }
        this.LLILZLL = null;
        this.LLJIJIL = null;
        C21200317xp c21200317xp = this.LLIZLLLIL;
        if (c21200317xp == null || (c1776350wKH = c21200317xp.LIZLLL) == null || (interfaceC21200617xs = (InterfaceC21200617xs) ((LinkedHashMap) c21200317xp.LIZJ).get(c1776350wKH)) == null) {
            return;
        }
        interfaceC21200617xs.hide();
        if (c21200317xp.LIZIZ) {
            return;
        }
        c21200317xp.LIZJ.remove(c1776350wKH);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "sea_live_lynx_destroy_switch", true, true)) {
            C786410Ut5.LJLIIL(1000L, (Handler) c21200317xp.LJFF.getValue(), new ARunnableS100S0200000_31(c21200317xp, interfaceC21200617xs, 56));
        }
    }

    @Override // X.InterfaceC1733560vDG
    public final void M() {
        C181I popCardViewCallback = getPopCardViewCallback();
        if (popCardViewCallback != null) {
            popCardViewCallback.LJIL();
        }
    }

    private final View getCurrentLynxView() {
        return this.LLJIJIL;
    }

    private final C21200317xp getLynxManager() {
        return this.LLIZLLLIL;
    }

    public final ISeaLiveContextAbility getLiveContextAbility() {
        return this.LLIZ;
    }

    public static String s0(C1781700wSu c1781700wSu) {
        C13DA c13da = new C13DA();
        c13da.put("data", c1781700wSu.LIZ);
        JSONObject jSONObject = c1781700wSu.LIZJ;
        if (jSONObject != null) {
            c13da.put("e2e_time_info", C786410Ut5.J3(jSONObject));
        }
        return C1741890vQh.LJIIIIZZ(c13da.build());
    }

    @Override // X.InterfaceC1733560vDG
    public final void LLLLIILLL(String str) {
        C181I popCardViewCallback;
        if (Intrinsics.LJFF(str, EnumC1782950wUv.DATA_ERROR.getMessage()) && (popCardViewCallback = getPopCardViewCallback()) != null) {
            popCardViewCallback.LJIJJLI(str);
        }
        Function0<Unit> function0 = this.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public Map l0(boolean z) {
        return C2097608Jq.LJ();
    }

    public final void u0(ISeaLiveContextAbility iSeaLiveContextAbility, C21200317xp c21200317xp) {
        C1732860vC8 c1732860vC8LIZ;
        this.LLIZ = iSeaLiveContextAbility;
        this.LLIZLLLIL = c21200317xp;
        if (iSeaLiveContextAbility != null) {
            C1732870vC9 c1732870vC9JC2 = iSeaLiveContextAbility.JC2();
            if (c1732870vC9JC2 != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
                c1732860vC8LIZ.LIZIZ(InterfaceC1733560vDG.class, this);
            }
            B0();
        }
    }

    public AbstractC21200217xo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final C1781700wSu p0(PopupCardVO popupCardVO, boolean z, boolean z2) {
        long jLongValue;
        String str;
        InterfaceC599460NfE interfaceC599460NfEHW1;
        Map<String, Object> trackParams;
        Object obj;
        String string;
        Long lLJIILIIL;
        Long lL0 = L0(popupCardVO, z);
        String strI0 = I0(popupCardVO);
        JSONObject jSONObjectM0 = M0(popupCardVO);
        ISeaLiveContextAbility liveContextAbility = getLiveContextAbility();
        if (liveContextAbility != null && (interfaceC599460NfEHW1 = liveContextAbility.hW1()) != null && (trackParams = interfaceC599460NfEHW1.getTrackParams()) != null && (obj = trackParams.get("click_enter_room_time")) != null && (string = obj.toString()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enter_room_card", str);
        linkedHashMap.put("click_enter_room_time", Long.valueOf(jLongValue));
        linkedHashMap.putAll(l0(z));
        return new C1781700wSu(strI0, lL0, jSONObjectM0, linkedHashMap, F0(popupCardVO));
    }

    public final C1783930wWV n0(PopupCardVO popupCardVO, String str, int i, boolean z) {
        z0();
        C1781700wSu c1781700wSuP0 = p0(popupCardVO, false, z);
        String strS0 = s0(c1781700wSuP0);
        int i2 = popupCardVO.cardType;
        String str2 = c1781700wSuP0.LJ;
        if (str2.length() != 0) {
            str = str2;
        }
        return new C1783930wWV(strS0, new C1783920wWU(i2, i, str, C2097908Jt.LIZJ(new Pair("page_params", C1741890vQh.LJIIIIZZ(c1781700wSuP0.LIZLLL)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r11, kotlin.jvm.functions.Function0 r12, boolean r13, boolean r14, X.EnumC1781750wSz r15) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21200217xo.E0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, kotlin.jvm.functions.Function0, boolean, boolean, X.0wSz):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1776350wKH c1776350wKH;
        InterfaceC21200617xs interfaceC21200617xs;
        super.onLayout(z, i, i2, i3, i4);
        if (!getShown()) {
            setShown(true);
            C181I popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJ();
            }
            C21200317xp c21200317xp = this.LLIZLLLIL;
            if (c21200317xp != null && (c1776350wKH = c21200317xp.LIZLLL) != null && (interfaceC21200617xs = (InterfaceC21200617xs) ((LinkedHashMap) c21200317xp.LIZJ).get(c1776350wKH)) != null) {
                interfaceC21200617xs.show();
            }
        }
    }
}
