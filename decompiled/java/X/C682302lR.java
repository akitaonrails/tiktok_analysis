package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02lR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C682302lR extends Message<C682302lR, C682402lS> {
    public static final ProtoAdapter<C682302lR> ADAPTER = new ProtoAdapter<C682302lR>() { // from class: X.02lQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C682302lR decode(ProtoReader protoReader) {
            C682302lR c682302lR = new C682302lR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c682302lR.threshold_text_en = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c682302lR.threshold_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c682302lR.discount_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c682302lR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C682302lR c682302lR) {
            C682302lR c682302lR2 = c682302lR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c682302lR2.discount_text) + protoAdapter.encodedSizeWithTag(2, c682302lR2.threshold_text) + protoAdapter.encodedSizeWithTag(3, c682302lR2.threshold_text_en) + c682302lR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C682302lR c682302lR) {
        }
    };
    public String discount_text;
    public String threshold_text;
    public String threshold_text_en;

    public C682302lR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C682402lS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
