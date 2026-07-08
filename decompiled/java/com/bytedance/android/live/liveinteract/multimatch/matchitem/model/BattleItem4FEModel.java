package com.bytedance.android.live.liveinteract.multimatch.matchitem.model;

import X.C09CT;
import X.C963140bAe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class BattleItem4FEModel {

    @C09CT("gift_id")
    public long giftOnlyId;

    @C09CT("gift_name")
    public String giftOnlyName;

    @C09CT("is_specific_gift_match")
    public boolean isGiftOnlyMatch;

    @C09CT("item_infos")
    public List<ItemInfo4FE> itemList;

    @C09CT("item_type")
    public int itemType;

    @C09CT("time_diff")
    public long timeDiff = C963140bAe.LIZLLL;

    @C09CT("is_self_room")
    public boolean isSelfTeam = true;

    public final BattleItem4FEModel LIZ() {
        BattleItem4FEModel battleItem4FEModel = new BattleItem4FEModel();
        battleItem4FEModel.itemType = this.itemType;
        List<ItemInfo4FE> list = this.itemList;
        battleItem4FEModel.itemList = list != null ? new ArrayList(list) : null;
        battleItem4FEModel.timeDiff = this.timeDiff;
        battleItem4FEModel.giftOnlyName = this.giftOnlyName;
        battleItem4FEModel.giftOnlyId = this.giftOnlyId;
        battleItem4FEModel.isGiftOnlyMatch = this.isGiftOnlyMatch;
        battleItem4FEModel.isSelfTeam = this.isSelfTeam;
        return battleItem4FEModel;
    }
}
