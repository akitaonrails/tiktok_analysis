package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C687002mC extends Message<C687002mC, C687102mD> {
    public static final ProtoAdapter<C687002mC> ADAPTER = new ProtoAdapter<C687002mC>() { // from class: X.02mB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C687002mC decode(ProtoReader protoReader) {
            C687002mC c687002mC = new C687002mC();
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
                                    c687002mC.declaration_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c687002mC.extra = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c687002mC.created_by_ai = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c687002mC.aigc_label_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c687002mC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C687002mC c687002mC) {
            C687002mC c687002mC2 = c687002mC;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c687002mC2.aigc_label_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c687002mC2.created_by_ai) + ProtoAdapter.STRING.encodedSizeWithTag(3, c687002mC2.extra) + protoAdapter.encodedSizeWithTag(4, c687002mC2.declaration_type) + c687002mC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C687002mC c687002mC) {
            C687002mC c687002mC2 = c687002mC;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c687002mC2.aigc_label_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c687002mC2.created_by_ai);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c687002mC2.extra);
            protoAdapter.encodeWithTag(protoWriter, 4, c687002mC2.declaration_type);
            protoWriter.writeBytes(c687002mC2.unknownFields());
        }
    };
    public Integer aigc_label_type;
    public Boolean created_by_ai;
    public Integer declaration_type;
    public String extra;

    public C687002mC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C687102mD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
