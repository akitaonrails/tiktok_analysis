package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DH extends Message<C02DH, C571402Kq> {
    public static final ProtoAdapter<C02DH> ADAPTER = new ProtoAdapter<C02DH>() { // from class: X.025h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DH decode(ProtoReader protoReader) {
            C02DH c02dh = new C02DH();
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
                                    c02dh.user_query = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02dh.no_present_reason = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02dh.is_present = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02dh.interactive_rec_matched_instruction = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DH c02dh) {
            C02DH c02dh2 = c02dh;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02dh2.interactive_rec_matched_instruction) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c02dh2.is_present) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02dh2.no_present_reason) + ProtoAdapter.STRING.encodedSizeWithTag(4, c02dh2.user_query) + c02dh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DH c02dh) {
            C02DH c02dh2 = c02dh;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02dh2.interactive_rec_matched_instruction);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c02dh2.is_present);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02dh2.no_present_reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c02dh2.user_query);
            protoWriter.writeBytes(c02dh2.unknownFields());
        }
    };
    public Long interactive_rec_matched_instruction;
    public Boolean is_present;
    public Integer no_present_reason;
    public String user_query;

    public C02DH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571402Kq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
