package X;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.lynx.tasm.TemplateData;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS320S0000000_32;
import kotlin.jvm.internal.AwS161S0110000_32;

/* JADX INFO: renamed from: X.17zC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21208817zC implements InterfaceC21213517zx {
    public final Room LL;
    public final boolean LLILLJJLI;
    public C1097680efe LLILLL;
    public C1537720q7O LLILZ;
    public boolean LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(755));
    public final MutableLiveData<String> LLJ = new MutableLiveData<>();

    @Override // X.InterfaceC21213517zx
    public final void onAudiencePermissionChanged(boolean z) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onClick(long j, String str, Map<String, ? extends Object> map, String str2) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onDispose() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onExposure(String str) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onPause() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onProductNumChange(int i) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onResume() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onShopBagIconDrawableLoaded() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStop() {
    }

    @Override // X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
    }

    public final void LIZJ() {
        C1537720q7O c1537720q7O = this.LLILZ;
        if (c1537720q7O == null || this.LLILZLL) {
            return;
        }
        Room room = this.LL;
        Pair[] pairArr = new Pair[2];
        C212391189t c212391189t = C212391189t.LIZ;
        String strValueOf = String.valueOf(room != null ? Long.valueOf(room.getId()) : null);
        c212391189t.getClass();
        pairArr[0] = new Pair("lru_shop_bag", C212391189t.LIZ("shop_bag", strValueOf));
        pairArr[1] = new Pair("lru_pin_product", C212391189t.LIZ("pin_product", String.valueOf(room != null ? Long.valueOf(room.getId()) : null)));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String strLIZ = C212391189t.LIZ("prerender_bag_assemble", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        if (strLIZ != null) {
            mapLJIIJ.put("lru_prerender_bag_assemble", strLIZ);
        }
        if (((Boolean) C276540Ase.LIZ.getValue()).booleanValue()) {
            mapLJIIJ.put("lru_product_update", C212391189t.LIZ("product_update", String.valueOf(room != null ? Long.valueOf(room.getId()) : null)));
        }
        c1537720q7O.updateData(TemplateData.LJII(C2097608Jq.LJIIZILJ(mapLJIIJ)));
    }

    @Override // X.InterfaceC21213517zx
    public final void onDestroy() {
        if (this.LLILLL != null) {
            String str = this.LLIZ;
            if (str != null) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LIZIZ(str, "ec_shop_bag_biz", null);
            }
            C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
            C1537060q6K.LJIILL("ec_shop_bag_biz");
            this.LLILLL = null;
        }
    }

    public C21208817zC(Room room, boolean z) {
        this.LL = room;
        this.LLILLJJLI = z;
    }

    public static Map LIZ(String str, String str2) {
        Pair[] pairArr = new Pair[2];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("lru_live_bag_assemble", str);
        pairArr[1] = new Pair("debug_msg", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final void LIZIZ(String str, boolean z, boolean z2) {
        if (z2) {
            return;
        }
        this.LLIZ = str;
        this.LLILZLL = z;
        AwS161S0110000_32 awS161S0110000_32 = new AwS161S0110000_32(this, z, 1);
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "ec_shop_bag_biz";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIJJLI = Collections.singletonList("fe_tiktok_ecommerce_live_room_shop_bag");
        c1097680efe.LJIL = Collections.singletonList("fe_tiktok_ecommerce_shop_cart");
        c1097680efe.LJIIIIZZ = AFwS320S0000000_32.get$arr$(1);
        c1097680efe.LJIJJ = awS161S0110000_32;
        this.LLILLL = c1097680efe;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        if (C770702zh.LIZ(str)) {
            C1537060q6K.LJIIJJI(c1537060q6K, str, "ec_shop_bag_biz", null, null, ((Boolean) this.LLILZIL.getValue()).booleanValue(), null, 44);
        }
    }
}
