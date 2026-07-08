package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559002Fw extends Message<C559002Fw, C02JZ> {
    public static final ProtoAdapter<C559002Fw> ADAPTER = new ProtoAdapter<C559002Fw>() { // from class: X.02Fv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559002Fw decode(ProtoReader protoReader) {
            C559002Fw c559002Fw = new C559002Fw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c559002Fw.linked_platform = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c559002Fw.token = C654402gw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c559002Fw.pre_save_info = C558802Fu.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559002Fw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559002Fw c559002Fw) {
            C559002Fw c559002Fw2 = c559002Fw;
            return C558802Fu.ADAPTER.encodedSizeWithTag(1, c559002Fw2.pre_save_info) + C654402gw.ADAPTER.encodedSizeWithTag(2, c559002Fw2.token) + ProtoAdapter.INT32.encodedSizeWithTag(3, c559002Fw2.linked_platform) + c559002Fw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559002Fw c559002Fw) {
            C559002Fw c559002Fw2 = c559002Fw;
            C558802Fu.ADAPTER.encodeWithTag(protoWriter, 1, c559002Fw2.pre_save_info);
            C654402gw.ADAPTER.encodeWithTag(protoWriter, 2, c559002Fw2.token);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c559002Fw2.linked_platform);
            protoWriter.writeBytes(c559002Fw2.unknownFields());
        }
    };
    public Integer linked_platform;
    public C558802Fu pre_save_info;
    public C654402gw token;

    public C559002Fw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
