package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C70, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C70 extends Message<C1C70, C1C71> {
    public static final ProtoAdapter<C1C70> ADAPTER = new ProtoAdapter<C1C70>() { // from class: X.1C6z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C70 decode(ProtoReader protoReader) {
            C1C70 c1c70 = new C1C70();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 11) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c1c70.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1c70.display_duration_sec = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1c70.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c70.description = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c70.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c70;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C70 c1c70) {
            C1C70 c1c702 = c1c70;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c1c702.icon) + C5431029t.ADAPTER.encodedSizeWithTag(2, c1c702.description);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1c702.button_text) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1c702.display_duration_sec) + protoAdapter.encodedSizeWithTag(11, c1c702.da_info) + c1c702.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C70 c1c70) {
        }
    };
    public String button_text;
    public String da_info;
    public C5431029t description;
    public Long display_duration_sec;
    public C029C icon;

    public C1C70() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C71 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
