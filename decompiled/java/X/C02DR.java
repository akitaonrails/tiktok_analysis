package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DR extends Message<C02DR, C02JD> {
    public static final ProtoAdapter<C02DR> ADAPTER = new ProtoAdapter<C02DR>() { // from class: X.026m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DR decode(ProtoReader protoReader) {
            C02DR c02dr = new C02DR();
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
                                        c02dr.digg_count = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02dr.music_cover_url = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02dr.music_qrcode_url = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02dr.music_used_count = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02dr.music_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DR c02dr) {
            C02DR c02dr2 = c02dr;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02dr2.music_count) + protoAdapter.encodedSizeWithTag(2, c02dr2.music_used_count);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02dr2.music_qrcode_url) + protoAdapter2.encodedSizeWithTag(4, c02dr2.music_cover_url) + protoAdapter.encodedSizeWithTag(5, c02dr2.digg_count) + c02dr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DR c02dr) {
            C02DR c02dr2 = c02dr;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02dr2.music_count);
            protoAdapter.encodeWithTag(protoWriter, 2, c02dr2.music_used_count);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02dr2.music_qrcode_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02dr2.music_cover_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c02dr2.digg_count);
            protoWriter.writeBytes(c02dr2.unknownFields());
        }
    };
    public Integer digg_count;
    public Integer music_count;
    public C673002jw music_cover_url;
    public C673002jw music_qrcode_url;
    public Integer music_used_count;

    public C02DR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
