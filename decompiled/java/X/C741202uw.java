package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C741202uw extends Message<C741202uw, C741302ux> {
    public static final ProtoAdapter<C741202uw> ADAPTER = new ProtoAdapter<C741202uw>() { // from class: X.02uv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C741202uw decode(ProtoReader protoReader) {
            C741202uw c741202uw = new C741202uw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c741202uw.top_brand_expression = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c741202uw.is_top_brand = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c741202uw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C741202uw c741202uw) {
            C741202uw c741202uw2 = c741202uw;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c741202uw2.is_top_brand) + ProtoAdapter.STRING.encodedSizeWithTag(2, c741202uw2.top_brand_expression) + c741202uw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C741202uw c741202uw) {
        }
    };
    public Boolean is_top_brand;
    public String top_brand_expression;

    public C741202uw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C741302ux newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
