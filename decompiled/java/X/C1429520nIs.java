package X;

import Y.AComparatorS41S0000000_22;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MinisAnchorInfo;
import com.ss.android.ugc.aweme.creative.model.MinisGameModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishServicePluginAnchorParams;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429520nIs implements InterfaceC1413210msZ {
    public static boolean LIZJ(CreateAnchorInfo createAnchorInfo) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("info:");
        sbLIZ.append(createAnchorInfo.getType());
        C201955140j.LJII(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        return C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1430380nKG.DONATION_STICKER.getTYPE()), Integer.valueOf(EnumC1430380nKG.PROP.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_SOUND_SYNC.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_EDIT_EFFECT.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()), Integer.valueOf(EnumC1430380nKG.TTS_VOICE.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE()), Integer.valueOf(EnumC1430380nKG.AI_SELF_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.PHOTO_SPARK_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.GREEN_SCREEN_ANCHOR_TYPE.getTYPE()), Integer.valueOf(EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE.getTYPE()), Integer.valueOf(EnumC1430380nKG.AI_IMAGINE_ANCHOR_TYPE.getTYPE()), Integer.valueOf(EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.SOCIAL_AVATAR_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE.getTYPE()), Integer.valueOf(EnumC1430380nKG.AI_PORTRAIT_ANCHOR_TYPE.getTYPE()), Integer.valueOf(EnumC1430380nKG.CT_DUET_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.CT_AI_MAGIC_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.CT_FILTER_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.AI_PLAYGROUND_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.LYRIC_EFFECT_ANCHOR.getTYPE())}).contains(Integer.valueOf(createAnchorInfo.getType()));
    }

    @Override // X.InterfaceC1413210msZ
    public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        Map mapLJ;
        PublishExtensionModel publishExtensionModelFromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str = publishExtensionModelFromContext.anchorContent;
        if (str == null || (mapLJ = (HashMap) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str, (Class) new HashMap().getClass())) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (Intrinsics.LJFF(mapLJ.get("common_type"), Boolean.TRUE)) {
            int i = publishExtensionModelFromContext.anchorBusinessType;
            String str2 = publishExtensionModelFromContext.anchorTitle;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = publishExtensionModelFromContext.anchorContent;
            if (str4 != null) {
                str3 = str4;
            }
            ((ArrayList) list).add(new CreateAnchorInfo(i, str2, "", "", str3, "", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", publishExtensionModelFromContext.anchorSubtype, Boolean.TRUE, true, null, null, false, null));
        }
    }

    @Override // X.InterfaceC1413210msZ
    public final void LIZ(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        Map mapLJ;
        String strOptString;
        MinisGameModel minisGameModel;
        List<MinisAnchorInfo> list2;
        MinisAnchorInfo minisAnchorInfo;
        String str;
        int i;
        String str2 = "";
        PublishExtensionModel publishExtensionModelFromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        List<CreateAnchorInfo> list3 = publishExtensionModelFromContext.createAnchorInfos;
        if (list3 != null) {
            if (C294110Bft.LIZIZ()) {
                if (C294110Bft.LIZ() == 5 && list != null) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((CreateAnchorInfo) it2.next()).getType() == EnumC1430380nKG.POI.getTYPE()) {
                            list3.clear();
                            break;
                        }
                    }
                }
                if (list3.size() == 1) {
                    if (LIZJ((CreateAnchorInfo) ListProtector.get(list3, 0))) {
                        if (list != null) {
                            C19719612Di.LJJIIJ(list, new AwS601S0100000_22(list3, (List<CreateAnchorInfo>) 1), true);
                        } else {
                            return;
                        }
                    } else if (list == null) {
                        return;
                    } else {
                        ((ArrayList) list).clear();
                    }
                    if (((ArrayList) list).isEmpty()) {
                        ((ArrayList) list).addAll(list3);
                        return;
                    }
                    return;
                }
            } else {
                C19719612Di.LJJIIJ(list3, new AwS601S0100000_22(this, 2), true);
                if (list != null) {
                    ((ArrayList) list).addAll(list3);
                }
            }
        }
        PublishExtensionModel publishExtensionModelFromContext2 = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str3 = publishExtensionModelFromContext2.anchorContent;
        if (str3 == null || (mapLJ = (HashMap) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str3, (Class) new HashMap().getClass())) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (Intrinsics.LJFF(mapLJ.get("common_type"), Boolean.TRUE)) {
            try {
                String str4 = publishExtensionModelFromContext2.anchorContent;
                if (str4 == null) {
                    str4 = "";
                }
                strOptString = new JSONObject(str4).optString("url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strOptString = "";
            }
            if (list != null) {
                int i2 = publishExtensionModelFromContext2.anchorBusinessType;
                String str5 = publishExtensionModelFromContext2.anchorTitle;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = publishExtensionModelFromContext2.anchorContent;
                if (str6 != null) {
                    str2 = str6;
                }
                ((ArrayList) list).add(new CreateAnchorInfo(i2, str5, strOptString, "", str2, "", Long.valueOf(SystemClock.elapsedRealtime()), "", "", "", publishExtensionModelFromContext2.anchorSubtype, Boolean.TRUE, true, null, null, false, null));
            }
        }
        if (C294110Bft.LIZIZ()) {
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty() && arrayList.size() != 1) {
                    if (arrayList.size() > 1) {
                        C08XD.LJJ(list, new AComparatorS41S0000000_22(0));
                    }
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it3 = arrayList.iterator();
                        i = 0;
                        while (it3.hasNext()) {
                            if (((CreateAnchorInfo) ListProtector.get(list, 0)).getType() == ((CreateAnchorInfo) it3.next()).getType() && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    arrayList.removeAll(C13LP.LJLLI(C13LP.LJLIIL(C13LZ.LJIILJJIL(0, i - 1), C13LZ.LJIILJJIL(i, arrayList.size())), list));
                }
            }
        } else if (list != null) {
            Collections.reverse(list);
            if (((ArrayList) list).size() > 1) {
                C08XD.LJJ(list, new AComparatorS41S0000000_22(1));
            }
        }
        if (publishExtensionModelFromContext.servicePluginAnchorParams != null) {
            linkedHashMap.put("tt4d_anchor_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), publishExtensionModelFromContext.servicePluginAnchorParams));
            return;
        }
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (minisGameModel = ((VideoPublishEditModel) baseShortVideoContext).creativeModel.miniGameData) == null || (list2 = minisGameModel.anchorData) == null || (minisAnchorInfo = (MinisAnchorInfo) C13LP.LJJJLL(list2)) == null || (str = minisAnchorInfo.minisInfos) == null) {
            return;
        }
        linkedHashMap.put("tt4d_anchor_params", C08JS.LIZLLL(new PublishServicePluginAnchorParams(null, (HashMap) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str, (Class) new HashMap().getClass()))));
    }
}
