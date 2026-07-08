package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698430uIb extends C09AY implements InterfaceC1685430txd {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685430txd
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4, obj5, obj6);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698430uIb(AbstractC1622910sKn abstractC1622910sKn, AbstractC1622910sKn<InterfaceC1625000sOA> abstractC1622910sKn2) {
        super(6);
        this.$t = abstractC1622910sKn2;
        this.l0 = abstractC1622910sKn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698430uIb(C1627150sRd c1627150sRd, int i) {
        super(6);
        this.$t = i;
        this.l0 = c1627150sRd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698430uIb(l0 l0Var, int i) {
        super(6);
        this.$t = i;
        this.l0 = l0Var;
    }

    public static final Object invoke$0(C1698430uIb c1698430uIb, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String extra;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        String str = (String) obj3;
        Effect effect = (Effect) obj4;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        ((Boolean) obj6).booleanValue();
        if (effect != null) {
            ((AbstractC1622910sKn) c1698430uIb.l0).n5().LJJ(effect);
        }
        ((AbstractC1622910sKn) c1698430uIb.l0).B3(jLongValue2);
        ((AbstractC1622910sKn) c1698430uIb.l0).t5().LJLIIIL();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerCoreLogicComponent#IEffectController.switchEffect:effectId:");
        sbLIZ.append(jLongValue2);
        sbLIZ.append(":filPath:");
        sbLIZ.append(str);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC1622910sKn) c1698430uIb.l0).C0().LJJIJL(System.currentTimeMillis());
        InterfaceC1645720sva interfaceC1645720svaT5 = ((AbstractC1622910sKn) c1698430uIb.l0).t5();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        AbstractC1622910sKn abstractC1622910sKn = (AbstractC1622910sKn) c1698430uIb.l0;
        vEEffectFilterParam.effectPath = str;
        vEEffectFilterParam.useLongId = true;
        vEEffectFilterParam.longStickerId = jLongValue2;
        vEEffectFilterParam.longRequestId = jLongValue;
        if (effect == null || (extra = effect.getExtra()) == null) {
            extra = "";
        }
        vEEffectFilterParam.stickerTag = extra;
        vEEffectFilterParam.needReload = zBooleanValue;
        if (C1624200sMs.LJIILIIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
        }
        if (C1624200sMs.LJIILJJIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
        }
        if (C1624200sMs.LJIIJJI(effect)) {
            vEEffectFilterParam.multicamMode = true;
        }
        abstractC1622910sKn.Z4().LJIIJ.invoke(String.valueOf(jLongValue2), effect);
        return Integer.valueOf(interfaceC1645720svaT5.On(vEEffectFilterParam));
    }

    public static final Object invoke$1(C1698430uIb c1698430uIb, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String resourceId;
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        String str = (String) obj3;
        Effect effect = (Effect) obj4;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        if (effect != null) {
            ((l0) c1698430uIb.l0).n5().LJJ(effect);
        }
        ((l0) c1698430uIb.l0).B3(jLongValue2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Call the VE operation and set the sticker to VE effectId = ");
        sbLIZ.append(jLongValue2);
        C1658310tFt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String strZe = ((l0) c1698430uIb.l0).ze(effect, str);
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        l0 l0Var = (l0) c1698430uIb.l0;
        vEEffectFilterParam.effectPath = strZe;
        vEEffectFilterParam.useLongId = true;
        vEEffectFilterParam.longStickerId = jLongValue2;
        vEEffectFilterParam.longRequestId = jLongValue;
        if (effect == null || (resourceId = effect.getResourceId()) == null) {
            resourceId = "";
        }
        vEEffectFilterParam.resId = resourceId;
        vEEffectFilterParam.stickerTag = l0Var.Df(effect);
        vEEffectFilterParam.needReload = zBooleanValue;
        if (C1624200sMs.LJIILIIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
        }
        if (C1624200sMs.LJIILJJIL(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
        }
        if (C1624200sMs.LJIIJJI(effect)) {
            vEEffectFilterParam.multicamMode = true;
        }
        if (zBooleanValue2) {
            vEEffectFilterParam.isSyncLoadResource = true;
            vEEffectFilterParam.resourceQuickRelease = true;
        }
        ((l0) c1698430uIb.l0).C0().LJJIJL(System.currentTimeMillis());
        return Integer.valueOf(((l0) c1698430uIb.l0).t5().On(vEEffectFilterParam));
    }

    public static final Object invoke$2(C1698430uIb c1698430uIb, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Effect effect = (Effect) obj;
        final List<C1621190sI1> list = (List) obj2;
        final List<C1621190sI1> list2 = (List) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        final int iIntValue = ((Number) obj5).intValue();
        final String str = (String) obj6;
        final C21356918hz c21356918hz = new C21356918hz();
        if (C2348109Hz.LIZ() && effect != null) {
            c21356918hz.LIZIZ(effect.getSdkExtra());
        }
        if (zBooleanValue) {
            InterfaceC540980LJo interfaceC540980LJoQ30 = ((l0) c1698430uIb.l0).getCameraApiComponent().Q30();
            l0 l0Var = (l0) c1698430uIb.l0;
            l0Var.getLifecycleOwner();
            final l0 l0Var2 = (l0) c1698430uIb.l0;
            interfaceC540980LJoQ30.LIZ(l0Var, new InterfaceC1441305kZ<Pair<? extends Integer, ? extends Boolean>>() { // from class: X.0sIi
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj7) {
                    Pair pair = (Pair) obj7;
                    if (pair != null && ((Boolean) pair.getSecond()).booleanValue()) {
                        l0Var2.getCameraApiComponent().Q30().LIZIZ(this);
                        l0Var2.c9(list, list2, c21356918hz, iIntValue, str);
                    }
                }
            });
        } else {
            ((l0) c1698430uIb.l0).c9(list, list2, c21356918hz, iIntValue, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1698430uIb c1698430uIb, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str;
        String effectId;
        InterfaceC1625220sOW interfaceC1625220sOWUq;
        String str2;
        Effect effectLIZ;
        String effectId2;
        Effect effectLIZ2;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        InterfaceC1626470sQX interfaceC1626470sQX = (InterfaceC1626470sQX) obj5;
        InterfaceC1626470sQX interfaceC1626470sQX2 = (InterfaceC1626470sQX) obj6;
        if (C297970Bm7.LIZ()) {
            ((C1627150sRd) c1698430uIb.l0).i3(new AwS604S0100000_25(new C443120HZe(interfaceC1626470sQX2, Boolean.valueOf(((C1627150sRd) c1698430uIb.l0).P4(interfaceC1626470sQX2)), Integer.valueOf(iIntValue2)), (C443120HZe<? extends InterfaceC1626470sQX, Boolean, Integer>) 474));
        }
        C1627110sRZ c1627110sRZ = C1627110sRZ.LIZ;
        ShortVideoContext shortVideoContext = ((C1627150sRd) c1698430uIb.l0).getShortVideoContext();
        if (zBooleanValue) {
            str = "click";
        } else {
            str = "scroll";
        }
        String str3 = "";
        if (interfaceC1626470sQX == null || (effectLIZ2 = C1629110sUn.LIZ(interfaceC1626470sQX)) == null || (effectId = effectLIZ2.getEffectId()) == null) {
            effectId = "";
        }
        if (interfaceC1626470sQX2 != null && (effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQX2)) != null && (effectId2 = effectLIZ.getEffectId()) != null) {
            str3 = effectId2;
        }
        c1627110sRZ.getClass();
        C1627110sRZ.LIZJ(shortVideoContext, "half_width_scroll_carousel", str, 0, iIntValue, iIntValue2, effectId, str3);
        if (zBooleanValue2 && iIntValue2 > 0 && iIntValue != iIntValue2 && (interfaceC1625220sOWUq = ((C1627150sRd) c1698430uIb.l0).uq()) != null) {
            C1627150sRd c1627150sRd = (C1627150sRd) c1698430uIb.l0;
            InterfaceC1626470sQX interfaceC1626470sQX3 = (InterfaceC1626470sQX) C13LP.LJJJLZIJ(iIntValue2, c1627150sRd.LLJJIJIIJIL);
            if (interfaceC1626470sQX3 != null) {
                PropFromGroupModel propFromGroupModel = c1627150sRd.LLJILLL.getShortVideoContext().creativeModel.propFromGroupModel;
                if (interfaceC1626470sQX3 instanceof InterfaceC1627120sRa) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("tab_name", "carousel", bundle);
                    C786410Ut5.LJJJI("tab_key", "carousel", bundle);
                    if (interfaceC1626470sQX3 instanceof C1625930sPf) {
                        str2 = "prop_carousel_Favorites";
                    } else {
                        str2 = "prop_carousel_trending";
                    }
                    C786410Ut5.LJJJI("prop_selected_from", str2, bundle);
                    C786410Ut5.LJJJI("carousel_open", "1", bundle);
                    Effect effectLIZ3 = C1629110sUn.LIZ(interfaceC1626470sQX3);
                    InterfaceC1627120sRa interfaceC1627120sRa = (InterfaceC1627120sRa) interfaceC1626470sQX3;
                    interfaceC1625220sOWUq.LJIIJ(effectLIZ3, false, interfaceC1627120sRa.getTabName(), interfaceC1627120sRa.getTabKey(), "", iIntValue2, false, bundle, propFromGroupModel);
                }
            }
        }
        return Unit.LIZ;
    }
}
