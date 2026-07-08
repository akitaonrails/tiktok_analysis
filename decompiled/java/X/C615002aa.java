package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C615002aa extends Message<C615002aa, C615102ab> {
    public static final ProtoAdapter<C615002aa> ADAPTER = new ProtoAdapter<C615002aa>() { // from class: X.02aZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C615002aa decode(ProtoReader protoReader) {
            C615002aa c615002aa = new C615002aa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 101) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c615002aa.log_extra = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c615002aa.activity_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c615002aa.style = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c615002aa.icon = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c615002aa.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c615002aa.activity_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c615002aa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C615002aa c615002aa) {
            C615002aa c615002aa2 = c615002aa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c615002aa2.activity_id) + protoAdapter.encodedSizeWithTag(2, c615002aa2.name) + C02U1.ADAPTER.encodedSizeWithTag(3, c615002aa2.icon);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c615002aa2.style) + protoAdapter2.encodedSizeWithTag(5, c615002aa2.activity_type) + protoAdapter.encodedSizeWithTag(101, c615002aa2.log_extra) + c615002aa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C615002aa c615002aa) {
        }
    };
    public String activity_id;
    public Integer activity_type;
    public C02U1 icon;
    public String log_extra;
    public String name;
    public Integer style;

    public C615002aa() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C615102ab newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
