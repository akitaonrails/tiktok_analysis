package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232111CXx implements WireEnum {
    VAR_LINK_MIC_INVITE_TYPE_LEGACY_INVITEE(0),
    VAR_LINK_MIC_INVITE_TYPE_INVITEE_LIST(1);

    public static final ProtoAdapter<EnumC2232111CXx> ADAPTER = new EnumAdapter<EnumC2232111CXx>() { // from class: X.1CYb
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232111CXx.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232111CXx fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINK_MIC_INVITE_TYPE_INVITEE_LIST;
        }
        return VAR_LINK_MIC_INVITE_TYPE_LEGACY_INVITEE;
    }

    public static EnumC2232111CXx valueOf(String str) {
        return (EnumC2232111CXx) C08FF.LIZ(EnumC2232111CXx.class, str);
    }

    EnumC2232111CXx(int i) {
        this.LL = i;
    }
}
