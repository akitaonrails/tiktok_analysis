package com.bytedance.android.live.effect.model.composer;

import X.C09CT;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveComposerNode {
    public String LIZ;
    public String LIZIZ;

    @C09CT("coexistGroup")
    public final List<Integer> coexistGroup;

    @C09CT("duration")
    public long duration;

    @C09CT("effectId")
    public long effectId;

    @C09CT("effectPanelKey")
    public String effectPanelKey;

    @C09CT("extra")
    public String extra;

    @C09CT("flag")
    public int flag;

    @C09CT("effect_extra")
    public String giftEffectExtra;

    @C09CT("giftId")
    public long giftId;

    @C09CT("inMic")
    public boolean inMic;

    @C09CT("inMusic")
    public boolean inMusic;

    @C09CT("isLocalRestore")
    public boolean isLocalRestore;

    @C09CT("isShowing")
    public boolean isShowing;

    @C09CT("isWithoutFace")
    public boolean isWithoutFace;

    @C09CT("modified")
    public int modified;

    @C09CT("msgId")
    public long msgId;

    @C09CT("panel")
    public final String panel;

    @C09CT("path")
    public String path;

    @C09CT("prefabs")
    public JSONArray prefabs;

    @C09CT("resourceId")
    public final String resourceId;

    @C09CT("tagList")
    public final List<LiveComposerTagNode> tagList;

    @C09CT("updateTime")
    public long updateTime;

    @C09CT("use")
    public boolean use;

    @C09CT("useOutput")
    public boolean useOutput;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveComposerNode(panel='");
        sbLIZ.append(this.panel);
        sbLIZ.append("', effectId='");
        sbLIZ.append(this.resourceId);
        sbLIZ.append("', path='");
        sbLIZ.append(this.path);
        sbLIZ.append("', isWithoutFace=");
        sbLIZ.append(this.isWithoutFace);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.updateTime);
        sbLIZ.append(", coexistGroup=");
        sbLIZ.append(this.coexistGroup);
        sbLIZ.append(", tagList=");
        sbLIZ.append(this.tagList);
        sbLIZ.append(", use=");
        sbLIZ.append(this.use);
        sbLIZ.append(", modified=");
        sbLIZ.append(this.modified);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveComposerNode(LiveComposerNode liveComposerNode) {
        ArrayList arrayList = new ArrayList();
        this.coexistGroup = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.tagList = arrayList2;
        this.effectPanelKey = "";
        this.effectId = -1L;
        this.extra = "";
        this.modified = -1;
        this.giftEffectExtra = "";
        this.LIZ = "";
        this.LIZIZ = "";
        this.panel = liveComposerNode.panel;
        this.resourceId = liveComposerNode.resourceId;
        this.path = liveComposerNode.path;
        this.isWithoutFace = liveComposerNode.isWithoutFace;
        this.updateTime = liveComposerNode.updateTime;
        this.use = liveComposerNode.use;
        arrayList.addAll(liveComposerNode.coexistGroup);
        arrayList2.addAll(liveComposerNode.tagList);
        this.flag = liveComposerNode.flag;
        this.effectId = liveComposerNode.effectId;
        this.giftId = liveComposerNode.giftId;
        this.msgId = liveComposerNode.msgId;
        this.modified = liveComposerNode.modified;
        this.LIZIZ = liveComposerNode.LIZIZ;
        this.LIZ = liveComposerNode.LIZ;
    }

    public final void LIZ(List<Integer> list) {
        this.flag = 0;
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            this.coexistGroup.add(Integer.valueOf(iIntValue));
            this.flag = (1 << (iIntValue - 1)) | this.flag;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(list);
        sbLIZ.append(", flag: ");
        sbLIZ.append(Integer.toBinaryString(this.flag));
        C20441214yg.LIZIZ("EffectDebug#Coexist", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(LiveEffect liveEffect) {
        boolean zBooleanValue;
        boolean zContains;
        ArrayList<String> sources;
        ArrayList<String> sources2;
        Boolean useOutput;
        this.effectId = liveEffect.getEffectId();
        this.giftId = liveEffect.getGiftId();
        this.msgId = liveEffect.getMsgId();
        this.giftEffectExtra = liveEffect.LLLFFI();
        String extra = liveEffect.getExtra();
        if (extra == null) {
            extra = "";
        }
        this.extra = extra;
        this.duration = liveEffect.getDuration();
        this.prefabs = liveEffect.LLLFZ();
        this.LIZ = liveEffect.LIZ;
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
        if (stickerSDKExtraLJLJLLL != null) {
            LiveEffect.AudioGraphBean audioGraphBean = stickerSDKExtraLJLJLLL.audioGraph;
            boolean zContains2 = false;
            if (audioGraphBean != null && (useOutput = audioGraphBean.getUseOutput()) != null) {
                zBooleanValue = useOutput.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.useOutput = zBooleanValue;
            LiveEffect.AudioGraphBean audioGraphBean2 = stickerSDKExtraLJLJLLL.audioGraph;
            if (audioGraphBean2 != null && (sources2 = audioGraphBean2.getSources()) != null) {
                zContains = sources2.contains("mic");
            } else {
                zContains = false;
            }
            this.inMic = zContains;
            LiveEffect.AudioGraphBean audioGraphBean3 = stickerSDKExtraLJLJLLL.audioGraph;
            if (audioGraphBean3 != null && (sources = audioGraphBean3.getSources()) != null) {
                zContains2 = sources.contains("music");
            }
            this.inMusic = zContains2;
        }
    }

    public LiveComposerNode(String str, String str2, String str3, boolean z, long j) {
        this.coexistGroup = new ArrayList();
        this.tagList = new ArrayList();
        this.effectPanelKey = "";
        this.effectId = -1L;
        this.extra = "";
        this.modified = -1;
        this.giftEffectExtra = "";
        this.LIZ = "";
        this.LIZIZ = "";
        this.panel = str;
        this.resourceId = str2;
        this.path = str3;
        this.isWithoutFace = z;
        this.updateTime = j;
    }
}
