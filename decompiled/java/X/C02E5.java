package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E5 extends Message<C02E5, C02KT> {
    public static final ProtoAdapter<C02E5> ADAPTER = new ProtoAdapter<C02E5>() { // from class: X.026o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E5 decode(ProtoReader protoReader) {
            C02E5 c02e5 = new C02E5();
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
                                    c02e5.label_thumb = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02e5.label_large = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02e5.width = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02e5.height = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E5 c02e5) {
            C02E5 c02e52 = c02e5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02e52.height) + protoAdapter.encodedSizeWithTag(2, c02e52.width);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02e52.label_large) + protoAdapter2.encodedSizeWithTag(4, c02e52.label_thumb) + c02e52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E5 c02e5) {
            C02E5 c02e52 = c02e5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02e52.height);
            protoAdapter.encodeWithTag(protoWriter, 2, c02e52.width);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02e52.label_large);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02e52.label_thumb);
            protoWriter.writeBytes(c02e52.unknownFields());
        }
    };
    public Integer height;
    public C673002jw label_large;
    public C673002jw label_thumb;
    public Integer width;

    public C02E5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
