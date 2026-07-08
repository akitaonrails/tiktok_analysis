package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Ab3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2182351Ab3 implements WireEnum {
    VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM(0),
    VAR_LINK_MIC_LAYOUT_SCENE_FEED(1),
    VAR_LINK_MIC_LAYOUT_SCENE_SEARCH(2),
    VAR_LINK_MIC_LAYOUT_SCENE_PAD_PORTRAIT(3),
    VAR_LINK_MIC_LAYOUT_SCENE_PAD_LANDSCAPE(4);

    public static final ProtoAdapter<EnumC2182351Ab3> ADAPTER = new EnumAdapter<EnumC2182351Ab3>() { // from class: X.1Ab4
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2182351Ab3.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2182351Ab3 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_LAYOUT_SCENE_PAD_LANDSCAPE;
                    }
                    return VAR_LINK_MIC_LAYOUT_SCENE_PAD_PORTRAIT;
                }
                return VAR_LINK_MIC_LAYOUT_SCENE_SEARCH;
            }
            return VAR_LINK_MIC_LAYOUT_SCENE_FEED;
        }
        return VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM;
    }

    public static EnumC2182351Ab3 valueOf(String str) {
        return (EnumC2182351Ab3) C08FF.LIZ(EnumC2182351Ab3.class, str);
    }

    EnumC2182351Ab3(int i) {
        this.LL = i;
    }
}
