package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.text.u;
import lnn.q;
import lth.o;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444930nhj implements InterfaceC1621110sHt {
    public final ShortVideoContext LIZ;
    public final q LIZIZ;
    public C1446680nkY LIZJ;
    public final List<String> LIZLLL = new ArrayList();
    public FaceStickerBean LJ;

    @Override // X.InterfaceC1621110sHt
    public final void init() {
        Map map;
        NormalTrackTimeStamp[] normalTrackTimeStampArr;
        if (this.LIZJ == null) {
            C1446680nkY c1446680nkY = new C1446680nkY();
            if (this.LIZ.LJJLL() || this.LIZ.LJJJJLL()) {
                c1446680nkY.LLILLL = false;
            }
            if (!C2093608Ic.LJ(this.LIZ.extraSession.mainBusinessData)) {
                ShortVideoContext shortVideoContext = this.LIZ;
                String str = shortVideoContext.extraSession.mainBusinessData;
                int i = (int) shortVideoContext.cameraComponentModel.mTotalRecordingTime;
                if (c1446680nkY.LLILLL) {
                    c1446680nkY.LLILZLL = i;
                    List<InteractStickerStruct> listLJIIIIZZ = C1429860nJQ.LJIIIIZZ(str, EnumC1428480nHC.TRACK_PAGE_RECORD);
                    if (!C086I.LIZIZ(listLJIIIIZZ)) {
                        for (InteractStickerStruct interactStickerStruct : listLJIIIIZZ) {
                            if (interactStickerStruct.getType() == 2 && !C2093608Ic.LJ(interactStickerStruct.getAttr()) && !C2093608Ic.LJ(interactStickerStruct.getTrackList()) && (map = (Map) GsonProtectorUtils.fromJson(o.LJIJ.getRetrofitFactoryGson(), interactStickerStruct.getAttr(), Map.class)) != null && map.containsKey("interaction_extra")) {
                                try {
                                    RecordInteractExtra recordInteractExtra = (RecordInteractExtra) o.LJIJ.getRetrofitFactoryGson().LJII(C786410Ut5.J3(new JSONObject((Map) map.get("interaction_extra"))), RecordInteractExtra.class);
                                    if (recordInteractExtra != null && !C2093608Ic.LJ(recordInteractExtra.getStickerId()) && (normalTrackTimeStampArr = (NormalTrackTimeStamp[]) GsonProtectorUtils.fromJson(o.LJIJ.getRetrofitFactoryGson(), interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class)) != null && normalTrackTimeStampArr.length != 0) {
                                        c1446680nkY.LLILZ.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        c1446680nkY.LLILZIL.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                }
            }
            this.LIZJ = c1446680nkY;
        }
    }

    @Override // X.InterfaceC1621110sHt
    public final List<String> LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1621110sHt
    public final void LJII(List<String> list) {
        if (list != null && !list.isEmpty()) {
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LIZLLL).addAll(list);
        }
    }

    @Override // X.InterfaceC1621110sHt
    public final void LJIIIIZZ(ShortVideoContext shortVideoContext) {
        C1429890nJT c1429890nJT;
        C1446680nkY c1446680nkY = this.LIZJ;
        if (c1446680nkY != null && c1446680nkY.LLILLL) {
            int i = (int) shortVideoContext.cameraComponentModel.mTotalRecordingTime;
            if (i - c1446680nkY.LLILZLL < -10) {
                c1446680nkY.LIZIZ(i);
                c1446680nkY.LLILZLL = i;
            }
            LinkedList linkedList = new LinkedList();
            int i2 = 0;
            for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : c1446680nkY.LLILZ.entrySet()) {
                ExtraParams extraParams = c1446680nkY.LLILZIL.get(entry.getKey());
                List<NormalTrackTimeStamp> value = entry.getValue();
                if (!C086I.LIZIZ(value) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, entry.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i2);
                    interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), value));
                    linkedList.add(interactStickerStruct);
                    i2++;
                }
            }
            String str = shortVideoContext.extraSession.mainBusinessData;
            EnumC1428480nHC enumC1428480nHC = EnumC1428480nHC.TRACK_PAGE_RECORD;
            boolean z = c1446680nkY.LLIZ;
            if (C2093608Ic.LJ(str)) {
                c1429890nJT = new C1429890nJT();
            } else {
                try {
                    c1429890nJT = (C1429890nJT) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJII(str, C1429890nJT.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1429890nJT = new C1429890nJT();
                }
            }
            InteractStickerTracksContext interactStickerTracksContext = c1429890nJT.mInteractStickerContext;
            if (interactStickerTracksContext == null) {
                interactStickerTracksContext = new InteractStickerTracksContext();
            }
            interactStickerTracksContext.upDateStickerStructs(linkedList, enumC1428480nHC);
            c1429890nJT.setInteractStickerContext(interactStickerTracksContext);
            c1429890nJT.interactStickerCheckEffectSdk = z;
            shortVideoContext.extraSession.mainBusinessData = GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), c1429890nJT);
        }
    }

    @Override // X.InterfaceC1621110sHt
    public final void update(int i) {
        String str;
        C1446680nkY c1446680nkY = this.LIZJ;
        if (c1446680nkY != null) {
            FaceStickerBean faceStickerBeanJr = this.LJ;
            if (faceStickerBeanJr == null) {
                faceStickerBeanJr = this.LIZIZ.jr();
            }
            if (this.LJ == null) {
                this.LJ = faceStickerBeanJr;
            }
            if (faceStickerBeanJr != null && c1446680nkY.LLILLL) {
                if (i - c1446680nkY.LLILZLL < -10) {
                    c1446680nkY.LIZIZ(i);
                    c1446680nkY.LLILZLL = i;
                    return;
                }
                if (C2093608Ic.LJ(c1446680nkY.LL)) {
                    return;
                }
                int i2 = c1446680nkY.LLILZLL;
                if (i2 != -1 && i - i2 <= 300) {
                    return;
                }
                c1446680nkY.LLILZLL = i;
                ExtraParams extraParams = (ExtraParams) GsonProtectorUtils.fromJson(o.LJIJ.getRetrofitFactoryGson(), faceStickerBeanJr.getExtra(), ExtraParams.class);
                if (extraParams == null || !extraParams.isUrlInteractionStickerValid()) {
                    return;
                }
                if ((extraParams.getInteractionIcon() == null || !u.LJJIIJZLJL(extraParams.getInteractionIcon(), "http", false)) && (str = (String) C13LP.LJJJLL(this.LIZLLL)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(extraParams.getInteractionIcon());
                    extraParams.setInteractionIcon(C2188811AlT.LIZIZ(sbLIZ));
                }
                c1446680nkY.LLILLJJLI = String.valueOf(faceStickerBeanJr.getStickerId());
                c1446680nkY.LIZ(i, extraParams);
            }
        }
    }

    public C1444930nhj(ShortVideoContext shortVideoContext, l0 l0Var) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = l0Var;
    }
}
