package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F0 extends Message<C02F0, C02LE> {
    public static final ProtoAdapter<C02F0> ADAPTER = new ProtoAdapter<C02F0>() { // from class: X.026y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F0 decode(ProtoReader protoReader) {
            C02F0 c02f0 = new C02F0();
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
                                        c02f0.end_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02f0.start_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02f0.author_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02f0.music_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02f0.music_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F0 c02f0) {
            C02F0 c02f02 = c02f0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02f02.music_id) + protoAdapter.encodedSizeWithTag(2, c02f02.music_name) + protoAdapter.encodedSizeWithTag(3, c02f02.author_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02f02.start_time_in_ms) + protoAdapter2.encodedSizeWithTag(5, c02f02.end_time_in_ms) + c02f02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02F0 c02f0) {
            C02F0 c02f02 = c02f0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02f02.music_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02f02.music_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02f02.author_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02f02.start_time_in_ms);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02f02.end_time_in_ms);
            protoWriter.writeBytes(c02f02.unknownFields());
        }
    };
    public String author_name;
    public Integer end_time_in_ms;
    public String music_id;
    public String music_name;
    public Integer start_time_in_ms;

    public C02F0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
