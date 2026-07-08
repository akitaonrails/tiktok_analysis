package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556102Et extends Message<C556102Et, C567802Jg> {
    public static final ProtoAdapter<C556102Et> ADAPTER = new ProtoAdapter<C556102Et>() { // from class: X.027m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556102Et decode(ProtoReader protoReader) {
            C556102Et c556102Et = new C556102Et();
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
                                    c556102Et.end = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c556102Et.begin = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c556102Et.link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c556102Et.query = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556102Et;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556102Et c556102Et) {
            C556102Et c556102Et2 = c556102Et;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c556102Et2.query) + protoAdapter.encodedSizeWithTag(2, c556102Et2.link);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c556102Et2.begin) + protoAdapter2.encodedSizeWithTag(4, c556102Et2.end) + c556102Et2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556102Et c556102Et) {
            C556102Et c556102Et2 = c556102Et;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c556102Et2.query);
            protoAdapter.encodeWithTag(protoWriter, 2, c556102Et2.link);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c556102Et2.begin);
            protoAdapter2.encodeWithTag(protoWriter, 4, c556102Et2.end);
            protoWriter.writeBytes(c556102Et2.unknownFields());
        }
    };
    public Integer begin;
    public Integer end;
    public String link;
    public String query;

    public C556102Et() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567802Jg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
