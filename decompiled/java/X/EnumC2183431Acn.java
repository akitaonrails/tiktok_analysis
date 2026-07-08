package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Acn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2183431Acn implements WireEnum {
    public static final ProtoAdapter<EnumC2183431Acn> ADAPTER;
    public static final /* synthetic */ EnumC2183431Acn[] LLILLJJLI;
    public static final EnumC2183431Acn VAR_LINK_MIC_LAYOUT_QOS_MONITOR_KEY_PULL_STREAM;
    public final int LL = 0;

    static {
        EnumC2183431Acn enumC2183431Acn = new EnumC2183431Acn();
        VAR_LINK_MIC_LAYOUT_QOS_MONITOR_KEY_PULL_STREAM = enumC2183431Acn;
        LLILLJJLI = new EnumC2183431Acn[]{enumC2183431Acn};
        ADAPTER = new EnumAdapter<EnumC2183431Acn>() { // from class: X.1Aco
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return EnumC2183431Acn.fromValue(i);
            }
        };
    }

    public static EnumC2183431Acn[] values() {
        return (EnumC2183431Acn[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2183431Acn fromValue(int i) {
        if (i != 0) {
            return null;
        }
        return VAR_LINK_MIC_LAYOUT_QOS_MONITOR_KEY_PULL_STREAM;
    }

    public static EnumC2183431Acn valueOf(String str) {
        return (EnumC2183431Acn) C08FF.LIZ(EnumC2183431Acn.class, str);
    }
}
