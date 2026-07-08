package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C664002iU extends Message<C664002iU, C664102iV> {
    public static final ProtoAdapter<C664002iU> ADAPTER = new ProtoAdapter<C664002iU>() { // from class: X.02iT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C664002iU decode(ProtoReader protoReader) {
            C664002iU c664002iU = new C664002iU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c664002iU.star_atlas_order = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c664002iU.ad_link = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c664002iU.top_item = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c664002iU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C664002iU c664002iU) {
            C664002iU c664002iU2 = c664002iU;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c664002iU2.top_item) + protoAdapter.encodedSizeWithTag(2, c664002iU2.ad_link) + protoAdapter.encodedSizeWithTag(3, c664002iU2.star_atlas_order) + c664002iU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C664002iU c664002iU) {
            C664002iU c664002iU2 = c664002iU;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c664002iU2.top_item);
            protoAdapter.encodeWithTag(protoWriter, 2, c664002iU2.ad_link);
            protoAdapter.encodeWithTag(protoWriter, 3, c664002iU2.star_atlas_order);
            protoWriter.writeBytes(c664002iU2.unknownFields());
        }
    };
    public Integer ad_link;
    public Integer star_atlas_order;
    public Integer top_item;

    public C664002iU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C664102iV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
