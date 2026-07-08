package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C602102Wl extends Message<C602102Wl, C602202Wm> {
    public static final ProtoAdapter<C602102Wl> ADAPTER = new ProtoAdapter<C602102Wl>() { // from class: X.02Wk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C602102Wl decode(ProtoReader protoReader) {
            C602102Wl c602102Wl = new C602102Wl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c602102Wl.extra_data = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c602102Wl.pre_bill_info_log_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c602102Wl.change_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c602102Wl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C602102Wl c602102Wl) {
            C602102Wl c602102Wl2 = c602102Wl;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c602102Wl2.change_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c602102Wl2.pre_bill_info_log_id) + protoAdapter.encodedSizeWithTag(3, c602102Wl2.extra_data) + c602102Wl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C602102Wl c602102Wl) {
        }
    };
    public Integer change_type;
    public String extra_data;
    public String pre_bill_info_log_id;

    public C602102Wl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C602202Wm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
