package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C590002Ru extends Message<C590002Ru, C590302Rx> {
    public static final ProtoAdapter<C590002Ru> ADAPTER = new ProtoAdapter<C590002Ru>() { // from class: X.02Rt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C590002Ru decode(ProtoReader protoReader) {
            C590002Ru c590002Ru = new C590002Ru();
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
                                    c590002Ru.icon = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c590002Ru.deprecated = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c590002Ru.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c590002Ru.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c590002Ru;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C590002Ru c590002Ru) {
            C590002Ru c590002Ru2 = c590002Ru;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c590002Ru2.schema) + protoAdapter.encodedSizeWithTag(2, c590002Ru2.text) + C673002jw.ADAPTER.encodedSizeWithTag(3, c590002Ru2.deprecated) + protoAdapter.encodedSizeWithTag(4, c590002Ru2.icon) + c590002Ru2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C590002Ru c590002Ru) {
            C590002Ru c590002Ru2 = c590002Ru;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c590002Ru2.schema);
            protoAdapter.encodeWithTag(protoWriter, 2, c590002Ru2.text);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c590002Ru2.deprecated);
            protoAdapter.encodeWithTag(protoWriter, 4, c590002Ru2.icon);
            protoWriter.writeBytes(c590002Ru2.unknownFields());
        }
    };
    public C673002jw deprecated;
    public String icon;
    public String schema;
    public String text;

    public C590002Ru() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C590302Rx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
