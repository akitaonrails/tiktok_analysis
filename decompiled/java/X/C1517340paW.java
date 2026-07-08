package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0paW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517340paW extends Message<C1517340paW, C1517350paX> {
    public static final ProtoAdapter<C1517340paW> ADAPTER = new ProtoAdapter<C1517340paW>() { // from class: X.0paV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517340paW decode(ProtoReader protoReader) {
            C1517340paW c1517340paW = new C1517340paW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1517340paW.actions.add(C1517310paT.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1517340paW.doc_type = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1517340paW.gid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517340paW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517340paW c1517340paW) {
            C1517340paW c1517340paW2 = c1517340paW;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1517340paW2.gid) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1517340paW2.doc_type) + C1517310paT.ADAPTER.asRepeated().encodedSizeWithTag(3, c1517340paW2.actions) + c1517340paW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517340paW c1517340paW) {
            C1517340paW c1517340paW2 = c1517340paW;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1517340paW2.gid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1517340paW2.doc_type);
            C1517310paT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1517340paW2.actions);
            protoWriter.writeBytes(c1517340paW2.unknownFields());
        }
    };
    public List<C1517310paT> actions;
    public Long doc_type;
    public String gid;

    @Override // com.squareup.wire.Message
    public C1517350paX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517340paW(String str, Long l, List<C1517310paT> list) {
        this(str, l, list, ByteString.EMPTY);
    }

    public C1517340paW(String str, Long l, List<C1517310paT> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gid = str;
        this.doc_type = l;
        this.actions = C1516540pZE.LJFF("actions", list);
    }
}
