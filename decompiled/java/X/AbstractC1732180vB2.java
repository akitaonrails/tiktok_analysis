package X;

import Y.ARunnableS30S1100000_26;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.PopUp;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.BigSaleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1732180vB2 extends AbstractC1732690vBr {
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public long LLJJ;
    public C1731850vAV LLJJI;

    public static final String LJJIJLIJ() {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    public final String LJJIL() {
        String string;
        Room room = this.LLILZIL;
        return (room == null || (string = Long.valueOf(room.getId()).toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    @Override // X.AbstractC1732690vBr, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        IStickerViewService iStickerViewService;
        super.onDestroy();
        C1731850vAV c1731850vAV = this.LLJJI;
        if (c1731850vAV == null || (iStickerViewService = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iStickerViewService.removeScanPhotoListListener(c1731850vAV);
    }

    public final void LJJJ(PopUp popUp) {
        C19EG c19egLIZIZ;
        if (popUp.needShow) {
            String str = popUp.schema;
            if (!this.LLJILJILJ && System.currentTimeMillis() - this.LLJJ >= ((Number) this.LLJILLL.getValue()).longValue() && (c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLL)) != null) {
                c19egLIZIZ.runOnUiThread(new ARunnableS30S1100000_26(this, str, 1));
            }
        }
    }

    public AbstractC1732180vB2(Context context, int i) {
        super(context, i);
        this.LLJILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(298));
    }

    @Override // X.AbstractC1732690vBr, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC1732690vBr, X.InterfaceC1124060fMC
    public void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        boolean z;
        CommerceStruct commerceStruct;
        super.prepareToShow(map, interfaceC756140TlM);
        Object obj = map.get("param_is_hidden_ec_widget");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Room room = this.LLILZIL;
        boolean z2 = true;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE) || !z) {
            z2 = false;
        }
        interfaceC756140TlM.LIZ(z2);
    }

    @Override // X.AbstractC1732690vBr
    public final void LJJ(List<ECBillboard> list, Number number, InterfaceC1731950vAf interfaceC1731950vAf) {
        LJJIZ(number, list, false, interfaceC1731950vAf);
    }

    @Override // X.AbstractC1732690vBr
    public final void LJJIFFI(List<ECBillboard> list, Number number, InterfaceC1731950vAf interfaceC1731950vAf) {
        LJJIZ(number, list, true, interfaceC1731950vAf);
    }

    public final void LJJIZ(Number number, List<ECBillboard> list, boolean z, InterfaceC1731950vAf interfaceC1731950vAf) {
        String str;
        String str2;
        Iterator<ECBillboard> it2;
        String str3;
        Iterator<ECBillboard> it3;
        try {
            it3 = list.iterator();
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str = null;
        }
        while (it3.hasNext()) {
            str = it3.next().schema;
            if (str != null) {
                if (Intrinsics.LJFF(number, 1)) {
                    C1732020vAm c1732020vAm = C1732020vAm.LIZ;
                    Context context = this.LLILLL;
                    String strLJJIL = LJJIL();
                    String strLJJIJLIJ = LJJIJLIJ();
                    ECBillboard eCBillboard = (ECBillboard) C13LP.LJJJLL(list);
                    if (eCBillboard != null) {
                        str3 = eCBillboard.billboardId;
                    } else {
                        str3 = null;
                    }
                    String strLJJIJ = LJJIJ();
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                    c1732020vAm.getClass();
                    EffectRootData effectRootData = new EffectRootData(strLJJIJLIJ, strLJJIL, (Map) null, strLJJIJ, "jsb", 36);
                    if (!z) {
                        C1732020vAm.LIZJ(effectRootData, strLJJIJLIJ, 1, interfaceC1731950vAf, str3);
                        return;
                    } else if (str3 != null) {
                        C1732020vAm.LJFF(context, effectRootData, str3, 1, interfaceC1731950vAf, str);
                        return;
                    } else {
                        interfaceC1731950vAf.LIZ("billboard id is null");
                        return;
                    }
                }
                if (Intrinsics.LJFF(number, 2)) {
                    try {
                        if (list.size() > 1) {
                            interfaceC1731950vAf.LIZ("more than 1 banner");
                            return;
                        }
                        try {
                            it2 = list.iterator();
                        } catch (CancellationException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw e2;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            str2 = null;
                        }
                        while (it2.hasNext()) {
                            BigSaleConfig bigSaleConfig = it2.next().bigSaleConfig;
                            if (bigSaleConfig != null && (str2 = bigSaleConfig.imageUrl) != null) {
                                if (z) {
                                    if (C123100dR.LIZ(str2)) {
                                        C1732020vAm c1732020vAm2 = C1732020vAm.LIZ;
                                        String strLJJIL2 = LJJIL();
                                        String strLJJIJLIJ2 = LJJIJLIJ();
                                        String strLJJIJ2 = LJJIJ();
                                        if (str == null || str.length() == 0) {
                                            str = null;
                                        }
                                        c1732020vAm2.getClass();
                                        C1732020vAm.LJIIJJI(strLJJIL2, strLJJIJLIJ2, true, str2, interfaceC1731950vAf, strLJJIJ2, "jsb", str);
                                        return;
                                    }
                                    interfaceC1731950vAf.LIZ("try display but no img");
                                    return;
                                }
                                C1732020vAm c1732020vAm3 = C1732020vAm.LIZ;
                                String strLJJIL3 = LJJIL();
                                String strLJJIJLIJ3 = LJJIJLIJ();
                                String strLJJIJ3 = LJJIJ();
                                if (str == null || str.length() == 0) {
                                    str = null;
                                }
                                c1732020vAm3.getClass();
                                C1732020vAm.LJIIJJI(strLJJIL3, strLJJIJLIJ3, false, "", interfaceC1731950vAf, strLJJIJ3, "jsb", str);
                                return;
                            }
                        }
                        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("banner exception: ");
                        sbLIZ.append(e3.getMessage());
                        interfaceC1731950vAf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                } else {
                    interfaceC1731950vAf.LIZ("invalid container type " + number);
                    return;
                }
            }
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }
}
