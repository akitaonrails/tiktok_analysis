package X;

import Y.ARunnableS30S1100000_26;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.PopUp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.BigSaleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1732350vBJ extends AbstractC1732680vBq implements InterfaceC1732660vBo {
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public long LLJJI;
    public C1731840vAU LLJJIII;

    public static final String LJJIJ() {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    public final String LJJIJIIJI() {
        String string;
        Room room = this.LLILZIL;
        return (room == null || (string = Long.valueOf(room.getId()).toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    @Override // X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        IStickerViewService iStickerViewService;
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        InterfaceC600380Ngi interfaceC600380NgiCm0;
        super.onDestroy();
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLJILJILJ;
        if (iSeaLiveContextAbility != null && (interfaceC600380NgiCm0 = iSeaLiveContextAbility.Cm0()) != null) {
            interfaceC600380NgiCm0.U0(interfaceC600380NgiCm0, "ecLivePopupDidCloseEvent");
        }
        ISeaLiveContextAbility iSeaLiveContextAbility2 = this.LLJILJILJ;
        if (iSeaLiveContextAbility2 != null && (c1732870vC9JC2 = iSeaLiveContextAbility2.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
            c1732860vC8LIZ.LIZJ(AbstractC1732350vBJ.class, this);
        }
        C1731840vAU c1731840vAU = this.LLJJIII;
        if (c1731840vAU == null || (iStickerViewService = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iStickerViewService.removeScanPhotoListListener(c1731840vAU);
    }

    public final void LJJIJIL(PopUp popUp) {
        C19EG c19egLIZIZ;
        if (popUp.needShow) {
            String str = popUp.schema;
            if (!this.LLJILLL && System.currentTimeMillis() - this.LLJJI >= ((Number) this.LLJJ.getValue()).longValue() && (c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLL)) != null) {
                c19egLIZIZ.runOnUiThread(new ARunnableS30S1100000_26(this, str, 7));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sj1, X.0vAU] */
    @Override // X.InterfaceC1732660vBo
    public final Object T(C1733530vDD c1733530vDD) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1733530vDD));
        c2252611DEt.LJIJJ();
        ?? r2 = new InterfaceC1637930sj1() { // from class: X.0vAU
            public boolean LL;

            @Override // X.InterfaceC1637930sj1
            public final void f(List<String> list) {
            }

            @Override // X.InterfaceC1637930sj1
            public final void LLZLI(String str) throws Throwable {
                boolean z;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LIZ("", "photo path is empty");
                    return;
                }
                if (u.LJJIIJZLJL(str, "content://", false)) {
                    ContentResolver contentResolver = this.LLILLL.getContentResolver();
                    Uri uri = UriProtector.parse(str);
                    Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAu7KvhQ1wMBjoJbBsLzXDx6hPHZsLleCooqNWDi4ZpeOeANPrzfeBdannHVtQMjGNwVeZduwY4C/w==", null));
                    if (cursorLJJJ == null) {
                        str = String.valueOf(uri.getPath());
                    } else {
                        cursorLJJJ.moveToFirst();
                        str = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("_data"));
                        cursorLJJJ.close();
                    }
                }
                LIZ(str, "");
            }

            public final void LIZ(String str, String str2) {
                if (!this.LL) {
                    this.LL = true;
                    if (!c2252611DEt.isCompleted()) {
                        InterfaceC20236714Gf<Pair<String, String>> interfaceC20236714Gf = c2252611DEt;
                        Pair pair = new Pair(str, str2);
                        C189200o6.m2constructorimpl(pair);
                        interfaceC20236714Gf.resumeWith(pair);
                    }
                }
            }

            @Override // X.InterfaceC1637930sj1
            public final void LLLLLLLLL(String str, String str2, String str3) {
                if (str2 != null && str2.length() != 0) {
                    LIZ(str2, "");
                }
            }
        };
        this.LLJJIII = r2;
        IStickerViewService iStickerViewService = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null);
        if (iStickerViewService != 0) {
            iStickerViewService.initGalleryModule(C1388190mED.LIZ(this.LLILLL), r2);
        }
        IStickerViewService iStickerViewService2 = (IStickerViewService) PluggableExtentionKt.pluggableSpi$default(IStickerViewService.class, false, false, false, 14, null);
        if (iStickerViewService2 != null) {
            iStickerViewService2.selectFromGallery();
        }
        c2252611DEt.LJJII(new AwS605S0100000_26((C1731840vAU) r2, 812));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1733530vDD);
        }
        return objLJIJ;
    }

    public AbstractC1732350vBJ(Context context, int i) {
        super(context, i);
        this.LLJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(508));
    }

    @Override // X.AbstractC1732680vBq
    /* JADX INFO: renamed from: LJJIIJ */
    public void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        InterfaceC600380Ngi interfaceC600380NgiCm0;
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        super.LLIZ(slotViewModel, interfaceC21213717zz);
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLJILJILJ;
        if (iSeaLiveContextAbility != null && (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
            c1732860vC8LIZ.LIZIZ(InterfaceC1732660vBo.class, this);
        }
        ISeaLiveContextAbility iSeaLiveContextAbility2 = this.LLJILJILJ;
        if (iSeaLiveContextAbility2 != null && (interfaceC600380NgiCm0 = iSeaLiveContextAbility2.Cm0()) != null) {
            interfaceC600380NgiCm0.LIZ("ecLivePopupDidCloseEvent", new C598550Ndl(this, null), interfaceC600380NgiCm0);
        }
    }

    @Override // X.AbstractC1732680vBq, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public /* bridge */ /* synthetic */ void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        LLIZ((IFrameSlot.SlotViewModel) viewModel, interfaceC21213717zz);
    }

    @Override // X.AbstractC1732680vBq, X.InterfaceC1124060fMC
    public void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        super.prepareToShow(map, interfaceC756140TlM);
        this.LLJILJILJ = C1732830vC5.LIZ(map);
    }

    @Override // X.AbstractC1732680vBq, X.InterfaceC1733210vCh
    public final void LLLLLLZZ(List list, Number number, C1733430vD3 c1733430vD3) {
        LJJIJIIJIL(number, list, false, c1733430vD3);
    }

    @Override // X.AbstractC1732680vBq, X.InterfaceC1733210vCh
    public final void n(List<SeaLiveBillboard> list, Number number, InterfaceC1732650vBn interfaceC1732650vBn) {
        LJJIJIIJIL(number, list, true, interfaceC1732650vBn);
    }

    public final void LJJIJIIJIL(Number number, List<SeaLiveBillboard> list, boolean z, InterfaceC1732650vBn interfaceC1732650vBn) {
        String str;
        String str2;
        Iterator<SeaLiveBillboard> it2;
        String str3;
        Iterator<SeaLiveBillboard> it3;
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
                    C1732390vBN c1732390vBN = C1732390vBN.LIZ;
                    Context context = this.LLILLL;
                    String strLJJIJIIJI = LJJIJIIJI();
                    String strLJJIJ = LJJIJ();
                    SeaLiveBillboard seaLiveBillboard = (SeaLiveBillboard) C13LP.LJJJLL(list);
                    if (seaLiveBillboard != null) {
                        str3 = seaLiveBillboard.billboardId;
                    } else {
                        str3 = null;
                    }
                    String strLJJIIJZLJL = LJJIIJZLJL();
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                    c1732390vBN.getClass();
                    SeaLiveEffectRootData seaLiveEffectRootData = new SeaLiveEffectRootData(strLJJIJ, strLJJIJIIJI, (Map) null, strLJJIIJZLJL, "jsb", 36);
                    if (!z) {
                        C1732390vBN.LIZJ(seaLiveEffectRootData, strLJJIJ, 1, interfaceC1732650vBn, str3);
                        return;
                    } else if (str3 != null) {
                        C1732390vBN.LJFF(context, seaLiveEffectRootData, str3, 1, interfaceC1732650vBn, str);
                        return;
                    } else {
                        interfaceC1732650vBn.LIZ("billboard id is null");
                        return;
                    }
                }
                if (Intrinsics.LJFF(number, 2)) {
                    try {
                        if (list.size() > 1) {
                            interfaceC1732650vBn.LIZ("more than 1 banner");
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
                                        C1732390vBN c1732390vBN2 = C1732390vBN.LIZ;
                                        String strLJJIJIIJI2 = LJJIJIIJI();
                                        String strLJJIJ2 = LJJIJ();
                                        String strLJJIIJZLJL2 = LJJIIJZLJL();
                                        if (str == null || str.length() == 0) {
                                            str = null;
                                        }
                                        c1732390vBN2.getClass();
                                        C1732390vBN.LJIIJ(strLJJIJIIJI2, strLJJIJ2, true, str2, interfaceC1732650vBn, strLJJIIJZLJL2, "jsb", str);
                                        return;
                                    }
                                    interfaceC1732650vBn.LIZ("try display but no img");
                                    return;
                                }
                                C1732390vBN c1732390vBN3 = C1732390vBN.LIZ;
                                String strLJJIJIIJI3 = LJJIJIIJI();
                                String strLJJIJ3 = LJJIJ();
                                String strLJJIIJZLJL3 = LJJIIJZLJL();
                                if (str == null || str.length() == 0) {
                                    str = null;
                                }
                                c1732390vBN3.getClass();
                                C1732390vBN.LJIIJ(strLJJIJIIJI3, strLJJIJ3, false, "", interfaceC1732650vBn, strLJJIIJZLJL3, "jsb", str);
                                return;
                            }
                        }
                        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("banner exception: ");
                        sbLIZ.append(e3.getMessage());
                        interfaceC1732650vBn.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                } else {
                    interfaceC1732650vBn.LIZ("invalid container type " + number);
                    return;
                }
            }
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @Override // X.AbstractC1732680vBq, X.InterfaceC1733210vCh
    public final void w(int i, EnumC1732850vC7 enumC1732850vC7, Object obj, C1733200vCg c1733200vCg, Integer num, InterfaceC1732650vBn interfaceC1732650vBn) {
        this.LLIZ.LL.LIZLLL(i, enumC1732850vC7, obj, c1733200vCg, num, interfaceC1732650vBn);
    }
}
