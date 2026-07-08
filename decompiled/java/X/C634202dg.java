package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C634202dg extends Message<C634202dg, C634302dh> {
    public static final ProtoAdapter<C634202dg> ADAPTER = new ProtoAdapter<C634202dg>() { // from class: X.02df
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C634202dg decode(ProtoReader protoReader) {
            C634202dg c634202dg = new C634202dg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c634202dg.time_offset = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c634202dg.speed = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c634202dg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C634202dg c634202dg) {
            C634202dg c634202dg2 = c634202dg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c634202dg2.speed) + protoAdapter.encodedSizeWithTag(2, c634202dg2.time_offset) + c634202dg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C634202dg c634202dg) {
            C634202dg c634202dg2 = c634202dg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c634202dg2.speed);
            protoAdapter.encodeWithTag(protoWriter, 2, c634202dg2.time_offset);
            protoWriter.writeBytes(c634202dg2.unknownFields());
        }
    };
    public String speed;
    public String time_offset;

    public C634202dg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C634302dh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
