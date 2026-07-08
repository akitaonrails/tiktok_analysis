package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0sGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620430sGn extends Message<C1620430sGn, C1620450sGp> {
    public static final ProtoAdapter<C1620430sGn> ADAPTER = new ProtoAdapter<C1620430sGn>() { // from class: X.0sGm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620430sGn decode(ProtoReader protoReader) {
            C1620430sGn c1620430sGn = new C1620430sGn();
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
                                        c1620430sGn.log_pb = C1517940pbU.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1620430sGn.awemes.add(C5186020i.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1620430sGn.has_more = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1620430sGn.status_msg = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1620430sGn.status_code = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620430sGn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620430sGn c1620430sGn) {
            C1620430sGn c1620430sGn2 = c1620430sGn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1620430sGn2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1620430sGn2.status_msg) + protoAdapter.encodedSizeWithTag(3, c1620430sGn2.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1620430sGn2.awemes) + C1517940pbU.ADAPTER.encodedSizeWithTag(5, c1620430sGn2.log_pb) + c1620430sGn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620430sGn c1620430sGn) {
            C1620430sGn c1620430sGn2 = c1620430sGn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1620430sGn2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1620430sGn2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1620430sGn2.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1620430sGn2.awemes);
            C1517940pbU.ADAPTER.encodeWithTag(protoWriter, 5, c1620430sGn2.log_pb);
            protoWriter.writeBytes(c1620430sGn2.unknownFields());
        }
    };
    public List<C5186020i> awemes;
    public Integer has_more;
    public C1517940pbU log_pb;
    public Integer status_code;
    public String status_msg;

    public C1620430sGn() {
        super(ADAPTER, ByteString.EMPTY);
        this.awemes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1620450sGp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
