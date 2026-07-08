package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558002Fm extends Message<C558002Fm, C02KQ> {
    public static final ProtoAdapter<C558002Fm> ADAPTER = new ProtoAdapter<C558002Fm>() { // from class: X.027n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558002Fm decode(ProtoReader protoReader) {
            C558002Fm c558002Fm = new C558002Fm();
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
                                    c558002Fm.action_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c558002Fm.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c558002Fm.text_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c558002Fm.body = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558002Fm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558002Fm c558002Fm) {
            C558002Fm c558002Fm2 = c558002Fm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c558002Fm2.body) + protoAdapter.encodedSizeWithTag(2, c558002Fm2.text_color) + protoAdapter.encodedSizeWithTag(3, c558002Fm2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(4, c558002Fm2.action_type) + c558002Fm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558002Fm c558002Fm) {
            C558002Fm c558002Fm2 = c558002Fm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c558002Fm2.body);
            protoAdapter.encodeWithTag(protoWriter, 2, c558002Fm2.text_color);
            protoAdapter.encodeWithTag(protoWriter, 3, c558002Fm2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c558002Fm2.action_type);
            protoWriter.writeBytes(c558002Fm2.unknownFields());
        }
    };
    public Integer action_type;
    public String body;
    public String schema;
    public String text_color;

    public C558002Fm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
