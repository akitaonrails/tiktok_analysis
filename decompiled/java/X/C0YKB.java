package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0YKB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YKB implements WireEnum {
    PULL_SCENE_UNKNOWN(0),
    PULL_SCENE_WS_REC(1),
    PULL_SCENE_INIT(2),
    PULL_SCENE_FOREGROUND(3),
    PULL_SCENE_CURSOR(4),
    PULL_SCENE_HAS_MORE(5),
    PULL_SCENE_TOKEN(6),
    PULL_SCENE_STRANGER(7),
    PULL_SCENE_POLLING(8),
    PULL_SCENE_MANUAL(9),
    PULL_SCENE_MISSING_STATUS_ENTITY(10);

    public static final ProtoAdapter<C0YKB> ADAPTER = new EnumAdapter<C0YKB>() { // from class: X.0YKL
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YKB.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YKB fromValue(int i) {
        switch (i) {
            case 0:
                return PULL_SCENE_UNKNOWN;
            case 1:
                return PULL_SCENE_WS_REC;
            case 2:
                return PULL_SCENE_INIT;
            case 3:
                return PULL_SCENE_FOREGROUND;
            case 4:
                return PULL_SCENE_CURSOR;
            case 5:
                return PULL_SCENE_HAS_MORE;
            case 6:
                return PULL_SCENE_TOKEN;
            case 7:
                return PULL_SCENE_STRANGER;
            case 8:
                return PULL_SCENE_POLLING;
            case BdTuring.TYPE_ECAF /* 9 */:
                return PULL_SCENE_MANUAL;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return PULL_SCENE_MISSING_STATUS_ENTITY;
            default:
                return null;
        }
    }

    public static C0YKB valueOf(String str) {
        return (C0YKB) C08FF.LIZ(C0YKB.class, str);
    }

    C0YKB(int i) {
        this.LL = i;
    }
}
