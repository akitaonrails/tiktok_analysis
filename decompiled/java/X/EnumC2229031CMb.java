package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2229031CMb implements WireEnum {
    VAR_LINK_MIC_REQUEST_METHOD_GET(0),
    VAR_LINK_MIC_REQUEST_METHOD_POST(1);

    public static final ProtoAdapter<EnumC2229031CMb> ADAPTER = new EnumAdapter<EnumC2229031CMb>() { // from class: X.1CMc
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2229031CMb.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2229031CMb fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_REQUEST_METHOD_POST;
        }
        return VAR_LINK_MIC_REQUEST_METHOD_GET;
    }

    public static EnumC2229031CMb valueOf(String str) {
        return (EnumC2229031CMb) C08FF.LIZ(EnumC2229031CMb.class, str);
    }

    EnumC2229031CMb(int i) {
        this.LL = i;
    }
}
