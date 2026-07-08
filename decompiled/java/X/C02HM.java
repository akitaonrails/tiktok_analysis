package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HM extends Message<C02HM, C585602Qc> {
    public static final ProtoAdapter<C02HM> ADAPTER = new ProtoAdapter<C02HM>() { // from class: X.02HN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HM decode(ProtoReader protoReader) {
            C02HM c02hm = new C02HM();
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
                                    c02hm.action_button = C642902f5.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02hm.close_button = C642902f5.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02hm.text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02hm.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HM c02hm) {
            C02HM c02hm2 = c02hm;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02hm2.title) + C5431029t.ADAPTER.encodedSizeWithTag(2, c02hm2.text);
            ProtoAdapter<C642902f5> protoAdapter = C642902f5.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02hm2.close_button) + protoAdapter.encodedSizeWithTag(4, c02hm2.action_button) + c02hm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HM c02hm) {
        }
    };
    public C642902f5 action_button;
    public C642902f5 close_button;
    public C5431029t text;
    public String title;

    public C02HM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C585602Qc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
