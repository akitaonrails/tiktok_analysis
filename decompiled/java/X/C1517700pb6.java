package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517700pb6 extends Message<C1517700pb6, C1517710pb7> {
    public static final ProtoAdapter<C1517700pb6> ADAPTER = new ProtoAdapter<C1517700pb6>() { // from class: X.0pb5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517700pb6 decode(ProtoReader protoReader) {
            C1517700pb6 c1517700pb6 = new C1517700pb6();
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
                                    c1517700pb6.reply_panel_background_info = C1517670pb3.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1517700pb6.bubble_background_info = C1517670pb3.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1517700pb6.background_info = C1517670pb3.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1517700pb6.text_content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517700pb6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517700pb6 c1517700pb6) {
            C1517700pb6 c1517700pb62 = c1517700pb6;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c1517700pb62.text_content);
            ProtoAdapter<C1517670pb3> protoAdapter = C1517670pb3.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1517700pb62.background_info) + protoAdapter.encodedSizeWithTag(3, c1517700pb62.bubble_background_info) + protoAdapter.encodedSizeWithTag(4, c1517700pb62.reply_panel_background_info) + c1517700pb62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517700pb6 c1517700pb6) {
            C1517700pb6 c1517700pb62 = c1517700pb6;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1517700pb62.text_content);
            ProtoAdapter<C1517670pb3> protoAdapter = C1517670pb3.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c1517700pb62.background_info);
            protoAdapter.encodeWithTag(protoWriter, 3, c1517700pb62.bubble_background_info);
            protoAdapter.encodeWithTag(protoWriter, 4, c1517700pb62.reply_panel_background_info);
            protoWriter.writeBytes(c1517700pb62.unknownFields());
        }
    };
    public C1517670pb3 background_info;
    public C1517670pb3 bubble_background_info;
    public C1517670pb3 reply_panel_background_info;
    public String text_content;

    public C1517700pb6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517710pb7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
