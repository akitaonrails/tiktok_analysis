package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517790pbF extends Message<C1517790pbF, C1517800pbG> {
    public static final ProtoAdapter<C1517790pbF> ADAPTER = new ProtoAdapter<C1517790pbF>() { // from class: X.0pbE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517790pbF decode(ProtoReader protoReader) {
            C1517790pbF c1517790pbF = new C1517790pbF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517790pbF.gid_list.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c1517790pbF.reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517790pbF;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517790pbF c1517790pbF) {
            C1517790pbF c1517790pbF2 = c1517790pbF;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1517790pbF2.reason) + protoAdapter.asRepeated().encodedSizeWithTag(2, c1517790pbF2.gid_list) + c1517790pbF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517790pbF c1517790pbF) {
            C1517790pbF c1517790pbF2 = c1517790pbF;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1517790pbF2.reason);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c1517790pbF2.gid_list);
            protoWriter.writeBytes(c1517790pbF2.unknownFields());
        }
    };
    public List<String> gid_list;
    public String reason;

    @Override // com.squareup.wire.Message
    public C1517800pbG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517790pbF(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public C1517790pbF(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reason = str;
        this.gid_list = C1516540pZE.LJFF("gid_list", list);
    }
}
