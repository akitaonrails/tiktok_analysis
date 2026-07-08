package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1All, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2188991All implements WireEnum {
    VAR_LINK_MIC_DSL_SOURCE_ORIGIN(0),
    VAR_LINK_MIC_DSL_SOURCE_GECKO(1),
    VAR_LINK_MIC_DSL_SOURCE_GECKO_CDN(2),
    VAR_LINK_MIC_DSL_SOURCE_CACHE(3),
    VAR_LINK_MIC_DSL_SOURCE_LOCAL(4),
    VAR_LINK_MIC_DSL_SOURCE_SEI(5);

    public static final ProtoAdapter<EnumC2188991All> ADAPTER = new EnumAdapter<EnumC2188991All>() { // from class: X.1Alm
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2188991All.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2188991All fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return VAR_LINK_MIC_DSL_SOURCE_SEI;
                        }
                        return VAR_LINK_MIC_DSL_SOURCE_LOCAL;
                    }
                    return VAR_LINK_MIC_DSL_SOURCE_CACHE;
                }
                return VAR_LINK_MIC_DSL_SOURCE_GECKO_CDN;
            }
            return VAR_LINK_MIC_DSL_SOURCE_GECKO;
        }
        return VAR_LINK_MIC_DSL_SOURCE_ORIGIN;
    }

    public static EnumC2188991All valueOf(String str) {
        return (EnumC2188991All) C08FF.LIZ(EnumC2188991All.class, str);
    }

    EnumC2188991All(int i) {
        this.LL = i;
    }
}
