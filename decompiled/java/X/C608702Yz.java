package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C608702Yz extends Message<C608702Yz, C02Z0> {
    public static final ProtoAdapter<C608702Yz> ADAPTER = new ProtoAdapter<C608702Yz>() { // from class: X.02Yy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C608702Yz decode(ProtoReader protoReader) {
            C608702Yz c608702Yz = new C608702Yz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c608702Yz.mix_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c608702Yz.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c608702Yz.index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c608702Yz.icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c608702Yz.item_total = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c608702Yz.name_in_review = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c608702Yz.is_default_name = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c608702Yz.mix_label = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c608702Yz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C608702Yz c608702Yz) {
            C608702Yz c608702Yz2 = c608702Yz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c608702Yz2.mix_id) + protoAdapter.encodedSizeWithTag(2, c608702Yz2.name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c608702Yz2.index) + C673002jw.ADAPTER.encodedSizeWithTag(4, c608702Yz2.icon) + ProtoAdapter.INT64.encodedSizeWithTag(5, c608702Yz2.item_total) + protoAdapter.encodedSizeWithTag(6, c608702Yz2.name_in_review) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c608702Yz2.is_default_name) + protoAdapter2.encodedSizeWithTag(8, c608702Yz2.mix_label) + c608702Yz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C608702Yz c608702Yz) {
            C608702Yz c608702Yz2 = c608702Yz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c608702Yz2.mix_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c608702Yz2.name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c608702Yz2.index);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c608702Yz2.icon);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c608702Yz2.item_total);
            protoAdapter.encodeWithTag(protoWriter, 6, c608702Yz2.name_in_review);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c608702Yz2.is_default_name);
            protoAdapter2.encodeWithTag(protoWriter, 8, c608702Yz2.mix_label);
            protoWriter.writeBytes(c608702Yz2.unknownFields());
        }
    };
    public C673002jw icon;
    public Integer index;
    public Boolean is_default_name;
    public Long item_total;
    public String mix_id;
    public Integer mix_label;
    public String name;
    public String name_in_review;

    public C608702Yz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Z0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
