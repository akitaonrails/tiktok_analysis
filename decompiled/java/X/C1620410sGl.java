package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0sGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620410sGl extends Message<C1620410sGl, C1620440sGo> {
    public static final ProtoAdapter<C1620410sGl> ADAPTER = new ProtoAdapter<C1620410sGl>() { // from class: X.0sGk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620410sGl decode(ProtoReader protoReader) {
            C1620410sGl c1620410sGl = new C1620410sGl();
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
                                        c1620410sGl.log_pb = C1517910pbR.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1620410sGl.awemes.add(C5186020i.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1620410sGl.has_more = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1620410sGl.status_msg = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1620410sGl.status_code = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620410sGl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620410sGl c1620410sGl) {
            C1620410sGl c1620410sGl2 = c1620410sGl;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1620410sGl2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1620410sGl2.status_msg) + protoAdapter.encodedSizeWithTag(3, c1620410sGl2.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1620410sGl2.awemes) + C1517910pbR.ADAPTER.encodedSizeWithTag(5, c1620410sGl2.log_pb) + c1620410sGl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620410sGl c1620410sGl) {
            C1620410sGl c1620410sGl2 = c1620410sGl;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1620410sGl2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1620410sGl2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1620410sGl2.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1620410sGl2.awemes);
            C1517910pbR.ADAPTER.encodeWithTag(protoWriter, 5, c1620410sGl2.log_pb);
            protoWriter.writeBytes(c1620410sGl2.unknownFields());
        }
    };
    public List<C5186020i> awemes;
    public Integer has_more;
    public C1517910pbR log_pb;
    public Integer status_code;
    public String status_msg;

    public C1620410sGl() {
        super(ADAPTER, ByteString.EMPTY);
        this.awemes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1620440sGo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
