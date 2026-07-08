package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559202Fy extends Message<C559202Fy, C571602Ks> {
    public static final ProtoAdapter<C559202Fy> ADAPTER = new ProtoAdapter<C559202Fy>() { // from class: X.02Fx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559202Fy decode(ProtoReader protoReader) {
            C559202Fy c559202Fy = new C559202Fy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c559202Fy.tt_to_dsp_album_info = C559002Fw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c559202Fy.event_tracking_info = C670202jU.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559202Fy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559202Fy c559202Fy) {
            C559202Fy c559202Fy2 = c559202Fy;
            return C670202jU.ADAPTER.encodedSizeWithTag(1, c559202Fy2.event_tracking_info) + C559002Fw.ADAPTER.encodedSizeWithTag(2, c559202Fy2.tt_to_dsp_album_info) + c559202Fy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559202Fy c559202Fy) {
            C559202Fy c559202Fy2 = c559202Fy;
            C670202jU.ADAPTER.encodeWithTag(protoWriter, 1, c559202Fy2.event_tracking_info);
            C559002Fw.ADAPTER.encodeWithTag(protoWriter, 2, c559202Fy2.tt_to_dsp_album_info);
            protoWriter.writeBytes(c559202Fy2.unknownFields());
        }
    };
    public C670202jU event_tracking_info;
    public C559002Fw tt_to_dsp_album_info;

    public C559202Fy() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571602Ks newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
