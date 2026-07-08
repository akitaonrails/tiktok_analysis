package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1286780jae implements WireEnum {
    VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_DEFAULT(0),
    VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_SINGLE(1);

    public static final ProtoAdapter<EnumC1286780jae> ADAPTER = new EnumAdapter<EnumC1286780jae>() { // from class: X.0jaf
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1286780jae.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1286780jae fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_SINGLE;
        }
        return VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_DEFAULT;
    }

    public static EnumC1286780jae valueOf(String str) {
        return (EnumC1286780jae) C08FF.LIZ(EnumC1286780jae.class, str);
    }

    EnumC1286780jae(int i) {
        this.LL = i;
    }
}
