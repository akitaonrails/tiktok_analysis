package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C623202bu extends Message<C623202bu, C623302bv> {
    public static final ProtoAdapter<C623202bu> ADAPTER = new ProtoAdapter<C623202bu>() { // from class: X.02bt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C623202bu decode(ProtoReader protoReader) {
            C623202bu c623202bu = new C623202bu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c623202bu.is_predict_sug = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c623202bu.disable_pre_info_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c623202bu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C623202bu c623202bu) {
            C623202bu c623202bu2 = c623202bu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c623202bu2.disable_pre_info_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c623202bu2.is_predict_sug) + c623202bu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C623202bu c623202bu) {
            C623202bu c623202bu2 = c623202bu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c623202bu2.disable_pre_info_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c623202bu2.is_predict_sug);
            protoWriter.writeBytes(c623202bu2.unknownFields());
        }
    };
    public String disable_pre_info_id;
    public Boolean is_predict_sug;

    public C623202bu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C623302bv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
