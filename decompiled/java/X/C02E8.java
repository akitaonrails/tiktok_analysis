package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E8 extends Message<C02E8, C572502Lb> {
    public static final ProtoAdapter<C02E8> ADAPTER = new ProtoAdapter<C02E8>() { // from class: X.026K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E8 decode(ProtoReader protoReader) {
            C02E8 c02e8 = new C02E8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02e8.artist_name = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02e8.duration = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02e8.cover_medium = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02e8.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02e8.id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E8 c02e8) {
            C02E8 c02e82 = c02e8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02e82.id) + protoAdapter.encodedSizeWithTag(2, c02e82.name) + C673002jw.ADAPTER.encodedSizeWithTag(3, c02e82.cover_medium) + ProtoAdapter.INT64.encodedSizeWithTag(4, c02e82.duration) + protoAdapter.encodedSizeWithTag(5, c02e82.artist_name) + c02e82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E8 c02e8) {
            C02E8 c02e82 = c02e8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02e82.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02e82.name);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c02e82.cover_medium);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c02e82.duration);
            protoAdapter.encodeWithTag(protoWriter, 5, c02e82.artist_name);
            protoWriter.writeBytes(c02e82.unknownFields());
        }
    };
    public String artist_name;
    public C673002jw cover_medium;
    public Long duration;
    public String id;
    public String name;

    public C02E8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C572502Lb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
