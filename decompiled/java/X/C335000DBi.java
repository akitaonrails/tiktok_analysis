package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335000DBi extends AbstractC1023470cjx implements InterfaceC335020DBk {
    public static final C0DBY LIZJ = new C0DBY();
    public static final Map<String, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("ac_shop_product_detail_enter", "on_web_detail"), new Pair("ac_shop_sku_confirm", "initiate_order"), new Pair("ac_shop_button_click", "on_web_order"), new Pair("ac_shop_checkout_add_billing", "add_billing"));
    public final Map<String, String> LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C335000DBi(Map<String, String> map, Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = map;
        C335010DBj.LIZ.getClass();
        this.LIZIZ = new C1023630ckD[]{new C1023630ckD<>(C335010DBj.LIZIZ, new AwS583S0100000_4(this, 336)), new C1023630ckD<>(C335010DBj.LIZJ, new AwS583S0100000_4(this, 337)), new C1023630ckD<>(C335010DBj.LIZLLL, AFwS232S0000000_4.get$arr$(247)), new C1023630ckD<>(C335010DBj.LJ, new AwS583S0100000_4(this, 338)), new C1023630ckD<>(C335010DBj.LJFF, AFwS232S0000000_4.get$arr$(248)), new C1023630ckD<>(C335010DBj.LJI, AFwS232S0000000_4.get$arr$(249)), new C1023630ckD<>(C335010DBj.LJII, new AwS583S0100000_4(this, 339)), new C1023630ckD<>(C335010DBj.LJIIIIZZ, new AwS583S0100000_4(this, 340)), new C1023630ckD<>(C335010DBj.LJIIIZ, new AwS583S0100000_4(this, 341)), new C1023630ckD<>(C335010DBj.LJIIJ, new AwS583S0100000_4(this, 333)), new C1023630ckD<>(C335010DBj.LJIIJJI, new AwS583S0100000_4(this, 334)), new C1023630ckD<>(C335010DBj.LJIIL, new AwS583S0100000_4(this, 335))};
    }

    @Override // X.InterfaceC335020DBk
    public final void LJJII(long j, int i, int i2, CommonAdData commonAdData) {
        logAd(C0DDZ.LIZ.LJIIIIZZ(i), commonAdData, new C335060DBo(j, i, i2));
    }
}
