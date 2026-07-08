package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C621702bf extends Message<C621702bf, C621802bg> {
    public static final ProtoAdapter<C621702bf> ADAPTER = new ProtoAdapter<C621702bf>() { // from class: X.02be
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C621702bf decode(ProtoReader protoReader) {
            C621702bf c621702bf = new C621702bf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c621702bf.tux_icon_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c621702bf.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c621702bf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C621702bf c621702bf) {
            C621702bf c621702bf2 = c621702bf;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c621702bf2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c621702bf2.tux_icon_name) + c621702bf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C621702bf c621702bf) {
            C621702bf c621702bf2 = c621702bf;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c621702bf2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c621702bf2.tux_icon_name);
            protoWriter.writeBytes(c621702bf2.unknownFields());
        }
    };
    public String tux_icon_name;
    public Integer type;

    public C621702bf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C621802bg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
