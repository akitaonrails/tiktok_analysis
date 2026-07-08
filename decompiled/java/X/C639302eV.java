package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C639302eV extends Message<C639302eV, C639402eW> {
    public static final ProtoAdapter<C639302eV> ADAPTER = new ProtoAdapter<C639302eV>() { // from class: X.02eU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C639302eV decode(ProtoReader protoReader) {
            C639302eV c639302eV = new C639302eV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c639302eV.package_name.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c639302eV.supported_commute_type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c639302eV;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C639302eV c639302eV) {
            C639302eV c639302eV2 = c639302eV;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c639302eV2.supported_commute_type) + protoAdapter.asRepeated().encodedSizeWithTag(2, c639302eV2.package_name) + c639302eV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C639302eV c639302eV) {
        }
    };
    public List<String> package_name;
    public String supported_commute_type;

    public C639302eV() {
        super(ADAPTER, ByteString.EMPTY);
        this.package_name = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C639402eW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
