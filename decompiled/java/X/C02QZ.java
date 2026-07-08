package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02QZ extends Message<C02QZ, C585402Qa> {
    public static final ProtoAdapter<C02QZ> ADAPTER = new ProtoAdapter<C02QZ>() { // from class: X.02QY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02QZ decode(ProtoReader protoReader) {
            C02QZ c02qz = new C02QZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02qz.donation_display_module = AnonymousClass0283.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02qz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02QZ c02qz) {
            C02QZ c02qz2 = c02qz;
            return AnonymousClass0283.ADAPTER.encodedSizeWithTag(1, c02qz2.donation_display_module) + c02qz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02QZ c02qz) {
        }
    };
    public AnonymousClass0283 donation_display_module;

    public C02QZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C585402Qa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
