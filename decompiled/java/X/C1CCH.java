package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCH extends Message<C1CCH, C1CCI> {
    public static final ProtoAdapter<C1CCH> ADAPTER = new ProtoAdapter<C1CCH>() { // from class: X.1CCG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCH decode(ProtoReader protoReader) {
            C1CCH c1cch = new C1CCH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cch.asset_type = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cch.asset_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cch.ai_sub_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cch.ai_type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cch;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCH c1cch) {
            C1CCH c1cch2 = c1cch;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cch2.ai_type) + protoAdapter.encodedSizeWithTag(2, c1cch2.ai_sub_type) + protoAdapter.encodedSizeWithTag(3, c1cch2.asset_id) + protoAdapter.encodedSizeWithTag(4, c1cch2.asset_type) + c1cch2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCH c1cch) {
            C1CCH c1cch2 = c1cch;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cch2.ai_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cch2.ai_sub_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cch2.asset_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cch2.asset_type);
            protoWriter.writeBytes(c1cch2.unknownFields());
        }
    };
    public String ai_sub_type;
    public String ai_type;
    public String asset_id;
    public String asset_type;

    public C1CCH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CCI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
