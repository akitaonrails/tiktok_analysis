package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EQ extends Message<C02EQ, C02KV> {
    public static final ProtoAdapter<C02EQ> ADAPTER = new ProtoAdapter<C02EQ>() { // from class: X.028b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EQ decode(ProtoReader protoReader) {
            C02EQ c02eq = new C02EQ();
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
                                        c02eq.hd = C673002jw.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02eq.large = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02eq.medium = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02eq.thumbnail = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02eq.thumb = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02eq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EQ c02eq) {
            C02EQ c02eq2 = c02eq;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02eq2.thumb) + protoAdapter.encodedSizeWithTag(2, c02eq2.thumbnail) + protoAdapter.encodedSizeWithTag(3, c02eq2.medium) + protoAdapter.encodedSizeWithTag(4, c02eq2.large) + protoAdapter.encodedSizeWithTag(5, c02eq2.hd) + c02eq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EQ c02eq) {
            C02EQ c02eq2 = c02eq;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c02eq2.thumb);
            protoAdapter.encodeWithTag(protoWriter, 2, c02eq2.thumbnail);
            protoAdapter.encodeWithTag(protoWriter, 3, c02eq2.medium);
            protoAdapter.encodeWithTag(protoWriter, 4, c02eq2.large);
            protoAdapter.encodeWithTag(protoWriter, 5, c02eq2.hd);
            protoWriter.writeBytes(c02eq2.unknownFields());
        }
    };
    public C673002jw hd;
    public C673002jw large;
    public C673002jw medium;
    public C673002jw thumb;
    public C673002jw thumbnail;

    public C02EQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
