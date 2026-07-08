package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Crs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2243741Crs implements WireEnum {
    ImagineStudioElementType_Unknown(0),
    ImagineStudioElementType_Text(1),
    ImagineStudioElementType_Emoji(2),
    ImagineStudioElementType_Image(3),
    ImagineStudioElementType_Meme(4),
    ImagineStudioElementType_Sticker(5);

    public static final ProtoAdapter<EnumC2243741Crs> ADAPTER = new EnumAdapter<EnumC2243741Crs>() { // from class: X.1Cs2
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2243741Crs.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2243741Crs fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return ImagineStudioElementType_Sticker;
                        }
                        return ImagineStudioElementType_Meme;
                    }
                    return ImagineStudioElementType_Image;
                }
                return ImagineStudioElementType_Emoji;
            }
            return ImagineStudioElementType_Text;
        }
        return ImagineStudioElementType_Unknown;
    }

    public static EnumC2243741Crs valueOf(String str) {
        return (EnumC2243741Crs) C08FF.LIZ(EnumC2243741Crs.class, str);
    }

    EnumC2243741Crs(int i) {
        this.LL = i;
    }
}
