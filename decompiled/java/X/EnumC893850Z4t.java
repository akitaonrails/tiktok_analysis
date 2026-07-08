package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Z4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC893850Z4t implements WireEnum {
    NotUsed(0),
    Streak(2000),
    StreakPet(2001),
    B2CActionBarRefresh(2002),
    StickerCreationResult(2003),
    StreakGroupPet(2004),
    GroupAuditAppend(2005),
    GroupAuditAck(2006),
    StreakPetRefresh(2007),
    GroupBizExtUpdate(2008),
    StreakPetActiveRefresh(2009),
    AIBot(2010),
    StreakSocialInteraction(2011);

    public static final ProtoAdapter<EnumC893850Z4t> ADAPTER = new EnumAdapter<EnumC893850Z4t>() { // from class: X.0Z4y
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC893850Z4t.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC893850Z4t fromValue(int i) {
        if (i != 0) {
            switch (i) {
                case 2000:
                    return Streak;
                case 2001:
                    return StreakPet;
                case 2002:
                    return B2CActionBarRefresh;
                case 2003:
                    return StickerCreationResult;
                case 2004:
                    return StreakGroupPet;
                case 2005:
                    return GroupAuditAppend;
                case 2006:
                    return GroupAuditAck;
                case 2007:
                    return StreakPetRefresh;
                case 2008:
                    return GroupBizExtUpdate;
                case 2009:
                    return StreakPetActiveRefresh;
                case 2010:
                    return AIBot;
                case 2011:
                    return StreakSocialInteraction;
                default:
                    return null;
            }
        }
        return NotUsed;
    }

    public static EnumC893850Z4t valueOf(String str) {
        return (EnumC893850Z4t) C08FF.LIZ(EnumC893850Z4t.class, str);
    }

    EnumC893850Z4t(int i) {
        this.LL = i;
    }
}
