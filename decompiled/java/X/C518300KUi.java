package X;

import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0KUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518300KUi extends C09AY implements Function2<UIAssem, C0KUR, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518300KUi(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(2);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KUR c0kur) {
        User owner;
        ImageModel avatarLarge;
        List urls;
        final String str;
        String str2;
        String str3;
        String str4;
        User owner2;
        ImageModel avatarThumb;
        InterfaceC517590KRp interfaceC517590KRpLIZJ;
        PcsServiceBioContentAssem pcsServiceBioContentAssem = this.LL;
        pcsServiceBioContentAssem.getClass();
        int i = C0KUS.LIZ[c0kur.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ViewGroup viewGroup = pcsServiceBioContentAssem.LLJJIJI;
                        if (viewGroup != null) {
                            C500260Jjc.LJIILIIL(viewGroup);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ViewGroup viewGroup2 = pcsServiceBioContentAssem.LLJJIJI;
                    if (viewGroup2 != null) {
                        C500260Jjc.LJIILIIL(viewGroup2);
                    }
                    pcsServiceBioContentAssem.ip().LLIZLLLIL = false;
                }
            } else {
                C1784870wY1 c1784870wY1 = pcsServiceBioContentAssem.ip().getState().LLILLJJLI;
                if (c1784870wY1 != null) {
                    pcsServiceBioContentAssem.sp(c1784870wY1);
                    C1822330xWR c1822330xWRHp = pcsServiceBioContentAssem.hp();
                    if (c1822330xWRHp != null) {
                        c1822330xWRHp.LLILZLL = c1784870wY1;
                    }
                }
                pcsServiceBioContentAssem.yp();
                String strYQ2 = PcsServiceBioVM.yQ2(pcsServiceBioContentAssem.ip().LLJI);
                if (!pcsServiceBioContentAssem.ip().LLIZLLLIL && !pcsServiceBioContentAssem.ip().LLJ) {
                    pcsServiceBioContentAssem.mp(strYQ2);
                    pcsServiceBioContentAssem.ip().LLJ = true;
                }
                PcsServiceBioVM pcsServiceBioVMIp = pcsServiceBioContentAssem.ip();
                if (!Intrinsics.LJFF(pcsServiceBioVMIp.LLJJI, "multi") || !Intrinsics.LJFF(strYQ2, "multi")) {
                    boolean zLJFF = Intrinsics.LJFF(pcsServiceBioVMIp.LLJJI, strYQ2);
                    boolean zLJFF2 = Intrinsics.LJFF(pcsServiceBioVMIp.LLJJIII, PcsServiceBioVM.xQ2(pcsServiceBioVMIp.LLJI));
                    if ((!zLJFF || !zLJFF2) && (interfaceC517590KRpLIZJ = C1826730xdX.LIZJ()) != null) {
                        interfaceC517590KRpLIZJ.LJII(new C0KBP(pcsServiceBioVMIp.LLIZ, C2097608Jq.LJIIJ(new Pair("curr_sku_type", strYQ2), new Pair("prev_sku_type", pcsServiceBioVMIp.LLJJI))));
                    }
                }
            }
        } else {
            final PcsServiceBioVM pcsServiceBioVMIp2 = pcsServiceBioContentAssem.ip();
            final boolean z = pcsServiceBioContentAssem.ip().LLIZLLLIL;
            if (!z) {
                pcsServiceBioVMIp2.setState(new C0KUV());
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (!OptAvatarLargeUseSetting.INSTANCE.enable() ? !(room == null || (owner = room.getOwner()) == null || (avatarLarge = owner.getAvatarLarge()) == null || (urls = avatarLarge.getUrls()) == null) : !(room == null || (owner2 = room.getOwner()) == null || (avatarThumb = owner2.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null)) {
                str = (String) ListProtector.get(urls, 0);
            } else {
                str = null;
            }
            C480460Ism.LIZ().getClass();
            PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
            C1822330xWR c1822330xWRZQ2 = pcsServiceBioVMIp2.zQ2();
            if (c1822330xWRZQ2 != null) {
                str2 = c1822330xWRZQ2.LLILLJJLI;
            } else {
                str2 = null;
            }
            String str5 = "";
            if (str2 == null) {
                str2 = "";
            }
            C1822330xWR c1822330xWRZQ22 = pcsServiceBioVMIp2.zQ2();
            if (c1822330xWRZQ22 == null || (str3 = c1822330xWRZQ22.LLILLL) == null) {
                str3 = "";
            }
            C11NZ<C470590Icr<SMBPreviewResponse.ResponseData>> servicePlusPreview = pcsApi.getServicePlusPreview(str2, str3);
            C1822330xWR c1822330xWRZQ23 = pcsServiceBioVMIp2.zQ2();
            if (c1822330xWRZQ23 != null && (str4 = c1822330xWRZQ23.LL) != null) {
                str5 = str4;
            }
            C1808280x9m.LJFF(servicePlusPreview, str5, "/sub/smb/preview/", null, 12).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0KUl
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str6;
                    String str7;
                    String str8;
                    C1C7U.LIZ("PcsServiceBioVM@5117.fetchPreview$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    C1822300xWO c1822300xWOLIZLLL = C1822290xWN.LIZLLL((SMBPreviewResponse.ResponseData) baseResponse.data);
                    C1784870wY1 c1784870wY12 = new C1784870wY1(C1822290xWN.LIZ((SMBPreviewResponse.ResponseData) baseResponse.data, str, pcsServiceBioVMIp2.zQ2()), c1822300xWOLIZLLL, (SMBPreviewResponse.ResponseData) baseResponse.data);
                    if (c1822300xWOLIZLLL.LJII == 0) {
                        PcsServiceBioVM.BQ2(pcsServiceBioVMIp2, c1784870wY12, new Throwable("activeSkuCount = 0"), 2);
                    } else {
                        C1822330xWR c1822330xWRZQ24 = pcsServiceBioVMIp2.zQ2();
                        String str9 = null;
                        if (c1822330xWRZQ24 != null) {
                            str6 = c1822330xWRZQ24.LLILLL;
                        } else {
                            str6 = null;
                        }
                        C1822330xWR c1822330xWRZQ25 = pcsServiceBioVMIp2.zQ2();
                        if (c1822330xWRZQ25 != null) {
                            str7 = c1822330xWRZQ25.LLILLJJLI;
                        } else {
                            str7 = null;
                        }
                        C518520KVe c518520KVe = C518520KVe.LIZIZ;
                        c518520KVe.getClass();
                        String strLIZ = AbstractC518510KVd.LIZ(str7, str6);
                        if (strLIZ != null) {
                            c518520KVe.LIZ.put(strLIZ, (TYPE) c1784870wY12);
                        }
                        PcsServiceBioVM pcsServiceBioVM = pcsServiceBioVMIp2;
                        T t = baseResponse.data;
                        C1822330xWR c1822330xWRZQ26 = pcsServiceBioVM.zQ2();
                        if (c1822330xWRZQ26 != null && c1822330xWRZQ26.LLILZIL && t != null) {
                            C1106750euH c1106750euH = C1106750euH.LIZ;
                            C1100630ekP c1100630ekP = new C1100630ekP(C0KA3.LIZ);
                            Pair[] pairArr = new Pair[2];
                            C1822330xWR c1822330xWRZQ27 = pcsServiceBioVM.zQ2();
                            if (c1822330xWRZQ27 != null) {
                                str8 = c1822330xWRZQ27.LLILLJJLI;
                            } else {
                                str8 = null;
                            }
                            pairArr[0] = new Pair("sec_anchor_id", str8);
                            C1822330xWR c1822330xWRZQ28 = pcsServiceBioVM.zQ2();
                            if (c1822330xWRZQ28 != null) {
                                str9 = c1822330xWRZQ28.LLILLL;
                            }
                            pairArr[1] = new Pair("room_id", str9);
                            c1106750euH.LJIILL(c1100630ekP, C2097608Jq.LJIIIIZZ(pairArr), t, "/webcast/sub/smb/preview/");
                        }
                        if (!z) {
                            pcsServiceBioVMIp2.setState(new C0KUT(c1784870wY12));
                        }
                    }
                    C1C7U.LIZIZ("PcsServiceBioVM@5117.fetchPreview$1");
                }
            }, new C09JN() { // from class: X.0KUj
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PcsServiceBioVM@5117.fetchPreview$2");
                    Throwable th = (Throwable) obj;
                    if (!z) {
                        PcsServiceBioVM.BQ2(pcsServiceBioVMIp2, null, th, 3);
                    }
                    C1C7U.LIZIZ("PcsServiceBioVM@5117.fetchPreview$2");
                }
            });
            String strYQ22 = PcsServiceBioVM.yQ2(pcsServiceBioContentAssem.ip().LLJI);
            if (pcsServiceBioContentAssem.ip().LLIZLLLIL) {
                pcsServiceBioContentAssem.yp();
                pcsServiceBioContentAssem.mp(strYQ22);
                pcsServiceBioContentAssem.ip().LLJ = true;
            } else {
                ViewGroup viewGroup3 = pcsServiceBioContentAssem.LLJJIJI;
                if (viewGroup3 != null) {
                    C500260Jjc.LJIILIIL(viewGroup3);
                }
            }
            PcsServiceBioVM pcsServiceBioVMIp3 = pcsServiceBioContentAssem.ip();
            pcsServiceBioContentAssem.ip();
            pcsServiceBioVMIp3.LLJJIII = PcsServiceBioVM.xQ2(pcsServiceBioContentAssem.ip().LLJI);
            pcsServiceBioContentAssem.ip().LLJJI = strYQ22;
        }
        return Unit.LIZ;
    }
}
