package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5K, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5K extends Message<C1C5K, C1C5L> {
    public static final ProtoAdapter<C1C5K> ADAPTER = new ProtoAdapter<C1C5K>() { // from class: X.1C5J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5K decode(ProtoReader protoReader) {
            C1C5K c1c5k = new C1C5K();
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
                                    c1c5k.extra = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c5k.schema_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c5k.icon_url = C687802mK.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c5k.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5K c1c5k) {
            C1C5K c1c5k2 = c1c5k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c5k2.text) + C687802mK.ADAPTER.encodedSizeWithTag(2, c1c5k2.icon_url) + protoAdapter.encodedSizeWithTag(3, c1c5k2.schema_url) + protoAdapter.encodedSizeWithTag(4, c1c5k2.extra) + c1c5k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C5K c1c5k) {
            C1C5K c1c5k2 = c1c5k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c5k2.text);
            C687802mK.ADAPTER.encodeWithTag(protoWriter, 2, c1c5k2.icon_url);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c5k2.schema_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c5k2.extra);
            protoWriter.writeBytes(c1c5k2.unknownFields());
        }
    };
    public String extra;
    public C687802mK icon_url;
    public String schema_url;
    public String text;

    public C1C5K() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C5L newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
