package X;

import Y.ACListenerS88S1100000_27;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0x6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806080x6E extends AbstractC1805640x5W {
    public final ViewGroup LIZJ;
    public final ViewModelStoreOwner LIZLLL;
    public final LifecycleOwner LJ;
    public C16F5 LJFF;
    public C1324720kZq LJI;
    public ProgressBar LJII;
    public final C01GW LJIIIIZZ;
    public C1568560qv8 LJIIIZ;

    @Override // X.AbstractC1805640x5W
    public final int LIZIZ() {
        return R.layout.h44;
    }

    @Override // X.AbstractC1805640x5W
    public final void LJ() {
    }

    @Override // X.AbstractC1805640x5W
    public final void LJFF() {
        NoticesResult.Notice notice;
        Map<String, String> map;
        NoticesResult.Notice notice2;
        Map<String, String> map2;
        String str;
        C1568560qv8 c1568560qv8 = this.LJIIIZ;
        String str2 = null;
        Integer numLJIIJJI = (c1568560qv8 == null || (notice2 = c1568560qv8.LIZ) == null || (map2 = notice2.extra) == null || (str = map2.get("gift_id")) == null) ? null : C2095008Iq.LJIIJJI(str);
        C1568560qv8 c1568560qv82 = this.LJIIIZ;
        if (c1568560qv82 != null && (notice = c1568560qv82.LIZ) != null && (map = notice.extra) != null) {
            str2 = map.get("vault_type");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_vault_recharge_banner_show");
        c474500IjALIZ.LJJII(numLJIIJJI, "gift_id");
        c474500IjALIZ.LJJII("banner", "banner_type");
        c474500IjALIZ.LJJII("app", "app_type");
        c474500IjALIZ.LJJII(str2, "vault_type");
        c474500IjALIZ.LIZ();
    }

    public final C1324720kZq LJI() {
        ViewGroup viewGroup = this.LIZJ;
        KeyEvent.Callback callbackFindViewById = this.LJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewGroup.findViewById(R.id.vault_banner_unlock_gift_icon);
            this.LJI = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZJ() {
        View viewFindViewById;
        LifecycleCoroutineScope lifecycleScope;
        super.LIZJ();
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = (VaultRechargeUnlockGiftViewModel) this.LJIIIIZZ.getValue();
        LifecycleOwner lifecycleOwner = this.LJ;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C861010Xq7(vaultRechargeUnlockGiftViewModel, this, null), 3);
        }
        View view = this.LIZIZ;
        if (view == null || (viewFindViewById = view.findViewById(R.id.vault_banner_icon)) == null) {
            return;
        }
        C1143680frq.LJ(viewFindViewById, "tiktok_live_wallet_resource", "ttlive_ic_recharge_banner_vault_icon.png", ImageView.ScaleType.FIT_XY);
    }

    @Override // X.AbstractC1805640x5W
    public final EnumC1568540qv6 LIZ() {
        return EnumC1568540qv6.VAULT_RECHARGE_TO_UNLOCK;
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZLLL(AbstractC1568580qvA abstractC1568580qvA) {
        C1568560qv8 c1568560qv8;
        Map<String, String> map;
        Integer numLJIIJJI;
        int iIntValue;
        int iIntValue2;
        int i;
        NoticesResult.Notice notice;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        String strLJIIL = null;
        if ((abstractC1568580qvA instanceof C1568560qv8) && (c1568560qv8 = (C1568560qv8) abstractC1568580qvA) != null) {
            this.LJIIIZ = c1568560qv8;
            NoticesResult.Notice notice2 = ((C1568560qv8) abstractC1568580qvA).LIZ;
            if (notice2 != null && (map = notice2.extra) != null) {
                String str = map.get("gift_id");
                if (str != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str);
                } else {
                    numLJIIJJI = null;
                }
                ((VaultRechargeUnlockGiftViewModel) this.LJIIIIZZ.getValue()).LL = numLJIIJJI;
                if (numLJIIJJI != null) {
                    numLJIIJJI.intValue();
                    String str2 = map.get("unlock_distance");
                    if (str2 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str2)) != null) {
                        iIntValue = numLJIIJJI3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str3 = map.get("total_coins");
                    if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                        iIntValue2 = numLJIIJJI2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    String str4 = map.get("gift_icon_url");
                    String str5 = map.get("vault_schema_url");
                    if (str5 != null) {
                        if (str5.length() == 0) {
                            return;
                        }
                        View view = this.LIZIZ;
                        if (view != null) {
                            C786410Ut5.I7(new ACListenerS88S1100000_27(this, str5, 1), view);
                        }
                    }
                    C1568560qv8 c1568560qv82 = this.LJIIIZ;
                    if (c1568560qv82 != null && (notice = c1568560qv82.LIZ) != null) {
                        strLJIIL = notice.title;
                    }
                    ViewGroup viewGroup = this.LIZJ;
                    KeyEvent.Callback callbackFindViewById = this.LJFF;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = viewGroup.findViewById(R.id.vault_banner_title_tv);
                        this.LJFF = (C16F5) callbackFindViewById;
                    }
                    TextView textView = (TextView) callbackFindViewById;
                    if (textView != null) {
                        if (!C500260Jjc.LJJIIZ(strLJIIL)) {
                            strLJIIL = C497740JfY.LJIIL(2131756028, iIntValue, Integer.valueOf(iIntValue));
                        }
                        textView.setText(strLJIIL);
                    }
                    ViewGroup viewGroup2 = this.LIZJ;
                    KeyEvent.Callback callbackFindViewById2 = this.LJII;
                    if (callbackFindViewById2 == null) {
                        callbackFindViewById2 = viewGroup2.findViewById(R.id.vault_banner_progress_bar);
                        this.LJII = (ProgressBar) callbackFindViewById2;
                    }
                    ProgressBar progressBar = (ProgressBar) callbackFindViewById2;
                    if (progressBar != null) {
                        progressBar.setMax(iIntValue2);
                    }
                    ViewGroup viewGroup3 = this.LIZJ;
                    KeyEvent.Callback callbackFindViewById3 = this.LJII;
                    if (callbackFindViewById3 == null) {
                        callbackFindViewById3 = viewGroup3.findViewById(R.id.vault_banner_progress_bar);
                        this.LJII = (ProgressBar) callbackFindViewById3;
                    }
                    ProgressBar progressBar2 = (ProgressBar) callbackFindViewById3;
                    if (progressBar2 != null) {
                        if (iIntValue2 < iIntValue) {
                            i = 0;
                        } else {
                            i = iIntValue2 - iIntValue;
                        }
                        progressBar2.setProgress(i);
                    }
                    if (str4 != null && str4.length() != 0) {
                        C1324720kZq c1324720kZqLJI = LJI();
                        if (c1324720kZqLJI != null) {
                            C12ES.LJIILL(0, c1324720kZqLJI);
                        }
                        C1819620xS4.LIZ().setUrl(str4).LJJI(LJI());
                        return;
                    }
                    C1324720kZq c1324720kZqLJI2 = LJI();
                    if (c1324720kZqLJI2 != null) {
                        C439101nJ.LJI(c1324720kZqLJI2);
                    }
                }
            }
        }
    }

    public C1806080x6E(ViewGroup viewGroup, ViewModelStoreOwner viewModelStoreOwner) {
        super(viewGroup);
        this.LIZJ = viewGroup;
        this.LIZLLL = viewModelStoreOwner;
        this.LJ = ViewTreeLifecycleOwner.get(viewGroup);
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1343));
    }

    public final void LJII(Context context, String str) {
        if (context != null && str != null && str.length() != 0) {
            if (C1804000x2s.LIZ(context)) {
                VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = (VaultRechargeUnlockGiftViewModel) this.LJIIIIZZ.getValue();
                vaultRechargeUnlockGiftViewModel.LLILZIL = true;
                vaultRechargeUnlockGiftViewModel.LLILLJJLI = str;
                C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                return;
            }
            C495520Jby c495520Jby = new C495520Jby(str);
            c495520Jby.LIZJ("enter_from", "recharge_banner");
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c495520Jby.LIZLLL());
        }
    }
}
