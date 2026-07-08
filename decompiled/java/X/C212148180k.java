package X;

import android.os.Bundle;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.SeaLiveBagIconEducationBubbleSetting;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.180k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212148180k implements InterfaceC21213517zx, InterfaceC19379010rk {
    public static final C180D LLJJI = new Object() { // from class: X.180D
    };
    public static final Keva LLJJIII = Keva.getRepo("ecommerce_live_shop_bag_education_bubble_repo");
    public final Function0<Room> LL;
    public final Function0<Map<String, String>> LLILLJJLI;
    public final Function0<C1743900vTw> LLILLL;
    public IIconSlot.SlotViewModel LLILZ;
    public Room LLILZIL;
    public String LLILZLL = "";
    public String LLIZ = "";
    public final SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C054G LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;

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
    public final void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStop() {
    }

    @Override // X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
    }

    public final boolean LIZIZ() {
        int iLIZ = C19378910rj.LIZ(this.LLILZLL, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("otherCardShow, pinCardWidgetState = ");
        sbLIZ.append(iLIZ);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return iLIZ == 2 || iLIZ == 5;
    }

    @Override // X.InterfaceC21213517zx
    public final void onDestroy() {
        C2296808zG.LIZJ(this.LLJIJIL, null);
        if (this.LLJ) {
            LIZ("unregisterWidgetStateListener");
            C19378910rj.LJ(this.LLILZLL, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE", this);
            this.LLJ = false;
        }
    }

    public static final void LIZ(String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("education_bubble : ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.Integer r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212148180k.LIZJ(java.lang.Integer, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC21213517zx
    public final void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String idStr;
        Room room;
        String string;
        Room roomInvoke = this.LL.invoke();
        this.LLILZIL = roomInvoke;
        String str = "";
        if (roomInvoke == null || (idStr = roomInvoke.getIdStr()) == null) {
            idStr = "";
        }
        this.LLILZLL = idStr;
        Room room2 = this.LLILZIL;
        if (room2 != null && room2.getIdStr() != null && (room = this.LLILZIL) != null && Long.valueOf(room.getOwnerUserId()).toString() != null) {
            Room room3 = this.LLILZIL;
            if (room3 != null && (string = Long.valueOf(room3.getOwnerUserId()).toString()) != null) {
                str = string;
            }
            this.LLIZ = str;
            this.LLILZ = slotViewModel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("meetInitCondition, config=");
            sbLIZ.append(this.LLIZLLLIL);
            LIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolean z = !this.LLJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("registerWidgetStateListener, canShow=");
            sbLIZ2.append(z);
            LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (z && !this.LLJ) {
                LIZ("registerWidgetStateListener startRegister");
                C19378910rj.LIZIZ(this.LLILZLL, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE", this);
                this.LLJ = true;
            }
        }
    }

    public C212148180k(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS576S0100000_32 awS576S0100000_323) {
        this.LL = awS576S0100000_32;
        this.LLILLJJLI = awS576S0100000_322;
        this.LLILLL = awS576S0100000_323;
        SeaLiveBagIconEducationBubbleSetting.LIZ.getClass();
        this.LLIZLLLIL = (SeaLiveBagIconEducationBubbleSetting.SeaLiveBagIconEducationBubbleConfig) SeaLiveBagIconEducationBubbleSetting.LIZJ.getValue();
        this.LLJIJIL = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLJILLL = "";
        this.LLJJ = "";
    }

    @Override // X.InterfaceC19379010rk
    public final void LJFF(int i, String str, Integer num, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange, stateChange=");
        sbLIZ.append(i);
        sbLIZ.append(", widgetName=");
        sbLIZ.append(str);
        LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (3 == i) {
            LIZ("onStateChange close widget and try show");
            C23250099c.LIZLLL(this.LLJIJIL, null, null, new C2194708in(this, num, null), 3);
        }
    }
}
