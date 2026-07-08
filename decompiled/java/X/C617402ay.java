package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C617402ay extends Message<C617402ay, C617502az> {
    public static final ProtoAdapter<C617402ay> ADAPTER = new ProtoAdapter<C617402ay>() { // from class: X.02ax
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C617402ay decode(ProtoReader protoReader) {
            C617402ay c617402ay = new C617402ay();
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
                                    c617402ay.tag_type = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c617402ay.fallback_vtag_action_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c617402ay.fallback_vtag_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c617402ay.fallback_vtag_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c617402ay;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C617402ay c617402ay) {
            C617402ay c617402ay2 = c617402ay;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c617402ay2.fallback_vtag_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c617402ay2.fallback_vtag_name) + protoAdapter.encodedSizeWithTag(3, c617402ay2.fallback_vtag_action_type) + protoAdapter2.encodedSizeWithTag(4, c617402ay2.tag_type) + c617402ay2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C617402ay c617402ay) {
            C617402ay c617402ay2 = c617402ay;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c617402ay2.fallback_vtag_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c617402ay2.fallback_vtag_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c617402ay2.fallback_vtag_action_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c617402ay2.tag_type);
            protoWriter.writeBytes(c617402ay2.unknownFields());
        }
    };
    public Integer fallback_vtag_action_type;
    public String fallback_vtag_name;
    public Integer fallback_vtag_type;
    public String tag_type;

    public C617402ay() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C617502az newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
