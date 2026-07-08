package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TM extends Message<C02TM, C02TN> {
    public static final ProtoAdapter<C02TM> ADAPTER = new ProtoAdapter<C02TM>() { // from class: X.02TL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TM decode(ProtoReader protoReader) {
            C02TM c02tm = new C02TM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02tm.is_virtual = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02tm.cameo_image = C687802mK.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02tm.cameo_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02tm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TM c02tm) {
            C02TM c02tm2 = c02tm;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02tm2.cameo_id) + C687802mK.ADAPTER.encodedSizeWithTag(2, c02tm2.cameo_image) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02tm2.is_virtual) + c02tm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02TM c02tm) {
            C02TM c02tm2 = c02tm;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02tm2.cameo_id);
            C687802mK.ADAPTER.encodeWithTag(protoWriter, 2, c02tm2.cameo_image);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02tm2.is_virtual);
            protoWriter.writeBytes(c02tm2.unknownFields());
        }
    };
    public String cameo_id;
    public C687802mK cameo_image;
    public Boolean is_virtual;

    public C02TM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
