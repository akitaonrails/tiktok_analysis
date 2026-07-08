package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F4 extends Message<C02F4, C02MD> {
    public static final ProtoAdapter<C02F4> ADAPTER = new ProtoAdapter<C02F4>() { // from class: X.029J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F4 decode(ProtoReader protoReader) {
            C02F4 c02f4 = new C02F4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02f4.can_show_comment = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02f4.can_comment = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02f4.can_share = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02f4.can_forward = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F4 c02f4) {
            C02F4 c02f42 = c02f4;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c02f42.can_forward) + protoAdapter.encodedSizeWithTag(2, c02f42.can_share) + protoAdapter.encodedSizeWithTag(3, c02f42.can_comment) + protoAdapter.encodedSizeWithTag(4, c02f42.can_show_comment) + c02f42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02F4 c02f4) {
            C02F4 c02f42 = c02f4;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02f42.can_forward);
            protoAdapter.encodeWithTag(protoWriter, 2, c02f42.can_share);
            protoAdapter.encodeWithTag(protoWriter, 3, c02f42.can_comment);
            protoAdapter.encodeWithTag(protoWriter, 4, c02f42.can_show_comment);
            protoWriter.writeBytes(c02f42.unknownFields());
        }
    };
    public Boolean can_comment;
    public Boolean can_forward;
    public Boolean can_share;
    public Boolean can_show_comment;

    public C02F4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
