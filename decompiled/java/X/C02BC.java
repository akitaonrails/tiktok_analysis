package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BC extends Message<C02BC, C578002Ne> {
    public static final ProtoAdapter<C02BC> ADAPTER = new ProtoAdapter<C02BC>() { // from class: X.0271
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BC decode(ProtoReader protoReader) {
            C02BC c02bc = new C02BC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bc.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02bc.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bc.invalid_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bc.identity_info_options.add(C554302Eb.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c02bc.tax_submit_button = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02bc.placeholder_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BC c02bc) {
            C02BC c02bc2 = c02bc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02bc2.title) + protoAdapter.encodedSizeWithTag(2, c02bc2.description) + protoAdapter.encodedSizeWithTag(3, c02bc2.invalid_hint) + C554302Eb.ADAPTER.asRepeated().encodedSizeWithTag(4, c02bc2.identity_info_options) + protoAdapter.encodedSizeWithTag(5, c02bc2.tax_submit_button) + protoAdapter.encodedSizeWithTag(6, c02bc2.placeholder_text) + c02bc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BC c02bc) {
        }
    };
    public String description;
    public List<C554302Eb> identity_info_options;
    public String invalid_hint;
    public String placeholder_text;
    public String tax_submit_button;
    public String title;

    public C02BC() {
        super(ADAPTER, ByteString.EMPTY);
        this.identity_info_options = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C578002Ne newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
