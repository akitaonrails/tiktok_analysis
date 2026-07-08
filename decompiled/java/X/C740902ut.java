package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C740902ut extends Message<C740902ut, C741002uu> {
    public static final ProtoAdapter<C740902ut> ADAPTER = new ProtoAdapter<C740902ut>() { // from class: X.02us
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C740902ut decode(ProtoReader protoReader) {
            C740902ut c740902ut = new C740902ut();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c740902ut.style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c740902ut.description = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c740902ut;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C740902ut c740902ut) {
            C740902ut c740902ut2 = c740902ut;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c740902ut2.description) + ProtoAdapter.INT32.encodedSizeWithTag(2, c740902ut2.style) + c740902ut2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C740902ut c740902ut) {
        }
    };
    public String description;
    public Integer style;

    public C740902ut() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C741002uu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
