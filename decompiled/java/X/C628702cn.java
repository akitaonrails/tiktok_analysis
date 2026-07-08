package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C628702cn extends Message<C628702cn, C628802co> {
    public static final ProtoAdapter<C628702cn> ADAPTER = new ProtoAdapter<C628702cn>() { // from class: X.02cm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C628702cn decode(ProtoReader protoReader) {
            C628702cn c628702cn = new C628702cn();
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
                                    c628702cn.sug_icon_type = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c628702cn.sug_icon_uri = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c628702cn.sug_reason_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c628702cn.sug_reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c628702cn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C628702cn c628702cn) {
            C628702cn c628702cn2 = c628702cn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c628702cn2.sug_reason) + protoAdapter.encodedSizeWithTag(2, c628702cn2.sug_reason_type) + protoAdapter.encodedSizeWithTag(3, c628702cn2.sug_icon_uri) + protoAdapter.encodedSizeWithTag(4, c628702cn2.sug_icon_type) + c628702cn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C628702cn c628702cn) {
            C628702cn c628702cn2 = c628702cn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c628702cn2.sug_reason);
            protoAdapter.encodeWithTag(protoWriter, 2, c628702cn2.sug_reason_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c628702cn2.sug_icon_uri);
            protoAdapter.encodeWithTag(protoWriter, 4, c628702cn2.sug_icon_type);
            protoWriter.writeBytes(c628702cn2.unknownFields());
        }
    };
    public String sug_icon_type;
    public String sug_icon_uri;
    public String sug_reason;
    public String sug_reason_type;

    public C628702cn() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C628802co newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
