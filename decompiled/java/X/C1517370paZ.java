package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0paZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517370paZ extends Message<C1517370paZ, C1517380paa> {
    public static final ProtoAdapter<C1517370paZ> ADAPTER = new ProtoAdapter<C1517370paZ>() { // from class: X.0paY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517370paZ decode(ProtoReader protoReader) {
            C1517370paZ c1517370paZ = new C1517370paZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1517370paZ.search_query = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1517370paZ.search_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1517370paZ.search_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1517370paZ.search_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1517370paZ.consumption_list.add(C1517340paW.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1517370paZ.search_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517370paZ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517370paZ c1517370paZ) {
            C1517370paZ c1517370paZ2 = c1517370paZ;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1517370paZ2.search_query) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1517370paZ2.search_time) + protoAdapter.encodedSizeWithTag(3, c1517370paZ2.search_type) + protoAdapter.encodedSizeWithTag(4, c1517370paZ2.search_source) + C1517340paW.ADAPTER.asRepeated().encodedSizeWithTag(5, c1517370paZ2.consumption_list) + protoAdapter.encodedSizeWithTag(6, c1517370paZ2.search_id) + c1517370paZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517370paZ c1517370paZ) {
            C1517370paZ c1517370paZ2 = c1517370paZ;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1517370paZ2.search_query);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1517370paZ2.search_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c1517370paZ2.search_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c1517370paZ2.search_source);
            C1517340paW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c1517370paZ2.consumption_list);
            protoAdapter.encodeWithTag(protoWriter, 6, c1517370paZ2.search_id);
            protoWriter.writeBytes(c1517370paZ2.unknownFields());
        }
    };
    public List<C1517340paW> consumption_list;
    public String search_id;
    public String search_query;
    public String search_source;
    public Long search_time;
    public String search_type;

    @Override // com.squareup.wire.Message
    public C1517380paa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517370paZ(String str, Long l, String str2, String str3, List<C1517340paW> list, String str4) {
        this(str, l, str2, str3, list, str4, ByteString.EMPTY);
    }

    public C1517370paZ(String str, Long l, String str2, String str3, List<C1517340paW> list, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_query = str;
        this.search_time = l;
        this.search_type = str2;
        this.search_source = str3;
        this.consumption_list = C1516540pZE.LJFF("consumption_list", list);
        this.search_id = str4;
    }
}
