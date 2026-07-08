package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C545602As extends Message<C545602As, C02MF> {
    public static final ProtoAdapter<C545602As> ADAPTER = new ProtoAdapter<C545602As>() { // from class: X.024R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C545602As decode(ProtoReader protoReader) {
            C545602As c545602As = new C545602As();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c545602As.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c545602As.style = C628402ck.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c545602As.margin = C02F5.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c545602As.is_local = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c545602As.local_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c545602As.padding = C02F5.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c545602As;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C545602As c545602As) {
            C545602As c545602As2 = c545602As;
            int iEncodedSizeWithTag = C673002jw.ADAPTER.encodedSizeWithTag(1, c545602As2.icon_url) + C628402ck.ADAPTER.encodedSizeWithTag(2, c545602As2.style);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c545602As2.margin) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c545602As2.is_local) + ProtoAdapter.INT32.encodedSizeWithTag(5, c545602As2.local_type) + protoAdapter.encodedSizeWithTag(6, c545602As2.padding) + c545602As2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C545602As c545602As) {
            C545602As c545602As2 = c545602As;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, c545602As2.icon_url);
            C628402ck.ADAPTER.encodeWithTag(protoWriter, 2, c545602As2.style);
            ProtoAdapter<C02F5> protoAdapter = C02F5.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c545602As2.margin);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c545602As2.is_local);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c545602As2.local_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c545602As2.padding);
            protoWriter.writeBytes(c545602As2.unknownFields());
        }
    };
    public C673002jw icon_url;
    public Boolean is_local;
    public Integer local_type;
    public C02F5 margin;
    public C02F5 padding;
    public C628402ck style;

    public C545602As() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
