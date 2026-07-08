package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.AssetExtra;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectAddTagSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.sticker.StickerLiveLayoutUtils;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136390fg5 {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LJI() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
            jSONObject.put("os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                jSONObject.put("language", C2273311DyT.LIZ(iHostAppContext.currentLocale()));
                jSONObject.put("app_version", iHostAppContext.getVersionName());
            }
            jSONObject.put("screen_width", C14KS.LJFF());
            jSONObject.put("screen_height", C14KS.LIZLLL());
            jSONObject.put("engine_type", 0);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("gift_sticker", "getSystemJson Exception");
            return jSONObject;
        }
    }

    public static final LiveEffect.StickerSDKExtra LIZ(AssetsModel assetsModel) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assestModel is null: ");
        boolean z2 = true;
        if (assetsModel == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ));
        if (assetsModel != null) {
            FaceRecognitionMeta faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("face is null: ");
            if (faceRecognitionMeta != null) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ2));
            if (faceRecognitionMeta != null) {
                String str = faceRecognitionMeta.sdkExtra;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("sdkExra is null: ");
                sbLIZ3.append(str);
                C20441214yg.LIZIZ("EffectMonitor#gift", C2188811AlT.LIZIZ(sbLIZ3));
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return (LiveEffect.StickerSDKExtra) C19748512Ol.LIZIZ.LJII(str, LiveEffect.StickerSDKExtra.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(Context context) {
        C0VSJ c0vsjLJFF;
        if (context == null || (c0vsjLJFF = C2355009Kq.LJFF(context)) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsjLJFF.getAbsolutePath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("live");
        sbLIZ.append(str);
        sbLIZ.append("sticker");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            return null;
        }
        return strLIZIZ;
    }

    public static boolean LIZIZ(C1136560fgM c1136560fgM, C1136560fgM c1136560fgM2) {
        List listLIZLLL;
        List<Long> listLIZLLL2;
        if (c1136560fgM == null || (listLIZLLL = c1136560fgM.LIZLLL()) == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        if (c1136560fgM2 == null || (listLIZLLL2 = c1136560fgM2.LIZLLL()) == null) {
            listLIZLLL2 = C13BV.INSTANCE;
        }
        if (listLIZLLL.size() != listLIZLLL2.size()) {
            return false;
        }
        if (listLIZLLL.isEmpty()) {
            return true;
        }
        return listLIZLLL.containsAll(listLIZLLL2);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1136560fgM LJ(X.InterfaceC1136020ffU r12, X.InterfaceC1139780flY r13) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136390fg5.LJ(X.0ffU, X.0flY):X.0fgM");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1136560fgM LJFF(com.bytedance.android.livesdk.model.message.GiftMessage r12, X.InterfaceC1139780flY r13) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136390fg5.LJFF(com.bytedance.android.livesdk.model.message.GiftMessage, X.0flY):X.0fgM");
    }

    public static final LiveEffect LJII(C1136560fgM c1136560fgM, DataChannel dataChannel) {
        boolean z;
        long id;
        boolean z2;
        String str = "";
        LiveEffect liveEffectCreateEffectByType = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createEffectByType(EnumC767550U8z.GIFT);
        if (c1136560fgM != null) {
            liveEffectCreateEffectByType.LLIIZ(c1136560fgM.LJIIL);
            liveEffectCreateEffectByType.setFilePath(c1136560fgM.LJII);
            liveEffectCreateEffectByType.LJJII(String.valueOf(c1136560fgM.LJFF));
            if (LiveGiftEffectAddTagSetting.INSTANCE.enable()) {
                liveEffectCreateEffectByType.LLIIZ(c1136560fgM.LJFF);
                liveEffectCreateEffectByType.LLJJJIL(c1136560fgM.LJIIL);
            }
            liveEffectCreateEffectByType.LLIIIJ(c1136560fgM.LJ);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("system", LJI());
                long j = c1136560fgM.LJIIL;
                long j2 = c1136560fgM.LJFF;
                String str2 = c1136560fgM.LJJJIL;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("business", LIZJ(j, j2, str2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("gift_sticker", "buildMultilingualJsonString Exception");
            }
            liveEffectCreateEffectByType.LLIFFJFJJ(C786410Ut5.J3(jSONObject));
            List<C916720Zxm> listDo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Do2();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C916720Zxm> it2 = listDo2.iterator();
            while (true) {
                z = false;
                if (!it2.hasNext()) {
                    break;
                }
                C916720Zxm next = it2.next();
                if (next.LIZ == UserService.getInstance().user().getCurrentUserId()) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            liveEffectCreateEffectByType.LJLIIIL(C1516000pYM.LIZJ(new StickerLiveLayoutUtils.LiveLayoutBoxInfo(StickerLiveLayoutUtils.LIZ((List) pair.getFirst()), StickerLiveLayoutUtils.LIZ((List) pair.getSecond()))));
            liveEffectCreateEffectByType.LJIJJ(c1136560fgM.LJJII);
            liveEffectCreateEffectByType.LLJJJJ(c1136560fgM.LJI);
            liveEffectCreateEffectByType.setDuration(c1136560fgM.LJJ);
            C1136380fg4.LIZ.getClass();
            liveEffectCreateEffectByType.LLJJJJLIIL(c1136560fgM.LJJIIJ);
            liveEffectCreateEffectByType.LJIIJ(c1136560fgM.LJJIIZ);
            liveEffectCreateEffectByType.LJJIIJZLJL(c1136560fgM.LJJIJIIJI);
            liveEffectCreateEffectByType.LLJJIJIIJIL(c1136560fgM.LJJIJIIJIL);
            User user = c1136560fgM.LJIIJJI;
            long ownerUserId = 0;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            liveEffectCreateEffectByType.LLIZ(id);
            if (c1136560fgM.LJJIIJZLJL == 1 && !c1136560fgM.LJJIIJ) {
                z2 = true;
            } else {
                z2 = false;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1136380fg4.LJ;
            if (concurrentHashMap.containsKey(Long.valueOf(c1136560fgM.LJJIIZ))) {
                C1133660fbg c1133660fbg = (C1133660fbg) concurrentHashMap.get(Long.valueOf(c1136560fgM.LJJIIZ));
                if (c1133660fbg != null) {
                    if (!c1133660fbg.LIZIZ && z2) {
                        z = true;
                    }
                    liveEffectCreateEffectByType.LLJJIII(z);
                    liveEffectCreateEffectByType.LJII(c1133660fbg.LIZ);
                    c1133660fbg.LIZIZ = true;
                }
            } else {
                liveEffectCreateEffectByType.LLJJIII(z2);
            }
            if (c1136560fgM.LIZIZ() > 0) {
                liveEffectCreateEffectByType.LLILLIZIL(c1136560fgM.LIZIZ());
            } else if (dataChannel != null) {
                Room room = (Room) dataChannel.gg0(RoomChannel.class);
                if (room != null) {
                    ownerUserId = room.getOwnerUserId();
                }
                liveEffectCreateEffectByType.LLILLIZIL(ownerUserId);
            }
            liveEffectCreateEffectByType.LLLIIIL(UserService.getInstance().user().getCurrentUserId());
            String str3 = c1136560fgM.LJJIII;
            if (str3 == null) {
                str3 = "";
            }
            liveEffectCreateEffectByType.LLLIL(str3);
            liveEffectCreateEffectByType.LLLIIL(c1136560fgM.LJJIJL);
            liveEffectCreateEffectByType.LLLILZ(c1136560fgM.LJJIZ);
            liveEffectCreateEffectByType.LLLILZLLLI(c1136560fgM.LJJJI);
            String str4 = c1136560fgM.LJJJIL;
            if (str4 != null) {
                str = str4;
            }
            liveEffectCreateEffectByType.LJJLJ(str);
            liveEffectCreateEffectByType.LLLILZJ(C0KVU.LIZ(c1136560fgM.LJIIJJI));
            liveEffectCreateEffectByType.LLLIILIL(c1136560fgM.LJJJJ);
            liveEffectCreateEffectByType.LLLIIIIL(c1136560fgM.LJJJJI);
            liveEffectCreateEffectByType.LLII(c1136560fgM.LJJI);
            c1136560fgM.LJJIJIL = liveEffectCreateEffectByType;
        }
        C470360IcU.LIZ(new AwS561S0100000_17(c1136560fgM, 247));
        return liveEffectCreateEffectByType;
    }

    public static JSONObject LIZJ(long j, long j2, String str) {
        String str2;
        AssetExtra assetExtra;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(j2);
            if (assetsModelLIZLLL == null || (assetExtra = assetsModelLIZLLL.assetExtra) == null || (str2 = assetExtra.effectStarlingKey) == null) {
                str2 = "";
            }
            jSONObject2.put("text", str2);
            jSONObject2.put("gift_id", j);
            jSONObject2.put("effect_id", j2);
            Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
            if (giftFindGiftById != null) {
                jSONObject2.put("gift_type", giftFindGiftById.type);
            }
            jSONObject2.put("sticker_type", C769930UId.LIZ(str));
            jSONObject.put("extra_data", jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("gift_sticker", "getBusinessJson Exception");
            return jSONObject;
        }
    }
}
