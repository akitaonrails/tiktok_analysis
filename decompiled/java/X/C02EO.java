package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EO extends Message<C02EO, C572202Ky> {
    public static final ProtoAdapter<C02EO> ADAPTER = new ProtoAdapter<C02EO>() { // from class: X.02EN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EO decode(ProtoReader protoReader) {
            C02EO c02eo = new C02EO();
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
                                    c02eo.type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02eo.shape = C02EM.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02eo.color = C554802Eg.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02eo.animation = C634202dg.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02eo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EO c02eo) {
            C02EO c02eo2 = c02eo;
            return C634202dg.ADAPTER.encodedSizeWithTag(1, c02eo2.animation) + C554802Eg.ADAPTER.encodedSizeWithTag(2, c02eo2.color) + C02EM.ADAPTER.encodedSizeWithTag(3, c02eo2.shape) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02eo2.type) + c02eo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EO c02eo) {
            C02EO c02eo2 = c02eo;
            C634202dg.ADAPTER.encodeWithTag(protoWriter, 1, c02eo2.animation);
            C554802Eg.ADAPTER.encodeWithTag(protoWriter, 2, c02eo2.color);
            C02EM.ADAPTER.encodeWithTag(protoWriter, 3, c02eo2.shape);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c02eo2.type);
            protoWriter.writeBytes(c02eo2.unknownFields());
        }
    };
    public C634202dg animation;
    public C554802Eg color;
    public C02EM shape;
    public Integer type;

    public C02EO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C572202Ky newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
