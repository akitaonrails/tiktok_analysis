package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VC extends Message<C02VC, C02VD> {
    public static final ProtoAdapter<C02VC> ADAPTER = new ProtoAdapter<C02VC>() { // from class: X.02VB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VC decode(ProtoReader protoReader) {
            C02VC c02vc = new C02VC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vc.event_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02vc.unavailable_reason = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02vc.poi_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VC c02vc) {
            C02VC c02vc2 = c02vc;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c02vc2.poi_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02vc2.unavailable_reason) + protoAdapter.encodedSizeWithTag(3, c02vc2.event_info) + c02vc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02VC c02vc) {
            C02VC c02vc2 = c02vc;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02vc2.poi_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02vc2.unavailable_reason);
            protoAdapter.encodeWithTag(protoWriter, 3, c02vc2.event_info);
            protoWriter.writeBytes(c02vc2.unknownFields());
        }
    };
    public String event_info;
    public Long poi_id;
    public String unavailable_reason;

    public C02VC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
