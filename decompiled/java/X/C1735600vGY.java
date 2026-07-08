package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.live.scope.LiveFragmentScope;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.ShopBagListContainerFragment;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735600vGY extends C21208517z9 implements InterfaceC1733550vDF {
    public ISeaLiveContextAbility LLLF;

    @Override // X.C21208517z9, X.InterfaceC21213517zx
    public final void onShopBagIconDrawableLoaded() {
        C21212117zj c21212117zj;
        Context context;
        BcmParams bcmParams;
        super.onShopBagIconDrawableLoaded();
        if (!((Boolean) C276570Ash.LIZ.getValue()).booleanValue() || (c21212117zj = this.LLILLJJLI.get()) == null || (context = c21212117zj.LLIZLLLIL) == null) {
            return;
        }
        C1743900vTw c1743900vTw = this.LL;
        if (Intrinsics.LJFF(c1743900vTw != null ? c1743900vTw.LIZJ("action_type") : null, "click")) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = "";
            c21244318Bt.LIZIZ = C520170Kad.LIZ(context);
            C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false);
            if (bcmChainByBtmModel.LIZ.size() >= 2) {
                C1766990w5B c1766990w5B = ((C1766940w56) ListProtector.get(bcmChainByBtmModel.LIZ, 1)).LJIIIZ;
                String strOptString$default = (c1766990w5B == null || (bcmParams = c1766990w5B.LIZIZ) == null) ? null : BcmParams.optString$default(bcmParams, "qcpx_cache_key", null, 2, null);
                Room room = this.LLILZ;
                Long lValueOf = room != null ? Long.valueOf(room.getId()) : null;
                if (!C123100dR.LIZ(strOptString$default) || lValueOf == null) {
                    return;
                }
                C23250099c.LIZLLL(this.LLJJJJLIIL, C2126308Ur.LIZ, null, new C603640Nly(strOptString$default, lValueOf, this, context, null), 2);
            }
        }
    }

    @Override // X.C21208517z9, X.InterfaceC21213517zx
    public final void onDestroy() {
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        C1548820qPI.LJIIIIZZ("sea_live_close_live_bag", this);
        super.onDestroy();
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLLF;
        if (iSeaLiveContextAbility == null || (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) == null || (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) == null) {
            return;
        }
        c1732860vC8LIZ.LIZJ(InterfaceC1733550vDF.class, this);
    }

    @Override // X.InterfaceC1733550vDF
    public final Object LLLZ(C1733510vDB c1733510vDB) {
        String str;
        Context context;
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLLF;
        if (iSeaLiveContextAbility == null) {
            return new Pair(false, "ability is null");
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1733510vDB));
        c2252611DEt.LJIJJ();
        Object objLIZIZ = iSeaLiveContextAbility.SU1().LIZIZ("room_id", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        InterfaceC594210NSh interfaceC594210NShM5 = null;
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        final String str2 = "";
        if (objLIZIZ == null) {
            objLIZIZ = "";
        }
        Object objLIZIZ2 = iSeaLiveContextAbility.SU1().LIZIZ("author_id", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        if (objLIZIZ2 instanceof String) {
            str = (String) objLIZIZ2;
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        Object objLIZIZ3 = iSeaLiveContextAbility.SU1().LIZIZ("follow_status", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        if (!(objLIZIZ3 instanceof String)) {
            objLIZIZ3 = null;
        }
        final boolean zLJFF = Intrinsics.LJFF(objLIZIZ3, CardStruct.IStatusCode.DEFAULT);
        Fragment fragmentTY0 = iSeaLiveContextAbility.tY0();
        if (fragmentTY0 != null) {
            context = fragmentTY0.getContext();
        } else {
            context = null;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            interfaceC594210NShM5 = iLiveOuterService.m5();
        }
        if (context == null) {
            C098200Yq c098200Yq = new C098200Yq(new Exception("context is null"));
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        } else if (interfaceC594210NShM5 == null) {
            C098200Yq c098200Yq2 = new C098200Yq(new Exception("service is null"));
            C189200o6.m2constructorimpl(c098200Yq2);
            c2252611DEt.resumeWith(c098200Yq2);
        } else {
            final C013C c013c = new C013C();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", objLIZIZ);
                jSONObject.put("user_id", str2);
                jSONObject.put("from_label", "live_pin");
                interfaceC594210NShM5.LIZ(context, jSONObject, new InterfaceC594650NTz() { // from class: X.0NvV
                    @Override // X.InterfaceC594650NTz
                    public final void LIZ(boolean z, String str3, FollowPair followPair) throws JSONException {
                        C013C c013c2 = c013c;
                        if (c013c2.element) {
                            return;
                        }
                        c013c2.element = true;
                        if (z && zLJFF) {
                            JSONObject jSONObject2 = new JSONObject();
                            String str4 = str2;
                            jSONObject2.put("page_name", "live");
                            jSONObject2.put("anchor_id", str4);
                            C1507790pL7.LIZ.getClass();
                            C1507790pL7.LIZLLL("livesdk_follow", jSONObject2);
                        }
                        InterfaceC20236714Gf<Pair<Boolean, String>> interfaceC20236714Gf = c2252611DEt;
                        Pair pair = new Pair(Boolean.valueOf(z), str3);
                        C189200o6.m2constructorimpl(pair);
                        interfaceC20236714Gf.resumeWith(pair);
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!c013c.element) {
                    c013c.element = true;
                    C098200Yq c098200Yq3 = new C098200Yq(e);
                    C189200o6.m2constructorimpl(c098200Yq3);
                    c2252611DEt.resumeWith(c098200Yq3);
                }
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1733510vDB);
        }
        return objLJIJ;
    }

    @Override // X.C21208517z9, X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        ShopBagListContainerFragment shopBagListContainerFragment;
        if (Intrinsics.LJFF(c262100zr.LIZ, "sea_live_close_live_bag")) {
            C21212117zj c21212117zj = this.LLILLJJLI.get();
            if (c21212117zj != null && (context = c21212117zj.LLIZLLLIL) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                for (Fragment fragment : listLJJLIIIJL) {
                    if (fragment instanceof TuxSheet) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, fragment.getChildFragmentManager().LJJLIIIJL());
                        if ((objLJJJLZIJ instanceof ShopBagListContainerFragment) && (shopBagListContainerFragment = (ShopBagListContainerFragment) objLJJJLZIJ) != null) {
                            shopBagListContainerFragment.LJJJJLL(true);
                        }
                    }
                }
                return;
            }
            return;
        }
        super.mh2(c262100zr);
    }

    @Override // X.C21208517z9, X.InterfaceC21213517zx
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1548820qPI.LIZLLL("sea_live_close_live_bag", this);
    }

    @Override // X.C21208517z9
    public final String LJIJ(String str, boolean z) {
        if (LJFF()) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("use_client_request", "1").build().toString();
        }
        return str;
    }

    @Override // X.C21208517z9, X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        C0IIC c0iic;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        Object ability;
        super.prepareToShow(map, interfaceC756140TlM);
        if (C288780BTo.LIZ()) {
            Object obj = map.get("param_sea_live_di_provider");
            ISeaLiveContextAbility iSeaLiveContextAbility = null;
            Object obj2 = null;
            iSeaLiveContextAbility = null;
            iSeaLiveContextAbility = null;
            if ((obj instanceof C0IIC) && (c0iic = (C0IIC) obj) != null && (interfaceC665370Q7zLIZ = c0iic.LIZ()) != null) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLIZ, LiveFragmentScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(ISeaLiveContextAbility.class);
                } else {
                    ability = null;
                }
                if (ability instanceof ISeaLiveContextAbility) {
                    obj2 = ability;
                }
                iSeaLiveContextAbility = (ISeaLiveContextAbility) obj2;
            }
            this.LLLF = iSeaLiveContextAbility;
            if (iSeaLiveContextAbility != null && (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
                c1732860vC8LIZ.LIZIZ(InterfaceC1733550vDF.class, this);
            }
        }
    }

    public C1735600vGY(long j, C1743900vTw c1743900vTw, WeakReference<C21212117zj> weakReference) {
        super(c1743900vTw, weakReference);
    }

    @Override // X.InterfaceC1733550vDF
    public final void LLILLL(String str, String str2, String str3, Map<String, ? extends Object> map) {
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLLF;
        if (iSeaLiveContextAbility == null) {
            return;
        }
        if (str.length() == 0) {
            Object objLIZIZ = iSeaLiveContextAbility.SU1().LIZIZ("room_id", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
            if (!(objLIZIZ instanceof String) || (str = (String) objLIZIZ) == null) {
                str = "";
            }
        }
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        C1440005kM.LIZ(new C037D(str, str2, str3, map));
    }
}
