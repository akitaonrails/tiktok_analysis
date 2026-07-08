package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0sGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620470sGr extends Message<C1620470sGr, C1620480sGs> {
    public static final ProtoAdapter<C1620470sGr> ADAPTER = new ProtoAdapter<C1620470sGr>() { // from class: X.0sGq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620470sGr decode(ProtoReader protoReader) {
            C1620470sGr c1620470sGr = new C1620470sGr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1620470sGr.region_high_active_time = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1620470sGr.user_high_active_time = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620470sGr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620470sGr c1620470sGr) {
            C1620470sGr c1620470sGr2 = c1620470sGr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1620470sGr2.user_high_active_time) + protoAdapter.encodedSizeWithTag(2, c1620470sGr2.region_high_active_time) + c1620470sGr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620470sGr c1620470sGr) {
            C1620470sGr c1620470sGr2 = c1620470sGr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1620470sGr2.user_high_active_time);
            protoAdapter.encodeWithTag(protoWriter, 2, c1620470sGr2.region_high_active_time);
            protoWriter.writeBytes(c1620470sGr2.unknownFields());
        }
    };
    public String region_high_active_time;
    public String user_high_active_time;

    public C1620470sGr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1620480sGs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
