package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0ZCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC895750ZCb implements WireEnum {
    NormalUserInbox(1),
    StrangerMessageRequest(2),
    StrangerFilteredRequest(3);

    public static final ProtoAdapter<EnumC895750ZCb> ADAPTER = new EnumAdapter<EnumC895750ZCb>() { // from class: X.0ZCc
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC895750ZCb.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC895750ZCb fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return StrangerFilteredRequest;
            }
            return StrangerMessageRequest;
        }
        return NormalUserInbox;
    }

    public static EnumC895750ZCb valueOf(String str) {
        return (EnumC895750ZCb) C08FF.LIZ(EnumC895750ZCb.class, str);
    }

    EnumC895750ZCb(int i) {
        this.LL = i;
    }
}
