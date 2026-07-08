package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0paT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517310paT extends Message<C1517310paT, C1517320paU> {
    public static final ProtoAdapter<C1517310paT> ADAPTER = new ProtoAdapter<C1517310paT>() { // from class: X.0paS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517310paT decode(ProtoReader protoReader) {
            C1517310paT c1517310paT = new C1517310paT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517310paT.timestamp = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1517310paT.action = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517310paT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517310paT c1517310paT) {
            C1517310paT c1517310paT2 = c1517310paT;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1517310paT2.action) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1517310paT2.timestamp) + c1517310paT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517310paT c1517310paT) {
            C1517310paT c1517310paT2 = c1517310paT;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1517310paT2.action);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1517310paT2.timestamp);
            protoWriter.writeBytes(c1517310paT2.unknownFields());
        }
    };
    public String action;
    public Long timestamp;

    @Override // com.squareup.wire.Message
    public C1517320paU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517310paT(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1517310paT(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = str;
        this.timestamp = l;
    }
}
