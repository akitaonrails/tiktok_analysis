package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EI extends Message<C02EI, C564702Ib> {
    public static final ProtoAdapter<C02EI> ADAPTER = new ProtoAdapter<C02EI>() { // from class: X.027h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EI decode(ProtoReader protoReader) {
            C02EI c02ei = new C02EI();
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
                                        c02ei.safety_conclusion = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02ei.link_risk_score = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02ei.link_enabled_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02ei.display_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ei.link_address = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ei;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EI c02ei) {
            C02EI c02ei2 = c02ei;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ei2.link_address) + protoAdapter.encodedSizeWithTag(2, c02ei2.display_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02ei2.link_enabled_status) + protoAdapter2.encodedSizeWithTag(4, c02ei2.link_risk_score) + protoAdapter2.encodedSizeWithTag(5, c02ei2.safety_conclusion) + c02ei2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EI c02ei) {
            C02EI c02ei2 = c02ei;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ei2.link_address);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ei2.display_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02ei2.link_enabled_status);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02ei2.link_risk_score);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02ei2.safety_conclusion);
            protoWriter.writeBytes(c02ei2.unknownFields());
        }
    };
    public String display_text;
    public String link_address;
    public Integer link_enabled_status;
    public Integer link_risk_score;
    public Integer safety_conclusion;

    public C02EI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564702Ib newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
