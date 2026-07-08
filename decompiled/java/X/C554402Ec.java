package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554402Ec extends Message<C554402Ec, C580002Ny> {
    public static final ProtoAdapter<C554402Ec> ADAPTER = new ProtoAdapter<C554402Ec>() { // from class: X.029X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554402Ec decode(ProtoReader protoReader) {
            C554402Ec c554402Ec = new C554402Ec();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c554402Ec.status_code = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c554402Ec.unavailable_popup_title = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c554402Ec.unavailable_reason = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c554402Ec.unavailable_code = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c554402Ec.is_available = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554402Ec;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554402Ec c554402Ec) {
            C554402Ec c554402Ec2 = c554402Ec;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c554402Ec2.is_available);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c554402Ec2.unavailable_code) + protoAdapter.encodedSizeWithTag(3, c554402Ec2.unavailable_reason) + protoAdapter.encodedSizeWithTag(4, c554402Ec2.unavailable_popup_title) + protoAdapter.encodedSizeWithTag(5, c554402Ec2.status_code) + c554402Ec2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554402Ec c554402Ec) {
        }
    };
    public Boolean is_available;
    public String status_code;
    public String unavailable_code;
    public String unavailable_popup_title;
    public String unavailable_reason;

    public C554402Ec() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580002Ny newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
