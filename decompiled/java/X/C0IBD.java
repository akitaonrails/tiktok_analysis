package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0IBD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public enum C0IBD implements WireEnum {
    StickerCreateScene_Unknown(0),
    StickerCreateScene_ImagineStudio(1),
    StickerCreateScene_AvatarDUO(2);

    public static final ProtoAdapter<C0IBD> ADAPTER = new EnumAdapter<C0IBD>() { // from class: X.0IBE
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0IBD.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0IBD fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return StickerCreateScene_AvatarDUO;
            }
            return StickerCreateScene_ImagineStudio;
        }
        return StickerCreateScene_Unknown;
    }

    public static C0IBD valueOf(String str) {
        return (C0IBD) C08FF.LIZ(C0IBD.class, str);
    }

    C0IBD(int i) {
        this.LL = i;
    }
}
