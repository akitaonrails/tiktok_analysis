package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C616202am extends Message<C616202am, C616302an> {
    public static final ProtoAdapter<C616202am> ADAPTER = new ProtoAdapter<C616202am>() { // from class: X.02al
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C616202am decode(ProtoReader protoReader) {
            C616202am c616202am = new C616202am();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c616202am.rec_level = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c616202am.enabled = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c616202am;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C616202am c616202am) {
            C616202am c616202am2 = c616202am;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c616202am2.enabled) + ProtoAdapter.INT32.encodedSizeWithTag(2, c616202am2.rec_level) + c616202am2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C616202am c616202am) {
            C616202am c616202am2 = c616202am;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c616202am2.enabled);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c616202am2.rec_level);
            protoWriter.writeBytes(c616202am2.unknownFields());
        }
    };
    public Boolean enabled;
    public Integer rec_level;

    public C616202am() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C616302an newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
