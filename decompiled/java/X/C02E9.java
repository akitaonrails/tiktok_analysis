package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E9 extends Message<C02E9, C573702Ln> {
    public static final ProtoAdapter<C02E9> ADAPTER = new ProtoAdapter<C02E9>() { // from class: X.026s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E9 decode(ProtoReader protoReader) {
            C02E9 c02e9 = new C02E9();
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
                                    c02e9.schema_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02e9.show_music_title = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02e9.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02e9.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E9 c02e9) {
            C02E9 c02e92 = c02e9;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02e92.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02e92.text) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02e92.show_music_title) + protoAdapter.encodedSizeWithTag(4, c02e92.schema_url) + c02e92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E9 c02e9) {
            C02E9 c02e92 = c02e9;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02e92.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02e92.text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02e92.show_music_title);
            protoAdapter.encodeWithTag(protoWriter, 4, c02e92.schema_url);
            protoWriter.writeBytes(c02e92.unknownFields());
        }
    };
    public String schema_url;
    public Boolean show_music_title;
    public String text;
    public Integer type;

    public C02E9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573702Ln newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
