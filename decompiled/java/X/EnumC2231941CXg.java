package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231941CXg implements WireEnum {
    VAR_LINK_MIC_SDK_SCENE_UNION(0),
    VAR_LINK_MIC_SDK_SCENE_CO_HOST(1),
    VAR_LINK_MIC_SDK_SCENE_MULTI_GUEST(2),
    VAR_LINK_MIC_SDK_SCENE_GAME_LINK(3);

    public static final ProtoAdapter<EnumC2231941CXg> ADAPTER = new EnumAdapter<EnumC2231941CXg>() { // from class: X.1CYf
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231941CXg.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231941CXg fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINK_MIC_SDK_SCENE_GAME_LINK;
                }
                return VAR_LINK_MIC_SDK_SCENE_MULTI_GUEST;
            }
            return VAR_LINK_MIC_SDK_SCENE_CO_HOST;
        }
        return VAR_LINK_MIC_SDK_SCENE_UNION;
    }

    public static EnumC2231941CXg valueOf(String str) {
        return (EnumC2231941CXg) C08FF.LIZ(EnumC2231941CXg.class, str);
    }

    EnumC2231941CXg(int i) {
        this.LL = i;
    }
}
