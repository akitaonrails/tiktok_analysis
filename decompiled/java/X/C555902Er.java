package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555902Er extends Message<C555902Er, C02I3> {
    public static final ProtoAdapter<C555902Er> ADAPTER = new ProtoAdapter<C555902Er>() { // from class: X.02Dl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555902Er decode(ProtoReader protoReader) {
            C555902Er c555902Er = new C555902Er();
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
                                    c555902Er.ymax = ProtoAdapter.FLOAT.decode(protoReader);
                                }
                            } else {
                                c555902Er.xmax = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c555902Er.ymin = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c555902Er.xmin = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555902Er;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555902Er c555902Er) {
            C555902Er c555902Er2 = c555902Er;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.encodedSizeWithTag(1, c555902Er2.xmin) + protoAdapter.encodedSizeWithTag(2, c555902Er2.ymin) + protoAdapter.encodedSizeWithTag(3, c555902Er2.xmax) + protoAdapter.encodedSizeWithTag(4, c555902Er2.ymax) + c555902Er2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C555902Er c555902Er) {
            C555902Er c555902Er2 = c555902Er;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 1, c555902Er2.xmin);
            protoAdapter.encodeWithTag(protoWriter, 2, c555902Er2.ymin);
            protoAdapter.encodeWithTag(protoWriter, 3, c555902Er2.xmax);
            protoAdapter.encodeWithTag(protoWriter, 4, c555902Er2.ymax);
            protoWriter.writeBytes(c555902Er2.unknownFields());
        }
    };
    public Float xmax;
    public Float xmin;
    public Float ymax;
    public Float ymin;

    public C555902Er() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
