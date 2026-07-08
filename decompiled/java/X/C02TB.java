package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TB extends Message<C02TB, C02TD> {
    public static final ProtoAdapter<C02TB> ADAPTER = new ProtoAdapter<C02TB>() { // from class: X.02TC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TB decode(ProtoReader protoReader) {
            C02TB c02tb = new C02TB();
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
                                    c02tb.background_color = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02tb.action = C622902br.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02tb.content = C638702eP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02tb.head_icon = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02tb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TB c02tb) {
            C02TB c02tb2 = c02tb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02tb2.head_icon) + C638702eP.ADAPTER.encodedSizeWithTag(2, c02tb2.content) + C622902br.ADAPTER.encodedSizeWithTag(3, c02tb2.action) + protoAdapter.encodedSizeWithTag(4, c02tb2.background_color) + c02tb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02TB c02tb) {
            C02TB c02tb2 = c02tb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02tb2.head_icon);
            C638702eP.ADAPTER.encodeWithTag(protoWriter, 2, c02tb2.content);
            C622902br.ADAPTER.encodeWithTag(protoWriter, 3, c02tb2.action);
            protoAdapter.encodeWithTag(protoWriter, 4, c02tb2.background_color);
            protoWriter.writeBytes(c02tb2.unknownFields());
        }
    };
    public C622902br action;
    public String background_color;
    public C638702eP content;
    public String head_icon;

    public C02TB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
