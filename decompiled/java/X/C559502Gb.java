package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559502Gb extends Message<C559502Gb, C02JJ> {
    public static final ProtoAdapter<C559502Gb> ADAPTER = new ProtoAdapter<C559502Gb>() { // from class: X.028W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559502Gb decode(ProtoReader protoReader) {
            C559502Gb c559502Gb = new C559502Gb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c559502Gb.valid_ts = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c559502Gb.ip_list = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c559502Gb.domain = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559502Gb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559502Gb c559502Gb) {
            C559502Gb c559502Gb2 = c559502Gb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c559502Gb2.domain) + protoAdapter.encodedSizeWithTag(2, c559502Gb2.ip_list) + ProtoAdapter.INT64.encodedSizeWithTag(3, c559502Gb2.valid_ts) + c559502Gb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559502Gb c559502Gb) {
            C559502Gb c559502Gb2 = c559502Gb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c559502Gb2.domain);
            protoAdapter.encodeWithTag(protoWriter, 2, c559502Gb2.ip_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c559502Gb2.valid_ts);
            protoWriter.writeBytes(c559502Gb2.unknownFields());
        }
    };
    public String domain;
    public String ip_list;
    public Long valid_ts;

    public C559502Gb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
