package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EC extends Message<C02EC, C02OM> {
    public static final ProtoAdapter<C02EC> ADAPTER = new ProtoAdapter<C02EC>() { // from class: X.028p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EC decode(ProtoReader protoReader) {
            C02EC c02ec = new C02EC();
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
                                    c02ec.background_color = C618602bA.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ec.font_color = C618602bA.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02ec.font = C644402fK.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02ec.end_time = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ec;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EC c02ec) {
            C02EC c02ec2 = c02ec;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02ec2.end_time) + C644402fK.ADAPTER.encodedSizeWithTag(2, c02ec2.font);
            ProtoAdapter<C618602bA> protoAdapter = C618602bA.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02ec2.font_color) + protoAdapter.encodedSizeWithTag(4, c02ec2.background_color) + c02ec2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EC c02ec) {
        }
    };
    public C618602bA background_color;
    public String end_time;
    public C644402fK font;
    public C618602bA font_color;

    public C02EC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
