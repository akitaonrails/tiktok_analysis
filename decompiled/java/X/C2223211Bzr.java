package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Bzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223211Bzr extends Message<C2223211Bzr, C2223221Bzs> {
    public static final ProtoAdapter<C2223211Bzr> ADAPTER = new ProtoAdapter<C2223211Bzr>() { // from class: X.1Bzq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223211Bzr decode(ProtoReader protoReader) {
            C2223211Bzr c2223211Bzr = new C2223211Bzr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223211Bzr.ab_roll_info_b = C2223181Bzo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2223211Bzr.ab_roll_info_a = C2223181Bzo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223211Bzr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223211Bzr c2223211Bzr) {
            C2223211Bzr c2223211Bzr2 = c2223211Bzr;
            ProtoAdapter<C2223181Bzo> protoAdapter = C2223181Bzo.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2223211Bzr2.ab_roll_info_a) + protoAdapter.encodedSizeWithTag(2, c2223211Bzr2.ab_roll_info_b) + c2223211Bzr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223211Bzr c2223211Bzr) {
            C2223211Bzr c2223211Bzr2 = c2223211Bzr;
            ProtoAdapter<C2223181Bzo> protoAdapter = C2223181Bzo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223211Bzr2.ab_roll_info_a);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223211Bzr2.ab_roll_info_b);
            protoWriter.writeBytes(c2223211Bzr2.unknownFields());
        }
    };
    public C2223181Bzo ab_roll_info_a;
    public C2223181Bzo ab_roll_info_b;

    public C2223211Bzr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223221Bzs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
