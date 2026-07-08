package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Bzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223241Bzu extends Message<C2223241Bzu, C2223251Bzv> {
    public static final ProtoAdapter<C2223241Bzu> ADAPTER = new ProtoAdapter<C2223241Bzu>() { // from class: X.1Bzt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223241Bzu decode(ProtoReader protoReader) {
            C2223241Bzu c2223241Bzu = new C2223241Bzu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223241Bzu.anchor_type = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2223241Bzu.anchor_source = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223241Bzu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223241Bzu c2223241Bzu) {
            C2223241Bzu c2223241Bzu2 = c2223241Bzu;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2223241Bzu2.anchor_source) + protoAdapter.encodedSizeWithTag(2, c2223241Bzu2.anchor_type) + c2223241Bzu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223241Bzu c2223241Bzu) {
            C2223241Bzu c2223241Bzu2 = c2223241Bzu;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223241Bzu2.anchor_source);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223241Bzu2.anchor_type);
            protoWriter.writeBytes(c2223241Bzu2.unknownFields());
        }
    };
    public Long anchor_source;
    public Long anchor_type;

    public C2223241Bzu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223251Bzv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
