package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2228611CKl implements WireEnum {
    VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_NORMAL(0),
    VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_PK(1),
    VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_FM(2),
    VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_BIG_PARTY(3),
    VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_MULTI_LINKER(4);

    public static final ProtoAdapter<EnumC2228611CKl> ADAPTER = new EnumAdapter<EnumC2228611CKl>() { // from class: X.1CKm
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2228611CKl.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2228611CKl fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_MULTI_LINKER;
                    }
                    return VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_BIG_PARTY;
                }
                return VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_FM;
            }
            return VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_PK;
        }
        return VAR_LINK_MIC_PLAY_MODE_PLAY_MODE_NORMAL;
    }

    public static EnumC2228611CKl valueOf(String str) {
        return (EnumC2228611CKl) C08FF.LIZ(EnumC2228611CKl.class, str);
    }

    EnumC2228611CKl(int i) {
        this.LL = i;
    }
}
