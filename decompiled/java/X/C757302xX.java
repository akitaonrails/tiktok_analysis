package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C757302xX extends Message<C757302xX, C757402xY> {
    public static final ProtoAdapter<C757302xX> ADAPTER = new ProtoAdapter<C757302xX>() { // from class: X.02xW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C757302xX decode(ProtoReader protoReader) {
            C757302xX c757302xX = new C757302xX();
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
                                    c757302xX.end_time = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c757302xX.start_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c757302xX.edition_no = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c757302xX.uid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c757302xX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C757302xX c757302xX) {
            C757302xX c757302xX2 = c757302xX;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c757302xX2.uid) + ProtoAdapter.INT32.encodedSizeWithTag(2, c757302xX2.edition_no);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c757302xX2.start_time) + protoAdapter.encodedSizeWithTag(4, c757302xX2.end_time) + c757302xX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C757302xX c757302xX) {
            C757302xX c757302xX2 = c757302xX;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c757302xX2.uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c757302xX2.edition_no);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c757302xX2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 4, c757302xX2.end_time);
            protoWriter.writeBytes(c757302xX2.unknownFields());
        }
    };
    public Integer edition_no;
    public Long end_time;
    public Long start_time;
    public String uid;

    public C757302xX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C757402xY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
