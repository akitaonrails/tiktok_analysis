package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E0 extends Message<C02E0, C02JE> {
    public static final ProtoAdapter<C02E0> ADAPTER = new ProtoAdapter<C02E0>() { // from class: X.026G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E0 decode(ProtoReader protoReader) {
            C02E0 c02e0 = new C02E0();
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
                                    c02e0.media_type = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02e0.dynamic_cover = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02e0.cover = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02e0.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E0 c02e0) {
            C02E0 c02e02 = c02e0;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02e02.aweme_id);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02e02.cover) + protoAdapter.encodedSizeWithTag(3, c02e02.dynamic_cover) + ProtoAdapter.INT64.encodedSizeWithTag(4, c02e02.media_type) + c02e02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E0 c02e0) {
            C02E0 c02e02 = c02e0;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02e02.aweme_id);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c02e02.cover);
            protoAdapter.encodeWithTag(protoWriter, 3, c02e02.dynamic_cover);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c02e02.media_type);
            protoWriter.writeBytes(c02e02.unknownFields());
        }
    };
    public String aweme_id;
    public C673002jw cover;
    public C673002jw dynamic_cover;
    public Long media_type;

    public C02E0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
