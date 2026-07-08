package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C592702Sv extends Message<C592702Sv, C593002Sy> {
    public static final ProtoAdapter<C592702Sv> ADAPTER = new ProtoAdapter<C592702Sv>() { // from class: X.02Ss
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C592702Sv decode(ProtoReader protoReader) {
            C592702Sv c592702Sv = new C592702Sv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c592702Sv.instruction_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c592702Sv.survey_key = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c592702Sv.status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c592702Sv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C592702Sv c592702Sv) {
            C592702Sv c592702Sv2 = c592702Sv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c592702Sv2.status) + ProtoAdapter.STRING.encodedSizeWithTag(2, c592702Sv2.survey_key) + protoAdapter.encodedSizeWithTag(3, c592702Sv2.instruction_status) + c592702Sv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C592702Sv c592702Sv) {
            C592702Sv c592702Sv2 = c592702Sv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c592702Sv2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c592702Sv2.survey_key);
            protoAdapter.encodeWithTag(protoWriter, 3, c592702Sv2.instruction_status);
            protoWriter.writeBytes(c592702Sv2.unknownFields());
        }
    };
    public Integer instruction_status;
    public Integer status;
    public String survey_key;

    public C592702Sv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C593002Sy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
