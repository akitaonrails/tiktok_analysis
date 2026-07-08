package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenTagFrequencySetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenSubviewSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0f4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1113380f4y extends AbstractC1113400f50 {
    public int LJIIJ;
    public final C2091508Hh<Long, PublicAreaMessageCommon.CreatorSuccessInfo.Topic> LJIIIIZZ = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    public final Set<Integer> LJIIIZ = Collections.singleton(204);
    public final boolean LJIIJJI = LivePublicScreenTagFrequencySetting.INSTANCE.getValue();

    @Override // X.InterfaceC1112730f3v
    public final boolean LIZ(AbstractC1110800f0o<?> abstractC1110800f0o) {
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topicLIZIZ = LIZIZ(abstractC1110800f0o);
        if (abstractC1110800f0o.LLJJL() && topicLIZIZ == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1113400f50
    public PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZIZ(AbstractC1110800f0o<?> abstractC1110800f0o) {
        boolean z;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> list;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo2;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo3;
        if (LivePublicScreenSubviewSetting.INSTANCE.onlyShowTag() && !abstractC1110800f0o.LLJJL()) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC1110800f0o.LLIIIILZ().LJJ) {
            z = false;
        }
        if (this.LJIIIIZZ.containsKey(Long.valueOf(abstractC1110800f0o.getMessageId()))) {
            return this.LJIIIIZZ.get(Long.valueOf(abstractC1110800f0o.getMessageId()));
        }
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = false;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo.topicList) != null) {
            if (!this.LIZ.containsKey(Long.valueOf(abstractC1110800f0o.LLIIJI()))) {
                this.LIZ.put(Long.valueOf(abstractC1110800f0o.LLIIJI()), new ArrayList<>());
            }
            ArrayList<Integer> arrayList = this.LIZ.get(Long.valueOf(abstractC1110800f0o.LLIIJI()));
            if (arrayList == null) {
                return null;
            }
            for (PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic : list) {
                if (topic.disableCountFrequencyControl) {
                    boolean z2 = abstractC1110800f0o.LLIIIILZ().LJJ;
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII2 = abstractC1110800f0o.LLIIII();
                    if (publicAreaMessageCommonLLIIII2 != null) {
                        creatorSuccessInfo3 = publicAreaMessageCommonLLIIII2.creatorSuccessInfo;
                    } else {
                        creatorSuccessInfo3 = null;
                    }
                    if (LIZLLL(topic, z2, creatorSuccessInfo3) && !arrayList.contains(Integer.valueOf(topic.tagType))) {
                        if (z) {
                            if (topic.topicText != null) {
                                arrayList.add(Integer.valueOf(topic.tagType));
                                this.LJIIIIZZ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), topic);
                                abstractC1110800f0o.LJIIIZ.LIZ = true;
                                this.LJIIJ = 1;
                                return topic;
                            }
                        } else if (topic.topicTips != null) {
                            arrayList.add(Integer.valueOf(topic.tagType));
                            this.LJIIIIZZ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), topic);
                            abstractC1110800f0o.LJIIIZ.LIZ = true;
                            this.LJIIJ = 1;
                            return topic;
                        }
                    }
                }
            }
            if (this.LJIIJ != 0) {
                this.LJIIIIZZ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), null);
                int i = this.LJIIJ + 1;
                this.LJIIJ = i;
                if (i == 8) {
                    this.LJIIJ = 0;
                }
                this.LIZIZ = true;
                return null;
            }
            for (PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic2 : list) {
                if (!topic2.disableCountFrequencyControl) {
                    boolean z3 = abstractC1110800f0o.LLIIIILZ().LJJ;
                    PublicAreaMessageCommon publicAreaMessageCommonLLIIII3 = abstractC1110800f0o.LLIIII();
                    if (publicAreaMessageCommonLLIIII3 != null) {
                        creatorSuccessInfo2 = publicAreaMessageCommonLLIIII3.creatorSuccessInfo;
                    } else {
                        creatorSuccessInfo2 = null;
                    }
                    if (LIZLLL(topic2, z3, creatorSuccessInfo2) && !arrayList.contains(Integer.valueOf(topic2.tagType))) {
                        if (z) {
                            if (topic2.topicText != null) {
                                if (this.LJIIJJI && !this.LJIIIZ.contains(Integer.valueOf(topic2.tagType))) {
                                    arrayList.add(Integer.valueOf(topic2.tagType));
                                    this.LJIIJ++;
                                }
                                this.LJIIIIZZ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), topic2);
                                abstractC1110800f0o.LJIIIZ.LIZ = true;
                                return topic2;
                            }
                        } else if (topic2.topicTips != null) {
                            if (this.LJIIJJI) {
                                arrayList.add(Integer.valueOf(topic2.tagType));
                                this.LJIIJ++;
                            }
                            this.LJIIIIZZ.put(Long.valueOf(abstractC1110800f0o.getMessageId()), topic2);
                            abstractC1110800f0o.LJIIIZ.LIZ = true;
                            return topic2;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC1113400f50
    public void LIZJ(AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        topic.LIZ = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long jLLJJIII = abstractC1110790f0n.LLJJIII();
        long j = abstractC1110790f0n.LIZ;
        C1113480f58 c1113480f58 = new C1113480f58();
        c1113480f58.LIZ = topic.tagType;
        iPublicScreenService.ke0(jLLJJIII, j, c1113480f58);
    }

    public static boolean LIZLLL(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, boolean z, PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo) {
        if (creatorSuccessInfo == null) {
            return false;
        }
        if (z) {
            int i = topic.displayLocation;
            if (i != 0 && i != 2) {
                return false;
            }
        } else {
            int i2 = topic.displayLocation;
            if (i2 != 1 && i2 != 2) {
                return false;
            }
        }
        return true;
    }
}
