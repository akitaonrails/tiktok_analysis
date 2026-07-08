package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C735302tz extends Message<C735302tz, C735402u0> {
    public static final ProtoAdapter<C735302tz> ADAPTER = new ProtoAdapter<C735302tz>() { // from class: X.02ty
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C735302tz decode(ProtoReader protoReader) {
            C735302tz c735302tz = new C735302tz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c735302tz.modify_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c735302tz.create_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c735302tz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C735302tz c735302tz) {
            C735302tz c735302tz2 = c735302tz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c735302tz2.create_time) + protoAdapter.encodedSizeWithTag(2, c735302tz2.modify_time) + c735302tz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C735302tz c735302tz) {
            C735302tz c735302tz2 = c735302tz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c735302tz2.create_time);
            protoAdapter.encodeWithTag(protoWriter, 2, c735302tz2.modify_time);
            protoWriter.writeBytes(c735302tz2.unknownFields());
        }
    };
    public Long create_time;
    public Long modify_time;

    public C735302tz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C735402u0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
