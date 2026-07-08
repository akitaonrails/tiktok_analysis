package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19363610pG implements WireEnum {
    STICKER_TYPE_UNKNOWN(0),
    STICKER_TYPE_SOCIAL_AVATAR(1),
    STICKER_TYPE_AVATAR_DUO(2),
    STICKER_TYPE_AI_SELF(3),
    STICKER_TYPE_IMAGINE_STUDIO_SA(4),
    STICKER_TYPE_IMAGINE_STUDIO_AI_SELF(5),
    STICKER_TYPE_ANIMATED_VARIANT_ADDED(6);

    public static final ProtoAdapter<EnumC19363610pG> ADAPTER = new EnumAdapter<EnumC19363610pG>() { // from class: X.10pH
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19363610pG.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19363610pG fromValue(int i) {
        switch (i) {
            case 0:
                return STICKER_TYPE_UNKNOWN;
            case 1:
                return STICKER_TYPE_SOCIAL_AVATAR;
            case 2:
                return STICKER_TYPE_AVATAR_DUO;
            case 3:
                return STICKER_TYPE_AI_SELF;
            case 4:
                return STICKER_TYPE_IMAGINE_STUDIO_SA;
            case 5:
                return STICKER_TYPE_IMAGINE_STUDIO_AI_SELF;
            case 6:
                return STICKER_TYPE_ANIMATED_VARIANT_ADDED;
            default:
                return null;
        }
    }

    public static EnumC19363610pG valueOf(String str) {
        return (EnumC19363610pG) C08FF.LIZ(EnumC19363610pG.class, str);
    }

    EnumC19363610pG(int i) {
        this.LL = i;
    }
}
