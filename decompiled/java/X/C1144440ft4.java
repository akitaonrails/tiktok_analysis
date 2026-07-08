package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUsePowerupsGuideShowEvent;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0ft4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.useguide.MatchPowerupUseGuideController$messageListener$1$1", f = "MatchPowerupUseGuideController.kt", l = {134}, m = "invokeSuspend")
public final class C1144440ft4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1144390fsz LLILLJJLI;
    public final /* synthetic */ GuidePageResource LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144440ft4(C1144390fsz c1144390fsz, GuidePageResource guidePageResource, long j, String str, InterfaceC1364105Vn<? super C1144440ft4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1144390fsz;
        this.LLILLL = guidePageResource;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1144440ft4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<Text> list;
        Text text;
        int size;
        String strLIZIZ;
        ImageModel imageModel;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Long lValueOf;
        String string;
        List<ImageModel> list2;
        String str2;
        List<Text> list3;
        Text text2;
        List<Text> list4;
        Object objLIZJ = obj;
        C1C7U.LIZ("MatchPowerupUseGuideController@f2ac.messageListener$1$1");
        Object objLJFF = C099R.LJFF();
        int i6 = this.LL;
        String str3 = "";
        if (i6 != 0) {
            if (i6 == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            C1144390fsz c1144390fsz = this.LLILLJJLI;
            GuidePageResource guidePageResource = this.LLILLL;
            if (guidePageResource == null || (list = guidePageResource.texts) == null || (text = (Text) C13LP.LJJJLL(list)) == null || (str = text.key) == null) {
                str = "";
            }
            this.LL = 1;
            objLIZJ = c1144390fsz.LIZJ(str, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("MatchPowerupUseGuideController@f2ac.messageListener$1$1");
                return objLJFF;
            }
        }
        String str4 = (String) objLIZJ;
        GuidePageResource guidePageResource2 = this.LLILLL;
        if (guidePageResource2 != null && (list4 = guidePageResource2.texts) != null) {
            size = list4.size();
        } else {
            size = 0;
        }
        Long lValueOf2 = null;
        if (size >= 2) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            GuidePageResource guidePageResource3 = this.LLILLL;
            if (guidePageResource3 != null && (list3 = guidePageResource3.texts) != null && (text2 = (Text) ListProtector.get(list3, 1)) != null) {
                str2 = text2.key;
            } else {
                str2 = null;
            }
            c1124870fNVLIZJ.getClass();
            strLIZIZ = C1124870fNV.LIZIZ(str2);
        } else {
            strLIZIZ = null;
        }
        GuidePageResource guidePageResource4 = this.LLILLL;
        if (guidePageResource4 != null && (list2 = guidePageResource4.icons) != null) {
            imageModel = (ImageModel) C13LP.LJJJLL(list2);
        } else {
            imageModel = null;
        }
        C1144390fsz c1144390fsz2 = this.LLILLJJLI;
        C1144880ftm c1144880ftm = new C1144880ftm(str4, this.LLILZ, this.LLILZIL, imageModel, strLIZIZ, c1144390fsz2.LIZLLL, c1144390fsz2.LIZJ, null, null, 384);
        DataChannel dataChannel = c1144390fsz2.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(BattleUsePowerupsGuideShowEvent.class, c1144880ftm);
        }
        this.LLILLJJLI.getClass();
        List<BagItem> list5 = (List) DataChannelGlobal.LLILZ.gg0(C1148160fz4.class);
        if (list5 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list5) {
                BagItem bagItem = (BagItem) obj2;
                if (bagItem.available && bagItem.minExpireAt > C158B.LIZ()) {
                    arrayList.add(obj2);
                }
            }
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            for (BagItem bagItem2 : list5) {
                if (bagItem2.available) {
                    long j = bagItem2.count;
                    i = (int) (((long) i) + j);
                    int i7 = bagItem2.itemType;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    i5 = (int) (((long) i5) + j);
                                }
                            } else {
                                i4 = (int) (((long) i4) + j);
                            }
                        } else {
                            i3 = (int) (((long) i3) + j);
                        }
                    } else {
                        i2 = (int) (((long) i2) + j);
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
        linkedHashMap.put(C973660bRc.LJJII, "user");
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("pk_id", String.valueOf(lValueOf));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
        }
        linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) != null) {
            str3 = string;
        }
        linkedHashMap.put("user_id", str3);
        linkedHashMap.put("bubble_type", "direct_use");
        linkedHashMap.put("current_item_available_cnts", String.valueOf(i));
        linkedHashMap.put("current_boosting_gloves_available_cnts", String.valueOf(i2));
        linkedHashMap.put("current_magic_smokes_available_cnts", String.valueOf(i3));
        linkedHashMap.put("current_time_extending_available_cnts", String.valueOf(i4));
        linkedHashMap.put("current_hammer_available_cnts", String.valueOf(i5));
        C1144530ftD.LIZ(c973660bRc, linkedHashMap);
        String strLIZIZ2 = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ2 == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size2 = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ2 = C917350Zyn.LIZIZ(enumC919170a1jXB0, size2);
        }
        if (C970370bMJ.LJII()) {
            C973660bRc.LJZ(c973660bRc, "livesdk_match_item_use_bubble", linkedHashMap, strLIZIZ2);
        } else {
            C973660bRc.LJZI(c973660bRc, "livesdk_match_item_use_bubble", linkedHashMap, strLIZIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchPowerupUseGuideController@f2ac.messageListener$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
